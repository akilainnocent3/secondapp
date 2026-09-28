package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$state$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class u3r extends tje0 implements kaj<erq, k0r, m2q, f2r.d, Boolean, v1b<? super t1r>, Object> {
    public /* synthetic */ erq a;
    public /* synthetic */ k0r b;
    public /* synthetic */ m2q c;
    public /* synthetic */ f2r.d d;
    public /* synthetic */ boolean e;

    public u3r(v1b<? super u3r> v1bVar) {
        super(6, v1bVar);
    }

    @Override // defpackage.kaj
    public final Object f(erq erqVar, k0r k0rVar, m2q m2qVar, f2r.d dVar, Boolean bool, v1b<? super t1r> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        u3r u3rVar = new u3r(v1bVar);
        u3rVar.a = erqVar;
        u3rVar.b = k0rVar;
        u3rVar.c = m2qVar;
        u3rVar.d = dVar;
        u3rVar.e = zBooleanValue;
        return u3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        erq erqVar = this.a;
        k0r k0rVar = this.b;
        m2q m2qVar = this.c;
        f2r.d dVar = this.d;
        boolean z = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new t1r(erqVar.b, k0rVar, m2qVar, z, dVar.a, dVar.b, dVar.c, 128);
    }
}
