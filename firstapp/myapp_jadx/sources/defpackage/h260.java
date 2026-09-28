package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.UnderLineTextView;

/* JADX INFO: loaded from: classes7.dex */
public final class h260 implements g6i0 {
    public final ConstraintLayout A;
    public final View B;
    public final TextView C;
    public final AppCompatImageView D;
    public final AppCompatImageView E;
    public final ConstraintLayout F;
    public final TextView G;
    public final TextView H;
    public final UnderLineTextView I;
    public final TextView J;
    public final TextView K;
    public final TextView L;
    public final TextView M;
    public final TextView N;
    public final TextView O;
    public final TextView P;
    public final TextView Q;
    public final AppCompatImageView R;
    public final TextView S;
    public final TextView T;
    public final TextView U;
    public final TextView V;
    public final LinearLayoutCompat a;
    public final LinearLayoutCompat b;
    public final AppCompatTextView c;
    public final LinearLayoutCompat d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final ConstraintLayout w;
    public final AppCompatImageView y;
    public final View z;

    public h260(LinearLayoutCompat linearLayoutCompat, LinearLayoutCompat linearLayoutCompat2, AppCompatTextView appCompatTextView, LinearLayoutCompat linearLayoutCompat3, TextView textView, TextView textView2, TextView textView3, TextView textView4, ConstraintLayout constraintLayout, AppCompatImageView appCompatImageView, View view, ConstraintLayout constraintLayout2, View view2, TextView textView5, AppCompatImageView appCompatImageView2, AppCompatImageView appCompatImageView3, ConstraintLayout constraintLayout3, TextView textView6, TextView textView7, UnderLineTextView underLineTextView, TextView textView8, TextView textView9, TextView textView10, TextView textView11, TextView textView12, TextView textView13, TextView textView14, TextView textView15, AppCompatImageView appCompatImageView4, TextView textView16, TextView textView17, TextView textView18, TextView textView19) {
        this.a = linearLayoutCompat;
        this.b = linearLayoutCompat2;
        this.c = appCompatTextView;
        this.d = linearLayoutCompat3;
        this.e = textView;
        this.f = textView2;
        this.i = textView3;
        this.v = textView4;
        this.w = constraintLayout;
        this.y = appCompatImageView;
        this.z = view;
        this.A = constraintLayout2;
        this.B = view2;
        this.C = textView5;
        this.D = appCompatImageView2;
        this.E = appCompatImageView3;
        this.F = constraintLayout3;
        this.G = textView6;
        this.H = textView7;
        this.I = underLineTextView;
        this.J = textView8;
        this.K = textView9;
        this.L = textView10;
        this.M = textView11;
        this.N = textView12;
        this.O = textView13;
        this.P = textView14;
        this.Q = textView15;
        this.R = appCompatImageView4;
        this.S = textView16;
        this.T = textView17;
        this.U = textView18;
        this.V = textView19;
    }

