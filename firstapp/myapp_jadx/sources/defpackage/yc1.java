package defpackage;

import com.twilio.voice.EventKeys;

/* JADX INFO: loaded from: classes4.dex */
public final class yc1 implements uby<ktb.a> {
    public static final yc1 a = new yc1();
    public static final hjh b = hjh.a("pid");
    public static final hjh c = hjh.a("processName");
    public static final hjh d = hjh.a("reasonCode");
    public static final hjh e = hjh.a("importance");
    public static final hjh f = hjh.a("pss");
    public static final hjh g = hjh.a("rss");
    public static final hjh h = hjh.a(EventKeys.TIMESTAMP);
    public static final hjh i = hjh.a("traceFile");
    public static final hjh j = hjh.a("buildIdMappingForArch");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.a aVar = (ktb.a) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.e(b, aVar.c());
        vbyVar2.a(c, aVar.d());
        vbyVar2.e(d, aVar.f());
        vbyVar2.e(e, aVar.b());
        vbyVar2.g(f, aVar.e());
        vbyVar2.g(g, aVar.g());
        vbyVar2.g(h, aVar.h());
        vbyVar2.a(i, aVar.i());
        vbyVar2.a(j, aVar.a());
    }
}
