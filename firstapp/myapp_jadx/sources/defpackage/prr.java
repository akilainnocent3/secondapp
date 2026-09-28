package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class prr implements g6i0 {
    public final LinearLayout A;
    public final LinearLayout B;
    public final TextView C;
    public final AppCompatImageView D;
    public final TextView E;
    public final TextView F;
    public final TextView G;
    public final TextView H;
    public final TextView I;
    public final TextView J;
    public final TextView K;
    public final CardView a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final ConstraintLayout e;
    public final CardView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public prr(CardView cardView, TextView textView, TextView textView2, TextView textView3, ConstraintLayout constraintLayout, CardView cardView2, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, LinearLayout linearLayout, LinearLayout linearLayout2, TextView textView9, AppCompatImageView appCompatImageView, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, TextView textView16) {
        this.a = cardView;
        this.b = textView;
        this.c = textView2;
        this.d = textView3;
        this.e = constraintLayout;
        this.f = cardView2;
        this.i = textView4;
        this.v = textView5;
        this.w = textView6;
        this.y = textView7;
        this.z = textView8;
        this.A = linearLayout;
        this.B = linearLayout2;
        this.C = textView9;
        this.D = appCompatImageView;
        this.E = textView10;
        this.F = textView11;
        this.G = textView12;
        this.H = textView13;
        this.I = textView14;
        this.J = textView15;
        this.K = textView16;
    }

    public static prr a(View view) {
        int i = R.id.at;
        TextView textView = (TextView) h5e.a(R.id.at, view);
        if (textView != null) {
            i = R.id.bet_amount;
            TextView textView2 = (TextView) h5e.a(R.id.bet_amount, view);
            if (textView2 != null) {
                i = R.id.bet_type;
                TextView textView3 = (TextView) h5e.a(R.id.bet_type, view);
                if (textView3 != null) {
                    i = R.id.card;
                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.card, view);
                    if (constraintLayout != null) {
                        CardView cardView = (CardView) view;
                        i = R.id.coeff;
                        TextView textView4 = (TextView) h5e.a(R.id.coeff, view);
                        if (textView4 != null) {
                            i = R.id.coeff_rocket;
                            TextView textView5 = (TextView) h5e.a(R.id.coeff_rocket, view);
                            if (textView5 != null) {
                                i = R.id.currency;
                                TextView textView6 = (TextView) h5e.a(R.id.currency, view);
                                if (textView6 != null) {
                                    i = R.id.gift_amount;
                                    TextView textView7 = (TextView) h5e.a(R.id.gift_amount, view);
                                    if (textView7 != null) {
                                        i = R.id.gift_amount2;
                                        TextView textView8 = (TextView) h5e.a(R.id.gift_amount2, view);
                                        if (textView8 != null) {
                                            i = R.id.image1;
                                            if (((ImageView) h5e.a(R.id.image1, view)) != null) {
                                                i = R.id.image2;
                                                if (((ImageView) h5e.a(R.id.image2, view)) != null) {
                                                    i = R.id.layout;
                                                    if (((LinearLayout) h5e.a(R.id.layout, view)) != null) {
                                                        i = R.id.layout_gift_amt;
                                                        LinearLayout linearLayout = (LinearLayout) h5e.a(R.id.layout_gift_amt, view);
                                                        if (linearLayout != null) {
                                                            i = R.id.layout_gift_amt2;
                                                            LinearLayout linearLayout2 = (LinearLayout) h5e.a(R.id.layout_gift_amt2, view);
                                                            if (linearLayout2 != null) {
                                                                i = R.id.message;
                                                                TextView textView9 = (TextView) h5e.a(R.id.message, view);
                                                                if (textView9 != null) {
                                                                    i = R.id.rocket_image;
                                                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.rocket_image, view);
                                                                    if (appCompatImageView != null) {
                                                                        i = R.id.total_amount;
                                                                        TextView textView10 = (TextView) h5e.a(R.id.total_amount, view);
                                                                        if (textView10 != null) {
                                                                            i = R.id.total_amount2;
                                                                            TextView textView11 = (TextView) h5e.a(R.id.total_amount2, view);
                                                                            if (textView11 != null) {
                                                                                i = R.id.win_amount;
                                                                                TextView textView12 = (TextView) h5e.a(R.id.win_amount, view);
                                                                                if (textView12 != null) {
                                                                                    i = R.id.win_amount2;
                                                                                    TextView textView13 = (TextView) h5e.a(R.id.win_amount2, view);
                                                                                    if (textView13 != null) {
                                                                                        i = R.id.with;
                                                                                        TextView textView14 = (TextView) h5e.a(R.id.with, view);
                                                                                        if (textView14 != null) {
                                                                                            i = R.id.you_win_text;
                                                                                            TextView textView15 = (TextView) h5e.a(R.id.you_win_text, view);
                                                                                            if (textView15 != null) {
                                                                                                i = R.id.you_win_text2;
                                                                                                TextView textView16 = (TextView) h5e.a(R.id.you_win_text2, view);
                                                                                                if (textView16 != null) {
                                                                                                    return new prr(cardView, textView, textView2, textView3, constraintLayout, cardView, textView4, textView5, textView6, textView7, textView8, linearLayout, linearLayout2, textView9, appCompatImageView, textView10, textView11, textView12, textView13, textView14, textView15, textView16);
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
