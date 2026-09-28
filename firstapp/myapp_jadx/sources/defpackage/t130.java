package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileViewModel$initializeProfileData$3", f = "ProfileViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class t130 extends tje0 implements gaj<myh<? super Unit>, Throwable, v1b<? super Unit>, Object> {
    public /* synthetic */ Throwable a;
    public final /* synthetic */ a230 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t130(a230 a230Var, v1b<? super t130> v1bVar) {
        super(3, v1bVar);
        this.b = a230Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(myh<? super Unit> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
        t130 t130Var = new t130(this.b, v1bVar);
        t130Var.a = th;
        return t130Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        Throwable th = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        itf0.a.f(th, "Profile initialization failed", new Object[0]);
        wwd0 wwd0Var = this.b.z;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, j130.a((j130) value, null, null, null, false, null, false, false, true, null, 319)));
        return Unit.a;
    }
}
