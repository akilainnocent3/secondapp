package androidx.compose.foundation.gestures;

import androidx.compose.ui.d;
import defpackage.aq40;
import defpackage.e10;
import defpackage.f10;
import defpackage.h10;
import defpackage.h4d;
import defpackage.hb5;
import defpackage.huw;
import defpackage.i20;
import defpackage.i3z;
import defpackage.i4d;
import defpackage.iaj;
import defpackage.ib5;
import defpackage.j10;
import defpackage.l10;
import defpackage.l5f0;
import defpackage.n9f;
import defpackage.p9f;
import defpackage.r00;
import defpackage.sje0;
import defpackage.svh;
import defpackage.t00;
import defpackage.t5a0;
import defpackage.tje0;
import defpackage.uhc;
import defpackage.uj50;
import defpackage.v00;
import defpackage.vbd;
import defpackage.vx0;
import defpackage.w00;
import defpackage.w5b;
import defpackage.wwh;
import defpackage.x00;
import defpackage.x1b;
import defpackage.xi0;
import defpackage.y5b;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class a {
    public static final x00 a = new x00(0);
    public static final i4d b = new i4d(new C0037a());

    /* JADX INFO: renamed from: androidx.compose.foundation.gestures.a$a, reason: collision with other inner class name */
    public static final class C0037a implements wwh {
        @Override // defpackage.wwh
        public final float a(float f, long j) {
            return 0.0f;
        }

        @Override // defpackage.wwh
        public final float b(float f, float f2, long j) {
            return 0.0f;
        }

        @Override // defpackage.wwh
        public final float c() {
            return 0.0f;
        }

        @Override // defpackage.wwh
        public final long d(float f) {
            return 0L;
        }

        @Override // defpackage.wwh
        public final float e(float f, float f2) {
            return 0.0f;
        }
    }

    public static final vbd a(Function1 function1) {
        p9f p9fVar = new p9f();
        function1.invoke(p9fVar);
        float[] fArr = p9fVar.b;
        ArrayList arrayList = p9fVar.a;
        int size = arrayList.size();
        fArr.getClass();
        vx0.a(size, fArr.length);
        float[] fArrCopyOfRange = Arrays.copyOfRange(fArr, 0, size);
        fArrCopyOfRange.getClass();
        return new vbd(arrayList, fArrCopyOfRange);
    }

    public static d b(d dVar, i20 i20Var, i3z i3zVar, boolean z, svh svhVar, int i) {
        if ((i & 4) != 0) {
            z = true;
        }
        return dVar.n(new AnchoredDraggableElement(i20Var, i3zVar, z, null, svhVar));
    }

    public static d c(d dVar, i20 i20Var, l5f0 l5f0Var, int i) {
        i3z i3zVar = i3z.a;
        if ((i & 64) != 0) {
            l5f0Var = null;
        }
        return dVar.n(new AnchoredDraggableElement(i20Var, i3zVar, true, Boolean.TRUE, l5f0Var));
    }

    public static final Object d(i20 i20Var, float f, t00 t00Var, n9f n9fVar, Object obj, xi0 xi0Var, tje0 tje0Var) {
        Object objA;
        float fD = n9fVar.d(obj);
        aq40 aq40Var = new aq40();
        aq40Var.a = Float.isNaN(((t5a0) i20Var.j).j()) ? 0.0f : ((t5a0) i20Var.j).j();
        if (!Float.isNaN(fD)) {
            float f2 = aq40Var.a;
            if (f2 != fD && (objA = sje0.a(f2, fD, f, xi0Var, new w00(t00Var, aq40Var), tje0Var)) == y5b.a) {
                return objA;
            }
        }
        return Unit.a;
    }

    public static Object e(i20 i20Var, Object obj, x1b x1bVar) {
        xi0 xi0Var;
        if (i20Var.c()) {
            xi0Var = i20Var.d;
            if (xi0Var == null) {
                Intrinsics.n("snapAnimationSpec");
                throw null;
            }
        } else {
            xi0Var = v00.a;
        }
        Object objA = i20Var.a(obj, huw.a, new e10(i20Var, xi0Var, null), x1bVar);
        return objA == y5b.a ? objA : Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public static final Object f(i20 i20Var, Object obj, float f, xi0 xi0Var, h4d h4dVar, x1b x1bVar) {
        f10 f10Var;
        float f2;
        aq40 aq40Var;
        if (x1bVar instanceof f10) {
            f10Var = (f10) x1bVar;
            int i = f10Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                f10Var.d = i - Integer.MIN_VALUE;
            } else {
                f10Var = new f10(x1bVar);
            }
        } else {
            f10Var = new f10(x1bVar);
        }
        f10 f10Var2 = f10Var;
        Object obj2 = f10Var2.c;
        Object obj3 = y5b.a;
        int i2 = f10Var2.d;
        if (i2 == 0) {
            uj50.b(obj2);
            aq40 aq40Var2 = new aq40();
            aq40Var2.a = f;
            iaj h10Var = new h10(i20Var, f, xi0Var, aq40Var2, h4dVar, null);
            f10Var2.b = aq40Var2;
            f10Var2.a = f;
            f10Var2.d = 1;
            if (i20Var.a(obj, huw.a, h10Var, f10Var2) == obj3) {
                return obj3;
            }
            f2 = f;
            aq40Var = aq40Var2;
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            f2 = f10Var2.a;
            aq40Var = f10Var2.b;
            uj50.b(obj2);
        }
        return new Float(f2 - aq40Var.a);
    }

    public static Object g(i20 i20Var, Object obj, float f, xi0 xi0Var, x1b x1bVar, int i) {
        h4d h4dVar;
        if ((i & 4) != 0) {
            if (i20Var.c()) {
                xi0Var = i20Var.d;
                if (xi0Var == null) {
                    Intrinsics.n("snapAnimationSpec");
                    throw null;
                }
            } else {
                xi0Var = v00.a;
            }
        }
        xi0 xi0Var2 = xi0Var;
        if (i20Var.c()) {
            h4dVar = i20Var.e;
            if (h4dVar == null) {
                Intrinsics.n("decayAnimationSpec");
                throw null;
            }
        } else {
            h4dVar = v00.c;
        }
        return f(i20Var, obj, f, xi0Var2, h4dVar, x1bVar);
    }

    /* JADX WARN: Code duplicated, block: B:32:0x008b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x008c A[RETURN] */
    public static final <T> T h(n9f<T> n9fVar, float f, float f2, Function1<? super Float, Float> function1, Function0<Float> function0) {
        if (Float.isNaN(f)) {
            hb5.a("The offset provided to computeTarget must not be NaN.");
            return null;
        }
        boolean z = Math.abs(f2) > 0.0f;
        boolean z2 = z && f2 > 0.0f;
        if (!z) {
            T tC = n9fVar.c(f);
            tC.getClass();
            return tC;
        }
        if (Math.abs(f2) >= Math.abs(function0.invoke().floatValue())) {
            T tB = n9fVar.b(f, z2);
            tB.getClass();
            return tB;
        }
        T tB2 = n9fVar.b(f, false);
        tB2.getClass();
        float fD = n9fVar.d(tB2);
        T tB3 = n9fVar.b(f, true);
        tB3.getClass();
        float fD2 = n9fVar.d(tB3);
        float fAbs = Math.abs(function1.invoke(Float.valueOf(Math.abs(fD - fD2))).floatValue());
        if (!z2) {
            fD = fD2;
        }
        boolean z3 = Math.abs(fD - f) >= fAbs;
        if (z3) {
            if (z2) {
                return tB3;
            }
            return tB2;
        }
        if (z3) {
            uhc.a();
            return null;
        }
        if (z2) {
            return tB2;
        }
        return tB3;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object i(Function0 function0, Function2 function2, x1b x1bVar) {
        j10 j10Var;
        if (x1bVar instanceof j10) {
            j10Var = (j10) x1bVar;
            int i = j10Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                j10Var.b = i - Integer.MIN_VALUE;
            } else {
                j10Var = new j10(x1bVar);
            }
        } else {
            j10Var = new j10(x1bVar);
        }
        Object obj = j10Var.a;
        y5b y5bVar = y5b.a;
        int i2 = j10Var.b;
        try {
            if (i2 == 0) {
                uj50.b(obj);
                l10 l10Var = new l10(function0, function2, null);
                j10Var.b = 1;
                if (w5b.d(l10Var, j10Var) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i2 != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
        } catch (r00 unused) {
        }
        return Unit.a;
    }
}
