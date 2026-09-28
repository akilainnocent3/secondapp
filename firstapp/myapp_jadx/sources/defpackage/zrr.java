package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.common_ui.widgets.ClearEditText;
import com.sporty.android.common_ui.widgets.CombEditText;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes6.dex */
public final class zrr implements g6i0 {
    public final TextView A;
    public final AppCompatImageView B;
    public final ImageView C;
    public final ImageView D;
    public final TextView E;
    public final ConstraintLayout a;
    public final TextView b;
    public final ClearEditText c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final CombEditText i;
    public final TextView v;
    public final CombEditText w;
    public final TextView y;
    public final CombEditText z;

    public zrr(ConstraintLayout constraintLayout, TextView textView, ClearEditText clearEditText, TextView textView2, TextView textView3, TextView textView4, CombEditText combEditText, TextView textView5, CombEditText combEditText2, TextView textView6, CombEditText combEditText3, TextView textView7, AppCompatImageView appCompatImageView, ImageView imageView, ImageView imageView2, TextView textView8) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = clearEditText;
        this.d = textView2;
        this.e = textView3;
        this.f = textView4;
        this.i = combEditText;
        this.v = textView5;
        this.w = combEditText2;
        this.y = textView6;
        this.z = combEditText3;
        this.A = textView7;
        this.B = appCompatImageView;
        this.C = imageView;
        this.D = imageView2;
        this.E = textView8;
    }

    public static zrr a(View view) {
        int i = R.id.amount_container_new_card;
        if (((FrameLayout) h5e.a(R.id.amount_container_new_card, view)) != null) {
            i = R.id.amount_label_new_card;
            TextView textView = (TextView) h5e.a(R.id.amount_label_new_card, view);
            if (textView != null) {
                i = R.id.amount_new_card_edit_text;
                ClearEditText clearEditText = (ClearEditText) h5e.a(R.id.amount_new_card_edit_text, view);
                if (clearEditText != null) {
                    i = R.id.amount_warning_new_card;
                    TextView textView2 = (TextView) h5e.a(R.id.amount_warning_new_card, view);
                    if (textView2 != null) {
                        i = R.id.balance_label_new_card;
                        TextView textView3 = (TextView) h5e.a(R.id.balance_label_new_card, view);
                        if (textView3 != null) {
                            i = R.id.balance_new_card;
                            TextView textView4 = (TextView) h5e.a(R.id.balance_new_card, view);
                            if (textView4 != null) {
                                i = R.id.card_number_edit_text;
                                CombEditText combEditText = (CombEditText) h5e.a(R.id.card_number_edit_text, view);
                                if (combEditText != null) {
                                    i = R.id.card_number_warning;
                                    TextView textView5 = (TextView) h5e.a(R.id.card_number_warning, view);
                                    if (textView5 != null) {
                                        i = R.id.cvv_new_card_edit_text;
                                        CombEditText combEditText2 = (CombEditText) h5e.a(R.id.cvv_new_card_edit_text, view);
                                        if (combEditText2 != null) {
                                            i = R.id.cvv_new_card_warning;
                                            TextView textView6 = (TextView) h5e.a(R.id.cvv_new_card_warning, view);
                                            if (textView6 != null) {
                                                i = R.id.expiry_edit_text;
                                                CombEditText combEditText3 = (CombEditText) h5e.a(R.id.expiry_edit_text, view);
                                                if (combEditText3 != null) {
                                                    i = R.id.expiry_warning;
                                                    TextView textView7 = (TextView) h5e.a(R.id.expiry_warning, view);
                                                    if (textView7 != null) {
                                                        i = R.id.help_cvv_new_card_icon;
                                                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.help_cvv_new_card_icon, view);
                                                        if (appCompatImageView != null) {
                                                            i = R.id.save_card_icon;
                                                            ImageView imageView = (ImageView) h5e.a(R.id.save_card_icon, view);
                                                            if (imageView != null) {
                                                                i = R.id.save_card_text;
                                                                if (((TextView) h5e.a(R.id.save_card_text, view)) != null) {
                                                                    i = R.id.set_card_as_default_icon;
                                                                    ImageView imageView2 = (ImageView) h5e.a(R.id.set_card_as_default_icon, view);
                                                                    if (imageView2 != null) {
                                                                        i = R.id.set_card_as_default_text;
                                                                        TextView textView8 = (TextView) h5e.a(R.id.set_card_as_default_text, view);
                                                                        if (textView8 != null) {
                                                                            return new zrr((ConstraintLayout) view, textView, clearEditText, textView2, textView3, textView4, combEditText, textView5, combEditText2, textView6, combEditText3, textView7, appCompatImageView, imageView, imageView2, textView8);
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
