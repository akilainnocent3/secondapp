package defpackage;

import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.pocket.withdraw.PartnerWithdrawFeeConfigDto;
import com.sportybet.plugin.realsports.data.BetSelection;
import java.math.BigDecimal;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class i100 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ i100(int i) {
        this.a = i;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    /* JADX WARN: Code duplicated, block: B:99:0x014c  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        PartnerWithdrawFeeConfigDto partnerWithdrawFeeConfigDto;
        Object bVar;
        Object bVar2;
        String rate;
        switch (this.a) {
            case 0:
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(qg4.PartnerWithdrawFeeConfigParam.a);
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(PartnerWithdrawFeeConfigDto.class);
                if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                    if (configValue instanceof Integer) {
                        if (!(configValue instanceof PartnerWithdrawFeeConfigDto)) {
                            configValue = null;
                        }
                        partnerWithdrawFeeConfigDto = (PartnerWithdrawFeeConfigDto) configValue;
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.toIntOrNull((String) configValue);
                        }
                        partnerWithdrawFeeConfigDto = null;
                    }
                } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                    if (configValue instanceof Long) {
                        if (!(configValue instanceof PartnerWithdrawFeeConfigDto)) {
                            configValue = null;
                        }
                        partnerWithdrawFeeConfigDto = (PartnerWithdrawFeeConfigDto) configValue;
                    } else {
                        if (configValue instanceof String) {
                            StringsKt.s0((String) configValue);
                        }
                        partnerWithdrawFeeConfigDto = null;
                    }
                } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                    if (configValue instanceof Float) {
                        if (!(configValue instanceof PartnerWithdrawFeeConfigDto)) {
                            configValue = null;
                        }
                        partnerWithdrawFeeConfigDto = (PartnerWithdrawFeeConfigDto) configValue;
                    } else {
                        if (configValue instanceof String) {
                            b.i((String) configValue);
                        }
                        partnerWithdrawFeeConfigDto = null;
                    }
                } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                    if (configValue instanceof Double) {
                        if (!(configValue instanceof PartnerWithdrawFeeConfigDto)) {
                            configValue = null;
                        }
                        partnerWithdrawFeeConfigDto = (PartnerWithdrawFeeConfigDto) configValue;
                    } else {
                        if (configValue instanceof String) {
                            b.h((String) configValue);
                        }
                        partnerWithdrawFeeConfigDto = null;
                    }
                } else if (!dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (dq7VarA.equals(jq40.a(String.class))) {
                        if (configValue != null) {
                            configValue.toString();
                        }
                    } else if (configValue != null) {
                        if (!(configValue instanceof PartnerWithdrawFeeConfigDto)) {
                            configValue = null;
                        }
                        partnerWithdrawFeeConfigDto = (PartnerWithdrawFeeConfigDto) configValue;
                    }
                    partnerWithdrawFeeConfigDto = null;
                } else if (configValue instanceof Boolean) {
                    if (!(configValue instanceof PartnerWithdrawFeeConfigDto)) {
                        configValue = null;
                    }
                    partnerWithdrawFeeConfigDto = (PartnerWithdrawFeeConfigDto) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.r0((String) configValue);
                    }
                    partnerWithdrawFeeConfigDto = null;
                }
                try {
                    zi50.a aVar = zi50.b;
                    bVar = (partnerWithdrawFeeConfigDto != null && (rate = partnerWithdrawFeeConfigDto.getRate()) != null) ? new BigDecimal(rate) : null;
                    break;
                } catch (Throwable th) {
                    zi50.a aVar2 = zi50.b;
                    bVar = new zi50.b(th);
                }
                Throwable thA = zi50.a(bVar);
                if (thA != null) {
                    itf0.a aVar3 = itf0.a;
                    aVar3.q(MyLog.TAG_WITHDRAW);
                    aVar3.f(thA, "rate convert failed.", new Object[0]);
                }
                if (bVar instanceof zi50.b) {
                    bVar = null;
                }
                BigDecimal bigDecimal = (BigDecimal) bVar;
                if (bigDecimal == null) {
                    bigDecimal = ltz.c;
                }
                if (bigDecimal.compareTo(BigDecimal.valueOf(1L)) > 0) {
                    bigDecimal = ltz.c;
                }
                if (partnerWithdrawFeeConfigDto != null) {
                    try {
                        String maxAmount = partnerWithdrawFeeConfigDto.getMaxAmount();
                        if (maxAmount != null) {
                            bVar2 = new BigDecimal(maxAmount);
                        } else {
                            bVar2 = null;
                        }
                    } catch (Throwable th2) {
                        zi50.a aVar4 = zi50.b;
                        bVar2 = new zi50.b(th2);
                    }
                    break;
                } else {
                    bVar2 = null;
                }
                Throwable thA2 = zi50.a(bVar2);
                if (thA2 != null) {
                    itf0.a aVar5 = itf0.a;
                    aVar5.q(MyLog.TAG_WITHDRAW);
                    aVar5.f(thA2, "maxAmount convert failed.", new Object[0]);
                }
                BigDecimal bigDecimal2 = (BigDecimal) (bVar2 instanceof zi50.b ? null : bVar2);
                if (bigDecimal2 == null) {
                    bigDecimal2 = ltz.d;
                }
                return new ltz(p54.a(bigDecimal), p54.a(bigDecimal2));
            default:
                BetSelection betSelection = (BetSelection) obj;
                return oxc.a(betSelection.outcomeDesc, "  ", betSelection.marketDesc);
        }
    }
}
