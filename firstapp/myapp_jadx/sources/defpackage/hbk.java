package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.globalpay.pixBtg.domain.GetPixPendingDepositsUseCase$getMinRemainingSecondsAsync$1", f = "GetPixPendingDepositsUseCase.kt", l = {96}, m = "invokeSuspend", v = 2)
public final class hbk extends tje0 implements Function2<v5b, v1b<? super Integer>, Object> {
    public BOConfigParam a;
    public Integer b;
    public int c;
    public final /* synthetic */ ebk d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hbk(ebk ebkVar, v1b<? super hbk> v1bVar) {
        super(2, v1bVar);
        this.d = ebkVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hbk(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Integer> v1bVar) {
        return ((hbk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0086  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BOConfigParam bOConfigParam;
        Integer num;
        Integer intOrNull;
        y5b y5bVar = y5b.a;
        int i = this.c;
        Object obj2 = null;
        if (i == 0) {
            uj50.b(obj);
            lq1 lq1Var = this.d.d;
            BOConfigParam bOConfigParam2 = BOConfigParam.PixBtgDepositMinRemainingSeconds;
            Integer num2 = new Integer(300);
            this.a = bOConfigParam2;
            this.b = num2;
            this.c = 1;
            obj = qq1.j(lq1Var, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            bOConfigParam = bOConfigParam2;
            num = num2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            num = this.b;
            bOConfigParam = this.a;
            uj50.b(obj);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle != null) {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Integer.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    obj2 = (Integer) configValue;
                } else if ((configValue instanceof String) && (intOrNull = StringsKt.toIntOrNull((String) configValue)) != null) {
                    obj2 = intOrNull;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (configValue instanceof Integer) {
                        obj2 = configValue;
                    }
                    obj2 = (Integer) obj2;
                } else if (configValue instanceof String) {
                    StringsKt.s0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (configValue instanceof Integer) {
                        obj2 = configValue;
                    }
                    obj2 = (Integer) obj2;
                } else if (configValue instanceof String) {
                    b.i((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (configValue instanceof Double) {
                    if (configValue instanceof Integer) {
                        obj2 = configValue;
                    }
                    obj2 = (Integer) obj2;
                } else if (configValue instanceof String) {
                    b.h((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                if (configValue instanceof Boolean) {
                    if (configValue instanceof Integer) {
                        obj2 = configValue;
                    }
                    obj2 = (Integer) obj2;
                } else if (configValue instanceof String) {
                    StringsKt.r0((String) configValue);
                }
            } else if (dq7VarA.equals(jq40.a(String.class))) {
                if (configValue != null) {
                    configValue.toString();
                }
            } else if (configValue != null) {
                if (configValue instanceof Integer) {
                    obj2 = configValue;
                }
                obj2 = (Integer) obj2;
            }
            if (obj2 != null) {
                return obj2;
            }
        }
        return num;
    }
}
