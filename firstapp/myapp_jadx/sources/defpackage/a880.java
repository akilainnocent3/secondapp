package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.input.pointer.SuspendPointerInputElement;

/* JADX INFO: loaded from: classes.dex */
public final class a880 implements j350 {
    public final long a;
    public final g980 b;
    public final long c;
    public syd0 d = syd0.c;
    public final d e;

    public a880(long j, g980 g980Var, long j2) {
        this.a = j;
        this.b = g980Var;
        this.c = j2;
        zg8 zg8Var = new zg8(this, 2);
        b880 b880Var = new b880(zg8Var, g980Var, j);
        c880 c880Var = new c880(zg8Var, g980Var, j);
        l880 l880Var = new l880(c880Var, b880Var);
        b020 b020Var = wje0.a;
        SuspendPointerInputElement suspendPointerInputElement = new SuspendPointerInputElement(c880Var, b880Var, null, l880Var, 4);
        g020.a.getClass();
        this.e = h020.c(suspendPointerInputElement, j020.b);
    }

    @Override // defpackage.j350
    public final void c() {
        this.b.e();
    }

    @Override // defpackage.j350
    public final void e() {
    }

    @Override // defpackage.j350
    public final void f() {
    }
}
