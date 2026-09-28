package defpackage;

import androidx.compose.foundation.text.modifiers.b;
import com.sportygames.crash.remote.models.RoundInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class gfb implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gfb(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:67:0x0101  */
    /* JADX WARN: Code duplicated, block: B:70:0x0112  */
    /* JADX WARN: Code duplicated, block: B:72:0x011d  */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        gvi gviVar;
        int i = this.a;
        boolean z = true;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fgb) obj2).z0 = ((RoundInfoResponse) q97.a(RoundInfoResponse.class, (String) obj)).getRoundId();
                return Unit.a;
            case 1:
                ylb0 ylb0Var = (ylb0) obj2;
                int iIntValue = ((Integer) obj).intValue();
                boolean z2 = ylb0Var.F2;
                ytw<Boolean> ytwVar = ylb0Var.P2;
                gvi gviVar2 = ylb0Var.z;
                if (z2) {
                    if (gviVar2 != null) {
                        gviVar2.V.setVisibility(0);
                    }
                    return Unit.a;
                }
                if (gviVar2 != null) {
                    gviVar2.V.setVisibility(0);
                }
                if (iIntValue == 1 && !ylb0Var.H3() && !((Boolean) ((x5a0) ylb0Var.c1().i0).getValue()).booleanValue()) {
                    Object value = ((x5a0) ylb0Var.R0().T).getValue();
                    z83 z83Var = z83.b;
                    boolean z3 = value == z83Var && ylb0Var.G2;
                    boolean z4 = ((x5a0) ylb0Var.S0().T).getValue() == z83Var && ylb0Var.H2;
                    if (z3 || z4) {
                        ylb0Var.R3(((x5a0) ylb0Var.R0().T).getValue() == z83Var && ylb0Var.G2, ((x5a0) ylb0Var.S0().T).getValue() == z83Var && ylb0Var.H2);
                    } else if (iIntValue != 0) {
                        if (ylb0Var.l0) {
                            ((x5a0) ytwVar).setValue(Boolean.valueOf(iIntValue == 1));
                            ylb0Var.S3(iIntValue);
                        } else if (iIntValue == 1) {
                            ((x5a0) ytwVar).setValue(Boolean.FALSE);
                            gviVar = ylb0Var.z;
                            if (gviVar != null) {
                                gviVar.V.setVisibility(8);
                            }
                        } else {
                            ((x5a0) ytwVar).setValue(Boolean.FALSE);
                            gviVar = ylb0Var.z;
                            if (gviVar != null) {
                                gviVar.V.setVisibility(8);
                            }
                        }
                    } else if (ylb0Var.l0) {
                        ((x5a0) ytwVar).setValue(Boolean.valueOf(iIntValue == 1));
                        ylb0Var.S3(iIntValue);
                    } else if (iIntValue == 1) {
                        ((x5a0) ytwVar).setValue(Boolean.FALSE);
                        gviVar = ylb0Var.z;
                        if (gviVar != null) {
                            gviVar.V.setVisibility(8);
                        }
                    } else {
                        ((x5a0) ytwVar).setValue(Boolean.FALSE);
                        gviVar = ylb0Var.z;
                        if (gviVar != null) {
                            gviVar.V.setVisibility(8);
                        }
                    }
                } else if (iIntValue != 0 && ylb0Var.I3()) {
                    ((x5a0) ytwVar).setValue(Boolean.FALSE);
                    ylb0Var.S3(0);
                } else if (ylb0Var.l0) {
                    ((x5a0) ytwVar).setValue(Boolean.valueOf(iIntValue == 1));
                    ylb0Var.S3(iIntValue);
                } else if (iIntValue == 1 || ylb0Var.y3() != 1) {
                    ((x5a0) ytwVar).setValue(Boolean.FALSE);
                    gviVar = ylb0Var.z;
                    if (gviVar != null) {
                        gviVar.V.setVisibility(8);
                    }
                } else {
                    ((x5a0) ytwVar).setValue(Boolean.TRUE);
                    ylb0Var.S3(1);
                }
                return Unit.a;
            default:
                b bVar = (b) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                b.a aVar = bVar.T;
                if (aVar == null) {
                    z = false;
                } else {
                    Function1<? super b.a, Unit> function1 = bVar.P;
                    if (function1 != null) {
                        function1.invoke(aVar);
                    }
                    b.a aVar2 = bVar.T;
                    if (aVar2 != null) {
                        aVar2.c = zBooleanValue;
                    }
                    pkd.f(bVar).R();
                    pkd.f(bVar).P();
                    rcf.a(bVar);
                }
                return Boolean.valueOf(z);
        }
    }
}
