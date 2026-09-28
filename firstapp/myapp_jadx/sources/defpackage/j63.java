package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sporty.android.core.model.config.bo.enums.BOConfigParam;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.viewmodel.BetSlipViewModel$1", f = "BetSlipViewModel.kt", l = {1938, 439, 450}, m = "invokeSuspend", v = 2)
public final class j63 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public Enum a;
    public Boolean b;
    public q73 c;
    public int d;
    public final /* synthetic */ q73 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j63(q73 q73Var, v1b<? super j63> v1bVar) {
        super(2, v1bVar);
        this.e = q73Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new j63(this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((j63) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x016b  */
    /* JADX WARN: Code duplicated, block: B:103:0x016f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0184  */
    /* JADX WARN: Code duplicated, block: B:108:0x0187  */
    /* JADX WARN: Code duplicated, block: B:28:0x007c  */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BOConfigParam bOConfigParam;
        Boolean bool;
        q73 q73Var;
        Boolean boolR0;
        q43 q43Var;
        q43 q43Var2;
        q43 q43Var3;
        wm20 wm20VarA;
        q43 q43Var4;
        wwd0 wwd0Var;
        Object value;
        q73 q73Var2 = this.e;
        jrm jrmVar = q73Var2.N;
        r43 r43Var = q73Var2.c0;
        y5b y5bVar = y5b.a;
        int i = this.d;
        if (i == 0) {
            uj50.b(obj);
            lq1 lq1Var = q73Var2.g0;
            bOConfigParam = BOConfigParam.SimpleStandardBetSlipEnabled;
            Boolean bool2 = Boolean.FALSE;
            this.a = bOConfigParam;
            this.b = bool2;
            this.c = q73Var2;
            this.d = 1;
            obj = qq1.j(lq1Var, this);
            if (obj != y5bVar) {
                bool = bool2;
                q73Var = q73Var2;
            }
            return y5bVar;
        }
        if (i == 1) {
            q73Var = this.c;
            bool = this.b;
            bOConfigParam = (BOConfigParam) this.a;
            uj50.b(obj);
        } else {
            if (i == 2) {
                uj50.b(obj);
                q43Var = (q43) obj;
                if (q73Var2.H1 || jrmVar.m0() || jrmVar.D()) {
                    q43Var2 = q43.a;
                } else {
                    q43Var2 = (q73Var2.H1 && q43Var == q43.a) ? q43.b : q43Var;
                }
                if (q43Var != q43Var2) {
                    wm20VarA = r43Var.b.a(r43Var, r43.c[0]);
                    this.a = q43Var2;
                    this.d = 3;
                    if (wm20VarA.g(this, q43Var2) != y5bVar) {
                        q43Var4 = q43Var2;
                    }
                    return y5bVar;
                }
                q43Var3 = q43Var2;
                q73Var2.A1.setValue(q43Var3);
                wwd0Var = q73Var2.D1;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, bw3.a((bw3) value, 0, q43Var3, null, null, null, 29)));
                return Unit.a;
            }
            if (i != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            q43Var4 = (q43) this.a;
            uj50.b(obj);
        }
        q43Var3 = q43Var4;
        q73Var2.A1.setValue(q43Var3);
        wwd0Var = q73Var2.D1;
        do {
            value = wwd0Var.getValue();
        } while (!wwd0Var.g(value, bw3.a((bw3) value, 0, q43Var3, null, null, null, 29)));
        return Unit.a;
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
        q73Var.H1 = bool.booleanValue();
        wm20 wm20VarA2 = r43Var.b.a(r43Var, r43.c[0]);
        q43 q43Var5 = q43.b;
        this.a = null;
        this.b = null;
        this.c = null;
        this.d = 2;
        obj = wm20VarA2.e(this, q43Var5);
        if (obj != y5bVar) {
            q43Var = (q43) obj;
            if (q73Var2.H1) {
                q43Var2 = q43.a;
            } else {
                q43Var2 = q43.a;
            }
            if (q43Var != q43Var2) {
                wm20VarA = r43Var.b.a(r43Var, r43.c[0]);
                this.a = q43Var2;
                this.d = 3;
                if (wm20VarA.g(this, q43Var2) != y5bVar) {
                    q43Var4 = q43Var2;
                    q43Var3 = q43Var4;
                }
            } else {
                q43Var3 = q43Var2;
            }
            q73Var2.A1.setValue(q43Var3);
            wwd0Var = q73Var2.D1;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, bw3.a((bw3) value, 0, q43Var3, null, null, null, 29)));
            return Unit.a;
        }
        return y5bVar;
    }
}
