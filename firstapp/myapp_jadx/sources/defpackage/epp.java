package defpackage;

import android.graphics.Matrix;
import android.graphics.PointF;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.PathInterpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes.dex */
public final class epp {
    public static esa0<WeakReference<Interpolator>> b;
    public static final LinearInterpolator a = new LinearInterpolator();
    public static final hep.a c = hep.a.a("t", "s", "e", "o", "i", "h", "to", "ti");
    public static final hep.a d = hep.a.a("x", "y");

    public static Interpolator a(PointF pointF, PointF pointF2) {
        WeakReference weakReference;
        Interpolator pathInterpolator;
        pointF.x = rqv.b(pointF.x, -1.0f, 1.0f);
        pointF.y = rqv.b(pointF.y, -100.0f, 100.0f);
        pointF2.x = rqv.b(pointF2.x, -1.0f, 1.0f);
        float fB = rqv.b(pointF2.y, -100.0f, 100.0f);
        pointF2.y = fB;
        float f = pointF.x;
        float f2 = pointF.y;
        float f3 = pointF2.x;
        Matrix matrix = srh0.a;
        int i = f != 0.0f ? (int) (527.0f * f) : 17;
        if (f2 != 0.0f) {
            i = (int) (i * 31 * f2);
        }
        if (f3 != 0.0f) {
            i = (int) (i * 31 * f3);
        }
        if (fB != 0.0f) {
            i = (int) (i * 31 * fB);
        }
        synchronized (epp.class) {
            esa0<WeakReference<Interpolator>> esa0Var = b;
            if (esa0Var == null) {
                esa0Var = new esa0<>();
                b = esa0Var;
            }
            weakReference = (WeakReference) fsa0.a(esa0Var, i);
        }
        Interpolator interpolator = weakReference != null ? (Interpolator) weakReference.get() : null;
        if (weakReference != null && interpolator != null) {
            return interpolator;
        }
        try {
            pathInterpolator = new PathInterpolator(pointF.x, pointF.y, pointF2.x, pointF2.y);
        } catch (IllegalArgumentException e) {
            pathInterpolator = "The Path cannot loop back on itself.".equals(e.getMessage()) ? new PathInterpolator(Math.min(pointF.x, 1.0f), pointF.y, Math.max(pointF2.x, 0.0f), pointF2.y) : new LinearInterpolator();
        }
        try {
            WeakReference<Interpolator> weakReference2 = new WeakReference<>(pathInterpolator);
            synchronized (epp.class) {
                b.d(i, weakReference2);
            }
        } catch (ArrayIndexOutOfBoundsException unused) {
        }
        return pathInterpolator;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0215  */
    public static <T> cpp<T> b(hep hepVar, xmt xmtVar, float f, cvh0<T> cvh0Var, boolean z, boolean z2) {
        T t;
        Interpolator interpolatorA;
        T t2;
        Interpolator interpolatorA2;
        Interpolator interpolatorA3;
        Interpolator interpolatorA4;
        cpp<T> cppVar;
        hep.a aVar;
        PointF pointF;
        PointF pointF2;
        PointF pointF3;
        hep.a aVar2 = c;
        LinearInterpolator linearInterpolator = a;
        if (!z || !z2) {
            hep.a aVar3 = aVar2;
            if (!z) {
                return new cpp<>(cvh0Var.a(hepVar, f));
            }
            hepVar.f();
            PointF pointFB = null;
            T tA = null;
            boolean z3 = false;
            PointF pointFB2 = null;
            float F = 0.0f;
            PointF pointFB3 = null;
            PointF pointFB4 = null;
            T tA2 = null;
            while (hepVar.o()) {
                hep.a aVar4 = aVar3;
                switch (hepVar.V(aVar4)) {
                    case 0:
                        F = (float) hepVar.F();
                        break;
                    case 1:
                        tA2 = cvh0Var.a(hepVar, f);
                        break;
                    case 2:
                        tA = cvh0Var.a(hepVar, f);
                        break;
                    case 3:
                        pointFB2 = lfp.b(hepVar, 1.0f);
                        break;
                    case 4:
                        pointFB = lfp.b(hepVar, 1.0f);
                        break;
                    case 5:
                        z3 = hepVar.G() == 1;
                        break;
                    case 6:
                        pointFB3 = lfp.b(hepVar, f);
                        break;
                    case 7:
                        pointFB4 = lfp.b(hepVar, f);
                        break;
                    default:
                        hepVar.Z();
                        break;
                }
                aVar3 = aVar4;
            }
            hepVar.l();
            if (!z3) {
                if (pointFB2 == null || pointFB == null) {
                    t = tA;
                } else {
                    interpolatorA = a(pointFB2, pointFB);
                    t = tA;
                }
                cpp<T> cppVar2 = new cpp<>(xmtVar, tA2, t, interpolatorA, F, (Float) null);
                cppVar2.o = pointFB3;
                cppVar2.p = pointFB4;
                return cppVar2;
            }
            t = tA2;
            interpolatorA = linearInterpolator;
            cpp<T> cppVar3 = new cpp<>(xmtVar, tA2, t, interpolatorA, F, (Float) null);
            cppVar3.o = pointFB3;
            cppVar3.p = pointFB4;
            return cppVar3;
        }
        hepVar.f();
        PointF pointF4 = null;
        PointF pointFB5 = null;
        PointF pointFB6 = null;
        boolean z4 = false;
        PointF pointFB7 = null;
        PointF pointFB8 = null;
        PointF pointF5 = null;
        T tA3 = null;
        PointF pointF6 = null;
        PointF pointF7 = null;
        float F2 = 0.0f;
        T tA4 = null;
        while (hepVar.o()) {
            int iV = hepVar.V(aVar2);
            hep.a aVar5 = d;
            linearInterpolator = linearInterpolator;
            hep.b bVar = hep.b.c;
            z4 = z4;
            hep.b bVar2 = hep.b.i;
            switch (iV) {
                case 0:
                    aVar = aVar2;
                    pointF = pointFB5;
                    F2 = (float) hepVar.F();
                    pointFB6 = pointFB6;
                    pointFB5 = pointF;
                    aVar2 = aVar;
                    break;
                case 1:
                    tA3 = cvh0Var.a(hepVar, f);
                    aVar2 = aVar2;
                    linearInterpolator = linearInterpolator;
                    break;
                case 2:
                    tA4 = cvh0Var.a(hepVar, f);
                    aVar2 = aVar2;
                    linearInterpolator = linearInterpolator;
                    break;
                case 3:
                    hep.a aVar6 = aVar2;
                    pointFB5 = pointFB5;
                    PointF pointF8 = pointFB6;
                    tA3 = tA3;
                    if (hepVar.J() == bVar) {
                        hepVar.f();
                        float F3 = 0.0f;
                        float F4 = 0.0f;
                        float F5 = 0.0f;
                        float F6 = 0.0f;
                        while (hepVar.o()) {
                            int iV2 = hepVar.V(aVar5);
                            if (iV2 != 0) {
                                if (iV2 != 1) {
                                    hepVar.Z();
                                } else if (hepVar.J() == bVar2) {
                                    F6 = (float) hepVar.F();
                                    F4 = F6;
                                } else {
                                    hepVar.d();
                                    F4 = (float) hepVar.F();
                                    F6 = hepVar.J() == bVar2 ? (float) hepVar.F() : F4;
                                    hepVar.g();
                                }
                            } else if (hepVar.J() == bVar2) {
                                F5 = (float) hepVar.F();
                                F3 = F5;
                            } else {
                                hepVar.d();
                                F3 = (float) hepVar.F();
                                F5 = hepVar.J() == bVar2 ? (float) hepVar.F() : F3;
                                hepVar.g();
                            }
                        }
                        PointF pointF9 = new PointF(F3, F4);
                        pointF6 = new PointF(F5, F6);
                        hepVar.l();
                        pointF5 = pointF9;
                    } else {
                        pointFB7 = lfp.b(hepVar, f);
                    }
                    aVar2 = aVar6;
                    linearInterpolator = linearInterpolator;
                    pointFB6 = pointF8;
                    break;
                case 4:
                    T t3 = tA3;
                    if (hepVar.J() != bVar) {
                        aVar2 = aVar2;
                        pointFB8 = lfp.b(hepVar, f);
                        tA3 = t3;
                        aVar2 = aVar2;
                        linearInterpolator = linearInterpolator;
                    } else {
                        hepVar.f();
                        float F7 = 0.0f;
                        float F8 = 0.0f;
                        float F9 = 0.0f;
                        float F10 = 0.0f;
                        while (hepVar.o()) {
                            hep.a aVar7 = aVar2;
                            int iV3 = hepVar.V(aVar5);
                            if (iV3 != 0) {
                                pointF3 = pointFB6;
                                if (iV3 != 1) {
                                    hepVar.Z();
                                } else if (hepVar.J() == bVar2) {
                                    F10 = (float) hepVar.F();
                                    pointFB5 = pointFB5;
                                    F8 = F10;
                                } else {
                                    pointF2 = pointFB5;
                                    hepVar.d();
                                    F8 = (float) hepVar.F();
                                    F10 = hepVar.J() == bVar2 ? (float) hepVar.F() : F8;
                                    hepVar.g();
                                    pointFB5 = pointF2;
                                }
                            } else {
                                pointF2 = pointFB5;
                                pointF3 = pointFB6;
                                if (hepVar.J() == bVar2) {
                                    F9 = (float) hepVar.F();
                                    pointFB5 = pointF2;
                                    F7 = F9;
                                } else {
                                    hepVar.d();
                                    F7 = (float) hepVar.F();
                                    F9 = hepVar.J() == bVar2 ? (float) hepVar.F() : F7;
                                    hepVar.g();
                                    pointFB5 = pointF2;
                                }
                            }
                            aVar2 = aVar7;
                            pointFB6 = pointF3;
                        }
                        aVar = aVar2;
                        pointF = pointFB5;
                        PointF pointF10 = new PointF(F7, F8);
                        pointF4 = new PointF(F9, F10);
                        hepVar.l();
                        tA3 = t3;
                        pointF7 = pointF10;
                        pointFB5 = pointF;
                        aVar2 = aVar;
                    }
                    break;
                case 5:
                    z4 = hepVar.G() == 1;
                    linearInterpolator = linearInterpolator;
                    break;
                case 6:
                    pointFB5 = lfp.b(hepVar, f);
                    z4 = z4;
                    linearInterpolator = linearInterpolator;
                    break;
                case 7:
                    pointFB6 = lfp.b(hepVar, f);
                    z4 = z4;
                    linearInterpolator = linearInterpolator;
                    break;
                default:
                    hepVar.Z();
                    z4 = z4;
                    linearInterpolator = linearInterpolator;
                    break;
            }
        }
        PointF pointF11 = pointFB5;
        PointF pointF12 = pointFB6;
        LinearInterpolator linearInterpolator2 = linearInterpolator;
        boolean z5 = z4;
        T t4 = tA3;
        hepVar.l();
        if (!z5) {
            if (pointFB7 != null && pointFB8 != null) {
                interpolatorA4 = a(pointFB7, pointFB8);
                t2 = tA4;
                interpolatorA2 = null;
                interpolatorA3 = null;
            } else if (pointF5 == null || pointF6 == null || pointF7 == null || pointF4 == null) {
                t2 = tA4;
            } else {
                interpolatorA2 = a(pointF5, pointF7);
                interpolatorA3 = a(pointF6, pointF4);
                t2 = tA4;
                interpolatorA4 = null;
            }
            if (interpolatorA2 != null || interpolatorA3 == null) {
                cppVar = new cpp<>(xmtVar, t4, t2, interpolatorA4, F2, (Float) null);
            } else {
                cppVar = new cpp<>(xmtVar, t4, t2, interpolatorA2, interpolatorA3, F2);
            }
            cppVar.o = pointF11;
            cppVar.p = pointF12;
            return cppVar;
        }
        t2 = t4;
        interpolatorA4 = linearInterpolator2;
        interpolatorA2 = null;
        interpolatorA3 = null;
        if (interpolatorA2 != null) {
            cppVar = new cpp<>(xmtVar, t4, t2, interpolatorA4, F2, (Float) null);
        } else {
            cppVar = new cpp<>(xmtVar, t4, t2, interpolatorA4, F2, (Float) null);
        }
        cppVar.o = pointF11;
        cppVar.p = pointF12;
        return cppVar;
    }
}
