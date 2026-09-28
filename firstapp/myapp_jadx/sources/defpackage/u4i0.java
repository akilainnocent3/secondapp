package defpackage;

import android.content.Context;
import android.hardware.display.DisplayManager;
import android.view.Surface;

/* JADX INFO: loaded from: classes.dex */
public final class u4i0 {
    public final ljv a;
    public final w4i0 b;
    public final long c;
    public boolean d;
    public long g;
    public boolean j;
    public boolean m;
    public boolean n;
    public int e = 0;
    public long f = -9223372036854775807L;
    public long h = -9223372036854775807L;
    public long i = -9223372036854775807L;
    public float k = 1.0f;
    public vs7 l = vs7.a;

    public static class a {
        public long a = -9223372036854775807L;
        public long b = -9223372036854775807L;
    }

    public u4i0(Context context, ljv ljvVar, long j) {
        this.a = ljvVar;
        this.c = j;
        this.b = new w4i0(context);
    }

    /* JADX WARN: Code duplicated, block: B:36:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:37:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:61:0x0119  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int a(long j, long j2, long j3, long j4, boolean z, boolean z2, a aVar) {
        long j5;
        long j6;
        boolean z3;
        int i;
        long j7;
        int i2;
        int i3;
        long j8;
        long j9;
        int i4;
        aVar.a = -9223372036854775807L;
        aVar.b = -9223372036854775807L;
        if (this.d && this.f == -9223372036854775807L) {
            this.f = j2;
        }
        if (this.h != j) {
            w4i0 w4i0Var = this.b;
            j5 = 1000;
            long j10 = w4i0Var.n;
            if (j10 != -1) {
                w4i0Var.p = j10;
                w4i0Var.q = w4i0Var.o;
            }
            w4i0Var.m++;
            qth qthVar = w4i0Var.a;
            long j11 = j * 1000;
            qthVar.a.b(j11);
            if (qthVar.a.a()) {
                qthVar.c = false;
            } else {
                if (qthVar.d != -9223372036854775807L) {
                    if (qthVar.c) {
                        qth.a aVar2 = qthVar.b;
                        j6 = 0;
                        long j12 = aVar2.d;
                        if (j12 == 0 ? false : aVar2.g[(int) ((j12 - 1) % 15)]) {
                        }
                        qthVar.c = true;
                        qthVar.b.b(j11);
                    } else {
                        j6 = 0;
                    }
                    qthVar.b.c();
                    qthVar.b.b(qthVar.d);
                    qthVar.c = true;
                    qthVar.b.b(j11);
                }
                if (qthVar.c && qthVar.b.a()) {
                    qth.a aVar3 = qthVar.a;
                    qthVar.a = qthVar.b;
                    qthVar.b = aVar3;
                    qthVar.c = false;
                }
                qthVar.d = j11;
                if (qthVar.a.a()) {
                    i4 = 0;
                } else {
                    i4 = qthVar.e + 1;
                }
                qthVar.e = i4;
                w4i0Var.c();
                this.h = j;
            }
            j6 = 0;
            if (qthVar.c) {
                qth.a aVar4 = qthVar.a;
                qthVar.a = qthVar.b;
                qthVar.b = aVar4;
                qthVar.c = false;
            }
            qthVar.d = j11;
            if (qthVar.a.a()) {
                i4 = 0;
            } else {
                i4 = qthVar.e + 1;
            }
            qthVar.e = i4;
            w4i0Var.c();
            this.h = j;
        } else {
            j5 = 1000;
            j6 = 0;
        }
        long jO = (long) ((j - j2) / ((double) this.k));
        if (this.d) {
            jO -= jrh0.O(this.l.d()) - j3;
        }
        aVar.a = jO;
        if (!z || z2) {
            if (this.m) {
                long j13 = jO;
                if (this.i == -9223372036854775807L || this.j) {
                    int i5 = this.e;
                    if (i5 != 0) {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                if (i5 != 3) {
                                    fm20.a();
                                    return 0;
                                }
                                long jO2 = jrh0.O(this.l.d()) - this.g;
                                if (this.d) {
                                    long j14 = this.f;
                                    if (j14 == -9223372036854775807L || j14 == j2 || j13 >= -30000 || jO2 <= 100000) {
                                    }
                                }
                                z3 = false;
                            } else if (j2 < j4) {
                                z3 = false;
                            }
                        }
                        z3 = true;
                    } else {
                        z3 = this.d;
                    }
                } else {
                    z3 = false;
                }
                if (z3) {
                    return 0;
                }
                if (!this.d || j2 == this.f) {
                    return 5;
                }
                long jNanoTime = this.l.nanoTime();
                w4i0 w4i0Var2 = this.b;
                long j15 = (aVar.a * j5) + jNanoTime;
                if (w4i0Var2.p == r11 || !w4i0Var2.a.a.a()) {
                    i = 3;
                    j7 = -30000;
                    i2 = 2;
                    i3 = 1;
                } else {
                    qth qthVar2 = w4i0Var2.a;
                    if (qthVar2.a.a()) {
                        qth.a aVar5 = qthVar2.a;
                        long j16 = aVar5.e;
                        i = 3;
                        j7 = -30000;
                        j9 = j16 == j6 ? j6 : aVar5.f / j16;
                    } else {
                        i = 3;
                        j7 = -30000;
                        j9 = -9223372036854775807L;
                    }
                    i2 = 2;
                    i3 = 1;
                    long j17 = w4i0Var2.q + ((long) (((w4i0Var2.m - w4i0Var2.p) * j9) / w4i0Var2.i));
                    if (Math.abs(j15 - j17) <= 20000000) {
                        j15 = j17;
                    } else {
                        w4i0Var2.m = j6;
                        w4i0Var2.p = -1L;
                        w4i0Var2.n = -1L;
                    }
                }
                w4i0Var2.n = w4i0Var2.m;
                w4i0Var2.o = j15;
                w4i0.c cVar = w4i0Var2.c;
                if (cVar != null && w4i0Var2.k != -9223372036854775807L) {
                    long j18 = cVar.a;
                    if (j18 != -9223372036854775807L) {
                        long j19 = w4i0Var2.k;
                        long j20 = (((j15 - j18) / j19) * j19) + j18;
                        if (j15 <= j20) {
                            j8 = j20 - j19;
                        } else {
                            j8 = j20;
                            j20 = j19 + j20;
                        }
                        if (j20 - j15 >= j15 - j8) {
                            j20 = j8;
                        }
                        j15 = j20 - w4i0Var2.l;
                    }
                }
                aVar.b = j15;
                long j21 = (j15 - jNanoTime) / j5;
                aVar.a = j21;
                boolean z4 = (this.i == -9223372036854775807L || this.j) ? 0 : i3;
                if (this.a.U0(z2, j21, j2, z4)) {
                    return 4;
                }
                long j22 = aVar.a;
                if (j22 < j7 && !z2) {
                    return z4 != 0 ? i : i2;
                }
                if (j22 > 50000) {
                    return 5;
                }
                return i3;
            }
            this.n = true;
            if (this.a.U0(z2, jO, j2, true)) {
                return 4;
            }
            if (!this.d || aVar.a >= 30000) {
                return 5;
            }
        }
        return 3;
    }

    public final boolean b(boolean z) {
        if (z && (this.e == 3 || (!this.m && this.n))) {
            this.i = -9223372036854775807L;
            return true;
        }
        if (this.i == -9223372036854775807L) {
            return false;
        }
        if (this.l.d() < this.i) {
            return true;
        }
        this.i = -9223372036854775807L;
        return false;
    }

    public final void c(boolean z) {
        this.j = z;
        long j = this.c;
        this.i = j > 0 ? this.l.d() + j : -9223372036854775807L;
    }

    public final void d() {
        this.d = true;
        this.g = jrh0.O(this.l.d());
        w4i0 w4i0Var = this.b;
        w4i0Var.d = true;
        w4i0Var.m = 0L;
        w4i0Var.p = -1L;
        w4i0Var.n = -1L;
        w4i0.b bVar = w4i0Var.b;
        if (bVar != null) {
            DisplayManager displayManager = bVar.a;
            w4i0.c cVar = w4i0Var.c;
            cVar.getClass();
            cVar.b.sendEmptyMessage(2);
            displayManager.registerDisplayListener(bVar, jrh0.p(null));
            w4i0.this.b(displayManager.getDisplay(0));
        }
        w4i0Var.d(false);
    }

    public final void e() {
        this.d = false;
        this.i = -9223372036854775807L;
        w4i0 w4i0Var = this.b;
        w4i0Var.d = false;
        w4i0.b bVar = w4i0Var.b;
        if (bVar != null) {
            bVar.a.unregisterDisplayListener(bVar);
            w4i0.c cVar = w4i0Var.c;
            cVar.getClass();
            cVar.b.sendEmptyMessage(3);
        }
        w4i0Var.a();
    }

    public final void f(int i) {
        if (i == 0) {
            this.e = 1;
            return;
        }
        if (i == 1) {
            this.e = 0;
        } else if (i == 2) {
            this.e = Math.min(this.e, 2);
        } else {
            fm20.a();
        }
    }

    public final void g(float f) {
        w4i0 w4i0Var = this.b;
        w4i0Var.f = f;
        qth qthVar = w4i0Var.a;
        qthVar.a.c();
        qthVar.b.c();
        qthVar.c = false;
        qthVar.d = -9223372036854775807L;
        qthVar.e = 0;
        w4i0Var.c();
    }

    public final void h(Surface surface) {
        this.m = surface != null;
        this.n = false;
        w4i0 w4i0Var = this.b;
        if (w4i0Var.e != surface) {
            w4i0Var.a();
            w4i0Var.e = surface;
            w4i0Var.d(true);
        }
        this.e = Math.min(this.e, 1);
    }

    public final void i(float f) {
        ly0.b(f > 0.0f);
        if (f == this.k) {
            return;
        }
        this.k = f;
        w4i0 w4i0Var = this.b;
        w4i0Var.i = f;
        w4i0Var.m = 0L;
        w4i0Var.p = -1L;
        w4i0Var.n = -1L;
        w4i0Var.d(false);
    }
}
