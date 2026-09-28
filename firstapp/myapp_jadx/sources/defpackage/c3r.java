package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetViewModel$overlayState$1", f = "LNPlaceBetViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c3r extends tje0 implements iaj<v4r, y5q, e0q, v1b<? super f2r.d>, Object> {
    public /* synthetic */ v4r a;
    public /* synthetic */ y5q b;
    public /* synthetic */ e0q c;

    @Override // defpackage.iaj
    public final Object d(v4r v4rVar, y5q y5qVar, e0q e0qVar, v1b<? super f2r.d> v1bVar) {
        c3r c3rVar = new c3r(4, v1bVar);
        c3rVar.a = v4rVar;
        c3rVar.b = y5qVar;
        c3rVar.c = e0qVar;
        return c3rVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v4r v4rVar = this.a;
        y5q y5qVar = this.b;
        e0q e0qVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        return new f2r.d(v4rVar, y5qVar, e0qVar);
    }
}
