package defpackage;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.push.DeviceInfo", f = "DeviceInfo.kt", l = {108, 109}, m = "getFingerprints", v = 2)
public final class bde extends x1b {
    public String a;
    public /* synthetic */ Object b;
    public final /* synthetic */ cde c;
    public int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bde(cde cdeVar, x1b x1bVar) {
        super(x1bVar);
        this.c = cdeVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.b = obj;
        this.d |= Integer.MIN_VALUE;
        return this.c.f(this);
    }
}
