package defpackage;

import androidx.compose.foundation.layout.j;
import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.c;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class zd7 {

    public static final /* synthetic */ class a extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((vx00) this.receiver).y1();
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            ((vx00) this.receiver).y1();
            return Unit.a;
        }
    }

    public static final void a(final vx00 vx00Var, final ku00 ku00Var, final String str, androidx.compose.runtime.a aVar, final int i) {
        final vx00 vx00Var2;
        androidx.compose.runtime.b bVar;
        vx00Var.getClass();
        ku00Var.getClass();
        str.getClass();
        androidx.compose.runtime.b bVarI = aVar.i(-1323504696);
        int i2 = (bVarI.A(vx00Var) ? 4 : 2) | i | (bVarI.M(ku00Var) ? 32 : 16) | (bVarI.M(str) ? 256 : 128);
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            boolean zA = bVarI.A(vx00Var);
            Object objY = bVarI.y();
            if (zA || objY == androidx.compose.runtime.a.C0041a.a) {
                a aVar2 = new a(0, vx00Var, vx00.class, "closeChat", "closeChat()V", 0);
                bVarI.r(aVar2);
                objY = aVar2;
            }
            bVar = bVarI;
            u60.a((Function0) ((chp) objY), new yle(39, false, false, false, false), pp8.b(8323729, new Function2() { // from class: xd7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    a aVar3 = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    if (aVar3.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        d dVarB = androidx.compose.foundation.a.b(j.e(d.a.b, 1.0f), j58.c(0.4f, j58.b), zk40.a);
                        aiv aivVarC = g75.c(ht.a.a, false);
                        int iHashCode = Long.hashCode(aVar3.m());
                        ne00 ne00VarO = aVar3.o();
                        d dVarC = c.c(aVar3, dVarB);
                        yka.k.getClass();
                        tsr.a aVar4 = yka.a.b;
                        if (aVar3.k() == null) {
                            l2a.b();
                            throw null;
                        }
                        aVar3.D();
                        if (aVar3.g()) {
                            aVar3.F(aVar4);
                        } else {
                            aVar3.p();
                        }
                        hlh0.a(aVar3, aivVarC, yka.a.f);
                        hlh0.a(aVar3, ne00VarO, yka.a.e);
                        yka.a.C1350a c1350a = yka.a.g;
                        if (aVar3.g() || !Intrinsics.g(aVar3.y(), Integer.valueOf(iHashCode))) {
                            j3c.a(iHashCode, aVar3, iHashCode, c1350a);
                        }
                        hlh0.a(aVar3, dVarC, yka.a.d);
                        ku00 ku00Var2 = ku00Var;
                        String str2 = ku00Var2.a;
                        String str3 = ku00Var2.c;
                        String str4 = ku00Var2.b;
                        m2g m2gVar = m2g.a;
                        vx00 vx00Var3 = vx00Var;
                        boolean zA2 = aVar3.A(vx00Var3);
                        Object objY2 = aVar3.y();
                        if (zA2 || objY2 == a.C0041a.a) {
                            zd7.b bVar2 = new zd7.b(0, vx00Var3, vx00.class, "closeChat", "closeChat()V", 0);
                            aVar3.r(bVar2);
                            objY2 = bVar2;
                        }
                        dg7.f(str2, str3, str4, "", str, 0L, null, (Function0) ((chp) objY2), null, null, null, null, null, null, null, null, m2gVar, 0, 0, null, 0L, null, null, null, "", "", aVar3, 199680, 1572864, 221184, 16711488);
                        aVar3.s();
                    } else {
                        aVar3.G();
                    }
                    return Unit.a;
                }
            }, bVarI), bVar, 432, 0);
        } else {
            vx00Var2 = vx00Var;
            bVar = bVarI;
            bVar.G();
        }
        e eVarZ = bVar.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(ku00Var, str, i) { // from class: yd7
                public final /* synthetic */ ku00 b;
                public final /* synthetic */ String c;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    zd7.a(this.a, this.b, this.c, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
