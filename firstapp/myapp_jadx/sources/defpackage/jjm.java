package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$waitIsFeaturedCodeEnabledBOConfig$1", f = "HomeViewModel.kt", l = {938}, m = "invokeSuspend", v = 2)
public final class jjm extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public BOConfigParam a;
    public Boolean b;
    public int c;
    public final /* synthetic */ iim d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jjm(iim iimVar, v1b<? super jjm> v1bVar) {
        super(2, v1bVar);
        this.d = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new jjm(this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jjm) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BOConfigParam bOConfigParam;
        Boolean bool;
        Boolean boolR0;
        iim iimVar = this.d;
        wwd0 wwd0Var = iimVar.l0;
        y5b y5bVar = y5b.a;
        int i = this.c;
        if (i == 0) {
            uj50.b(obj);
            wwd0Var.setValue(lk50.b.a);
            lq1 lq1Var = iimVar.v;
            BOConfigParam bOConfigParam2 = BOConfigParam.IsFeaturedCodeEnabled;
            Boolean bool2 = Boolean.FALSE;
            this.a = bOConfigParam2;
            this.b = bool2;
            this.c = 1;
            obj = qq1.j(lq1Var, this);
            if (obj == y5bVar) {
                return y5bVar;
            }
            bOConfigParam = bOConfigParam2;
            bool = bool2;
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            bool = this.b;
            bOConfigParam = this.a;
            uj50.b(obj);
        }
        BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
        if (bOConfigValueBundle != null) {
            BOConfigValueWrapper response = bOConfigValueBundle.getResponse(bOConfigParam);
            Object configValue = response != null ? response.getConfigValue() : null;
            dq7 dq7VarA = jq40.a(Boolean.class);
            if (dq7VarA.equals(jq40.a(Integer.TYPE))) {
                if (configValue instanceof Integer) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                    boolR0 = null;
                }
            } else if (dq7VarA.equals(jq40.a(Long.TYPE))) {
                if (configValue instanceof Long) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.s0((String) configValue);
                    }
                    boolR0 = null;
                }
            } else if (dq7VarA.equals(jq40.a(Float.TYPE))) {
                if (configValue instanceof Float) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                } else {
                    if (configValue instanceof String) {
                        b.i((String) configValue);
                    }
                    boolR0 = null;
                }
            } else if (!dq7VarA.equals(jq40.a(Double.TYPE))) {
                if (dq7VarA.equals(jq40.a(Boolean.TYPE))) {
                    if (configValue instanceof Boolean) {
                        boolR0 = (Boolean) configValue;
                    } else if (!(configValue instanceof String) || (boolR0 = StringsKt.r0((String) configValue)) == null) {
                    }
                } else if (dq7VarA.equals(jq40.a(String.class))) {
                    if (configValue != null) {
                        configValue.toString();
                    }
                } else if (configValue != null) {
                    if (!(configValue instanceof Boolean)) {
                        configValue = null;
                    }
                    boolR0 = (Boolean) configValue;
                }
                boolR0 = null;
            } else if (configValue instanceof Double) {
                if (!(configValue instanceof Boolean)) {
                    configValue = null;
                }
                boolR0 = (Boolean) configValue;
            } else {
                if (configValue instanceof String) {
                    b.h((String) configValue);
                }
                boolR0 = null;
            }
            if (boolR0 != null) {
                bool = boolR0;
            }
        }
        bool.booleanValue();
        lk50.c cVar = new lk50.c(bool);
        wwd0Var.getClass();
        wwd0Var.k(null, cVar);
        return Unit.a;
    }
}
