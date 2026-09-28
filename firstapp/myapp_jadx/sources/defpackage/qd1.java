package defpackage;

import com.sporty.android.core.model.accountprotection.LastLoginDeviceInfo;
import com.twilio.voice.EventKeys;

/* JADX INFO: loaded from: classes4.dex */
public final class qd1 implements uby<ktb.e.d> {
    public static final qd1 a = new qd1();
    public static final hjh b = hjh.a(EventKeys.TIMESTAMP);
    public static final hjh c = hjh.a("type");
    public static final hjh d = hjh.a("app");
    public static final hjh e = hjh.a(LastLoginDeviceInfo.KEY_DEVICE);
    public static final hjh f = hjh.a("log");
    public static final hjh g = hjh.a("rollouts");

    @Override // defpackage.e4g
    public final void a(Object obj, vby vbyVar) {
        ktb.e.d dVar = (ktb.e.d) obj;
        vby vbyVar2 = vbyVar;
        vbyVar2.g(b, dVar.e());
        vbyVar2.a(c, dVar.f());
        vbyVar2.a(d, dVar.a());
        vbyVar2.a(e, dVar.b());
        vbyVar2.a(f, dVar.c());
        vbyVar2.a(g, dVar.d());
    }
}
