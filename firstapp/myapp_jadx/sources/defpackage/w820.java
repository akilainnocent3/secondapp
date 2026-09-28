package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.sportybet.android.gp.tz.R;
import com.sportygames.pocketrocket.component.RoundDetailBetList;

/* JADX INFO: loaded from: classes7.dex */
public final class w820 implements g6i0 {
    public final ConstraintLayout A;
    public final TextView B;
    public final TextView C;
    public final SpinKitView D;
    public final View E;
    public final View F;
    public final View G;
    public final ConstraintLayout a;
    public final RoundDetailBetList b;
    public final RoundDetailBetList c;
    public final RoundDetailBetList d;
    public final FloatingActionButton e;
    public final RoundDetailBetList f;
    public final RoundDetailBetList i;
    public final RoundDetailBetList v;
    public final RoundDetailBetList w;
    public final RoundDetailBetList y;
    public final RoundDetailBetList z;

    public w820(ConstraintLayout constraintLayout, RoundDetailBetList roundDetailBetList, RoundDetailBetList roundDetailBetList2, RoundDetailBetList roundDetailBetList3, FloatingActionButton floatingActionButton, RoundDetailBetList roundDetailBetList4, RoundDetailBetList roundDetailBetList5, RoundDetailBetList roundDetailBetList6, RoundDetailBetList roundDetailBetList7, RoundDetailBetList roundDetailBetList8, RoundDetailBetList roundDetailBetList9, ConstraintLayout constraintLayout2, TextView textView, TextView textView2, SpinKitView spinKitView, View view, View view2, View view3) {
        this.a = constraintLayout;
        this.b = roundDetailBetList;
        this.c = roundDetailBetList2;
        this.d = roundDetailBetList3;
        this.e = floatingActionButton;
        this.f = roundDetailBetList4;
        this.i = roundDetailBetList5;
        this.v = roundDetailBetList6;
        this.w = roundDetailBetList7;
        this.y = roundDetailBetList8;
        this.z = roundDetailBetList9;
        this.A = constraintLayout2;
        this.B = textView;
        this.C = textView2;
        this.D = spinKitView;
        this.E = view;
        this.F = view2;
        this.G = view3;
    }

    public static w820 a(LayoutInflater layoutInflater) {
        View viewInflate = layoutInflater.inflate(R.layout.pr_round_detail, (ViewGroup) null, false);
        int i = R.id.Total_bets;
        RoundDetailBetList roundDetailBetList = (RoundDetailBetList) h5e.a(R.id.Total_bets, viewInflate);
        if (roundDetailBetList != null) {
            i = R.id.biggest_coeff;
            if (((ConstraintLayout) h5e.a(R.id.biggest_coeff, viewInflate)) != null) {
                i = R.id.blue_bets;
                RoundDetailBetList roundDetailBetList2 = (RoundDetailBetList) h5e.a(R.id.blue_bets, viewInflate);
                if (roundDetailBetList2 != null) {
                    i = R.id.blue_result;
                    RoundDetailBetList roundDetailBetList3 = (RoundDetailBetList) h5e.a(R.id.blue_result, viewInflate);
                    if (roundDetailBetList3 != null) {
                        i = R.id.close;
                        FloatingActionButton floatingActionButton = (FloatingActionButton) h5e.a(R.id.close, viewInflate);
                        if (floatingActionButton != null) {
                            i = R.id.container;
                            if (((CardView) h5e.a(R.id.container, viewInflate)) != null) {
                                i = R.id.heighest_cashout_coeff;
                                RoundDetailBetList roundDetailBetList4 = (RoundDetailBetList) h5e.a(R.id.heighest_cashout_coeff, viewInflate);
                                if (roundDetailBetList4 != null) {
                                    i = R.id.heighest_stake;
                                    RoundDetailBetList roundDetailBetList5 = (RoundDetailBetList) h5e.a(R.id.heighest_stake, viewInflate);
                                    if (roundDetailBetList5 != null) {
                                        i = R.id.purple_bets;
                                        RoundDetailBetList roundDetailBetList6 = (RoundDetailBetList) h5e.a(R.id.purple_bets, viewInflate);
                                        if (roundDetailBetList6 != null) {
                                            i = R.id.purple_result;
                                            RoundDetailBetList roundDetailBetList7 = (RoundDetailBetList) h5e.a(R.id.purple_result, viewInflate);
                                            if (roundDetailBetList7 != null) {
                                                i = R.id.red_bets;
                                                RoundDetailBetList roundDetailBetList8 = (RoundDetailBetList) h5e.a(R.id.red_bets, viewInflate);
                                                if (roundDetailBetList8 != null) {
                                                    i = R.id.red_result;
                                                    RoundDetailBetList roundDetailBetList9 = (RoundDetailBetList) h5e.a(R.id.red_result, viewInflate);
                                                    if (roundDetailBetList9 != null) {
                                                        i = R.id.rocket_layout;
                                                        ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.rocket_layout, viewInflate);
                                                        if (constraintLayout != null) {
                                                            i = R.id.round_date;
                                                            TextView textView = (TextView) h5e.a(R.id.round_date, viewInflate);
                                                            if (textView != null) {
                                                                i = R.id.round_name;
                                                                TextView textView2 = (TextView) h5e.a(R.id.round_name, viewInflate);
                                                                if (textView2 != null) {
                                                                    i = R.id.spin_kit_symbol;
                                                                    SpinKitView spinKitView = (SpinKitView) h5e.a(R.id.spin_kit_symbol, viewInflate);
                                                                    if (spinKitView != null) {
                                                                        i = R.id.view1;
                                                                        View viewA = h5e.a(R.id.view1, viewInflate);
                                                                        if (viewA != null) {
                                                                            i = R.id.view_left1;
                                                                            View viewA2 = h5e.a(R.id.view_left1, viewInflate);
                                                                            if (viewA2 != null) {
                                                                                i = R.id.view_right1;
                                                                                View viewA3 = h5e.a(R.id.view_right1, viewInflate);
                                                                                if (viewA3 != null) {
                                                                                    return new w820((ConstraintLayout) viewInflate, roundDetailBetList, roundDetailBetList2, roundDetailBetList3, floatingActionButton, roundDetailBetList4, roundDetailBetList5, roundDetailBetList6, roundDetailBetList7, roundDetailBetList8, roundDetailBetList9, constraintLayout, textView, textView2, spinKitView, viewA, viewA2, viewA3);
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
