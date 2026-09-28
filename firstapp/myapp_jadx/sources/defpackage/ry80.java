package defpackage;

import android.graphics.Path;
import android.graphics.RectF;
import android.widget.FrameLayout;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ry80 {
    public rx80 c;
    public boolean a = false;
    public boolean b = false;
    public RectF d = new RectF();
    public final Path e = new Path();

    public abstract void a(FrameLayout frameLayout);

    public abstract boolean b();

    public final void c() {
        rx80 rx80Var;
        RectF rectF = this.d;
        if (rectF.left > rectF.right || rectF.top > rectF.bottom || (rx80Var = this.c) == null) {
            return;
        }
        sx80.a.a.a(rx80Var, null, 1.0f, rectF, null, this.e);
    }
}
