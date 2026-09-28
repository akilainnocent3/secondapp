package defpackage;

import android.content.Context;
import android.util.Base64;
import androidx.fragment.app.e;
import com.sporty.android.core.model.security.otp.OTPGeneralResult;
import com.sporty.android.platform.features.newotp.util.OTPResult;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.pocketrocket.model.request.CashoutLayoutForChat;
import com.sportygames.pocketrocket.model.response.CashoutException;
import com.sportygames.sportyherov2.components.SHToastContainer;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class qfe implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qfe(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:154:0x0295  */
    /* JADX WARN: Code duplicated, block: B:162:0x02b6  */
    /* JADX WARN: Code duplicated, block: B:26:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:28:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:30:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:42:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:46:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:48:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:50:0x0108  */
    /* JADX WARN: Code duplicated, block: B:52:0x010c  */
    /* JADX WARN: Code duplicated, block: B:57:0x011d  */
    /* JADX WARN: Code duplicated, block: B:62:0x012e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0137  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        nk2 binding;
        nk2 binding2;
        nk2 binding3;
        nk2 binding4;
        nk2 binding5;
        nk2 binding6;
        nk2 binding7;
        nk2 binding8;
        nk2 binding9;
        final String string;
        final String str;
        Context context;
        zt50 zt50Var;
        zt50 zt50Var2;
        zt50 zt50Var3;
        zt50 zt50Var4;
        zt50 zt50Var5;
        nk2 binding10;
        nk2 binding11;
        zt50 zt50Var6;
        zt50 zt50Var7;
        zt50 zt50Var8;
        nk2 binding12;
        nk2 binding13;
        nk2 binding14;
        nk2 binding15;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                p9g p9gVar = (p9g) obj2;
                OtpData.DeviceLogout deviceLogout = (OtpData.DeviceLogout) obj;
                deviceLogout.getClass();
                OTPResult<OTPGeneralResult> oTPResult = deviceLogout.e;
                if (oTPResult instanceof OTPResult.Success) {
                    p9gVar.x1(new c9g.b(((OTPGeneralResult) ((OTPResult.Success) oTPResult).a).getToken()));
                }
                break;
            default:
                final zy10 zy10Var = (zy10) obj2;
                Object objE = new eal().e(x54.a(Base64.decode((String) obj, 0)), CashoutException.class);
                objE.getClass();
                final CashoutException cashoutException = (CashoutException) objE;
                int i2 = 1;
                if (cashoutException.getBetId() != null) {
                    eoa0 eoa0VarZ0 = zy10Var.Z0();
                    CashoutLayoutForChat cashoutLayoutForChat = zy10Var.F0;
                    eoa0VarZ0.C.remove(eoa0.B1(String.valueOf(cashoutException.getRoundId()), String.valueOf(cashoutException.getBetId())));
                    zt50 zt50Var9 = zy10Var.b;
                    if (zt50Var9 == null) {
                        zt50Var = zy10Var.b;
                        if (zt50Var != null) {
                            zt50Var2 = zy10Var.b;
                            if (zt50Var2 != null) {
                                if (cashoutException.getBetId().longValue() == zt50Var2.z.getBetId()) {
                                    zt50Var3 = zy10Var.b;
                                    if (zt50Var3 != null) {
                                        binding11.A.setAlpha(1.0f);
                                    }
                                    zt50Var4 = zy10Var.b;
                                    if (zt50Var4 != null) {
                                        binding10.A.setClickable(true);
                                    }
                                    zt50Var5 = zy10Var.b;
                                    if (zt50Var5 != null) {
                                        zt50Var5.z.setCashoutInProgress(false);
                                    }
                                    if (zy10Var.d0) {
                                        cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                        fb7.d.j(cashoutLayoutForChat);
                                    }
                                }
                            }
                        } else if (cashoutException.getBetId().longValue() == zt50Var.R.getBetId()) {
                            zt50Var6 = zy10Var.b;
                            if (zt50Var6 != null) {
                                binding13.A.setAlpha(1.0f);
                            }
                            zt50Var7 = zy10Var.b;
                            if (zt50Var7 != null) {
                                binding12.A.setClickable(true);
                            }
                            zt50Var8 = zy10Var.b;
                            if (zt50Var8 != null) {
                                zt50Var8.R.setCashoutInProgress(false);
                            }
                            if (zy10Var.d0) {
                                cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            }
                        } else {
                            zt50Var2 = zy10Var.b;
                            if (zt50Var2 != null) {
                                if (cashoutException.getBetId().longValue() == zt50Var2.z.getBetId()) {
                                    zt50Var3 = zy10Var.b;
                                    if (zt50Var3 != null) {
                                        binding11.A.setAlpha(1.0f);
                                    }
                                    zt50Var4 = zy10Var.b;
                                    if (zt50Var4 != null) {
                                        binding10.A.setClickable(true);
                                    }
                                    zt50Var5 = zy10Var.b;
                                    if (zt50Var5 != null) {
                                        zt50Var5.z.setCashoutInProgress(false);
                                    }
                                    if (zy10Var.d0) {
                                        cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                        fb7.d.j(cashoutLayoutForChat);
                                    }
                                }
                            }
                        }
                    } else if (cashoutException.getBetId().longValue() == zt50Var9.S.getBetId()) {
                        zt50 zt50Var10 = zy10Var.b;
                        if (zt50Var10 != null && (binding15 = zt50Var10.S.getBinding()) != null) {
                            binding15.A.setAlpha(1.0f);
                        }
                        zt50 zt50Var11 = zy10Var.b;
                        if (zt50Var11 != null && (binding14 = zt50Var11.S.getBinding()) != null) {
                            binding14.A.setClickable(true);
                        }
                        zt50 zt50Var12 = zy10Var.b;
                        if (zt50Var12 != null) {
                            zt50Var12.S.setCashoutInProgress(false);
                        }
                        if (zy10Var.d0) {
                            cashoutLayoutForChat.setCashOutRedRocketVisibility(false);
                            fb7.d.j(cashoutLayoutForChat);
                        }
                    } else {
                        zt50Var = zy10Var.b;
                        if (zt50Var != null) {
                            zt50Var2 = zy10Var.b;
                            if (zt50Var2 != null) {
                                if (cashoutException.getBetId().longValue() == zt50Var2.z.getBetId()) {
                                    zt50Var3 = zy10Var.b;
                                    if (zt50Var3 != null) {
                                        binding11.A.setAlpha(1.0f);
                                    }
                                    zt50Var4 = zy10Var.b;
                                    if (zt50Var4 != null) {
                                        binding10.A.setClickable(true);
                                    }
                                    zt50Var5 = zy10Var.b;
                                    if (zt50Var5 != null) {
                                        zt50Var5.z.setCashoutInProgress(false);
                                    }
                                    if (zy10Var.d0) {
                                        cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                        fb7.d.j(cashoutLayoutForChat);
                                    }
                                }
                            }
                        } else if (cashoutException.getBetId().longValue() == zt50Var.R.getBetId()) {
                            zt50Var6 = zy10Var.b;
                            if (zt50Var6 != null && (binding13 = zt50Var6.R.getBinding()) != null) {
                                binding13.A.setAlpha(1.0f);
                            }
                            zt50Var7 = zy10Var.b;
                            if (zt50Var7 != null && (binding12 = zt50Var7.R.getBinding()) != null) {
                                binding12.A.setClickable(true);
                            }
                            zt50Var8 = zy10Var.b;
                            if (zt50Var8 != null) {
                                zt50Var8.R.setCashoutInProgress(false);
                            }
                            if (zy10Var.d0) {
                                cashoutLayoutForChat.setCashOutPurpleRocketVisibility(false);
                                fb7.d.j(cashoutLayoutForChat);
                            }
                        } else {
                            zt50Var2 = zy10Var.b;
                            if (zt50Var2 != null) {
                                if (cashoutException.getBetId().longValue() == zt50Var2.z.getBetId()) {
                                    zt50Var3 = zy10Var.b;
                                    if (zt50Var3 != null && (binding11 = zt50Var3.z.getBinding()) != null) {
                                        binding11.A.setAlpha(1.0f);
                                    }
                                    zt50Var4 = zy10Var.b;
                                    if (zt50Var4 != null && (binding10 = zt50Var4.z.getBinding()) != null) {
                                        binding10.A.setClickable(true);
                                    }
                                    zt50Var5 = zy10Var.b;
                                    if (zt50Var5 != null) {
                                        zt50Var5.z.setCashoutInProgress(false);
                                    }
                                    if (zy10Var.d0) {
                                        cashoutLayoutForChat.setCashOutBlueRocketVisibility(false);
                                        fb7.d.j(cashoutLayoutForChat);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    zy10Var.Z0().B.remove(eoa0.B1(String.valueOf(cashoutException.getRoundId()), cashoutException.getRocketType()));
                    String rocketType = cashoutException.getRocketType();
                    if (rocketType != null) {
                        int iHashCode = rocketType.hashCode();
                        if (iHashCode != -1923613764) {
                            if (iHashCode != 81009) {
                                if (iHashCode == 2041946 && rocketType.equals("BLUE")) {
                                    zt50 zt50Var13 = zy10Var.b;
                                    if (zt50Var13 != null) {
                                        zt50Var13.z.setBetInProgress(false);
                                    }
                                    zt50 zt50Var14 = zy10Var.b;
                                    if (zt50Var14 != null && (binding9 = zt50Var14.z.getBinding()) != null) {
                                        binding9.v.setAlpha(1.0f);
                                    }
                                    zt50 zt50Var15 = zy10Var.b;
                                    if (zt50Var15 != null && (binding8 = zt50Var15.z.getBinding()) != null) {
                                        binding8.v.setClickable(true);
                                    }
                                    zt50 zt50Var16 = zy10Var.b;
                                    if (zt50Var16 != null && (binding7 = zt50Var16.z.getBinding()) != null) {
                                        binding7.d.setStatus(false);
                                    }
                                    zy10Var.V = false;
                                }
                            } else if (rocketType.equals("RED")) {
                                zt50 zt50Var17 = zy10Var.b;
                                if (zt50Var17 != null) {
                                    zt50Var17.S.setBetInProgress(false);
                                }
                                zt50 zt50Var18 = zy10Var.b;
                                if (zt50Var18 != null && (binding6 = zt50Var18.S.getBinding()) != null) {
                                    binding6.v.setAlpha(1.0f);
                                }
                                zt50 zt50Var19 = zy10Var.b;
                                if (zt50Var19 != null && (binding5 = zt50Var19.S.getBinding()) != null) {
                                    binding5.v.setClickable(true);
                                }
                                zt50 zt50Var20 = zy10Var.b;
                                if (zt50Var20 != null && (binding4 = zt50Var20.S.getBinding()) != null) {
                                    binding4.d.setStatus(false);
                                }
                                zy10Var.R = false;
                            }
                        } else if (rocketType.equals("PURPLE")) {
                            zt50 zt50Var21 = zy10Var.b;
                            if (zt50Var21 != null) {
                                zt50Var21.R.setBetInProgress(false);
                            }
                            zt50 zt50Var22 = zy10Var.b;
                            if (zt50Var22 != null && (binding3 = zt50Var22.R.getBinding()) != null) {
                                binding3.v.setAlpha(1.0f);
                            }
                            zt50 zt50Var23 = zy10Var.b;
                            if (zt50Var23 != null && (binding2 = zt50Var23.R.getBinding()) != null) {
                                binding2.v.setClickable(true);
                            }
                            zt50 zt50Var24 = zy10Var.b;
                            if (zt50Var24 != null && (binding = zt50Var24.R.getBinding()) != null) {
                                binding.d.setStatus(false);
                            }
                            zy10Var.Y = false;
                        }
                    }
                }
                if (cashoutException.getBizCode() == 8009) {
                    if (zy10Var.h1()) {
                        zy10Var.b1().y1();
                    } else {
                        zt50 zt50Var25 = zy10Var.b;
                        if (zt50Var25 != null) {
                            zt50Var25.Q.P();
                        }
                    }
                }
                rlz rlzVar = rlz.d;
                rlzVar.getClass();
                Integer num = rlz.e.get(Integer.valueOf(cashoutException.getBizCode()));
                String strB = null;
                if (num != null) {
                    int iIntValue = num.intValue();
                    Context context2 = zy10Var.getContext();
                    if (context2 != null) {
                        string = context2.getString(iIntValue);
                    } else {
                        string = null;
                    }
                } else {
                    string = null;
                }
                String str2 = (String) pcg.a(zy10Var.getContext()).get(string);
                if (str2 == null) {
                    str = string;
                } else {
                    if (string != null) {
                        op5.a.getClass();
                        strB = op5.b(str2, string, null);
                    }
                    if (strB == null) {
                        str = string;
                    } else {
                        str = strB;
                    }
                }
                ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(0, new HTTPResponse(Integer.valueOf(cashoutException.getBizCode()), str, 0, null, Boolean.FALSE, null, null, 64, null));
                e activity = zy10Var.getActivity();
                if (activity != null && (context = zy10Var.getContext()) != null) {
                    if (cashoutException.getBizCode() != 403) {
                        kcj kcjVar = new kcj(zy10Var, i2);
                        Function0 function0 = new Function0() { // from class: uv10
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                zy10Var.s1();
                                return Unit.a;
                            }
                        };
                        so0 so0Var = new so0(1);
                        Function1 function1 = new Function1() { // from class: vv10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                ((String) obj3).getClass();
                                zy10 zy10Var2 = zy10Var;
                                boolean z = zy10Var2.d0;
                                CashoutLayoutForChat cashoutLayoutForChat2 = zy10Var2.F0;
                                CashoutException cashoutException2 = cashoutException;
                                if (z) {
                                    if (z) {
                                        if (Intrinsics.g(cashoutException2.getRocketType(), "RED")) {
                                            cashoutLayoutForChat2.setCashOutRedRocketVisibility(false);
                                            fb7.d.j(cashoutLayoutForChat2);
                                        }
                                        if (Intrinsics.g(cashoutException2.getRocketType(), "PURPLE")) {
                                            cashoutLayoutForChat2.setCashOutPurpleRocketVisibility(false);
                                            fb7.d.j(cashoutLayoutForChat2);
                                        }
                                        if (Intrinsics.g(cashoutException2.getRocketType(), "BLUE")) {
                                            cashoutLayoutForChat2.setCashOutBlueRocketVisibility(false);
                                            fb7.d.j(cashoutLayoutForChat2);
                                        }
                                    }
                                    zt50 zt50Var26 = zy10Var2.b;
                                    if (zt50Var26 != null) {
                                        zt50Var26.R.setDisableContainer();
                                    }
                                    zt50 zt50Var27 = zy10Var2.b;
                                    if (zt50Var27 != null) {
                                        zt50Var27.z.setDisableContainer();
                                    }
                                } else {
                                    zt50 zt50Var28 = zy10Var2.b;
                                    if (zt50Var28 != null) {
                                        zt50Var28.V.setVisibility(0);
                                    }
                                    zt50 zt50Var29 = zy10Var2.b;
                                    if (zt50Var29 != null) {
                                        SHToastContainer sHToastContainer = zt50Var29.V;
                                        String exMessage = str;
                                        if (exMessage == null && (exMessage = string) == null) {
                                            exMessage = cashoutException2.getExMessage();
                                        }
                                        sHToastContainer.setMessageandBG(R.color.error_toast, exMessage);
                                    }
                                    nas nasVarA = ebs.a(zy10Var2.getLifecycle());
                                    pfd pfdVar = fse.a;
                                    ej5.c(nasVarA, gku.a, null, new iz10(zy10Var2, null), 2);
                                }
                                return Unit.a;
                            }
                        };
                        context.getColor(R.color.try_again_color);
                        rlzVar.c(activity, genericError, kcjVar, function0, so0Var, 0, function1, new ocj(zy10Var, i2), new Function1() { // from class: wv10
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                int iIntValue2 = ((Integer) obj3).intValue();
                                zy10 zy10Var2 = zy10Var;
                                zy10Var2.L0 = true;
                                mke mkeVar = zy10Var2.M0;
                                if (mkeVar == null) {
                                    return null;
                                }
                                mkeVar.S0(iIntValue2);
                                return Unit.a;
                            }
                        });
                    } else {
                        zy10Var.q1();
                    }
                }
                break;
        }
        return Unit.a;
    }
}
