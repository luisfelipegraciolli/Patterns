package Builder;

import java.util.Map;

public class HttpRequest {

    private final String url;
    private final String metodo;
    private final Map<String, String> headers;
    private final Map<String, String> queryParams;
    private final String body;
    private final int timeout;
    private final boolean auth;
    private final boolean retry;
    private final boolean cache;

    public HttpRequest(
            String url,
            String metodo,
            Map<String, String> headers,
            Map<String, String> queryParams,
            String body,
            int timeout,
            boolean auth,
            boolean retry,
            boolean cache
    ) {
        this.url = url;
        this.metodo = metodo;
        this.headers = headers;
        this.queryParams = queryParams;
        this.body = body;
        this.timeout = timeout;
        this.auth = auth;
        this.retry = retry;
        this.cache = cache;
    }
}
