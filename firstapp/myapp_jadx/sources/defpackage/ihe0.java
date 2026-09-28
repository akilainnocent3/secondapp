package defpackage;

import androidx.compose.ui.c;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ihe0 {
    public static final chf a = new chf(new fhe0());

    public static final class a implements Function2<androidx.compose.runtime.a, Integer, Unit> {
        public final /* synthetic */ d a;
        public final /* synthetic */ qx80 b;
        public final /* synthetic */ long c;
        public final /* synthetic */ float d;
        public final /* synthetic */ l35 e;
        public final /* synthetic */ float f;
        public final /* synthetic */ Function2<androidx.compose.runtime.a, Integer, Unit> i;

        /* JADX WARN: Multi-variable type inference failed */
        public a(d dVar, qx80 qx80Var, long j, float f, l35 l35Var, float f2, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2) {
            this.a = dVar;
            this.b = qx80Var;
            this.c = j;
            this.d = f;
            this.e = l35Var;
            this.f = f2;
            this.i = function2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Unit invoke(androidx.compose.runtime.a aVar, Integer num) {
            androidx.compose.runtime.a aVar2 = aVar;
            int iIntValue = num.intValue();
            if (aVar2.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                d dVarD = ihe0.d(this.a, this.b, ihe0.e(this.c, this.d, aVar2), this.e, ((mmd) aVar2.O(kna.h)).C1(this.f));
                Object objY = aVar2.y();
                androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
                if (objY == c0042a) {
                    objY = new ghe0();
                    aVar2.r(objY);
                }
                d dVarB = xa80.b(dVarD, false, (Function1) objY);
                Unit unit = Unit.a;
                Object objY2 = aVar2.y();
                if (objY2 == c0042a) {
                    objY2 = hhe0.a;
                    aVar2.r(objY2);
                }
                d dVarA = wje0.a(dVarB, unit, (PointerInputEventHandler) objY2);
                aiv aivVarC = g75.c(ht.a.a, true);
                int I = aVar2.I();
                ne00 ne00VarO = aVar2.o();
                d dVarC = c.c(aVar2, dVarA);
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
                if (aVar2.g() || !Intrinsics.g(aVar2.y(), Integer.valueOf(I))) {
                    j3c.a(I, aVar2, I, c1350a);
                }
                hlh0.a(aVar2, dVarC, yka.a.d);
                ps.a(0, aVar2, this.i);
            } else {
                aVar2.G();
            }
            return Unit.a;
        }
    }

    public static final void a(d dVar, qx80 qx80Var, long j, long j2, float f, float f2, l35 l35Var, Function2<? super androidx.compose.runtime.a, ? super Integer, Unit> function2, androidx.compose.runtime.a aVar, int i, int i2) {
        if ((i2 & 1) != 0) {
            dVar = d.a.b;
        }
        if ((i2 & 2) != 0) {
            qx80Var = zk40.a;
        }
        if ((i2 & 4) != 0) {
            j = ((d68) aVar.O(g68.a)).p;
        }
        if ((i2 & 8) != 0) {
            j2 = g68.b(j, aVar);
        }
        if ((i2 & 16) != 0) {
            f = 0.0f;
        }
        if ((i2 & 32) != 0) {
            f2 = 0.0f;
        }
        if ((i2 & 64) != 0) {
            l35Var = null;
        }
        chf chfVar = a;
        float f3 = f + ((g7f) aVar.O(chfVar)).a;
        hna.b(new j730[]{tp0.a(j2, iza.a), chfVar.a(new g7f(f3))}, pp8.b(421772006, new a(dVar, qx80Var, j, f3, l35Var, f2, function2), aVar), aVar, 56);
    }

    public static final void b(boolean z, Function0 function0, d dVar, boolean z2, qx80 qx80Var, long j, float f, l35 l35Var, psw pswVar, op8 op8Var, androidx.compose.runtime.a aVar, int i, int i2) {
        long jB = g68.b(j, aVar);
        float f2 = (i2 & 256) != 0 ? 0.0f : f;
        psw pswVar2 = (i2 & 1024) != 0 ? null : pswVar;
        if (pswVar2 == null) {
            aVar.N(1528143336);
            Object objY = aVar.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = pr7.a(aVar);
            }
            pswVar2 = (psw) objY;
        } else {
            aVar.N(-227800369);
        }
        aVar.H();
        psw pswVar3 = pswVar2;
        chf chfVar = a;
        float f3 = ((g7f) aVar.O(chfVar)).a + 0.0f;
        hna.b(new j730[]{tp0.a(jB, iza.a), chfVar.a(new g7f(f3))}, pp8.b(1508735219, new khe0(dVar, qx80Var, j, f3, l35Var, z, pswVar3, z2, function0, f2, op8Var), aVar), aVar, 56);
    }

    public static final void c(Function0 function0, d dVar, boolean z, qx80 qx80Var, long j, long j2, float f, float f2, l35 l35Var, psw pswVar, op8 op8Var, androidx.compose.runtime.a aVar, int i, int i2) {
        d dVar2 = (i2 & 2) != 0 ? d.a.b : dVar;
        boolean z2 = (i2 & 4) != 0 ? true : z;
        qx80 qx80Var2 = (i2 & 8) != 0 ? zk40.a : qx80Var;
        long jB = (i2 & 32) != 0 ? g68.b(j, aVar) : j2;
        float f3 = (i2 & 64) != 0 ? 0.0f : f;
        float f4 = (i2 & 128) != 0 ? 0.0f : f2;
        l35 l35Var2 = (i2 & 256) != 0 ? null : l35Var;
        psw pswVar2 = (i2 & 512) == 0 ? pswVar : null;
        if (pswVar2 == null) {
            aVar.N(-1701037204);
            Object objY = aVar.y();
            if (objY == androidx.compose.runtime.a.C0041a.a) {
                objY = pr7.a(aVar);
            }
            pswVar2 = (psw) objY;
        } else {
            aVar.N(2023337163);
        }
        aVar.H();
        chf chfVar = a;
        float f5 = f3 + ((g7f) aVar.O(chfVar)).a;
        hna.b(new j730[]{tp0.a(jB, iza.a), chfVar.a(new g7f(f5))}, pp8.b(849208527, new jhe0(dVar2, qx80Var2, j, f5, l35Var2, pswVar2, z2, function0, f4, op8Var), aVar), aVar, 56);
    }

    public static final d d(d dVar, qx80 qx80Var, long j, l35 l35Var, float f) {
        qx80 qx80Var2;
        d dVarB;
        d dVarB2 = d.a.b;
        if (f > 0.0f) {
            qx80Var2 = qx80Var;
            dVarB = androidx.compose.ui.graphics.a.b(dVarB2, 0.0f, 0.0f, 0.0f, f, qx80Var2, 124895);
        } else {
            qx80Var2 = qx80Var;
            dVarB = dVarB2;
        }
        d dVarN = dVar.n(dVarB);
        if (l35Var != null) {
            dVarB2 = d35.b(dVarB2, l35Var.a, l35Var.b, qx80Var2);
        }
        return ls7.a(androidx.compose.foundation.a.b(dVarN.n(dVarB2), j, qx80Var2), qx80Var2);
    }

    public static final long e(long j, float f, androidx.compose.runtime.a aVar) {
        d68 d68Var = (d68) aVar.O(g68.a);
        boolean zBooleanValue = ((Boolean) aVar.O(g68.b)).booleanValue();
        long j2 = d68Var.p;
        int i = j58.n;
        if (nbh0.a(j, j2) && zBooleanValue) {
            return g7f.b(f, 0.0f) ? j2 : r58.h(j58.c(((((float) Math.log(f + 1.0f)) * 4.5f) + 2.0f) / 100.0f, d68Var.t), j2);
        }
        return j;
    }
}
