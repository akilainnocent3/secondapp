package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.e;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.PendingRequestFragment$initViewModel$1", f = "PendingRequestFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xc00 extends tje0 implements Function2<a, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ zc00 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc00(zc00 zc00Var, v1b<? super xc00> v1bVar) {
        super(2, v1bVar);
        this.b = zc00Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        xc00 xc00Var = new xc00(this.b, v1bVar);
        xc00Var.a = obj;
        return xc00Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(a aVar, v1b<? super Unit> v1bVar) {
        return ((xc00) create(aVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        a aVar = (a) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        zc00 zc00Var = this.b;
        e eVar = zc00Var.i;
        if (eVar == null) {
            Intrinsics.n("commonUiEventProcessor");
            throw null;
        }
        ComposeView composeView = zc00Var.y;
        if (composeView != null) {
            eVar.d(aVar, zc00Var, composeView, zc00Var);
            return Unit.a;
        }
        Intrinsics.n("rootView");
        throw null;
    }
}
