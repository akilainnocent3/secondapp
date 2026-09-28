package defpackage;

import android.graphics.drawable.Drawable;
import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.transaction.ui.txlist.TxListActivity;
import com.sportybet.android.transaction.ui.txlist.model.TxListItem;
import com.sportybet.plugin.realsports.widget.LoadingViewWithHint;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.transaction.ui.txlist.TxListActivity$initTxViewModel$1$5", f = "TxListActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class g7h0 extends tje0 implements Function2<v8h0, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ TxListActivity b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g7h0(TxListActivity txListActivity, v1b<? super g7h0> v1bVar) {
        super(2, v1bVar);
        this.b = txListActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        g7h0 g7h0Var = new g7h0(this.b, v1bVar);
        g7h0Var.a = obj;
        return g7h0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v8h0 v8h0Var, v1b<? super Unit> v1bVar) {
        return ((g7h0) create(v8h0Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v8h0 v8h0Var = (v8h0) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        TxListActivity txListActivity = this.b;
        n7h0 n7h0Var = txListActivity.v;
        ze zeVar = txListActivity.d;
        if (zeVar == null) {
            Intrinsics.n("binding");
            throw null;
        }
        TextView hintView = zeVar.i.getHintView();
        hintView.getClass();
        hintView.setVisibility(8);
        if (v8h0Var instanceof v8h0.d) {
            ze zeVar2 = txListActivity.d;
            if (zeVar2 == null) {
                Intrinsics.n("binding");
                throw null;
            }
            LoadingViewWithHint loadingViewWithHint = zeVar2.i;
            loadingViewWithHint.setVisibility(0);
            loadingViewWithHint.b.setVisibility(0);
            loadingViewWithHint.a.setVisibility(8);
            loadingViewWithHint.c.setVisibility(8);
            loadingViewWithHint.d.setVisibility(8);
        } else {
            boolean z = v8h0Var instanceof v8h0.a;
            if (z || (v8h0Var instanceof v8h0.b)) {
                ze zeVar3 = txListActivity.d;
                if (zeVar3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LoadingViewWithHint loadingViewWithHint2 = zeVar3.i;
                String strC = sn5.c(loadingViewWithHint2, R.string.common_feedback__no_records_found, new Object[0]);
                loadingViewWithHint2.setVisibility(0);
                loadingViewWithHint2.b.setVisibility(8);
                loadingViewWithHint2.a.setVisibility(8);
                loadingViewWithHint2.c.setText(strC);
                loadingViewWithHint2.c.setVisibility(0);
                loadingViewWithHint2.c.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, gr0.a(loadingViewWithHint2.getContext(), R.drawable.spr_results_no_result), (Drawable) null, (Drawable) null);
                loadingViewWithHint2.c.setCompoundDrawablePadding(zch0.a(loadingViewWithHint2.getContext(), 10));
                boolean z2 = v8h0Var instanceof v8h0.b;
                if (z2) {
                    hintView.setText(sn5.c(hintView, R.string.page_transaction__select_a_date_range_to_find_more_records, new Object[0]));
                    hintView.setVisibility(0);
                }
                if ((z && ((v8h0.a) v8h0Var).a) || (z2 && ((v8h0.b) v8h0Var).a)) {
                    txListActivity.I = true;
                    txListActivity.B1(true);
                } else {
                    txListActivity.I = false;
                    txListActivity.B1(false);
                }
            } else if (v8h0Var instanceof v8h0.c) {
                ze zeVar4 = txListActivity.d;
                if (zeVar4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LoadingViewWithHint loadingViewWithHint3 = zeVar4.i;
                loadingViewWithHint3.setVisibility(0);
                loadingViewWithHint3.b.setVisibility(8);
                loadingViewWithHint3.a.setVisibility(0);
                loadingViewWithHint3.c.setVisibility(8);
                loadingViewWithHint3.d.setVisibility(8);
                ze zeVar5 = txListActivity.d;
                if (zeVar5 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar5.B.setRefreshing(false);
            } else if (v8h0Var instanceof v8h0.f) {
                ze zeVar6 = txListActivity.d;
                if (zeVar6 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                LoadingViewWithHint loadingViewWithHint4 = zeVar6.i;
                if (loadingViewWithHint4.getVisibility() == 0) {
                    loadingViewWithHint4.setVisibility(8);
                }
                v8h0.f fVar = (v8h0.f) v8h0Var;
                List<TxListItem> list = fVar.a;
                boolean z3 = fVar.b;
                boolean z4 = fVar.c;
                txListActivity.I = z3;
                txListActivity.B1(z3);
                if (z4) {
                    ze zeVar7 = txListActivity.d;
                    if (zeVar7 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    zeVar7.f.setVisibility(0);
                    ze zeVar8 = txListActivity.d;
                    if (zeVar8 == null) {
                        Intrinsics.n("binding");
                        throw null;
                    }
                    sn5.f(zeVar8.f, R.string.page_transaction__payment_process_unstable_text__NG, new Object[0]);
                }
                n7h0Var.getClass();
                n7h0Var.a = list;
                n7h0Var.notifyDataSetChanged();
                ze zeVar9 = txListActivity.d;
                if (zeVar9 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar9.B.setRefreshing(false);
            } else {
                if (!(v8h0Var instanceof v8h0.e)) {
                    uhc.a();
                    return null;
                }
                ze zeVar10 = txListActivity.d;
                if (zeVar10 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                zeVar10.B.setRefreshing(true);
            }
        }
        return Unit.a;
    }
}
