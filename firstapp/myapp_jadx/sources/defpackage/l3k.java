package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sportybet.feature.luckynumber.bethistory.data.data.LNBetHistorySelectionDTO;
import com.sportybet.feature.luckynumber.bethistory.data.data.LNOrderDTO;
import com.sportybet.feature.luckynumber.bethistory.data.data.LNOrderListResponseDTO;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.bethistory.domain.GetBetHistoryUseCase$invoke$1$getHistory$1", f = "GetBetHistoryUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class l3k extends tje0 implements gaj<BaseResponse<LNOrderListResponseDTO>, qcn<? extends dsq>, v1b<? super wgq>, Object> {
    public /* synthetic */ BaseResponse a;
    public final /* synthetic */ m3k b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l3k(m3k m3kVar, v1b<? super l3k> v1bVar) {
        super(3, v1bVar);
        this.b = m3kVar;
    }

    @Override // defpackage.gaj
    public final Object invoke(BaseResponse<LNOrderListResponseDTO> baseResponse, qcn<? extends dsq> qcnVar, v1b<? super wgq> v1bVar) {
        l3k l3kVar = new l3k(this.b, v1bVar);
        l3kVar.a = baseResponse;
        return l3kVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:56:0x0100  */
    /* JADX WARN: Code duplicated, block: B:58:0x0107  */
    /* JADX WARN: Code duplicated, block: B:67:0x013d  */
    /* JADX WARN: Code duplicated, block: B:68:0x0147  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        LNOrderListResponseDTO lNOrderListResponseDTO;
        uf00 uf00VarF;
        vgq cVar;
        BigDecimal bigDecimalA;
        LNOrderListResponseDTO lNOrderListResponseDTO2;
        uf00 uf00VarF2;
        Long createTime;
        long jLongValue;
        BaseResponse baseResponse = this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        LNOrderListResponseDTO lNOrderListResponseDTO3 = (LNOrderListResponseDTO) n52.b(baseResponse);
        List<LNOrderDTO> orders = lNOrderListResponseDTO3.getOrders();
        if (orders != null) {
            int i = 10;
            ArrayList arrayList = new ArrayList(l48.r(orders, 10));
            for (LNOrderDTO lNOrderDTO : orders) {
                hlr.a aVar = hlr.c;
                Integer winningStatus = lNOrderDTO.getWinningStatus();
                aVar.getClass();
                hlr hlrVarA = hlr.a.a(winningStatus);
                String orderId = lNOrderDTO.getOrderId();
                String str = orderId == null ? "" : orderId;
                String shortId = lNOrderDTO.getShortId();
                String str2 = shortId == null ? "" : shortId;
                pxq.a aVar2 = pxq.c;
                Integer orderType = lNOrderDTO.getOrderType();
                aVar2.getClass();
                pxq pxqVarA = pxq.a.a(orderType);
                Long totalStake = lNOrderDTO.getTotalStake();
                if (totalStake != null) {
                    bigDecimalA = m3k.a(totalStake.longValue());
                } else {
                    rkd0.Companion.getClass();
                    bigDecimalA = rkd0.b;
                }
                BigDecimal bigDecimal = bigDecimalA;
                Long totalWinnings = lNOrderDTO.getTotalWinnings();
                BigDecimal bigDecimalA2 = totalWinnings != null ? m3k.a(totalWinnings.longValue()) : null;
                String currency = lNOrderDTO.getCurrency();
                String str3 = currency == null ? "" : currency;
                Integer combinationSize = lNOrderDTO.getCombinationSize();
                int iIntValue = combinationSize != null ? combinationSize.intValue() : 0;
                Integer selectionSize = lNOrderDTO.getSelectionSize();
                int iIntValue2 = selectionSize != null ? selectionSize.intValue() : 0;
                List<LNBetHistorySelectionDTO> selections = lNOrderDTO.getSelections();
                if (selections != null) {
                    lNOrderListResponseDTO2 = lNOrderListResponseDTO3;
                    ArrayList arrayList2 = new ArrayList(l48.r(selections, i));
                    Iterator it = selections.iterator();
                    while (it.hasNext()) {
                        LNBetHistorySelectionDTO lNBetHistorySelectionDTO = (LNBetHistorySelectionDTO) it.next();
                        String lotteryId = lNBetHistorySelectionDTO.getLotteryId();
                        Iterator it2 = it;
                        String str4 = lotteryId == null ? "" : lotteryId;
                        String lotteryTitle = lNBetHistorySelectionDTO.getLotteryTitle();
                        if (lotteryTitle == null) {
                            lotteryTitle = "";
                        }
                        arrayList2.add(new ekq(str4, lotteryTitle));
                        it = it2;
                    }
                    uf00VarF2 = a4h.f(arrayList2);
                    if (uf00VarF2 == null) {
                    }
                    uf00 uf00Var = uf00VarF2;
                    createTime = lNOrderDTO.getCreateTime();
                    if (createTime != null) {
                        jLongValue = createTime.longValue();
                    } else {
                        jLongValue = 0;
                    }
                    arrayList.add(new lxq(str, str2, pxqVarA, bigDecimal, bigDecimalA2, hlrVarA, str3, iIntValue, iIntValue2, uf00Var, jLongValue, b.k(hlr.WIN, hlr.LOSE, hlr.VOID).contains(hlrVarA)));
                    i = 10;
                    lNOrderListResponseDTO3 = lNOrderListResponseDTO2;
                } else {
                    lNOrderListResponseDTO2 = lNOrderListResponseDTO3;
                }
                uf00VarF2 = n1a0.c;
                uf00 uf00Var2 = uf00VarF2;
                createTime = lNOrderDTO.getCreateTime();
                if (createTime != null) {
                    jLongValue = createTime.longValue();
                } else {
                    jLongValue = 0;
                }
                arrayList.add(new lxq(str, str2, pxqVarA, bigDecimal, bigDecimalA2, hlrVarA, str3, iIntValue, iIntValue2, uf00Var2, jLongValue, b.k(hlr.WIN, hlr.LOSE, hlr.VOID).contains(hlrVarA)));
                i = 10;
                lNOrderListResponseDTO3 = lNOrderListResponseDTO2;
            }
            lNOrderListResponseDTO = lNOrderListResponseDTO3;
            uf00VarF = a4h.f(arrayList);
            if (uf00VarF == null) {
            }
            if (lNOrderListResponseDTO.getNextCursor() != null) {
                cVar = new vgq.c(lNOrderListResponseDTO.getNextCursor());
            } else {
                cVar = vgq.a.a;
            }
            return new wgq(uf00VarF, cVar);
        }
        lNOrderListResponseDTO = lNOrderListResponseDTO3;
        uf00VarF = n1a0.c;
        if (lNOrderListResponseDTO.getNextCursor() != null) {
            cVar = new vgq.c(lNOrderListResponseDTO.getNextCursor());
        } else {
            cVar = vgq.a.a;
        }
        return new wgq(uf00VarF, cVar);
    }
}
