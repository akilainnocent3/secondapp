package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.gridlayout.widget.GridLayout;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.event.LiveTimerTextView;
import com.sportybet.plugin.realsports.widget.ListenableSpinner;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class fid0 implements g6i0 {
    public final OutcomeButton A;
    public final OutcomeButton B;
    public final OutcomeButton C;
    public final OutcomeButton D;
    public final GridLayout E;
    public final ImageView F;
    public final ListenableSpinner G;
    public final View H;
    public final OutcomeButton I;
    public final TextView J;
    public final AppCompatImageView K;
    public final AppCompatImageView L;
    public final AppCompatImageView M;
    public final AppCompatImageView N;
    public final TextView O;
    public final TextView P;
    public final LiveTimerTextView Q;
    public final TextView R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final View d;
    public final Group e;
    public final ImageView f;
    public final TextView i;
    public final ImageView v;
    public final TextView w;
    public final AppCompatImageView y;
    public final ImageView z;

    public fid0(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, View view, Group group, ImageView imageView2, TextView textView2, ImageView imageView3, TextView textView3, AppCompatImageView appCompatImageView, ImageView imageView4, OutcomeButton outcomeButton, OutcomeButton outcomeButton2, OutcomeButton outcomeButton3, OutcomeButton outcomeButton4, GridLayout gridLayout, ImageView imageView5, ListenableSpinner listenableSpinner, View view2, OutcomeButton outcomeButton5, TextView textView4, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, AppCompatImageView appCompatImageView4, AppCompatImageView appCompatImageView5, TextView textView5, TextView textView6, LiveTimerTextView liveTimerTextView, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = view;
        this.e = group;
        this.f = imageView2;
        this.i = textView2;
        this.v = imageView3;
        this.w = textView3;
        this.y = appCompatImageView;
        this.z = imageView4;
        this.A = outcomeButton;
        this.B = outcomeButton2;
        this.C = outcomeButton3;
        this.D = outcomeButton4;
        this.E = gridLayout;
        this.F = imageView5;
        this.G = listenableSpinner;
        this.H = view2;
        this.I = outcomeButton5;
        this.J = textView4;
        this.K = appCompatImageView2;
        this.L = appCompatImageView3;
        this.M = appCompatImageView4;
        this.N = appCompatImageView5;
        this.O = textView5;
        this.P = textView6;
        this.Q = liveTimerTextView;
        this.R = textView7;
        this.S = textView8;
        this.T = textView9;
        this.U = textView10;
        this.V = textView11;
    }

    public static fid0 a(View view) {
        int i = R.id.anchor;
        if (((Space) h5e.a(R.id.anchor, view)) != null) {
            i = R.id.boost_sign;
            ImageView imageView = (ImageView) h5e.a(R.id.boost_sign, view);
            if (imageView != null) {
                i = R.id.chat_count;
                TextView textView = (TextView) h5e.a(R.id.chat_count, view);
                if (textView != null) {
                    i = R.id.dynamic_market_underline;
                    View viewA = h5e.a(R.id.dynamic_market_underline, view);
                    if (viewA != null) {
                        i = R.id.group_market_title;
                        Group group = (Group) h5e.a(R.id.group_market_title, view);
                        if (group != null) {
                            i = R.id.hot_image;
                            ImageView imageView2 = (ImageView) h5e.a(R.id.hot_image, view);
                            if (imageView2 != null) {
                                i = R.id.league;
                                TextView textView2 = (TextView) h5e.a(R.id.league, view);
                                if (textView2 != null) {
                                    i = R.id.live_virtual_sign;
                                    ImageView imageView3 = (ImageView) h5e.a(R.id.live_virtual_sign, view);
                                    if (imageView3 != null) {
                                        i = R.id.market_title;
                                        TextView textView3 = (TextView) h5e.a(R.id.market_title, view);
                                        if (textView3 != null) {
                                            i = R.id.market_title_icon;
                                            AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.market_title_icon, view);
                                            if (appCompatImageView != null) {
                                                i = R.id.match_tracker_img;
                                                ImageView imageView4 = (ImageView) h5e.a(R.id.match_tracker_img, view);
                                                if (imageView4 != null) {
                                                    i = R.id.o1;
                                                    OutcomeButton outcomeButton = (OutcomeButton) h5e.a(R.id.o1, view);
                                                    if (outcomeButton != null) {
                                                        i = R.id.o2;
                                                        OutcomeButton outcomeButton2 = (OutcomeButton) h5e.a(R.id.o2, view);
                                                        if (outcomeButton2 != null) {
                                                            i = R.id.o3;
                                                            OutcomeButton outcomeButton3 = (OutcomeButton) h5e.a(R.id.o3, view);
                                                            if (outcomeButton3 != null) {
                                                                i = R.id.o4;
                                                                OutcomeButton outcomeButton4 = (OutcomeButton) h5e.a(R.id.o4, view);
                                                                if (outcomeButton4 != null) {
                                                                    i = R.id.score;
                                                                    GridLayout gridLayout = (GridLayout) h5e.a(R.id.score, view);
                                                                    if (gridLayout != null) {
                                                                        i = R.id.simulate_img;
                                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.simulate_img, view);
                                                                        if (imageView5 != null) {
                                                                            i = R.id.specifier_spinner;
                                                                            ListenableSpinner listenableSpinner = (ListenableSpinner) h5e.a(R.id.specifier_spinner, view);
                                                                            if (listenableSpinner != null) {
                                                                                i = R.id.specifier_spinner_bg;
                                                                                View viewA2 = h5e.a(R.id.specifier_spinner_bg, view);
                                                                                if (viewA2 != null) {
                                                                                    i = R.id.specifier_spinner_lock;
                                                                                    OutcomeButton outcomeButton5 = (OutcomeButton) h5e.a(R.id.specifier_spinner_lock, view);
                                                                                    if (outcomeButton5 != null) {
                                                                                        i = R.id.specifier_title;
                                                                                        TextView textView4 = (TextView) h5e.a(R.id.specifier_title, view);
                                                                                        if (textView4 != null) {
                                                                                            i = R.id.sports_grid_space;
                                                                                            if (((Space) h5e.a(R.id.sports_grid_space, view)) != null) {
                                                                                                i = R.id.sporty_fm;
                                                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.sporty_fm, view);
                                                                                                if (appCompatImageView2 != null) {
                                                                                                    i = R.id.sporty_gift;
                                                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.sporty_gift, view);
                                                                                                    if (appCompatImageView3 != null) {
                                                                                                        i = R.id.sporty_tv;
                                                                                                        AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.sporty_tv, view);
                                                                                                        if (appCompatImageView4 != null) {
                                                                                                            i = R.id.stats_img;
                                                                                                            AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.stats_img, view);
                                                                                                            if (appCompatImageView5 != null) {
                                                                                                                i = R.id.team1;
                                                                                                                TextView textView5 = (TextView) h5e.a(R.id.team1, view);
                                                                                                                if (textView5 != null) {
                                                                                                                    i = R.id.team2;
                                                                                                                    TextView textView6 = (TextView) h5e.a(R.id.team2, view);
                                                                                                                    if (textView6 != null) {
                                                                                                                        i = R.id.time;
                                                                                                                        LiveTimerTextView liveTimerTextView = (LiveTimerTextView) h5e.a(R.id.time, view);
                                                                                                                        if (liveTimerTextView != null) {
                                                                                                                            i = R.id.title1;
                                                                                                                            TextView textView7 = (TextView) h5e.a(R.id.title1, view);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i = R.id.title2;
                                                                                                                                TextView textView8 = (TextView) h5e.a(R.id.title2, view);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    i = R.id.title3;
                                                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.title3, view);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i = R.id.title4;
                                                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.title4, view);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            i = R.id.view_all;
                                                                                                                                            TextView textView11 = (TextView) h5e.a(R.id.view_all, view);
                                                                                                                                            if (textView11 != null) {
                                                                                                                                                return new fid0((ConstraintLayout) view, imageView, textView, viewA, group, imageView2, textView2, imageView3, textView3, appCompatImageView, imageView4, outcomeButton, outcomeButton2, outcomeButton3, outcomeButton4, gridLayout, imageView5, listenableSpinner, viewA2, outcomeButton5, textView4, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, textView5, textView6, liveTimerTextView, textView7, textView8, textView9, textView10, textView11);
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
                                }
                            }
                        }
                    }
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.g6i0
    public final View getRoot() {
        return this.a;
    }
}
