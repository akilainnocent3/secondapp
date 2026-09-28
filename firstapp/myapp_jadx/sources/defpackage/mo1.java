package defpackage;

import androidx.compose.foundation.layout.h;
import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import com.sportygames.goldmine.data.dto.oBji.dLRYz;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class mo1 implements gaj {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mo1(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.gaj
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        Object objV;
        int i = this.a;
        d.a aVar = d.a.b;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                op8 op8Var = (op8) obj4;
                r75 r75Var = (r75) obj;
                a aVar2 = (a) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                r75Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= aVar2.M(r75Var) ? 4 : 2;
                }
                if (aVar2.q(iIntValue & 1, (iIntValue & 19) != 18)) {
                    d dVarR = j.r(aVar, Math.min(r75Var.d(), r75Var.e()));
                    aiv aivVarC = g75.c(ht.a.a, false);
                    int iHashCode = Long.hashCode(aVar2.m());
                    ne00 ne00VarO = aVar2.o();
                    d dVarC = c.c(aVar2, dVarR);
                    yka.k.getClass();
                    tsr.a aVar3 = yka.a.b;
                    if (aVar2.k() == null) {
                        l2a.b();
                        throw null;
                    }
                    aVar2.D();
                    if (aVar2.g()) {
                        aVar2.F(aVar3);
                    } else {
                        aVar2.p();
                    }
                    hlh0.a(aVar2, aivVarC, yka.a.f);
                    hlh0.a(aVar2, ne00VarO, yka.a.e);
                    yka.a.C1350a c1350a = yka.a.g;
                    if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(iHashCode))) {
                        j3c.a(iHashCode, aVar2, iHashCode, c1350a);
                    }
                    hlh0.a(aVar2, dVarC, yka.a.d);
                    fc0.a(0, op8Var, aVar2);
                } else {
                    aVar2.G();
                }
                return Unit.a;
            default:
                gsi0 gsi0Var = (gsi0) obj4;
                r75 r75Var2 = (r75) obj;
                a aVar4 = (a) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                r75Var2.getClass();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= aVar4.M(r75Var2) ? 4 : 2;
                }
                if (aVar4.q(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    dtg0 dtg0VarF = vtg0.f(Boolean.valueOf(gsi0Var.d), "multiplier", aVar4, 48, 0);
                    o oVar = dtg0VarF.a;
                    g0h0 g0h0Var = gjs.d;
                    boolean zI = dtg0VarF.i();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zI) {
                        aVar4.N(1666853325);
                        aVar4.H();
                        objV = oVar.V();
                    } else {
                        aVar4.N(1666599280);
                        boolean zM = aVar4.M(dtg0VarF);
                        objV = aVar4.y();
                        if (zM || objV == c0042a) {
                            c5a0.e.getClass();
                            c5a0 c5a0VarA = c5a0.a.a();
                            Function1<Object, Unit> function1E = c5a0VarA != null ? c5a0VarA.e() : null;
                            c5a0 c5a0VarB = c5a0.a.b(c5a0VarA);
                            try {
                                Object objV2 = oVar.V();
                                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                                aVar4.r(objV2);
                                objV = objV2;
                            } catch (Throwable th) {
                                c5a0.a.e(c5a0VarA, c5a0VarB, function1E);
                                throw th;
                            }
                        }
                        aVar4.H();
                    }
                    boolean zBooleanValue = ((Boolean) objV).booleanValue();
                    aVar4.N(1815230974);
                    float fE = zBooleanValue ? r75Var2.e() : 8.0f;
                    aVar4.H();
                    g7f g7fVar = new g7f(fE);
                    boolean zM2 = aVar4.M(dtg0VarF);
                    Object objY = aVar4.y();
                    if (zM2 || objY == c0042a) {
                        objY = a6a0.b(new o6j0(dtg0VarF));
                        aVar4.r(objY);
                    }
                    boolean zBooleanValue2 = ((Boolean) ((twd0) objY).getValue()).booleanValue();
                    aVar4.N(1815230974);
                    float fE2 = zBooleanValue2 ? r75Var2.e() : 8.0f;
                    aVar4.H();
                    g7f g7fVar2 = new g7f(fE2);
                    boolean zM3 = aVar4.M(dtg0VarF);
                    Object objY2 = aVar4.y();
                    if (zM3 || objY2 == c0042a) {
                        objY2 = a6a0.b(new p6j0(dtg0VarF));
                        aVar4.r(objY2);
                    }
                    ((dtg0.b) ((twd0) objY2).getValue()).getClass();
                    aVar4.N(128613297);
                    gzg0 gzg0VarE = yi0.e(300, 0, xkf.a, 2);
                    aVar4.H();
                    g75.a(androidx.compose.foundation.a.b(j.i(j.g(r75Var2.b(aVar, ht.a.h), 1.0f), ((g7f) vtg0.d(dtg0VarF, g7fVar, g7fVar2, gzg0VarE, g0h0Var, aVar4, 196608).getValue()).a), gsi0Var.c, zk40.a), aVar4, 0);
                    lkf0.b(String.format(Locale.US, dLRYz.Sjo, Arrays.copyOf(new Object[]{Float.valueOf(gsi0Var.b)}, 1)).concat("x"), h.j(r75Var2.b(aVar, ht.a.b), 0.0f, 6.0f, 0.0f, 0.0f, 13), j58.f, i7f.b(12.0f, aVar4), null, new t9i(500), null, 0L, null, i7f.b(16.0f, aVar4), 0, false, 0, 0, null, null, aVar4, 196992, 0, 130000);
                } else {
                    aVar4.G();
                }
                return Unit.a;
        }
    }
}
