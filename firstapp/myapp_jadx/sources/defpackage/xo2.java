package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.constraintlayout.widget.Guideline;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.components.DeckCard;
import com.sportygames.commons.components.UnderLineTextView;
import com.sportygames.redblack.remote.models.BetHistoryItem;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class xo2 extends mp2 {
    public e e;

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        final e eVar = this.e;
        d0Var.getClass();
        if (d0Var instanceof us2) {
            ipc item = getItem(i);
            item.getClass();
            BetHistoryItem betHistoryItem = ((ipc.h) item).a;
            final us2 us2Var = (us2) d0Var;
            to40 to40Var = us2Var.a;
            betHistoryItem.getClass();
            eVar.getClass();
            us2Var.b = betHistoryItem;
            to40Var.c.setOnClickListener(new View.OnClickListener() { // from class: lr2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    us2 us2Var2 = us2Var;
                    BetHistoryItem betHistoryItem2 = us2Var2.b;
                    if (betHistoryItem2 == null) {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                    betHistoryItem2.setExpanded(!betHistoryItem2.isExpanded());
                    BetHistoryItem betHistoryItem3 = us2Var2.b;
                    if (betHistoryItem3 != null) {
                        us2Var2.a(betHistoryItem3, eVar);
                    } else {
                        Intrinsics.n("dataItem");
                        throw null;
                    }
                }
            });
            TextView textView = to40Var.H;
            AppCompatImageView appCompatImageView = to40Var.N;
            TextView textView2 = to40Var.F;
            textView.setText(kt2.d(betHistoryItem.getCreateTime()));
            to40Var.E.setText(kt2.b(betHistoryItem.getStakeAmount()));
            if (betHistoryItem.getPayoutAmount() <= 0.0d) {
                textView2.setText("Lost");
                op5.r(op5.a, b.f(textView2), null, 4);
                appCompatImageView.setVisibility(8);
            } else {
                appCompatImageView.setVisibility(0);
                textView2.setText(kt2.b(betHistoryItem.getPayoutAmount()));
            }
            to40Var.w.setVisibility(betHistoryItem.getGiftAmount() <= 0.0d ? 8 : 0);
            us2Var.a(betHistoryItem, eVar);
            return;
        }
        if (d0Var instanceof zs2) {
            final zs2 zs2Var = (zs2) d0Var;
            uo40 uo40Var = zs2Var.a;
            TextView textView3 = uo40Var.b;
            TextView textView4 = uo40Var.b;
            textView3.setEnabled(true);
            textView4.setAlpha(1.0f);
            textView4.setClickable(true);
            op5.r(op5.a, b.f(textView4), null, 4);
            textView4.setOnClickListener(new View.OnClickListener() { // from class: jo2
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
            TextView textView5 = so40Var.c;
            CardView cardView2 = so40Var.b;
            cardView.setEnabled(true);
            cardView2.setAlpha(1.0f);
            cardView2.setClickable(true);
            op5.r(op5.a, b.f(textView5), null, 4);
            textView5.setBackgroundColor(eVar.getColor(R.color.button_blue));
            cardView2.setOnClickListener(new View.OnClickListener() { // from class: oo2
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.a.k();
                    so40 so40Var2 = tp2Var.a;
                    so40Var2.b.setAlpha(0.5f);
                    so40Var2.b.setClickable(false);
                    so40Var2.b.setEnabled(false);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        viewGroup.getClass();
        if (i == 0) {
            int i2 = zs2.b;
            return zs2.a.a(viewGroup);
        }
        if (i != 1) {
            if (i != 2) {
                throw new ClassCastException(hce0.a(i, "Unknown viewType "));
            }
            int i3 = tp2.b;
            return tp2.a.a(viewGroup);
        }
        int i4 = us2.c;
        View viewA = u540.a(viewGroup, R.layout.redblack_bethistory_item, viewGroup, false);
        int i5 = R.id.button_item_view;
        AppCompatTextView appCompatTextView = (AppCompatTextView) h5e.a(R.id.button_item_view, viewA);
        if (appCompatTextView != null) {
            i5 = R.id.card_info;
            if (((ConstraintLayout) h5e.a(R.id.card_info, viewA)) != null) {
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
                                            i5 = R.id.gift_paid_detail;
                                            if (((Group) h5e.a(R.id.gift_paid_detail, viewA)) != null) {
                                                i5 = R.id.gift_paid_divider;
                                                View viewA2 = h5e.a(R.id.gift_paid_divider, viewA);
                                                if (viewA2 != null) {
                                                    i5 = R.id.gift_win_detail;
                                                    Group group = (Group) h5e.a(R.id.gift_win_detail, viewA);
                                                    if (group != null) {
                                                        i5 = R.id.gift_win_divider;
                                                        View viewA3 = h5e.a(R.id.gift_win_divider, viewA);
                                                        if (viewA3 != null) {
                                                            i5 = R.id.history_barrier_bottom;
                                                            if (((Barrier) h5e.a(R.id.history_barrier_bottom, viewA)) != null) {
                                                                i5 = R.id.history_barrier_top;
                                                                if (((Barrier) h5e.a(R.id.history_barrier_top, viewA)) != null) {
                                                                    i5 = R.id.history_guideline_center;
                                                                    if (((Guideline) h5e.a(R.id.history_guideline_center, viewA)) != null) {
                                                                        i5 = R.id.history_guideline_left;
                                                                        if (((Guideline) h5e.a(R.id.history_guideline_left, viewA)) != null) {
                                                                            i5 = R.id.history_guideline_right;
                                                                            if (((Guideline) h5e.a(R.id.history_guideline_right, viewA)) != null) {
                                                                                i5 = R.id.image_arrow_down;
                                                                                AppCompatImageView appCompatImageView2 = (AppCompatImageView) h5e.a(R.id.image_arrow_down, viewA);
                                                                                if (appCompatImageView2 != null) {
                                                                                    i5 = R.id.image_arrow_up;
                                                                                    AppCompatImageView appCompatImageView3 = (AppCompatImageView) h5e.a(R.id.image_arrow_up, viewA);
                                                                                    if (appCompatImageView3 != null) {
                                                                                        i5 = R.id.more_detail_content;
                                                                                        ConstraintLayout constraintLayout2 = (ConstraintLayout) h5e.a(R.id.more_detail_content, viewA);
                                                                                        if (constraintLayout2 != null) {
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
                                                                                                                i5 = R.id.ticket_number_layout;
                                                                                                                if (((LinearLayoutCompat) h5e.a(R.id.ticket_number_layout, viewA)) != null) {
                                                                                                                    i5 = R.id.time_item_view;
                                                                                                                    TextView textView7 = (TextView) h5e.a(R.id.time_item_view, viewA);
                                                                                                                    if (textView7 != null) {
                                                                                                                        i5 = R.id.total_stake_amount_tv;
                                                                                                                        TextView textView8 = (TextView) h5e.a(R.id.total_stake_amount_tv, viewA);
                                                                                                                        if (textView8 != null) {
                                                                                                                            i5 = R.id.total_stake_tv;
                                                                                                                            TextView textView9 = (TextView) h5e.a(R.id.total_stake_tv, viewA);
                                                                                                                            if (textView9 != null) {
                                                                                                                                i5 = R.id.total_win_amount_tv;
                                                                                                                                TextView textView10 = (TextView) h5e.a(R.id.total_win_amount_tv, viewA);
                                                                                                                                if (textView10 != null) {
                                                                                                                                    i5 = R.id.total_win_tv;
                                                                                                                                    TextView textView11 = (TextView) h5e.a(R.id.total_win_tv, viewA);
                                                                                                                                    if (textView11 != null) {
                                                                                                                                        i5 = R.id.user_card_select;
                                                                                                                                        DeckCard deckCard = (DeckCard) h5e.a(R.id.user_card_select, viewA);
                                                                                                                                        if (deckCard != null) {
                                                                                                                                            i5 = R.id.win_image;
                                                                                                                                            AppCompatImageView appCompatImageView4 = (AppCompatImageView) h5e.a(R.id.win_image, viewA);
                                                                                                                                            if (appCompatImageView4 != null) {
                                                                                                                                                i5 = R.id.you_paid_amount_tv;
                                                                                                                                                TextView textView12 = (TextView) h5e.a(R.id.you_paid_amount_tv, viewA);
                                                                                                                                                if (textView12 != null) {
                                                                                                                                                    i5 = R.id.you_paid_tv;
                                                                                                                                                    TextView textView13 = (TextView) h5e.a(R.id.you_paid_tv, viewA);
                                                                                                                                                    if (textView13 != null) {
                                                                                                                                                        i5 = R.id.you_win_amount_tv;
                                                                                                                                                        TextView textView14 = (TextView) h5e.a(R.id.you_win_amount_tv, viewA);
                                                                                                                                                        if (textView14 != null) {
                                                                                                                                                            i5 = R.id.you_win_tv;
                                                                                                                                                            TextView textView15 = (TextView) h5e.a(R.id.you_win_tv, viewA);
                                                                                                                                                            if (textView15 != null) {
                                                                                                                                                                i5 = R.id.your_card;
                                                                                                                                                                TextView textView16 = (TextView) h5e.a(R.id.your_card, viewA);
                                                                                                                                                                if (textView16 != null) {
                                                                                                                                                                    i5 = R.id.your_pick_layer;
                                                                                                                                                                    if (((LinearLayoutCompat) h5e.a(R.id.your_pick_layer, viewA)) != null) {
                                                                                                                                                                        i5 = R.id.your_pick_prefix;
                                                                                                                                                                        TextView textView17 = (TextView) h5e.a(R.id.your_pick_prefix, viewA);
                                                                                                                                                                        if (textView17 != null) {
                                                                                                                                                                            i5 = R.id.your_pick_txt;
                                                                                                                                                                            TextView textView18 = (TextView) h5e.a(R.id.your_pick_txt, viewA);
                                                                                                                                                                            if (textView18 != null) {
                                                                                                                                                                                return new us2(new to40((LinearLayoutCompat) viewA, appCompatTextView, linearLayoutCompat, textView, textView2, textView3, textView4, constraintLayout, appCompatImageView, viewA2, group, viewA3, appCompatImageView2, appCompatImageView3, constraintLayout2, textView5, textView6, underLineTextView, textView7, textView8, textView9, textView10, textView11, deckCard, appCompatImageView4, textView12, textView13, textView14, textView15, textView16, textView17, textView18));
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
