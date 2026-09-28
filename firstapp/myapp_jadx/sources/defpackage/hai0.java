package defpackage;

import android.graphics.Rect;
import android.os.Build;
import android.util.Property;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class hai0 {
    public static final mai0 a;
    public static final a b;
    public static final b c;

    public class a extends Property<View, Float> {
        @Override // android.util.Property
        public final Float get(View view) {
            return Float.valueOf(hai0.a.a(view));
        }

        @Override // android.util.Property
        public final void set(View view, Float f) {
            hai0.b(view, f.floatValue());
        }
    }

    public class b extends Property<View, Rect> {
        @Override // android.util.Property
        public final Rect get(View view) {
            return view.getClipBounds();
        }

        @Override // android.util.Property
        public final void set(View view, Rect rect) {
            view.setClipBounds(rect);
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 29) {
            a = new nai0();
        } else {
            a = new mai0();
        }
        b = new a(Float.class, "translationAlpha");
        c = new b(Rect.class, "clipBounds");
    }

    public static void a(View view, int i, int i2, int i3, int i4) {
        a.f(view, i, i2, i3, i4);
    }

    public static void b(View view, float f) {
        a.b(view, f);
    }

    public static void c(View view, int i) {
        a.g(view, i);
    }
}
