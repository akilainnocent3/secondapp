package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class bx80 implements g6i0 {
    public final CardView a;
    public final AppCompatTextView b;
    public final AppCompatTextView c;
    public final ConstraintLayout d;
    public final AppCompatTextView e;
    public final AppCompatTextView f;
    public final AppCompatImageView i;
    public final AppCompatTextView v;
    public final AppCompatTextView w;
    public final ImageView y;
    public final AppCompatTextView z;

    public bx80(CardView cardView, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout, AppCompatTextView appCompatTextView3, AppCompatTextView appCompatTextView4, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView5, AppCompatTextView appCompatTextView6, ImageView imageView, AppCompatTextView appCompatTextView7) {
        this.a = cardView;
        this.b = appCompatTextView;
        this.c = appCompatTextView2;
        this.d = constraintLayout;
        this.e = appCompatTextView3;
        this.f = appCompatTextView4;
        this.i = appCompatImageView;
        this.v = appCompatTextView5;
        this.w = appCompatTextView6;
        this.y = imageView;
        this.z = appCompatTextView7;
    }

    public static bx80 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sh_top_wins_item_v2, viewGroup, false);
        int i = R.id.cashout_amount;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.cashout_amount, viewInflate);
        if (appCompatTextView != null) {
            i = R.id.cashout_layout;
            if (((ConstraintLayout) h5e.a(R.id.cashout_layout, viewInflate)) != null) {
                i = R.id.cashout_text;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.cashout_text, viewInflate);
                if (appCompatTextView2 != null) {
                    i = R.id.chat_layout;
                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.chat_layout, viewInflate);
                    if (constraintLayout != null) {
                        i = R.id.coefficient_amount;
                        AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.coefficient_amount, viewInflate);
                        if (appCompatTextView3 != null) {
                            i = R.id.coefficient_layout;
                            if (((ConstraintLayout) h5e.a(R.id.coefficient_layout, viewInflate)) != null) {
                                i = R.id.coefficient_text;
                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.coefficient_text, viewInflate);
                                if (appCompatTextView4 != null) {
                                    i = R.id.fairness;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.fairness, viewInflate);
                                    if (appCompatImageView != null) {
                                        i = R.id.fairness_layout;
                                        if (((ConstraintLayout) h5e.a(R.id.fairness_layout, viewInflate)) != null) {
                                            i = R.id.stake_amount;
                                            AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.stake_amount, viewInflate);
                                            if (appCompatTextView5 != null) {
                                                i = R.id.stake_layout;
                                                if (((ConstraintLayout) h5e.a(R.id.stake_layout, viewInflate)) != null) {
                                                    i = R.id.stake_space;
                                                    if (((AppCompatTextView) h5e.a(R.id.stake_space, viewInflate)) != null) {
                                                        i = R.id.stake_text;
                                                        AppCompatTextView appCompatTextView6 = (AppCompatTextView) h5e.a(R.id.stake_text, viewInflate);
                                                        if (appCompatTextView6 != null) {
                                                            i = R.id.user_image;
                                                            ImageView imageView = (ImageView) h5e.a(R.id.user_image, viewInflate);
                                                            if (imageView != null) {
                                                                i = R.id.user_image_layout;
                                                                if (((ConstraintLayout) h5e.a(R.id.user_image_layout, viewInflate)) != null) {
                                                                    i = R.id.user_name;
                                                                    AppCompatTextView appCompatTextView7 = (AppCompatTextView) h5e.a(R.id.user_name, viewInflate);
                                                                    if (appCompatTextView7 != null) {
                                                                        return new bx80((CardView) viewInflate, appCompatTextView, appCompatTextView2, constraintLayout, appCompatTextView3, appCompatTextView4, appCompatImageView, appCompatTextView5, appCompatTextView6, imageView, appCompatTextView7);
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
