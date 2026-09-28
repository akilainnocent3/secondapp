package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class lai0 extends kai0 {
    public static boolean g = true;

    public static class a {
        public static void a(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }

    public void f(View view, int i, int i2, int i3, int i4) {
        if (g) {
            try {
                a.a(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                g = false;
            }
        }
    }
}
