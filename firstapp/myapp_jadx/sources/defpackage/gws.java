package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.fragment.LoadCodeFragment$initLoadCodeViewModel$3", f = "LoadCodeFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class gws extends tje0 implements Function2<tzs, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ iws b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gws(iws iwsVar, v1b<? super gws> v1bVar) {
        super(2, v1bVar);
        this.b = iwsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        gws gwsVar = new gws(this.b, v1bVar);
        gwsVar.a = obj;
        return gwsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(tzs tzsVar, v1b<? super Unit> v1bVar) {
        return ((gws) create(tzsVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        tzs tzsVar = (tzs) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        cwi cwiVar = this.b.H;
        if (cwiVar != null) {
            cwiVar.e.setLoading(tzsVar instanceof tzs.b);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
