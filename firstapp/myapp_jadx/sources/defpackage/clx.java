package defpackage;

import java.util.Arrays;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class clx extends wtw {
    public final wtw p;
    public boolean q;

    public clx(long j, i5a0 i5a0Var, Function1<Object, Unit> function1, Function1<Object, Unit> function2, wtw wtwVar) {
        super(j, i5a0Var, function1, function2);
        this.p = wtwVar;
        wtwVar.k();
    }

    @Override // defpackage.wtw, defpackage.c5a0
    public final void c() {
        if (this.c) {
            return;
        }
        super.c();
        if (this.q) {
            return;
        }
        this.q = true;
        this.p.l();
    }

    @Override // defpackage.wtw
    public final e5a0 w() {
        clx clxVar;
        wtw wtwVar = this.p;
        if (wtwVar.n || wtwVar.c) {
            return new e5a0.a(this);
        }
        stw<nxd0> stwVar = this.i;
        long j = this.b;
        HashMap mapL = stwVar != null ? n5a0.l(wtwVar.g(), this, this.p.d()) : null;
        Object obj = n5a0.c;
        synchronized (obj) {
            try {
                n5a0.u(this);
                if (stwVar == null || stwVar.d == 0) {
                    clxVar = this;
                    clxVar.a();
                    Unit unit = Unit.a;
                } else {
                    clxVar = this;
                    e5a0 e5a0VarZ = clxVar.z(this.p.g(), stwVar, mapL, this.p.d());
                    if (!Intrinsics.g(e5a0VarZ, e5a0.b.a)) {
                        return e5a0VarZ;
                    }
                    stw<nxd0> stwVarX = clxVar.p.x();
                    if (stwVarX != null) {
                        stwVarX.j(stwVar);
                    } else {
                        clxVar.p.B(stwVar);
                        clxVar.i = null;
                    }
                }
                if (Intrinsics.i(clxVar.p.g(), j) < 0) {
                    clxVar.p.v();
                }
                wtw wtwVar2 = clxVar.p;
                wtwVar2.r(wtwVar2.d().c(j).b(clxVar.k));
                clxVar.p.A(j);
                wtw wtwVar3 = clxVar.p;
                int i = clxVar.d;
                clxVar.d = -1;
                if (i >= 0) {
                    int[] iArr = wtwVar3.l;
                    iArr.getClass();
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i;
                    wtwVar3.l = iArrCopyOf;
                } else {
                    wtwVar3.getClass();
                }
                wtw wtwVar4 = clxVar.p;
                i5a0 i5a0Var = clxVar.k;
                wtwVar4.getClass();
                synchronized (obj) {
                    wtwVar4.k = wtwVar4.k.e(i5a0Var);
                    Unit unit2 = Unit.a;
                    wtw wtwVar5 = clxVar.p;
                    int[] iArrO = clxVar.l;
                    wtwVar5.getClass();
                    if (iArrO.length != 0) {
                        int[] iArr2 = wtwVar5.l;
                        if (iArr2.length != 0) {
                            iArrO = xx0.o(iArr2, iArrO);
                        }
                        wtwVar5.l = iArrO;
                    }
                }
                clxVar.n = true;
                if (!clxVar.q) {
                    clxVar.q = true;
                    clxVar.p.l();
                }
                return e5a0.b.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
