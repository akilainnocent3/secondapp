package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class qu80 implements g6i0 {
    public final ImageView A;
    public final TextView B;
    public final TextView C;
    public final SeekBar D;
    public final ConstraintLayout E;
    public final MotionLayout F;
    public final ConstraintLayout G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final ImageView K;
    public final TextView L;
    public final SeekBar M;
    public final SeekBar N;
    public final ImageView O;
    public final ImageView P;
    public final ImageView Q;
    public final MotionLayout R;
    public final View S;
    public final View T;
    public final View U;
    public final ImageView V;
    public final ConstraintLayout W;
    public final View X;
    public final ComposeView Y;
    public final View Z;
    public final ConstraintLayout a;
    public final View a0;
    public final TextView b;
    public final View b0;
    public final MotionLayout c;
    public final View c0;
    public final ConstraintLayout d;
    public final View d0;
    public final TextView e;
    public final View e0;
    public final ComposeView f;
    public final View f0;
    public final View g0;
    public final View h0;
    public final View i;
    public final View i0;
    public final ConstraintLayout j0;
    public final ConstraintLayout k0;
    public final ConstraintLayout l0;
    public final ConstraintLayout m0;
    public final View v;
    public final ImageView w;
    public final ImageView y;
    public final CardView z;

    public qu80(ConstraintLayout constraintLayout, TextView textView, MotionLayout motionLayout, ConstraintLayout constraintLayout2, TextView textView2, ComposeView composeView, View view, View view2, ImageView imageView, ImageView imageView2, CardView cardView, ImageView imageView3, TextView textView3, TextView textView4, SeekBar seekBar, ConstraintLayout constraintLayout3, MotionLayout motionLayout2, ConstraintLayout constraintLayout4, TextView textView5, TextView textView6, TextView textView7, ImageView imageView4, TextView textView8, SeekBar seekBar2, SeekBar seekBar3, ImageView imageView5, ImageView imageView6, ImageView imageView7, MotionLayout motionLayout3, View view3, View view4, View view5, ImageView imageView8, ConstraintLayout constraintLayout5, View view6, ComposeView composeView2, View view7, View view8, View view9, View view10, View view11, View view12, View view13, View view14, View view15, View view16, ConstraintLayout constraintLayout6, ConstraintLayout constraintLayout7, ConstraintLayout constraintLayout8, ConstraintLayout constraintLayout9) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = motionLayout;
        this.d = constraintLayout2;
        this.e = textView2;
        this.f = composeView;
        this.i = view;
        this.v = view2;
        this.w = imageView;
        this.y = imageView2;
        this.z = cardView;
        this.A = imageView3;
        this.B = textView3;
        this.C = textView4;
        this.D = seekBar;
        this.E = constraintLayout3;
        this.F = motionLayout2;
        this.G = constraintLayout4;
        this.H = textView5;
        this.I = textView6;
        this.J = textView7;
        this.K = imageView4;
        this.L = textView8;
        this.M = seekBar2;
        this.N = seekBar3;
        this.O = imageView5;
        this.P = imageView6;
        this.Q = imageView7;
        this.R = motionLayout3;
        this.S = view3;
        this.T = view4;
        this.U = view5;
        this.V = imageView8;
        this.W = constraintLayout5;
        this.X = view6;
        this.Y = composeView2;
        this.Z = view7;
        this.a0 = view8;
        this.b0 = view9;
        this.c0 = view10;
        this.d0 = view11;
        this.e0 = view12;
        this.f0 = view13;
        this.g0 = view14;
        this.h0 = view15;
        this.i0 = view16;
        this.j0 = constraintLayout6;
        this.k0 = constraintLayout7;
        this.l0 = constraintLayout8;
        this.m0 = constraintLayout9;
    }

    public static qu80 a(LayoutInflater layoutInflater, LinearLayout linearLayout) {
        View viewInflate = layoutInflater.inflate(R.layout.sh_multiplier_v2, (ViewGroup) linearLayout, false);
        linearLayout.addView(viewInflate);
        int i = R.id.coefficient;
        TextView textView = (TextView) h5e.a(R.id.coefficient, viewInflate);
        if (textView != null) {
            i = R.id.container;
            MotionLayout motionLayout = (MotionLayout) h5e.a(R.id.container, viewInflate);
            if (motionLayout != null) {
                i = R.id.flew_layout;
                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.flew_layout, viewInflate);
                if (constraintLayout != null) {
                    i = R.id.flew_text;
                    TextView textView2 = (TextView) h5e.a(R.id.flew_text, viewInflate);
                    if (textView2 != null) {
                        i = R.id.hero;
                        ComposeView composeView = (ComposeView) h5e.a(R.id.hero, viewInflate);
                        if (composeView != null) {
                            i = R.id.hero_view_1;
                            View viewA = h5e.a(R.id.hero_view_1, viewInflate);
                            if (viewA != null) {
                                i = R.id.hero_view_2;
                                View viewA2 = h5e.a(R.id.hero_view_2, viewInflate);
                                if (viewA2 != null) {
                                    i = R.id.ic_cloud_active;
                                    ImageView imageView = (ImageView) h5e.a(R.id.ic_cloud_active, viewInflate);
                                    if (imageView != null) {
                                        i = R.id.ic_cloud_next;
                                        ImageView imageView2 = (ImageView) h5e.a(R.id.ic_cloud_next, viewInflate);
                                        if (imageView2 != null) {
                                            i = R.id.ic_rain_timer;
                                            CardView cardView = (CardView) h5e.a(R.id.ic_rain_timer, viewInflate);
                                            if (cardView != null) {
                                                i = R.id.logo;
                                                ImageView imageView3 = (ImageView) h5e.a(R.id.logo, viewInflate);
                                                if (imageView3 != null) {
                                                    i = R.id.mini_coefficient;
                                                    TextView textView3 = (TextView) h5e.a(R.id.mini_coefficient, viewInflate);
                                                    if (textView3 != null) {
                                                        i = R.id.mini_powering;
                                                        TextView textView4 = (TextView) h5e.a(R.id.mini_powering, viewInflate);
                                                        if (textView4 != null) {
                                                            i = R.id.mini_seekbar;
                                                            SeekBar seekBar = (SeekBar) h5e.a(R.id.mini_seekbar, viewInflate);
                                                            if (seekBar != null) {
                                                                i = R.id.mini_waiting_text_layout;
                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.mini_waiting_text_layout, viewInflate);
                                                                if (constraintLayout2 != null) {
                                                                    i = R.id.motionLayout;
                                                                    MotionLayout motionLayout2 = (MotionLayout) h5e.a(R.id.motionLayout, viewInflate);
                                                                    if (motionLayout2 != null) {
                                                                        i = R.id.ongoing;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.ongoing, viewInflate);
                                                                        if (constraintLayout3 != null) {
                                                                            i = R.id.payout_error;
                                                                            TextView textView5 = (TextView) h5e.a(R.id.payout_error, viewInflate);
                                                                            if (textView5 != null) {
                                                                                i = R.id.powering;
                                                                                TextView textView6 = (TextView) h5e.a(R.id.powering, viewInflate);
                                                                                if (textView6 != null) {
                                                                                    i = R.id.powering_v1;
                                                                                    TextView textView7 = (TextView) h5e.a(R.id.powering_v1, viewInflate);
                                                                                    if (textView7 != null) {
                                                                                        i = R.id.progressBar1;
                                                                                        ImageView imageView4 = (ImageView) h5e.a(R.id.progressBar1, viewInflate);
                                                                                        if (imageView4 != null) {
                                                                                            i = R.id.rain_timer;
                                                                                            TextView textView8 = (TextView) h5e.a(R.id.rain_timer, viewInflate);
                                                                                            if (textView8 != null) {
                                                                                                i = R.id.seekbar;
                                                                                                SeekBar seekBar2 = (SeekBar) h5e.a(R.id.seekbar, viewInflate);
                                                                                                if (seekBar2 != null) {
                                                                                                    i = R.id.seekbar_v1;
                                                                                                    SeekBar seekBar3 = (SeekBar) h5e.a(R.id.seekbar_v1, viewInflate);
                                                                                                    if (seekBar3 != null) {
                                                                                                        i = R.id.sh;
                                                                                                        ImageView imageView5 = (ImageView) h5e.a(R.id.sh, viewInflate);
                                                                                                        if (imageView5 != null) {
                                                                                                            i = R.id.shooting_star;
                                                                                                            ImageView imageView6 = (ImageView) h5e.a(R.id.shooting_star, viewInflate);
                                                                                                            if (imageView6 != null) {
                                                                                                                i = R.id.shooting_star1;
                                                                                                                ImageView imageView7 = (ImageView) h5e.a(R.id.shooting_star1, viewInflate);
                                                                                                                if (imageView7 != null) {
                                                                                                                    i = R.id.shooting_star_layout;
                                                                                                                    MotionLayout motionLayout3 = (MotionLayout) h5e.a(R.id.shooting_star_layout, viewInflate);
                                                                                                                    if (motionLayout3 != null) {
                                                                                                                        i = R.id.shooting_view;
                                                                                                                        View viewA3 = h5e.a(R.id.shooting_view, viewInflate);
                                                                                                                        if (viewA3 != null) {
                                                                                                                            i = R.id.shooting_view1;
                                                                                                                            View viewA4 = h5e.a(R.id.shooting_view1, viewInflate);
                                                                                                                            if (viewA4 != null) {
                                                                                                                                i = R.id.shooting_view2;
                                                                                                                                View viewA5 = h5e.a(R.id.shooting_view2, viewInflate);
                                                                                                                                if (viewA5 != null) {
                                                                                                                                    i = R.id.snow_logo;
                                                                                                                                    ImageView imageView8 = (ImageView) h5e.a(R.id.snow_logo, viewInflate);
                                                                                                                                    if (imageView8 != null) {
                                                                                                                                        i = R.id.space;
                                                                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.space, viewInflate);
                                                                                                                                        if (constraintLayout4 != null) {
                                                                                                                                            i = R.id.top_percent_waiting;
                                                                                                                                            View viewA6 = h5e.a(R.id.top_percent_waiting, viewInflate);
                                                                                                                                            if (viewA6 != null) {
                                                                                                                                                i = R.id.valentine;
                                                                                                                                                ComposeView composeView2 = (ComposeView) h5e.a(R.id.valentine, viewInflate);
                                                                                                                                                if (composeView2 != null) {
                                                                                                                                                    i = R.id.view_bottom;
                                                                                                                                                    View viewA7 = h5e.a(R.id.view_bottom, viewInflate);
                                                                                                                                                    if (viewA7 != null) {
                                                                                                                                                        i = R.id.view_bottom1;
                                                                                                                                                        View viewA8 = h5e.a(R.id.view_bottom1, viewInflate);
                                                                                                                                                        if (viewA8 != null) {
                                                                                                                                                            i = R.id.view_bottom2;
                                                                                                                                                            View viewA9 = h5e.a(R.id.view_bottom2, viewInflate);
                                                                                                                                                            if (viewA9 != null) {
                                                                                                                                                                i = R.id.view_cashout;
                                                                                                                                                                View viewA10 = h5e.a(R.id.view_cashout, viewInflate);
                                                                                                                                                                if (viewA10 != null) {
                                                                                                                                                                    i = R.id.view_ongoing;
                                                                                                                                                                    View viewA11 = h5e.a(R.id.view_ongoing, viewInflate);
                                                                                                                                                                    if (viewA11 != null) {
                                                                                                                                                                        i = R.id.view_top_powering;
                                                                                                                                                                        View viewA12 = h5e.a(R.id.view_top_powering, viewInflate);
                                                                                                                                                                        if (viewA12 != null) {
                                                                                                                                                                            i = R.id.view_top_s_logo;
                                                                                                                                                                            View viewA13 = h5e.a(R.id.view_top_s_logo, viewInflate);
                                                                                                                                                                            if (viewA13 != null) {
                                                                                                                                                                                i = R.id.view_waiting;
                                                                                                                                                                                View viewA14 = h5e.a(R.id.view_waiting, viewInflate);
                                                                                                                                                                                if (viewA14 != null) {
                                                                                                                                                                                    i = R.id.view_waiting1;
                                                                                                                                                                                    View viewA15 = h5e.a(R.id.view_waiting1, viewInflate);
                                                                                                                                                                                    if (viewA15 != null) {
                                                                                                                                                                                        i = R.id.view_waiting_v1;
                                                                                                                                                                                        View viewA16 = h5e.a(R.id.view_waiting_v1, viewInflate);
                                                                                                                                                                                        if (viewA16 != null) {
                                                                                                                                                                                            i = R.id.waiting;
                                                                                                                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.waiting, viewInflate);
                                                                                                                                                                                            if (constraintLayout5 != null) {
                                                                                                                                                                                                i = R.id.waiting_text_layout;
                                                                                                                                                                                                ConstraintLayout constraintLayout6 = (ConstraintLayout) h5e.a(R.id.waiting_text_layout, viewInflate);
                                                                                                                                                                                                if (constraintLayout6 != null) {
                                                                                                                                                                                                    i = R.id.waiting_text_layout_v1;
                                                                                                                                                                                                    ConstraintLayout constraintLayout7 = (ConstraintLayout) h5e.a(R.id.waiting_text_layout_v1, viewInflate);
                                                                                                                                                                                                    if (constraintLayout7 != null) {
                                                                                                                                                                                                        i = R.id.waiting_v1;
                                                                                                                                                                                                        ConstraintLayout constraintLayout8 = (ConstraintLayout) h5e.a(R.id.waiting_v1, viewInflate);
                                                                                                                                                                                                        if (constraintLayout8 != null) {
                                                                                                                                                                                                            return new qu80((ConstraintLayout) viewInflate, textView, motionLayout, constraintLayout, textView2, composeView, viewA, viewA2, imageView, imageView2, cardView, imageView3, textView3, textView4, seekBar, constraintLayout2, motionLayout2, constraintLayout3, textView5, textView6, textView7, imageView4, textView8, seekBar2, seekBar3, imageView5, imageView6, imageView7, motionLayout3, viewA3, viewA4, viewA5, imageView8, constraintLayout4, viewA6, composeView2, viewA7, viewA8, viewA9, viewA10, viewA11, viewA12, viewA13, viewA14, viewA15, viewA16, constraintLayout5, constraintLayout6, constraintLayout7, constraintLayout8);
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
