package zendesk.suas

import org.junit.Assert.fail
import java.util.concurrent.CountDownLatch
import java.util.concurrent.TimeUnit

interface Helper {
    fun CountDownLatch.countDown(message: String) {
        if (count == 0L) fail(message)
        else countDown()
    }

    fun CountDownLatch.awaitOrFail() {
        val result = await(1L, TimeUnit.SECONDS)
        if(!result) fail("Timeout")
    }

    fun store(reducer: Reducer<*> = TestReducer(),
              filter: Filter<Any>? = null,
              middleware: List<Middleware> = listOf()): Store {
        return ReduxStore.Builder(reducer).apply {
            withMiddleware(middleware)
            if(filter != null) withDefaultFilter(filter)
        }.build()
    }

    class TestReducer(val customKey: String? = null) : Reducer<String>() {
        override fun getEmptyState(): String {
            return ReduxStoreListenerTest.initialState
        }

        override fun reduce(oldState: String, action: Action<*>): String? {
            return ReduxStoreListenerTest.newState
        }

        override fun getKey(): String {
            return customKey ?: super.getKey()
        }
    }

}