package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AnimationSet;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.n;
import androidx.recyclerview.widget.x;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class f0z extends x<g0z, RecyclerView.d0> {
    public fz4 b;
    public ij40 c;
    public mzy d;

    public static final class a extends n.e<g0z> {
        @Override // androidx.recyclerview.widget.n.e
        public final boolean areContentsTheSame(g0z g0zVar, g0z g0zVar2) {
            g0z g0zVar3 = g0zVar;
            g0z g0zVar4 = g0zVar2;
            g0zVar3.getClass();
            g0zVar4.getClass();
            return Intrinsics.g(g0zVar3, g0zVar4);
        }

        @Override // androidx.recyclerview.widget.n.e
        public final boolean areItemsTheSame(g0z g0zVar, g0z g0zVar2) {
            g0z g0zVar3 = g0zVar;
            g0z g0zVar4 = g0zVar2;
            g0zVar3.getClass();
            g0zVar4.getClass();
            if (g0zVar3 instanceof g0z.a) {
                return (g0zVar4 instanceof g0z.a) && Intrinsics.g(((g0z.a) g0zVar3).a.a, ((g0z.a) g0zVar4).a.a);
            }
            if (g0zVar3 instanceof g0z.d) {
                return g0zVar4 instanceof g0z.d;
            }
            g0z.b bVar = g0z.b.a;
            if (Intrinsics.g(g0zVar3, bVar)) {
                return Intrinsics.g(g0zVar4, bVar);
            }
            g0z.c cVar = g0z.c.a;
            if (Intrinsics.g(g0zVar3, cVar)) {
                return Intrinsics.g(g0zVar4, cVar);
            }
            uhc.a();
            return false;
        }
    }

    public f0z() {
        super(new a());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return getItem(i).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        d0Var.getClass();
        if (!(d0Var instanceof ky4)) {
            if (d0Var instanceof lj40) {
                g0z item = getItem(i);
                item.getClass();
                lj40 lj40Var = (lj40) d0Var;
                jj40 jj40Var = ((g0z.d) item).a;
                jj40Var.getClass();
                lj40Var.a.setContent(new op8(995438712, new qer(jj40Var, lj40Var), true));
                return;
            }
            return;
        }
        g0z item2 = getItem(i);
        item2.getClass();
        ky4 ky4Var = (ky4) d0Var;
        gz4 gz4Var = ((g0z.a) item2).a;
        gz4Var.getClass();
        d2p d2pVar = ky4Var.a;
        AnimationSet animationSet = (AnimationSet) ky4Var.e.getValue();
        d2pVar.getClass();
        CardView cardView = d2pVar.a;
        TextView textView = d2pVar.D;
        ProgressBar progressBar = d2pVar.i;
        ProgressBar progressBar2 = d2pVar.e;
        ProgressButton progressButton = d2pVar.v;
        ImageView imageView = d2pVar.c;
        ImageView imageView2 = d2pVar.b;
        Context context = cardView.getContext();
        TextView textView2 = d2pVar.y;
        context.getClass();
        textView2.setText(sn5.b(context, R.string.page_code_hub__folds, new Object[0]).concat(":"));
        d2pVar.A.setText(sn5.b(context, R.string.page_code_hub__odds, new Object[0]).concat(":"));
        d2pVar.w.setText(gz4Var.a);
        d2pVar.z.setText(gz4Var.b.e(context));
        d2pVar.B.setText(gz4Var.c.e(context));
        RecyclerView recyclerView = d2pVar.f;
        RecyclerView.f adapter = recyclerView.getAdapter();
        qy4 qy4Var = adapter instanceof qy4 ? (qy4) adapter : null;
        if (qy4Var != null) {
            qy4Var.i(gz4Var.d);
        }
        gy4.c(d2pVar.H, animationSet, recyclerView.getAdapter());
        tzs tzsVar = gz4Var.h;
        tzs.a aVar = tzs.a.a;
        if (Intrinsics.g(tzsVar, aVar)) {
            progressBar.setVisibility(8);
            imageView.setVisibility(0);
            textView.setText(sn5.b(context, R.string.page_code_hub__share, new Object[0]));
            imageView.setClickable(true);
        } else {
            if (!Intrinsics.g(tzsVar, tzs.b.a)) {
                uhc.a();
                return;
            }
            progressBar.setVisibility(0);
            imageView.setVisibility(4);
            textView.setText(sn5.b(context, R.string.common_functions__loading_with_dot, new Object[0]));
            imageView.setClickable(false);
        }
        tzs tzsVar2 = gz4Var.i;
        if (Intrinsics.g(tzsVar2, aVar)) {
            progressButton.setLoading(false);
            progressButton.setClickable(true);
        } else if (!Intrinsics.g(tzsVar2, tzs.b.a)) {
            uhc.a();
            return;
        } else {
            progressButton.setLoading(true);
            progressButton.setClickable(false);
        }
        if (!gz4Var.f) {
            progressBar2.setVisibility(8);
            imageView2.setVisibility(8);
            return;
        }
        tzs tzsVar3 = gz4Var.j;
        if (Intrinsics.g(tzsVar3, aVar)) {
            progressBar2.setVisibility(8);
            imageView2.setVisibility(0);
            imageView2.setClickable(true);
        } else {
            if (!Intrinsics.g(tzsVar3, tzs.b.a)) {
                uhc.a();
                return;
            }
            progressBar2.setVisibility(0);
            imageView2.setVisibility(4);
            imageView2.setClickable(false);
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        int i2 = 1;
        int i3 = 0;
        if (i == 0) {
            return new ky4(d2p.a(LayoutInflater.from(viewGroup.getContext()), viewGroup), new gcb(this, i2), new hcb(this, i2), new d0z(this), new e0z(this, i3));
        }
        if (i == 1) {
            Context context = viewGroup.getContext();
            context.getClass();
            ComposeView composeView = new ComposeView(context, null, 6, 0);
            composeView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            return new lj40(composeView, this.c);
        }
        if (i == 2) {
            return new a0z(xid0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_open_bet_no_data_view, viewGroup, false)));
        }
        if (i != 3) {
            return new a0z(xid0.a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.spr_open_bet_no_data_view, viewGroup, false)));
        }
        View viewA = dzc.a(viewGroup, R.layout.spr_open_bet_no_login_view, viewGroup, false);
        int i4 = R.id.open_bet_login_btn;
        AppCompatButton appCompatButton = (AppCompatButton) h5e.a(R.id.open_bet_login_btn, viewA);
        if (appCompatButton != null) {
            i4 = R.id.open_bet_no_login_text;
            if (((AppCompatTextView) h5e.a(R.id.open_bet_no_login_text, viewA)) != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) viewA;
                mzy mzyVar = this.d;
                c0z c0zVar = new c0z(constraintLayout);
                appCompatButton.setOnClickListener(new b0z(new cq40(), mzyVar));
                appCompatButton.setBackground(zch0.e(constraintLayout.getContext().getColor(R.color.brand_secondary), zch0.a(constraintLayout.getContext(), 1), zch0.a(constraintLayout.getContext(), 2)));
                return c0zVar;
            }
        }
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i4)));
        return null;
    }
}
