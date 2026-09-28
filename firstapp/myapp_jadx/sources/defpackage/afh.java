package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.home.featuredsection.FeaturedMatchPCBBView;
import com.sportybet.plugin.realsports.widget.OutcomeButton;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class afh implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ afh(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                FeaturedMatchPCBBView featuredMatchPCBBView = (FeaturedMatchPCBBView) obj;
                int i2 = FeaturedMatchPCBBView.y;
                View viewInflate = LayoutInflater.from(featuredMatchPCBBView.getContext()).inflate(R.layout.featured_pcbb_match_item, (ViewGroup) featuredMatchPCBBView, false);
                featuredMatchPCBBView.addView(viewInflate);
                int i3 = R.id.btn_pcbb_odds;
                OutcomeButton outcomeButton = (OutcomeButton) h5e.a(R.id.btn_pcbb_odds, viewInflate);
                if (outcomeButton != null) {
                    i3 = R.id.img_bb_logo;
                    if (((AppCompatImageView) h5e.a(R.id.img_bb_logo, viewInflate)) != null) {
                        i3 = R.id.img_best_odds;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.img_best_odds, viewInflate);
                        if (appCompatImageView != null) {
                            i3 = R.id.img_hot;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.img_hot, viewInflate);
                            if (appCompatImageView2 != null) {
                                i3 = R.id.img_live_boost;
                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.img_live_boost, viewInflate);
                                if (appCompatImageView3 != null) {
                                    i3 = R.id.img_sim;
                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.img_sim, viewInflate);
                                    if (appCompatImageView4 != null) {
                                        i3 = R.id.img_sporty_fm;
                                        AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.img_sporty_fm, viewInflate);
                                        if (appCompatImageView5 != null) {
                                            i3 = R.id.img_sporty_gift;
                                            AppCompatImageView appCompatImageView6 = (AppCompatImageView) h5e.a(R.id.img_sporty_gift, viewInflate);
                                            if (appCompatImageView6 != null) {
                                                i3 = R.id.img_sporty_tv;
                                                AppCompatImageView appCompatImageView7 = (AppCompatImageView) h5e.a(R.id.img_sporty_tv, viewInflate);
                                                if (appCompatImageView7 != null) {
                                                    i3 = R.id.img_stats;
                                                    AppCompatImageView appCompatImageView8 = (AppCompatImageView) h5e.a(R.id.img_stats, viewInflate);
                                                    if (appCompatImageView8 != null) {
                                                        i3 = R.id.league;
                                                        TextView textView = (TextView) h5e.a(R.id.league, viewInflate);
                                                        if (textView != null) {
                                                            i3 = R.id.match_time;
                                                            TextView textView2 = (TextView) h5e.a(R.id.match_time, viewInflate);
                                                            if (textView2 != null) {
                                                                i3 = R.id.rv_pcbb_outcomes;
                                                                RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.rv_pcbb_outcomes, viewInflate);
                                                                if (recyclerView != null) {
                                                                    i3 = R.id.teams_header;
                                                                    TextView textView3 = (TextView) h5e.a(R.id.teams_header, viewInflate);
                                                                    if (textView3 != null) {
                                                                        i3 = R.id.view_fade_edge;
                                                                        View viewA = h5e.a(R.id.view_fade_edge, viewInflate);
                                                                        if (viewA != null) {
                                                                            i3 = R.id.view_top_fade_edge;
                                                                            View viewA2 = h5e.a(R.id.view_top_fade_edge, viewInflate);
                                                                            if (viewA2 != null) {
                                                                                return new igh((ConstraintLayout) viewInflate, outcomeButton, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, appCompatImageView7, appCompatImageView8, textView, textView2, recyclerView, textView3, viewA, viewA2);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i3)));
                return null;
            default:
                ((Function1) obj).invoke(nc40.c.a);
                return Unit.a;
        }
    }
}
