package defpackage;

import java.util.ArrayList;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes8.dex */
public abstract class uex implements b5d, dma {
    public final ArrayList<String> a = new ArrayList<>();
    public boolean b;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final String A() {
        return O(R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final int B(pd80 pd80Var) {
        pd80Var.getClass();
        return I(R(), pd80Var);
    }

    public abstract char C(String str);

    @Override // defpackage.dma
    public final boolean E(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return a(Q(pd80Var, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final byte F() {
        return w(R());
    }

    @Override // defpackage.dma
    public final double G(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return H(Q(pd80Var, i));
    }

    public abstract double H(String str);

    public abstract int I(String str, pd80 pd80Var);

    public abstract float J(String str);

    public abstract b5d K(String str, pd80 pd80Var);

    public abstract int L(String str);

    public abstract long M(String str);

    public abstract short N(String str);

    public abstract String O(String str);

    public String P(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return pd80Var.e(i);
    }

    public final String Q(pd80 pd80Var, int i) {
        pd80Var.getClass();
        String strP = P(pd80Var, i);
        strP.getClass();
        return strP;
    }

    public final String R() {
        ArrayList<String> arrayList = this.a;
        String strRemove = arrayList.remove(b.j(arrayList));
        this.b = true;
        return strRemove;
    }

    public final String S() {
        ArrayList<String> arrayList = this.a;
        return arrayList.isEmpty() ? "$" : CollectionsKt.a0(arrayList, ".", "$.", null, null, 60);
    }

    public abstract boolean a(String str);

    @Override // defpackage.dma
    public final b5d e(wv20 wv20Var, int i) {
        return K(Q(wv20Var, i), wv20Var.g(i));
    }

    @Override // defpackage.dma
    public final char f(wv20 wv20Var, int i) {
        return C(Q(wv20Var, i));
    }

    @Override // defpackage.dma
    public final float g(wv20 wv20Var, int i) {
        return J(Q(wv20Var, i));
    }

    @Override // defpackage.dma
    public final byte i(wv20 wv20Var, int i) {
        return w(Q(wv20Var, i));
    }

    @Override // defpackage.dma
    public final String j(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return O(Q(pd80Var, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final int k() {
        return L(R());
    }

    @Override // defpackage.dma
    public final int m(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return L(Q(pd80Var, i));
    }

    @Override // defpackage.dma
    public final <T> T n(pd80 pd80Var, int i, tae<? extends T> taeVar, T t) {
        pd80Var.getClass();
        taeVar.getClass();
        this.a.add(Q(pd80Var, i));
        T t2 = (taeVar.getDescriptor().b() || D()) ? (T) z(taeVar) : null;
        if (!this.b) {
            R();
        }
        this.b = false;
        return t2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final long o() {
        return M(R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final short p() {
        return N(R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final float q() {
        return J(R());
    }

    @Override // defpackage.dma
    public final long r(pd80 pd80Var, int i) {
        pd80Var.getClass();
        return M(Q(pd80Var, i));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final double s() {
        return H(R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final boolean t() {
        return a(R());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.b5d
    public final char u() {
        return C(R());
    }

    public abstract byte w(String str);

    @Override // defpackage.dma
    public final short x(wv20 wv20Var, int i) {
        return N(Q(wv20Var, i));
    }

    @Override // defpackage.dma
    public final <T> T y(pd80 pd80Var, int i, tae<? extends T> taeVar, T t) {
        pd80Var.getClass();
        taeVar.getClass();
        this.a.add(Q(pd80Var, i));
        taeVar.getClass();
        T t2 = (T) z(taeVar);
        if (!this.b) {
            R();
        }
        this.b = false;
        return t2;
    }

    @Override // defpackage.b5d
    public abstract <T> T z(tae<? extends T> taeVar);
}
