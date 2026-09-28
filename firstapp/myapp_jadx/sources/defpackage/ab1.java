package defpackage;

import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class ab1 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ab1(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                fb1 fb1Var = (fb1) obj3;
                twb.a aVar = (twb.a) obj;
                aVar.getClass();
                return fb1.E1(twb.a.a(aVar, null, null, null, fb1Var.i.a(aVar.j, new vjh0.a.C1215a((String) obj2), fb1Var.y1()).a, false, false, false, null, null, 65023));
            default:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj3;
                mi20 mi20Var = (mi20) obj2;
                nj40 nj40Var = (nj40) obj;
                if (nj40Var instanceof nj40.d) {
                    if (((nj40.d) nj40Var).b) {
                        RecyclerView recyclerView = preMatchEventActivity.U;
                        if (recyclerView != null) {
                            recyclerView.setVisibility(8);
                        }
                        LoadingView loadingView = preMatchEventActivity.z0;
                        if (loadingView != null) {
                            loadingView.K();
                        }
                    } else {
                        int i2 = PreMatchEventActivity.a2;
                    }
                    return Unit.a;
                }
                if (!preMatchEventActivity.R1) {
                    if (nj40Var instanceof nj40.a) {
                        boolean zIsEmpty = ((nj40.a) nj40Var).a.isEmpty();
                        preMatchEventActivity.S1 = !zIsEmpty;
                        if (!zIsEmpty) {
                            rd20.c cVar = rd20.c.a;
                            k00 k00Var = k00.d;
                            k00 k00Var2 = k00.c;
                            mi20Var.D1(cVar, k00Var, k00Var2);
                            mi20Var.D1(rd20.a.a, k00Var, k00Var2);
                        }
                    } else {
                        preMatchEventActivity.S1 = false;
                    }
                    preMatchEventActivity.o2();
                    preMatchEventActivity.n2();
                    preMatchEventActivity.R1 = true;
                }
                SwipeRefreshLayout swipeRefreshLayout = preMatchEventActivity.T;
                if (swipeRefreshLayout != null && swipeRefreshLayout.c) {
                    if (swipeRefreshLayout != null) {
                        swipeRefreshLayout.setRefreshing(false);
                    }
                    ImageView imageView = preMatchEventActivity.E0;
                    if (imageView != null) {
                        imageView.clearAnimation();
                    }
                }
                TextView textView = preMatchEventActivity.a0;
                if (textView != null && textView.getVisibility() == 8) {
                    RecyclerView recyclerView2 = preMatchEventActivity.U;
                    if (recyclerView2 != null) {
                        recyclerView2.setVisibility(0);
                    }
                    LoadingView loadingView2 = preMatchEventActivity.z0;
                    if (loadingView2 != null) {
                        loadingView2.E();
                    }
                    return Unit.a;
                }
                if (nj40Var instanceof nj40.a) {
                    gi20 gi20Var = preMatchEventActivity.H0;
                    if (gi20Var != null) {
                        gi20Var.i(((nj40.a) nj40Var).a);
                    }
                    RecyclerView recyclerView3 = preMatchEventActivity.U;
                    if (recyclerView3 != null) {
                        recyclerView3.setVisibility(0);
                    }
                    LoadingView loadingView3 = preMatchEventActivity.z0;
                    if (loadingView3 != null) {
                        loadingView3.E();
                    }
                } else if (nj40Var instanceof nj40.b) {
                    gi20 gi20Var2 = preMatchEventActivity.H0;
                    if (gi20Var2 != null) {
                        gi20Var2.i(m2g.a);
                    }
                    RecyclerView recyclerView4 = preMatchEventActivity.U;
                    if (recyclerView4 != null) {
                        recyclerView4.setVisibility(8);
                    }
                    LoadingView loadingView4 = preMatchEventActivity.z0;
                    if (loadingView4 != null) {
                        UiText uiText = ((nj40.b) nj40Var).b;
                        uiText.getClass();
                        loadingView4.H(uiText.e(preMatchEventActivity).toString());
                    }
                } else {
                    RecyclerView recyclerView5 = preMatchEventActivity.U;
                    if (recyclerView5 != null) {
                        recyclerView5.setVisibility(8);
                    }
                    LoadingView loadingView5 = preMatchEventActivity.z0;
                    if (loadingView5 != null) {
                        loadingView5.I();
                    }
                }
                return Unit.a;
        }
    }
}
