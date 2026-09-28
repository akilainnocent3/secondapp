package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.viewmodel.TxFixStatusViewModel$init$1", f = "TxFixStatusViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class y5h0 extends tje0 implements Function2<List<? extends CMSResponse>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ x5h0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y5h0(x5h0 x5h0Var, v1b<? super y5h0> v1bVar) {
        super(2, v1bVar);
        this.b = x5h0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        y5h0 y5h0Var = new y5h0(this.b, v1bVar);
        y5h0Var.a = obj;
        return y5h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends CMSResponse> list, v1b<? super Unit> v1bVar) {
        return ((y5h0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.z.setValue(list);
        return Unit.a;
    }
}
