package defpackage;

import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.account.RegistrationKYCWebViewActivity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class svr implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ svr(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:116:0x0275  */
    /* JADX WARN: Code duplicated, block: B:73:0x0194  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        float f;
        boolean z;
        char c;
        gvr gvrVar;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                zvr zvrVar = (zvr) obj2;
                xvr xvrVar = zvrVar.p;
                pdd pddVar = zvrVar.a;
                boolean z2 = zvrVar.i;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= 0.0f || zvrVar.e()) && (f2 <= 0.0f || zvrVar.d())) {
                    if (Math.abs(zvrVar.g) > 0.5f) {
                        zkn.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = zvrVar.g + f2;
                    zvrVar.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = zvrVar.g;
                        int iB = ycv.b(f4);
                        gvr gvrVarN = ((gvr) ((x5a0) zvrVar.e).getValue()).n(iB, !zvrVar.b);
                        if (gvrVarN != null && (gvrVar = zvrVar.c) != null) {
                            gvr gvrVarN2 = gvrVar.n(iB, true);
                            if (gvrVarN2 != null) {
                                zvrVar.c = gvrVarN2;
                            } else {
                                gvrVarN = null;
                            }
                        }
                        int i2 = 0;
                        if (gvrVarN != null) {
                            zvrVar.f(gvrVarN, zvrVar.b, true);
                            zvrVar.r.setValue(Unit.a);
                            float f5 = f4 - zvrVar.g;
                            if (z2) {
                                duw<gyr.b> duwVar = pddVar.b;
                                if (gvrVarN.k().isEmpty()) {
                                    f = 0.5f;
                                } else {
                                    z = f5 < 0.0f;
                                    int iB2 = pdd.b(gvrVarN, z);
                                    int iA = pdd.a(gvrVarN, z);
                                    if (iA >= 0) {
                                        f = 0.5f;
                                        if (iA < gvrVarN.i()) {
                                            if (iB2 == pddVar.a || iB2 < 0) {
                                                c = ' ';
                                            } else {
                                                if (pddVar.c != z) {
                                                    gyr.b[] bVarArr = duwVar.a;
                                                    int i3 = duwVar.c;
                                                    c = ' ';
                                                    for (int i4 = 0; i4 < i3; i4++) {
                                                        bVarArr[i4].cancel();
                                                    }
                                                } else {
                                                    c = ' ';
                                                }
                                                pddVar.c = z;
                                                pddVar.a = iB2;
                                                duwVar.g();
                                                duwVar.d(duwVar.c, xvrVar.a(iB2));
                                            }
                                            if (z) {
                                                nur nurVar = (nur) CollectionsKt.b0(gvrVarN.k());
                                                if (((pvr.a(nurVar, gvrVarN.a()) + ((int) (gvrVarN.a() == i3z.a ? nurVar.a() & 4294967295L : nurVar.a() >> c))) + gvrVarN.j()) - gvrVarN.f() < (-f5)) {
                                                    gyr.b[] bVarArr2 = duwVar.a;
                                                    int i5 = duwVar.c;
                                                    while (i2 < i5) {
                                                        bVarArr2[i2].c();
                                                        i2++;
                                                    }
                                                }
                                            } else if (gvrVarN.h() - pvr.a((nur) CollectionsKt.T(gvrVarN.k()), gvrVarN.a()) < f5) {
                                                gyr.b[] bVarArr3 = duwVar.a;
                                                int i6 = duwVar.c;
                                                while (i2 < i6) {
                                                    bVarArr3[i2].c();
                                                    i2++;
                                                }
                                            }
                                        }
                                    } else {
                                        f = 0.5f;
                                    }
                                }
                                pddVar.e = f5;
                            } else {
                                f = 0.5f;
                            }
                        } else {
                            f = 0.5f;
                            y250 y250Var = zvrVar.j;
                            if (y250Var != null) {
                                y250Var.d();
                            }
                            float f6 = f4 - zvrVar.g;
                            cvr cvrVarG = zvrVar.g();
                            if (z2) {
                                duw<gyr.b> duwVar2 = pddVar.b;
                                if (!cvrVarG.k().isEmpty()) {
                                    z = f6 < 0.0f;
                                    int iB3 = pdd.b(cvrVarG, z);
                                    int iA2 = pdd.a(cvrVarG, z);
                                    if (iA2 >= 0 && iA2 < cvrVarG.i()) {
                                        if (iB3 != pddVar.a && iB3 >= 0) {
                                            if (pddVar.c != z) {
                                                gyr.b[] bVarArr4 = duwVar2.a;
                                                int i7 = duwVar2.c;
                                                for (int i8 = 0; i8 < i7; i8++) {
                                                    bVarArr4[i8].cancel();
                                                }
                                            }
                                            pddVar.c = z;
                                            pddVar.a = iB3;
                                            duwVar2.g();
                                            duwVar2.d(duwVar2.c, xvrVar.a(iB3));
                                        }
                                        if (z) {
                                            nur nurVar2 = (nur) CollectionsKt.b0(cvrVarG.k());
                                            if (((pvr.a(nurVar2, cvrVarG.a()) + ((int) (cvrVarG.a() == i3z.a ? nurVar2.a() & 4294967295L : nurVar2.a() >> 32))) + cvrVarG.j()) - cvrVarG.f() < (-f6)) {
                                                gyr.b[] bVarArr5 = duwVar2.a;
                                                int i9 = duwVar2.c;
                                                while (i2 < i9) {
                                                    bVarArr5[i2].c();
                                                    i2++;
                                                }
                                            }
                                        } else if (cvrVarG.h() - pvr.a((nur) CollectionsKt.T(cvrVarG.k()), cvrVarG.a()) < f6) {
                                            gyr.b[] bVarArr6 = duwVar2.a;
                                            int i10 = duwVar2.c;
                                            while (i2 < i10) {
                                                bVarArr6[i2].c();
                                                i2++;
                                            }
                                        }
                                    }
                                }
                                pddVar.e = f6;
                            }
                        }
                    } else {
                        f = 0.5f;
                    }
                    if (Math.abs(zvrVar.g) > f) {
                        f2 -= zvrVar.g;
                        zvrVar.g = 0.0f;
                    }
                } else {
                    f2 = 0.0f;
                }
                return Float.valueOf(-f2);
            default:
                RegistrationKYCWebViewActivity registrationKYCWebViewActivity = (RegistrationKYCWebViewActivity) obj2;
                OtpData.PhoneMigration phoneMigration = (OtpData.PhoneMigration) obj;
                RegistrationKYCWebViewActivity.b bVar = RegistrationKYCWebViewActivity.y;
                phoneMigration.getClass();
                OTPResult<OTPGeneralResult> oTPResult = phoneMigration.f;
                if (oTPResult instanceof OTPResult.Success) {
                    dk dkVar = (dk) registrationKYCWebViewActivity.d.getValue();
                    String token = ((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken();
                    token.getClass();
                    dkVar.i.put("sub_account_token", token);
                    dkVar.x1(dkVar.e);
                }
                return Unit.a;
        }
    }
}
