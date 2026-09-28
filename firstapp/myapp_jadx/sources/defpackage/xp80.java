package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.spin2win.model.BetHistoryItem;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class xp80 extends mp2 {
    public e e;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final e eVar = this.e;
        d0Var.getClass();
        if (d0Var instanceof ws2) {
            ipc item = getItem(i);
            item.getClass();
            BetHistoryItem betHistoryItem = ((ipc.k) item).a;
            final ws2 ws2Var = (ws2) d0Var;
            q5b0 q5b0Var = ws2Var.a;
            betHistoryItem.getClass();
            eVar.getClass();
            ws2Var.b = betHistoryItem;
            q5b0Var.c.setOnClickListener(new View.OnClickListener() { // from class: nr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    wz.a("BetHistoryDetailClicked", "Spin2Win", new String[0]);
                    ws2 ws2Var2 = ws2Var;
                    BetHistoryItem betHistoryItem2 = ws2Var2.b;
                    if (betHistoryItem2 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    betHistoryItem2.setExpanded(!betHistoryItem2.isExpanded());
                    BetHistoryItem betHistoryItem3 = ws2Var2.b;
                    if (betHistoryItem3 != null) {
                        ws2Var2.a(betHistoryItem3, eVar);
                    } else {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                }
            });
            TextView textView = q5b0Var.K;
            AppCompatImageView appCompatImageView = q5b0Var.P;
            TextView textView2 = q5b0Var.I;
            String startTime = betHistoryItem.getStartTime();
            if (startTime == null) {
                startTime = "";
            }
            textView.setText(kt2.d(startTime));
            TextView textView3 = q5b0Var.H;
            Double totalStake = betHistoryItem.getTotalStake();
            textView3.setText(kt2.b(totalStake != null ? totalStake.doubleValue() : 0.0d));
            Double totalPayout = betHistoryItem.getTotalPayout();
            if ((totalPayout != null ? totalPayout.doubleValue() : 0.0d) <= 0.0d) {
                textView2.setText("Lost");
                appCompatImageView.setVisibility(8);
                op5.r(op5.a, b.f(textView2), null, 4);
            } else {
                appCompatImageView.setVisibility(0);
                Double actualPayoutAmount = betHistoryItem.getActualPayoutAmount();
                textView2.setText(kt2.b(actualPayoutAmount != null ? actualPayoutAmount.doubleValue() : 0.0d));
            }
            AppCompatImageView appCompatImageView2 = q5b0Var.w;
            Double giftAmount = betHistoryItem.getGiftAmount();
            appCompatImageView2.setVisibility((giftAmount != null ? giftAmount.doubleValue() : 0.0d) <= 0.0d ? 8 : 0);
            ws2Var.a(betHistoryItem, eVar);
            return;
        }
        if (d0Var instanceof oxa0) {
            final oxa0 oxa0Var = (oxa0) d0Var;
            r5b0 r5b0Var = oxa0Var.a;
            AppCompatButton appCompatButton = r5b0Var.b;
            AppCompatButton appCompatButton2 = r5b0Var.b;
            appCompatButton.setEnabled(true);
            appCompatButton2.setAlpha(1.0f);
            appCompatButton2.setClickable(true);
            op5 op5Var = op5.a;
            String string = eVar.getString(R.string.more_cms);
            string.getClass();
            String string2 = eVar.getString(R.string.more);
            string2.getClass();
            appCompatButton2.setText(op5.c(op5Var, string, string2));
            appCompatButton2.setOnClickListener(new View.OnClickListener() { // from class: vp80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.l();
                    r5b0 r5b0Var2 = oxa0Var.a;
                    r5b0Var2.b.setAlpha(0.5f);
                    r5b0Var2.b.setClickable(false);
                    r5b0Var2.b.setEnabled(false);
                }
            });
            return;
        }
        if (d0Var instanceof nxa0) {
            final nxa0 nxa0Var = (nxa0) d0Var;
            p5b0 p5b0Var = nxa0Var.a;
            TextView textView4 = p5b0Var.b;
            TextView textView5 = p5b0Var.b;
            textView4.setEnabled(true);
            textView5.setAlpha(1.0f);
            textView5.setClickable(true);
            op5 op5Var2 = op5.a;
            String string3 = eVar.getString(R.string.more_cms);
            string3.getClass();
            String string4 = eVar.getString(R.string.more);
            string4.getClass();
            textView5.setText(op5.c(op5Var2, string3, string4));
            textView5.setOnClickListener(new View.OnClickListener() { // from class: wp80
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.k();
                    p5b0 p5b0Var2 = nxa0Var.a;
                    p5b0Var2.b.setAlpha(0.5f);
                    p5b0Var2.b.setClickable(false);
                    p5b0Var2.b.setEnabled(false);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            int i2 = oxa0.b;
            View viewA = dzc.a(viewGroup, R.layout.spin2win_bethistory_viewmore, viewGroup, false);
            if (viewA != null) {
                AppCompatButton appCompatButton = (AppCompatButton) viewA;
                return new oxa0(new r5b0(appCompatButton, appCompatButton));
            }
            bmy.a("rootView");
            return null;
        }
        if (i == 2) {
            int i3 = nxa0.b;
            View viewA2 = dzc.a(viewGroup, R.layout.spin2win_bethistory_archive_viewmore, viewGroup, false);
            if (viewA2 != null) {
                TextView textView = (TextView) viewA2;
                return new nxa0(new p5b0(textView, textView));
            }
            bmy.a("rootView");
            return null;
        }
        if (i != 9) {
            throw new ClassCastException(hce0.a(i, "Unknown viewType "));
        }
        int i4 = ws2.c;
        View viewA3 = u540.a(viewGroup, R.layout.spin2win_bethistory_item, viewGroup, false);
        int i5 = R.id.button_item_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.button_item_view, viewA3);
        if (appCompatTextView != null) {
            i5 = R.id.details;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.details, viewA3);
            if (linearLayoutCompat != null) {
                i5 = R.id.fbg_amount_tv;
                TextView textView2 = (TextView) h5e.a(R.id.fbg_amount_tv, viewA3);
                if (textView2 != null) {
                    i5 = R.id.fbg_win_amount_tv;
                    TextView textView3 = (TextView) h5e.a(R.id.fbg_win_amount_tv, viewA3);
                    if (textView3 != null) {
                        i5 = R.id.free_bet_gift_tv;
                        TextView textView4 = (TextView) h5e.a(R.id.free_bet_gift_tv, viewA3);
                        if (textView4 != null) {
                            i5 = R.id.free_bet_gift_win_tv;
                            TextView textView5 = (TextView) h5e.a(R.id.free_bet_gift_win_tv, viewA3);
                            if (textView5 != null) {
                                i5 = R.id.gift_detail;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.gift_detail, viewA3);
                                if (constraintLayout != null) {
                                    i5 = R.id.gift_icon;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.gift_icon, viewA3);
                                    if (appCompatImageView != null) {
                                        i5 = R.id.gift_paid_detail;
                                        if (((ConstraintLayout) h5e.a(R.id.gift_paid_detail, viewA3)) != null) {
                                            i5 = R.id.gift_paid_divider;
                                            View viewA4 = h5e.a(R.id.gift_paid_divider, viewA3);
                                            if (viewA4 != null) {
                                                i5 = R.id.gift_win_detail;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.gift_win_detail, viewA3);
                                                if (constraintLayout2 != null) {
                                                    i5 = R.id.gift_win_divider;
                                                    View viewA5 = h5e.a(R.id.gift_win_divider, viewA3);
                                                    if (viewA5 != null) {
                                                        i5 = R.id.image_arrow_down;
                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.image_arrow_down, viewA3);
                                                        if (appCompatImageView2 != null) {
                                                            i5 = R.id.image_arrow_up;
                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.image_arrow_up, viewA3);
                                                            if (appCompatImageView3 != null) {
                                                                i5 = R.id.more_detail_content;
                                                                ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.more_detail_content, viewA3);
                                                                if (constraintLayout3 != null) {
                                                                    i5 = R.id.pick_list;
                                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.pick_list, viewA3);
                                                                    if (recyclerView != null) {
                                                                        i5 = R.id.picks;
                                                                        TextView textView6 = (TextView) h5e.a(R.id.picks, viewA3);
                                                                        if (textView6 != null) {
                                                                            i5 = R.id.result_layout;
                                                                            TextView textView7 = (TextView) h5e.a(R.id.result_layout, viewA3);
                                                                            if (textView7 != null) {
                                                                                i5 = R.id.stake_item_view;
                                                                                if (((LinearLayoutCompat) h5e.a(R.id.stake_item_view, viewA3)) != null) {
                                                                                    i5 = R.id.stake_tv;
                                                                                    TextView textView8 = (TextView) h5e.a(R.id.stake_tv, viewA3);
                                                                                    if (textView8 != null) {
                                                                                        i5 = R.id.status_item_view;
                                                                                        TextView textView9 = (TextView) h5e.a(R.id.status_item_view, viewA3);
                                                                                        if (textView9 != null) {
                                                                                            i5 = R.id.status_layer;
                                                                                            if (((LinearLayoutCompat) h5e.a(R.id.status_layer, viewA3)) != null) {
                                                                                                i5 = R.id.ticket_number;
                                                                                                UnderLineTextView underLineTextView = (UnderLineTextView) h5e.a(R.id.ticket_number, viewA3);
                                                                                                if (underLineTextView != null) {
                                                                                                    i5 = R.id.ticket_number_layout;
                                                                                                    if (((LinearLayoutCompat) h5e.a(R.id.ticket_number_layout, viewA3)) != null) {
                                                                                                        i5 = R.id.time_item_view;
                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.time_item_view, viewA3);
                                                                                                        if (textView10 != null) {
                                                                                                            i5 = R.id.total_stake_amount_tv;
                                                                                                            TextView textView11 = (TextView) h5e.a(R.id.total_stake_amount_tv, viewA3);
                                                                                                            if (textView11 != null) {
                                                                                                                i5 = R.id.total_stake_tv;
                                                                                                                TextView textView12 = (TextView) h5e.a(R.id.total_stake_tv, viewA3);
                                                                                                                if (textView12 != null) {
                                                                                                                    i5 = R.id.total_win_amount_tv;
                                                                                                                    TextView textView13 = (TextView) h5e.a(R.id.total_win_amount_tv, viewA3);
                                                                                                                    if (textView13 != null) {
                                                                                                                        i5 = R.id.total_win_tv;
                                                                                                                        TextView textView14 = (TextView) h5e.a(R.id.total_win_tv, viewA3);
                                                                                                                        if (textView14 != null) {
                                                                                                                            i5 = R.id.win_image;
                                                                                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.win_image, viewA3);
                                                                                                                            if (appCompatImageView4 != null) {
                                                                                                                                i5 = R.id.you_paid_amount_tv;
                                                                                                                                TextView textView15 = (TextView) h5e.a(R.id.you_paid_amount_tv, viewA3);
                                                                                                                                if (textView15 != null) {
                                                                                                                                    i5 = R.id.you_paid_tv;
                                                                                                                                    TextView textView16 = (TextView) h5e.a(R.id.you_paid_tv, viewA3);
                                                                                                                                    if (textView16 != null) {
                                                                                                                                        i5 = R.id.you_win_amount_tv;
                                                                                                                                        TextView textView17 = (TextView) h5e.a(R.id.you_win_amount_tv, viewA3);
                                                                                                                                        if (textView17 != null) {
                                                                                                                                            i5 = R.id.you_win_tv;
                                                                                                                                            TextView textView18 = (TextView) h5e.a(R.id.you_win_tv, viewA3);
                                                                                                                                            if (textView18 != null) {
                                                                                                                                                return new ws2(new q5b0((LinearLayoutCompat) viewA3, appCompatTextView, linearLayoutCompat, textView2, textView3, textView4, textView5, constraintLayout, appCompatImageView, viewA4, constraintLayout2, viewA5, appCompatImageView2, appCompatImageView3, constraintLayout3, recyclerView, textView6, textView7, textView8, textView9, underLineTextView, textView10, textView11, textView12, textView13, textView14, appCompatImageView4, textView15, textView16, textView17, textView18));
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
        bmy.a("Missing required view with ID: ".concat(viewA3.getResources().getResourceName(i5)));
        return null;
    }
}
