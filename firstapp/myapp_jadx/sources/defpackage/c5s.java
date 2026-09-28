package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class c5s implements x0h {
    public static final kyo i = kyo.a(g21.a, "type");
    public static final kyo j = kyo.a(g21.b, AnalyticsParam.EVENT_PARAM_SUCCESS);
    public final fpm a;
    public final String b;
    public final String c;
    public final vw0 d;
    public final m21 e;
    public final m21 f;
    public volatile sjt g;
    public volatile sjt h;

    public class a extends x0h.a {
        public final int b;

        public a(int i) {
            this.b = i;
            long j = i;
            sjt sjtVarBuild = c5s.this.g;
            if (sjtVarBuild == null || ma80.b(sjtVarBuild)) {
                sjtVarBuild = c5s.this.c().b(c5s.this.b.concat(".exporter.seen")).build();
                c5s.this.g = sjtVarBuild;
            }
            sjtVarBuild.a(j, c5s.this.d);
        }

        @Override // x0h.a
        public final void a(String str, vw0 vw0Var) {
            int i = this.b;
            c5s c5sVar = c5s.this;
            if (str != null) {
                c5sVar.b().a(i, c5sVar.f);
            } else {
                c5sVar.b().a(i, c5sVar.e);
            }
        }
    }

    public c5s(fpm fpmVar, mvd0.a aVar) {
        String str;
        String str2;
        String str3;
        this.a = fpmVar;
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
                str = "otlp";
                break;
            case ZIPKIN_HTTP_SPAN_EXPORTER:
            case ZIPKIN_HTTP_JSON_SPAN_EXPORTER:
                str = "zipkin";
                break;
            case OTLP_GRPC_PROFILES_EXPORTER:
                hb5.a("Profiles are not supported");
                throw null;
            default:
                z9l.a(aVar, "Not a supported exporter type: ");
                throw null;
        }
        this.b = str;
        switch (aVar) {
            case OTLP_GRPC_SPAN_EXPORTER:
            case OTLP_GRPC_LOG_EXPORTER:
            case OTLP_GRPC_METRIC_EXPORTER:
                str2 = "grpc";
                break;
            case OTLP_HTTP_SPAN_EXPORTER:
            case OTLP_HTTP_LOG_EXPORTER:
            case OTLP_HTTP_METRIC_EXPORTER:
            case ZIPKIN_HTTP_SPAN_EXPORTER:
                str2 = "http";
                break;
            case OTLP_HTTP_JSON_SPAN_EXPORTER:
            case OTLP_HTTP_JSON_LOG_EXPORTER:
            case OTLP_HTTP_JSON_METRIC_EXPORTER:
            case ZIPKIN_HTTP_JSON_SPAN_EXPORTER:
                str2 = "http-json";
                break;
            case OTLP_GRPC_PROFILES_EXPORTER:
                hb5.a("Profiles are not supported");
                throw null;
            default:
                z9l.a(aVar, "Not a supported exporter type: ");
                throw null;
        }
        this.c = str2;
        ArrayList arrayList = new ArrayList();
        int i2 = aVar.b;
        int iB = pjh.b(i2);
        if (iB == 0) {
            str3 = "span";
        } else if (iB == 1) {
            str3 = "metric";
        } else {
            if (iB != 2) {
                if (iB != 3) {
                    hb5.a("Unhandled signal type: ".concat(i2 != 1 ? i2 != 2 ? i2 != 3 ? i2 != 4 ? "null" : "PROFILE" : "LOG" : "METRIC" : "SPAN"));
                    throw null;
                }
                hb5.a("Profiles are not supported");
                throw null;
            }
            str3 = "log";
        }
        kyo kyoVar = i;
        if (kyoVar != null && !kyoVar.b.isEmpty()) {
            arrayList.add(kyoVar);
            arrayList.add(str3);
        }
        vw0 vw0VarF = (arrayList.size() != 2 || arrayList.get(0) == null) ? vw0.f(arrayList.toArray()) : new vw0(arrayList.toArray());
        this.d = vw0VarF;
        xw0 builder = vw0VarF.toBuilder();
        Boolean bool = Boolean.TRUE;
        kyo kyoVar2 = j;
        builder.b(kyoVar2, bool);
        this.e = builder.a();
        xw0 builder2 = vw0VarF.toBuilder();
        builder2.b(kyoVar2, Boolean.FALSE);
        this.f = builder2.a();
    }

    @Override // defpackage.x0h
    public final x0h.a a(int i2) {
        return new a(i2);
    }

    public final sjt b() {
        sjt sjtVar = this.h;
        if (sjtVar != null && !ma80.b(sjtVar)) {
            return sjtVar;
        }
        sjt sjtVarBuild = c().b(this.b.concat(".exporter.exported")).build();
        this.h = sjtVarBuild;
        return sjtVarBuild;
    }

    public final fpv c() {
        hpv hpvVar = (hpv) this.a.get();
        if (hpvVar == null) {
            hpvVar = ied.a;
        }
        return hpvVar.d("io.opentelemetry.exporters." + this.b + "-" + this.c);
    }
}
