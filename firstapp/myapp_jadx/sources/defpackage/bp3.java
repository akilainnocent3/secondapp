package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import androidx.fragment.app.e;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.newtork.model.error.ErrorBody;
import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBetSource;
import com.sportybet.android.instantwin.router.openbet.OpenBetInput;
import java.math.BigDecimal;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bp3 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bp3(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String str;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                final jp3 jp3Var = (jp3) obj2;
                hqc hqcVar = (hqc) obj;
                jp3.a aVar = jp3.c0;
                int i2 = 0;
                jp3Var.M0(false);
                if (hqcVar instanceof nqc) {
                    T t = ((nqc) hqcVar).a;
                    xho xhoVar = t instanceof xho ? (xho) t : null;
                    jp3Var.y0(false);
                    if (xhoVar == null) {
                        if (jp3Var.isResumed()) {
                            jp3Var.J0();
                        }
                        jp3Var.a0 = false;
                    } else if (xhoVar.a) {
                        azm azmVar = jp3Var.P;
                        if (azmVar == null) {
                            Intrinsics.n("router");
                            throw null;
                        }
                        azmVar.d(wae.REACHED_LIMITS);
                    } else {
                        o4p o4pVar = ((n4p) jp3Var.s0()).f;
                        jlo jloVar = jp3Var.G;
                        if (jloVar == null) {
                            Intrinsics.n("instantWinRouter");
                            throw null;
                        }
                        Context contextRequireContext = jp3Var.requireContext();
                        contextRequireContext.getClass();
                        String str2 = o4pVar.c;
                        jloVar.g(contextRequireContext, new OpenBetInput(str2 != null ? str2 : "", true, InstantWinBetSource.BETSLIP));
                        jp3Var.a0 = false;
                        ((n4p) jp3Var.s0()).d();
                        jp3Var.r0().q0(((n4p) jp3Var.s0()).c());
                        jp3Var.requireActivity().finish();
                    }
                } else if (hqcVar instanceof kqc) {
                    String str3 = ((kqc) hqcVar).d;
                    jp3Var.y0(false);
                    try {
                        JsonSerializeService jsonSerializeService = jp3Var.I;
                        if (jsonSerializeService == null) {
                            Intrinsics.n("jsonSerializeService");
                            throw null;
                        }
                        ErrorBody errorBody = (ErrorBody) jsonSerializeService.fromJson(str3, ErrorBody.class);
                        int errorCode = errorBody.getErrorCode();
                        if (errorCode == 19000) {
                            y03 y03Var = jp3Var.B;
                            if (y03Var != null) {
                                y03Var.W();
                            }
                        } else if (errorCode == 19106) {
                            sqo.q(jp3Var.requireActivity(), new DialogInterface.OnClickListener() { // from class: ip3
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    jp3.a aVar2 = jp3.c0;
                                    jp3Var.z0();
                                }
                            });
                        } else if (errorCode == 19110) {
                            e eVarRequireActivity = jp3Var.requireActivity();
                            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: wo3
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    jp3.a aVar2 = jp3.c0;
                                    jp3Var.z0();
                                }
                            };
                            BigDecimal bigDecimal = sqo.a;
                            sqo.k(eVarRequireActivity, "", sn5.b(eVarRequireActivity, R.string.component_betslip__order_pocket_frozen_message, new Object[0]), onClickListener);
                        } else if (errorCode == 19400) {
                            uxb uxbVarA = yxb.a(errorCode, ((n4p) jp3Var.s0()).c(), errorBody.getCauseMessage());
                            uxb.d dVar = uxbVarA instanceof uxb.d ? (uxb.d) uxbVarA : null;
                            if (dVar != null) {
                                sqo.k(jp3Var.getActivity(), dVar.b, dVar.c, new DialogInterface.OnClickListener() { // from class: xo3
                                    @Override // android.content.DialogInterface.OnClickListener
                                    public final void onClick(DialogInterface dialogInterface, int i3) {
                                        jp3.a aVar2 = jp3.c0;
                                        jp3Var.r0().H0();
                                    }
                                });
                            } else {
                                jp3Var.J0();
                            }
                        } else if (errorCode == 19101) {
                            e eVarRequireActivity2 = jp3Var.requireActivity();
                            hp3 hp3Var = new hp3(jp3Var, i2);
                            BigDecimal bigDecimal2 = sqo.a;
                            try {
                                gd8.j0(new uqo(hp3Var)).showNow(eVarRequireActivity2.getSupportFragmentManager(), "dialog");
                                break;
                            } catch (Exception unused) {
                            }
                        } else if (errorCode == 19102) {
                            i5s i5sVar = jp3Var.Q;
                            if (i5sVar == null) {
                                Intrinsics.n("legacyInstantWinUtil");
                                throw null;
                            }
                            e eVarRequireActivity3 = jp3Var.requireActivity();
                            eVarRequireActivity3.getClass();
                            i5sVar.d(eVarRequireActivity3);
                        } else if (errorCode == 19201) {
                            sqo.k(jp3Var.requireActivity(), sn5.d(jp3Var, R.string.page_instant_virtual__game_unavailable, new Object[0]), sn5.d(jp3Var, jp3Var.r0().v, new Object[0]), new DialogInterface.OnClickListener() { // from class: vo3
                                @Override // android.content.DialogInterface.OnClickListener
                                public final void onClick(DialogInterface dialogInterface, int i3) {
                                    jp3.a aVar2 = jp3.c0;
                                    jp3 jp3Var2 = jp3Var;
                                    azm azmVar2 = jp3Var2.P;
                                    if (azmVar2 == null) {
                                        Intrinsics.n("router");
                                        throw null;
                                    }
                                    azmVar2.d(wae.VIRTUALS_LOBBY);
                                    jp3Var2.requireActivity().finish();
                                }
                            });
                        } else if (errorCode == 19202) {
                            uxb uxbVarA2 = yxb.a(errorCode, ((n4p) jp3Var.s0()).c(), errorBody.getCauseMessage());
                            uxb.b bVar = uxbVarA2 instanceof uxb.b ? (uxb.b) uxbVarA2 : null;
                            if (bVar != null) {
                                sqo.k(jp3Var.getActivity(), bVar.b, bVar.c, new yo3());
                            } else {
                                jp3Var.J0();
                            }
                        }
                        jp3Var.a0 = false;
                    } catch (Exception unused2) {
                        jp3Var.J0();
                    }
                }
                uy0 uy0Var = jp3Var.L;
                if (uy0Var != null) {
                    uy0Var.g();
                    return Unit.a;
                }
                Intrinsics.n("assetsInfoRepository");
                throw null;
            default:
                w540 w540Var = (w540) obj2;
                t640 t640VarJ = w540.j(w540Var, ((Integer) obj).intValue());
                if (t640VarJ != null && (str = t640VarJ.a) != null) {
                    w540Var.v.invoke(str);
                }
                return Unit.a;
        }
    }
}
