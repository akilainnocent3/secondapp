package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.jackpot.data.JackpotSelection;
import com.sportybet.plugin.jackpot.data.RBetDataBase;
import com.sportybet.plugin.jackpot.data.RJackpotDTitleItem;
import com.sportybet.plugin.jackpot.data.RJackpotDeleteTicItem;
import com.sportybet.plugin.jackpot.data.RJackpotElementItem;
import com.sportybet.plugin.jackpot.data.RJackpotOrderWinningsItem;
import com.sportybet.plugin.jackpot.data.RJackpotPWinTitleItem;
import com.sportybet.plugin.jackpot.data.RJackpotPeriodWinningsItem;
import com.sportybet.plugin.jackpot.data.Winnings;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public final class er30 extends RecyclerView.f<g> {
    public static final String d = bjb0.S("/m/statistics?id=");
    public final boolean a;
    public List<RBetDataBase> b;
    public final Activity c;

    public class a extends g implements View.OnClickListener {
        public final TextView a;

        public a(View view) {
            super(view);
            TextView textView = (TextView) view.findViewById(R.id.delete_ticket);
            this.a = textView;
            textView.setOnClickListener(this);
        }

        @Override // er30.g
        public final void a(int i) {
            er30 er30Var = er30.this;
            if (er30Var.b.get(i) instanceof RJackpotDeleteTicItem) {
                this.a.setTag((RJackpotDeleteTicItem) er30Var.b.get(i));
            }
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (view.getId() == R.id.delete_ticket) {
                RJackpotDeleteTicItem rJackpotDeleteTicItem = (RJackpotDeleteTicItem) view.getTag();
                final RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = (RSportsBetTicketDetailsActivity) er30.this.c;
                final String str = rJackpotDeleteTicItem.id;
                rSportsBetTicketDetailsActivity.getClass();
                androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(rSportsBetTicketDetailsActivity);
                aVar.a.f = rSportsBetTicketDetailsActivity.getCMSString(R.string.bet_history__are_you_sure_ticket_delete, new Object[0]);
                aVar.c(rSportsBetTicketDetailsActivity.getCMSString(R.string.common_feedback__delete, new Object[0]), new DialogInterface.OnClickListener() { // from class: rs30
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        int i2 = RSportsBetTicketDetailsActivity.A;
                        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity2 = rSportsBetTicketDetailsActivity;
                        su5<BaseResponse> su5Var = rSportsBetTicketDetailsActivity2.z;
                        if (su5Var != null) {
                            su5Var.cancel();
                        }
                        su5<BaseResponse> su5VarD = rSportsBetTicketDetailsActivity2.b.d(str);
                        rSportsBetTicketDetailsActivity2.z = su5VarD;
                        su5VarD.G(new ot30(rSportsBetTicketDetailsActivity2));
                    }
                });
                aVar.b(rSportsBetTicketDetailsActivity.getCMSString(R.string.common_functions__cancel, new Object[0]), new et30());
                aVar.f();
            }
        }
    }

    public class b extends g {
        public final LinearLayout A;
        public final LinearLayout B;
        public final RelativeLayout C;
        public final View D;
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final ImageView y;
        public final TextView z;

        public b(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.r_jackpot_live);
            this.b = (TextView) view.findViewById(R.id.r_jackpot_number);
            this.c = (TextView) view.findViewById(R.id.r_jackpot_time);
            this.d = (TextView) view.findViewById(R.id.r_jackpot_home);
            this.f = (TextView) view.findViewById(R.id.r_jackpot_away);
            this.e = (TextView) view.findViewById(R.id.r_jackpot_score);
            this.i = (TextView) view.findViewById(R.id.r_jackpot_result);
            this.v = (TextView) view.findViewById(R.id.r_jackpot_pick);
            this.B = (LinearLayout) view.findViewById(R.id.r_jackpot_statistics_layout);
            this.A = (LinearLayout) view.findViewById(R.id.r_jackpot_betting_layout);
            TextView textView = (TextView) view.findViewById(R.id.r_jackpot_live_betting);
            this.w = textView;
            int color = view.getContext().getColor(R.color.brand_quaternary);
            textView.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, (Drawable) null, iwh0.a(textView.getContext(), R.drawable.jap_ic_keyboard_arrow_right_black_24dp, color), (Drawable) null);
            TextView textView2 = (TextView) view.findViewById(R.id.r_jackpot_check_statistics);
            this.z = textView2;
            this.y = (ImageView) view.findViewById(R.id.r_jackpot_result_img);
            textView2.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(textView2.getContext(), R.drawable.jap_stats, color), (Drawable) null, (Drawable) null, (Drawable) null);
            this.D = view.findViewById(R.id.r_jackpot_bottom_line);
            this.C = (RelativeLayout) view.findViewById(R.id.r_jackpot_result_layout);
        }

        @Override // er30.g
        public final void a(int i) {
            er30 er30Var = er30.this;
            if (er30Var.b.get(i) instanceof RJackpotElementItem) {
                JackpotElement jackpotElement = ((RJackpotElementItem) er30Var.b.get(i)).element;
                TextView textView = this.a;
                textView.setVisibility(8);
                StringBuilder sb = new StringBuilder();
                int i2 = 1;
                if (jackpotElement.eventStatus == 1) {
                    sb.append(jackpotElement.playedSeconds);
                    sb.append(" ");
                    sb.append(jackpotElement.matchStatus);
                } else {
                    long j = jackpotElement.date;
                    if (j != 0) {
                        sb.append(bwf0.a.d(j, false));
                    }
                }
                this.c.setText(sb.toString());
                View view = this.D;
                view.setVisibility(8);
                int i3 = jackpotElement.eventStatus;
                TextView textView2 = this.w;
                TextView textView3 = this.z;
                LinearLayout linearLayout = this.A;
                LinearLayout linearLayout2 = this.B;
                if (i3 == 1 && jackpotElement.haveLive) {
                    linearLayout2.setVisibility(8);
                    textView3.setOnClickListener(null);
                    linearLayout.setVisibility(0);
                    textView2.setOnClickListener(new ca3(jackpotElement, i2));
                    textView.setVisibility(0);
                } else if (i3 == 3 || i3 == 4) {
                    linearLayout2.setVisibility(0);
                    textView3.setOnClickListener(new da3(jackpotElement, i2));
                    linearLayout.setVisibility(8);
                    textView2.setOnClickListener(null);
                } else {
                    linearLayout2.setVisibility(8);
                    linearLayout2.setOnClickListener(null);
                    linearLayout.setVisibility(8);
                    linearLayout.setOnClickListener(null);
                    view.setVisibility(0);
                }
                Object[] objArr = {String.valueOf(jackpotElement.index)};
                TextView textView4 = this.b;
                textView4.setText(sn5.c(textView4, R.string.common_functions__number_prefix, objArr));
                this.d.setText(jackpotElement.home);
                this.f.setText(jackpotElement.away);
                boolean zIsEmpty = TextUtils.isEmpty(jackpotElement.homeScore);
                TextView textView5 = this.e;
                if (zIsEmpty || TextUtils.isEmpty(jackpotElement.awayScore)) {
                    textView5.setText("--\n--");
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(jackpotElement.homeScore);
                    sb2.append("\n");
                    zug.b(sb2, jackpotElement.awayScore, textView5);
                }
                List<JackpotSelection> list = jackpotElement.selections;
                int i4 = R.string.bet_history__void;
                TextView textView6 = this.v;
                if (list == null || list.size() <= 0) {
                    textView6.setText(sn5.c(textView6, R.string.bet_history__void, new Object[0]));
                } else {
                    List<JackpotSelection> list2 = jackpotElement.selections;
                    j7g j7gVar = new j7g();
                    Collections.sort(list2);
                    int i5 = 0;
                    for (int i6 = 3; i5 < list2.size() && i5 < i6; i6 = 3) {
                        JackpotSelection jackpotSelection = list2.get(i5);
                        String str = jackpotSelection.id;
                        str.getClass();
                        String str2 = "2";
                        switch (str) {
                            case "1":
                                str2 = "1";
                                break;
                            case "2":
                                str2 = AnalyticsParam.EVENT_PARAM_SHARING_TYPE_X;
                                break;
                            case "3":
                                break;
                            default:
                                str2 = null;
                                break;
                        }
                        if (!TextUtils.isEmpty(str2)) {
                            if (i5 != 0) {
                                j7gVar.e(Color.parseColor("#9ca0ab"), "/");
                            }
                            if (jackpotSelection.status == 1) {
                                j7gVar.e(Color.parseColor("#353a45"), str2);
                            } else {
                                j7gVar.e(Color.parseColor("#9ca0ab"), str2);
                            }
                        }
                        i5++;
                    }
                    textView6.setText(j7gVar);
                }
                boolean z = er30Var.a;
                RelativeLayout relativeLayout = this.C;
                if (!z) {
                    relativeLayout.setVisibility(8);
                    return;
                }
                relativeLayout.setVisibility(0);
                int i7 = jackpotElement.selectionsStatus;
                TextView textView7 = this.i;
                ImageView imageView = this.y;
                if (i7 == 1) {
                    imageView.setVisibility(0);
                    textView7.setVisibility(8);
                    return;
                }
                imageView.setVisibility(8);
                textView7.setVisibility(0);
                if (jackpotElement.selectionsStatus == 0) {
                    i4 = R.string.bet_history__lost;
                }
                textView7.setText(sn5.c(textView7, i4, new Object[0]));
            }
        }
    }

    public class c extends g {
        public final TextView a;
        public final TextView b;

        public c(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.win_order_type);
            this.b = (TextView) view.findViewById(R.id.win_order_value);
        }

        @Override // er30.g
        public final void a(int i) {
            er30 er30Var = er30.this;
            if (er30Var.b.get(i) instanceof RJackpotOrderWinningsItem) {
                RJackpotOrderWinningsItem rJackpotOrderWinningsItem = (RJackpotOrderWinningsItem) er30Var.b.get(i);
                Object[] objArr = {String.valueOf(rJackpotOrderWinningsItem.winnings.correctEvents), rJackpotOrderWinningsItem.betType, String.valueOf(rJackpotOrderWinningsItem.winnings.winNum)};
                TextView textView = this.a;
                textView.setText(sn5.c(textView, R.string.jackpot__correct_type_win_number, objArr));
                this.b.setText(bjb0.P(rJackpotOrderWinningsItem.winnings.perWinnings, Locale.US));
            }
        }
    }

    public class d extends g {
        public final TextView a;
        public final TextView b;
        public final RelativeLayout c;
        public final RelativeLayout d;
        public final TextView e;
        public final TextView f;

        public d(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.r_jackpot_round_number_title);
            this.e = (TextView) view.findViewById(R.id.period_win_desc);
            this.b = (TextView) view.findViewById(R.id.period_win_title);
            this.c = (RelativeLayout) view.findViewById(R.id.r_jackpot_bottom);
            this.d = (RelativeLayout) view.findViewById(R.id.r_jackpot_middle);
            this.f = (TextView) view.findViewById(R.id.r_jackpot_result);
        }

        @Override // er30.g
        public final void a(int i) {
            er30 er30Var = er30.this;
            if (er30Var.b.get(i) instanceof RJackpotPWinTitleItem) {
                RJackpotPWinTitleItem rJackpotPWinTitleItem = (RJackpotPWinTitleItem) er30Var.b.get(i);
                boolean z = rJackpotPWinTitleItem.isBottom;
                RelativeLayout relativeLayout = this.d;
                RelativeLayout relativeLayout2 = this.c;
                if (!z) {
                    this.f.setVisibility(er30Var.a ? 0 : 8);
                    relativeLayout2.setVisibility(8);
                    relativeLayout.setVisibility(0);
                    Object[] objArr = {rJackpotPWinTitleItem.periodNumber};
                    TextView textView = this.a;
                    textView.setText(sn5.c(textView, R.string.common_functions__round_no, objArr));
                    return;
                }
                relativeLayout2.setVisibility(0);
                TextView textView2 = this.b;
                textView2.setCompoundDrawablesWithIntrinsicBounds(iwh0.a(textView2.getContext(), R.drawable.ic_spr_bet_history_win, -1), (Drawable) null, (Drawable) null, (Drawable) null);
                relativeLayout.setVisibility(8);
                textView2.setText(sn5.c(textView2, R.string.jackpot__sporty_prize, rJackpotPWinTitleItem.betType, bjb0.L(new BigDecimal(rJackpotPWinTitleItem.maxWinnings), Locale.US)));
                boolean z2 = rJackpotPWinTitleItem.hasPeriodWinnings;
                TextView textView3 = this.e;
                textView3.setText(z2 ? sn5.c(textView3, R.string.bet_history__winnings_of_this_round, new Object[0]) : "");
            }
        }
    }

    public class e extends g {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final ImageView d;

        public e(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.left_text);
            this.b = (TextView) view.findViewById(R.id.mid_Text);
            this.c = (TextView) view.findViewById(R.id.right_text);
            this.d = (ImageView) view.findViewById(R.id.index_img);
            view.getRootView().setBackgroundColor(view.getContext().getColor(R.color.background_type2_secondary));
        }

        @Override // er30.g
        public final void a(int i) {
            er30 er30Var = er30.this;
            if (er30Var.b.get(i) instanceof RJackpotPeriodWinningsItem) {
                RJackpotPeriodWinningsItem rJackpotPeriodWinningsItem = (RJackpotPeriodWinningsItem) er30Var.b.get(i);
                int i2 = rJackpotPeriodWinningsItem.index;
                ImageView imageView = this.d;
                TextView textView = this.c;
                TextView textView2 = this.b;
                TextView textView3 = this.a;
                if (i2 == 0) {
                    int iD = c8i0.d(R.color.text_type2_tertiary, textView3);
                    textView3.setTextColor(iD);
                    Typeface typeface = Typeface.DEFAULT;
                    textView3.setTypeface(typeface);
                    textView3.setText(sn5.c(textView3, R.string.jackpot__correct_events, new Object[0]));
                    textView3.setTextSize(10.0f);
                    textView2.setTextColor(iD);
                    textView2.setTypeface(typeface);
                    textView2.setText(sn5.c(this.itemView, R.string.bet_history__no_dot_tickets, new Object[0]));
                    textView2.setTextSize(10.0f);
                    textView.setTextColor(iD);
                    textView.setTypeface(typeface);
                    textView.setText(sn5.c(this.itemView, R.string.bet_history__winning_per_ticket, new Object[0]));
                    textView.setTextSize(10.0f);
                    imageView.setVisibility(4);
                    return;
                }
                Winnings winnings = rJackpotPeriodWinningsItem.winnings;
                textView3.setTextColor(-1);
                Typeface typeface2 = Typeface.DEFAULT_BOLD;
                textView3.setTypeface(typeface2);
                textView3.setText(sn5.c(this.itemView, R.string.jackpot__events_out_of_bet_type, String.valueOf(winnings.correctEvents), rJackpotPeriodWinningsItem.betType));
                textView3.setTextSize(14.0f);
                textView2.setText(String.valueOf(winnings.winNum));
                textView2.setTextColor(-1);
                textView2.setTypeface(typeface2);
                textView2.setTextSize(14.0f);
                textView.setText(a8b.a(bjb0.P(winnings.perWinnings, Locale.US)));
                textView.setTypeface(typeface2);
                textView.setTextColor(-1);
                textView.setTextSize(14.0f);
                imageView.setVisibility(0);
                int i3 = rJackpotPeriodWinningsItem.index;
                if (i3 == 1) {
                    imageView.setImageDrawable(iwh0.a(imageView.getContext(), R.drawable.ic_jackpot_index, imageView.getContext().getColor(R.color.highlight)));
                } else if (i3 == 2) {
                    imageView.setImageDrawable(iwh0.a(imageView.getContext(), R.drawable.ic_jackpot_index, imageView.getContext().getColor(R.color.brand_secondary_variable_type3)));
                } else if (i3 == 3) {
                    imageView.setImageDrawable(iwh0.a(imageView.getContext(), R.drawable.ic_jackpot_index, imageView.getContext().getColor(R.color.brand_secondary_variable_type2)));
                }
            }
        }
    }

    public class f extends g {
        public final TextView a;
        public final TextView b;
        public final TextView c;
        public final TextView d;
        public final TextView e;
        public final TextView f;
        public final TextView i;
        public final TextView v;
        public final TextView w;
        public final TextView y;

        public f(View view) {
            super(view);
            this.a = (TextView) view.findViewById(R.id.r_jackpot_id);
            this.b = (TextView) view.findViewById(R.id.r_jackpot_date);
            this.v = (TextView) view.findViewById(R.id.r_jackpot_order_type);
            this.c = (TextView) view.findViewById(R.id.r_jackpot_status);
            this.d = (TextView) view.findViewById(R.id.r_jackpot_stake_value);
            this.e = (TextView) view.findViewById(R.id.r_jackpot_return_value);
            this.f = (TextView) view.findViewById(R.id.r_jackpot_gift_label);
            this.i = (TextView) view.findViewById(R.id.r_jackpot_gift_value);
            this.w = (TextView) view.findViewById(R.id.r_jackpot_wh_tax_label);
            this.y = (TextView) view.findViewById(R.id.r_jackpot_wh_tax_value);
        }

        /* JADX WARN: Code duplicated, block: B:29:0x012e  */
        /* JADX WARN: Code duplicated, block: B:32:0x015c  */
        /* JADX WARN: Code duplicated, block: B:34:0x0167  */
        /* JADX WARN: Code duplicated, block: B:35:0x016b  */
        /* JADX WARN: Code duplicated, block: B:38:0x018c  */
        @Override // er30.g
        public final void a(int i) {
            String strB;
            int i2;
            Drawable drawableA;
            Locale locale;
            double dD0;
            TextView textView;
            TextView textView2;
            int i3;
            er30 er30Var = er30.this;
            if (er30Var.b.get(i) instanceof RJackpotDTitleItem) {
                RJackpotDTitleItem rJackpotDTitleItem = (RJackpotDTitleItem) er30Var.b.get(i);
                Object[] objArr = {rJackpotDTitleItem.shortId};
                TextView textView3 = this.a;
                textView3.setText(sn5.c(textView3, R.string.bet_history__ticket_id_vid, objArr));
                this.b.setText(bwf0.a.d(rJackpotDTitleItem.createTime, false));
                Object[] objArr2 = {rJackpotDTitleItem.bet.betType};
                TextView textView4 = this.v;
                textView4.setText(sn5.c(textView4, R.string.jackpot__sporty_games, objArr2));
                TextView textView5 = this.c;
                Context context = textView5.getContext();
                boolean zHasTax = rJackpotDTitleItem.bet.hasTax();
                TextView textView6 = this.y;
                TextView textView7 = this.w;
                if (zHasTax) {
                    textView7.setVisibility(0);
                    textView6.setVisibility(0);
                    textView6.setText("-".concat(bjb0.L(new BigDecimal(rJackpotDTitleItem.bet.taxAmount).multiply(new BigDecimal(1.0E-4d)), Locale.US)));
                } else {
                    textView7.setVisibility(8);
                    textView6.setVisibility(8);
                }
                int i4 = rJackpotDTitleItem.winningStatus;
                int i5 = R.color.text_type2_primary;
                String strP = "--";
                if (i4 != 0) {
                    if (i4 == 20) {
                        String strB2 = sn5.b(context, R.string.bet_history__won, new Object[0]);
                        strP = bjb0.P(rJackpotDTitleItem.bet.winnings, Locale.US);
                        Context context2 = textView5.getContext();
                        i2 = R.color.brand_secondary_variable_type3;
                        drawableA = iwh0.a(context, R.drawable.ic_spr_bet_history_win, context2.getColor(R.color.brand_secondary_variable_type3));
                        strB = strB2;
                        i5 = R.color.brand_secondary_variable_type3;
                    } else if (i4 == 30) {
                        strB = sn5.b(context, R.string.bet_history__lost, new Object[0]);
                        strP = "0.00";
                    } else if (i4 == 40) {
                        strB = sn5.b(context, R.string.bet_history__void, new Object[0]);
                        if (!TextUtils.isEmpty(rJackpotDTitleItem.refundAmount)) {
                            strP = bjb0.P(rJackpotDTitleItem.refundAmount, Locale.US);
                        }
                    } else if (i4 != 90) {
                        strB = "";
                    } else {
                        String strB3 = sn5.b(context, R.string.component_wap_share_bet__pending, new Object[0]);
                        drawableA = gr0.a(context, R.drawable.jap_pending_icon_10dp);
                        strB = strB3;
                        i2 = R.color.text_type2_primary;
                    }
                    textView5.setText(strB);
                    textView5.setTextColor(textView5.getContext().getColor(i5));
                    if (drawableA != null) {
                        textView5.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                    }
                    String str = rJackpotDTitleItem.bet.totalStake;
                    locale = Locale.US;
                    this.d.setText(bjb0.P(str, locale));
                    TextView textView8 = this.e;
                    textView8.setTextColor(c8i0.d(i2, textView8));
                    textView8.setText(strP);
                    dD0 = bjb0.d0(rJackpotDTitleItem.favorAmount);
                    textView = this.i;
                    textView2 = this.f;
                    if (dD0 > 0.0d) {
                        textView2.setVisibility(8);
                        textView.setVisibility(8);
                        return;
                    }
                    textView2.setVisibility(0);
                    textView.setVisibility(0);
                    if (rJackpotDTitleItem.favorType == 1) {
                        i3 = R.string.common_functions__cash_gift;
                    } else {
                        i3 = R.string.common_functions__discount_gift;
                    }
                    textView2.setText(sn5.c(textView2, i3, new Object[0]));
                    textView.setText(sn5.c(textView2, R.string.app_common__minus_prefix, bjb0.P(rJackpotDTitleItem.favorAmount, locale)));
                }
                strB = sn5.b(context, R.string.component_wap_share_bet__running, new Object[0]);
                i2 = R.color.text_type2_primary;
                drawableA = null;
                textView5.setText(strB);
                textView5.setTextColor(textView5.getContext().getColor(i5));
                if (drawableA != null) {
                    textView5.setCompoundDrawablesWithIntrinsicBounds(drawableA, (Drawable) null, (Drawable) null, (Drawable) null);
                }
                String str2 = rJackpotDTitleItem.bet.totalStake;
                locale = Locale.US;
                this.d.setText(bjb0.P(str2, locale));
                TextView textView9 = this.e;
                textView9.setTextColor(c8i0.d(i2, textView9));
                textView9.setText(strP);
                dD0 = bjb0.d0(rJackpotDTitleItem.favorAmount);
                textView = this.i;
                textView2 = this.f;
                if (dD0 > 0.0d) {
                    textView2.setVisibility(8);
                    textView.setVisibility(8);
                    return;
                }
                textView2.setVisibility(0);
                textView.setVisibility(0);
                if (rJackpotDTitleItem.favorType == 1) {
                    i3 = R.string.common_functions__cash_gift;
                } else {
                    i3 = R.string.common_functions__discount_gift;
                }
                textView2.setText(sn5.c(textView2, i3, new Object[0]));
                textView.setText(sn5.c(textView2, R.string.app_common__minus_prefix, bjb0.P(rJackpotDTitleItem.favorAmount, locale)));
            }
        }
    }

    public abstract class g extends RecyclerView.d0 {
        public abstract void a(int i);
    }

    public er30(Activity activity, boolean z, ArrayList arrayList) {
        this.c = activity;
        this.a = z;
        this.b = arrayList;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemCount() {
        return this.b.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final int getItemViewType(int i) {
        return this.b.get(i).getType();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final void onBindViewHolder(RecyclerView.d0 d0Var, int i) {
        ((g) d0Var).a(i);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.f
    public final RecyclerView.d0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        switch (i) {
            case 12:
                return new f(dzc.a(viewGroup, R.layout.r_jackpot_detail_title, viewGroup, false));
            case 13:
                return new e(dzc.a(viewGroup, R.layout.jackpot_winnings, viewGroup, false));
            case 14:
                return new c(dzc.a(viewGroup, R.layout.r_jackpot_order_winnings, viewGroup, false));
            case 15:
                return new b(dzc.a(viewGroup, R.layout.r_jackpot_detail_item, viewGroup, false));
            case 16:
                return new d(dzc.a(viewGroup, R.layout.r_jackpot_pwin_title, viewGroup, false));
            case 17:
                return new a(dzc.a(viewGroup, R.layout.jap_jackpot_delete_order_item, viewGroup, false));
            default:
                return null;
        }
    }
}
