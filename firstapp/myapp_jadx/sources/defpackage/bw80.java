package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.flexbox.FlexboxLayoutManager;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.remote.models.Coefficients;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class bw80 extends Dialog {
    public os80 A;
    public e a;
    public c28 b;
    public ibs c;
    public RecyclerView d;
    public TextView e;
    public TextView f;
    public ConstraintLayout i;
    public ConstraintLayout v;
    public int w;
    public List<Coefficients> y;
    public xy50 z;

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.sh_round_history_v2);
        View viewFindViewById = findViewById(R.id.round_history_list);
        viewFindViewById.getClass();
        this.d = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.container);
        viewFindViewById2.getClass();
        this.i = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.round_txt);
        viewFindViewById3.getClass();
        this.f = (TextView) viewFindViewById3;
        View viewFindViewById4 = findViewById(R.id.parent_container);
        viewFindViewById4.getClass();
        this.v = (ConstraintLayout) viewFindViewById4;
        View viewFindViewById5 = findViewById(R.id.biggest_coeff);
        viewFindViewById5.getClass();
        this.e = (TextView) viewFindViewById5;
        FlexboxLayoutManager flexboxLayoutManager = new FlexboxLayoutManager(this.a);
        flexboxLayoutManager.l1(0);
        flexboxLayoutManager.k1(2);
        RecyclerView recyclerView = this.d;
        if (recyclerView == null) {
            Intrinsics.n("roundHistoryList");
            throw null;
        }
        recyclerView.setLayoutManager(flexboxLayoutManager);
        RecyclerView recyclerView2 = this.d;
        if (recyclerView2 == null) {
            Intrinsics.n("roundHistoryList");
            throw null;
        }
        recyclerView2.setItemAnimator(null);
        Context context = getContext();
        context.getClass();
        xy50 xy50Var = new xy50(context, this.y, this.b, this.c, this.w);
        this.z = xy50Var;
        RecyclerView recyclerView3 = this.d;
        if (recyclerView3 == null) {
            Intrinsics.n("roundHistoryList");
            throw null;
        }
        recyclerView3.setAdapter(xy50Var);
        ConstraintLayout constraintLayout = this.i;
        if (constraintLayout == null) {
            Intrinsics.n("container");
            throw null;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: zv80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.dismiss();
                wz.a("popup_action", "Sporty Hero", "round history", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
            }
        });
        TextView textView = this.e;
        if (textView == null) {
            Intrinsics.n("biggestCoeff");
            throw null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: aw80
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                bw80 bw80Var = this.a;
                e eVar = bw80Var.a;
                if (eVar == null || eVar.isFinishing() || eVar.isDestroyed()) {
                    return;
                }
                c28 c28Var = bw80Var.b;
                ibs ibsVar = bw80Var.c;
                c28Var.getClass();
                ibsVar.getClass();
                os80 os80Var = new os80(eVar);
                os80Var.a = c28Var;
                os80Var.b = ibsVar;
                String string = os80Var.getContext().getString(R.string.daily);
                string.getClass();
                os80Var.d = string;
                os80Var.setCancelable(false);
                bw80Var.A = os80Var;
                try {
                    Window window = os80Var.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.gravity = 17;
                    }
                    if (attributes != null) {
                        attributes.flags &= -5;
                    }
                    Window window2 = os80Var.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    Window window3 = os80Var.getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawableResource(R.color.dialog_bg_color);
                    }
                    os80Var.show();
                    Window window4 = os80Var.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                } catch (Exception unused) {
                }
                bw80Var.dismiss();
            }
        });
        op5 op5Var = op5.a;
        TextView textView2 = this.e;
        if (textView2 == null) {
            Intrinsics.n("biggestCoeff");
            throw null;
        }
        TextView textView3 = this.f;
        if (textView3 != null) {
            op5.r(op5Var, b.f(textView2, textView3), null, 4);
        } else {
            Intrinsics.n("roundTxt");
            throw null;
        }
    }
}
