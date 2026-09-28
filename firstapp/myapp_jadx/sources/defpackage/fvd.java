package defpackage;

import android.view.View;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositConfirmCompletedDialogFragment$initViewModel$1$4", f = "DepositConfirmCompletedDialogFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class fvd extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ gvd b;
    public final /* synthetic */ View c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fvd(gvd gvdVar, View view, v1b<? super fvd> v1bVar) {
        super(2, v1bVar);
        this.b = gvdVar;
        this.c = view;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        fvd fvdVar = new fvd(this.b, this.c, v1bVar);
        fvdVar.a = obj;
        return fvdVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((fvd) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        gvd gvdVar = this.b;
        e eVar = gvdVar.i;
        if (eVar != null) {
            eVar.d(aVar, gvdVar, this.c, null);
            return Unit.a;
        }
        Intrinsics.n("commonUiEventProcessor");
        throw null;
    }
}
