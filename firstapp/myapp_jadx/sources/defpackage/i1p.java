package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.core.model.security.biometric.BioAuthUsageResponse;

/* JADX INFO: loaded from: classes5.dex */
public final class i1p {
    public final w74 a;
    public final uqm b;
    public final psm c;
    public final ysm d;
    public final oc4 e;
    public final m2l f;

    public i1p(w74 w74Var, uqm uqmVar, psm psmVar, ysm ysmVar, oc4 oc4Var, m2l m2lVar) {
        w74Var.getClass();
        uqmVar.getClass();
        psmVar.getClass();
        ysmVar.getClass();
        oc4Var.getClass();
        m2lVar.getClass();
        this.a = w74Var;
        this.b = uqmVar;
        this.c = psmVar;
        this.d = ysmVar;
        this.e = oc4Var;
        this.f = m2lVar;
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:43:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ee A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:15:0x0035, B:49:0x00ea, B:51:0x00ee, B:53:0x00f4, B:22:0x0048, B:44:0x00cc, B:25:0x0051, B:40:0x00a6, B:28:0x0057, B:34:0x0073, B:36:0x007b, B:45:0x00d1, B:31:0x005e), top: B:63:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:55:0x00fa A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:58:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(boolean z, x1b x1bVar) {
        h1p h1pVar;
        boolean z2;
        Boolean boolValueOf;
        Boolean boolValueOf2;
        Boolean bool;
        boolean zBooleanValue;
        Boolean bool2;
        if (x1bVar instanceof h1p) {
            h1pVar = (h1p) x1bVar;
            int i = h1pVar.f;
            if ((i & Integer.MIN_VALUE) != 0) {
                h1pVar.f = i - Integer.MIN_VALUE;
            } else {
                h1pVar = new h1p(this, x1bVar);
            }
        } else {
            h1pVar = new h1p(this, x1bVar);
        }
        Object objD = h1pVar.d;
        y5b y5bVar = y5b.a;
        int i2 = h1pVar.f;
        m2l m2lVar = this.f;
        uqm uqmVar = this.b;
        boolean z3 = false;
        try {
            if (i2 == 0) {
                uj50.b(objD);
                oc4 oc4Var = this.e;
                String phoneNumber = uqmVar.getPhoneNumber();
                phoneNumber.getClass();
                h1pVar.a = z;
                h1pVar.f = 1;
                objD = oc4Var.d(phoneNumber, h1pVar);
                if (objD == y5bVar) {
                }
                return y5bVar;
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    z2 = h1pVar.b;
                    z = h1pVar.a;
                    uj50.b(objD);
                    boolean useForOtp = ((BioAuthUsageResponse) n52.b((BaseResponse) objD)).getUseForOtp();
                    boolValueOf = Boolean.valueOf(useForOtp);
                    boolValueOf2 = Boolean.valueOf(useForOtp);
                    h1pVar.c = boolValueOf;
                    h1pVar.a = z;
                    h1pVar.b = z2;
                    h1pVar.f = 3;
                    if (m2lVar.a.putBoolean("biometric_otp_bypass_enabled", boolValueOf2, h1pVar) != y5bVar) {
                        return y5bVar;
                    }
                    bool = boolValueOf;
                } else {
                    if (i2 != 3) {
                        if (i2 != 4) {
                            ib5.a("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z2 = h1pVar.b;
                        uj50.b(objD);
                        bool2 = (Boolean) objD;
                        if (bool2 != null) {
                            zBooleanValue = bool2.booleanValue();
                        } else {
                            zBooleanValue = false;
                        }
                        z3 = !uqmVar.isLogin() && z2 && zBooleanValue;
                        return Boolean.valueOf(z3);
                    }
                    z2 = h1pVar.b;
                    bool = h1pVar.c;
                    uj50.b(objD);
                }
                zBooleanValue = bool.booleanValue();
                z3 = !uqmVar.isLogin() && z2 && zBooleanValue;
                return Boolean.valueOf(z3);
            }
            z = h1pVar.a;
            uj50.b(objD);
            boolean zBooleanValue2 = ((Boolean) objD).booleanValue();
            if (z) {
                w74 w74Var = this.a;
                String phoneNumber2 = uqmVar.getPhoneNumber();
                phoneNumber2.getClass();
                lyh<BaseResponse<BioAuthUsageResponse>> lyhVarE = w74Var.e(this.c.P(), phoneNumber2, this.d.a().a);
                h1pVar.a = z;
                h1pVar.b = zBooleanValue2;
                h1pVar.f = 2;
                Object objA = s0i.a(lyhVarE, h1pVar);
                if (objA != y5bVar) {
                    objD = objA;
                    z2 = zBooleanValue2;
                    boolean useForOtp2 = ((BioAuthUsageResponse) n52.b((BaseResponse) objD)).getUseForOtp();
                    boolValueOf = Boolean.valueOf(useForOtp2);
                    boolValueOf2 = Boolean.valueOf(useForOtp2);
                    h1pVar.c = boolValueOf;
                    h1pVar.a = z;
                    h1pVar.b = z2;
                    h1pVar.f = 3;
                    if (m2lVar.a.putBoolean("biometric_otp_bypass_enabled", boolValueOf2, h1pVar) != y5bVar) {
                        bool = boolValueOf;
                        zBooleanValue = bool.booleanValue();
                        z3 = !uqmVar.isLogin() && z2 && zBooleanValue;
                        return Boolean.valueOf(z3);
                    }
                }
            } else {
                h1pVar.a = z;
                h1pVar.b = zBooleanValue2;
                h1pVar.f = 4;
                zed zedVar = m2lVar.a;
                zedVar.getClass();
                Object objF = zedVar.f(co20.a("biometric_otp_bypass_enabled"), h1pVar);
                if (objF != y5bVar) {
                    objD = objF;
                    z2 = zBooleanValue2;
                    bool2 = (Boolean) objD;
                    if (bool2 != null) {
                        zBooleanValue = bool2.booleanValue();
                    } else {
                        zBooleanValue = false;
                    }
                    z3 = !uqmVar.isLogin() && z2 && zBooleanValue;
                    return Boolean.valueOf(z3);
                }
            }
            return y5bVar;
        } catch (Throwable th) {
            itf0.a.d(inm.a("IsBiometricOtpBypassEnabled failed with error: ", th.getMessage()), new Object[0]);
        }
    }
}
