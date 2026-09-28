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
import com.sportygames.pingpong.remote.models.Coefficients;
import java.util.List;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class ty50 extends Dialog {
    public e a;
    public y720 b;
    public ibs c;
    public RecyclerView d;
    public TextView e;
    public ConstraintLayout f;
    public int i;
    public List<Coefficients> v;
    public wy50 w;
    public ns80 y;

    public final ns80 a() {
        ns80 ns80Var = this.y;
        if (ns80Var != null) {
            return ns80Var;
        }
        Intrinsics.n("dailog");
        throw null;
    }

    @Override // android.app.Dialog
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        requestWindowFeature(1);
        setContentView(R.layout.pp_round_history);
        View viewFindViewById = findViewById(R.id.round_history_list);
        viewFindViewById.getClass();
        this.d = (RecyclerView) viewFindViewById;
        View viewFindViewById2 = findViewById(R.id.container);
        viewFindViewById2.getClass();
        this.f = (ConstraintLayout) viewFindViewById2;
        View viewFindViewById3 = findViewById(R.id.biggest_coeff);
        viewFindViewById3.getClass();
        this.e = (TextView) viewFindViewById3;
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
        wy50 wy50Var = new wy50(context, this.v, this.b, this.c, this.i);
        this.w = wy50Var;
        RecyclerView recyclerView3 = this.d;
        if (recyclerView3 == null) {
            Intrinsics.n("roundHistoryList");
            throw null;
        }
        recyclerView3.setAdapter(wy50Var);
        ConstraintLayout constraintLayout = this.f;
        if (constraintLayout == null) {
            Intrinsics.n("container");
            throw null;
        }
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ry50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.a.dismiss();
                wz.a("popup_action", "Ping Pong", "round history", AnalyticsParam.STORY_SKIP_REASON_CLOSE);
            }
        });
        TextView textView = this.e;
        if (textView == null) {
            Intrinsics.n("biggestCoeff");
            throw null;
        }
        textView.setOnClickListener(new View.OnClickListener() { // from class: sy50
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ty50 ty50Var = this.a;
                e eVar = ty50Var.a;
                if (eVar == null || eVar.isFinishing() || eVar.isDestroyed()) {
                    return;
                }
                y720 y720Var = ty50Var.b;
                ibs ibsVar = ty50Var.c;
                y720Var.getClass();
                ibsVar.getClass();
                ns80 ns80Var = new ns80(eVar);
                ns80Var.a = y720Var;
                ns80Var.b = ibsVar;
                String string = ns80Var.getContext().getString(R.string.daily);
                string.getClass();
                ns80Var.d = string;
                ns80Var.setCancelable(true);
                ns80Var.setCanceledOnTouchOutside(false);
                ty50Var.y = ns80Var;
                ns80 ns80VarA = ty50Var.a();
                try {
                    Window window = ns80VarA.getWindow();
                    WindowManager.LayoutParams attributes = window != null ? window.getAttributes() : null;
                    if (attributes != null) {
                        attributes.gravity = 17;
                    }
                    if (attributes != null) {
                        attributes.flags &= -5;
                    }
                    Window window2 = ns80VarA.getWindow();
                    if (window2 != null) {
                        window2.setAttributes(attributes);
                    }
                    Window window3 = ns80VarA.getWindow();
                    if (window3 != null) {
                        window3.setBackgroundDrawableResource(R.color.trans_black_45);
                    }
                    ns80VarA.show();
                    Window window4 = ns80VarA.getWindow();
                    if (window4 != null) {
                        window4.setLayout(-1, -1);
                    }
                } catch (Exception unused) {
                }
                ty50Var.dismiss();
            }
        });
        op5 op5Var = op5.a;
        TextView textView2 = this.e;
        if (textView2 != null) {
            op5.r(op5Var, b.f(textView2), null, 4);
        } else {
            Intrinsics.n("biggestCoeff");
            throw null;
        }
    }
}
