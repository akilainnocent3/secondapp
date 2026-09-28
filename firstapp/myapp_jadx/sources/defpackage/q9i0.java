package defpackage;

import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.Array;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public abstract class q9i0 extends aeb0 {

    public static class a extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    public static class b extends q9i0 {
        public SparseArray<androidx.constraintlayout.widget.a> f;
        public float[] g;

        public b() {
            throw null;
        }

        @Override // defpackage.aeb0
        public final void b(int i, float f) {
            throw new RuntimeException("call of custom attribute setPoint");
        }

        @Override // defpackage.aeb0
        public final void c(int i) {
            SparseArray<androidx.constraintlayout.widget.a> sparseArray = this.f;
            int size = sparseArray.size();
            int iC = sparseArray.valueAt(0).c();
            double[] dArr = new double[size];
            this.g = new float[iC];
            double[][] dArr2 = (double[][]) Array.newInstance((Class<?>) Double.TYPE, size, iC);
            for (int i2 = 0; i2 < size; i2++) {
                int iKeyAt = sparseArray.keyAt(i2);
                androidx.constraintlayout.widget.a aVarValueAt = sparseArray.valueAt(i2);
                dArr[i2] = ((double) iKeyAt) * 0.01d;
                aVarValueAt.b(this.g);
                int i3 = 0;
                while (true) {
                    float[] fArr = this.g;
                    if (i3 < fArr.length) {
                        dArr2[i2][i3] = fArr[i3];
                        i3++;
                    }
                }
            }
            this.a = r5c.a(i, dArr, dArr2);
        }

        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            this.a.d(f, this.g);
            qjc.b(this.f.valueAt(0), view, this.g);
        }
    }

    public static class c extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class e extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setPivotX(a(f));
        }
    }

    public static class f extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setPivotY(a(f));
        }
    }

    public static class g extends q9i0 {
        public boolean f;

        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.f) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.f = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewSpline", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewSpline", "unable to setProgress", e2);
                }
            }
        }
    }

    public static class h extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setRotation(a(f));
        }
    }

    public static class i extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    public static class j extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    public static class k extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    public static class l extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    public static class m extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    public static class n extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    public static class o extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public abstract void d(View view, float f2);

    public static class d extends q9i0 {
        @Override // defpackage.q9i0
        public final void d(View view, float f) {
        }
    }
}
