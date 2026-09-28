package defpackage;

import com.google.protobuf.DescriptorProtos;
import com.sporty.android.core.model.MyLog;
import com.sporty.android.core.model.cashout.CashOutMetricsSamplingUserIdTailDto;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.cashoutphase3.data.repository.CashoutMetricsRepositoryImpl$getShouldSendCashoutMetrics$2", f = "CashoutMetricsRepositoryImpl.kt", l = {DescriptorProtos.FileOptions.PHP_GENERIC_SERVICES_FIELD_NUMBER, 51}, m = "invokeSuspend", v = 2)
public final class cq6 extends tje0 implements Function2<v5b, v1b<? super Boolean>, Object> {
    public List a;
    public int b;
    public /* synthetic */ Object c;
    public final /* synthetic */ dq6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cq6(dq6 dq6Var, v1b<? super cq6> v1bVar) {
        super(2, v1bVar);
        this.d = dq6Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        cq6 cq6Var = new cq6(this.d, v1bVar);
        cq6Var.c = obj;
        return cq6Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Boolean> v1bVar) {
        return ((cq6) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:109:0x015f  */
    /* JADX WARN: Code duplicated, block: B:112:0x0166  */
    /* JADX WARN: Code duplicated, block: B:120:0x019c  */
    /* JADX WARN: Code duplicated, block: B:123:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:125:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:132:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:135:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:140:0x0208  */
    /* JADX WARN: Code duplicated, block: B:141:0x0217  */
    /* JADX WARN: Code duplicated, block: B:152:0x0264  */
    /* JADX WARN: Code duplicated, block: B:157:0x021a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:160:? A[LOOP:0: B:136:0x01f5->B:160:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x0087  */
    /* JADX WARN: Code duplicated, block: B:39:0x009d  */
    /* JADX WARN: Instruction removed from duplicated block: B:135:0x01d5, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List listS;
        List list;
        BOConfigValueBundle bOConfigValueBundle;
        CashOutMetricsSamplingUserIdTailDto[] cashOutMetricsSamplingUserIdTailDtoArr;
        String str;
        Object bVar;
        Integer num;
        CashOutMetricsSamplingUserIdTailDto cashOutMetricsSamplingUserIdTailDto;
        List<Integer> includingUserIdTail;
        String countryCode;
        boolean zEqualsIgnoreCase;
        v5b v5bVar = (v5b) this.c;
        y5b y5bVar = y5b.a;
        int i = this.b;
        dq6 dq6Var = this.d;
        Object obj2 = null;
        if (i == 0) {
            uj50.b(obj);
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_CASHOUT_METRICS);
            aVar.g("getShouldSendCashOutMetrics() called.", new Object[0]);
            lyh<lk50<BOConfigValueBundle>> lyhVarA = dq6Var.d.a(new pu0.a(0));
            this.c = v5bVar;
            this.b = 1;
            obj = bm50.p(lyhVarA, this);
            if (obj != y5bVar) {
            }
            return y5bVar;
        }
        if (i == 1) {
            uj50.b(obj);
        } else {
            if (i != 2) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = this.a;
            uj50.b(obj);
        }
        if (((String) obj).length() <= 0) {
            obj = null;
        }
        str = (String) obj;
        if (str == null) {
            return Boolean.FALSE;
        }
        itf0.a aVar2 = itf0.a;
        aVar2.q(MyLog.TAG_CASHOUT_METRICS);
        aVar2.g("userId in getShouldSendCashOutMetrics() = ".concat(str), new Object[0]);
        try {
            zi50.a aVar3 = zi50.b;
            bVar = new Integer(Integer.parseInt(wae0.L(1, str)));
        } catch (Throwable th) {
            zi50.a aVar4 = zi50.b;
            bVar = new zi50.b(th);
        }
        if (bVar instanceof zi50.b) {
            bVar = null;
        }
        num = (Integer) bVar;
        if (num != null) {
            return Boolean.FALSE;
        }
        int iIntValue = num.intValue();
        itf0.a aVar5 = itf0.a;
        aVar5.q(MyLog.TAG_CASHOUT_METRICS);
        aVar5.g("userIdTail in getShouldSendCashOutMetrics() = " + iIntValue, new Object[0]);
        for (Object obj3 : list) {
            countryCode = ((CashOutMetricsSamplingUserIdTailDto) obj3).getCountryCode();
            if (countryCode != null) {
                zEqualsIgnoreCase = countryCode.equalsIgnoreCase(dq6Var.a.getCountryCode().getCode());
            } else {
                zEqualsIgnoreCase = false;
            }
            if (zEqualsIgnoreCase) {
                obj2 = obj3;
                break;
            }
        }
        cashOutMetricsSamplingUserIdTailDto = (CashOutMetricsSamplingUserIdTailDto) obj2;
        if (cashOutMetricsSamplingUserIdTailDto != null || (includingUserIdTail = cashOutMetricsSamplingUserIdTailDto.getIncludingUserIdTail()) == null) {
            return Boolean.FALSE;
        }
        itf0.a aVar6 = itf0.a;
        aVar6.q(MyLog.TAG_CASHOUT_METRICS);
        aVar6.g("includingUserIdTail in getShouldSendCashOutMetrics() = " + includingUserIdTail, new Object[0]);
        boolean zContains = includingUserIdTail.contains(new Integer(iIntValue));
        Boolean boolValueOf = Boolean.valueOf(zContains);
        aVar6.q(MyLog.TAG_CASHOUT_METRICS);
        aVar6.g("getShouldSendCashOutMetrics() finally returns " + zContains, new Object[0]);
        return boolValueOf;
        lk50 lk50Var = (lk50) obj;
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        if (cVar == null || (bOConfigValueBundle = (BOConfigValueBundle) cVar.a) == null) {
            listS = m2g.a;
        } else {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(BOConfigParam.CashoutMetricsSamplingUserIdTail);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(CashOutMetricsSamplingUserIdTailDto[].class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (!(configValue instanceof Integer)) {
                    if (!(configValue instanceof String) || (configValue = StringsKt.toIntOrNull((String) configValue)) == null) {
                        cashOutMetricsSamplingUserIdTailDtoArr = null;
                    } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                        configValue = null;
                    }
                    if (cashOutMetricsSamplingUserIdTailDtoArr != null || (listS = ay0.S(cashOutMetricsSamplingUserIdTailDtoArr)) == null) {
                        listS = m2g.a;
                    }
                } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                    configValue = null;
                }
                cashOutMetricsSamplingUserIdTailDtoArr = (CashOutMetricsSamplingUserIdTailDto[]) configValue;
                if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                    listS = m2g.a;
                } else {
                    listS = m2g.a;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (!(configValue instanceof Long)) {
                    if (!(configValue instanceof String) || (configValue = StringsKt.s0((String) configValue)) == null) {
                        cashOutMetricsSamplingUserIdTailDtoArr = null;
                    } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                        configValue = null;
                    }
                    if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                        listS = m2g.a;
                    } else {
                        listS = m2g.a;
                    }
                } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                    configValue = null;
                }
                cashOutMetricsSamplingUserIdTailDtoArr = (CashOutMetricsSamplingUserIdTailDto[]) configValue;
                if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                    listS = m2g.a;
                } else {
                    listS = m2g.a;
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (!(configValue instanceof Float)) {
                    if (!(configValue instanceof String) || (configValue = b.i((String) configValue)) == null) {
                        cashOutMetricsSamplingUserIdTailDtoArr = null;
                    } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                        configValue = null;
                    }
                    if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                        listS = m2g.a;
                    } else {
                        listS = m2g.a;
                    }
                } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                    configValue = null;
                }
                cashOutMetricsSamplingUserIdTailDtoArr = (CashOutMetricsSamplingUserIdTailDto[]) configValue;
                if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                    listS = m2g.a;
                } else {
                    listS = m2g.a;
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (!(configValue instanceof Double)) {
                    if (!(configValue instanceof String) || (configValue = b.h((String) configValue)) == null) {
                        cashOutMetricsSamplingUserIdTailDtoArr = null;
                    } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                        configValue = null;
                    }
                    if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                        listS = m2g.a;
                    } else {
                        listS = m2g.a;
                    }
                } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                    configValue = null;
                }
                cashOutMetricsSamplingUserIdTailDtoArr = (CashOutMetricsSamplingUserIdTailDto[]) configValue;
                if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                    listS = m2g.a;
                } else {
                    listS = m2g.a;
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (!(configValue instanceof Boolean)) {
                    if (!(configValue instanceof String) || (configValue = StringsKt.r0((String) configValue)) == null) {
                        cashOutMetricsSamplingUserIdTailDtoArr = null;
                    } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                        configValue = null;
                    }
                    if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                        listS = m2g.a;
                    } else {
                        listS = m2g.a;
                    }
                } else if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                    configValue = null;
                }
                cashOutMetricsSamplingUserIdTailDtoArr = (CashOutMetricsSamplingUserIdTailDto[]) configValue;
                if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                    listS = m2g.a;
                } else {
                    listS = m2g.a;
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue == null || (configValue = configValue.toString()) == null) {
                    cashOutMetricsSamplingUserIdTailDtoArr = null;
                } else {
                    if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                        configValue = null;
                    }
                    cashOutMetricsSamplingUserIdTailDtoArr = (CashOutMetricsSamplingUserIdTailDto[]) configValue;
                }
                if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                    listS = m2g.a;
                } else {
                    listS = m2g.a;
                }
            } else {
                if (configValue != null) {
                    if (!(configValue instanceof CashOutMetricsSamplingUserIdTailDto[])) {
                        configValue = null;
                    }
                    cashOutMetricsSamplingUserIdTailDtoArr = (CashOutMetricsSamplingUserIdTailDto[]) configValue;
                } else {
                    cashOutMetricsSamplingUserIdTailDtoArr = null;
                }
                if (cashOutMetricsSamplingUserIdTailDtoArr != null) {
                    listS = m2g.a;
                } else {
                    listS = m2g.a;
                }
            }
        }
        itf0.a aVar7 = itf0.a;
        aVar7.q(MyLog.TAG_CASHOUT_METRICS);
        aVar7.g("cashOutMetricsSamplingUserIdTails in getShouldSendCashOutMetrics() = " + listS, new Object[0]);
        mgb0 mgb0Var = dq6Var.b;
        this.c = v5bVar;
        this.a = listS;
        this.b = 2;
        Object userId = mgb0Var.getUserId(this);
        if (userId != y5bVar) {
            List list2 = listS;
            obj = userId;
            list = list2;
            if (((String) obj).length() <= 0) {
                obj = null;
            }
            str = (String) obj;
            if (str == null) {
                return Boolean.FALSE;
            }
            itf0.a aVar8 = itf0.a;
            aVar8.q(MyLog.TAG_CASHOUT_METRICS);
            aVar8.g("userId in getShouldSendCashOutMetrics() = ".concat(str), new Object[0]);
            zi50.a aVar9 = zi50.b;
            bVar = new Integer(Integer.parseInt(wae0.L(1, str)));
            if (bVar instanceof zi50.b) {
                bVar = null;
            }
            num = (Integer) bVar;
            if (num != null) {
                return Boolean.FALSE;
            }
            int iIntValue2 = num.intValue();
            itf0.a aVar10 = itf0.a;
            aVar10.q(MyLog.TAG_CASHOUT_METRICS);
            aVar10.g("userIdTail in getShouldSendCashOutMetrics() = " + iIntValue2, new Object[0]);
            while (r12.hasNext()) {
                countryCode = ((CashOutMetricsSamplingUserIdTailDto) obj3).getCountryCode();
                if (countryCode != null) {
                    zEqualsIgnoreCase = countryCode.equalsIgnoreCase(dq6Var.a.getCountryCode().getCode());
                } else {
                    zEqualsIgnoreCase = false;
                }
                if (zEqualsIgnoreCase) {
                    obj2 = obj3;
                    break;
                }
            }
            cashOutMetricsSamplingUserIdTailDto = (CashOutMetricsSamplingUserIdTailDto) obj2;
            if (cashOutMetricsSamplingUserIdTailDto != null) {
            }
            return Boolean.FALSE;
        }
        return y5bVar;
    }
}
