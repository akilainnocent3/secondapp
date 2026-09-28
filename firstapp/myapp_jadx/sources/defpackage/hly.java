package defpackage;

import androidx.compose.runtime.c;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class hly<N> implements fv0<N> {
    public final fv0<N> a;
    public final int b;
    public int c;

    public hly(fv0<N> fv0Var, int i) {
        this.a = fv0Var;
        this.b = i;
    }

    @Override // defpackage.fv0
    public final void a(Object obj, Function2 function2) {
        this.a.a(obj, function2);
    }

    @Override // defpackage.fv0
    public final N b() {
        return this.a.b();
    }

    @Override // defpackage.fv0
    public final void c(int i, int i2, int i3) {
        int i4 = this.c == 0 ? this.b : 0;
        this.a.c(i + i4, i2 + i4, i3);
    }

    @Override // defpackage.fv0
    public final void clear() {
        c.b("Clear is not valid on OffsetApplier");
    }

    @Override // defpackage.fv0
    public final void d(int i, int i2) {
        this.a.d(i + (this.c == 0 ? this.b : 0), i2);
    }

    @Override // defpackage.fv0
    public final void e(int i, N n) {
        this.a.e(i + (this.c == 0 ? this.b : 0), n);
    }

    @Override // defpackage.fv0
    public final void g(int i, N n) {
        this.a.g(i + (this.c == 0 ? this.b : 0), n);
    }

    @Override // defpackage.fv0
    public final void h(N n) {
        this.c++;
        this.a.h(n);
    }

    @Override // defpackage.fv0
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.fv0
    public final void j() {
        if (this.c <= 0) {
            c.b("OffsetApplier up called with no corresponding down");
        }
        this.c--;
        this.a.j();
    }
}
