package defpackage;

/* JADX INFO: loaded from: classes8.dex */
public final class w0h {
    public final x0h a;

    public static class a {
        public final x0h.a a;
        public Long b;

        public a(x0h.a aVar) {
            this.a = aVar;
        }
    }

    public w0h(fpm fpmVar, mvd0 mvd0Var, String str) {
        x0h c5sVar;
        mvd0.a aVar = mvd0Var.d;
        kyo kyoVar = c5s.i;
        switch (aVar) {
            case OTLP_GRPC_SPAN_EXPORTER:
            case OTLP_HTTP_SPAN_EXPORTER:
            case OTLP_HTTP_JSON_SPAN_EXPORTER:
            case OTLP_GRPC_LOG_EXPORTER:
            case OTLP_HTTP_LOG_EXPORTER:
            case OTLP_HTTP_JSON_LOG_EXPORTER:
            case OTLP_GRPC_METRIC_EXPORTER:
            case OTLP_HTTP_METRIC_EXPORTER:
            case OTLP_HTTP_JSON_METRIC_EXPORTER:
            case ZIPKIN_HTTP_SPAN_EXPORTER:
            case ZIPKIN_HTTP_JSON_SPAN_EXPORTER:
                c5sVar = new c5s(fpmVar, aVar);
                break;
            default:
                c5sVar = cyx.a;
                break;
        }
        this.a = c5sVar;
    }
}
