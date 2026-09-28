package defpackage;

import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.commons.SportyGamesManager;
import com.sportygames.lobby.remote.models.GameDetails;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class l53 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l53(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        qq80 binding;
        qq80 binding2;
        qq80 binding3;
        qq80 binding4;
        qq80 binding5;
        qq80 binding6;
        qq80 binding7;
        qq80 binding8;
        qq80 binding9;
        qq80 binding10;
        qq80 binding11;
        qq80 binding12;
        qq80 binding13;
        qq80 binding14;
        qq80 binding15;
        qq80 binding16;
        qq80 binding17;
        qq80 binding18;
        qq80 binding19;
        qq80 binding20;
        qq80 binding21;
        qq80 binding22;
        qq80 binding23;
        qq80 binding24;
        qq80 binding25;
        qq80 binding26;
        qq80 binding27;
        qq80 binding28;
        String name;
        w3c0 w3c0Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Map.Entry entry = (Map.Entry) obj;
                entry.getClass();
                return Boolean.valueOf(!Intrinsics.g((String) entry.getKey(), (String) obj2));
            case 1:
                Function1 function1 = (Function1) obj2;
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0 || ogx.a("\\d*(\\.\\d{0,2})?", str)) {
                    function1.invoke(str);
                }
                return Unit.a;
            default:
                final q1c0 q1c0Var = (q1c0) obj2;
                String str2 = (String) obj;
                try {
                    Object text = null;
                    if (str2.equals("Success")) {
                        if (!q1c0Var.e1 && (w3c0Var = (w3c0) q1c0Var.b) != null) {
                            w3c0Var.d0.P();
                        }
                        kn1 kn1VarF1 = q1c0Var.f1();
                        ej5.c(o8i0.d(kn1VarF1), null, null, new lm1(kn1VarF1, null), 3);
                        foa0 foa0Var = (foa0) q1c0Var.a;
                        if (foa0Var != null) {
                            foa0Var.B1();
                        }
                        foa0 foa0Var2 = (foa0) q1c0Var.a;
                        if (foa0Var2 != null) {
                            foa0Var2.G1();
                        }
                        String str3 = q1c0Var.L0;
                        foa0 foa0Var3 = (foa0) q1c0Var.a;
                        if (foa0Var3 != null) {
                            foa0Var3.J1(str3);
                        }
                        try {
                            GameDetails gameDetails = q1c0Var.W1;
                            if (gameDetails == null || (name = gameDetails.getName()) == null) {
                                name = "";
                            }
                            e activity = q1c0Var.getActivity();
                            ibs viewLifecycleOwner = q1c0Var.getViewLifecycleOwner();
                            viewLifecycleOwner.getClass();
                            w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                            ra6.b(name, activity, viewLifecycleOwner, w3c0Var2 != null ? w3c0Var2.M : null, null, q1c0Var.l1(), (db6) q1c0Var.C.getValue(), p58.b, null, new tld0(q1c0Var.W1, new Function0() { // from class: kyb0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    w3c0 w3c0Var3;
                                    q1c0 q1c0Var2 = q1c0Var;
                                    w3c0 w3c0Var4 = (w3c0) q1c0Var2.b;
                                    boolean z = true;
                                    if ((w3c0Var4 == null || !w3c0Var4.d.getBetPlaced()) && ((w3c0Var3 = (w3c0) q1c0Var2.b) == null || !w3c0Var3.e.getBetPlaced())) {
                                        z = false;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            }, new b2c0(0, q1c0Var, q1c0.class, "showActiveBetsToast", "showActiveBetsToast()V", 0)), new ha3(q1c0Var, 1), new Function0() { // from class: lyb0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    try {
                                        q1c0Var.n1().x1();
                                    } catch (Exception e) {
                                        e.printStackTrace();
                                    }
                                    return Unit.a;
                                }
                            }, null, 17920);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        q1c0Var.U0();
                        w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                        if (w3c0Var3 != null) {
                            w3c0Var3.c.performClick();
                        }
                        break;
                    } else if (str2.equals(AnalyticsEvent.BI_TRACKING_KIND_ERROR) && !q1c0Var.b1) {
                        w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                        if (w3c0Var4 != null && (binding28 = w3c0Var4.d.getBinding()) != null) {
                            binding28.v.setClickable(false);
                        }
                        w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                        if (w3c0Var5 != null && (binding27 = w3c0Var5.d.getBinding()) != null) {
                            binding27.v.setAlpha(0.5f);
                        }
                        w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                        if (w3c0Var6 != null && (binding26 = w3c0Var6.e.getBinding()) != null) {
                            binding26.v.setClickable(false);
                        }
                        w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                        if (w3c0Var7 != null && (binding25 = w3c0Var7.e.getBinding()) != null) {
                            binding25.v.setAlpha(0.5f);
                        }
                        w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                        if (w3c0Var8 != null && (binding24 = w3c0Var8.d.getBinding()) != null) {
                            binding24.J.setClickable(false);
                        }
                        w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                        if (w3c0Var9 != null && (binding23 = w3c0Var9.d.getBinding()) != null) {
                            binding23.J.setAlpha(0.5f);
                        }
                        w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                        if (w3c0Var10 != null && (binding22 = w3c0Var10.e.getBinding()) != null) {
                            binding22.J.setClickable(false);
                        }
                        w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                        if (w3c0Var11 != null && (binding21 = w3c0Var11.e.getBinding()) != null) {
                            binding21.J.setAlpha(0.5f);
                        }
                        q1c0Var.b1 = true;
                    } else if (str2.equals("observeOtherSocket")) {
                        foa0 foa0Var4 = (foa0) q1c0Var.a;
                        if (foa0Var4 != null) {
                            foa0Var4.G1();
                        }
                        w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                        if (w3c0Var12 != null && (binding20 = w3c0Var12.d.getBinding()) != null) {
                            binding20.v.setClickable(true);
                        }
                        w3c0 w3c0Var13 = (w3c0) q1c0Var.b;
                        if (w3c0Var13 != null && (binding19 = w3c0Var13.d.getBinding()) != null) {
                            binding19.v.setAlpha(1.0f);
                        }
                        w3c0 w3c0Var14 = (w3c0) q1c0Var.b;
                        if (w3c0Var14 != null && (binding18 = w3c0Var14.e.getBinding()) != null) {
                            binding18.v.setClickable(true);
                        }
                        w3c0 w3c0Var15 = (w3c0) q1c0Var.b;
                        if (w3c0Var15 != null && (binding17 = w3c0Var15.e.getBinding()) != null) {
                            binding17.v.setAlpha(1.0f);
                        }
                        w3c0 w3c0Var16 = (w3c0) q1c0Var.b;
                        if (w3c0Var16 != null && (binding16 = w3c0Var16.d.getBinding()) != null) {
                            binding16.J.setClickable(true);
                        }
                        w3c0 w3c0Var17 = (w3c0) q1c0Var.b;
                        if (w3c0Var17 != null && (binding15 = w3c0Var17.d.getBinding()) != null) {
                            binding15.J.setAlpha(1.0f);
                        }
                        w3c0 w3c0Var18 = (w3c0) q1c0Var.b;
                        if (w3c0Var18 != null && (binding14 = w3c0Var18.e.getBinding()) != null) {
                            binding14.J.setClickable(true);
                        }
                        w3c0 w3c0Var19 = (w3c0) q1c0Var.b;
                        if (w3c0Var19 != null && (binding13 = w3c0Var19.e.getBinding()) != null) {
                            binding13.J.setAlpha(1.0f);
                        }
                        String str4 = q1c0Var.L0;
                        foa0 foa0Var5 = (foa0) q1c0Var.a;
                        if (foa0Var5 != null) {
                            foa0Var5.J1(str4);
                        }
                        foa0 foa0Var6 = (foa0) q1c0Var.a;
                        if (foa0Var6 != null) {
                            foa0Var6.F1(q1c0Var.M0, q1c0Var.L0);
                        }
                        foa0 foa0Var7 = (foa0) q1c0Var.a;
                        if (foa0Var7 != null) {
                            foa0Var7.E1();
                        }
                        foa0 foa0Var8 = (foa0) q1c0Var.a;
                        if (foa0Var8 != null) {
                            foa0Var8.I1();
                        }
                    } else if (str2.equals("messageReceived")) {
                        try {
                            w3c0 w3c0Var20 = (w3c0) q1c0Var.b;
                            if (Double.parseDouble(String.valueOf((w3c0Var20 == null || (binding12 = w3c0Var20.d.getBinding()) == null) ? null : binding12.b.getText())) >= q1c0Var.G.get(0).getMinAmount()) {
                                w3c0 w3c0Var21 = (w3c0) q1c0Var.b;
                                if (Double.parseDouble(String.valueOf((w3c0Var21 == null || (binding11 = w3c0Var21.d.getBinding()) == null) ? null : binding11.G.getText())) >= Double.parseDouble("1.01")) {
                                    w3c0 w3c0Var22 = (w3c0) q1c0Var.b;
                                    if (w3c0Var22 != null && (binding10 = w3c0Var22.d.getBinding()) != null) {
                                        binding10.v.setClickable(true);
                                    }
                                    w3c0 w3c0Var23 = (w3c0) q1c0Var.b;
                                    if (w3c0Var23 != null && (binding9 = w3c0Var23.d.getBinding()) != null) {
                                        binding9.v.setAlpha(1.0f);
                                    }
                                    w3c0 w3c0Var24 = (w3c0) q1c0Var.b;
                                    if (w3c0Var24 != null && (binding8 = w3c0Var24.d.getBinding()) != null) {
                                        binding8.J.setClickable(true);
                                    }
                                    w3c0 w3c0Var25 = (w3c0) q1c0Var.b;
                                    if (w3c0Var25 != null && (binding7 = w3c0Var25.d.getBinding()) != null) {
                                        binding7.J.setAlpha(1.0f);
                                    }
                                }
                            }
                            w3c0 w3c0Var26 = (w3c0) q1c0Var.b;
                            if (Double.parseDouble(String.valueOf((w3c0Var26 == null || (binding6 = w3c0Var26.e.getBinding()) == null) ? null : binding6.b.getText())) >= q1c0Var.G.get(1).getMinAmount()) {
                                w3c0 w3c0Var27 = (w3c0) q1c0Var.b;
                                if (w3c0Var27 != null && (binding5 = w3c0Var27.e.getBinding()) != null) {
                                    text = binding5.G.getText();
                                }
                                if (Double.parseDouble(String.valueOf(text)) >= Double.parseDouble("1.01")) {
                                    w3c0 w3c0Var28 = (w3c0) q1c0Var.b;
                                    if (w3c0Var28 != null && (binding4 = w3c0Var28.e.getBinding()) != null) {
                                        binding4.v.setClickable(true);
                                    }
                                    w3c0 w3c0Var29 = (w3c0) q1c0Var.b;
                                    if (w3c0Var29 != null && (binding3 = w3c0Var29.e.getBinding()) != null) {
                                        binding3.v.setAlpha(1.0f);
                                    }
                                    w3c0 w3c0Var30 = (w3c0) q1c0Var.b;
                                    if (w3c0Var30 != null && (binding2 = w3c0Var30.e.getBinding()) != null) {
                                        binding2.J.setClickable(true);
                                    }
                                    w3c0 w3c0Var31 = (w3c0) q1c0Var.b;
                                    if (w3c0Var31 != null && (binding = w3c0Var31.e.getBinding()) != null) {
                                        binding.J.setAlpha(1.0f);
                                    }
                                }
                            }
                            break;
                        } catch (Exception unused) {
                        }
                        q1c0Var.b1 = false;
                    } else if (str2.equals("go_to_login")) {
                        q1c0Var.B0 = true;
                        SportyGamesManager.getInstance().gotoSportyBet(xae.a, null);
                    } else if (str2.equals("multiplier_error")) {
                        q1c0Var.Z0();
                    } else if (str2.equals(AnalyticsParam.STORY_SKIP_REASON_CLOSE) || q1c0Var.K0) {
                        nas nasVarA = ebs.a(q1c0Var.getLifecycle());
                        pfd pfdVar = fse.a;
                        ej5.c(nasVarA, gku.a, null, new c2c0(q1c0Var, null), 2);
                    }
                } catch (Exception unused2) {
                }
                return Unit.a;
        }
    }
}
