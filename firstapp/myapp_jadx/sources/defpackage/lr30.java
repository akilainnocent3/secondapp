package defpackage;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.core.model.realsports.Order;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: classes7.dex */
public final class lr30 extends RecyclerView.f<c> {
    public ArrayList a;
    public e b;

    public class a extends c {
        public final ProgressBar a;
        public final TextView b;
        public nr30 c;
        public final h3z d;

        /* JADX INFO: renamed from: lr30$a$a, reason: collision with other inner class name */
        public class ViewOnClickListenerC0834a implements View.OnClickListener {
            public ViewOnClickListenerC0834a() {
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                a aVar = a.this;
                nr30 nr30Var = aVar.c;
                if (nr30Var == null || !nr30Var.a) {
                    return;
                }
                aVar.b();
            }
        }

        public a(View view) {
            super(view);
            this.d = ap0.f();
            ProgressBar progressBar = (ProgressBar) view.findViewById(R.id.results_loading_progress);
            this.a = progressBar;
            progressBar.getIndeterminateDrawable().setColorFilter(view.getContext().getColor(R.color.text_type2_tertiary), PorterDuff.Mode.SRC_IN);
            TextView textView = (TextView) view.findViewById(R.id.results_load_more);
            this.b = textView;
            textView.setText(sn5.c(textView, R.string.bet_history__no_more_tickets, new Object[0]));
            textView.setOnClickListener(new ViewOnClickListenerC0834a());
        }

        @Override // lr30.c
        public final void a(int i) {
            lr30 lr30Var = lr30.this;
            if (lr30Var.a.get(i) instanceof nr30) {
                this.c = (nr30) lr30Var.a.get(i);
                b();
            }
        }

        public final void b() {
            boolean z = this.c.a;
            TextView textView = this.b;
            ProgressBar progressBar = this.a;
            if (!z) {
                progressBar.setVisibility(8);
                textView.setVisibility(0);
                if (this.c.h) {
                    textView.setText(sn5.b(lr30.this.b, R.string.bet_history__no_more_tickets, new Object[0]));
                    return;
                } else {
                    textView.setText("");
                    return;
                }
            }
            progressBar.setVisibility(0);
            textView.setVisibility(8);
            nr30 nr30Var = this.c;
            if (nr30Var.c == null) {
                int i = nr30Var.d;
                if (i == -1) {
                    i = 10;
                }
                nr30Var.c = this.d.g(i, nr30Var.f, 10);
                this.c.c.G(new mr30(this));
            }
        }
    }

    public class b extends c implements View.OnClickListener {
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

        public b(View view) {
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
            ((TextView) view.findViewById(R.id.r_jackpot_bet_total_stake)).setText(sn5.b(lr30.this.b, R.string.bet_history__total_stake_with_stake, a8b.d().trim()));
            this.v = (TextView) view.findViewById(R.id.r_jackpot_bet_total_stake_value);
            this.w = (TextView) view.findViewById(R.id.r_jackpot_bet_total_return_value);
            this.y = (TextView) view.findViewById(R.id.r_jackpot_round_number);
            this.z = (TextView) view.findViewById(R.id.r_jackpot_bet_pending_desc);
            this.A = view.findViewById(R.id.r_jackpot_bet_item_divider_line);
            this.B = view.findViewById(R.id.r_jackpot_bet_top_divider_line);
        }

