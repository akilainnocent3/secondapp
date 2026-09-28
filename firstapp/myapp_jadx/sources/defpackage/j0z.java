package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.openbet.presentation.viewmodel.OpenBetSharedViewModel$fetchOpenBetCount$2", f = "OpenBetSharedViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class j0z extends tje0 implements Function2<wyy, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ n0z b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j0z(n0z n0zVar, v1b<? super j0z> v1bVar) {
        super(2, v1bVar);
        this.b = n0zVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        j0z j0zVar = new j0z(this.b, v1bVar);
        j0zVar.a = obj;
        return j0zVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(wyy wyyVar, v1b<? super Unit> v1bVar) {
        return ((j0z) create(wyyVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        wyy wyyVar = (wyy) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        n0z n0zVar = this.b;
        n0zVar.w.r(new Integer(wyyVar.a));
        ssw<wyy> sswVar = n0zVar.z;
        if (!wyyVar.equals(sswVar.d())) {
            sswVar.m(wyyVar);
        }
        return Unit.a;
    }
}
