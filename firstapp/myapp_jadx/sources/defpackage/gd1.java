package defpackage;

import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;

/* JADX INFO: loaded from: classes4.dex */
public final class gd1 implements uby<ktb.e> {
    public static final gd1 a = new gd1();
    public static final hjh b = hjh.a("generator");
    public static final hjh c = hjh.a("identifier");
    public static final hjh d = hjh.a("appQualitySessionId");
    public static final hjh e = hjh.a("startedAt");
    public static final hjh f = hjh.a("endedAt");
    public static final hjh g = hjh.a("crashed");
    public static final hjh h = hjh.a("app");
    public static final hjh i = hjh.a("user");
    public static final hjh j = hjh.a("os");
    public static final hjh k = hjh.a(LastLoginDeviceInfo.KEY_DEVICE);
    public static final hjh l = hjh.a("events");
    public static final hjh m = hjh.a("generatorType");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e eVar = (ktb.e) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, eVar.f());
        vbyVar2.a(c, eVar.h().getBytes(ktb.a));
        vbyVar2.a(d, eVar.b());
        vbyVar2.g(e, eVar.j());
        vbyVar2.a(f, eVar.d());
        vbyVar2.d(g, eVar.l());
        vbyVar2.a(h, eVar.a());
        vbyVar2.a(i, eVar.k());
        vbyVar2.a(j, eVar.i());
        vbyVar2.a(k, eVar.c());
        vbyVar2.a(l, eVar.e());
        vbyVar2.e(m, eVar.g());
    }
}
