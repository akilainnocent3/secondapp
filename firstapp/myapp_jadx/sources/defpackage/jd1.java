package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;

/* JADX INFO: loaded from: classes4.dex */
public final class jd1 implements uby<ktb.e.d.a.b> {
    public static final jd1 a = new jd1();
    public static final hjh b = hjh.a("threads");
    public static final hjh c = hjh.a(AnalyticsParam.EVENT_PARAM_EXCEPTION);
    public static final hjh d = hjh.a("appExitInfo");
    public static final hjh e = hjh.a("signal");
    public static final hjh f = hjh.a("binaries");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d.a.b bVar = (ktb.e.d.a.b) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, bVar.e());
        vbyVar2.a(c, bVar.c());
        vbyVar2.a(d, bVar.a());
        vbyVar2.a(e, bVar.d());
        vbyVar2.a(f, bVar.b());
    }
}
