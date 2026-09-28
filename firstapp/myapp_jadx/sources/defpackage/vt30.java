package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.realsports.Favor;
import com.sporty.android.core.model.realsports.FavorInfo;
import com.sporty.android.core.model.realsports.Order;
import com.sportybet.android.bethistory.presentation.activity.RSportsBetTicketDetailsActivity;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.JackpotBet;
import com.sportybet.plugin.realsports.data.JackpotElement;
import com.sportybet.plugin.realsports.data.Winnings;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public final class vt30 implements gv5<BaseResponse<JackpotBet>> {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ RSportsBetTicketDetailsActivity b;

    public vt30(RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity, boolean z) {
        this.b = rSportsBetTicketDetailsActivity;
        this.a = z;
    }

    @Override // defpackage.gv5
    public final void onFailure(su5<BaseResponse<JackpotBet>> su5Var, Throwable th) {
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.b;
        if (rSportsBetTicketDetailsActivity.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        rSportsBetTicketDetailsActivity.B.setRefreshing(false);
        rSportsBetTicketDetailsActivity.C.setVisibility(8);
        if (this.a) {
            zyf0.c(1, rSportsBetTicketDetailsActivity.getCMSString(R.string.common_feedback__no_internet_connection_try_again, new Object[0]));
        } else {
            rSportsBetTicketDetailsActivity.C.I();
        }
    }

    @Override // defpackage.gv5
    public final void onResponse(su5<BaseResponse<JackpotBet>> su5Var, bi50<BaseResponse<JackpotBet>> bi50Var) {
        BaseResponse<JackpotBet> baseResponse;
        boolean z;
        List<Winnings> list;
        RSportsBetTicketDetailsActivity rSportsBetTicketDetailsActivity = this.b;
        if (rSportsBetTicketDetailsActivity.isFinishing() || su5Var.isCanceled()) {
            return;
        }
        rSportsBetTicketDetailsActivity.B.setRefreshing(false);
        rSportsBetTicketDetailsActivity.C.setVisibility(8);
        if (bi50Var.a.getIsSuccessful() && (baseResponse = bi50Var.b) != null) {
            BaseResponse<JackpotBet> baseResponse2 = baseResponse;
            if (baseResponse2.bizCode == 10000) {
                rSportsBetTicketDetailsActivity.H.clear();
                JackpotBet jackpotBet = baseResponse2.data;
                dr30 dr30Var = new dr30();
                dr30Var.a = jackpotBet;
                Order order = rSportsBetTicketDetailsActivity.J;
                dr30Var.b = order.winningStatus;
                dr30Var.d = order.shortId;
                dr30Var.c = order.createTime;
                Favor favor = order.favor;
                if (favor != null) {
                    List<FavorInfo> list2 = favor.favorInfo;
                    if (list2.size() > 0) {
                        dr30Var.e = list2.get(0).giftKind;
                    }
                }
                Order order2 = rSportsBetTicketDetailsActivity.J;
                dr30Var.e = order2.favorType;
                String str = order2.favorAmount;
                dr30Var.f = str;
                if (bjb0.d0(str) <= 0.0d && (list = jackpotBet.orderWinnings) != null) {
                    list.size();
                }
                rSportsBetTicketDetailsActivity.H.add(dr30Var);
                List<Winnings> list3 = jackpotBet.orderWinnings;
                if (list3 != null && list3.size() > 0) {
                    for (Winnings winnings : list3) {
                        hr30 hr30Var = new hr30();
                        hr30Var.a = winnings;
                        rSportsBetTicketDetailsActivity.H.add(hr30Var);
                    }
                }
                List<JackpotElement> list4 = jackpotBet.elements;
                if (list4 != null && list4.size() > 0) {
                    ir30 ir30Var = new ir30();
                    ir30Var.c = false;
                    ir30Var.d = jackpotBet.periodNumber;
                    rSportsBetTicketDetailsActivity.H.add(ir30Var);
                    for (JackpotElement jackpotElement : list4) {
                        gr30 gr30Var = new gr30();
                        gr30Var.a = jackpotElement;
                        rSportsBetTicketDetailsActivity.H.add(gr30Var);
                    }
                }
                ir30 ir30Var2 = new ir30();
                ir30Var2.c = true;
                ir30Var2.a = jackpotBet.maxWinnings;
                List<Winnings> list5 = jackpotBet.periodWinnings;
                ir30Var2.b = list5 != null && list5.size() > 0;
                rSportsBetTicketDetailsActivity.H.add(ir30Var2);
                List<Winnings> list6 = jackpotBet.periodWinnings;
                if (list6 != null && list6.size() > 0) {
                    jr30 jr30Var = new jr30();
                    jr30Var.b = 0;
                    rSportsBetTicketDetailsActivity.H.add(jr30Var);
                    int i = 1;
                    for (Winnings winnings2 : list6) {
                        jr30 jr30Var2 = new jr30();
                        jr30Var2.a = winnings2;
                        jr30Var2.b = i;
                        rSportsBetTicketDetailsActivity.H.add(jr30Var2);
                        i++;
                    }
                }
                int i2 = jackpotBet.status;
                int i3 = (i2 == 2 || i2 == 1) ? 1 : 2;
                rSportsBetTicketDetailsActivity.L = i3;
                fr30 fr30Var = rSportsBetTicketDetailsActivity.F;
                if (fr30Var != null) {
                    z = i3 == 1;
                    List<hl30> list7 = rSportsBetTicketDetailsActivity.H;
                    fr30Var.a = z;
                    fr30Var.b = list7;
                    fr30Var.notifyDataSetChanged();
                    return;
                }
                z = rSportsBetTicketDetailsActivity.L == 1;
                List<hl30> list8 = rSportsBetTicketDetailsActivity.H;
                fr30 fr30Var2 = new fr30();
                fr30Var2.a = z;
                fr30Var2.b = list8;
                rSportsBetTicketDetailsActivity.F = fr30Var2;
                rSportsBetTicketDetailsActivity.D.setAdapter(fr30Var2);
                return;
            }
        }
        onFailure(su5Var, null);
    }
}