    public static h260 a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View viewInflate = layoutInflater.inflate(R.layout.rush_bethistory_item, viewGroup, false);
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) viewInflate;
        int i = R.id.button_item_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.button_item_view, viewInflate);
        if (appCompatTextView != null) {
            i = R.id.details;
            LinearLayoutCompat linearLayoutCompat2 = (LinearLayoutCompat) h5e.a(R.id.details, viewInflate);
            if (linearLayoutCompat2 != null) {
                i = R.id.fbg_amount_tv;
                TextView textView = (TextView) h5e.a(R.id.fbg_amount_tv, viewInflate);
                if (textView != null) {
                    i = R.id.fbg_win_amount_tv;
                    TextView textView2 = (TextView) h5e.a(R.id.fbg_win_amount_tv, viewInflate);
                    if (textView2 != null) {
                        i = R.id.free_bet_gift_tv;
                        TextView textView3 = (TextView) h5e.a(R.id.free_bet_gift_tv, viewInflate);
                        if (textView3 != null) {
                            i = R.id.free_bet_gift_win_tv;
                            TextView textView4 = (TextView) h5e.a(R.id.free_bet_gift_win_tv, viewInflate);
                            if (textView4 != null) {
                                i = R.id.gift_detail;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.gift_detail, viewInflate);
                                if (constraintLayout != null) {
                                    i = R.id.gift_icon;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.gift_icon, viewInflate);
                                    if (appCompatImageView != null) {
                                        i = R.id.gift_paid_detail;
                                        if (((ConstraintLayout) h5e.a(R.id.gift_paid_detail, viewInflate)) != null) {
                                            i = R.id.gift_paid_divider;
                                            View viewA = h5e.a(R.id.gift_paid_divider, viewInflate);
                                            if (viewA != null) {
                                                i = R.id.gift_win_detail;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.gift_win_detail, viewInflate);
                                                if (constraintLayout2 != null) {
                                                    i = R.id.gift_win_divider;
                                                    View viewA2 = h5e.a(R.id.gift_win_divider, viewInflate);
                                                    if (viewA2 != null) {
                                                        i = R.id.house_coeff;
                                                        TextView textView5 = (TextView) h5e.a(R.id.house_coeff, viewInflate);
                                                        if (textView5 != null) {
                                                            i = R.id.image_arrow_down;
                                                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.image_arrow_down, viewInflate);
                                                            if (appCompatImageView2 != null) {
                                                                i = R.id.image_arrow_up;
                                                                AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.image_arrow_up, viewInflate);
                                                                if (appCompatImageView3 != null) {
                                                                    i = R.id.more_detail_content;
                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.more_detail_content, viewInflate);
                                                                    if (constraintLayout3 != null) {
                                                                        i = R.id.stake_item_view;
                                                                        if (((LinearLayoutCompat) h5e.a(R.id.stake_item_view, viewInflate)) != null) {
                                                                            i = R.id.stake_tv;
                                                                            TextView textView6 = (TextView) h5e.a(R.id.stake_tv, viewInflate);
                                                                            if (textView6 != null) {
                                                                                i = R.id.status_item_view;
                                                                                TextView textView7 = (TextView) h5e.a(R.id.status_item_view, viewInflate);
                                                                                if (textView7 != null) {
                                                                                    i = R.id.status_layer;
                                                                                    if (((LinearLayoutCompat) h5e.a(R.id.status_layer, viewInflate)) != null) {
                                                                                        i = R.id.ticket_number;
                                                                                        UnderLineTextView underLineTextView = (UnderLineTextView) h5e.a(R.id.ticket_number, viewInflate);
                                                                                        if (underLineTextView != null) {
                                                                                            i = R.id.ticket_number_layout;
                                                                                            if (((LinearLayoutCompat) h5e.a(R.id.ticket_number_layout, viewInflate)) != null) {
                                                                                                i = R.id.time_item_view;
                                                                                                TextView textView8 = (TextView) h5e.a(R.id.time_item_view, viewInflate);
                                                                                                if (textView8 != null) {
                                                                                                    i = R.id.total_stake_amount_tv;
                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.total_stake_amount_tv, viewInflate);
                                                                                                    if (textView9 != null) {
                                                                                                        i = R.id.total_stake_tv;
                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.total_stake_tv, viewInflate);
                                                                                                        if (textView10 != null) {
                                                                                                            i = R.id.total_win_amount_tv;
                                                                                                            TextView textView11 = (TextView) h5e.a(R.id.total_win_amount_tv, viewInflate);
                                                                                                            if (textView11 != null) {
                                                                                                                i = R.id.total_win_tv;
                                                                                                                TextView textView12 = (TextView) h5e.a(R.id.total_win_tv, viewInflate);
                                                                                                                if (textView12 != null) {
                                                                                                                    i = R.id.tv_house_coeff;
                                                                                                                    TextView textView13 = (TextView) h5e.a(R.id.tv_house_coeff, viewInflate);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i = R.id.tv_user_coeff;
                                                                                                                        TextView textView14 = (TextView) h5e.a(R.id.tv_user_coeff, viewInflate);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i = R.id.user_coeff;
                                                                                                                            TextView textView15 = (TextView) h5e.a(R.id.user_coeff, viewInflate);
                                                                                                                            if (textView15 != null) {
                                                                                                                                i = R.id.win_image;
                                                                                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.win_image, viewInflate);
                                                                                                                                if (appCompatImageView4 != null) {
                                                                                                                                    i = R.id.you_paid_amount_tv;
                                                                                                                                    TextView textView16 = (TextView) h5e.a(R.id.you_paid_amount_tv, viewInflate);
                                                                                                                                    if (textView16 != null) {
                                                                                                                                        i = R.id.you_paid_tv;
                                                                                                                                        TextView textView17 = (TextView) h5e.a(R.id.you_paid_tv, viewInflate);
                                                                                                                                        if (textView17 != null) {
                                                                                                                                            i = R.id.you_win_amount_tv;
                                                                                                                                            TextView textView18 = (TextView) h5e.a(R.id.you_win_amount_tv, viewInflate);
                                                                                                                                            if (textView18 != null) {
                                                                                                                                                i = R.id.you_win_tv;
                                                                                                                                                TextView textView19 = (TextView) h5e.a(R.id.you_win_tv, viewInflate);
                                                                                                                                                if (textView19 != null) {
                                                                                                                                                    i = R.id.your_house_coeff;
                                                                                                                                                    if (((LinearLayoutCompat) h5e.a(R.id.your_house_coeff, viewInflate)) != null) {
                                                                                                                                                        i = R.id.your_user_coeff;
                                                                                                                                                        if (((LinearLayoutCompat) h5e.a(R.id.your_user_coeff, viewInflate)) != null) {
                                                                                                                                                            return new h260(linearLayoutCompat, linearLayoutCompat, appCompatTextView, linearLayoutCompat2, textView, textView2, textView3, textView4, constraintLayout, appCompatImageView, viewA, constraintLayout2, viewA2, textView5, appCompatImageView2, appCompatImageView3, constraintLayout3, textView6, textView7, underLineTextView, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, appCompatImageView4, textView16, textView17, textView18, textView19);
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
