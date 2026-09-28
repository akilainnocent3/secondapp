package defpackage;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.fruithunt.network.models.FHBetHistoryItem;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class x5h extends mp2 {
    public Activity e;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        d0Var.getClass();
        if (!(d0Var instanceof u5h)) {
            if (d0Var instanceof y5h) {
                final y5h y5hVar = (y5h) d0Var;
                xih xihVar = y5hVar.a;
                TextView textView = xihVar.b;
                TextView textView2 = xihVar.b;
                textView.setEnabled(true);
                textView2.setAlpha(1.0f);
                textView2.setClickable(true);
                op5.r(op5.a, b.f(textView2), null, 4);
                textView2.setOnClickListener(new View.OnClickListener() { // from class: w5h
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        this.a.l();
                        xih xihVar2 = y5hVar.a;
                        xihVar2.b.setAlpha(0.5f);
                        xihVar2.b.setClickable(false);
                        xihVar2.b.setEnabled(false);
                    }
                });
                return;
            }
            return;
        }
        ipc item = getItem(i);
        item.getClass();
        final u5h u5hVar = (u5h) d0Var;
        final Activity activity = this.e;
        final FHBetHistoryItem fHBetHistoryItem = ((ipc.m) item).a;
        wih wihVar = u5hVar.a;
        activity.getClass();
        fHBetHistoryItem.getClass();
        u5hVar.a(fHBetHistoryItem, activity);
        wihVar.c.setOnClickListener(new View.OnClickListener() { // from class: s5h
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FHBetHistoryItem fHBetHistoryItem2 = fHBetHistoryItem;
                fHBetHistoryItem2.setExpanded(!fHBetHistoryItem2.isExpanded());
                u5hVar.a(fHBetHistoryItem2, activity);
            }
        });
        AppCompatTextView appCompatTextView = wihVar.K;
        AppCompatImageView appCompatImageView = wihVar.D;
        AppCompatImageView appCompatImageView2 = wihVar.T;
        AppCompatTextView appCompatTextView2 = wihVar.P;
        String createdAt = fHBetHistoryItem.getCreatedAt();
        if (createdAt == null) {
            createdAt = "";
        }
        appCompatTextView.setText(kt2.d(createdAt));
        TextView textView3 = wihVar.H;
        Double stakeAmount = fHBetHistoryItem.getStakeAmount();
        textView3.setText(kt2.b(stakeAmount != null ? stakeAmount.doubleValue() : 0.0d));
        Double payoutAmount = fHBetHistoryItem.getPayoutAmount();
        double dDoubleValue = payoutAmount != null ? payoutAmount.doubleValue() : 0.0d;
        TextView textView4 = wihVar.I;
        if (dDoubleValue <= 0.0d) {
            textView4.setText(m7i0.b(activity, R.string.fh_bet_history_lost_cms, R.string.fh_bet_history_lost));
            appCompatImageView2.setVisibility(8);
        } else {
            Double payoutAmount2 = fHBetHistoryItem.getPayoutAmount();
            textView4.setText(kt2.b(payoutAmount2 != null ? payoutAmount2.doubleValue() : 0.0d));
            appCompatImageView2.setVisibility(0);
        }
        AppCompatImageView appCompatImageView3 = wihVar.w;
        Double giftAmount = fHBetHistoryItem.getGiftAmount();
        appCompatImageView3.setVisibility((giftAmount != null ? giftAmount.doubleValue() : 0.0d) > 0.0d ? 0 : 8);
        boolean zG = Intrinsics.g(fHBetHistoryItem.getFixedOdds(), Boolean.TRUE);
        View view = wihVar.S;
        if (!zG) {
            view.setVisibility(8);
            appCompatTextView2.setVisibility(4);
            appCompatImageView.setVisibility(8);
        } else {
            view.setVisibility(0);
            appCompatTextView2.setVisibility(0);
            appCompatImageView.setVisibility(0);
            pfd pfdVar = fse.a;
            ej5.c(w5b.a(gku.a), null, null, new v5h(activity, u5hVar, null), 3);
            appCompatTextView2.setText(m7i0.b(activity, R.string.menu_fixed_coeff_cms, R.string.menu_fixed_coeff));
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            int i2 = y5h.b;
            return y5h.a.a(viewGroup);
        }
        if (i == 2) {
            int i3 = y5h.b;
            return y5h.a.a(viewGroup);
        }
        if (i != 7) {
            throw new ClassCastException(hce0.a(i, "Unknown viewType "));
        }
        int i4 = u5h.b;
        View viewA = u540.a(viewGroup, R.layout.fh_bethistory_item, viewGroup, false);
        int i5 = R.id.button_item_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.button_item_view, viewA);
        if (appCompatTextView != null) {
            i5 = R.id.details;
            LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) h5e.a(R.id.details, viewA);
            if (linearLayoutCompat != null) {
                i5 = R.id.fbg_amount_tv;
                TextView textView = (TextView) h5e.a(R.id.fbg_amount_tv, viewA);
                if (textView != null) {
                    i5 = R.id.fbgView;
                    ConstraintLayout constraintLayout = (ConstraintLayout) h5e.a(R.id.fbgView, viewA);
                    if (constraintLayout != null) {
                        i5 = R.id.fbg_win_amount_tv;
                        TextView textView2 = (TextView) h5e.a(R.id.fbg_win_amount_tv, viewA);
                        if (textView2 != null) {
                            i5 = R.id.free_bet_gift_tv;
                            TextView textView3 = (TextView) h5e.a(R.id.free_bet_gift_tv, viewA);
                            if (textView3 != null) {
                                i5 = R.id.free_bet_gift_win_tv;
                                TextView textView4 = (TextView) h5e.a(R.id.free_bet_gift_win_tv, viewA);
                                if (textView4 != null) {
                                    i5 = R.id.gift_icon;
                                    AppCompatImageView appCompatImageView = (AppCompatImageView) h5e.a(R.id.gift_icon, viewA);
                                    if (appCompatImageView != null) {
                                        i5 = R.id.gift_paid_detail;
                                        if (((ConstraintLayout) h5e.a(R.id.gift_paid_detail, viewA)) != null) {
                                            i5 = R.id.gift_paid_divider;
                                            View viewA2 = h5e.a(R.id.gift_paid_divider, viewA);
                                            if (viewA2 != null) {
                                                i5 = R.id.gift_win_detail;
                                                ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.gift_win_detail, viewA);
                                                if (constraintLayout2 != null) {
                                                    i5 = R.id.gift_win_divider;
                                                    View viewA3 = h5e.a(R.id.gift_win_divider, viewA);
                                                    if (viewA3 != null) {
                                                        i5 = R.id.image_arrow_down;
                                                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.image_arrow_down, viewA);
                                                        if (appCompatImageView2 != null) {
                                                            i5 = R.id.image_arrow_up;
                                                            AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.image_arrow_up, viewA);
                                                            if (appCompatImageView3 != null) {
                                                                i5 = R.id.ivBetFixedCoEff;
                                                                AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.ivBetFixedCoEff, viewA);
                                                                if (appCompatImageView4 != null) {
                                                                    i5 = R.id.ivFruitImage;
                                                                    AppCompatImageView appCompatImageView5 = (AppCompatImageView) h5e.a(R.id.ivFruitImage, viewA);
                                                                    if (appCompatImageView5 != null) {
                                                                        i5 = R.id.ivResult;
                                                                        AppCompatImageView appCompatImageView6 = (AppCompatImageView) h5e.a(R.id.ivResult, viewA);
                                                                        if (appCompatImageView6 != null) {
                                                                            i5 = R.id.ivTicket;
                                                                            if (((AppCompatImageView) h5e.a(R.id.ivTicket, viewA)) != null) {
                                                                                i5 = R.id.layFruitHistory;
                                                                                if (((ConstraintLayout) h5e.a(R.id.layFruitHistory, viewA)) != null) {
                                                                                    i5 = R.id.layTicket;
                                                                                    if (((ConstraintLayout) h5e.a(R.id.layTicket, viewA)) != null) {
                                                                                        i5 = R.id.lySummary;
                                                                                        if (((ConstraintLayout) h5e.a(R.id.lySummary, viewA)) != null) {
                                                                                            i5 = R.id.more_detail_content;
                                                                                            ConstraintLayout constraintLayout3 = (ConstraintLayout) h5e.a(R.id.more_detail_content, viewA);
                                                                                            if (constraintLayout3 != null) {
                                                                                                i5 = R.id.splash;
                                                                                                if (((ConstraintLayout) h5e.a(R.id.splash, viewA)) != null) {
                                                                                                    i5 = R.id.stake_item_view;
                                                                                                    if (((LinearLayoutCompat) h5e.a(R.id.stake_item_view, viewA)) != null) {
                                                                                                        i5 = R.id.stake_tv;
                                                                                                        TextView textView5 = (TextView) h5e.a(R.id.stake_tv, viewA);
                                                                                                        if (textView5 != null) {
                                                                                                            i5 = R.id.status_item_view;
                                                                                                            TextView textView6 = (TextView) h5e.a(R.id.status_item_view, viewA);
                                                                                                            if (textView6 != null) {
                                                                                                                i5 = R.id.status_layer;
                                                                                                                if (((LinearLayoutCompat) h5e.a(R.id.status_layer, viewA)) != null) {
                                                                                                                    i5 = R.id.ticket_number;
                                                                                                                    UnderLineTextView underLineTextView = (UnderLineTextView) h5e.a(R.id.ticket_number, viewA);
                                                                                                                    if (underLineTextView != null) {
                                                                                                                        i5 = R.id.time_item_view;
                                                                                                                        AppCompatTextView appCompatTextView2 = (AppCompatTextView) h5e.a(R.id.time_item_view, viewA);
                                                                                                                        if (appCompatTextView2 != null) {
                                                                                                                            i5 = R.id.total_stake_amount_tv;
                                                                                                                            TextView textView7 = (TextView) h5e.a(R.id.total_stake_amount_tv, viewA);
                                                                                                                            if (textView7 != null) {
                                                                                                                                i5 = R.id.total_stake_tv;
                                                                                                                                TextView textView8 = (TextView) h5e.a(R.id.total_stake_tv, viewA);
                                                                                                                                if (textView8 != null) {
                                                                                                                                    i5 = R.id.total_win_amount_tv;
                                                                                                                                    TextView textView9 = (TextView) h5e.a(R.id.total_win_amount_tv, viewA);
                                                                                                                                    if (textView9 != null) {
                                                                                                                                        i5 = R.id.total_win_tv;
                                                                                                                                        TextView textView10 = (TextView) h5e.a(R.id.total_win_tv, viewA);
                                                                                                                                        if (textView10 != null) {
                                                                                                                                            i5 = R.id.tvBetFixedCoEff;
                                                                                                                                            AppCompatTextView appCompatTextView3 = (AppCompatTextView) h5e.a(R.id.tvBetFixedCoEff, viewA);
                                                                                                                                            if (appCompatTextView3 != null) {
                                                                                                                                                i5 = R.id.tvResultNX;
                                                                                                                                                AppCompatTextView appCompatTextView4 = (AppCompatTextView) h5e.a(R.id.tvResultNX, viewA);
                                                                                                                                                if (appCompatTextView4 != null) {
                                                                                                                                                    i5 = R.id.tvResultRotten;
                                                                                                                                                    AppCompatTextView appCompatTextView5 = (AppCompatTextView) h5e.a(R.id.tvResultRotten, viewA);
                                                                                                                                                    if (appCompatTextView5 != null) {
                                                                                                                                                        i5 = R.id.viewFixedCoeff;
                                                                                                                                                        View viewA4 = h5e.a(R.id.viewFixedCoeff, viewA);
                                                                                                                                                        if (viewA4 != null) {
                                                                                                                                                            i5 = R.id.win_image;
                                                                                                                                                            AppCompatImageView appCompatImageView7 = (AppCompatImageView) h5e.a(R.id.win_image, viewA);
                                                                                                                                                            if (appCompatImageView7 != null) {
                                                                                                                                                                i5 = R.id.you_paid_amount_tv;
                                                                                                                                                                TextView textView11 = (TextView) h5e.a(R.id.you_paid_amount_tv, viewA);
                                                                                                                                                                if (textView11 != null) {
                                                                                                                                                                    i5 = R.id.you_paid_tv;
                                                                                                                                                                    TextView textView12 = (TextView) h5e.a(R.id.you_paid_tv, viewA);
                                                                                                                                                                    if (textView12 != null) {
                                                                                                                                                                        i5 = R.id.you_win_amount_tv;
                                                                                                                                                                        TextView textView13 = (TextView) h5e.a(R.id.you_win_amount_tv, viewA);
                                                                                                                                                                        if (textView13 != null) {
                                                                                                                                                                            i5 = R.id.you_win_tv;
                                                                                                                                                                            TextView textView14 = (TextView) h5e.a(R.id.you_win_tv, viewA);
                                                                                                                                                                            if (textView14 != null) {
                                                                                                                                                                                i5 = R.id.your_pick_prefix;
                                                                                                                                                                                AppCompatTextView appCompatTextView6 = (AppCompatTextView) h5e.a(R.id.your_pick_prefix, viewA);
                                                                                                                                                                                if (appCompatTextView6 != null) {
                                                                                                                                                                                    return new u5h(new wih((ConstraintLayout) viewA, appCompatTextView, linearLayoutCompat, textView, constraintLayout, textView2, textView3, textView4, appCompatImageView, viewA2, constraintLayout2, viewA3, appCompatImageView2, appCompatImageView3, appCompatImageView4, appCompatImageView5, appCompatImageView6, constraintLayout3, textView5, textView6, underLineTextView, appCompatTextView2, textView7, textView8, textView9, textView10, appCompatTextView3, appCompatTextView4, appCompatTextView5, viewA4, appCompatImageView7, textView11, textView12, textView13, textView14, appCompatTextView6));
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
