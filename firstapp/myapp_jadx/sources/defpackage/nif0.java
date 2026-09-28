package defpackage;

import androidx.compose.runtime.a;
import androidx.compose.runtime.e;
import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class nif0 {

    public static final class a implements ply {
        public final /* synthetic */ iif0 a;
        public final /* synthetic */ boolean b;

        public a(iif0 iif0Var, boolean z) {
            this.a = iif0Var;
            this.b = z;
        }

        @Override // defpackage.ply
        public final long a() {
            return this.a.h(this.b);
        }
    }

    public static final class b implements PointerInputEventHandler {
        public final /* synthetic */ fff0 a;

        public b(fff0 fff0Var) {
            this.a = fff0Var;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(u020 u020Var, v1b<? super Unit> v1bVar) {
            Object objD = w5b.d(new kkt(u020Var, this.a, null), v1bVar);
            y5b y5bVar = y5b.a;
            if (objD != y5bVar) {
                objD = Unit.a;
            }
            return objD == y5bVar ? objD : Unit.a;
        }
    }

    public /* synthetic */ class c {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[lcl.values().length];
            try {
                lcl lclVar = lcl.a;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                lcl lclVar2 = lcl.a;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                lcl lclVar3 = lcl.a;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    public static final void a(final boolean z, final lg50 lg50Var, final iif0 iif0Var, androidx.compose.runtime.a aVar, final int i) {
        int i2;
        vkf0 vkf0VarD;
        androidx.compose.runtime.b bVarI = aVar.i(-1344558920);
        if ((i & 6) == 0) {
            i2 = (bVarI.b(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= bVarI.d(lg50Var.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= bVarI.A(iif0Var) ? 256 : 128;
        }
        if (bVarI.q(i2 & 1, (i2 & 147) != 146)) {
            int i3 = i2 & 14;
            boolean zM = (i3 == 4) | bVarI.M(iif0Var);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zM || objY == c0042a) {
                objY = new hif0(iif0Var, z);
                bVarI.r(objY);
            }
            fff0 fff0Var = (fff0) objY;
            boolean zA = (i3 == 4) | bVarI.A(iif0Var);
            Object objY2 = bVarI.y();
            if (zA || objY2 == c0042a) {
                objY2 = new a(iif0Var, z);
                bVarI.r(objY2);
            }
            ply plyVar = (ply) objY2;
            boolean zG = ulf0.g(iif0Var.j().b);
            int i4 = (int) (z ? iif0Var.j().b >> 32 : iif0Var.j().b & 4294967295L);
            n6s n6sVar = iif0Var.d;
            float fE = 0.0f;
            if (n6sVar != null && (vkf0VarD = n6sVar.d()) != null) {
                ukf0 ukf0Var = vkf0VarD.a;
                if (i4 >= 0) {
                    tkf0 tkf0Var = ukf0Var.a;
                    zjw zjwVar = ukf0Var.b;
                    if (tkf0Var.a.b.length() != 0) {
                        int iMin = Math.min(zjwVar.d(i4), Math.min(zjwVar.b - 1, zjwVar.f - 1));
                        if (i4 <= zjwVar.c(iMin, false)) {
                            zjwVar.l(iMin);
                            ArrayList arrayList = zjwVar.h;
                            jrz jrzVar = (jrz) arrayList.get(kf9.c(iMin, arrayList));
                            e90 e90Var = jrzVar.a;
                            int i5 = iMin - jrzVar.d;
                            qkf0 qkf0Var = e90Var.d;
                            fE = qkf0Var.e(i5) - qkf0Var.g(i5);
                        }
                    }
                }
            }
            float f = fE;
            boolean zA2 = bVarI.A(fff0Var);
            Object objY3 = bVarI.y();
            if (zA2 || objY3 == c0042a) {
                objY3 = new b(fff0Var);
                bVarI.r(objY3);
            }
            tz9.b(plyVar, z, lg50Var, zG, 0L, f, wje0.a(d.a.b, fff0Var, (PointerInputEventHandler) objY3), bVarI, (i2 << 3) & 1008);
        } else {
            bVarI.G();
        }
        e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: mif0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(i | 1);
                    nif0.a(z, lg50Var, iif0Var, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }

    public static final boolean b(iif0 iif0Var, boolean z) {
        urr urrVarC;
        n6s n6sVar = iif0Var.d;
        if (n6sVar == null || (urrVarC = n6sVar.c()) == null) {
            return false;
        }
        lk40 lk40VarA = z880.a(urrVarC);
        long jH = iif0Var.h(z);
        float f = lk40VarA.a;
        float f2 = lk40VarA.c;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jH >> 32));
        if (f > fIntBitsToFloat || fIntBitsToFloat > f2) {
            return false;
        }
        float f3 = lk40VarA.b;
        float f4 = lk40VarA.d;
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jH & 4294967295L));
        return f3 <= fIntBitsToFloat2 && fIntBitsToFloat2 <= f4;
    }
}
