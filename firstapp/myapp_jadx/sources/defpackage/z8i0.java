package defpackage;

import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.MotionLayout;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class z8i0 extends amp {

    public static class a extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setAlpha(a(f));
        }
    }

    public static class b extends z8i0 {
        public final float[] g = new float[1];
        public androidx.constraintlayout.widget.a h;

        @Override // defpackage.amp
        public final void c(androidx.constraintlayout.widget.a aVar) {
            this.h = aVar;
        }

        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            float fA = a(f);
            float[] fArr = this.g;
            fArr[0] = fA;
            qjc.b(this.h, view, fArr);
        }
    }

    public static class c extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setElevation(a(f));
        }
    }

    public static class e extends z8i0 {
        public boolean g;

        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            Method method;
            if (view instanceof MotionLayout) {
                ((MotionLayout) view).setProgress(a(f));
                return;
            }
            if (this.g) {
                return;
            }
            try {
                method = view.getClass().getMethod("setProgress", Float.TYPE);
            } catch (NoSuchMethodException unused) {
                this.g = true;
                method = null;
            }
            if (method != null) {
                try {
                    method.invoke(view, Float.valueOf(a(f)));
                } catch (IllegalAccessException e) {
                    Log.e("ViewOscillator", "unable to setProgress", e);
                } catch (InvocationTargetException e2) {
                    Log.e("ViewOscillator", "unable to setProgress", e2);
                }
            }
        }
    }

    public static class f extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setRotation(a(f));
        }
    }

    public static class g extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setRotationX(a(f));
        }
    }

    public static class h extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setRotationY(a(f));
        }
    }

    public static class i extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setScaleX(a(f));
        }
    }

    public static class j extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setScaleY(a(f));
        }
    }

    public static class k extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setTranslationX(a(f));
        }
    }

    public static class l extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setTranslationY(a(f));
        }
    }

    public static class m extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
            view.setTranslationZ(a(f));
        }
    }

    public z8i0() {
        this.c = 0;
        this.d = null;
        this.e = 0;
        this.f = new ArrayList<>();
    }

    public abstract void e(View view, float f2);

    public static class d extends z8i0 {
        @Override // defpackage.z8i0
        public final void e(View view, float f) {
        }
    }
}
