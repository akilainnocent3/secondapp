package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$state$2", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class v3r extends tje0 implements gaj<t1r, Boolean, v1b<? super t1r>, Object> {
    public /* synthetic */ t1r a;
    public /* synthetic */ boolean b;

    @Override // defpackage.gaj
    public final Object invoke(t1r t1rVar, Boolean bool, v1b<? super t1r> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        v3r v3rVar = new v3r(3, v1bVar);
        v3rVar.a = t1rVar;
        v3rVar.b = zBooleanValue;
        return v3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        t1r t1rVar = this.a;
        boolean z = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        String str = t1rVar.a;
        k0r k0rVar = t1rVar.b;
        m2q m2qVar = t1rVar.c;
        boolean z2 = t1rVar.d;
        v4r v4rVar = t1rVar.e;
        y5q y5qVar = t1rVar.f;
        e0q e0qVar = t1rVar.g;
        str.getClass();
        k0rVar.getClass();
        m2qVar.getClass();
        v4rVar.getClass();
        y5qVar.getClass();
        e0qVar.getClass();
        return new t1r(str, k0rVar, m2qVar, z2, v4rVar, y5qVar, e0qVar, z);
    }
}
