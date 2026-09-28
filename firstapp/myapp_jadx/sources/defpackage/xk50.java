package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.activities.ResultsActivity;
import java.net.ConnectException;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xk50 extends pf implements Function2<ym50, v1b<? super Unit>, Object> {
    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ym50 ym50Var, v1b<? super Unit> v1bVar) {
        ym50 ym50Var2 = ym50Var;
        ResultsActivity resultsActivity = (ResultsActivity) this.a;
        int i = ResultsActivity.A;
        resultsActivity.getClass();
        mpe0 mpe0Var = resultsActivity.y;
        if (!Intrinsics.g(ym50Var2, ym50.d.a)) {
            if (Intrinsics.g(ym50Var2, ym50.e.a)) {
                dgd0 dgd0Var = resultsActivity.d;
                if (dgd0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                dgd0Var.w.d();
            } else if (Intrinsics.g(ym50Var2, ym50.b.a)) {
                dgd0 dgd0Var2 = resultsActivity.d;
                if (dgd0Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                dgd0Var2.w.b();
                fm50 fm50Var = (fm50) mpe0Var.getValue();
                fm50Var.b = m2g.a;
                fm50Var.notifyDataSetChanged();
            } else if (ym50Var2 instanceof ym50.a) {
                dgd0 dgd0Var3 = resultsActivity.d;
                if (dgd0Var3 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                dgd0Var3.w.setVisibility(8);
                fm50 fm50Var2 = (fm50) mpe0Var.getValue();
                fm50Var2.b = ((ym50.a) ym50Var2).a;
                fm50Var2.notifyDataSetChanged();
            } else {
                if (!(ym50Var2 instanceof ym50.c)) {
                    uhc.a();
                    return null;
                }
                dgd0 dgd0Var4 = resultsActivity.d;
                if (dgd0Var4 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                dgd0Var4.w.c();
                if (((ym50.c) ym50Var2).a instanceof ConnectException) {
                    zyf0.b(R.string.common_feedback__no_internet_connection_try_again, 0);
                }
            }
        }
        return Unit.a;
    }
}
