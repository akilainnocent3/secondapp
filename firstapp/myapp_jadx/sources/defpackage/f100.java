package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.appsflyer.internal.y;
import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sporty.android.core.model.config.bo.BOConfigValueWrapper;
import com.sportybet.android.gp.tz.R;
import com.sportygames.chat.remote.models.RainClaimInfoResponse;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingStateChat;
import com.sportygames.sportyherov2.remote.models.PlaceBetRequest;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Locale;
import java.util.TreeMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.b;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class f100 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ f100(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:278:0x0533  */
    /* JADX WARN: Code duplicated, block: B:351:0x061e  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Exception {
        qg4 qg4Var;
        Long lS0;
        BigDecimal bigDecimalB;
        qg4 qg4Var2;
        Long lS1;
        BigDecimal bigDecimalB2;
        Integer claimCountLimit;
        Integer claimCount;
        Integer claimCount2;
        Integer claimCount3;
        w3c0 w3c0Var;
        Context context;
        Double dValueOf;
        qq80 binding;
        ConstraintLayout constraintLayout;
        qq80 binding2;
        qq80 binding3;
        qq80 binding4;
        qq80 binding5;
        qq80 binding6;
        CharSequence text;
        String string;
        qq80 binding7;
        qq80 binding8;
        qq80 binding9;
        qq80 binding10;
        qq80 binding11;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                log0 log0Var = (log0) obj2;
                BOConfigValueBundle bOConfigValueBundle = (BOConfigValueBundle) obj;
                bOConfigValueBundle.getClass();
                int iOrdinal = log0Var.ordinal();
                if (iOrdinal != 0) {
                    if (iOrdinal == 1) {
                        qg4Var = qg4.WithdrawMinParam;
                    } else {
                        uhc.a();
                    }
                    return null;
                }
                qg4Var = qg4.DepositMinParam;
                BOConfigValueWrapper response = bOConfigValueBundle.getResponse(qg4Var.a);
                Object configValue = response != null ? response.getConfigValue() : null;
                dq7 dq7VarA = jq40.a(Long.class);
                Class cls = Integer.TYPE;
                boolean zEquals = dq7VarA.equals(jq40.a(cls));
                Class cls2 = Boolean.TYPE;
                Class cls3 = Double.TYPE;
                Class cls4 = Float.TYPE;
                Class cls5 = Long.TYPE;
                if (!zEquals) {
                    if (!dq7VarA.equals(jq40.a(cls5))) {
                        if (dq7VarA.equals(jq40.a(cls4))) {
                            if (configValue instanceof Float) {
                                if (!(configValue instanceof Long)) {
                                    configValue = null;
                                }
                                lS0 = (Long) configValue;
                            } else if (configValue instanceof String) {
                                b.i((String) configValue);
                            }
                        } else if (dq7VarA.equals(jq40.a(cls3))) {
                            if (configValue instanceof Double) {
                                if (!(configValue instanceof Long)) {
                                    configValue = null;
                                }
                                lS0 = (Long) configValue;
                            } else if (configValue instanceof String) {
                                b.h((String) configValue);
                            }
                        } else if (dq7VarA.equals(jq40.a(cls2))) {
                            if (configValue instanceof Boolean) {
                                if (!(configValue instanceof Long)) {
                                    configValue = null;
                                }
                                lS0 = (Long) configValue;
                            } else if (configValue instanceof String) {
                                StringsKt.r0((String) configValue);
                            }
                        } else if (dq7VarA.equals(jq40.a(String.class))) {
                            if (configValue != null) {
                                configValue.toString();
                            }
                        } else if (configValue != null) {
                            if (!(configValue instanceof Long)) {
                                configValue = null;
                            }
                            lS0 = (Long) configValue;
                        }
                        return null;
                    }
                    if (configValue instanceof Long) {
                        lS0 = (Long) configValue;
                    } else if (!(configValue instanceof String) || (lS0 = StringsKt.s0((String) configValue)) == null) {
                    }
                    lS0 = null;
                } else if (configValue instanceof Integer) {
                    if (!(configValue instanceof Long)) {
                        configValue = null;
                    }
                    lS0 = (Long) configValue;
                } else {
                    if (configValue instanceof String) {
                        StringsKt.toIntOrNull((String) configValue);
                    }
                    lS0 = null;
                }
                if (lS0 != null) {
                    BigDecimal bigDecimalValueOf = BigDecimal.valueOf(lS0.longValue());
                    bigDecimalValueOf.getClass();
                    bigDecimalB = p54.b(bigDecimalValueOf);
                } else {
                    bigDecimalB = null;
                }
                int iOrdinal2 = log0Var.ordinal();
                if (iOrdinal2 != 0) {
                    if (iOrdinal2 == 1) {
                        qg4Var2 = qg4.WithdrawMaxParam;
                    } else {
                        uhc.a();
                    }
                    return null;
                }
                qg4Var2 = qg4.DepositMaxParam;
                BOConfigValueWrapper response2 = bOConfigValueBundle.getResponse(qg4Var2.a);
                Object configValue2 = response2 != null ? response2.getConfigValue() : null;
                dq7 dq7VarA2 = jq40.a(Long.class);
                if (!dq7VarA2.equals(jq40.a(cls))) {
                    if (!dq7VarA2.equals(jq40.a(cls5))) {
                        if (dq7VarA2.equals(jq40.a(cls4))) {
                            if (configValue2 instanceof Float) {
                                if (!(configValue2 instanceof Long)) {
                                    configValue2 = null;
                                }
                                lS1 = (Long) configValue2;
                            } else if (configValue2 instanceof String) {
                                b.i((String) configValue2);
                            }
                        } else if (dq7VarA2.equals(jq40.a(cls3))) {
                            if (configValue2 instanceof Double) {
                                if (!(configValue2 instanceof Long)) {
                                    configValue2 = null;
                                }
                                lS1 = (Long) configValue2;
                            } else if (configValue2 instanceof String) {
                                b.h((String) configValue2);
                            }
                        } else if (dq7VarA2.equals(jq40.a(cls2))) {
                            if (configValue2 instanceof Boolean) {
                                if (!(configValue2 instanceof Long)) {
                                    configValue2 = null;
                                }
                                lS1 = (Long) configValue2;
                            } else if (configValue2 instanceof String) {
                                StringsKt.r0((String) configValue2);
                            }
                        } else if (dq7VarA2.equals(jq40.a(String.class))) {
                            if (configValue2 != null) {
                                configValue2.toString();
                            }
                        } else if (configValue2 != null) {
                            if (!(configValue2 instanceof Long)) {
                                configValue2 = null;
                            }
                            lS1 = (Long) configValue2;
                        }
                        return null;
                    }
                    if (configValue2 instanceof Long) {
                        lS1 = (Long) configValue2;
                    } else if (!(configValue2 instanceof String) || (lS1 = StringsKt.s0((String) configValue2)) == null) {
                    }
                    lS1 = null;
                } else if (configValue2 instanceof Integer) {
                    if (!(configValue2 instanceof Long)) {
                        configValue2 = null;
                    }
                    lS1 = (Long) configValue2;
                } else {
                    if (configValue2 instanceof String) {
                        StringsKt.toIntOrNull((String) configValue2);
                    }
                    lS1 = null;
                }
                if (lS1 != null) {
                    BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(lS1.longValue());
                    bigDecimalValueOf2.getClass();
                    bigDecimalB2 = p54.b(bigDecimalValueOf2);
                } else {
                    bigDecimalB2 = null;
                }
                if (bigDecimalB != null && bigDecimalB2 != null) {
                    return new vw(bigDecimalB, bigDecimalB2);
                }
                y.a("Withdraw min or max is null");
                return null;
            case 1:
                gw30 gw30Var = (gw30) obj2;
                LoadingStateChat loadingStateChat = (LoadingStateChat) obj;
                int i2 = gw30.a.a[loadingStateChat.getStatus().ordinal()];
                if (i2 == 1) {
                    gw30Var.q0();
                    HTTPResponse hTTPResponse = (HTTPResponse) loadingStateChat.getData();
                    if (hTTPResponse != null) {
                        RainClaimInfoResponse rainClaimInfoResponse = (RainClaimInfoResponse) hTTPResponse.getData();
                        if (gw30Var.getContext() != null) {
                            if (rainClaimInfoResponse == null || (claimCount3 = rainClaimInfoResponse.getClaimCount()) == null || claimCount3.intValue() != 0) {
                                if (((rainClaimInfoResponse == null || (claimCount2 = rainClaimInfoResponse.getClaimCount()) == null) ? 0 : claimCount2.intValue()) > 0) {
                                    oxi oxiVar = gw30Var.a;
                                    if (oxiVar == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    TextView textView = oxiVar.a0;
                                    op5 op5Var = op5.a;
                                    String string2 = gw30Var.getString(R.string.cms_rain_ended);
                                    string2.getClass();
                                    op5Var.getClass();
                                    textView.setText(StringsKt.t0(op5.b(string2, "Rain has Ended!", null)).toString());
                                    oxi oxiVar2 = gw30Var.a;
                                    if (oxiVar2 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar2.a0.setVisibility(0);
                                    oxi oxiVar3 = gw30Var.a;
                                    if (oxiVar3 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar3.b.setVisibility(8);
                                    oxi oxiVar4 = gw30Var.a;
                                    if (oxiVar4 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar4.N.setVisibility(0);
                                    oxi oxiVar5 = gw30Var.a;
                                    if (oxiVar5 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar5.Q.setVisibility(8);
                                    oxi oxiVar6 = gw30Var.a;
                                    if (oxiVar6 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar6.P.setVisibility(8);
                                    oxi oxiVar7 = gw30Var.a;
                                    if (oxiVar7 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar7.R.setVisibility(8);
                                    oxi oxiVar8 = gw30Var.a;
                                    if (oxiVar8 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar8.O.setVisibility(8);
                                    int iIntValue = (rainClaimInfoResponse == null || (claimCount = rainClaimInfoResponse.getClaimCount()) == null) ? 0 : claimCount.intValue();
                                    int iIntValue2 = (rainClaimInfoResponse == null || (claimCountLimit = rainClaimInfoResponse.getClaimCountLimit()) == null) ? 0 : claimCountLimit.intValue();
                                    String string3 = gw30Var.getString(R.string.cms_claim_amount_text);
                                    string3.getClass();
                                    String string4 = gw30Var.getString(R.string.default_cms_claim_amount_text);
                                    string4.getClass();
                                    String strB = op5.b(string3, string4, null);
                                    String str = gw30Var.B;
                                    if (str == null) {
                                        str = "";
                                    }
                                    String strI = op5.i(str);
                                    TreeMap treeMap = pw.a;
                                    Double d = gw30Var.C;
                                    String strB2 = pw.b(String.valueOf(d != null ? d.doubleValue() : 1.0d));
                                    if (iIntValue2 > 1) {
                                        String strA = d40.a(iIntValue, iIntValue2, "/");
                                        String string5 = gw30Var.getString(R.string.cms_claim_limit_text);
                                        string5.getClass();
                                        String string6 = gw30Var.getString(R.string.default_claim_limit_text);
                                        string6.getClass();
                                        String strA2 = kwi.a(ux5.a(strB, " ", strA, " ", op5.b(string5, string6, null)), " ", strI, " ", strB2);
                                        oxi oxiVar9 = gw30Var.a;
                                        if (oxiVar9 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar9.j0.setText(strA2);
                                    } else {
                                        HashMap map = new HashMap();
                                        map.put(gw30Var.getString(R.string.currency_cms), strI.toString());
                                        map.put(gw30Var.getString(R.string.giftValue), String.valueOf(strB2));
                                        String string7 = gw30Var.getString(R.string.cms_user_single_claimed_info_text);
                                        string7.getClass();
                                        String string8 = gw30Var.getString(R.string.default_user_single_claimed_info_text);
                                        string8.getClass();
                                        String strA3 = tug.a(strB, " ", op5.b(string7, string8, map));
                                        oxi oxiVar10 = gw30Var.a;
                                        if (oxiVar10 == null) {
                                            Intrinsics.n("binding");
                                            throw null;
                                        }
                                        oxiVar10.j0.setText(strA3);
                                    }
                                    oxi oxiVar11 = gw30Var.a;
                                    if (oxiVar11 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar11.V.setVisibility(0);
                                    oxi oxiVar12 = gw30Var.a;
                                    if (oxiVar12 == null) {
                                        Intrinsics.n("binding");
                                        throw null;
                                    }
                                    oxiVar12.W.setVisibility(8);
                                    gw30Var.o0();
                                }
                            } else {
                                oxi oxiVar13 = gw30Var.a;
                                if (oxiVar13 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar13.b.setVisibility(8);
                                oxi oxiVar14 = gw30Var.a;
                                if (oxiVar14 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar14.N.setVisibility(8);
                                oxi oxiVar15 = gw30Var.a;
                                if (oxiVar15 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar15.Q.setVisibility(8);
                                oxi oxiVar16 = gw30Var.a;
                                if (oxiVar16 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar16.P.setVisibility(8);
                                oxi oxiVar17 = gw30Var.a;
                                if (oxiVar17 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar17.R.setVisibility(0);
                                oxi oxiVar18 = gw30Var.a;
                                if (oxiVar18 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar18.V.setVisibility(8);
                                oxi oxiVar19 = gw30Var.a;
                                if (oxiVar19 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar19.W.setVisibility(0);
                                oxi oxiVar20 = gw30Var.a;
                                if (oxiVar20 == null) {
                                    Intrinsics.n("binding");
                                    throw null;
                                }
                                oxiVar20.O.setVisibility(8);
                                gw30Var.j0(gw30Var.getContext());
                            }
                            gw30Var.r0();
                            gw30Var.y = null;
                        }
                    }
                } else if (i2 == 2) {
                    gw30Var.q0();
                    gw30Var.o0();
                } else {
                    if (i2 != 3) {
                        uhc.a();
                        return null;
                    }
                    gw30Var.v0();
                }
                return Unit.a;
            default:
                final q1c0 q1c0Var = (q1c0) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                w3c0 w3c0Var2 = (w3c0) q1c0Var.b;
                if (w3c0Var2 != null) {
                    w3c0Var2.e.E();
                }
                w3c0 w3c0Var3 = (w3c0) q1c0Var.b;
                if (w3c0Var3 != null) {
                    w3c0Var3.d.E();
                }
                q1c0Var.U = zBooleanValue;
                q1c0Var.R = 0;
                q1c0Var.C1();
                wz.a("AutoBet", "Sporty Hero", "2", q1c0Var.U ? "On" : "Off");
                q1c0Var.n3();
                w3c0 w3c0Var4 = (w3c0) q1c0Var.b;
                if (w3c0Var4 != null && (binding7 = w3c0Var4.e.getBinding()) != null && binding7.h0.getVisibility() == 0) {
                    w3c0 w3c0Var5 = (w3c0) q1c0Var.b;
                    if (w3c0Var5 != null && (binding11 = w3c0Var5.e.getBinding()) != null) {
                        binding11.h0.setVisibility(8);
                    }
                    w3c0 w3c0Var6 = (w3c0) q1c0Var.b;
                    if (w3c0Var6 != null && (binding10 = w3c0Var6.e.getBinding()) != null) {
                        binding10.L.setVisibility(8);
                    }
                    w3c0 w3c0Var7 = (w3c0) q1c0Var.b;
                    if (w3c0Var7 != null && (binding9 = w3c0Var7.e.getBinding()) != null) {
                        binding9.j0.setVisibility(8);
                    }
                    w3c0 w3c0Var8 = (w3c0) q1c0Var.b;
                    if (w3c0Var8 != null && (binding8 = w3c0Var8.e.getBinding()) != null) {
                        binding8.t0.setVisibility(0);
                    }
                    q1c0Var.c0 = false;
                }
                if (zBooleanValue && (w3c0Var = (w3c0) q1c0Var.b) != null && !w3c0Var.e.getBetPlaced() && (context = q1c0Var.getContext()) != null) {
                    if (q1c0Var.V) {
                        w3c0 w3c0Var9 = (w3c0) q1c0Var.b;
                        dValueOf = (w3c0Var9 == null || (binding6 = w3c0Var9.e.getBinding()) == null || (text = binding6.G.getText()) == null || (string = text.toString()) == null) ? null : Double.valueOf(Double.parseDouble(string));
                    } else {
                        dValueOf = null;
                    }
                    w3c0 w3c0Var10 = (w3c0) q1c0Var.b;
                    if (w3c0Var10 != null && (binding5 = w3c0Var10.e.getBinding()) != null) {
                        binding5.v.setVisibility(4);
                    }
                    w3c0 w3c0Var11 = (w3c0) q1c0Var.b;
                    final String strJ = new eal().j(new PlaceBetRequest(String.valueOf((w3c0Var11 == null || (binding4 = w3c0Var11.e.getBinding()) == null) ? null : binding4.b.getText()), q1c0Var.G.get(1).getBetCategoryType(), q1c0Var.G.get(1).getBetIndex(), q1c0Var.G.get(1).getCurrency(), q1c0Var.W, null, null, dValueOf, q1c0Var.T1, q1c0Var.J1));
                    foa0 foa0Var = (foa0) q1c0Var.a;
                    if (foa0Var != null) {
                        foa0Var.N1(strJ, "CLASSIC", q1c0Var.W, q1c0Var.G.get(1).getBetIndex(), new Function0() { // from class: zyb0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                q1c0 q1c0Var2 = q1c0Var;
                                cgb.a(q1c0Var2.m1(), q1c0Var2.c1, "placeBet", strJ);
                                return Unit.a;
                            }
                        });
                    }
                    w3c0 w3c0Var12 = (w3c0) q1c0Var.b;
                    if (w3c0Var12 != null) {
                        w3c0Var12.e.setBetPlacedV2(true);
                    }
                    w3c0 w3c0Var13 = (w3c0) q1c0Var.b;
                    if (w3c0Var13 != null) {
                        w3c0Var13.e.setBetInProgress(true);
                    }
                    q1c0Var.X0();
                    int i3 = q1c0Var.R + 1;
                    q1c0Var.R = i3;
                    if (q1c0Var.M1 && i3 == q1c0Var.T) {
                        q1c0Var.U = false;
                        q1c0Var.R = 0;
                        w3c0 w3c0Var14 = (w3c0) q1c0Var.b;
                        if (w3c0Var14 != null && (binding3 = w3c0Var14.e.getBinding()) != null) {
                            binding3.d.setStatus(false);
                        }
                    }
                    wz.a("AutoBetPlaced", "Sporty Hero", "2", String.valueOf(q1c0Var.Q));
                    q1c0Var.N1("2", null, "CLASSIC", false);
                    SharedPreferences sharedPreferences = q1c0Var.j0;
                    if (sharedPreferences != null && sharedPreferences.getBoolean("SPORTY_HERO_SOUND", true)) {
                        ypa0 ypa0Var = q1c0Var.D;
                        if (ypa0Var == null) {
                            Intrinsics.n("soundViewModel");
                            throw null;
                        }
                        String string9 = q1c0Var.getString(R.string.revamp_place_bet);
                        string9.getClass();
                        ypa0Var.A1(0L, string9);
                    }
                    q1c0Var.X0();
                    q1c0Var.n3();
                    w3c0 w3c0Var15 = (w3c0) q1c0Var.b;
                    if (w3c0Var15 != null && (binding2 = w3c0Var15.e.getBinding()) != null) {
                        binding2.t0.setVisibility(0);
                    }
                    w3c0 w3c0Var16 = (w3c0) q1c0Var.b;
                    if (w3c0Var16 != null && (binding = w3c0Var16.e.getBinding()) != null && (constraintLayout = binding.F) != null) {
                        constraintLayout.setBackground(context.getDrawable(R.drawable.card_waiting_v2));
                    }
                    if (q1c0Var.X0) {
                        String lowerCase = e6a.a().toLowerCase(Locale.ROOT);
                        lowerCase.getClass();
                        if (lowerCase.equals("br") || lowerCase.equals("int") || lowerCase.equals("mx") || lowerCase.equals("za") || lowerCase.equals("gh")) {
                            q1c0Var.w0(q1c0Var.X0);
                        }
                    }
                }
                return Unit.a;
        }
    }
}
