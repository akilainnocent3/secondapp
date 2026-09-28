package defpackage;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.android.transaction.ui.txlist.model.TxListItem;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class z6h0 extends RecyclerView.s {
    public final /* synthetic */ TxListActivity a;

    public z6h0(TxListActivity txListActivity) {
        this.a = txListActivity;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.s
    public final void b(RecyclerView recyclerView, int i, int i2) {
        RecyclerView.o layoutManager = recyclerView.getLayoutManager();
        LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
        if (linearLayoutManager == null) {
            return;
        }
        TxListActivity txListActivity = this.a;
        if (Intrinsics.g((TxListItem) CollectionsKt.V(linearLayoutManager.h1(), txListActivity.v.a), TxListItem.a.a)) {
            o7h0 o7h0VarA1 = txListActivity.A1();
            jvd0 jvd0Var = o7h0VarA1.Q;
            if (jvd0Var == null || !jvd0Var.isActive()) {
                Object value = o7h0VarA1.J.getValue();
                v8h0.f fVar = value instanceof v8h0.f ? (v8h0.f) value : null;
                if (fVar == null || fVar.a.isEmpty()) {
                    return;
                }
                o7h0VarA1.Q = ej5.c(o8i0.d(o7h0VarA1), null, null, new v7h0(o7h0VarA1, fVar, null), 3);
            }
        }
    }
}
