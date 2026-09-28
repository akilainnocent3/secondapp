package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.jackpot.activities.RSportsBetTicketDetailsActivity;
import com.sportybet.plugin.jackpot.data.Favor;
import com.sportybet.plugin.jackpot.data.FavorInfo;
import com.sportybet.plugin.jackpot.data.JackpotBet;
import com.sportybet.plugin.jackpot.data.JackpotElement;
import com.sportybet.plugin.jackpot.data.Order;
import com.sportybet.plugin.jackpot.data.RJackpotDTitleItem;
import com.sportybet.plugin.jackpot.data.RJackpotDeleteTicItem;
import com.sportybet.plugin.jackpot.data.RJackpotElementItem;
import com.sportybet.plugin.jackpot.data.RJackpotOrderWinningsItem;
import com.sportybet.plugin.jackpot.data.RJackpotPWinTitleItem;
import com.sportybet.plugin.jackpot.data.RJackpotPeriodWinningsItem;
import com.sportybet.plugin.jackpot.data.Winnings;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class nt30 implements gv5<BaseResponse<JackpotBet>> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ RSportsBetTicketDetailsActivity b;

    public nt30(RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity, boolean z) {
        this.b = rSportsBetTicketDetailsActivity;
        this.a = z;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<JackpotBet>> su5Var, Throwable th) {
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.b;
        if (rSportsBetTicketDetailsActivity.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        rSportsBetTicketDetailsActivity.c.setRefreshing(false);
        rSportsBetTicketDetailsActivity.d.setVisibility(8);
        if (this.a) {
            zyf0.c(1, rSportsBetTicketDetailsActivity.getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]));
        } else {
            rSportsBetTicketDetailsActivity.d.c();
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<JackpotBet>> su5Var, bi50<BaseResponse<JackpotBet>> bi50Var) {
        BaseResponse<JackpotBet> baseResponse;
        List<Winnings> list;
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.b;
        ArrayList arrayList = rSportsBetTicketDetailsActivity.i;
        if (rSportsBetTicketDetailsActivity.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        rSportsBetTicketDetailsActivity.c.setRefreshing(false);
        rSportsBetTicketDetailsActivity.d.setVisibility(8);
        if (bi50Var.a.getIsSuccessful() && (baseResponse = bi50Var.b) != null) {
            BaseResponse<JackpotBet> baseResponse2 = baseResponse;
            if (baseResponse2.bizCode == 10000) {
                arrayList.clear();
                JackpotBet jackpotBet = baseResponse2.data;
                RJackpotDTitleItem rJackpotDTitleItem = new RJackpotDTitleItem();
                rJackpotDTitleItem.bet = jackpotBet;
                Order order = rSportsBetTicketDetailsActivity.v;
                rJackpotDTitleItem.winningStatus = order.winningStatus;
                rJackpotDTitleItem.refundAmount = order.refundAmount;
                rJackpotDTitleItem.shortId = order.shortId;
                rJackpotDTitleItem.createTime = order.createTime;
                Favor favor = order.favor;
                if (favor != null) {
                    List<FavorInfo> list2 = favor.favorInfo;
                    if (list2.size() > 0) {
                        rJackpotDTitleItem.favorType = list2.get(0).giftKind;
                    }
                }
                Order order2 = rSportsBetTicketDetailsActivity.v;
                rJackpotDTitleItem.favorType = order2.favorType;
                String str = order2.favorAmount;
                rJackpotDTitleItem.favorAmount = str;
                rJackpotDTitleItem.showDividerLine = bjb0.d0(str) > 0.0d || ((list = jackpotBet.orderWinnings) != null && list.size() > 0);
                arrayList.add(rJackpotDTitleItem);
                List<Winnings> list3 = jackpotBet.orderWinnings;
                if (list3 != null && list3.size() > 0) {
                    for (Winnings winnings : list3) {
                        RJackpotOrderWinningsItem rJackpotOrderWinningsItem = new RJackpotOrderWinningsItem();
                        rJackpotOrderWinningsItem.winnings = winnings;
                        rJackpotOrderWinningsItem.betType = jackpotBet.betType;
                        arrayList.add(rJackpotOrderWinningsItem);
                    }
                }
                List<JackpotElement> list4 = jackpotBet.elements;
                if (list4 != null && list4.size() > 0) {
                    RJackpotPWinTitleItem rJackpotPWinTitleItem = new RJackpotPWinTitleItem();
                    rJackpotPWinTitleItem.isBottom = false;
                    rJackpotPWinTitleItem.periodNumber = jackpotBet.periodNumber;
                    arrayList.add(rJackpotPWinTitleItem);
                    for (JackpotElement jackpotElement : list4) {
                        RJackpotElementItem rJackpotElementItem = new RJackpotElementItem();
                        rJackpotElementItem.element = jackpotElement;
                        arrayList.add(rJackpotElementItem);
                    }
                }
                RJackpotPWinTitleItem rJackpotPWinTitleItem2 = new RJackpotPWinTitleItem();
                rJackpotPWinTitleItem2.isBottom = true;
                rJackpotPWinTitleItem2.maxWinnings = jackpotBet.maxWinnings;
                rJackpotPWinTitleItem2.betType = jackpotBet.betType;
                List<Winnings> list5 = jackpotBet.periodWinnings;
                rJackpotPWinTitleItem2.hasPeriodWinnings = list5 != null && list5.size() > 0;
                arrayList.add(rJackpotPWinTitleItem2);
                List<Winnings> list6 = jackpotBet.periodWinnings;
                if (list6 != null && list6.size() > 0) {
                    RJackpotPeriodWinningsItem rJackpotPeriodWinningsItem = new RJackpotPeriodWinningsItem();
                    rJackpotPeriodWinningsItem.index = 0;
                    arrayList.add(rJackpotPeriodWinningsItem);
                    int i = 1;
                    for (Winnings winnings2 : list6) {
                        RJackpotPeriodWinningsItem rJackpotPeriodWinningsItem2 = new RJackpotPeriodWinningsItem();
                        rJackpotPeriodWinningsItem2.winnings = winnings2;
                        rJackpotPeriodWinningsItem2.betType = jackpotBet.betType;
                        rJackpotPeriodWinningsItem2.index = i;
                        arrayList.add(rJackpotPeriodWinningsItem2);
                        i++;
                    }
                }
                int i2 = jackpotBet.status;
                if (i2 == 2 || i2 == 1) {
                    RJackpotDeleteTicItem rJackpotDeleteTicItem = new RJackpotDeleteTicItem();
                    rJackpotDeleteTicItem.id = jackpotBet.id;
                    arrayList.add(rJackpotDeleteTicItem);
                }
                er30 er30Var = rSportsBetTicketDetailsActivity.f;
                if (er30Var != null) {
                    er30Var.b = arrayList;
                    er30Var.notifyDataSetChanged();
                    return;
                }
                int i3 = jackpotBet.status;
                rSportsBetTicketDetailsActivity.y = (i3 == 2 || i3 == 1) ? 1 : 2;
                er30 er30Var2 = new er30(rSportsBetTicketDetailsActivity, rSportsBetTicketDetailsActivity.y == 1, arrayList);
                rSportsBetTicketDetailsActivity.f = er30Var2;
                rSportsBetTicketDetailsActivity.e.setAdapter(er30Var2);
                return;
            }
        }
        onFailure(su5Var, null);
    }
}
