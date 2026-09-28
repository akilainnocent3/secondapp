package defpackage;

import android.graphics.Shader;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class dx80 extends ya5 {
    public ksg0 b;
    public long c = 9205357640488583168L;

    @Override // defpackage.ya5
    public final void a(float f, long j, zqz zqzVar) {
        ksg0 ksg0Var = this.b;
        if (ksg0Var == null || !yw90.a(this.c, j)) {
            if (yw90.e(j)) {
                this.b = null;
                this.c = 9205357640488583168L;
                ksg0Var = null;
            } else {
                ksg0Var = this.b;
                if (ksg0Var == null) {
                    ksg0Var = new ksg0();
                    this.b = ksg0Var;
                }
                ksg0Var.a = b(j);
                this.b = ksg0Var;
                this.c = j;
            }
        }
        long jD = zqzVar.d();
        long j2 = j58.b;
        if (!nbh0.a(jD, j2)) {
            zqzVar.m(j2);
        }
        if (!Intrinsics.g(zqzVar.g(), ksg0Var != null ? ksg0Var.a : null)) {
            zqzVar.f(ksg0Var != null ? ksg0Var.a : null);
        }
        if (zqzVar.a() == f) {
            return;
        }
        zqzVar.b(f);
    }

    public abstract Shader b(long j);
}
