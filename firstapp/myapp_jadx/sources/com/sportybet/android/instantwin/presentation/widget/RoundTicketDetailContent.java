package com.sportybet.android.instantwin.presentation.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.sporty.android.core.model.gift.GiftDetails;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.response.Bet;
import com.sportybet.android.instantwin.newtork.model.response.TicketInRound;
import com.sportybet.android.instantwin.presentation.widget.viewholder.round.RoundTicketsSummaryViewHolder;
import com.sportybet.plugin.realsports.data.sim.SimulateBetConsts;
import defpackage.a78;
import defpackage.b2m;
import defpackage.bjb0;
import defpackage.c060;
import defpackage.cmo;
import defpackage.g8i0;
import defpackage.geo;
import defpackage.gky;
import defpackage.n4p;
import defpackage.pe4;
import defpackage.pvf;
import defpackage.s0b;
import defpackage.sn5;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes.dex */
public class RoundTicketDetailContent extends b2m {
    public final TextView A;
    public final TextView B;
    public final TextView C;
    public final TextView D;
    public final ImageView E;
    public final RelativeLayout F;
    public final LinearLayout G;
    public final LinearLayout H;
    public final LinearLayout I;
    public final LinearLayout J;
    public n4p c;
    public cmo d;
    public final TextView e;
    public final TextView f;
    public final TextView i;
    public final TextView v;
    public final TextView w;
    public final TextView y;
    public final TextView z;

