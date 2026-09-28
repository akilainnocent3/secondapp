package defpackage;

import androidx.compose.runtime.c;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
public final class ek40<N> implements fv0<N> {
    public final lsw a = new lsw();
    public final etw<Object> b = new etw<>((Object) null);
    public final N c;

    public ek40(N n) {
        this.c = n;
    }

    @Override // defpackage.fv0
    public final void a(Object obj, Function2 function2) {
        this.a.a(7);
        etw<Object> etwVar = this.b;
        etwVar.g(function2);
        etwVar.g(obj);
    }

    @Override // defpackage.fv0
    public final N b() {
        return this.c;
    }

    @Override // defpackage.fv0
    public final void c(int i, int i2, int i3) {
        lsw lswVar = this.a;
        lswVar.a(3);
        lswVar.a(i);
        lswVar.a(i2);
        lswVar.a(i3);
    }

    @Override // defpackage.fv0
    public final void clear() {
        this.a.a(4);
    }

    @Override // defpackage.fv0
    public final void d(int i, int i2) {
        lsw lswVar = this.a;
        lswVar.a(2);
        lswVar.a(i);
        lswVar.a(i2);
    }

    @Override // defpackage.fv0
    public final void e(int i, N n) {
        lsw lswVar = this.a;
        lswVar.a(6);
        lswVar.a(i);
        this.b.g(n);
    }

    @Override // defpackage.fv0
    public final void g(int i, N n) {
        lsw lswVar = this.a;
        lswVar.a(5);
        lswVar.a(i);
        this.b.g(n);
    }

    @Override // defpackage.fv0
    public final void h(N n) {
        this.a.a(1);
        this.b.g(n);
    }

    @Override // defpackage.fv0
    public final void i() {
        this.a.a(8);
    }

    @Override // defpackage.fv0
    public final void j() {
        this.a.a(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void k(fv0<N> fv0Var, a350 a350Var) {
        Exception exc;
        int i;
        lsw lswVar = this.a;
        int i2 = lswVar.b;
        etw etwVar = new etw((Object) null);
        fv0Var.getClass();
        int i3 = 0;
        int i4 = 0;
        while (true) {
            etw<Object> etwVar2 = this.b;
            if (i3 >= i2) {
                if (i4 != etwVar2.b) {
                    c.b("Applier operation size mismatch");
                }
                etwVar2.i();
                lswVar.b = 0;
                fv0Var.f();
                return;
            }
            int i5 = i3 + 1;
            try {
                try {
                    switch (lswVar.c(i3)) {
                        case 0:
                            fv0Var.j();
                            i3 = i5;
                            break;
                        case 1:
                            int i6 = i4 + 1;
                            fv0Var.h(etwVar2.b(i4));
                            i4 = i6;
                            i3 = i5;
                            break;
                        case 2:
                            int i7 = i3 + 2;
                            i3 += 3;
                            fv0Var.d(lswVar.c(i5), lswVar.c(i7));
                            break;
                        case 3:
                            int i8 = i3 + 2;
                            try {
                                int i9 = i3 + 3;
                                try {
                                    i3 += 4;
                                    fv0Var.c(lswVar.c(i5), lswVar.c(i8), lswVar.c(i9));
                                } catch (Exception e) {
                                    exc = e;
                                    i3 = i9;
                                }
                            } catch (Exception e2) {
                                exc = e2;
                                i3 = i8;
                            }
                            break;
                        case 4:
                            fv0Var.clear();
                            i3 = i5;
                            break;
                        case 5:
                            i3 += 2;
                            i = i4 + 1;
                            fv0Var.g(lswVar.c(i5), etwVar2.b(i4));
                            i4 = i;
                            break;
                        case 6:
                            i3 += 2;
                            try {
                                i = i4 + 1;
                                fv0Var.e(lswVar.c(i5), etwVar2.b(i4));
                                i4 = i;
                            } catch (Exception e3) {
                                exc = e3;
                            }
                            break;
                        case 7:
                            int i10 = i4 + 1;
                            Object objB = etwVar2.b(i4);
                            objB.getClass();
                            y8h0.d(2, objB);
                            i4 += 2;
                            fv0Var.a(etwVar2.b(i10), (Function2) objB);
                            i3 = i5;
                            break;
                        case 8:
                            Object objB2 = fv0Var.b();
                            if (objB2 instanceof uga) {
                                uga ugaVar = (uga) objB2;
                                if (a350Var.f.j(ugaVar)) {
                                    ugaVar.c();
                                }
                            }
                            etwVar.g(objB2);
                            fv0Var.i();
                            i3 = i5;
                            break;
                        default:
                            i3 = i5;
                            break;
                    }
                } catch (Exception e4) {
                    exc = e4;
                    i3 = i5;
                }
            } catch (Throwable th) {
                fv0Var.f();
                throw th;
            }
            exc = e3;
            throw new yga(etwVar2, etwVar, lswVar, i3, exc);
        }
    }
}
