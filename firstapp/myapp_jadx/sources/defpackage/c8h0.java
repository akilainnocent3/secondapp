package defpackage;

import com.sportybet.android.transaction.ui.txlist.model.TxListItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListViewModel$uiStateFlow$1", f = "TxListViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c8h0 extends tje0 implements gaj<v8h0, t8h0, v1b<? super v8h0>, Object> {
    public /* synthetic */ v8h0 a;
    public /* synthetic */ t8h0 b;

    @Override // defpackage.gaj
    public final Object invoke(v8h0 v8h0Var, t8h0 t8h0Var, v1b<? super v8h0> v1bVar) {
        c8h0 c8h0Var = new c8h0(3, v1bVar);
        c8h0Var.a = v8h0Var;
        c8h0Var.b = t8h0Var;
        return c8h0Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v8h0 v8h0Var = this.a;
        t8h0 t8h0Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(v8h0Var instanceof v8h0.f)) {
            return v8h0Var;
        }
        v8h0.f fVar = (v8h0.f) v8h0Var;
        List<TxListItem> list = fVar.a;
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        for (TxListItem bVar : list) {
            if (bVar instanceof TxListItem.b) {
                brg0 brg0Var = ((TxListItem.b) bVar).a;
                bVar = new TxListItem.b(brg0.a(brg0Var, 0, null, t8h0Var.a(brg0Var.h, brg0Var.g, brg0Var.i, brg0Var.j), 1023));
            }
            arrayList.add(bVar);
        }
        return v8h0.f.a(fVar, arrayList);
    }
}
