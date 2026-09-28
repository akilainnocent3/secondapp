package defpackage;

import com.sporty.android.common_analytics.opentelemetry.RumConfig;
import com.sporty.android.common_analytics.opentelemetry.RumDomainData;
import com.sporty.android.common_analytics.opentelemetry.TraceSamplingConfig;
import com.sporty.android.common_analytics.opentelemetry.UrlTemplateConfig;
import com.sporty.android.core.model.service.CountryCodeName;
import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.Objects;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class n1z implements kym {
    public final RumConfig a;
    public final yi5 b;
    public final cbg c;
    public final o1z d;
    public final zig0 e;
    public final ogt f;

    public n1z(String str, ysm ysmVar, RumConfig rumConfig, UrlTemplateConfig urlTemplateConfig, CountryCodeName countryCodeName, yi5 yi5Var, RumDomainData rumDomainData, cbg cbgVar) {
        ysmVar.getClass();
        countryCodeName.getClass();
        yi5Var.getClass();
        cbgVar.getClass();
        this.a = rumConfig;
        this.b = yi5Var;
        this.c = cbgVar;
        pg50 pg50VarA = kfd.a(ysmVar, countryCodeName, yi5Var, cbgVar);
        kpm kpmVar = new kpm(mvd0.a.OTLP_HTTP_SPAN_EXPORTER, "http://localhost:4318/v1/traces");
        kpmVar.d.put("User-Agent", "OTel-OTLP-Exporter-Java/1.58.0");
        kpmVar.b(cbgVar.b().k.concat("/v1/traces"));
        Objects.requireNonNull(TimeUnit.SECONDS, "unit");
        kpmVar.c = 30000000000L;
        m4z m4zVar = new m4z(kpmVar, kpmVar.a());
        TraceSamplingConfig traceSamplingConfig = rumConfig.getTraceSamplingConfig();
        tqa0 ts60Var = m4zVar;
        if (traceSamplingConfig != null && traceSamplingConfig.validate()) {
            ts60Var = m4zVar;
            ts60Var = new ts60(m4zVar, rumConfig.getTraceSamplingConfig());
        }
        ts60Var = m4zVar;
        Logger logger = ld2.c;
        md2 md2Var = new md2(ts60Var);
        md2Var.a = 5000000000L;
        md2Var.b = 512;
        tqa0 tqa0Var = ts60Var;
        ld2 ld2Var = new ld2(tqa0Var, md2Var.c, md2Var.a, md2Var.b);
        Logger logger2 = jt70.d;
        lt70 lt70Var = new lt70();
        lt70Var.b = pg50VarA;
        lt70Var.d = new m3z(Double.parseDouble(rumConfig.getTraceRatio()), rumDomainData);
        boolean zI = yi5Var.b().i();
        ArrayList arrayList = lt70Var.a;
        if (zI) {
            arrayList.add(new sk90(new ugt(), new ks70()));
        }
        arrayList.add(ld2Var);
        if (urlTemplateConfig != null && urlTemplateConfig.validate()) {
            arrayList.add(new inh0(urlTemplateConfig));
        }
        tx30 tx30Var = tx30.a;
        jt70 jt70Var = new jt70(lt70Var.b, lt70Var.c, lt70Var.d, arrayList, new tn70.b(lt70Var.e.a), lt70Var.f, lt70Var.g);
        pg50 pg50VarA2 = kfd.a(ysmVar, countryCodeName, yi5Var, cbgVar);
        kpm kpmVar2 = new kpm(mvd0.a.OTLP_HTTP_LOG_EXPORTER, "http://localhost:4318/v1/logs");
        kpmVar2.d.put("User-Agent", "OTel-OTLP-Exporter-Java/1.58.0");
        kpmVar2.b(cbgVar.b().k.concat("/v1/logs"));
        kpmVar2.c = 30000000000L;
        l4z l4zVar = new l4z(kpmVar2, kpmVar2.a());
        String str2 = gd2.c;
        hd2 hd2Var = new hd2(l4zVar);
        hd2Var.a = 5000000000L;
        hd2Var.b = 512;
        gd2 gd2Var = new gd2(l4zVar, hd2Var.c, hd2Var.a, hd2Var.b);
        Logger logger3 = is70.e;
        ArrayList arrayList2 = new ArrayList();
        Logger logger4 = pg50.a;
        js70 js70Var = new js70();
        nj1 nj1Var = nj1.c;
        ArrayList arrayList3 = new ArrayList();
        kyo kyoVar = ntg.a;
        Boolean.parseBoolean(ipa.a("otel.experimental.sdk.jvm_stacktrace", "false"));
        ks70 ks70Var = new ks70();
        arrayList2.add(gd2Var);
        is70 is70Var = new is70(pg50VarA2, js70Var, arrayList2, new tn70.b(arrayList3), ks70Var);
        Logger logger5 = o1z.f;
        obd obdVar = obd.b;
        xoi0 xoi0Var = xoi0.f;
        Objects.requireNonNull(xoi0Var, "textPropagator");
        obd obdVar2 = new obd(xoi0Var);
        Logger logger6 = vs70.v;
        pg50 pg50Var = pg50.c;
        IdentityHashMap identityHashMap = new IdentityHashMap();
        ArrayList arrayList4 = new ArrayList();
        ArrayList arrayList5 = new ArrayList();
        oj1 oj1Var = oj1.b;
        o1z o1zVar = new o1z(jt70Var, new vs70(arrayList5, identityHashMap, arrayList4, pg50Var, new tn70.b(new tn70().a)), is70Var, obdVar2);
        this.d = o1zVar;
        zig0 zig0VarD = o1zVar.b.a.d(str);
        zig0VarD.getClass();
        this.e = zig0VarD;
        ogt ogtVarD = is70Var.d(str);
        ogtVarD.getClass();
        this.f = ogtVarD;
    }

    @Override // defpackage.kym
    public final ogt a() {
        ogt ogtVar = this.f;
        if (ogtVar != null) {
            return ogtVar;
        }
        Intrinsics.n("logger");
        throw null;
    }

    @Override // defpackage.kym
    public final rmy b() {
        smy smyVar = new smy(this.d);
        smyVar.a.b.add(new af4());
        return smyVar.a();
    }

    @Override // defpackage.kym
    public final i1z f() {
        return this.d;
    }

    @Override // defpackage.kym
    public final boolean isEnabled() {
        return this.a.isEnabled();
    }
}
