package defpackage;

import com.twilio.voice.EventKeys;

/* JADX INFO: loaded from: classes4.dex */
public final class ld1 implements uby<ktb.e.d.a.b.c> {
    public static final ld1 a = new ld1();
    public static final hjh b = hjh.a("name");
    public static final hjh c = hjh.a(EventKeys.ERROR_CODE);
    public static final hjh d = hjh.a("address");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d.a.b.c cVar = (ktb.e.d.a.b.c) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.a(b, cVar.c());
        vbyVar2.a(c, cVar.b());
        vbyVar2.g(d, cVar.a());
    }
}
