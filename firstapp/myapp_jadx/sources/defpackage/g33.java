package defpackage;

import android.view.View;

/* JADX INFO: loaded from: classes7.dex */
public final class g33 implements Runnable {
    public final /* synthetic */ View a;
    public final /* synthetic */ View b;
    public final /* synthetic */ View c;

    public g33(View view, View view2, View view3) {
        this.a = view;
        this.b = view2;
        this.c = view3;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0046  */
    @Override // java.lang.Runnable
    public final void run() {
        View view = this.b;
        int left = view.getLeft();
        int width = view.getWidth();
        View view2 = this.c;
        int left2 = view2.getLeft();
        int width2 = view2.getWidth();
        int width3 = this.a.getWidth();
        float f = 0.0f;
        if (width > 0) {
            float f2 = (width2 / 2.0f) + left2;
            float f3 = width;
            float f4 = left;
            float f5 = (f2 - (f3 / 2.0f)) - f4;
            if (width3 <= 0 || width <= 0) {
                f = f5;
            } else {
                float f6 = f4 + f5;
                float f7 = f3 + f6;
                if (width >= width3) {
                    f = -f4;
                } else if (f6 < 0.0f) {
                    f = f5 - f6;
                } else {
                    float f8 = width3;
                    if (f7 > f8) {
                        f = f5 - (f7 - f8);
                    } else {
                        f = f5;
                    }
                }
            }
        }
        view.setTranslationX(f);
    }
}
