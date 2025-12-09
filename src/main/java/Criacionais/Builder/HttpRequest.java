package Criacionais.Builder;

import java.util.Collections;
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

    private HttpRequest(BuilderClass builder) {
        this.url = builder.url;
        this.metodo = builder.metodo;
        this.headers = builder.headers != null
                ? Collections.unmodifiableMap(builder.headers)
                : Collections.emptyMap();

        this.queryParams = builder.queryParams != null
                ? Collections.unmodifiableMap(builder.queryParams)
                : Collections.emptyMap();

        this.body = builder.body;
        this.timeout = builder.timeout;
        this.auth = builder.auth;
        this.retry = builder.retry;
        this.cache = builder.cache;
    }

    public static class BuilderClass {
        private String url;
        private String metodo;
        private Map<String, String> headers;
        private Map<String, String> queryParams;
        private String body;
        private int timeout;
        private boolean auth;
        private boolean retry;
        private boolean cache;


        public BuilderClass setUrl(String url) {
            this.url = url;
            return this;
        }

        public BuilderClass setMetodo(String metodo) {
            this.metodo = metodo;
            return this;

        }

        public BuilderClass setHeaders(Map<String, String> headers) {
            this.headers = headers;
            return this;

        }

        public BuilderClass setQueryParams(Map<String, String> queryParams) {
            this.queryParams = queryParams;
            return this;

        }

        public BuilderClass setBody(String body) {
            this.body = body;
            return this;

        }

        public BuilderClass setTimeout(int timeout) {
            this.timeout = timeout;
            return this;

        }

        public BuilderClass setAuth(boolean auth) {
            this.auth = auth;
            return this;

        }

        public BuilderClass setRetry(boolean retry) {
            this.retry = retry;
            return this;

        }

        public BuilderClass setCache(boolean cache) {
            this.cache = cache;
            return this;

        }

        public HttpRequest build() {
            // ✅ Validações das invariantes
            if (url == null || url.isBlank()) {
                throw new IllegalStateException("URL é obrigatória");
            }
            if (metodo == null || metodo.isBlank()) {
                throw new IllegalStateException("Método HTTP é obrigatório");
            }
            if (timeout <= 0) {
                throw new IllegalStateException("Timeout deve ser positivo");
            }

            return new HttpRequest(this);
        }
    }



}
