package defpackage;

import android.graphics.Bitmap;
import android.graphics.ColorSpace;
import android.widget.ImageView;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class abn {
    public static final p4h.b<ltg0.a> a = new p4h.b<>(ltg0.a.a);
    public static final p4h.b<Bitmap.Config> b = new p4h.b<>(vsh0.b);
    public static final p4h.b<ColorSpace> c = new p4h.b<>(null);
    public static final p4h.b<Boolean> d;
    public static final p4h.b<s9s> e;
    public static final p4h.b<Boolean> f;
    public static final p4h.b<Boolean> g;

    static {
        Boolean bool = Boolean.TRUE;
        d = new p4h.b<>(bool);
        e = new p4h.b<>(null);
        f = new p4h.b<>(bool);
        g = new p4h.b<>(Boolean.FALSE);
    }

    public static final void a(nan.a aVar, boolean z) {
        aVar.c().a(f, Boolean.valueOf(z));
    }

    public static final void b(nan.a aVar, final int i) {
        aVar.o = new Function1() { // from class: xan
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zbn.b(r1b.a(((nan) obj).a, i));
            }
        };
    }

    public static final Bitmap.Config c(u2z u2zVar) {
        return (Bitmap.Config) q4h.b(u2zVar, b);
    }

    public static final ColorSpace d(u2z u2zVar) {
        return a7.c(q4h.b(u2zVar, c));
    }

    public static final void e(nan.a aVar, final int i) {
        aVar.n = new Function1() { // from class: yan
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return zbn.b(r1b.a(((nan) obj).a, i));
            }
        };
    }

    public static final void f(nan.a aVar, ImageView imageView) {
        aVar.d = new vbn(imageView);
    }
}
