package defpackage;

import android.util.ArrayMap;
import android.util.Pair;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.c;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public final class kvx implements jan {
    public final jan a;
    public sy20 b;

    public kvx(jan janVar) {
        this.a = janVar;
    }

    @Override // defpackage.jan
    public final c a() {
        return g(this.a.a());
    }

    @Override // defpackage.jan
    public final int b() {
        return this.a.b();
    }

    @Override // defpackage.jan
    public final int c() {
        return this.a.c();
    }

    @Override // defpackage.jan
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.jan
    public final int d() {
        return this.a.d();
    }

    @Override // defpackage.jan
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.jan
    public final int f() {
        return this.a.f();
    }

    public final zi80 g(c cVar) {
        c4f0 c4f0Var;
        if (cVar == null) {
            return null;
        }
        if (this.b == null) {
            c4f0Var = c4f0.b;
        } else {
            sy20 sy20Var = this.b;
            Pair pair = new Pair(sy20Var.j, sy20Var.k.get(0));
            c4f0 c4f0Var2 = c4f0.b;
            ArrayMap arrayMap = new ArrayMap();
            arrayMap.put((String) pair.first, pair.second);
            c4f0Var = new c4f0(arrayMap);
        }
        this.b = null;
        return new zi80(cVar, new Size(cVar.c(), cVar.b()), new f06(new qei0(null, c4f0Var, cVar.m1().d())));
    }

    @Override // defpackage.jan
    public final Surface getSurface() {
        return this.a.getSurface();
    }

    @Override // defpackage.jan
    public final void h(final jan.a aVar, Executor executor) {
        this.a.h(new jan.a() { // from class: jvx
            @Override // jan.a
            public final void a(jan janVar) {
                aVar.a(this.a);
            }
        }, executor);
    }

    @Override // defpackage.jan
    public final c i() {
        return g(this.a.i());
    }
}
