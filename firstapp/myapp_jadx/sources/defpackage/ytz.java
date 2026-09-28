package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.pocket.withdraw.partner.PartnerWithdrawRequestDetailsDto;
import java.math.BigDecimal;
import java.util.Date;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class ytz implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object bVar;
        Object bVar2;
        cuz cuzVar;
        Object bVar3;
        Object bVar4;
        Object bVar5;
        Object bVar6;
        BigDecimal bigDecimalValueOf;
        BigDecimal bigDecimalValueOf2;
        BigDecimal bigDecimalValueOf3;
        PartnerWithdrawRequestDetailsDto partnerWithdrawRequestDetailsDto = (PartnerWithdrawRequestDetailsDto) obj;
        partnerWithdrawRequestDetailsDto.getClass();
        String tradeId = partnerWithdrawRequestDetailsDto.getTradeId();
        try {
            zi50.a aVar = zi50.b;
            Long requestTime = partnerWithdrawRequestDetailsDto.getRequestTime();
            bVar = requestTime != null ? new Date(requestTime.longValue()) : null;
        } catch (Throwable th) {
            zi50.a aVar2 = zi50.b;
            bVar = new zi50.b(th);
        }
        Throwable thA = zi50.a(bVar);
        if (thA != null) {
            itf0.a aVar3 = itf0.a;
            aVar3.q(MyLog.TAG_TRANSACTION);
            aVar3.p(thA, "Parse PartnerWithdrawRequestDetails.requestTime with failure.", new Object[0]);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        Date date = (Date) bVar;
        String ptnCode = partnerWithdrawRequestDetailsDto.getPtnCode();
        try {
            Long initAmount = partnerWithdrawRequestDetailsDto.getInitAmount();
            bVar2 = (initAmount == null || (bigDecimalValueOf3 = BigDecimal.valueOf(initAmount.longValue())) == null) ? null : p54.b(bigDecimalValueOf3);
        } catch (Throwable th2) {
            zi50.a aVar4 = zi50.b;
            bVar2 = new zi50.b(th2);
        }
        Throwable thA2 = zi50.a(bVar2);
        if (thA2 != null) {
            itf0.a aVar5 = itf0.a;
            aVar5.q(MyLog.TAG_TRANSACTION);
            aVar5.p(thA2, "Parse PartnerWithdrawRequestDetails.initAmount with failure.", new Object[0]);
            Unit unit = Unit.a;
        }
        if (bVar2 instanceof zi50.b) {
            bVar2 = null;
        }
        BigDecimal bigDecimal = (BigDecimal) bVar2;
        String currency = partnerWithdrawRequestDetailsDto.getCurrency();
        cuz.a aVar6 = cuz.b;
        Integer status = partnerWithdrawRequestDetailsDto.getStatus();
        aVar6.getClass();
        if (status == null) {
            cuzVar = cuz.UNKNOWN;
        } else {
            cuz[] cuzVarArrValues = cuz.values();
            int length = cuzVarArrValues.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    cuzVar = null;
                    break;
                }
                cuz cuzVar2 = cuzVarArrValues[i];
                if (cuzVar2.a == status.intValue()) {
                    cuzVar = cuzVar2;
                    break;
                }
                i++;
            }
            if (cuzVar == null) {
                cuzVar = cuz.UNKNOWN;
            }
        }
        cuz cuzVar3 = cuzVar;
        String pin = partnerWithdrawRequestDetailsDto.getPin();
        try {
            zi50.a aVar7 = zi50.b;
            Long cancelFee = partnerWithdrawRequestDetailsDto.getCancelFee();
            bVar3 = (cancelFee == null || (bigDecimalValueOf2 = BigDecimal.valueOf(cancelFee.longValue())) == null) ? null : p54.b(bigDecimalValueOf2);
        } catch (Throwable th3) {
            zi50.a aVar8 = zi50.b;
            bVar3 = new zi50.b(th3);
        }
        Throwable thA3 = zi50.a(bVar3);
        if (thA3 != null) {
            itf0.a aVar9 = itf0.a;
            aVar9.q(MyLog.TAG_TRANSACTION);
            aVar9.p(thA3, "Parse PartnerWithdrawRequestDetails.cancelFee with failure.", new Object[0]);
            Unit unit2 = Unit.a;
        }
        if (bVar3 instanceof zi50.b) {
            bVar3 = null;
        }
        BigDecimal bigDecimal2 = (BigDecimal) bVar3;
        try {
            Long ptnFee = partnerWithdrawRequestDetailsDto.getPtnFee();
            bVar4 = (ptnFee == null || (bigDecimalValueOf = BigDecimal.valueOf(ptnFee.longValue())) == null) ? null : p54.b(bigDecimalValueOf);
        } catch (Throwable th4) {
            zi50.a aVar10 = zi50.b;
            bVar4 = new zi50.b(th4);
        }
        Throwable thA4 = zi50.a(bVar4);
        if (thA4 != null) {
            itf0.a aVar11 = itf0.a;
            aVar11.q(MyLog.TAG_TRANSACTION);
            aVar11.p(thA4, "Parse PartnerWithdrawRequestDetails.ptnFee with failure.", new Object[0]);
            Unit unit3 = Unit.a;
        }
        if (bVar4 instanceof zi50.b) {
            bVar4 = null;
        }
        BigDecimal bigDecimal3 = (BigDecimal) bVar4;
        String ptnInfo = partnerWithdrawRequestDetailsDto.getPtnInfo();
        try {
            Long approveTime = partnerWithdrawRequestDetailsDto.getApproveTime();
            bVar5 = approveTime != null ? new Date(approveTime.longValue()) : null;
        } catch (Throwable th5) {
            zi50.a aVar12 = zi50.b;
            bVar5 = new zi50.b(th5);
        }
        Throwable thA5 = zi50.a(bVar5);
        if (thA5 != null) {
            itf0.a aVar13 = itf0.a;
            aVar13.q(MyLog.TAG_TRANSACTION);
            aVar13.p(thA5, "Parse PartnerWithdrawRequestDetails.approveTime with failure.", new Object[0]);
            Unit unit4 = Unit.a;
        }
        if (bVar5 instanceof zi50.b) {
            bVar5 = null;
        }
        Date date2 = (Date) bVar5;
        try {
            Long finishTime = partnerWithdrawRequestDetailsDto.getFinishTime();
            bVar6 = finishTime != null ? new Date(finishTime.longValue()) : null;
        } catch (Throwable th6) {
            zi50.a aVar14 = zi50.b;
            bVar6 = new zi50.b(th6);
        }
        Throwable thA6 = zi50.a(bVar6);
        if (thA6 != null) {
            itf0.a aVar15 = itf0.a;
            aVar15.q(MyLog.TAG_TRANSACTION);
            aVar15.p(thA6, "Parse PartnerWithdrawRequestDetails.finishTime with failure.", new Object[0]);
            Unit unit5 = Unit.a;
        }
        return new mtz(tradeId, date, ptnCode, bigDecimal, currency, cuzVar3, pin, bigDecimal2, bigDecimal3, ptnInfo, date2, (Date) (bVar6 instanceof zi50.b ? null : bVar6), partnerWithdrawRequestDetailsDto.getPlayerPhone());
    }
}
