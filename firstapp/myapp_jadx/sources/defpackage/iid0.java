package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.gridlayout.widget.GridLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class iid0 implements g6i0 {
    public final OutcomeButton A;
    public final ImageView B;
    public final GridLayout C;
    public final ImageView D;
    public final View E;
    public final ListenableSpinner F;
    public final View G;
    public final TextView H;
    public final AppCompatImageView I;
    public final AppCompatImageView J;
    public final AppCompatImageView K;
    public final AppCompatImageView L;
    public final LiveTimerTextView M;
    public final ImageView N;
    public final ImageView O;
    public final FrameLayout a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final LinearLayout f;
    public final TextView i;
    public final TextView v;
    public final OutcomeButton w;
    public final OutcomeButton y;
    public final OutcomeButton z;

    public iid0(FrameLayout frameLayout, TextView textView, TextView textView2, TextView textView3, TextView textView4, LinearLayout linearLayout, TextView textView5, TextView textView6, OutcomeButton outcomeButton, OutcomeButton outcomeButton2, OutcomeButton outcomeButton3, OutcomeButton outcomeButton4, ImageView imageView, GridLayout gridLayout, ImageView imageView2, View view, ListenableSpinner listenableSpinner, View view2, TextView textView7, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, LiveTimerTextView liveTimerTextView, ImageView imageView3, ImageView imageView4) {
        this.a = frameLayout;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = textView4;
        this.f = linearLayout;
        this.i = textView5;
        this.v = textView6;
        this.w = outcomeButton;
        this.y = outcomeButton2;
        this.z = outcomeButton3;
        this.A = outcomeButton4;
        this.B = imageView;
        this.C = gridLayout;
        this.D = imageView2;
        this.E = view;
        this.F = listenableSpinner;
        this.G = view2;
        this.H = textView7;
        this.I = appCompatImageView;
        this.J = appCompatImageView2;
        this.K = appCompatImageView3;
        this.L = appCompatImageView4;
        this.M = liveTimerTextView;
        this.N = imageView3;
        this.O = imageView4;
    }

    public static iid0 a(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z) {
        View viewInflate = layoutInflater.inflate(R.layout.spr_live_pre_match_item, viewGroup, false);
        if (z) {
            viewGroup.addView(viewInflate);
        }
        int i = R.id.away_team;
        TextView textView = (TextView) h5e.a(R.id.away_team, viewInflate);
        if (textView != null) {
            i = R.id.category_tournament_name;
            TextView textView2 = (TextView) h5e.a(R.id.category_tournament_name, viewInflate);
            if (textView2 != null) {
                i = R.id.comments_count;
                TextView textView3 = (TextView) h5e.a(R.id.comments_count, viewInflate);
                if (textView3 != null) {
                    i = R.id.home_team;
                    TextView textView4 = (TextView) h5e.a(R.id.home_team, viewInflate);
                    if (textView4 != null) {
                        i = R.id.left_content;
                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.left_content, viewInflate);
                        if (linearLayout != null) {
                            i = R.id.live;
                            TextView textView5 = (TextView) h5e.a(R.id.live, viewInflate);
                            if (textView5 != null) {
                                i = R.id.market_count;
                                TextView textView6 = (TextView) h5e.a(R.id.market_count, viewInflate);
                                if (textView6 != null) {
                                    i = R.id.o1;
                                    OutcomeButton outcomeButton = (OutcomeButton) h5e.a(R.id.o1, viewInflate);
                                    if (outcomeButton != null) {
                                        i = R.id.o2;
                                        OutcomeButton outcomeButton2 = (OutcomeButton) h5e.a(R.id.o2, viewInflate);
                                        if (outcomeButton2 != null) {
                                            i = R.id.o3;
                                            OutcomeButton outcomeButton3 = (OutcomeButton) h5e.a(R.id.o3, viewInflate);
                                            if (outcomeButton3 != null) {
                                                i = R.id.o4;
                                                OutcomeButton outcomeButton4 = (OutcomeButton) h5e.a(R.id.o4, viewInflate);
                                                if (outcomeButton4 != null) {
                                                    i = R.id.odds_boost_img;
                                                    ImageView imageView = (ImageView) h5e.a(R.id.odds_boost_img, viewInflate);
                                                    if (imageView != null) {
                                                        i = R.id.score;
                                                        GridLayout gridLayout = (GridLayout) h5e.a(R.id.score, viewInflate);
                                                        if (gridLayout != null) {
                                                            i = R.id.simulate_img;
                                                            ImageView imageView2 = (ImageView) h5e.a(R.id.simulate_img, viewInflate);
                                                            if (imageView2 != null) {
                                                                i = R.id.sport_divider_line;
                                                                View viewA = h5e.a(R.id.sport_divider_line, viewInflate);
                                                                if (viewA != null) {
                                                                    i = R.id.sports_grid;
                                                                    if (((LinearLayout) h5e.a(R.id.sports_grid, viewInflate)) != null) {
                                                                        i = R.id.sports_no_item_text;
                                                                        if (((TextView) h5e.a(R.id.sports_no_item_text, viewInflate)) != null) {
                                                                            i = R.id.sports_spinner;
                                                                            ListenableSpinner listenableSpinner = (ListenableSpinner) h5e.a(R.id.sports_spinner, viewInflate);
                                                                            if (listenableSpinner != null) {
                                                                                i = R.id.sports_spinner_bg;
                                                                                View viewA2 = h5e.a(R.id.sports_spinner_bg, viewInflate);
                                                                                if (viewA2 != null) {
                                                                                    i = R.id.sports_view_all_text;
                                                                                    TextView textView7 = (TextView) h5e.a(R.id.sports_view_all_text, viewInflate);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.sporty_fm;
                                                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.sporty_fm, viewInflate);
                                                                                        if (appCompatImageView != null) {
                                                                                            i = R.id.sporty_gift;
                                                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.sporty_gift, viewInflate);
                                                                                            if (appCompatImageView2 != null) {
                                                                                                i = R.id.sporty_tv;
                                                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.sporty_tv, viewInflate);
                                                                                                if (appCompatImageView3 != null) {
                                                                                                    i = R.id.stats_img;
                                                                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.stats_img, viewInflate);
                                                                                                    if (appCompatImageView4 != null) {
                                                                                                        i = R.id.time;
                                                                                                        LiveTimerTextView liveTimerTextView = (LiveTimerTextView) h5e.a(R.id.time, viewInflate);
                                                                                                        if (liveTimerTextView != null) {
                                                                                                            i = R.id.top_team_img;
                                                                                                            ImageView imageView3 = (ImageView) h5e.a(R.id.top_team_img, viewInflate);
                                                                                                            if (imageView3 != null) {
                                                                                                                i = R.id.virtual_img;
                                                                                                                ImageView imageView4 = (ImageView) h5e.a(R.id.virtual_img, viewInflate);
                                                                                                                if (imageView4 != null) {
                                                                                                                    return new iid0((FrameLayout) viewInflate, textView, textView2, textView3, textView4, linearLayout, textView5, textView6, outcomeButton, outcomeButton2, outcomeButton3, outcomeButton4, imageView, gridLayout, imageView2, viewA, listenableSpinner, viewA2, textView7, appCompatImageView, appCompatImageView2, appCompatImageView3, appCompatImageView4, liveTimerTextView, imageView3, imageView4);
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
        bmy.a("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
