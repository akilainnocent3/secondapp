package defpackage;

import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.jackpot.data.Order;
import com.sportybet.plugin.jackpot.data.RBetDataBase;
import com.sportybet.plugin.jackpot.data.RLoadMoreItem;
import com.sportybet.plugin.jackpot.data.ROrderWrapper;
import com.sportybet.plugin.jackpot.data.SportBet;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class kr30 extends RecyclerView.f<c> {
    public ArrayList a;
    public e b;

    public class a extends c implements View.OnClickListener {
        public final View A;
        public final View B;
        public final RelativeLayout a;
        public final RelativeLayout b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;
        public final TextView z;

        public a(View view) {
            super(view);
            RelativeLayout relativeLayout = (RelativeLayout) view.findViewById(R.id.r_jackpot_bet_root);
            this.b = relativeLayout;
            this.a = (RelativeLayout) view.findViewById(R.id.r_jackpot_bet_title_layout);
            relativeLayout.setOnClickListener(this);
            this.c = (TextView) view.findViewById(R.id.r_jackpot_bet_type);
            this.d = (TextView) view.findViewById(R.id.r_jackpot_bet_status);
            this.e = (TextView) view.findViewById(R.id.r_jackpot_bet_day);
            this.f = (TextView) view.findViewById(R.id.r_jackpot_bet_date);
            this.i = (TextView) view.findViewById(R.id.r_jackpot_bet_year);
            ((TextView) view.findViewById(R.id.r_jackpot_bet_total_stake)).setText(sn5.b(kr30.this.b, R.string.bet_history__total_stake_with_stake, a8b.d().trim()));
            this.v = (TextView) view.findViewById(R.id.r_jackpot_bet_total_stake_value);
            this.w = (TextView) view.findViewById(R.id.r_jackpot_bet_total_return_value);
            this.y = (TextView) view.findViewById(R.id.r_jackpot_round_number);
            this.z = (TextView) view.findViewById(R.id.r_jackpot_bet_pending_desc);
            this.A = view.findViewById(R.id.r_jackpot_bet_item_divider_line);
            this.B = view.findViewById(R.id.r_jackpot_bet_top_divider_line);
        }

        @Override // kr30.c
        public final void a(int i) {
            String strB;
            Drawable drawableA;
            kr30 kr30Var = kr30.this;
            e eVar = kr30Var.b;
            Object obj = kr30Var.a.get(i);
            if (obj instanceof ROrderWrapper) {
                ROrderWrapper rOrderWrapper = (ROrderWrapper) obj;
                Order order = rOrderWrapper.order;
                Object[] objArr = {order.periodNumber};
                TextView textView = this.y;
                textView.setText(sn5.c(textView, R.string.common_functions__round_no, objArr));
                TextView textView2 = this.z;
                textView2.setVisibility(8);
                TextView textView3 = this.f;
                textView3.setVisibility(4);
                TextView textView4 = this.e;
                textView4.setVisibility(4);
                TextView textView5 = this.i;
                textView5.setVisibility(8);
                View view = this.A;
                view.setVisibility(8);
                View view2 = this.B;
                view2.setVisibility(8);
                long j = order.createTime;
                bwf0 bwf0Var = bwf0.a;
                textView4.setText(bwf0Var.a(j));
                textView4.setVisibility(rOrderWrapper.dateShowEnabled ? 0 : 4);
                textView3.setText(bwf0Var.v(order.createTime));
                textView3.setVisibility(rOrderWrapper.dateShowEnabled ? 0 : 4);
                textView5.setText(bwf0Var.x(order.createTime));
                textView5.setVisibility(rOrderWrapper.yearShowEnabled ? 0 : 8);
                if (i == 0) {
                    view2.setVisibility(8);
                } else {
                    view2.setVisibility(rOrderWrapper.dateShowEnabled ? 0 : 8);
                }
                view.setVisibility(rOrderWrapper.dateShowEnabled ? 8 : 0);
                int i2 = order.winningStatus;
                int i3 = R.color.custom_text_type2_primary_type2;
                int i4 = R.color.text_type1_tertiary;
                String strP = "--";
                int i5 = R.color.text_type1_primary;
                if (i2 != 0) {
                    if (i2 == 5) {
                        strB = sn5.b(eVar, R.string.bet_history__partial_win, new Object[0]);
                        strP = bjb0.P(order.totalWinnings, Locale.US);
                        drawableA = null;
                        i5 = R.color.brand_secondary;
                    } else if (i2 != 20) {
                        if (i2 != 30) {
                            if (i2 == 40) {
                                strB = sn5.b(eVar, R.string.bet_history__void, new Object[0]);
                                if (!TextUtils.isEmpty(order.refundAmount)) {
                                    strP = bjb0.P(order.refundAmount, Locale.US);
                                }
                            } else if (i2 != 90) {
                                strB = "";
                            } else {
                                strB = sn5.b(eVar, R.string.component_wap_share_bet__pending, new Object[0]);
                                drawableA = gr0.a(eVar, R.drawable.jap_pending_icon_10dp);
                                textView2.setVisibility(0);
                            }
                            TextView textView6 = this.d;
                            textView6.setTextColor(c8i0.d(i3, textView6));
                            textView6.setText(strB);
                            TextView textView7 = this.c;
                            textView7.setTextColor(c8i0.d(i3, textView7));
                            textView7.setText(sn5.c(textView7, R.string.jackpot__sporty_games, order.betType));
                            textView6.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, iwh0.a(eVar, R.drawable.jap_ic_keyboard_arrow_right_black_24dp, -1), (Drawable) null);
                            RelativeLayout relativeLayout = this.a;
                            relativeLayout.setBackgroundColor(c8i0.d(i4, relativeLayout));
                            this.b.setTag(Integer.valueOf(i));
                            this.v.setText(bjb0.P(order.totalStake, Locale.US));
                            TextView textView8 = this.w;
                            textView8.setTextColor(c8i0.d(i5, textView8));
                            textView8.setText(strP);
                        }
                        strB = sn5.b(eVar, R.string.bet_history__lost, new Object[0]).concat(sn5.b(eVar, R.string.jackpot__correct_out_of_type, String.valueOf(order.correctEvents), order.betType));
                        strP = "0.00";
                        i4 = R.color.line_type1_secondary;
                        drawableA = null;
                    } else {
                        strB = sn5.b(eVar, R.string.bet_history__won, new Object[0]);
                        strP = bjb0.P(order.totalWinnings, Locale.US);
                        drawableA = iwh0.a(eVar, R.drawable.ic_spr_bet_history_win, -1);
                        i4 = R.color.brand_secondary;
                        i5 = i4;
                    }
                    i3 = R.color.text_type2_primary;
                    TextView textView9 = this.d;
                    textView9.setTextColor(c8i0.d(i3, textView9));
                    textView9.setText(strB);
                    TextView textView10 = this.c;
                    textView10.setTextColor(c8i0.d(i3, textView10));
                    textView10.setText(sn5.c(textView10, R.string.jackpot__sporty_games, order.betType));
                    textView9.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, iwh0.a(eVar, R.drawable.jap_ic_keyboard_arrow_right_black_24dp, -1), (Drawable) null);
                    RelativeLayout relativeLayout2 = this.a;
                    relativeLayout2.setBackgroundColor(c8i0.d(i4, relativeLayout2));
                    this.b.setTag(Integer.valueOf(i));
                    this.v.setText(bjb0.P(order.totalStake, Locale.US));
                    TextView textView11 = this.w;
                    textView11.setTextColor(c8i0.d(i5, textView11));
                    textView11.setText(strP);
                }
                strB = sn5.b(eVar, R.string.component_wap_share_bet__running, new Object[0]);
                drawableA = null;
                TextView textView12 = this.d;
                textView12.setTextColor(c8i0.d(i3, textView12));
                textView12.setText(strB);
                TextView textView13 = this.c;
                textView13.setTextColor(c8i0.d(i3, textView13));
                textView13.setText(sn5.c(textView13, R.string.jackpot__sporty_games, order.betType));
                textView12.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, iwh0.a(eVar, R.drawable.jap_ic_keyboard_arrow_right_black_24dp, -1), (Drawable) null);
                RelativeLayout relativeLayout3 = this.a;
                relativeLayout3.setBackgroundColor(c8i0.d(i4, relativeLayout3));
                this.b.setTag(Integer.valueOf(i));
                this.v.setText(bjb0.P(order.totalStake, Locale.US));
                TextView textView14 = this.w;
                textView14.setTextColor(c8i0.d(i5, textView14));
                textView14.setText(strP);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            int iIntValue;
            kr30 kr30Var = kr30.this;
            e eVar = kr30Var.b;
            if (!(view instanceof RelativeLayout) || (iIntValue = ((Integer) view.getTag()).intValue()) >= kr30Var.a.size() || iIntValue < 0 || !(kr30Var.a.get(iIntValue) instanceof ROrderWrapper)) {
                return;
            }
            ROrderWrapper rOrderWrapper = (ROrderWrapper) kr30Var.a.get(iIntValue);
            Intent intent = new Intent(eVar, (Class<?>) RSportsBetTicketDetailsActivity.class);
            intent.putExtra("key_order", rOrderWrapper.order);
            yrh0.s(eVar, intent, true);
        }
    }

    public class b extends c {
        public final ProgressBar a;
        public final TextView b;
        public RLoadMoreItem c;
        public final lo0 d;

        public class a implements View.OnClickListener {
            public a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                b bVar = b.this;
                RLoadMoreItem rLoadMoreItem = bVar.c;
                if (rLoadMoreItem == null || !rLoadMoreItem.moreEvents) {
                    return;
                }
                bVar.b();
            }
        }

        /* JADX INFO: renamed from: kr30$b$b, reason: collision with other inner class name */
        public class C0781b implements gv5<BaseResponse<SportBet>> {
            public C0781b() {
            }

            @Override // defpackage.gv5
            public final void onFailure(su5<BaseResponse<SportBet>> su5Var, Throwable th) {
                b bVar = b.this;
                TextView textView = bVar.b;
                bVar.c.mJackpotListPending = null;
                kr30 kr30Var = kr30.this;
                if (kr30Var.b.isFinishing() || su5Var.isCanceled()) {
                    return;
                }
                bVar.a.setVisibility(8);
                textView.setVisibility(0);
                textView.setText(sn5.b(kr30Var.b, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
            }

            @Override // defpackage.gv5
            public final void onResponse(su5<BaseResponse<SportBet>> su5Var, bi50<BaseResponse<SportBet>> bi50Var) {
                BaseResponse<SportBet> baseResponse;
                List<Order> list;
                b bVar = b.this;
                TextView textView = bVar.b;
                bVar.c.mJackpotListPending = null;
                kr30 kr30Var = kr30.this;
                if (kr30Var.b.isFinishing() || su5Var.isCanceled()) {
                    return;
                }
                if (!bi50Var.a.getIsSuccessful() || (baseResponse = bi50Var.b) == null || !baseResponse.hasData() || (list = baseResponse.data.orders) == null) {
                    bVar.a.setVisibility(8);
                    textView.setVisibility(0);
                    textView.setText(sn5.b(kr30Var.b, R.string.common_feedback__loading_failed_tap_to_reload, new Object[0]));
                    return;
                }
                ArrayList arrayListA = ikk.a(bVar.c.lastCreateTime, list);
                if (arrayListA.size() > 0) {
                    bVar.c.lastId = baseResponse.data.orders.get(arrayListA.size() - 1).orderId;
                    bVar.c.lastCreateTime = baseResponse.data.orders.get(arrayListA.size() - 1).createTime;
                    ArrayList arrayList = kr30Var.a;
                    arrayList.addAll(arrayList.size() - 1, arrayListA);
                    kr30Var.notifyItemRangeInserted(kr30Var.a.size() - 1, arrayListA.size());
                }
                bVar.c.moreEvents = baseResponse.data.totalNum > kr30Var.a.size() - 1;
                kr30Var.notifyItemChanged(kr30Var.a.size() - 1);
            }
        }

        public b(View view) {
            super(view);
            this.d = t5p.a();
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.results_loading_progress);
            this.a = progressBar;
            progressBar.getIndeterminateDrawable().setColorFilter(view.getContext().getColor(R.color.text_type2_tertiary), PorterDuff.Mode.SRC_IN);
            TextView textView = (TextView) view.findViewById(R.id.results_load_more);
            this.b = textView;
            textView.setText(sn5.c(textView, R.string.bet_history__no_more_tickets, new Object[0]));
            textView.setOnClickListener(new a());
        }

        @Override // kr30.c
        public final void a(int i) {
            kr30 kr30Var = kr30.this;
            if (kr30Var.a.get(i) instanceof RLoadMoreItem) {
                this.c = (RLoadMoreItem) kr30Var.a.get(i);
                b();
            }
        }

        public final void b() {
            boolean z = this.c.moreEvents;
            TextView textView = this.b;
            ProgressBar progressBar = this.a;
            if (!z) {
                progressBar.setVisibility(8);
                textView.setVisibility(0);
                if (this.c.showNoMoreTickets) {
                    textView.setText(sn5.b(kr30.this.b, R.string.bet_history__no_more_tickets, new Object[0]));
                    return;
                } else {
                    textView.setText("");
                    return;
                }
            }
            progressBar.setVisibility(0);
            textView.setVisibility(8);
            RLoadMoreItem rLoadMoreItem = this.c;
            if (rLoadMoreItem.mJackpotListPending == null) {
                int i = rLoadMoreItem.isSettled;
                if (i == -1) {
                    i = 10;
                }
                rLoadMoreItem.mJackpotListPending = this.d.g(i, rLoadMoreItem.lastId, 10);
                this.c.mJackpotListPending.G(new C0781b());
            }
        }
    }

    public abstract class c extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.a.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return ((RBetDataBase) this.a.get(i)).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((c) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new a(dzc.a(viewGroup, R.layout.jap_jackpot_bet_history_item, viewGroup, false));
        }
        if (i != 2) {
            return null;
        }
        return new b(dzc.a(viewGroup, R.layout.jap_bets_load_more_item_jackpot, viewGroup, false));
    }
}
