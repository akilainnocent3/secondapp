package com.sportybet.plugin.realsports.data;

import android.content.Context;
import android.text.TextUtils;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import defpackage.b3;
import defpackage.itf0;
import defpackage.oxc;
import defpackage.rr1;
import defpackage.sn5;
import defpackage.tug;
import defpackage.xdp;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class Bet implements Cloneable {
    public String betType;
    public xdp blob;
    public String bonus;
    public Long bonusRatio;
    public int combinationNum;
    public int combinationType;
    public long createTime;
    public String currency;
    public int eventStatus;
    public List<Integer> featureTags;
    public String flag;
    public String giftAmount;
    public int giftKind;
    public boolean hasEditBetHistory;
    public boolean hasPendingEvent;
    public String id;
    public boolean isCalcByFE;
    public boolean isCashAbleJS;
    public boolean isCashable;
    public boolean isEditable;
    public boolean isFallbackCashOut;
    public boolean isHugeCombo;
    public int isSettled;
    public int isSubscribe;
    public boolean isUseGift;
    public long longBonus;
    public long longWinnings;
    public String maxCashOutAmount;
    public String notCashableCode;
    public String notCashableReason;
    public String orderId;
    public String orderType;
    public String originStake;
    public int paymentType;
    public String potentialOneCutWinnings;
    public String potentialWinnings;
    public String remainPotentialWinnings;
    public List<BetSelection> selections;
    public String shareCode;
    public String shareUrl;
    public String stake;
    public int status;
    public List<SubBet> subBets;
    public int type;
    public String unavailableCode;
    public String userId;
    public UserNote userNote;
    public String winnings;
    public int minToWin = -1;
    public int selectionSize = -1;
    public List<CashOutBetJs> cashOutBetJs = new ArrayList();
    public boolean isJsCalcFailed = false;
    public boolean shouldShowRefreshButton = false;
    public boolean isCashoutAmountNotAcquired = false;
    public CashOut cashOut = new CashOut();

    private String getBetTypeLabel(String str, Context context) {
        String[] strArrSplit = str.split(" ", 2);
        return oxc.a(strArrSplit[0], " ", translate(strArrSplit.length > 1 ? strArrSplit[1] : "", context));
    }

    private String translate(String str, Context context) {
        return BetType.FOLDS.equals(str) ? sn5.b(context, R.string.component_betslip__folds, new Object[0]) : str;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public Bet m48clone() {
        try {
            return (Bet) super.clone();
        } catch (CloneNotSupportedException e) {
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT);
            aVar.o(e);
            return this;
        }
    }

    public boolean containsBetBuilderSelection() {
        List<BetSelection> list = this.selections;
        if (list == null) {
            return false;
        }
        Iterator<BetSelection> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().isBetBuilder()) {
                return true;
            }
        }
        return false;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return this.id.equals(((Bet) obj).id);
    }

    public List<CashOutBetJs> getCashOutJs() {
        this.cashOutBetJs.clear();
        Iterator<BetSelection> it = this.selections.iterator();
        while (it.hasNext()) {
            this.cashOutBetJs.add(it.next().toCashOutJs());
        }
        return this.cashOutBetJs;
    }

    public String getOrderTypeText(Context context) {
        String strB;
        String strB2;
        String str = this.orderType;
        str.getClass();
        if (str.equals("Singles")) {
            strB = sn5.b(context, R.string.bet_history__singles, new Object[0]);
        } else {
            strB = !str.equals(BetOrderType.MULTIPLE) ? sn5.b(context, R.string.bet_history__system, new Object[0]) : sn5.b(context, R.string.bet_history__multiple, new Object[0]);
        }
        if (this.orderType.equals(BetOrderType.SYSTEM) && !TextUtils.isEmpty(this.betType)) {
            String str2 = this.betType;
            str2.getClass();
            switch (str2) {
                case "Doubles":
                    strB2 = sn5.b(context, R.string.bet_history__doubles, new Object[0]);
                    break;
                case "Singles":
                    strB2 = sn5.b(context, R.string.bet_history__singles, new Object[0]);
                    break;
                case "Trebles":
                    strB2 = sn5.b(context, R.string.bet_history__trebles, new Object[0]);
                    break;
                default:
                    strB2 = getBetTypeLabel(this.betType, context);
                    break;
            }
            strB = tug.a(strB, " - ", strB2);
        }
        int i = this.combinationNum;
        return i > 1 ? strB.concat(sn5.b(context, R.string.app_common__cashout_header, String.valueOf(i))) : strB;
    }

    public String getPotWin() {
        try {
            return new BigDecimal(this.potentialWinnings).multiply(new BigDecimal(this.stake)).divide(new BigDecimal(this.originStake), 2, RoundingMode.HALF_UP).toPlainString();
        } catch (Exception unused) {
            return this.potentialWinnings;
        }
    }

    public String getReason() {
        String str;
        CashOut cashOut = this.cashOut;
        return (cashOut == null || (str = cashOut.errorMsg) == null) ? "" : str;
    }

    public int hashCode() {
        return this.id.hashCode();
    }

    public boolean isAnyWin() {
        List<Integer> list = this.featureTags;
        return list != null && !list.isEmpty() && this.featureTags.get(0).intValue() == 6 && this.type == 2;
    }

    public boolean isFlexBet() {
        return (this.minToWin == -1 || this.selectionSize == -1 || this.type != 4) ? false : true;
    }

    public boolean isLive() {
        int i;
        List<BetSelection> list = this.selections;
        if (list == null) {
            return false;
        }
        for (BetSelection betSelection : list) {
            if (!b3.T(betSelection.eventId) && ((i = betSelection.eventStatus) == 1 || i == 2)) {
                return true;
            }
        }
        return false;
    }

    public boolean isOneCutBet() {
        List<Integer> list = this.featureTags;
        return (list == null || list.isEmpty() || this.featureTags.get(0).intValue() != 5) ? false : true;
    }

    public boolean isSupportEditBet() {
        return this.isCashable && this.isEditable;
    }

    public BetCashOutVO toBetCashOutVO() {
        return new BetCashOutVO(this.id, this.orderId, this.userId, this.currency, this.stake, Boolean.FALSE);
    }

    public CashOutBet toCashOutLiteBet() {
        ArrayList arrayList = new ArrayList();
        Iterator<BetSelection> it = this.selections.iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().toCashOutSelection());
        }
        int i = this.giftKind;
        if (i == 0) {
            i = 0;
        }
        int i2 = i;
        String str = this.id;
        String str2 = this.userId;
        String str3 = this.orderId;
        Integer numValueOf = Integer.valueOf(this.status);
        Integer numValueOf2 = Integer.valueOf(this.type);
        Integer numValueOf3 = Integer.valueOf(this.paymentType);
        Boolean boolValueOf = Boolean.valueOf(this.isUseGift);
        String str4 = this.originStake;
        String str5 = this.stake;
        Long lValueOf = Long.valueOf(this.createTime);
        List<SubBet> list = this.subBets;
        if (list == null) {
            list = Collections.EMPTY_LIST;
        }
        return new CashOutBet(str, str2, str3, numValueOf, numValueOf2, numValueOf3, boolValueOf, str4, str5, lValueOf, arrayList, list, this.currency, Integer.valueOf(i2), this.giftAmount, this.featureTags);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Bet{id='");
        sb.append(this.id);
        sb.append("', status=");
        sb.append(this.status);
        sb.append(", orderType='");
        sb.append(this.orderType);
        sb.append("', betType='");
        sb.append(this.betType);
        sb.append("', combinationNum=");
        sb.append(this.combinationNum);
        sb.append(", combinationType=");
        sb.append(this.combinationType);
        sb.append(", originStake='");
        sb.append(this.originStake);
        sb.append("', stake='");
        sb.append(this.stake);
        sb.append("', winnings='");
        sb.append(this.winnings);
        sb.append("', bonus='");
        sb.append(this.bonus);
        sb.append("', notCashableReason='");
        sb.append(this.notCashableReason);
        sb.append("', potentialWinnings='");
        sb.append(this.potentialWinnings);
        sb.append("', isCashable=");
        sb.append(this.isCashable);
        sb.append(", eventStatus=");
        sb.append(this.eventStatus);
        sb.append(", userId='");
        sb.append(this.userId);
        sb.append("', orderId='");
        sb.append(this.orderId);
        sb.append("', type=");
        sb.append(this.type);
        sb.append(", paymentType=");
        sb.append(this.paymentType);
        sb.append(", isSubscribe=");
        sb.append(this.isSubscribe);
        sb.append(", isSettled=");
        sb.append(this.isSettled);
        sb.append(", isUseGift=");
        sb.append(this.isUseGift);
        sb.append(", longWinnings=");
        sb.append(this.longWinnings);
        sb.append(", longBonus=");
        sb.append(this.longBonus);
        sb.append(", remainPotentialWinnings='");
        sb.append(this.remainPotentialWinnings);
        sb.append("', createTime=");
        sb.append(this.createTime);
        sb.append(", blob=");
        sb.append(this.blob);
        sb.append(", flag='");
        sb.append(this.flag);
        sb.append("', selections=");
        sb.append(this.selections);
        sb.append(", cashOut=");
        sb.append(this.cashOut);
        sb.append(", minToWin=");
        sb.append(this.minToWin);
        sb.append(", selectionSize=");
        return rr1.b(sb, this.selectionSize, '}');
    }

    public void update(Bet bet) {
        this.cashOut.update(bet.cashOut);
        String str = bet.stake;
        if (str != null) {
            this.stake = str;
        }
        this.status = bet.status;
        this.isSubscribe = bet.isSubscribe;
        this.isSettled = bet.isSettled;
        this.isCashable = bet.isCashable;
        this.isEditable = bet.isEditable;
        this.hasEditBetHistory = bet.hasEditBetHistory;
        this.originStake = bet.originStake;
        this.winnings = bet.winnings;
        this.longWinnings = bet.longWinnings;
        this.bonus = bet.bonus;
        this.longBonus = bet.longBonus;
        this.potentialWinnings = bet.potentialWinnings;
        this.remainPotentialWinnings = bet.remainPotentialWinnings;
        this.isHugeCombo = bet.isHugeCombo;
        this.subBets = bet.subBets;
        this.isFallbackCashOut = bet.cashOut.isFallbackCashOut;
    }

    public void updateUserNote(String str) {
        this.userNote = new UserNote(str);
    }
}
