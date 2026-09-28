package defpackage;

import com.chad.library.adapter.base.BaseNodeAdapter;
import com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity;
import com.sportybet.feature.payment.impl.transaction.presentation.adapter.TxFixStatusTipAdapter;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.payment.impl.transaction.presentation.activity.TxFixStatusActivity$initViewModel$1$3", f = "TxFixStatusActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class m5h0 extends tje0 implements Function2<List<? extends u5h0>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxFixStatusActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m5h0(TxFixStatusActivity txFixStatusActivity, v1b<? super m5h0> v1bVar) {
        super(2, v1bVar);
        this.b = txFixStatusActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        m5h0 m5h0Var = new m5h0(this.b, v1bVar);
        m5h0Var.a = obj;
        return m5h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(List<? extends u5h0> list, v1b<? super Unit> v1bVar) {
        return ((m5h0) create(list, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List<u5h0> list = (List) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxFixStatusActivity txFixStatusActivity = this.b;
        TxFixStatusTipAdapter txFixStatusTipAdapter = txFixStatusActivity.e;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (u5h0 u5h0Var : list) {
            t5h0 t5h0Var = new t5h0(u5h0Var.a, u5h0Var.d);
            t5h0Var.c.add(new s5h0(u5h0Var.b, u5h0Var.c));
            arrayList.add(t5h0Var);
        }
        txFixStatusTipAdapter.setList(new ArrayList(arrayList));
        int i = 0;
        for (Object obj2 : list) {
            int i2 = i + 1;
            if (i < 0) {
                b.q();
                throw null;
            }
            if (((u5h0) obj2).e) {
                BaseNodeAdapter.expand$default(txFixStatusActivity.e, i + i, false, false, null, 12, null);
            }
            i = i2;
        }
        return Unit.a;
    }
}
