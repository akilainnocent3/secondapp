package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public class x5a0<T> extends oxd0 implements w5a0<T> {
    public final y5a0<T> b;
    public a<T> c;

    public static final class a<T> extends rxd0 {
        public T c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(Object obj, long j) {
            super(j);
            this.c = obj;
        }

        @Override // defpackage.rxd0
        public final void a(rxd0 rxd0Var) {
            rxd0Var.getClass();
            this.c = ((a) rxd0Var).c;
        }

        @Override // defpackage.rxd0
        public final rxd0 b() {
            return new a(this.c, n5a0.g().g());
        }

        @Override // defpackage.rxd0
        public final rxd0 c(long j) {
            return new a(this.c, n5a0.g().g());
        }
    }

    public x5a0(T t, y5a0<T> y5a0Var) {
        this.b = y5a0Var;
        c5a0 c5a0VarG = n5a0.g();
        a<T> aVar = new a<>(t, c5a0VarG.g());
        if (!(c5a0VarG instanceof s2l)) {
            aVar.b = new a(t, 1L);
        }
        this.c = aVar;
    }

    @Override // defpackage.twd0
    public final T getValue() {
        return ((a) n5a0.r(this.c, this)).c;
    }

    @Override // defpackage.w5a0
    public final y5a0<T> h() {
        return this.b;
    }

    @Override // defpackage.nxd0
    public final void n(rxd0 rxd0Var) {
        this.c = (a) rxd0Var;
    }

    @Override // defpackage.ytw
    public final void setValue(T t) {
        c5a0 c5a0VarG;
        a aVar = (a) n5a0.e(this.c);
        if (this.b.a(aVar.c, t)) {
            return;
        }
        a<T> aVar2 = this.c;
        synchronized (n5a0.c) {
            c5a0.e.getClass();
            c5a0VarG = n5a0.g();
            ((a) n5a0.m(aVar2, this, c5a0VarG, aVar)).c = t;
            Unit unit = Unit.a;
        }
        n5a0.k(c5a0VarG, this);
    }

    public final String toString() {
        return "MutableState(value=" + ((a) n5a0.e(this.c)).c + ")@" + hashCode();
    }

    @Override // defpackage.nxd0
    public final rxd0 v() {
        return this.c;
    }

    @Override // defpackage.nxd0
    public final rxd0 x(rxd0 rxd0Var, rxd0 rxd0Var2, rxd0 rxd0Var3) {
        if (this.b.a(((a) rxd0Var2).c, ((a) rxd0Var3).c)) {
            return rxd0Var2;
        }
        return null;
    }
}
