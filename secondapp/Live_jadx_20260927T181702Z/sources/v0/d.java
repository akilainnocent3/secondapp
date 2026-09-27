package v0;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends n0.o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f139826g = "ViewSpline";

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setAlpha(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class b extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public String f139827h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public SparseArray<androidx.constraintlayout.widget.b> f139828i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float[] f139829j;

        public b(String str, SparseArray<androidx.constraintlayout.widget.b> sparseArray) {
            this.f139827h = str.split(",")[1];
            this.f139828i = sparseArray;
        }

        @Override // n0.o
        public void g(int i10, float f10) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // n0.o
        public void j(int i10) {
            int size = this.f139828i.size();
            int iP = this.f139828i.valueAt(0).p();
            double[] dArr = new double[size];
            this.f139829j = new float[iP];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iP);
            for (int i11 = 0; i11 < size; i11++) {
                int iKeyAt = this.f139828i.keyAt(i11);
                androidx.constraintlayout.widget.b bVarValueAt = this.f139828i.valueAt(i11);
                dArr[i11] = ((double) iKeyAt) * 0.01d;
                bVarValueAt.l(this.f139829j);
                int i12 = 0;
                while (true) {
                    float[] fArr = this.f139829j;
                    if (i12 < fArr.length) {
                        dArr2[i11][i12] = fArr[i12];
                        i12++;
                    }
                }
            }
            this.f115677a = n0.b.a(i10, dArr, dArr2);
        }

        @Override // v0.d
        public void m(View view, float f10) {
            this.f115677a.e(f10, this.f139829j);
            v0.a.b(this.f139828i.valueAt(0), view, this.f139829j);
        }

        public void n(int i10, androidx.constraintlayout.widget.b bVar) {
            this.f139828i.append(i10, bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class c extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setElevation(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class e extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setPivotX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class f extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setPivotY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g extends d {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public boolean f139830h = false;

        @Override // v0.d
        public void m(View view, float f10) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f10));
                return;
            }
            if (this.f139830h) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f139830h = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f10)));
                } catch (IllegalAccessException e10) {
                    Log.e(d.f139826g, "unable to setProgress", e10);
                } catch (InvocationTargetException e11) {
                    Log.e(d.f139826g, "unable to setProgress", e11);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class h extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setRotation(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class i extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setRotationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class j extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setRotationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class k extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setScaleX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class l extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setScaleY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class m extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setTranslationX(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class n extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setTranslationY(a(f10));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class o extends d {
        @Override // v0.d
        public void m(View view, float f10) {
            view.setTranslationZ(a(f10));
        }
    }

    public static d k(String str, SparseArray<androidx.constraintlayout.widget.b> sparseArray) {
        return new b(str, sparseArray);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static d l(String str) {
        str.getClass();
        byte b10 = -1;
        switch (str.hashCode()) {
            case -1249320806:
                if (str.equals("rotationX")) {
                    b10 = 0;
                }
                break;
            case -1249320805:
                if (str.equals("rotationY")) {
                    b10 = 1;
                }
                break;
            case -1225497657:
                if (str.equals("translationX")) {
                    b10 = 2;
                }
                break;
            case -1225497656:
                if (str.equals("translationY")) {
                    b10 = 3;
                }
                break;
            case -1225497655:
                if (str.equals("translationZ")) {
                    b10 = 4;
                }
                break;
            case -1001078227:
                if (str.equals("progress")) {
                    b10 = 5;
                }
                break;
            case -908189618:
                if (str.equals("scaleX")) {
                    b10 = 6;
                }
                break;
            case -908189617:
                if (str.equals("scaleY")) {
                    b10 = 7;
                }
                break;
            case -797520672:
                if (str.equals(w0.f.f141751t)) {
                    b10 = 8;
                }
                break;
            case -760884510:
                if (str.equals(w0.f.f141743l)) {
                    b10 = 9;
                }
                break;
            case -760884509:
                if (str.equals(w0.f.f141744m)) {
                    b10 = 10;
                }
                break;
            case -40300674:
                if (str.equals(w0.f.f141740i)) {
                    b10 = zi.c.f161635m;
                }
                break;
            case -4379043:
                if (str.equals("elevation")) {
                    b10 = zi.c.f161636n;
                }
                break;
            case 37232917:
                if (str.equals("transitionPathRotate")) {
                    b10 = 13;
                }
                break;
            case 92909918:
                if (str.equals("alpha")) {
                    b10 = zi.c.f161638p;
                }
                break;
            case 156108012:
                if (str.equals("waveOffset")) {
                    b10 = zi.c.f161639q;
                }
                break;
        }
        switch (b10) {
            case 0:
                return new i();
            case 1:
                return new j();
            case 2:
                return new m();
            case 3:
                return new n();
            case 4:
                return new o();
            case 5:
                return new g();
            case 6:
                return new k();
            case 7:
                return new l();
            case 8:
                return new a();
            case 9:
                return new e();
            case 10:
                return new f();
            case 11:
                return new h();
            case 12:
                return new c();
            case 13:
                return new C1461d();
            case 14:
                return new a();
            case 15:
                return new a();
            default:
                return null;
        }
    }

    public abstract void m(View view, float f10);

    /* JADX INFO: renamed from: v0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class C1461d extends d {
        public void n(View view, float f10, double d10, double d11) {
            view.setRotation(a(f10) + ((float) Math.toDegrees(Math.atan2(d11, d10))));
        }

        @Override // v0.d
        public void m(View view, float f10) {
        }
    }
}
