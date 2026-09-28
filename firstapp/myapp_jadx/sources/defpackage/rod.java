package defpackage;

import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.deposit.presentation.fragment.DepositBankTransferFragment$initViewModel$3", f = "DepositBankTransferFragment.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rod extends tje0 implements Function2<y200, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ nod b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rod(nod nodVar, v1b<? super rod> v1bVar) {
        super(2, v1bVar);
        this.b = nodVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rod rodVar = new rod(this.b, v1bVar);
        rodVar.a = obj;
        return rodVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(y200 y200Var, v1b<? super Unit> v1bVar) {
        return ((rod) create(y200Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<y200> list;
        Object value;
        y200 y200Var = (y200) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        nod nodVar = this.b;
        if (y200Var != null) {
            ohp<Object>[] ohpVarArr = nod.d;
            wwd0 wwd0Var = ((qdd0) nodVar.c.getValue()).b;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, Pair.a((Pair) value, null, y200Var, 1)));
        }
        ohp<Object>[] ohpVarArr2 = nod.d;
        z200 z200Var = (z200) nodVar.m0().e.getValue();
        int iIndexOf = (z200Var == null || (list = z200Var.a) == null) ? -1 : list.indexOf(y200Var);
        if (iIndexOf != -1) {
            TabLayout.g gVarK = nodVar.j0().c.k(iIndexOf);
            if (gVarK != null) {
                gVarK.b();
            }
            nodVar.j0().d.setCurrentItem(iIndexOf);
        }
        return Unit.a;
    }
}