    public RoundTicketDetailContent(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        if (!isInEditMode() && !this.b) {
            this.b = true;
            ((c060) generatedComponent()).x(this);
        }
        View.inflate(context, R.layout.iwqk_layout_round_ticket_detail_content, this);
        setOrientation(1);
        setBackgroundColor(getResources().getColor(R.color.transparent));
        this.e = (TextView) findViewById(R.id.bet_type);
        this.f = (TextView) findViewById(R.id.bet_status);
        this.i = (TextView) findViewById(R.id.total_return_value);
        this.v = (TextView) findViewById(R.id.total_stake_value);
        this.y = (TextView) findViewById(R.id.ticket_id);
        this.E = (ImageView) findViewById(R.id.bet_status_icon);
        this.F = (RelativeLayout) findViewById(R.id.bet_history_title);
        this.w = (TextView) findViewById(R.id.total_stake_odds);
        this.H = (LinearLayout) findViewById(R.id.total_stake_odds_layout);
        this.G = (LinearLayout) findViewById(R.id.total_bonus_layout);
        this.z = (TextView) findViewById(R.id.total_bonus_value);
        this.I = (LinearLayout) findViewById(R.id.gift_layout);
        this.A = (TextView) findViewById(R.id.gift_title);
        this.B = (TextView) findViewById(R.id.gift_value);
        this.J = (LinearLayout) findViewById(R.id.tax_layout);
        this.C = (TextView) findViewById(R.id.wh_tax_value);
        this.D = (TextView) findViewById(R.id.flex_one_cut_info);
        ImageView imageView = (ImageView) findViewById(R.id.sports_icon);
        Integer numA = this.d.a(this.c.c());
        if (numA != null) {
            imageView.setImageDrawable(s0b.a(getContext(), numA.intValue(), new a78.c(R.color.text_type1_primary)));
            g8i0.b(imageView, true);
        } else {
            imageView.setImageDrawable(null);
            imageView.setVisibility(8);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:26:0x009e  */
    /* JADX WARN: Code duplicated, block: B:37:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:45:0x0103  */
    public void setData(TicketInRound ticketInRound, RoundTicketsSummaryViewHolder.a aVar) {
        int i;
        String strC;
        Iterator<Bet> it = ticketInRound.bets.iterator();
        boolean z = false;
        while (it.hasNext()) {
            z |= it.next().hit;
        }
        BigDecimal totalBonus = aVar.getTotalBonus(ticketInRound.bets);
        BigDecimal flexTotalOdds = (TextUtils.equals(ticketInRound.type, SimulateBetConsts.BetslipType.FLEX) || TextUtils.equals(ticketInRound.type, SimulateBetConsts.BetslipType.CUTBET)) ? aVar.getFlexTotalOdds(ticketInRound) : aVar.getTotalOdds(ticketInRound.type, ticketInRound.bets);
        String strA = pvf.a(getContext(), ticketInRound.giftKind);
        BigDecimal bigDecimalDivide = (TextUtils.isEmpty(ticketInRound.giftId) || ticketInRound.giftAmount <= 0 || !GiftDetails.INSTANCE.isKindSupported(ticketInRound.giftKind)) ? BigDecimal.ZERO : new BigDecimal(Math.min(ticketInRound.totalStake, ticketInRound.giftAmount)).divide(geo.a);
        String str = ticketInRound.type;
        int size = ticketInRound.bets.size();
        switch (str.hashCode()) {
            case -1349076209:
                if (!str.equals(SimulateBetConsts.BetslipType.CUTBET)) {
                    i = 0;
                    if (size > 1) {
                        strC = sn5.c(this, R.string.bet_history__single, new Object[i]);
                    } else {
                        Locale locale = Locale.ENGLISH;
                        strC = sn5.c(this, R.string.bet_history__single, new Object[i]).concat(pe4.b(size, " (x", ")"));
                    }
                } else {
                    strC = sn5.c(this, R.string.bet_history__multiple, new Object[0]);
                }
                break;
            case -902265784:
                str.equals(SimulateBetConsts.BetslipType.SINGLE);
                i = 0;
                if (size > 1) {
                    strC = sn5.c(this, R.string.bet_history__single, new Object[i]);
                } else {
                    Locale locale2 = Locale.ENGLISH;
                    strC = sn5.c(this, R.string.bet_history__single, new Object[i]).concat(pe4.b(size, " (x", ")"));
                }
                break;
            case -887328209:
                i = 0;
                if (str.equals("system")) {
                    strC = sn5.c(this, R.string.bet_history__system, new Object[0]);
                } else if (size > 1) {
                    strC = sn5.c(this, R.string.bet_history__single, new Object[i]);
                } else {
                    Locale locale3 = Locale.ENGLISH;
                    strC = sn5.c(this, R.string.bet_history__single, new Object[i]).concat(pe4.b(size, " (x", ")"));
                }
                break;
            case 653829648:
                if (!str.equals(SimulateBetConsts.BetslipType.MULTIPLE)) {
                    i = 0;
                    if (size > 1) {
                        strC = sn5.c(this, R.string.bet_history__single, new Object[i]);
                    } else {
                        Locale locale4 = Locale.ENGLISH;
                        strC = sn5.c(this, R.string.bet_history__single, new Object[i]).concat(pe4.b(size, " (x", ")"));
                    }
                } else if (size <= 1) {
                    strC = sn5.c(this, R.string.bet_history__multiple, new Object[0]);
                } else {
                    Locale locale5 = Locale.ENGLISH;
                    strC = sn5.c(this, R.string.bet_history__multiple, new Object[0]).concat(pe4.b(size, " (x", ")"));
                }
                break;
            case 1744737227:
                if (!str.equals(SimulateBetConsts.BetslipType.FLEX)) {
                    i = 0;
                    if (size > 1) {
                        strC = sn5.c(this, R.string.bet_history__single, new Object[i]);
                    } else {
                        Locale locale6 = Locale.ENGLISH;
                        strC = sn5.c(this, R.string.bet_history__single, new Object[i]).concat(pe4.b(size, " (x", ")"));
                    }
                } else {
                    strC = sn5.c(this, R.string.bet_history__multiple, new Object[0]);
                }
                break;
            default:
                i = 0;
                if (size > 1) {
                    strC = sn5.c(this, R.string.bet_history__single, new Object[i]);
                } else {
                    Locale locale7 = Locale.ENGLISH;
                    strC = sn5.c(this, R.string.bet_history__single, new Object[i]).concat(pe4.b(size, " (x", ")"));
                }
                break;
        }
        this.e.setText(strC);
        BigDecimal bigDecimal = new BigDecimal(ticketInRound.totalReturn);
        BigDecimal bigDecimal2 = geo.a;
        BigDecimal bigDecimalDivide2 = bigDecimal.divide(bigDecimal2);
        Locale locale8 = Locale.US;
        this.i.setText(bjb0.L(bigDecimalDivide2, locale8));
        this.v.setText(bjb0.L(new BigDecimal(ticketInRound.totalStake).divide(bigDecimal2), locale8));
        this.w.setText(gky.a.a(bjb0.L(flexTotalOdds, locale8), false));
        this.y.setText(sn5.c(this, R.string.bet_history__ticket_id_vid, ticketInRound.ticketNumber));
        this.E.setVisibility(z ? 0 : 8);
        this.f.setText(sn5.c(this, z ? R.string.bet_history__won : R.string.bet_history__lost, new Object[0]));
        this.F.setBackgroundColor(getResources().getColor(z ? R.color.brand_secondary : R.color.background_type2_for_iv_primary));
        this.z.setText(bjb0.L(totalBonus, locale8));
        this.H.setVisibility((TextUtils.equals(ticketInRound.type, "system") || flexTotalOdds.compareTo(BigDecimal.ZERO) <= 0) ? 8 : 0);
        BigDecimal bigDecimal3 = BigDecimal.ZERO;
        this.G.setVisibility(totalBonus.compareTo(bigDecimal3) > 0 ? 0 : 8);
        boolean zIsEmpty = TextUtils.isEmpty(strA);
        LinearLayout linearLayout = this.I;
        if (zIsEmpty || bigDecimalDivide.compareTo(bigDecimal3) <= 0) {
            linearLayout.setVisibility(8);
        } else {
            linearLayout.setVisibility(0);
            this.A.setText(strA);
            this.B.setText(sn5.c(this, R.string.page_transaction__neg_amount, bjb0.L(bigDecimalDivide, locale8)));
        }
        BigDecimal bigDecimalDivide3 = new BigDecimal(ticketInRound.wht).divide(bigDecimal2);
        this.J.setVisibility(bigDecimalDivide3.compareTo(bigDecimal3) > 0 ? 0 : 8);
        this.C.setText(sn5.c(this, R.string.page_transaction__neg_amount, bjb0.L(bigDecimalDivide3, locale8)));
        boolean zEquals = ticketInRound.type.equals(SimulateBetConsts.BetslipType.FLEX);
        TextView textView = this.D;
        if (zEquals) {
            textView.setVisibility(0);
            textView.setText(sn5.c(this, R.string.component_wap_share_bet__flex_your_bet_vmintowin_of_vsize, String.valueOf(ticketInRound.flexibleFitSize), String.valueOf(ticketInRound.bets.get(0).betDetails.size())));
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_flexible_active, 0, 0, 0);
        } else {
            if (!ticketInRound.type.equals(SimulateBetConsts.BetslipType.CUTBET)) {
                textView.setVisibility(8);
                return;
            }
            textView.setVisibility(0);
            textView.setText("");
            textView.setCompoundDrawablesWithIntrinsicBounds(R.drawable.ic_one_bet_cut, 0, 0, 0);
        }
    }

    public RoundTicketDetailContent(Context context) {
        this(context, null);
    }

    public RoundTicketDetailContent(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }
}
