package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class mvd0 extends fo8.a {
    public final a d;

    public enum a {
        /* JADX INFO: Fake field, exist only in values array */
        OTLP_GRPC_SPAN_EXPORTER("otlp_grpc_span_exporter", 1),
        OTLP_HTTP_SPAN_EXPORTER("otlp_http_span_exporter", 1),
        /* JADX INFO: Fake field, exist only in values array */
        OTLP_HTTP_JSON_SPAN_EXPORTER("otlp_http_json_span_exporter", 1),
        /* JADX INFO: Fake field, exist only in values array */
        OTLP_GRPC_LOG_EXPORTER("otlp_grpc_log_exporter", 3),
        OTLP_HTTP_LOG_EXPORTER("otlp_http_log_exporter", 3),
        /* JADX INFO: Fake field, exist only in values array */
        OTLP_HTTP_JSON_LOG_EXPORTER("otlp_http_json_log_exporter", 3),
        /* JADX INFO: Fake field, exist only in values array */
        OTLP_GRPC_METRIC_EXPORTER("otlp_grpc_metric_exporter", 2),
        /* JADX INFO: Fake field, exist only in values array */
        OTLP_HTTP_METRIC_EXPORTER("otlp_http_metric_exporter", 2),
        /* JADX INFO: Fake field, exist only in values array */
        OTLP_HTTP_JSON_METRIC_EXPORTER("otlp_http_json_metric_exporter", 2),
        /* JADX INFO: Fake field, exist only in values array */
        ZIPKIN_HTTP_SPAN_EXPORTER("zipkin_http_span_exporter", 1),
        /* JADX INFO: Fake field, exist only in values array */
        ZIPKIN_HTTP_JSON_SPAN_EXPORTER("zipkin_http_span_exporter", 1),
        /* JADX INFO: Fake field, exist only in values array */
        OTLP_GRPC_PROFILES_EXPORTER("TBD", 4);

        public final String a;
        public final int b;

        a(String str, int i) {
            this.a = str;
            this.b = i;
        }
    }

    public mvd0(a aVar) {
        super(aVar.a);
        this.d = aVar;
    }
}
