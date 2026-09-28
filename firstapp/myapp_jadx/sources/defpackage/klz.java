package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.pocketrocket.model.response.BetHistoryItem;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class klz extends mp2 {
    public e e;
    public String f;
    public String i;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final String str = this.f;
        final String str2 = this.i;
        final e eVar = this.e;
        d0Var.getClass();
        if (!(d0Var instanceof ps2)) {
            if (d0Var instanceof zs2) {
                final zs2 zs2Var = (zs2) d0Var;
                uo40 uo40Var = zs2Var.a;
                TextView textView = uo40Var.b;
                TextView textView2 = uo40Var.b;
                textView.setEnabled(true);
                textView2.setAlpha(1.0f);
                textView2.setClickable(true);
                op5.r(op5.a, b.f(textView2), null, 4);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: ilz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.l();
                        uo40 uo40Var2 = zs2Var.a;
                        uo40Var2.b.setAlpha(0.5f);
                        uo40Var2.b.setClickable(false);
                        uo40Var2.b.setEnabled(false);
                    }
                });
                return;
            }
            if (d0Var instanceof tp2) {
                final tp2 tp2Var = (tp2) d0Var;
                so40 so40Var = tp2Var.a;
                CardView cardView = so40Var.b;
                CardView cardView2 = so40Var.b;
                cardView.setEnabled(true);
                cardView2.setAlpha(1.0f);
                cardView2.setClickable(true);
                op5.r(op5.a, b.f(so40Var.c), null, 4);
                cardView2.setCardBackgroundColor(eVar.getColor(R.color.button_blue));
                cardView2.setOnClickListener(new View.OnClickListener() { // from class: jlz
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.k();
                        so40 so40Var2 = tp2Var.a;
                        so40Var2.b.setAlpha(0.5f);
                        so40Var2.b.setClickable(false);
                        so40Var2.b.setEnabled(false);
                    }
                });
                return;
            }
            return;
        }
        ipc item = getItem(i);
        item.getClass();
        BetHistoryItem betHistoryItem = ((ipc.i) item).a;
        final ps2 ps2Var = (ps2) d0Var;
        q820 q820Var = ps2Var.a;
        betHistoryItem.getClass();
        eVar.getClass();
        str.getClass();
        str2.getClass();
        ps2Var.b = betHistoryItem;
        q820Var.f.setOnClickListener(new View.OnClickListener() { // from class: kr2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ps2 ps2Var2 = ps2Var;
                BetHistoryItem betHistoryItem2 = ps2Var2.b;
                if (betHistoryItem2 == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                betHistoryItem2.setExpanded(!betHistoryItem2.isExpanded());
                BetHistoryItem betHistoryItem3 = ps2Var2.b;
                if (betHistoryItem3 == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                ps2Var2.a(eVar, betHistoryItem3, str, str2);
                BetHistoryItem betHistoryItem4 = ps2Var2.b;
                if (betHistoryItem4 != null) {
                    wz.a(betHistoryItem4.isExpanded() ? "ShowDetails" : "HideDetails", "Pocket Rockets", "BetHistoryModal");
                } else {
                    Intrinsics.n("dataItem");
                    throw null;
                }
            }
        });
        TextView textView3 = q820Var.P;
        AppCompatImageView appCompatImageView = q820Var.c;
        AppCompatTextView appCompatTextView = q820Var.d;
        AppCompatImageView appCompatImageView2 = q820Var.U;
        TextView textView4 = q820Var.L;
        TextView textView5 = q820Var.M;
        textView3.setText(kt2.d(betHistoryItem.getStartTime()));
        textView4.setText(kt2.c(betHistoryItem.getStakeAmount(), eVar));
        textView4.addOnLayoutChangeListener(new ls2(textView4));
        if (betHistoryItem.getPayoutAmount() <= 0.0d) {
            textView5.setText("Lost");
            textView5.setTag(eVar.getString(R.string.lost_cms));
            appCompatImageView2.setVisibility(8);
            appCompatTextView.setText("--");
            op5.r(op5.a, b.f(textView5), null, 4);
            appCompatImageView.setVisibility(8);
        } else {
            appCompatTextView.setText(eVar.getString(R.string.coeff, String.valueOf(betHistoryItem.getCashoutCoefficient())));
            appCompatImageView2.setVisibility(0);
            textView5.setText(kt2.c(betHistoryItem.getPayoutAmount(), eVar));
            textView5.addOnLayoutChangeListener(new ls2(textView5));
            if (str2.length() == 0) {
                appCompatImageView.setVisibility(8);
            } else {
                appCompatImageView.setVisibility(0);
            }
        }
        q820Var.A.setVisibility(betHistoryItem.getGiftAmount() <= 0.0d ? 8 : 0);
        ps2Var.a(eVar, betHistoryItem, str, str2);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            int i2 = zs2.b;
            return zs2.a.a(viewGroup);
        }
        if (i == 2) {
            int i3 = tp2.b;
            return tp2.a.a(viewGroup);
        }
        if (i != 10) {
            throw new ClassCastException(hce0.a(i, "Unknown viewType "));
        }
        int i4 = ps2.c;
        View viewA = u540.a(viewGroup, R.layout.pr_bethistory_item, viewGroup, false);
        int i5 = R.id.button_item_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.button_item_view, viewA);
        if (appCompatTextView != null) {
            i5 = R.id.card_info;
            if (((ConstraintLayout) h5e.a(R.id.card_info, viewA)) != null) {
                i5 = R.id.chat;
                AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.chat, viewA);
                if (appCompatImageView != null) {
                    i5 = R.id.coeff_item;
                    AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.coeff_item, viewA);
                    if (appCompatTextView2 != null) {
                        i5 = R.id.coeff_layer;
                        if (((LinearLayoutCompat) h5e.a(R.id.coeff_layer, viewA)) != null) {
                            i5 = R.id.coeff_prefix;
                            TextView textView = (TextView) h5e.a(R.id.coeff_prefix, viewA);
                            if (textView != null) {
                                i5 = R.id.details;
                                LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.details, viewA);
                                if (linearLayoutCompat != null) {
                                    i5 = R.id.fbg_amount_tv;
                                    TextView textView2 = (TextView) h5e.a(R.id.fbg_amount_tv, viewA);
                                    if (textView2 != null) {
                                        i5 = R.id.fbg_win_amount_tv;
                                        TextView textView3 = (TextView) h5e.a(R.id.fbg_win_amount_tv, viewA);
                                        if (textView3 != null) {
                                            i5 = R.id.free_bet_gift_tv;
                                            TextView textView4 = (TextView) h5e.a(R.id.free_bet_gift_tv, viewA);
                                            if (textView4 != null) {
                                                i5 = R.id.free_bet_gift_win_tv;
                                                TextView textView5 = (TextView) h5e.a(R.id.free_bet_gift_win_tv, viewA);
                                                if (textView5 != null) {
                                                    i5 = R.id.gift_detail;
                                                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.gift_detail, viewA);
                                                    if (constraintLayout != null) {
                                                        i5 = R.id.gift_icon;
                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.gift_icon, viewA);
                                                        if (appCompatImageView2 != null) {
                                                            i5 = R.id.gift_layout;
                                                            if (((ConstraintLayout) h5e.a(R.id.gift_layout, viewA)) != null) {
                                                                i5 = R.id.gift_layout_below;
                                                                if (((ConstraintLayout) h5e.a(R.id.gift_layout_below, viewA)) != null) {
                                                                    i5 = R.id.gift_paid_detail;
                                                                    if (((ConstraintLayout) h5e.a(R.id.gift_paid_detail, viewA)) != null) {
                                                                        i5 = R.id.gift_paid_detail_below;
                                                                        if (((ConstraintLayout) h5e.a(R.id.gift_paid_detail_below, viewA)) != null) {
                                                                            i5 = R.id.gift_paid_divider;
                                                                            View viewA2 = h5e.a(R.id.gift_paid_divider, viewA);
                                                                            if (viewA2 != null) {
                                                                                i5 = R.id.gift_win_detail;
                                                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.gift_win_detail, viewA);
                                                                                if (constraintLayout2 != null) {
                                                                                    i5 = R.id.gift_win_detail_below;
                                                                                    ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.gift_win_detail_below, viewA);
                                                                                    if (constraintLayout3 != null) {
                                                                                        i5 = R.id.gift_win_divider;
                                                                                        View viewA3 = h5e.a(R.id.gift_win_divider, viewA);
                                                                                        if (viewA3 != null) {
                                                                                            i5 = R.id.image_arrow_down;
                                                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.image_arrow_down, viewA);
                                                                                            if (appCompatImageView3 != null) {
                                                                                                i5 = R.id.image_arrow_up;
                                                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.image_arrow_up, viewA);
                                                                                                if (appCompatImageView4 != null) {
                                                                                                    i5 = R.id.more_detail_content;
                                                                                                    ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.more_detail_content, viewA);
                                                                                                    if (constraintLayout4 != null) {
                                                                                                        i5 = R.id.ou_coeff;
                                                                                                        if (((AppCompatTextView) h5e.a(R.id.ou_coeff, viewA)) != null) {
                                                                                                            i5 = R.id.over_under_coeff;
                                                                                                            if (((LinearLayoutCompat) h5e.a(R.id.over_under_coeff, viewA)) != null) {
                                                                                                                i5 = R.id.over_under_image;
                                                                                                                if (((ImageView) h5e.a(R.id.over_under_image, viewA)) != null) {
                                                                                                                    i5 = R.id.rocket_image;
                                                                                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.rocket_image, viewA);
                                                                                                                    if (appCompatImageView5 != null) {
                                                                                                                        i5 = R.id.round_id;
                                                                                                                        TextView textView6 = (TextView) h5e.a(R.id.round_id, viewA);
                                                                                                                        if (textView6 != null) {
                                                                                                                            i5 = R.id.round_layout;
                                                                                                                            if (((LinearLayoutCompat) h5e.a(R.id.round_layout, viewA)) != null) {
                                                                                                                                i5 = R.id.round_number;
                                                                                                                                TextView textView7 = (TextView) h5e.a(R.id.round_number, viewA);
                                                                                                                                if (textView7 != null) {
                                                                                                                                    i5 = R.id.stake_item_view;
                                                                                                                                    if (((LinearLayoutCompat) h5e.a(R.id.stake_item_view, viewA)) != null) {
                                                                                                                                        i5 = R.id.stake_tv;
                                                                                                                                        TextView textView8 = (TextView) h5e.a(R.id.stake_tv, viewA);
                                                                                                                                        if (textView8 != null) {
                                                                                                                                            i5 = R.id.status_item_view;
                                                                                                                                            TextView textView9 = (TextView) h5e.a(R.id.status_item_view, viewA);
                                                                                                                                            if (textView9 != null) {
                                                                                                                                                i5 = R.id.status_layer;
                                                                                                                                                if (((LinearLayoutCompat) h5e.a(R.id.status_layer, viewA)) != null) {
                                                                                                                                                    i5 = R.id.ticket_id;
                                                                                                                                                    TextView textView10 = (TextView) h5e.a(R.id.ticket_id, viewA);
                                                                                                                                                    if (textView10 != null) {
                                                                                                                                                        i5 = R.id.ticket_number;
                                                                                                                                                        UnderLineTextView underLineTextView = (UnderLineTextView) h5e.a(R.id.ticket_number, viewA);
                                                                                                                                                        if (underLineTextView != null) {
                                                                                                                                                            i5 = R.id.ticket_number_layout;
                                                                                                                                                            if (((LinearLayoutCompat) h5e.a(R.id.ticket_number_layout, viewA)) != null) {
                                                                                                                                                                i5 = R.id.time_item_view;
                                                                                                                                                                TextView textView11 = (TextView) h5e.a(R.id.time_item_view, viewA);
                                                                                                                                                                if (textView11 != null) {
                                                                                                                                                                    i5 = R.id.total_stake_amount_tv;
                                                                                                                                                                    TextView textView12 = (TextView) h5e.a(R.id.total_stake_amount_tv, viewA);
                                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                                        i5 = R.id.total_stake_tv;
                                                                                                                                                                        TextView textView13 = (TextView) h5e.a(R.id.total_stake_tv, viewA);
                                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                                            i5 = R.id.total_win_amount_tv;
                                                                                                                                                                            TextView textView14 = (TextView) h5e.a(R.id.total_win_amount_tv, viewA);
                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                i5 = R.id.total_win_tv;
                                                                                                                                                                                TextView textView15 = (TextView) h5e.a(R.id.total_win_tv, viewA);
                                                                                                                                                                                if (textView15 != null) {
                                                                                                                                                                                    i5 = R.id.win_image;
                                                                                                                                                                                    AppCompatImageView appCompatImageView6 = (AppCompatImageView) h5e.a(R.id.win_image, viewA);
                                                                                                                                                                                    if (appCompatImageView6 != null) {
                                                                                                                                                                                        i5 = R.id.you_paid_amount_tv;
                                                                                                                                                                                        TextView textView16 = (TextView) h5e.a(R.id.you_paid_amount_tv, viewA);
                                                                                                                                                                                        if (textView16 != null) {
                                                                                                                                                                                            i5 = R.id.you_paid_tv;
                                                                                                                                                                                            TextView textView17 = (TextView) h5e.a(R.id.you_paid_tv, viewA);
                                                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                                                i5 = R.id.you_win_amount_tv;
                                                                                                                                                                                                TextView textView18 = (TextView) h5e.a(R.id.you_win_amount_tv, viewA);
                                                                                                                                                                                                if (textView18 != null) {
                                                                                                                                                                                                    i5 = R.id.you_win_tv;
                                                                                                                                                                                                    TextView textView19 = (TextView) h5e.a(R.id.you_win_tv, viewA);
                                                                                                                                                                                                    if (textView19 != null) {
                                                                                                                                                                                                        i5 = R.id.your_pick_layer;
                                                                                                                                                                                                        if (((LinearLayoutCompat) h5e.a(R.id.your_pick_layer, viewA)) != null) {
                                                                                                                                                                                                            i5 = R.id.your_pick_prefix;
                                                                                                                                                                                                            TextView textView20 = (TextView) h5e.a(R.id.your_pick_prefix, viewA);
                                                                                                                                                                                                            if (textView20 != null) {
                                                                                                                                                                                                                i5 = R.id.your_pick_txt;
                                                                                                                                                                                                                TextView textView21 = (TextView) h5e.a(R.id.your_pick_txt, viewA);
                                                                                                                                                                                                                if (textView21 != null) {
                                                                                                                                                                                                                    return new ps2(new q820((LinearLayoutCompat) viewA, appCompatTextView, appCompatImageView, appCompatTextView2, textView, linearLayoutCompat, textView2, textView3, textView4, textView5, constraintLayout, appCompatImageView2, viewA2, constraintLayout2, constraintLayout3, viewA3, appCompatImageView3, appCompatImageView4, constraintLayout4, appCompatImageView5, textView6, textView7, textView8, textView9, textView10, underLineTextView, textView11, textView12, textView13, textView14, textView15, appCompatImageView6, textView16, textView17, textView18, textView19, textView20, textView21));
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
        bmy.a("Missing required view with ID: ".concat(viewA.getResources().getResourceName(i5)));
        return null;
    }
}
