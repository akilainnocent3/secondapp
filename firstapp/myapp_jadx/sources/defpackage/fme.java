package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import com.google.android.material.divider.MaterialDivider;
import com.sporty.android.common_ui.widgets.CommonButton;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.widget.ProgressButton;

/* JADX INFO: loaded from: classes6.dex */
public final class fme implements g6i0 {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final AppCompatImageView E;
    public final ConstraintLayout F;
    public final ConstraintLayout G;
    public final ComposeView H;
    public final TextView I;
    public final TextView J;
    public final ConstraintLayout a;
    public final TextView b;
    public final TextView c;
    public final CommonButton d;
    public final ProgressButton e;
    public final AppCompatImageView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public fme(ConstraintLayout constraintLayout, TextView textView, TextView textView2, CommonButton commonButton, ProgressButton progressButton, AppCompatImageView appCompatImageView, TextView textView3, TextView textView4, TextView textView5, TextView textView6, TextView textView7, TextView textView8, TextView textView9, TextView textView10, TextView textView11, AppCompatImageView appCompatImageView2, ConstraintLayout constraintLayout2, ConstraintLayout constraintLayout3, ComposeView composeView, TextView textView12, TextView textView13) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = textView2;
        this.d = commonButton;
        this.e = progressButton;
        this.f = appCompatImageView;
        this.i = textView3;
        this.v = textView4;
        this.w = textView5;
        this.y = textView6;
        this.z = textView7;
        this.A = textView8;
        this.B = textView9;
        this.C = textView10;
        this.D = textView11;
        this.E = appCompatImageView2;
        this.F = constraintLayout2;
        this.G = constraintLayout3;
        this.H = composeView;
        this.I = textView12;
        this.J = textView13;
    }

    public static fme a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.dialog_withdraw_confirm, (ViewGroup) null, false);
        int i = R.id.amount;
        TextView textView = (TextView) h5e.a(R.id.amount, viewInflate);
        if (textView != null) {
            i = R.id.amount_container;
            if (((FrameLayout) h5e.a(R.id.amount_container, viewInflate)) != null) {
                i = R.id.amount_label;
                TextView textView2 = (TextView) h5e.a(R.id.amount_label, viewInflate);
                if (textView2 != null) {
                    i = R.id.cancel;
                    CommonButton commonButton = (CommonButton) h5e.a(R.id.cancel, viewInflate);
                    if (commonButton != null) {
                        i = R.id.confirm;
                        ProgressButton progressButton = (ProgressButton) h5e.a(R.id.confirm, viewInflate);
                        if (progressButton != null) {
                            i = R.id.divide_line;
                            if (((MaterialDivider) h5e.a(R.id.divide_line, viewInflate)) != null) {
                                i = R.id.drop_alert_icon;
                                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.drop_alert_icon, viewInflate);
                                if (appCompatImageView != null) {
                                    i = R.id.guideline_end;
                                    if (((Guideline) h5e.a(R.id.guideline_end, viewInflate)) != null) {
                                        i = R.id.guideline_start;
                                        if (((Guideline) h5e.a(R.id.guideline_start, viewInflate)) != null) {
                                            i = R.id.guideline_top;
                                            if (((Guideline) h5e.a(R.id.guideline_top, viewInflate)) != null) {
                                                i = R.id.info1;
                                                TextView textView3 = (TextView) h5e.a(R.id.info1, viewInflate);
                                                if (textView3 != null) {
                                                    i = R.id.info1_barrier;
                                                    if (((Barrier) h5e.a(R.id.info1_barrier, viewInflate)) != null) {
                                                        i = R.id.info2;
                                                        TextView textView4 = (TextView) h5e.a(R.id.info2, viewInflate);
                                                        if (textView4 != null) {
                                                            i = R.id.info2_barrier;
                                                            if (((Barrier) h5e.a(R.id.info2_barrier, viewInflate)) != null) {
                                                                i = R.id.info3;
                                                                TextView textView5 = (TextView) h5e.a(R.id.info3, viewInflate);
                                                                if (textView5 != null) {
                                                                    i = R.id.info3_barrier;
                                                                    if (((Barrier) h5e.a(R.id.info3_barrier, viewInflate)) != null) {
                                                                        i = R.id.info_label1;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.info_label1, viewInflate);
                                                                        if (textView6 != null) {
                                                                            i = R.id.info_label2;
                                                                            TextView textView7 = (TextView) h5e.a(R.id.info_label2, viewInflate);
                                                                            if (textView7 != null) {
                                                                                i = R.id.info_label3;
                                                                                TextView textView8 = (TextView) h5e.a(R.id.info_label3, viewInflate);
                                                                                if (textView8 != null) {
                                                                                    i = R.id.net_payout;
                                                                                    TextView textView9 = (TextView) h5e.a(R.id.net_payout, viewInflate);
                                                                                    if (textView9 != null) {
                                                                                        i = R.id.net_payout_label;
                                                                                        if (((TextView) h5e.a(R.id.net_payout_label, viewInflate)) != null) {
                                                                                            i = R.id.remain;
                                                                                            TextView textView10 = (TextView) h5e.a(R.id.remain, viewInflate);
                                                                                            if (textView10 != null) {
                                                                                                i = R.id.remain_barrier;
                                                                                                if (((Barrier) h5e.a(R.id.remain_barrier, viewInflate)) != null) {
                                                                                                    i = R.id.remain_label;
                                                                                                    if (((TextView) h5e.a(R.id.remain_label, viewInflate)) != null) {
                                                                                                        i = R.id.title;
                                                                                                        if (((TextView) h5e.a(R.id.title, viewInflate)) != null) {
                                                                                                            i = R.id.wh_tax;
                                                                                                            TextView textView11 = (TextView) h5e.a(R.id.wh_tax, viewInflate);
                                                                                                            if (textView11 != null) {
                                                                                                                i = R.id.wh_tax_barrier;
                                                                                                                if (((Barrier) h5e.a(R.id.wh_tax_barrier, viewInflate)) != null) {
                                                                                                                    i = R.id.wh_tax_description;
                                                                                                                    if (((TextView) h5e.a(R.id.wh_tax_description, viewInflate)) != null) {
                                                                                                                        i = R.id.wh_tax_help;
                                                                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.wh_tax_help, viewInflate);
                                                                                                                        if (appCompatImageView2 != null) {
                                                                                                                            i = R.id.wh_tax_label;
                                                                                                                            if (((TextView) h5e.a(R.id.wh_tax_label, viewInflate)) != null) {
                                                                                                                                i = R.id.wht_active_container;
                                                                                                                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.wht_active_container, viewInflate);
                                                                                                                                if (constraintLayout != null) {
                                                                                                                                    i = R.id.wht_inactive_container;
                                                                                                                                    ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.wht_inactive_container, viewInflate);
                                                                                                                                    if (constraintLayout2 != null) {
                                                                                                                                        i = R.id.withdraw_alert_hint;
                                                                                                                                        ComposeView composeView = (ComposeView) h5e.a(R.id.withdraw_alert_hint, viewInflate);
                                                                                                                                        if (composeView != null) {
                                                                                                                                            i = R.id.withdraw_amount;
                                                                                                                                            TextView textView12 = (TextView) h5e.a(R.id.withdraw_amount, viewInflate);
                                                                                                                                            if (textView12 != null) {
                                                                                                                                                i = R.id.withdraw_amount_barrier;
                                                                                                                                                if (((Barrier) h5e.a(R.id.withdraw_amount_barrier, viewInflate)) != null) {
                                                                                                                                                    i = R.id.withdraw_amount_label;
                                                                                                                                                    TextView textView13 = (TextView) h5e.a(R.id.withdraw_amount_label, viewInflate);
                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                        i = R.id.withdraw_label;
                                                                                                                                                        if (((TextView) h5e.a(R.id.withdraw_label, viewInflate)) != null) {
                                                                                                                                                            return new fme((ConstraintLayout) viewInflate, textView, textView2, commonButton, progressButton, appCompatImageView, textView3, textView4, textView5, textView6, textView7, textView8, textView9, textView10, textView11, appCompatImageView2, constraintLayout, constraintLayout2, composeView, textView12, textView13);
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
