package defpackage;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spin2win.model.local.RecentWins;
import java.util.ArrayList;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class x3b0 extends Dialog {
    public ArrayList<RecentWins> a;
    public x0b0 b;
    public dp80 c;

    public final void a(boolean z) {
        dp80 dp80Var = this.c;
        if (z) {
            if (dp80Var != null) {
                dp80Var.c.setVisibility(0);
            }
        } else if (dp80Var != null) {
            dp80Var.c.setVisibility(8);
        }
    }

    public final void b(ArrayList<RecentWins> arrayList) {
        RecyclerView.f adapter;
        dp80 dp80Var = this.c;
        if (dp80Var != null) {
            RecyclerView recyclerView = dp80Var.d;
            if (arrayList != null && !arrayList.isEmpty()) {
                recyclerView.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager());
                recyclerView.setAdapter(new y3b0(arrayList));
            }
        }
        dp80 dp80Var2 = this.c;
        if (dp80Var2 == null || (adapter = dp80Var2.d.getAdapter()) == null) {
            return;
        }
        adapter.notifyDataSetChanged();
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        View viewInflate = getLayoutInflater().inflate(R.layout.sg_recent_wins_spin2win, (ViewGroup) null, false);
        int i = R.id.close_dialog;
        FloatingActionButton floatingActionButton = (FloatingActionButton) h5e.a(R.id.close_dialog, viewInflate);
        if (floatingActionButton != null) {
            i = R.id.container;
            if (((ConstraintLayout) h5e.a(R.id.container, viewInflate)) != null) {
                i = R.id.progress_bar;
                SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.progress_bar, viewInflate);
                if (spinKitView != null) {
                    i = R.id.recent_wins;
                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.recent_wins, viewInflate);
                    if (recyclerView != null) {
                        i = R.id.tv_amount;
                        TextView textView = (TextView) h5e.a(R.id.tv_amount, viewInflate);
                        if (textView != null) {
                            i = R.id.tv_name;
                            TextView textView2 = (TextView) h5e.a(R.id.tv_name, viewInflate);
                            if (textView2 != null) {
                                i = R.id.tv_time;
                                TextView textView3 = (TextView) h5e.a(R.id.tv_time, viewInflate);
                                if (textView3 != null) {
                                    ConstraintLayout constraintLayout = (ConstraintLayout) viewInflate;
                                    this.c = new dp80(constraintLayout, floatingActionButton, spinKitView, recyclerView, textView, textView2, textView3);
                                    if (constraintLayout != null) {
                                        setContentView(constraintLayout);
                                    }
                                    qst qstVar = new qst(this, 2);
                                    dp80 dp80Var = this.c;
                                    if (dp80Var != null) {
                                        dp80Var.b.setOnClickListener(new cn60(this, qstVar));
                                    }
                                    b(this.a);
                                    op5 op5Var = op5.a;
                                    dp80 dp80Var2 = this.c;
                                    op5.r(op5Var, b.f(dp80Var2 != null ? dp80Var2.f : null, dp80Var2 != null ? dp80Var2.e : null, dp80Var2 != null ? dp80Var2.i : null), null, 6);
                                    return;
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }
}
