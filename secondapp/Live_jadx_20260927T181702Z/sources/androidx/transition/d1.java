package androidx.transition;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g1 f19452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f19453b = "ViewUtils";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Property<View, Float> f19454c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Property<View, Rect> f19455d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends Property<View, Float> {
        public a(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Float get(View view) {
            return Float.valueOf(d1.b(view));
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Float f10) {
            d1.f(view, f10.floatValue());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b extends Property<View, Rect> {
        public b(Class cls, String str) {
            super(cls, str);
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            f19452a = new p1();
        } else {
            f19452a = new o1();
        }
        f19454c = new a(Float.class, "translationAlpha");
        f19455d = new b(Rect.class, "clipBounds");
    }

    public static void a(@NonNull View view) {
        f19452a.a(view);
    }

    public static float b(@NonNull View view) {
        return f19452a.c(view);
    }

    public static void c(@NonNull View view) {
        f19452a.d(view);
    }

    public static void d(@NonNull View view, @Nullable Matrix matrix) {
        f19452a.e(view, matrix);
    }

    public static void e(@NonNull View view, int i10, int i11, int i12, int i13) {
        f19452a.f(view, i10, i11, i12, i13);
    }

    public static void f(@NonNull View view, float f10) {
        f19452a.g(view, f10);
    }

    public static void g(@NonNull View view, int i10) {
        f19452a.h(view, i10);
    }

    public static void h(@NonNull View view, @NonNull Matrix matrix) {
        f19452a.i(view, matrix);
    }

    public static void i(@NonNull View view, @NonNull Matrix matrix) {
        f19452a.j(view, matrix);
    }
}
