package com.sportybet.feature.gift.giftreceived.presentation.giftreceived;

import android.os.Parcelable;
import com.appsflyer.internal.u;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import com.sportybet.feature.gift.giftreceived.domain.model.ReceivedGiftData;
import defpackage.awk;
import defpackage.ay0;
import defpackage.bjk;
import defpackage.bnh0;
import defpackage.ej5;
import defpackage.fbe;
import defpackage.j8i0;
import defpackage.jnk;
import defpackage.k00;
import defpackage.ku90;
import defpackage.l25;
import defpackage.m2g;
import defpackage.o8i0;
import defpackage.oxc;
import defpackage.rdd0;
import defpackage.uhc;
import defpackage.vch0;
import defpackage.vu60;
import defpackage.wib0;
import defpackage.wqk;
import defpackage.wwd0;
import defpackage.xf40;
import defpackage.xwd0;
import defpackage.xxi0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/gift/giftreceived/presentation/giftreceived/i;", "Lj8i0;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i extends j8i0 {
    public final bnh0 a;
    public final rdd0 b;
    public final fbe c;
    public final ReceivedGiftData d;
    public final wwd0 e;
    public final ku90<f> f;

    public i(xf40 xf40Var, vu60 vu60Var, wib0 wib0Var, bnh0 bnh0Var, rdd0 rdd0Var, fbe fbeVar) {
        bjk bjkVar;
        ResourceUiText resourceUiText;
        g aVar;
        bjk bjkVar2;
        UiText resourceUiText2;
        xf40Var.getClass();
        vu60Var.getClass();
        wib0Var.getClass();
        bnh0Var.getClass();
        rdd0Var.getClass();
        this.a = bnh0Var;
        this.b = rdd0Var;
        this.c = fbeVar;
        ReceivedGiftData receivedGiftData = (ReceivedGiftData) vu60Var.b("gift_data");
        this.d = receivedGiftData == null ? new ReceivedGiftData.General("", "", awk.None, ApplicableCategoryIds.b) : receivedGiftData;
        StringUiText stringUiText = (511 & 2) != 0 ? vch0.a : null;
        StringUiText stringUiText2 = (511 & 4) != 0 ? vch0.a : null;
        StringUiText stringUiText3 = vch0.a;
        ResourceUiText resourceUiText3 = new ResourceUiText(R.string.component_coupon__stakes_not_returned_with_winnings);
        String str = (511 & 16) != 0 ? "" : "GHS";
        ResourceUiText resourceUiText4 = new ResourceUiText(R.string.component_cash_gift_popup__use_it_in_your_betslip);
        String str2 = (511 & 64) == 0 ? "888" : "";
        m2g m2gVar = ApplicableCategoryIds.b;
        int i = R.string.component_cash_gift_popup__use_it_in_your_betslip;
        wwd0 wwd0VarA = xwd0.a(new g.b("", stringUiText, stringUiText2, resourceUiText3, str, resourceUiText4, str2, false, m2gVar));
        this.e = wwd0VarA;
        this.f = new ku90<>();
        wib0Var.b(o8i0.d(this), bjk.v, "gift");
        while (true) {
            Object value = wwd0VarA.getValue();
            ReceivedGiftData receivedGiftData2 = this.d;
            receivedGiftData2.getClass();
            if (receivedGiftData2 instanceof ReceivedGiftData.General) {
                ReceivedGiftData.General general = (ReceivedGiftData.General) receivedGiftData2;
                awk awkVar = general.c;
                int iOrdinal = awkVar.ordinal();
                if (iOrdinal == 1) {
                    bjkVar2 = bjk.CashGiftCard;
                } else if (iOrdinal != 2) {
                    bjkVar2 = iOrdinal != 3 ? bjk.CashGiftCard : bjk.FreeBetGiftCard;
                } else {
                    bjkVar2 = bjk.DiscountGiftCard;
                }
                int iOrdinal2 = awkVar.ordinal();
                if (iOrdinal2 == 1) {
                    StringUiText stringUiText4 = vch0.a;
                    resourceUiText2 = new ResourceUiText(R.string.common_functions__cash_gift);
                } else if (iOrdinal2 == 2) {
                    StringUiText stringUiText5 = vch0.a;
                    resourceUiText2 = new ResourceUiText(R.string.common_functions__discount_gift);
                } else if (iOrdinal2 != 3) {
                    resourceUiText2 = vch0.a;
                } else {
                    StringUiText stringUiText6 = vch0.a;
                    resourceUiText2 = new ResourceUiText(R.string.common_functions__free_bet_gift);
                }
                aVar = new g.b(bjkVar2.a, resourceUiText2.h(new StringUiText(" !")), new ResourceUiText(R.string.gift__you_just_received_gift_with_amount, ay0.S(new Object[]{resourceUiText2, oxc.a(general.a, " ", general.b)})), new ResourceUiText(R.string.component_coupon__stakes_not_returned_with_winnings), general.a, new ResourceUiText(i), general.b, awkVar == awk.Discount, general.d);
            } else {
                if (!(receivedGiftData2 instanceof ReceivedGiftData.Boost)) {
                    uhc.a();
                    throw null;
                }
                ReceivedGiftData.Boost boost = (ReceivedGiftData.Boost) receivedGiftData2;
                l25 l25Var = boost.b;
                int iOrdinal3 = l25Var.ordinal();
                if (iOrdinal3 == 0 || iOrdinal3 == 1) {
                    bjkVar = bjk.WagerBoostCard;
                } else {
                    if (iOrdinal3 != 2) {
                        uhc.a();
                        throw null;
                    }
                    bjkVar = bjk.RakeBackBoostCard;
                }
                int iOrdinal4 = l25Var.ordinal();
                int i2 = R.string.gift__wager_boost_ticket_title;
                if (iOrdinal4 != 0 && iOrdinal4 != 1) {
                    if (iOrdinal4 != 2) {
                        uhc.a();
                        throw null;
                    }
                    i2 = R.string.gift__rakeback_boost_ticket_title;
                }
                StringUiText stringUiText7 = vch0.a;
                ResourceUiText resourceUiText5 = new ResourceUiText(i2);
                int iOrdinal5 = l25Var.ordinal();
                int i3 = R.string.gift__wager_boost_received;
                if (iOrdinal5 == 0) {
                    resourceUiText = new ResourceUiText(R.string.gift__wager_boost_received);
                } else if (iOrdinal5 == 1) {
                    resourceUiText = new ResourceUiText(R.string.gift__wager_boost);
                } else {
                    if (iOrdinal5 != 2) {
                        uhc.a();
                        throw null;
                    }
                    resourceUiText = new ResourceUiText(R.string.gift__rakeback_boost);
                }
                ResourceUiText resourceUiText6 = resourceUiText;
                int iOrdinal6 = l25Var.ordinal();
                int i4 = R.string.gift__claim_wager_boost_gift;
                if (iOrdinal6 != 0 && iOrdinal6 != 1) {
                    if (iOrdinal6 != 2) {
                        uhc.a();
                        throw null;
                    }
                    i4 = R.string.gift__claim_rakeback_boost_gift;
                }
                ResourceUiText resourceUiText7 = new ResourceUiText(i4);
                int iOrdinal7 = l25Var.ordinal();
                if (iOrdinal7 != 0 && iOrdinal7 != 1) {
                    if (iOrdinal7 != 2) {
                        uhc.a();
                        throw null;
                    }
                    i3 = R.string.gift__rakeback_boost_received;
                }
                aVar = new g.a(bjkVar.a, new ResourceUiText(i3), vch0.d(boost.a), resourceUiText5, resourceUiText6, resourceUiText7);
            }
            if (wwd0VarA.g(value, aVar)) {
                this.b.a(wqk.b.a, k00.d);
                return;
            }
            i = R.string.component_cash_gift_popup__use_it_in_your_betslip;
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:40:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:61:0x00d3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x00d6 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:? A[LOOP:1: B:38:0x00b5->B:63:?, LOOP_END, SYNTHETIC] */
    public final void x1(d dVar) {
        jnk jnkVar;
        Iterator<T> it;
        int iIntValue;
        dVar.getClass();
        boolean zEquals = dVar.equals(d.a.a);
        rdd0 rdd0Var = this.b;
        ReceivedGiftData receivedGiftData = this.d;
        if (zEquals) {
            rdd0Var.a(wqk.a.a, k00.d);
            if (receivedGiftData instanceof ReceivedGiftData.General) {
                ej5.c(o8i0.d(this), null, null, new h(this, ApplicableCategoryIds.a(((ReceivedGiftData.General) receivedGiftData).d), null), 3);
                return;
            }
            return;
        }
        if (!dVar.equals(d.b.a)) {
            if (dVar instanceof d.c) {
                rdd0Var.a(((d.c) dVar).a, k00.d);
                return;
            } else {
                uhc.a();
                return;
            }
        }
        rdd0Var.a(wqk.c.a, k00.d);
        if (receivedGiftData instanceof ReceivedGiftData.General) {
            List<? extends Integer> list = ((ReceivedGiftData.General) receivedGiftData).d;
            Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
            boolean z = false;
            if (list == null || !list.isEmpty()) {
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    int iIntValue2 = ((Number) it2.next()).intValue();
                    com.sportybet.core.domain.model.a.b.getClass();
                    if (com.sportybet.core.domain.model.a.C0358a.a(iIntValue2) != com.sportybet.core.domain.model.a.None) {
                        z = true;
                        break;
                    }
                }
            }
            if (!z) {
                jnkVar = jnk.BetSlip;
            } else if (list.isEmpty()) {
                if (!list.isEmpty()) {
                    it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            iIntValue = ((Number) it.next()).intValue();
                            com.sportybet.core.domain.model.b.b.getClass();
                            if (com.sportybet.core.domain.model.b.a.a(iIntValue) != com.sportybet.core.domain.model.b.None) {
                                jnkVar = jnk.BetSlip;
                            }
                        }
                    }
                }
                jnkVar = jnk.Game;
            } else {
                Iterator<T> it3 = list.iterator();
                while (true) {
                    if (it3.hasNext()) {
                        int iIntValue3 = ((Number) it3.next()).intValue();
                        com.sportybet.core.domain.model.c.b.getClass();
                        if (com.sportybet.core.domain.model.c.a.a(iIntValue3) != com.sportybet.core.domain.model.c.None) {
                        }
                    } else {
                        if (!list.isEmpty()) {
                            it = list.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    iIntValue = ((Number) it.next()).intValue();
                                    com.sportybet.core.domain.model.b.b.getClass();
                                    if (com.sportybet.core.domain.model.b.a.a(iIntValue) != com.sportybet.core.domain.model.b.None) {
                                    }
                                }
                            }
                        }
                        jnkVar = jnk.Game;
                    }
                    jnkVar = jnk.BetSlip;
                }
            }
        } else {
            if (!(receivedGiftData instanceof ReceivedGiftData.Boost)) {
                uhc.a();
                return;
            }
            jnkVar = jnk.BetSlip;
        }
        xxi0[] xxi0VarArr = xxi0.a;
        Map mapA = u.a("tab", jnkVar.a);
        this.f.a(new f.d(bnh0.d(this.a, new String[]{"my_accounts/gifts/how_to_use_gifts"}, mapA, 4)));
    }
}
