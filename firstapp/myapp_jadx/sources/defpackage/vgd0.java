package defpackage;

import android.view.View;
import android.widget.ImageButton;
import android.widget.SeekBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.cashoutphase3.InstantCashoutView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;
import com.sportybet.plugin.realsports.widget.DancingNumber2;

/* JADX INFO: loaded from: classes5.dex */
public final class vgd0 implements g6i0 {
    public final DancingNumber2 A;
    public final TextView B;
    public final TextView C;
    public final SeekBar D;
    public final ConstraintLayout E;
    public final TextView F;
    public final TextView G;
    public final AppCompatTextView H;
    public final ConstraintLayout I;
    public final ConstraintLayout J;
    public final TextView K;
    public final InstantCashoutView a;
    public final ConstraintLayout b;
    public final ProgressButton c;
    public final AppCompatTextView d;
    public final DancingNumber2 e;
    public final TextView f;
    public final TextView i;
    public final ImageButton v;
    public final TextView w;
    public final ConstraintLayout y;
    public final TextView z;

    public vgd0(InstantCashoutView instantCashoutView, ConstraintLayout constraintLayout, ProgressButton progressButton, AppCompatTextView appCompatTextView, DancingNumber2 dancingNumber2, TextView textView, TextView textView2, ImageButton imageButton, TextView textView3, ConstraintLayout constraintLayout2, TextView textView4, DancingNumber2 dancingNumber3, TextView textView5, TextView textView6, SeekBar seekBar, ConstraintLayout constraintLayout3, TextView textView7, TextView textView8, AppCompatTextView appCompatTextView2, ConstraintLayout constraintLayout4, ConstraintLayout constraintLayout5, TextView textView9) {
        this.a = instantCashoutView;
        this.b = constraintLayout;
        this.c = progressButton;
        this.d = appCompatTextView;
        this.e = dancingNumber2;
        this.f = textView;
        this.i = textView2;
        this.v = imageButton;
        this.w = textView3;
        this.y = constraintLayout2;
        this.z = textView4;
        this.A = dancingNumber3;
        this.B = textView5;
        this.C = textView6;
        this.D = seekBar;
        this.E = constraintLayout3;
        this.F = textView7;
        this.G = textView8;
        this.H = appCompatTextView2;
        this.I = constraintLayout4;
        this.J = constraintLayout5;
        this.K = textView9;
    }

    public static vgd0 a(View view) {
        int i = R.id.button_container;
        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.button_container, view);
        if (constraintLayout != null) {
            i = R.id.confirm_cashout_progress;
            ProgressButton progressButton = (ProgressButton) h5e.a(R.id.confirm_cashout_progress, view);
            if (progressButton != null) {
                i = R.id.fallback_text;
                AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.fallback_text, view);
                if (appCompatTextView != null) {
                    i = R.id.fallback_tip_mark;
                    if (((AppCompatImageView) h5e.a(R.id.fallback_tip_mark, view)) != null) {
                        i = R.id.middle2;
                        DancingNumber2 dancingNumber2 = (DancingNumber2) h5e.a(R.id.middle2, view);
                        if (dancingNumber2 != null) {
                            i = R.id.pot_win;
                            TextView textView = (TextView) h5e.a(R.id.pot_win, view);
                            if (textView != null) {
                                i = R.id.pot_win_label;
                                TextView textView2 = (TextView) h5e.a(R.id.pot_win_label, view);
                                if (textView2 != null) {
                                    i = R.id.refresh_button;
                                    ImageButton imageButton = (ImageButton) h5e.a(R.id.refresh_button, view);
                                    if (imageButton != null) {
                                        i = R.id.spr_cash_out_instant;
                                        if (((ConstraintLayout) h5e.a(R.id.spr_cash_out_instant, view)) != null) {
                                            i = R.id.spr_cash_out_instant_cash_out;
                                            TextView textView3 = (TextView) h5e.a(R.id.spr_cash_out_instant_cash_out, view);
                                            if (textView3 != null) {
                                                i = R.id.spr_cash_out_instant_fallback_container;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.spr_cash_out_instant_fallback_container, view);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.spr_cash_out_instant_max;
                                                    TextView textView4 = (TextView) h5e.a(R.id.spr_cash_out_instant_max, view);
                                                    if (textView4 != null) {
                                                        i = R.id.spr_cash_out_instant_middle;
                                                        DancingNumber2 dancingNumber3 = (DancingNumber2) h5e.a(R.id.spr_cash_out_instant_middle, view);
                                                        if (dancingNumber3 != null) {
                                                            i = R.id.spr_cash_out_instant_min;
                                                            TextView textView5 = (TextView) h5e.a(R.id.spr_cash_out_instant_min, view);
                                                            if (textView5 != null) {
                                                                i = R.id.spr_cash_out_instant_no_p_why;
                                                                TextView textView6 = (TextView) h5e.a(R.id.spr_cash_out_instant_no_p_why, view);
                                                                if (textView6 != null) {
                                                                    i = R.id.spr_cash_out_instant_seek;
                                                                    SeekBar seekBar = (SeekBar) h5e.a(R.id.spr_cash_out_instant_seek, view);
                                                                    if (seekBar != null) {
                                                                        i = R.id.spr_cash_out_instant_seek_container;
                                                                        ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.spr_cash_out_instant_seek_container, view);
                                                                        if (constraintLayout3 != null) {
                                                                            i = R.id.stake;
                                                                            TextView textView7 = (TextView) h5e.a(R.id.stake, view);
                                                                            if (textView7 != null) {
                                                                                i = R.id.stake_label;
                                                                                TextView textView8 = (TextView) h5e.a(R.id.stake_label, view);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.tax_msg;
                                                                                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.tax_msg, view);
                                                                                    if (appCompatTextView2 != null) {
                                                                                        i = R.id.update_button_container;
                                                                                        ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.update_button_container, view);
                                                                                        if (constraintLayout4 != null) {
                                                                                            i = R.id.update_button_inner;
                                                                                            ConstraintLayout constraintLayout5 = (ConstraintLayout) h5e.a(R.id.update_button_inner, view);
                                                                                            if (constraintLayout5 != null) {
                                                                                                i = R.id.update_icon;
                                                                                                if (((AppCompatImageView) h5e.a(R.id.update_icon, view)) != null) {
                                                                                                    i = R.id.update_no_p_why;
                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.update_no_p_why, view);
                                                                                                    if (textView9 != null) {
                                                                                                        i = R.id.update_text_btn;
                                                                                                        if (((AppCompatTextView) h5e.a(R.id.update_text_btn, view)) != null) {
                                                                                                            return new vgd0((InstantCashoutView) view, constraintLayout, progressButton, appCompatTextView, dancingNumber2, textView, textView2, imageButton, textView3, constraintLayout2, textView4, dancingNumber3, textView5, textView6, seekBar, constraintLayout3, textView7, textView8, appCompatTextView2, constraintLayout4, constraintLayout5, textView9);
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