        /* JADX WARN: Code duplicated, block: B:48:0x017d  */
        /* JADX WARN: Code duplicated, block: B:52:0x018c  */
        @Override // lr30.c
        public final void a(int i) {
            String strB;
            Drawable drawableA;
            String strP;
            boolean zEquals;
            TextView textView;
            lr30 lr30Var = lr30.this;
            e eVar = lr30Var.b;
            if (lr30Var.a.get(i) instanceof or30) {
                or30 or30Var = (or30) lr30Var.a.get(i);
                Order order = or30Var.a;
                Object[] objArr = {order.periodNumber};
                TextView textView2 = this.y;
                textView2.setText(sn5.c(textView2, R.string.common_functions__round_no, objArr));
                TextView textView3 = this.z;
                textView3.setVisibility(8);
                TextView textView4 = this.f;
                textView4.setVisibility(4);
                TextView textView5 = this.e;
                textView5.setVisibility(4);
                TextView textView6 = this.i;
                textView6.setVisibility(8);
                View view = this.A;
                view.setVisibility(8);
                View view2 = this.B;
                view2.setVisibility(8);
                long j = order.createTime;
                bwf0 bwf0Var = bwf0.a;
                textView5.setText(bwf0Var.a(j));
                textView5.setVisibility(or30Var.b ? 0 : 4);
                textView4.setText(bwf0Var.v(order.createTime));
                textView4.setVisibility(or30Var.b ? 0 : 4);
                textView6.setText(bwf0Var.x(order.createTime));
                textView6.setVisibility(or30Var.c ? 0 : 8);
                if (i == 0) {
                    view2.setVisibility(8);
                } else {
                    view2.setVisibility(or30Var.b ? 0 : 8);
                }
                view.setVisibility(or30Var.b ? 8 : 0);
                int i2 = order.winningStatus;
                String str = "#1b1e25";
                if (i2 != 0) {
                    if (i2 != 5) {
                        if (i2 == 20) {
                            strB = sn5.b(eVar, R.string.bet_history__won, new Object[0]);
                            strP = bjb0.P(order.totalWinnings, Locale.US);
                            drawableA = iwh0.a(eVar, R.drawable.ic_spr_bet_history_win, -1);
                            str = "#0d9737";
                        } else if (i2 == 30) {
                            strB = sn5.b(eVar, R.string.bet_history__lost, new Object[0]).concat(sn5.b(eVar, R.string.app_common__out_of_11, String.valueOf(order.correctEvents)));
                            str = "#9ca0ab";
                            strP = "0.00";
                        } else if (i2 != 90) {
                            strB = "";
                        } else {
                            strB = sn5.b(eVar, R.string.component_wap_share_bet__pending, new Object[0]);
                            drawableA = gr0.a(eVar, R.drawable.spr_pending_icon_10dp);
                            textView3.setVisibility(0);
                            strP = "--";
                        }
                        TextView textView7 = this.d;
                        textView7.setText(strB);
                        Object[] objArr2 = {order.betType};
                        TextView textView8 = this.c;
                        textView8.setText(sn5.c(textView8, R.string.jackpot__sporty_games, objArr2));
                        textView7.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, iwh0.a(eVar, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, -1), (Drawable) null);
                        this.a.setBackgroundColor(Color.parseColor(str));
                        this.b.setTag(Integer.valueOf(i));
                        this.v.setText(bjb0.P(order.totalStake, Locale.US));
                        zEquals = TextUtils.equals(strP, "--");
                        textView = this.w;
                        if (!zEquals || TextUtils.equals(strP, "0.00")) {
                            textView.setTextColor(Color.parseColor("#9ca0ab"));
                        } else {
                            textView.setTextColor(Color.parseColor("#0d9737"));
                        }
                        textView.setText(strP);
                    }
                    strB = sn5.b(eVar, R.string.bet_history__partial_win, new Object[0]);
                    strP = bjb0.P(order.totalWinnings, Locale.US);
                    drawableA = null;
                    TextView textView9 = this.d;
                    textView9.setText(strB);
                    Object[] objArr3 = {order.betType};
                    TextView textView10 = this.c;
                    textView10.setText(sn5.c(textView10, R.string.jackpot__sporty_games, objArr3));
                    textView9.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, iwh0.a(eVar, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, -1), (Drawable) null);
                    this.a.setBackgroundColor(Color.parseColor(str));
                    this.b.setTag(Integer.valueOf(i));
                    this.v.setText(bjb0.P(order.totalStake, Locale.US));
                    zEquals = TextUtils.equals(strP, "--");
                    textView = this.w;
                    if (zEquals) {
                        textView.setTextColor(Color.parseColor("#9ca0ab"));
                    } else {
                        textView.setTextColor(Color.parseColor("#9ca0ab"));
                    }
                    textView.setText(strP);
                }
                strB = sn5.b(eVar, R.string.component_wap_share_bet__running, new Object[0]);
                strP = "--";
                drawableA = null;
                TextView textView11 = this.d;
                textView11.setText(strB);
                Object[] objArr4 = {order.betType};
                TextView textView12 = this.c;
                textView12.setText(sn5.c(textView12, R.string.jackpot__sporty_games, objArr4));
                textView11.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, iwh0.a(eVar, R.drawable.spr_ic_keyboard_arrow_right_black_24dp, -1), (Drawable) null);
                this.a.setBackgroundColor(Color.parseColor(str));
                this.b.setTag(Integer.valueOf(i));
                this.v.setText(bjb0.P(order.totalStake, Locale.US));
                zEquals = TextUtils.equals(strP, "--");
                textView = this.w;
                if (zEquals) {
                    textView.setTextColor(Color.parseColor("#9ca0ab"));
                } else {
                    textView.setTextColor(Color.parseColor("#9ca0ab"));
                }
                textView.setText(strP);
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view instanceof RelativeLayout) {
                int iIntValue = ((Integer) view.getTag()).intValue();
                lr30 lr30Var = lr30.this;
                if (iIntValue >= lr30Var.a.size() || iIntValue < 0 || !(lr30Var.a.get(iIntValue) instanceof or30)) {
                    return;
                }
                or30 or30Var = (or30) lr30Var.a.get(iIntValue);
                Intent intent = new Intent(view.getContext(), (Class<?>) RSportsBetTicketDetailsActivity.class);
                intent.putExtra("is_jackpot", true);
                intent.putExtra("key_order", or30Var.a);
                yrh0.s(view.getContext(), intent, true);
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
        return ((hl30) this.a.get(i)).a();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((c) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        if (i == 1) {
            return new b(LayoutInflater.from(this.b).inflate(R.layout.spr_jackpot_bet_history_item, viewGroup, false));
        }
        if (i == 2) {
            return new a(dzc.a(viewGroup, R.layout.spr_bets_load_more_item_jackpot, viewGroup, false));
        }
        eub.a("rJackpotticketListAdapter viewHolder return null,type:" + i);
        return null;
    }
}
