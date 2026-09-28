package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes8.dex */
public final class mn80 implements g6i0 {
    public final ConstraintLayout A;
    public final View B;
    public final AppCompatTextView C;
    public final ConstraintLayout a;
    public final ConstraintLayout b;
    public final TextView c;
    public final TextView d;
    public final ConstraintLayout e;
    public final AppCompatImageView f;
    public final ConstraintLayout i;
    public final TextView v;
    public final AppCompatImageView w;
    public final TextView y;
    public final TextView z;

    public mn80(ConstraintLayout constraintLayout, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, ConstraintLayout constraintLayout3, AppCompatImageView appCompatImageView, ConstraintLayout constraintLayout4, TextView textView3, AppCompatImageView appCompatImageView2, TextView textView4, TextView textView5, ConstraintLayout constraintLayout5, View view, AppCompatTextView appCompatTextView) {
        this.a = constraintLayout;
        this.b = constraintLayout2;
        this.c = textView;
        this.d = textView2;
        this.e = constraintLayout3;
        this.f = appCompatImageView;
        this.i = constraintLayout4;
        this.v = textView3;
        this.w = appCompatImageView2;
        this.y = textView4;
        this.z = textView5;
        this.A = constraintLayout5;
        this.B = view;
        this.C = appCompatTextView;
    }

    public static mn80 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.sg_confirm_dialog, viewGroup, false);
        int i = R.id.button_layout;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.button_layout, viewInflate);
        if (constraintLayout != null) {
            i = R.id.cancel_button;
            TextView textView = (TextView) h5e.a(R.id.cancel_button, viewInflate);
            if (textView != null) {
                i = R.id.confirm_button;
                TextView textView2 = (TextView) h5e.a(R.id.confirm_button, viewInflate);
                if (textView2 != null) {
                    i = R.id.confirm_layout;
                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.confirm_layout, viewInflate);
                    if (constraintLayout2 != null) {
                        i = R.id.fbg_delete_gift;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.fbg_delete_gift, viewInflate);
                        if (appCompatImageView != null) {
                            i = R.id.fbg_dialog_view;
                            ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.fbg_dialog_view, viewInflate);
                            if (constraintLayout3 != null) {
                                i = R.id.fbg_gift_user_deducted_amount;
                                TextView textView3 = (TextView) h5e.a(R.id.fbg_gift_user_deducted_amount, viewInflate);
                                if (textView3 != null) {
                                    i = R.id.fbg_right_arrow;
                                    AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.fbg_right_arrow, viewInflate);
                                    if (appCompatImageView2 != null) {
                                        i = R.id.fbg_text_content;
                                        if (((ConstraintLayout) h5e.a(R.id.fbg_text_content, viewInflate)) != null) {
                                            i = R.id.gift_amount_text;
                                            TextView textView4 = (TextView) h5e.a(R.id.gift_amount_text, viewInflate);
                                            if (textView4 != null) {
                                                i = R.id.gift_count_text;
                                                TextView textView5 = (TextView) h5e.a(R.id.gift_count_text, viewInflate);
                                                if (textView5 != null) {
                                                    i = R.id.gift_icon;
                                                    if (((AppCompatImageView) h5e.a(R.id.gift_icon, viewInflate)) != null) {
                                                        i = R.id.gift_open_button;
                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.gift_open_button, viewInflate);
                                                        if (constraintLayout4 != null) {
                                                            i = R.id.grey_view;
                                                            View viewA = h5e.a(R.id.grey_view, viewInflate);
                                                            if (viewA != null) {
                                                                i = R.id.message_text;
                                                                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.message_text, viewInflate);
                                                                if (appCompatTextView != null) {
                                                                    i = R.id.space;
                                                                    if (((ConstraintLayout) h5e.a(R.id.space, viewInflate)) != null) {
                                                                        return new mn80((ConstraintLayout) viewInflate, constraintLayout, textView, textView2, constraintLayout2, appCompatImageView, constraintLayout3, textView3, appCompatImageView2, textView4, textView5, constraintLayout4, viewA, appCompatTextView);
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
