package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.e;
import com.sporty.android.core.model.MyLog;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.payment.impl.tradeadditional.domain.model.TradeAdditionalResult;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.crash.models.bet.BetContainerState;
import com.sportygames.crash.remote.models.CashoutException;
import com.sportygames.crash.remote.models.CashoutRequest;
import com.sportygames.crash.remote.models.PlaceBetRequest;
import com.sportygames.lobby.remote.models.GameDetails;
import com.twilio.voice.EventKeys;
import java.util.HashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class v62 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ v62(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x021b  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String string;
        final String str;
        final Context context;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                TradeAdditionalResult tradeAdditionalResult = (TradeAdditionalResult) obj;
                bc6 bc6Var = ((tng0.c) ((tng0) obj2)).c;
                if (bc6Var.p() instanceof bzx) {
                    zi50.a aVar = zi50.b;
                    bc6Var.resumeWith(tradeAdditionalResult);
                } else {
                    itf0.a aVar2 = itf0.a;
                    aVar2.q(MyLog.TAG_COMMON);
                    aVar2.n("Continuation not active, resume not perform.", new Object[0]);
                }
                return Unit.a;
            default:
                final fgb fgbVar = (fgb) obj2;
                String str2 = (String) obj;
                try {
                    final bq40 bq40Var = new bq40();
                    Object objE = new eal().e(str2, CashoutException.class);
                    objE.getClass();
                    final CashoutException cashoutException = (CashoutException) objE;
                    String strB = null;
                    if (cashoutException.getBizCode() == 8018) {
                        JSONObject jSONObject = new JSONObject();
                        PlaceBetRequest placeBetRequest = fgbVar.Y1;
                        if (placeBetRequest == null) {
                            Intrinsics.n("eventPlaceBetRequest");
                            throw null;
                        }
                        jSONObject.put("eventPlaceBetRequest", placeBetRequest.toString());
                        CashoutRequest cashoutRequest = fgbVar.c2;
                        if (cashoutRequest == null) {
                            Intrinsics.n("eventCashoutRequest");
                            throw null;
                        }
                        jSONObject.put("eventCashoutRequest", cashoutRequest.toString());
                        String string2 = jSONObject.toString();
                        string2.getClass();
                        GameDetails gameDetails = fgbVar.i;
                        wz.a("InvalidCoeffError", gameDetails != null ? gameDetails.getName() : null, string2);
                    }
                    if (cashoutException.getBetId() != 0) {
                        loa0 loa0VarK1 = fgbVar.k1();
                        String strValueOf = String.valueOf(cashoutException.getRoundId());
                        long betId = cashoutException.getBetId();
                        loa0VarK1.getClass();
                        strValueOf.getClass();
                        loa0VarK1.L.remove(loa0.E1(betId, strValueOf));
                        if (cashoutException.getBetId() == fgbVar.R0().L.getValue().longValue()) {
                            if (cashoutException.getBizCode() == 8019) {
                                HashMap map = new HashMap((Map) ((x5a0) fgbVar.R0().d).getValue());
                                map.put(Long.valueOf(cashoutException.getRoundId()), Boolean.TRUE);
                                ((x5a0) fgbVar.R0().d).setValue(map);
                            }
                            fgbVar.x2(fgbVar.R0(), cashoutException.getBizCode());
                            bq40Var.a = ((BetContainerState) fgbVar.R0().a.getValue()).getDetailResponse().getBetIndex();
                        } else {
                            if (cashoutException.getBizCode() == 8019) {
                                HashMap map2 = new HashMap((Map) ((x5a0) fgbVar.S0().d).getValue());
                                map2.put(Long.valueOf(cashoutException.getRoundId()), Boolean.TRUE);
                                ((x5a0) fgbVar.S0().d).setValue(map2);
                            }
                            fgbVar.x2(fgbVar.S0(), cashoutException.getBizCode());
                            bq40Var.a = ((BetContainerState) fgbVar.S0().a.getValue()).getDetailResponse().getBetIndex();
                        }
                    } else {
                        loa0 loa0VarK2 = fgbVar.k1();
                        String strValueOf2 = String.valueOf(cashoutException.getRoundId());
                        int betIndex = cashoutException.getBetIndex();
                        loa0VarK2.getClass();
                        strValueOf2.getClass();
                        loa0VarK2.K.remove(loa0.E1(betIndex, strValueOf2));
                        loa0 loa0VarK3 = fgbVar.k1();
                        String strValueOf3 = String.valueOf(cashoutException.getRoundId());
                        int betIndex2 = cashoutException.getBetIndex();
                        loa0VarK3.getClass();
                        strValueOf3.getClass();
                        loa0VarK3.M.remove(loa0.E1(betIndex2, strValueOf3));
                        if (cashoutException.getBetIndex() == 1) {
                            ul2 ul2VarR0 = fgbVar.R0();
                            ul2VarR0.I1(false);
                            ul2VarR0.G1(false);
                            bq40Var.a = ((BetContainerState) fgbVar.R0().a.getValue()).getDetailResponse().getBetIndex();
                        } else {
                            ul2 ul2VarS0 = fgbVar.S0();
                            ul2VarS0.I1(false);
                            ul2VarS0.G1(false);
                            bq40Var.a = ((BetContainerState) fgbVar.S0().a.getValue()).getDetailResponse().getBetIndex();
                        }
                    }
                    if (cashoutException.getBizCode() == 8015) {
                        fgbVar.n1().y1();
                    }
                    q8b q8bVar = q8b.d;
                    q8bVar.getClass();
                    Integer num = q8b.e.get(Integer.valueOf(cashoutException.getBizCode()));
                    if (num != null) {
                        int iIntValue = num.intValue();
                        Context context2 = fgbVar.getContext();
                        if (context2 != null) {
                            string = context2.getString(iIntValue);
                        } else {
                            string = null;
                        }
                    } else {
                        string = null;
                    }
                    String str3 = (String) pcg.a(fgbVar.getContext()).get(string);
                    if (str3 != null) {
                        if (string != null) {
                            op5.a.getClass();
                            strB = op5.b(str3, string, null);
                        }
                        str = strB == null ? string : strB;
                    }
                    final ResultWrapper.GenericError genericError = new ResultWrapper.GenericError(0, new HTTPResponse(Integer.valueOf(cashoutException.getBizCode()), str, 0, null, Boolean.FALSE, null, null, 64, null));
                    final e activity = fgbVar.getActivity();
                    if (activity != null && (context = fgbVar.getContext()) != null) {
                        if (cashoutException.getBizCode() != 403) {
                            ((x5a0) q8bVar.b).setValue(Boolean.TRUE);
                            gvi gviVar = fgbVar.z;
                            if (gviVar != null) {
                                final ComposeView composeView = gviVar.J;
                                composeView.setViewCompositionStrategy(u6i0.c.a);
                                final String str4 = string;
                                composeView.setContent(new op8(-1072183170, new Function2() { // from class: xab
                                    /* JADX WARN: Type inference fix 'apply assigned field type' failed
                                    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
                                    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
                                    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
                                    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
                                    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
                                     */
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj3, Object obj4) {
                                        a aVar3 = (a) obj3;
                                        int iIntValue2 = ((Integer) obj4).intValue();
                                        if (aVar3.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                            if (composeView.getContext() == null) {
                                                aVar3.N(263163515);
                                            } else {
                                                aVar3.N(263163516);
                                                q8b q8bVar2 = q8b.d;
                                                if (((Boolean) ((x5a0) q8bVar2.b).getValue()).booleanValue()) {
                                                    aVar3.N(-1779690075);
                                                    final fgb fgbVar2 = fgbVar;
                                                    String str5 = (String) ((x5a0) fgbVar2.c1().D).getValue();
                                                    boolean zA = aVar3.A(fgbVar2);
                                                    Object objY = aVar3.y();
                                                    a.C0041a.C0042a c0042a = a.C0041a.a;
                                                    if (zA || objY == c0042a) {
                                                        objY = new ocb(fgbVar2, 0);
                                                        aVar3.r(objY);
                                                    }
                                                    Function0 function0 = (Function0) objY;
                                                    boolean zA2 = aVar3.A(fgbVar2);
                                                    Object objY2 = aVar3.y();
                                                    if (zA2 || objY2 == c0042a) {
                                                        objY2 = new kb2(fgbVar2, 2);
                                                        aVar3.r(objY2);
                                                    }
                                                    Function0 function1 = (Function0) objY2;
                                                    Object objY3 = aVar3.y();
                                                    if (objY3 == c0042a) {
                                                        objY3 = new qcb(0);
                                                        aVar3.r(objY3);
                                                    }
                                                    Function0 function2 = (Function0) objY3;
                                                    final String str6 = str;
                                                    final String str7 = str4;
                                                    final CashoutException cashoutException2 = cashoutException;
                                                    final bq40 bq40Var2 = bq40Var;
                                                    final e eVar = activity;
                                                    Function1 function3 = new Function1() { // from class: rcb
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj5) {
                                                            String exMessage;
                                                            ((String) obj5).getClass();
                                                            fgb fgbVar3 = fgbVar2;
                                                            boolean z = fgbVar3.s0;
                                                            String exMessage2 = str6;
                                                            if (z) {
                                                                Intent intent = new Intent("custom-event-name");
                                                                intent.putExtra(EventKeys.ERROR_MESSAGE, "");
                                                                intent.putExtra("cashoutErr", exMessage2);
                                                                bq40 bq40Var3 = bq40Var2;
                                                                intent.putExtra("betIndex", bq40Var3.a);
                                                                fdt.a(eVar).c(intent);
                                                                fgbVar3.h0.add(Integer.valueOf(bq40Var3.a));
                                                                p48.A(fgbVar3.g0, new pb2(bq40Var3, 1));
                                                            } else {
                                                                ytw<String> ytwVar = fgbVar3.c1().H;
                                                                String str8 = str7;
                                                                CashoutException cashoutException3 = cashoutException2;
                                                                if (exMessage2 == null) {
                                                                    exMessage = str8 == null ? cashoutException3.getExMessage() : str8;
                                                                } else {
                                                                    exMessage = exMessage2;
                                                                }
                                                                ((x5a0) ytwVar).setValue(exMessage);
                                                                ((x5a0) fgbVar3.c1().K).setValue(new j58(fgbVar3.b1().P()));
                                                                ((x5a0) fgbVar3.c1().L).setValue(new j58(fgbVar3.b1().x0));
                                                                ((x5a0) fgbVar3.c1().O).setValue(Boolean.TRUE);
                                                                ((x5a0) fgbVar3.c1().Q).setValue(3000);
                                                                if (exMessage2 == null) {
                                                                    exMessage2 = str8 == null ? cashoutException3.getExMessage() : str8;
                                                                }
                                                                fgb.K0(fgbVar3, exMessage2, fgbVar3.b1().P(), fgbVar3.b1().x0, ((Number) ((x5a0) fgbVar3.c1().M).getValue()).intValue(), 24);
                                                            }
                                                            return Unit.a;
                                                        }
                                                    };
                                                    context.getColor(R.color.try_again_color);
                                                    boolean zA3 = aVar3.A(fgbVar2);
                                                    Object objY4 = aVar3.y();
                                                    if (zA3 || objY4 == c0042a) {
                                                        objY4 = new Function1() { // from class: scb
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj5) {
                                                                String str8 = (String) obj5;
                                                                str8.getClass();
                                                                fgbVar2.N0(str8);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar3.r(objY4);
                                                    }
                                                    Function1 function4 = (Function1) objY4;
                                                    boolean zA4 = aVar3.A(fgbVar2);
                                                    Object objY5 = aVar3.y();
                                                    if (zA4 || objY5 == c0042a) {
                                                        objY5 = new Function1() { // from class: tcb
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj5) {
                                                                int iIntValue3 = ((Integer) obj5).intValue();
                                                                mke mkeVar = fgbVar2.q1;
                                                                if (mkeVar == null) {
                                                                    return null;
                                                                }
                                                                mkeVar.S0(iIntValue3);
                                                                return Unit.a;
                                                            }
                                                        };
                                                        aVar3.r(objY5);
                                                    }
                                                    q8bVar2.a(eVar, str5, genericError, function0, function1, function2, function3, function4, (Function1) objY5, fgbVar2.U0(), aVar3, 1769472);
                                                } else {
                                                    aVar3.N(-2112917414);
                                                }
                                                aVar3.H();
                                            }
                                            aVar3.H();
                                        } else {
                                            aVar3.G();
                                        }
                                        return Unit.a;
                                    }
                                }, true));
                            }
                        } else {
                            fgbVar.m2();
                        }
                    }
                } catch (Exception unused) {
                }
                return Unit.a;
        }
    }
}
