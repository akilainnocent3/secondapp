package defpackage;

import android.graphics.Canvas;

/* JADX INFO: loaded from: classes.dex */
public final class jke0 implements u7n {
    public final yq60 a;
    public final z750 b;
    public final int c;
    public final int d;

    public jke0(yq60 yq60Var, z750 z750Var, int i, int i2) {
        this.a = yq60Var;
        this.b = z750Var;
        this.c = i;
        this.d = i2;
    }

    @Override // defpackage.u7n
    public final long a() {
        return 2048L;
    }

    @Override // defpackage.u7n
    public final int b() {
        return this.d;
    }

    @Override // defpackage.u7n
    public final int c() {
        return this.c;
    }

    @Override // defpackage.u7n
    public final void d(Canvas canvas) {
        yq60 yq60Var = this.a;
        yq60Var.getClass();
        z750 z750Var = this.b;
        if (z750Var == null) {
            z750Var = new z750();
        }
        if (z750Var.b == null) {
            z750Var.b = new yq60.a(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        }
        new zq60(canvas).I(yq60Var, z750Var);
    }

    @Override // defpackage.u7n
    public final boolean e() {
        return true;
    }
}
