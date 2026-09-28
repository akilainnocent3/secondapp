package defpackage;

import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bookingcode.presentation.fragment.LoadCodeFragment$initLoadCodeViewModel$1", f = "LoadCodeFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ews extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ iws b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ews(iws iwsVar, v1b<? super ews> v1bVar) {
        super(2, v1bVar);
        this.b = iwsVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ews ewsVar = new ews(this.b, v1bVar);
        ewsVar.a = obj;
        return ewsVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((ews) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        iws iwsVar = this.b;
        e eVar = iwsVar.F;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        cwi cwiVar = iwsVar.H;
        if (cwiVar != null) {
            eVar.d(aVar, iwsVar, cwiVar.a, null);
            return Unit.a;
        }
        Intrinsics.n("binding");
        throw null;
    }
}
