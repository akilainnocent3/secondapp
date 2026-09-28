package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.AspectRatioRelativeLayout;
import com.sporty.android.common_ui.widgets.LoadingViewNew;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes4.dex */
public final class ggd0 implements g6i0 {
    public final AspectRatioRelativeLayout A;
    public final TextView B;
    public final TextView C;
    public final AppCompatImageView D;
    public final RelativeLayout E;
    public final TextView F;
    public final AspectRatioRelativeLayout G;
    public final ImageButton H;
    public final ImageButton I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final RelativeLayout M;
    public final RelativeLayout N;
    public final RelativeLayout O;
    public final TextView P;
    public final ImageView Q;
    public final TextView R;
    public final TextView S;
    public final ImageView T;
    public final TextView U;
    public final TextView V;
    public final TextView W;
    public final TextView X;
    public final TextView Y;
    public final TextView Z;
    public final FrameLayout a;
    public final FrameLayout a0;
    public final TextView b;
    public final View b0;
    public final TextView c;
    public final AppCompatTextView c0;
    public final ImageButton d;
    public final Button d0;
    public final Button e;
    public final ComposeView e0;
    public final ImageView f;
    public final TextView f0;
    public final TextView g0;
    public final TextView h0;
    public final Button i;
    public final TextView i0;
    public final Button j0;
    public final FrameLayout k0;
    public final ConstraintLayout l0;
    public final LoadingViewNew m0;
    public final TextView v;
    public final AspectRatioRelativeLayout w;
    public final RelativeLayout y;
    public final Button z;

    public ggd0(FrameLayout frameLayout, TextView textView, TextView textView2, ImageButton imageButton, Button button, ImageView imageView, Button button2, TextView textView3, AspectRatioRelativeLayout aspectRatioRelativeLayout, RelativeLayout relativeLayout, Button button3, AspectRatioRelativeLayout aspectRatioRelativeLayout2, TextView textView4, TextView textView5, AppCompatImageView appCompatImageView, RelativeLayout relativeLayout2, TextView textView6, AspectRatioRelativeLayout aspectRatioRelativeLayout3, ImageButton imageButton2, ImageButton imageButton3, TextView textView7, TextView textView8, TextView textView9, RelativeLayout relativeLayout3, RelativeLayout relativeLayout4, RelativeLayout relativeLayout5, TextView textView10, ImageView imageView2, TextView textView11, TextView textView12, ImageView imageView3, TextView textView13, TextView textView14, TextView textView15, TextView textView16, TextView textView17, TextView textView18, FrameLayout frameLayout2, View view, AppCompatTextView appCompatTextView, Button button4, ComposeView composeView, TextView textView19, TextView textView20, TextView textView21, TextView textView22, Button button5, FrameLayout frameLayout3, ConstraintLayout constraintLayout, LoadingViewNew loadingViewNew) {
        this.a = frameLayout;
        this.b = textView;
        this.c = textView2;
        this.d = imageButton;
        this.e = button;
        this.f = imageView;
        this.i = button2;
        this.v = textView3;
        this.w = aspectRatioRelativeLayout;
        this.y = relativeLayout;
        this.z = button3;
        this.A = aspectRatioRelativeLayout2;
        this.B = textView4;
        this.C = textView5;
        this.D = appCompatImageView;
        this.E = relativeLayout2;
        this.F = textView6;
        this.G = aspectRatioRelativeLayout3;
        this.H = imageButton2;
        this.I = imageButton3;
        this.J = textView7;
        this.K = textView8;
        this.L = textView9;
        this.M = relativeLayout3;
        this.N = relativeLayout4;
        this.O = relativeLayout5;
        this.P = textView10;
        this.Q = imageView2;
        this.R = textView11;
        this.S = textView12;
        this.T = imageView3;
        this.U = textView13;
        this.V = textView14;
        this.W = textView15;
        this.X = textView16;
        this.Y = textView17;
        this.Z = textView18;
        this.a0 = frameLayout2;
        this.b0 = view;
        this.c0 = appCompatTextView;
        this.d0 = button4;
        this.e0 = composeView;
        this.f0 = textView19;
        this.g0 = textView20;
        this.h0 = textView21;
        this.i0 = textView22;
        this.j0 = button5;
        this.k0 = frameLayout3;
        this.l0 = constraintLayout;
        this.m0 = loadingViewNew;
    }

