package defpackage;

import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportygames.pocketrocket.model.response.GameSocektResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tee implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tee(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        s820 s820Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                uee ueeVar = (uee) obj2;
                OTPResult oTPResult = (OTPResult) obj;
                oTPResult.getClass();
                ueeVar.b = OtpData.DeviceLogout.a((OtpData.DeviceLogout) ueeVar.B1(), oTPResult);
                break;
            default:
                lu10 lu10Var = (lu10) obj2;
                GameSocektResponse gameSocektResponse = (GameSocektResponse) q97.a(GameSocektResponse.class, (String) obj);
                if (lu10Var.v || lu10Var.w || lu10Var.y) {
                    if (Intrinsics.g(gameSocektResponse.getMessageType(), "ROUND_WAITING")) {
                        s820 s820Var2 = (s820) lu10Var.b;
                        if (s820Var2 != null) {
                            s820Var2.D.setVisibility(0);
                        }
                        s820 s820Var3 = (s820) lu10Var.b;
                        if (s820Var3 != null) {
                            s820Var3.y.setVisibility(8);
                        }
                        s820 s820Var4 = (s820) lu10Var.b;
                        if (s820Var4 != null) {
                            s820Var4.f.setVisibility(8);
                        }
                        s820 s820Var5 = (s820) lu10Var.b;
                        if (s820Var5 != null) {
                            s820Var5.C.setMax(10000);
                        }
                        if (!lu10Var.d) {
                            s820 s820Var6 = (s820) lu10Var.b;
                            if (s820Var6 != null) {
                                s820Var6.D.setVisibility(0);
                            }
                            lu10Var.d = true;
                            pfd pfdVar = fse.a;
                            lu10Var.c = w5b.a(gku.a);
                            lu10Var.e = gameSocektResponse.getMillisLeft();
                            lu10Var.f = gameSocektResponse.getMillisLeft();
                            ej5.c(lu10Var.c, null, null, new ku10(lu10Var, null), 3);
                        }
                    }
                    if (Intrinsics.g(gameSocektResponse.getMessageType(), "ROUND_PRE_START")) {
                        lu10Var.d = false;
                        s820 s820Var7 = (s820) lu10Var.b;
                        if (s820Var7 != null) {
                            s820Var7.D.setVisibility(8);
                        }
                        s820 s820Var8 = (s820) lu10Var.b;
                        if (s820Var8 != null) {
                            s820Var8.y.setVisibility(8);
                        }
                    }
                    if (Intrinsics.g(gameSocektResponse.getMessageType(), "ROUND_ONGOING")) {
                        lu10Var.d = false;
                        if (lu10Var.i && (s820Var = (s820) lu10Var.b) != null) {
                            s820Var.y.setVisibility(0);
                        }
                        s820 s820Var9 = (s820) lu10Var.b;
                        if (s820Var9 != null) {
                            s820Var9.f.setVisibility(0);
                        }
                        s820 s820Var10 = (s820) lu10Var.b;
                        if (s820Var10 != null) {
                            s820Var10.D.setVisibility(8);
                        }
                        s820 s820Var11 = (s820) lu10Var.b;
                        if (s820Var11 != null) {
                            s820Var11.y.setText(gameSocektResponse.getCommonMultiplier() + "x");
                        }
                    }
                    if (Intrinsics.g(gameSocektResponse.getMessageType(), "ROUND_END_WAIT")) {
                        lu10Var.d = false;
                        s820 s820Var12 = (s820) lu10Var.b;
                        if (s820Var12 != null) {
                            s820Var12.y.setVisibility(8);
                        }
                        s820 s820Var13 = (s820) lu10Var.b;
                        if (s820Var13 != null) {
                            s820Var13.f.setVisibility(8);
                        }
                        s820 s820Var14 = (s820) lu10Var.b;
                        if (s820Var14 != null) {
                            s820Var14.D.setVisibility(8);
                        }
                    }
                }
                break;
        }
        return Unit.a;
    }
}
