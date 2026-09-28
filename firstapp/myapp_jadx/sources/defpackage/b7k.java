package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.historydetail.data.LNBetDrawResultDTO;
import com.sportybet.feature.luckynumber.historydetail.data.LNBetOrderDTO;
import com.sportybet.feature.luckynumber.historydetail.data.LNBetOutcomeNumberDTO;
import com.sportybet.feature.luckynumber.historydetail.data.LNBetSelectionDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.historydetail.domain.GetHistoryDetailUseCase$invoke$1", f = "GetHistoryDetailUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class b7k extends tje0 implements gaj<BaseResponse<LNBetOrderDTO>, avq, v1b<? super f0q>, Object> {
    public /* synthetic */ BaseResponse a;
    public /* synthetic */ avq b;
    public final /* synthetic */ c7k c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b7k(c7k c7kVar, v1b<? super b7k> v1bVar) {
        super(3, v1bVar);
        this.c = c7kVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(BaseResponse<LNBetOrderDTO> baseResponse, avq avqVar, v1b<? super f0q> v1bVar) {
        b7k b7kVar = new b7k(this.c, v1bVar);
        b7kVar.a = baseResponse;
        b7kVar.b = avqVar;
        return b7kVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        uf00 uf00VarF;
        uf00 uf00VarF2;
        uf00 uf00VarF3;
        uf00 uf00VarF4;
        BigDecimal bigDecimal;
        Object next;
        List<Integer> bonusNumbers;
        List<Integer> mainNumbers;
        List<Integer> bonusNumbers2;
        List<Integer> mainNumbers2;
        BaseResponse baseResponse = this.a;
        avq avqVar = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LNBetOrderDTO lNBetOrderDTO = (LNBetOrderDTO) n52.b(baseResponse);
        boolean z = avqVar.m;
        String orderId = lNBetOrderDTO.getOrderId();
        String shortId = lNBetOrderDTO.getShortId();
        String currency = lNBetOrderDTO.getCurrency();
        pxq.a aVar = pxq.c;
        Integer numValueOf = Integer.valueOf(lNBetOrderDTO.getOrderType());
        aVar.getClass();
        pxq pxqVarA = pxq.a.a(numValueOf);
        BigDecimal bigDecimalB = c7k.b(lNBetOrderDTO.getTotalStake());
        BigDecimal bigDecimalB2 = c7k.b(lNBetOrderDTO.getTotalWinnings());
        hlr.a aVar2 = hlr.c;
        Integer numValueOf2 = Integer.valueOf(lNBetOrderDTO.getWinningStatus());
        aVar2.getClass();
        hlr hlrVarA = hlr.a.a(numValueOf2);
        int combinationSize = lNBetOrderDTO.getCombinationSize();
        int betSize = lNBetOrderDTO.getBetSize();
        long createTime = lNBetOrderDTO.getCreateTime();
        Long giftTotalAmount = lNBetOrderDTO.getGiftTotalAmount();
        BigDecimal bigDecimalB3 = giftTotalAmount != null ? c7k.b(giftTotalAmount.longValue()) : null;
        List<LNBetSelectionDTO> selections = lNBetOrderDTO.getSelections();
        ArrayList arrayList = new ArrayList(l48.r(selections, 10));
        Iterator it = selections.iterator();
        while (it.hasNext()) {
            LNBetSelectionDTO lNBetSelectionDTO = (LNBetSelectionDTO) it.next();
            hlr.a aVar3 = hlr.c;
            Integer numValueOf3 = Integer.valueOf(lNBetSelectionDTO.getStatus());
            aVar3.getClass();
            Iterator it2 = it;
            hlr hlrVarA2 = hlr.a.a(numValueOf3);
            String id = lNBetSelectionDTO.getId();
            String drawId = lNBetSelectionDTO.getDrawId();
            String lotteryId = lNBetSelectionDTO.getLotteryId();
            String lotteryTitle = lNBetSelectionDTO.getLotteryTitle();
            if (lotteryTitle == null) {
                lotteryTitle = "";
            }
            String str = lotteryTitle;
            String marketId = lNBetSelectionDTO.getMarketId();
            String marketTitle = lNBetSelectionDTO.getMarketTitle();
            String outcomeId = lNBetSelectionDTO.getOutcomeId();
            String str2 = orderId;
            BigDecimal bigDecimal2 = new BigDecimal(lNBetSelectionDTO.getOdds());
            rkd0.a aVar4 = rkd0.Companion;
            String prob = lNBetSelectionDTO.getProb();
            long resultTime = lNBetSelectionDTO.getResultTime();
            long createTime2 = lNBetSelectionDTO.getCreateTime();
            LNBetOutcomeNumberDTO outcomeNumber = lNBetSelectionDTO.getOutcomeNumber();
            if (outcomeNumber == null || (mainNumbers2 = outcomeNumber.getMainNumbers()) == null || (uf00VarF = a4h.f(mainNumbers2)) == null) {
                uf00VarF = n1a0.c;
            }
            uf00 uf00Var = uf00VarF;
            LNBetOutcomeNumberDTO outcomeNumber2 = lNBetSelectionDTO.getOutcomeNumber();
            if (outcomeNumber2 == null || (bonusNumbers2 = outcomeNumber2.getBonusNumbers()) == null || (uf00VarF2 = a4h.f(bonusNumbers2)) == null) {
                uf00VarF2 = n1a0.c;
            }
            uf00 uf00Var2 = uf00VarF2;
            LNBetDrawResultDTO drawResult = lNBetSelectionDTO.getDrawResult();
            if (drawResult == null || (mainNumbers = drawResult.getMainNumbers()) == null || (uf00VarF3 = a4h.f(mainNumbers)) == null) {
                uf00VarF3 = n1a0.c;
            }
            uf00 uf00Var3 = uf00VarF3;
            LNBetDrawResultDTO drawResult2 = lNBetSelectionDTO.getDrawResult();
            if (drawResult2 == null || (bonusNumbers = drawResult2.getBonusNumbers()) == null || (uf00VarF4 = a4h.f(bonusNumbers)) == null) {
                uf00VarF4 = n1a0.c;
            }
            uf00 uf00Var4 = uf00VarF4;
            String outcomeTitle = lNBetSelectionDTO.getOutcomeTitle();
            String correctOutcomeTitle = lNBetSelectionDTO.getCorrectOutcomeTitle();
            Iterator it3 = atq.w.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    bigDecimal = bigDecimal2;
                    next = null;
                    break;
                }
                next = it3.next();
                Iterator it4 = it3;
                bigDecimal = bigDecimal2;
                if (((atq) next).a.equals(lNBetSelectionDTO.getMarketType())) {
                    break;
                }
                it3 = it4;
                bigDecimal2 = bigDecimal;
            }
            atq atqVar = (atq) next;
            if (atqVar == null) {
                atqVar = atq.SNM;
            }
            arrayList.add(new v2q(id, drawId, lotteryId, str, marketId, marketTitle, atqVar, outcomeId, bigDecimal, prob, hlrVarA2, resultTime, createTime2, uf00Var, uf00Var2, uf00Var3, uf00Var4, correctOutcomeTitle, outcomeTitle, b.k(hlr.WIN, hlr.LOSE, hlr.VOID).contains(hlrVarA2)));
            it = it2;
            shortId = shortId;
            orderId = str2;
        }
        return new f0q(orderId, shortId, currency, pxqVarA, bigDecimalB, bigDecimalB3, bigDecimalB2, hlrVarA, combinationSize, betSize, createTime, z, a4h.f(arrayList));
    }
}
