package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.LoadingView;
import com.sportybet.plugin.realsports.prematch.data.PreMatchLoadingState;
import com.sportybet.plugin.realsports.prematch.data.PreMatchSectionData;
import com.sportybet.plugin.realsports.prematch.data.TournamentTitleData;
import java.util.List;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final class ggg0 extends RecyclerView.d0 {
    public final ujd0 a;
    public final tf20.b b;
    public final List<String> c;
    public final Context d;
    public final mpe0 e;
    public final mpe0 f;

    /* JADX WARN: Illegal instructions before constructor call */
    public ggg0(final ujd0 ujd0Var, tf20.b bVar, List list) {
        list.getClass();
        ConstraintLayout constraintLayout = ujd0Var.a;
        super(constraintLayout);
        this.a = ujd0Var;
        this.b = bVar;
        this.c = list;
        this.d = constraintLayout.getContext();
        this.e = hwr.b(new Function0() { // from class: egg0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                Context context = this.a.d;
                Drawable drawable = context.getDrawable(R.drawable.spr_ic_arrow_drop_down_black_24dp);
                if (drawable == null) {
                    return null;
                }
                context.getClass();
                aef.b(drawable, context, R.color.brand_secondary_variable_type3);
                return drawable;
            }
        });
        int i = 1;
        this.f = hwr.b(new h5r(this, 1));
        ujd0Var.b.setVisibility(8);
        ujd0Var.w.setOnClickListener(new vdm(this, i));
        ujd0Var.i.setOnClickListener(new View.OnClickListener() { // from class: fgg0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Object tag = ujd0Var.i.getTag();
                if (!(tag instanceof String)) {
                    tag = null;
                }
                String str = (String) tag;
                if (str == null) {
                    return;
                }
                this.b.a(str, false);
            }
        });
        ujd0Var.e.setOnClickListener(new vah(this, i));
        ujd0Var.d.setViewCompositionStrategy(u6i0.b.a);
    }

    /* JADX WARN: Code duplicated, block: B:63:0x0137 A[DONT_INVERT] */
    public final void a(PreMatchSectionData preMatchSectionData, boolean z, whh0 whh0Var, ezj0 ezj0Var) {
        if (!(preMatchSectionData instanceof TournamentTitleData)) {
            preMatchSectionData = null;
        }
        TournamentTitleData tournamentTitleData = (TournamentTitleData) preMatchSectionData;
        if (tournamentTitleData == null) {
            return;
        }
        ujd0 ujd0Var = this.a;
        TextView textView = ujd0Var.w;
        LoadingView loadingView = ujd0Var.i;
        TextView textView2 = ujd0Var.e;
        ComposeView composeView = ujd0Var.d;
        textView.setTag(new Pair(tournamentTitleData.getTournamentId(), Boolean.valueOf(tournamentTitleData.isExpand())));
        textView.setText(tournamentTitleData.getName());
        textView.setCompoundDrawablesWithIntrinsicBounds(tournamentTitleData.isExpand() ? (Drawable) this.e.getValue() : (Drawable) this.f.getValue(), (Drawable) null, (Drawable) null, (Drawable) null);
        ujd0Var.y.setVisibility(z ? 0 : 8);
        ujd0Var.v.setText(String.valueOf(tournamentTitleData.getEventSize()));
        composeView.setVisibility((tournamentTitleData.isExpand() && this.c.contains(tournamentTitleData.getTournamentId())) ? 0 : 8);
        czj0 czj0Var = czj0.Compact;
        czj0Var.getClass();
        boolean z2 = true;
        composeView.setContent(new op8(-1932765185, new qif0(1, ezj0Var, czj0Var), true));
        textView2.setTag(tournamentTitleData.getTournamentId());
        boolean z3 = tournamentTitleData.isExpand() && tournamentTitleData.getLoadingState() == PreMatchLoadingState.LOAD_SUCCESS && tournamentTitleData.getEventSize() == 0;
        boolean hasOdds = tournamentTitleData.getHasOdds();
        ConstraintLayout constraintLayout = ujd0Var.c;
        Context context = this.d;
        if (z3) {
            TextView textView3 = ujd0Var.f;
            constraintLayout.setVisibility(0);
            if (hasOdds) {
                textView2.setVisibility(8);
                context.getClass();
                textView3.setText(sn5.b(context, R.string.common_feedback__no_available_filtered_games, new Object[0]));
            } else {
                textView2.setVisibility(0);
                context.getClass();
                textView3.setText(sn5.b(context, R.string.common_feedback__no_odds_available, new Object[0]));
            }
        } else {
            constraintLayout.setVisibility(8);
        }
        loadingView.setTag(tournamentTitleData.getTournamentId());
        boolean zIsExpand = tournamentTitleData.isExpand();
        PreMatchLoadingState loadingState = tournamentTitleData.getLoadingState();
        phh0 phh0Var = whh0Var != null ? whh0Var.b : null;
        int i = phh0Var == null ? -1 : hgg0.a[phh0Var.ordinal()];
        if (i == -1) {
            z2 = false;
        } else {
            if (i == 1) {
                int iOrdinal = whh0Var.a.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal != 1) {
                        uhc.a();
                        return;
                    } else if (!tournamentTitleData.getHaveDCOneUpMarket()) {
                        if (z3) {
                        }
                    }
                } else if (!tournamentTitleData.getHaveOneUpMarket()) {
                    if (z3) {
                    }
                }
            } else if (i != 2) {
                uhc.a();
                return;
            } else if (!tournamentTitleData.getHaveTwoUpMarket()) {
                if (z3) {
                }
            }
            z2 = false;
        }
        if (!zIsExpand) {
            loadingView.setVisibility(8);
            return;
        }
        if (loadingState == PreMatchLoadingState.LOADING) {
            loadingView.K();
            return;
        }
        if (loadingState == PreMatchLoadingState.LOAD_FAILED) {
            loadingView.I();
        } else if (!z2) {
            loadingView.setVisibility(8);
        } else {
            context.getClass();
            loadingView.H(sn5.b(context, R.string.common_functions__no_game, new Object[0]));
        }
    }
}