    public static ggd0 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.spr_activity_winning, (ViewGroup) null, false);
        int i = R.id.amount;
        TextView textView = (TextView) h5e.a(R.id.amount, viewInflate);
        if (textView != null) {
            i = R.id.anchor;
            if (((Space) h5e.a(R.id.anchor, viewInflate)) != null) {
                i = R.id.bingo_amount;
                TextView textView2 = (TextView) h5e.a(R.id.bingo_amount, viewInflate);
                if (textView2 != null) {
                    i = R.id.bingo_close;
                    ImageButton imageButton = (ImageButton) h5e.a(R.id.bingo_close, viewInflate);
                    if (imageButton != null) {
                        i = R.id.bingo_detail;
                        Button button = (Button) h5e.a(R.id.bingo_detail, viewInflate);
                        if (button != null) {
                            i = R.id.bingo_img;
                            ImageView imageView = (ImageView) h5e.a(R.id.bingo_img, viewInflate);
                            if (imageView != null) {
                                i = R.id.bingo_share;
                                Button button2 = (Button) h5e.a(R.id.bingo_share, viewInflate);
                                if (button2 != null) {
                                    i = R.id.bingo_type;
                                    TextView textView3 = (TextView) h5e.a(R.id.bingo_type, viewInflate);
                                    if (textView3 != null) {
                                        i = R.id.bingo_winning;
                                        AspectRatioRelativeLayout aspectRatioRelativeLayout = (AspectRatioRelativeLayout) h5e.a(R.id.bingo_winning, viewInflate);
                                        if (aspectRatioRelativeLayout != null) {
                                            i = R.id.card_container;
                                            RelativeLayout relativeLayout = (RelativeLayout) h5e.a(R.id.card_container, viewInflate);
                                            if (relativeLayout != null) {
                                                i = R.id.cash_gift_bet;
                                                Button button3 = (Button) h5e.a(R.id.cash_gift_bet, viewInflate);
                                                if (button3 != null) {
                                                    i = R.id.cash_gift_bottom_layout;
                                                    AspectRatioRelativeLayout aspectRatioRelativeLayout2 = (AspectRatioRelativeLayout) h5e.a(R.id.cash_gift_bottom_layout, viewInflate);
                                                    if (aspectRatioRelativeLayout2 != null) {
                                                        i = R.id.cash_gift_pop_amount;
                                                        TextView textView4 = (TextView) h5e.a(R.id.cash_gift_pop_amount, viewInflate);
                                                        if (textView4 != null) {
                                                            i = R.id.cash_gift_pop_bet;
                                                            TextView textView5 = (TextView) h5e.a(R.id.cash_gift_pop_bet, viewInflate);
                                                            if (textView5 != null) {
                                                                i = R.id.cash_gift_pop_close;
                                                                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.cash_gift_pop_close, viewInflate);
                                                                if (appCompatImageView != null) {
                                                                    i = R.id.cash_gift_pop_root;
                                                                    RelativeLayout relativeLayout2 = (RelativeLayout) h5e.a(R.id.cash_gift_pop_root, viewInflate);
                                                                    if (relativeLayout2 != null) {
                                                                        i = R.id.cash_gift_pop_title;
                                                                        if (((TextView) h5e.a(R.id.cash_gift_pop_title, viewInflate)) != null) {
                                                                            i = R.id.cash_gift_pop_view;
                                                                            TextView textView6 = (TextView) h5e.a(R.id.cash_gift_pop_view, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i = R.id.cash_gift_value_container;
                                                                                AspectRatioRelativeLayout aspectRatioRelativeLayout3 = (AspectRatioRelativeLayout) h5e.a(R.id.cash_gift_value_container, viewInflate);
                                                                                if (aspectRatioRelativeLayout3 != null) {
                                                                                    i = R.id.close;
                                                                                    ImageButton imageButton2 = (ImageButton) h5e.a(R.id.close, viewInflate);
                                                                                    if (imageButton2 != null) {
                                                                                        i = R.id.close_gift;
                                                                                        ImageButton imageButton3 = (ImageButton) h5e.a(R.id.close_gift, viewInflate);
                                                                                        if (imageButton3 != null) {
                                                                                            i = R.id.detail;
                                                                                            TextView textView7 = (TextView) h5e.a(R.id.detail, viewInflate);
                                                                                            if (textView7 != null) {
                                                                                                i = R.id.g_amount;
                                                                                                TextView textView8 = (TextView) h5e.a(R.id.g_amount, viewInflate);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.g_amount2;
                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.g_amount2, viewInflate);
                                                                                                    if (textView9 != null) {
                                                                                                        i = R.id.gift;
                                                                                                        RelativeLayout relativeLayout3 = (RelativeLayout) h5e.a(R.id.gift, viewInflate);
                                                                                                        if (relativeLayout3 != null) {
                                                                                                            i = R.id.gift_amount;
                                                                                                            RelativeLayout relativeLayout4 = (RelativeLayout) h5e.a(R.id.gift_amount, viewInflate);
                                                                                                            if (relativeLayout4 != null) {
                                                                                                                i = R.id.gift_amount2;
                                                                                                                RelativeLayout relativeLayout5 = (RelativeLayout) h5e.a(R.id.gift_amount2, viewInflate);
                                                                                                                if (relativeLayout5 != null) {
                                                                                                                    i = R.id.gift_amount_hint;
                                                                                                                    TextView textView10 = (TextView) h5e.a(R.id.gift_amount_hint, viewInflate);
                                                                                                                    if (textView10 != null) {
                                                                                                                        i = R.id.gift_cup;
                                                                                                                        ImageView imageView2 = (ImageView) h5e.a(R.id.gift_cup, viewInflate);
                                                                                                                        if (imageView2 != null) {
                                                                                                                            i = R.id.gift_end;
                                                                                                                            if (((TextView) h5e.a(R.id.gift_end, viewInflate)) != null) {
                                                                                                                                i = R.id.gift_end2;
                                                                                                                                if (((TextView) h5e.a(R.id.gift_end2, viewInflate)) != null) {
                                                                                                                                    i = R.id.gift_hint;
                                                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.gift_hint, viewInflate);
                                                                                                                                    if (textView11 != null) {
                                                                                                                                        i = R.id.gift_source;
                                                                                                                                        TextView textView12 = (TextView) h5e.a(R.id.gift_source, viewInflate);
                                                                                                                                        if (textView12 != null) {
                                                                                                                                            i = R.id.gift_source_container;
                                                                                                                                            if (((RelativeLayout) h5e.a(R.id.gift_source_container, viewInflate)) != null) {
                                                                                                                                                i = R.id.img;
                                                                                                                                                ImageView imageView3 = (ImageView) h5e.a(R.id.img, viewInflate);
                                                                                                                                                if (imageView3 != null) {
                                                                                                                                                    i = R.id.percent;
                                                                                                                                                    TextView textView13 = (TextView) h5e.a(R.id.percent, viewInflate);
                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                        i = R.id.pop_pushtext;
                                                                                                                                                        TextView textView14 = (TextView) h5e.a(R.id.pop_pushtext, viewInflate);
                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                            i = R.id.prefix;
                                                                                                                                                            TextView textView15 = (TextView) h5e.a(R.id.prefix, viewInflate);
                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                i = R.id.prefix2;
                                                                                                                                                                TextView textView16 = (TextView) h5e.a(R.id.prefix2, viewInflate);
                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                    i = R.id.prefix3;
                                                                                                                                                                    TextView textView17 = (TextView) h5e.a(R.id.prefix3, viewInflate);
                                                                                                                                                                    if (textView17 != null) {
                                                                                                                                                                        i = R.id.received_title;
                                                                                                                                                                        TextView textView18 = (TextView) h5e.a(R.id.received_title, viewInflate);
                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                            i = R.id.remix_bet;
                                                                                                                                                                            FrameLayout frameLayout = (FrameLayout) h5e.a(R.id.remix_bet, viewInflate);
                                                                                                                                                                            if (frameLayout != null) {
                                                                                                                                                                                i = R.id.remix_bet_new_feature_dot;
                                                                                                                                                                                View viewA = h5e.a(R.id.remix_bet_new_feature_dot, viewInflate);
                                                                                                                                                                                if (viewA != null) {
                                                                                                                                                                                    i = R.id.remix_bet_text;
                                                                                                                                                                                    AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.remix_bet_text, viewInflate);
                                                                                                                                                                                    if (appCompatTextView != null) {
                                                                                                                                                                                        i = R.id.share;
                                                                                                                                                                                        Button button4 = (Button) h5e.a(R.id.share, viewInflate);
                                                                                                                                                                                        if (button4 != null) {
                                                                                                                                                                                            i = R.id.soundIconComposeView;
                                                                                                                                                                                            ComposeView composeView = (ComposeView) h5e.a(R.id.soundIconComposeView, viewInflate);
                                                                                                                                                                                            if (composeView != null) {
                                                                                                                                                                                                i = R.id.space2;
                                                                                                                                                                                                if (((Space) h5e.a(R.id.space2, viewInflate)) != null) {
                                                                                                                                                                                                    i = R.id.title;
                                                                                                                                                                                                    TextView textView19 = (TextView) h5e.a(R.id.title, viewInflate);
                                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                                        i = R.id.type;
                                                                                                                                                                                                        TextView textView20 = (TextView) h5e.a(R.id.type, viewInflate);
                                                                                                                                                                                                        if (textView20 != null) {
                                                                                                                                                                                                            i = R.id.verify_code_content;
                                                                                                                                                                                                            TextView textView21 = (TextView) h5e.a(R.id.verify_code_content, viewInflate);
                                                                                                                                                                                                            if (textView21 != null) {
                                                                                                                                                                                                                i = R.id.verify_code_title;
                                                                                                                                                                                                                TextView textView22 = (TextView) h5e.a(R.id.verify_code_title, viewInflate);
                                                                                                                                                                                                                if (textView22 != null) {
                                                                                                                                                                                                                    i = R.id.view_gift;
                                                                                                                                                                                                                    Button button5 = (Button) h5e.a(R.id.view_gift, viewInflate);
                                                                                                                                                                                                                    if (button5 != null) {
                                                                                                                                                                                                                        FrameLayout frameLayout2 = (FrameLayout) viewInflate;
                                                                                                                                                                                                                        i = R.id.winning_container;
                                                                                                                                                                                                                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.winning_container, viewInflate);
                                                                                                                                                                                                                        if (constraintLayout != null) {
                                                                                                                                                                                                                            i = R.id.winning_loading_view;
                                                                                                                                                                                                                            LoadingViewNew loadingViewNew = (LoadingViewNew) h5e.a(R.id.winning_loading_view, viewInflate);
                                                                                                                                                                                                                            if (loadingViewNew != null) {
                                                                                                                                                                                                                                return new ggd0(frameLayout2, textView, textView2, imageButton, button, imageView, button2, textView3, aspectRatioRelativeLayout, relativeLayout, button3, aspectRatioRelativeLayout2, textView4, textView5, appCompatImageView, relativeLayout2, textView6, aspectRatioRelativeLayout3, imageButton2, imageButton3, textView7, textView8, textView9, relativeLayout3, relativeLayout4, relativeLayout5, textView10, imageView2, textView11, textView12, imageView3, textView13, textView14, textView15, textView16, textView17, textView18, frameLayout, viewA, appCompatTextView, button4, composeView, textView19, textView20, textView21, textView22, button5, frameLayout2, constraintLayout, loadingViewNew);
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
