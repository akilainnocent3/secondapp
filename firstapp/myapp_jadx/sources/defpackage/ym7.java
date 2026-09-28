package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.common.uievent.a;
import com.sporty.android.common.uievent.b;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.core.model.orders.BetTicketDetail;
import com.sporty.android.core.model.orders.BetTicketSelection;
import com.sporty.android.core.model.orders.UserNoteDto;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.data.RTicket;
import com.sportybet.plugin.realsports.data.UserNote;
import com.sportybet.plugin.realsports.event.comment.prematch.data.entity.ShareBetData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sportybet.android.choosebet.presentation.viewmodel.ChooseBetViewModel$loadSportsBetTickets$1", f = "ChooseBetViewModel.kt", l = {226}, m = "invokeSuspend", v = 2)
public final class ym7 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ bn7 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ym7(bn7 bn7Var, String str, v1b<? super ym7> v1bVar) {
        super(2, v1bVar);
        this.c = bn7Var;
        this.d = str;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ym7 ym7Var = new ym7(this.c, this.d, v1bVar);
        ym7Var.b = obj;
        return ym7Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ym7) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v10, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v3, types: [zi50$b] */
    /* JADX WARN: Type inference failed for: r10v9, types: [m2g] */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object bVar;
        UiText stringUiText;
        List<BetTicketSelection> selections;
        Object bVar2;
        UserNote userNote;
        Object objB;
        bn7 bn7Var = this.c;
        ku90<a> ku90Var = bn7Var.d;
        wwd0 wwd0Var = bn7Var.v;
        y5b y5bVar = y5b.a;
        int i = this.a;
        try {
            if (i == 0) {
                uj50.b(obj);
                String str = this.d;
                zi50.a aVar = zi50.b;
                wwd0Var.setValue(cm2.c.a);
                tm7 tm7Var = bn7Var.a;
                this.b = null;
                this.a = 1;
                objB = tm7Var.a.b(str, this);
                if (objB == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
                objB = obj;
            }
            BaseResponse baseResponse = (BaseResponse) objB;
            zi50.a aVar2 = zi50.b;
            bVar = baseResponse;
        } catch (Throwable th) {
            zi50.a aVar3 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (!(bVar instanceof zi50.b)) {
            BaseResponse baseResponse2 = (BaseResponse) bVar;
            if (baseResponse2.bizCode == 10000) {
                BetTicketDetail betTicketDetail = (BetTicketDetail) baseResponse2.data;
                if (betTicketDetail == null || (selections = betTicketDetail.getSelections()) == null || selections.isEmpty()) {
                    StringUiText stringUiText2 = vch0.a;
                    b.j(ku90Var, new ResourceUiText(R.string.common_feedback__something_went_wrong));
                    wwd0Var.setValue(cm2.a.a);
                } else {
                    RTicket rTicket = new RTicket();
                    Integer orderType = betTicketDetail.getOrderType();
                    rTicket.orderType = orderType != null ? orderType.intValue() : 0;
                    String shortId = betTicketDetail.getShortId();
                    if (shortId == null) {
                        shortId = "";
                    }
                    rTicket.shortId = shortId;
                    String orderId = betTicketDetail.getOrderId();
                    if (orderId == null) {
                        orderId = "";
                    }
                    rTicket.orderId = orderId;
                    String totalStake = betTicketDetail.getTotalStake();
                    if (totalStake == null) {
                        totalStake = "0";
                    }
                    rTicket.totalStake = totalStake;
                    String totalWinnings = betTicketDetail.getTotalWinnings();
                    if (totalWinnings == null) {
                        totalWinnings = "0";
                    }
                    rTicket.totalWinnings = totalWinnings;
                    Integer winningStatus = betTicketDetail.getWinningStatus();
                    rTicket.winningStatus = winningStatus != null ? winningStatus.intValue() : 0;
                    Long createTime = betTicketDetail.getCreateTime();
                    rTicket.createTime = createTime != null ? createTime.longValue() : 0L;
                    String totalBonus = betTicketDetail.getTotalBonus();
                    if (totalBonus == null) {
                        totalBonus = "0";
                    }
                    rTicket.totalBonus = totalBonus;
                    String potentialWinnings = betTicketDetail.getPotentialWinnings();
                    if (potentialWinnings == null) {
                        potentialWinnings = "0";
                    }
                    rTicket.potentialWinnings = potentialWinnings;
                    String favorAmount = betTicketDetail.getFavorAmount();
                    if (favorAmount == null) {
                        favorAmount = "0";
                    }
                    rTicket.favorAmount = favorAmount;
                    Integer favorType = betTicketDetail.getFavorType();
                    rTicket.favorType = favorType != null ? favorType.intValue() : 0;
                    try {
                        List<BetTicketSelection> selections2 = betTicketDetail.getSelections();
                        if (selections2 != null) {
                            bVar2 = new ArrayList(l48.r(selections2, 10));
                            Iterator<T> it = selections2.iterator();
                            while (it.hasNext()) {
                                bVar2.add(yc3.b((BetTicketSelection) it.next()));
                            }
                        } else {
                            bVar2 = m2g.a;
                        }
                    } catch (Throwable th2) {
                        zi50.a aVar4 = zi50.b;
                        bVar2 = new zi50.b(th2);
                    }
                    Throwable thA = zi50.a(bVar2);
                    Object obj2 = bVar2;
                    if (thA != null) {
                        obj2 = m2g.a;
                    }
                    rTicket.selections = (List) obj2;
                    String cashOutAmount = betTicketDetail.getCashOutAmount();
                    if (cashOutAmount == null) {
                        cashOutAmount = "0";
                    }
                    rTicket.cashOutAmount = cashOutAmount;
                    String remainStake = betTicketDetail.getRemainStake();
                    if (remainStake == null) {
                        remainStake = "0";
                    }
                    rTicket.remainStake = remainStake;
                    String remainPotentialWinnings = betTicketDetail.getRemainPotentialWinnings();
                    if (remainPotentialWinnings == null) {
                        remainPotentialWinnings = "0";
                    }
                    rTicket.remainPotentialWinnings = remainPotentialWinnings;
                    Integer betSize = betTicketDetail.getBetSize();
                    rTicket.betSize = betSize != null ? betSize.intValue() : 0;
                    String bonusPrize = betTicketDetail.getBonusPrize();
                    if (bonusPrize == null) {
                        bonusPrize = "0";
                    }
                    rTicket.bonusPrize = bonusPrize;
                    String usedStake = betTicketDetail.getUsedStake();
                    rTicket.usedStake = usedStake != null ? usedStake : "0";
                    Integer combinationSize = betTicketDetail.getCombinationSize();
                    rTicket.combinationSize = combinationSize != null ? combinationSize.intValue() : 0;
                    String totalOdds = betTicketDetail.getTotalOdds();
                    if (totalOdds == null) {
                        totalOdds = "1.0";
                    }
                    rTicket.totalOdds = totalOdds;
                    rTicket.finalTotalOdds = betTicketDetail.getFinalTotalOdds();
                    String shareCode = betTicketDetail.getShareCode();
                    if (shareCode == null) {
                        shareCode = "";
                    }
                    rTicket.shareCode = shareCode;
                    Integer minToWin = betTicketDetail.getMinToWin();
                    rTicket.minToWin = minToWin != null ? minToWin.intValue() : -1;
                    Integer currentMinToWin = betTicketDetail.getCurrentMinToWin();
                    rTicket.currentMinToWin = currentMinToWin != null ? currentMinToWin.intValue() : -1;
                    Integer selectionSize = betTicketDetail.getSelectionSize();
                    rTicket.selectionSize = selectionSize != null ? selectionSize.intValue() : -1;
                    Integer currentSelectionSize = betTicketDetail.getCurrentSelectionSize();
                    rTicket.currentSelectionSize = currentSelectionSize != null ? currentSelectionSize.intValue() : -1;
                    Boolean oddsBoosted = betTicketDetail.getOddsBoosted();
                    rTicket.oddsBoosted = oddsBoosted != null ? oddsBoosted.booleanValue() : false;
                    Integer paymentType = betTicketDetail.getPaymentType();
                    rTicket.paymentType = paymentType != null ? paymentType.intValue() : 0;
                    Integer percent = betTicketDetail.getPercent();
                    rTicket.percent = percent != null ? percent.intValue() : 0;
                    Boolean boolIsHistory = betTicketDetail.isHistory();
                    rTicket.isHistory = boolIsHistory != null ? boolIsHistory.booleanValue() : false;
                    rTicket.taxAmount = betTicketDetail.getTaxAmount();
                    rTicket.remainTaxAmount = betTicketDetail.getRemainTaxAmount();
                    rTicket.cutbetRemainingBonusAmount = betTicketDetail.getCutbetRemainingBonusAmount();
                    rTicket.cutbetWinningAmount = betTicketDetail.getCutbetWinningAmount();
                    rTicket.featureTags = betTicketDetail.getFeatureTags();
                    String cutbetType = betTicketDetail.getCutbetType();
                    if (cutbetType == null) {
                        cutbetType = "1";
                    }
                    rTicket.cutbetType = cutbetType;
                    Boolean boolIsEditable = betTicketDetail.isEditable();
                    rTicket.isEditable = boolIsEditable != null ? boolIsEditable.booleanValue() : false;
                    rTicket.betIds = betTicketDetail.getBetIds();
                    rTicket.currency = betTicketDetail.getCurrency();
                    rTicket.verifyCode = betTicketDetail.getVerifyCode();
                    Boolean boolIsOneCutWin = betTicketDetail.isOneCutWin();
                    rTicket.isOneCutWin = boolIsOneCutWin != null ? boolIsOneCutWin.booleanValue() : false;
                    rTicket.deviceId = betTicketDetail.getDeviceId();
                    rTicket.deviceIp = betTicketDetail.getDeviceIp();
                    rTicket.deviceCh = betTicketDetail.getDeviceCh();
                    UserNoteDto userNote2 = betTicketDetail.getUserNote();
                    if (userNote2 != null) {
                        String note = userNote2.getNote();
                        userNote = new UserNote(note != null ? note : "");
                    } else {
                        userNote = null;
                    }
                    rTicket.userNote = userNote;
                    Integer settleType = betTicketDetail.getSettleType();
                    rTicket.settleType = settleType != null ? settleType.intValue() : 0;
                    Boolean boolIsPaymentInProgress = betTicketDetail.isPaymentInProgress();
                    rTicket.isPaymentInProgress = boolIsPaymentInProgress != null ? boolIsPaymentInProgress.booleanValue() : false;
                    Boolean hasPendingEvent = betTicketDetail.getHasPendingEvent();
                    rTicket.hasPendingEvent = hasPendingEvent != null ? hasPendingEvent.booleanValue() : false;
                    String str2 = rTicket.shareCode;
                    String str3 = rTicket.totalStake;
                    String str4 = rTicket.finalTotalOdds;
                    if (str4 == null) {
                        str4 = rTicket.totalOdds;
                    }
                    String str5 = str4;
                    String str6 = rTicket.totalBonus;
                    str6.getClass();
                    String str7 = b6y.a.format(Double.parseDouble(str6));
                    str7.getClass();
                    cm2.d dVar = new cm2.d(rTicket, new ShareBetData(str2, str5, str7, "", str3, rTicket.isAllSelectionSettled(), ""));
                    wwd0Var.getClass();
                    wwd0Var.k(null, dVar);
                }
            } else {
                String str8 = baseResponse2.message;
                if (str8 != null) {
                    StringUiText stringUiText3 = vch0.a;
                    stringUiText = new StringUiText(str8);
                } else {
                    stringUiText = vch0.b;
                }
                b.j(ku90Var, stringUiText);
                wwd0Var.setValue(cm2.a.a);
            }
        }
        if (zi50.a(bVar) != null) {
            StringUiText stringUiText4 = vch0.a;
            b.j(ku90Var, new ResourceUiText(R.string.common_feedback__no_internet_connection_try_again));
            wwd0Var.setValue(cm2.a.a);
        }
        return Unit.a;
    }
}
