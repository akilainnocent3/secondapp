package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.spinmatch.model.response.BetHistoryItem;
import java.util.ArrayList;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class lq80 extends mp2 {
    public Context e;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final Context context = this.e;
        d0Var.getClass();
        if (!(d0Var instanceof os2)) {
            if (d0Var instanceof bwu) {
                final bwu bwuVar = (bwu) d0Var;
                i260 i260Var = bwuVar.a;
                AppCompatButton appCompatButton = i260Var.b;
                AppCompatButton appCompatButton2 = i260Var.b;
                appCompatButton.setEnabled(true);
                appCompatButton2.setAlpha(1.0f);
                appCompatButton2.setClickable(true);
                op5 op5Var = op5.a;
                String string = context.getString(R.string.more_cms);
                appCompatButton2.setText(at6.a(string, context, R.string.more, op5Var, string));
                appCompatButton2.setOnClickListener(new View.OnClickListener() { // from class: jq80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.l();
                        i260 i260Var2 = bwuVar.a;
                        i260Var2.b.setAlpha(0.5f);
                        i260Var2.b.setClickable(false);
                        i260Var2.b.setEnabled(false);
                    }
                });
                return;
            }
            if (d0Var instanceof awu) {
                final awu awuVar = (awu) d0Var;
                g260 g260Var = awuVar.a;
                CardView cardView = g260Var.b;
                CardView cardView2 = g260Var.b;
                cardView.setEnabled(true);
                cardView2.setAlpha(1.0f);
                cardView2.setClickable(true);
                TextView textView = g260Var.c;
                op5 op5Var2 = op5.a;
                String string2 = context.getString(R.string.more_cms);
                textView.setText(at6.a(string2, context, R.string.more, op5Var2, string2));
                cardView2.setOnClickListener(new View.OnClickListener() { // from class: kq80
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.k();
                        g260 g260Var2 = awuVar.a;
                        g260Var2.b.setAlpha(0.5f);
                        g260Var2.b.setClickable(false);
                        g260Var2.b.setEnabled(false);
                    }
                });
                return;
            }
            return;
        }
        ipc item = getItem(i);
        item.getClass();
        BetHistoryItem betHistoryItem = ((ipc.l) item).a;
        final os2 os2Var = (os2) d0Var;
        r8b0 r8b0Var = os2Var.a;
        betHistoryItem.getClass();
        context.getClass();
        os2Var.b = betHistoryItem;
        r8b0Var.c.setOnClickListener(new View.OnClickListener() { // from class: as2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                wz.a("BetHistoryDetailClicked", "Spin Match", new String[0]);
                os2 os2Var2 = os2Var;
                BetHistoryItem betHistoryItem2 = os2Var2.b;
                if (betHistoryItem2 == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                betHistoryItem2.setExpanded(!betHistoryItem2.isExpanded());
                BetHistoryItem betHistoryItem3 = os2Var2.b;
                if (betHistoryItem3 != null) {
                    os2Var2.a(betHistoryItem3, context);
                } else {
                    Intrinsics.n("dataItem");
                    throw null;
                }
            }
        });
        TextView textView2 = r8b0Var.M;
        AppCompatImageView appCompatImageView = r8b0Var.V;
        TextView textView3 = r8b0Var.I;
        TextView textView4 = r8b0Var.J;
        TextView textView5 = r8b0Var.K;
        String createdAt = betHistoryItem.getCreatedAt();
        if (createdAt == null) {
            createdAt = "";
        }
        textView2.setText(kt2.d(createdAt));
        if (betHistoryItem.isFreeSpinRound()) {
            textView4.setText(context.getString(R.string.free_spin));
            textView4.setTextColor(context.getColor(R.color.free_spin_history_color));
            textView4.setTag(context.getString(R.string.free_spin_text_cms));
            op5.r(op5.a, b.f(textView4), null, 4);
        } else {
            Double stakeAmount = betHistoryItem.getStakeAmount();
            textView4.setText(kt2.b(stakeAmount != null ? stakeAmount.doubleValue() : 0.0d));
            textView4.setTextColor(context.getColor(R.color.white));
        }
        Double payoutAmount = betHistoryItem.getPayoutAmount();
        if ((payoutAmount != null ? payoutAmount.doubleValue() : 0.0d) <= 0.0d) {
            textView5.setText("Lost");
            textView5.setTextColor(context.getColor(R.color.white));
            appCompatImageView.setVisibility(8);
            textView5.setTag(context.getString(R.string.lost_cms));
            op5.r(op5.a, b.f(textView5), null, 4);
        } else if (betHistoryItem.getResult().isFreeSpin()) {
            textView5.setText(context.getString(R.string.free_spin));
            textView5.setTextColor(context.getColor(betHistoryItem.getResult().getColourCode()));
            appCompatImageView.setVisibility(8);
            textView5.setTag(context.getString(R.string.free_spin_text_cms));
            op5.r(op5.a, b.f(textView5), null, 4);
        } else {
            appCompatImageView.setVisibility(0);
            Double payoutAmount2 = betHistoryItem.getPayoutAmount();
            textView5.setText(kt2.b(payoutAmount2 != null ? payoutAmount2.doubleValue() : 0.0d));
            textView5.setTextColor(context.getColor(R.color.white));
        }
        r8b0Var.R.setText(os2.b(context, betHistoryItem.getWheel1Draw().getPayout()));
        r8b0Var.T.setText(os2.b(context, betHistoryItem.getWheel2Draw().getPayout()));
        TextView textView6 = r8b0Var.H;
        op5 op5Var3 = op5.a;
        String string3 = context.getString(R.string.result_text_cms);
        textView6.setText(at6.a(string3, context, R.string.result, op5Var3, string3).concat(" : "));
        TextView textView7 = r8b0Var.G;
        String string4 = context.getString(R.string.my_pick_text_cms);
        textView7.setText(at6.a(string4, context, R.string.my_picks, op5Var3, string4));
        if (betHistoryItem.getResult().isFreeSpin()) {
            textView3.setMaxLines(2);
            textView3.setText(context.getString(R.string.free_spin));
            textView3.setTag(context.getString(R.string.free_spin_text_cms));
            op5.r(op5Var3, b.f(textView3), null, 4);
        } else {
            textView3.setMaxLines(1);
            textView3.setText(os2.b(context, betHistoryItem.getResult().getPayout()));
        }
        AppCompatImageView appCompatImageView2 = r8b0Var.w;
        Double giftAmount = betHistoryItem.getGiftAmount();
        appCompatImageView2.setVisibility((giftAmount != null ? giftAmount.doubleValue() : 0.0d) <= 0.0d ? 8 : 0);
        ArrayList arrayListF = b.f(r8b0Var.S, r8b0Var.U);
        ArrayList arrayListF2 = b.f(null, null);
        op5Var3.getClass();
        op5.o(arrayListF, arrayListF2, context);
        os2Var.a(betHistoryItem, context);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            int i2 = bwu.b;
            return new bwu(i260.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
        if (i == 2) {
            int i3 = awu.b;
            return new awu(g260.a(LayoutInflater.from(viewGroup.getContext()), viewGroup));
        }
        if (i != 8) {
            throw new ClassCastException(hce0.a(i, "Unknown viewType "));
        }
        int i4 = os2.c;
        View viewA = u540.a(viewGroup, R.layout.spin_match_bethistory_item, viewGroup, false);
        int i5 = R.id.button_item_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.button_item_view, viewA);
        if (appCompatTextView != null) {
            i5 = R.id.details;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.details, viewA);
            if (linearLayoutCompat != null) {
                i5 = R.id.fbg_amount_tv;
                TextView textView = (TextView) h5e.a(R.id.fbg_amount_tv, viewA);
                if (textView != null) {
                    i5 = R.id.fbg_win_amount_tv;
                    TextView textView2 = (TextView) h5e.a(R.id.fbg_win_amount_tv, viewA);
                    if (textView2 != null) {
                        i5 = R.id.free_bet_gift_tv;
                        TextView textView3 = (TextView) h5e.a(R.id.free_bet_gift_tv, viewA);
                        if (textView3 != null) {
                            i5 = R.id.free_bet_gift_win_tv;
                            TextView textView4 = (TextView) h5e.a(R.id.free_bet_gift_win_tv, viewA);
                            if (textView4 != null) {
                                i5 = R.id.gift_detail;
                                ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.gift_detail, viewA);
                                if (constraintLayout != null) {
                                    i5 = R.id.gift_icon;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.gift_icon, viewA);
                                    if (appCompatImageView != null) {
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
                                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.image_arrow_down, viewA);
                                                                        if (appCompatImageView2 != null) {
                                                                            i5 = R.id.image_arrow_up;
                                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.image_arrow_up, viewA);
                                                                            if (appCompatImageView3 != null) {
                                                                                i5 = R.id.more_detail_content;
                                                                                ConstraintLayout constraintLayout4 = (ConstraintLayout) h5e.a(R.id.more_detail_content, viewA);
                                                                                if (constraintLayout4 != null) {
                                                                                    i5 = R.id.my_pick_list;
                                                                                    RecyclerView recyclerView = (RecyclerView) h5e.a(R.id.my_pick_list, viewA);
                                                                                    if (recyclerView != null) {
                                                                                        i5 = R.id.my_pick_text;
                                                                                        TextView textView5 = (TextView) h5e.a(R.id.my_pick_text, viewA);
                                                                                        if (textView5 != null) {
                                                                                            i5 = R.id.result;
                                                                                            TextView textView6 = (TextView) h5e.a(R.id.result, viewA);
                                                                                            if (textView6 != null) {
                                                                                                i5 = R.id.result_layout;
                                                                                                if (((ConstraintLayout) h5e.a(R.id.result_layout, viewA)) != null) {
                                                                                                    i5 = R.id.resultValue;
                                                                                                    TextView textView7 = (TextView) h5e.a(R.id.resultValue, viewA);
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
                                                                                                                        i5 = R.id.ticket_number;
                                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.ticket_number, viewA);
                                                                                                                        if (textView10 != null) {
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
                                                                                                                                                    i5 = R.id.wheel1_config;
                                                                                                                                                    TextView textView16 = (TextView) h5e.a(R.id.wheel1_config, viewA);
                                                                                                                                                    if (textView16 != null) {
                                                                                                                                                        i5 = R.id.wheel1_config_image;
                                                                                                                                                        ImageView imageView = (ImageView) h5e.a(R.id.wheel1_config_image, viewA);
                                                                                                                                                        if (imageView != null) {
                                                                                                                                                            i5 = R.id.wheel2_config;
                                                                                                                                                            TextView textView17 = (TextView) h5e.a(R.id.wheel2_config, viewA);
                                                                                                                                                            if (textView17 != null) {
                                                                                                                                                                i5 = R.id.wheel2_config_image;
                                                                                                                                                                ImageView imageView2 = (ImageView) h5e.a(R.id.wheel2_config_image, viewA);
                                                                                                                                                                if (imageView2 != null) {
                                                                                                                                                                    i5 = R.id.win_image;
                                                                                                                                                                    AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.win_image, viewA);
                                                                                                                                                                    if (appCompatImageView4 != null) {
                                                                                                                                                                        i5 = R.id.you_paid_amount_tv;
                                                                                                                                                                        TextView textView18 = (TextView) h5e.a(R.id.you_paid_amount_tv, viewA);
                                                                                                                                                                        if (textView18 != null) {
                                                                                                                                                                            i5 = R.id.you_paid_tv;
                                                                                                                                                                            TextView textView19 = (TextView) h5e.a(R.id.you_paid_tv, viewA);
                                                                                                                                                                            if (textView19 != null) {
                                                                                                                                                                                i5 = R.id.you_win_amount_tv;
                                                                                                                                                                                TextView textView20 = (TextView) h5e.a(R.id.you_win_amount_tv, viewA);
                                                                                                                                                                                if (textView20 != null) {
                                                                                                                                                                                    i5 = R.id.you_win_tv;
                                                                                                                                                                                    TextView textView21 = (TextView) h5e.a(R.id.you_win_tv, viewA);
                                                                                                                                                                                    if (textView21 != null) {
                                                                                                                                                                                        return new os2(new r8b0((LinearLayoutCompat) viewA, appCompatTextView, linearLayoutCompat, textView, textView2, textView3, textView4, constraintLayout, appCompatImageView, viewA2, constraintLayout2, constraintLayout3, viewA3, appCompatImageView2, appCompatImageView3, constraintLayout4, recyclerView, textView5, textView6, textView7, textView8, textView9, textView10, textView11, textView12, textView13, textView14, textView15, textView16, imageView, textView17, imageView2, appCompatImageView4, textView18, textView19, textView20, textView21));
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
