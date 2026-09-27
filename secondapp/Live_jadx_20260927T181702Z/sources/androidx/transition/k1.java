package androidx.transition;

import android.annotation.SuppressLint;
import android.graphics.Matrix;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@k.t0(21)
public class k1 extends g1 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static boolean f19602i = true;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static boolean f19603j = true;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static boolean f19604k = true;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @k.t0(29)
    public static class a {
        @k.t
        public static void a(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        @k.t
        public static void b(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        @k.t
        public static void c(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    @Override // androidx.transition.g1
    @SuppressLint({"NewApi"})
    public void e(@NonNull View view, @Nullable Matrix matrix) {
        if (f19602i) {
            try {
                a.a(view, matrix);
            } catch (NoSuchMethodError unused) {
                f19602i = false;
            }
        }
    }

    @Override // androidx.transition.g1
    @SuppressLint({"NewApi"})
    public void i(@NonNull View view, @NonNull Matrix matrix) {
        if (f19603j) {
            try {
                a.b(view, matrix);
            } catch (NoSuchMethodError unused) {
                f19603j = false;
            }
        }
    }

    @Override // androidx.transition.g1
    @SuppressLint({"NewApi"})
    public void j(@NonNull View view, @NonNull Matrix matrix) {
        if (f19604k) {
            try {
                a.c(view, matrix);
            } catch (NoSuchMethodError unused) {
                f19604k = false;
            }
        }
    }
}
