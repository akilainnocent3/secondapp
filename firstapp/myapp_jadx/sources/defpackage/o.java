package defpackage;

import androidx.compose.runtime.m;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.b;
import sun.misc.Unsafe;

/* JADX INFO: loaded from: classes4.dex */
public abstract class o implements f4g, fma {
    public Object a;

    public o(int i) {
        switch (i) {
            case 1:
                msw mswVar = hwo.a;
                this.a = new msw();
                break;
            case 2:
                this.a = new ArrayList();
                break;
            case 3:
                this.a = m.b(Boolean.FALSE);
                break;
        }
    }

    @Override // defpackage.fma
    public void A(int i, int i2, pd80 pd80Var) {
        pd80Var.getClass();
        O(i2, a0(pd80Var, i));
    }

    @Override // defpackage.fma
    public void B(wv20 wv20Var, int i, char c) {
        J(a0(wv20Var, i), c);
    }

    @Override // defpackage.f4g
    public void C(int i) {
        O(i, c0());
    }

    @Override // defpackage.fma
    public void D(pd80 pd80Var, int i, he80 he80Var, Object obj) {
        pd80Var.getClass();
        he80Var.getClass();
        ((ArrayList) this.a).add(a0(pd80Var, i));
        if (he80Var.getDescriptor().b()) {
            x(he80Var, obj);
        } else if (obj == null) {
            t();
        } else {
            z();
            x(he80Var, obj);
        }
    }

    @Override // defpackage.f4g
    public void E(String str) {
        str.getClass();
        R(c0(), str);
    }

    public abstract byte[] F(byte[] bArr);

    public abstract String G(pd80 pd80Var, int i);

    public abstract void H(Object obj, boolean z);

    public abstract void I(Object obj, byte b);

    public abstract void J(Object obj, char c);

    public abstract void K(Object obj, double d);

    public abstract void L(Object obj, pd80 pd80Var, int i);

    public abstract void M(Object obj, float f);

    public abstract f4g N(Object obj, pd80 pd80Var);

    public abstract void O(int i, Object obj);

    public abstract void P(Object obj, long j);

    public abstract void Q(Object obj, short s);

    public abstract void R(Object obj, String str);

    public abstract byte[] S(byte[] bArr);

    public abstract void T(pd80 pd80Var);

    public abstract pxr U(int i, int i2, int i3, long j);

    public abstract Object V();

    public abstract t5g W();

    public String X() {
        String str = (String) this.a;
        if (str != null) {
            return str;
        }
        String strE = vn20.e(W(), Y());
        if (strE == null) {
            return null;
        }
        this.a = strE;
        return strE;
    }

    public abstract String Y();

    public List Z(oxr oxrVar, int i, long j) {
        msw mswVar = (msw) this.a;
        List list = (List) mswVar.b(i);
        if (list != null) {
            return list;
        }
        List<vhv> listE = oxrVar.e(i);
        int size = listE.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(listE.get(i2).d0(j));
        }
        mswVar.h(i, arrayList);
        return arrayList;
    }

    public String a0(pd80 pd80Var, int i) {
        pd80Var.getClass();
        String strG = G(pd80Var, i);
        strG.getClass();
        return strG;
    }

    @Override // defpackage.fma
    public void b(pd80 pd80Var) {
        pd80Var.getClass();
        if (!((ArrayList) this.a).isEmpty()) {
            c0();
        }
        T(pd80Var);
    }

    public abstract Object b0();

    public Object c0() {
        ArrayList arrayList = (ArrayList) this.a;
        if (arrayList.isEmpty()) {
            throw new ee80("No tag in stack for requested element");
        }
        return arrayList.remove(b.j(arrayList));
    }

    public abstract void d0(Object obj);

    @Override // defpackage.f4g
    public void e(double d) {
        K(c0(), d);
    }

    public abstract void e0(dtg0 dtg0Var);

    @Override // defpackage.fma
    public void f(pd80 pd80Var, int i, long j) {
        pd80Var.getClass();
        P(a0(pd80Var, i), j);
    }

    public abstract void f0();

    @Override // defpackage.f4g
    public void g(byte b) {
        I(c0(), b);
    }

    public abstract void g0(Object obj, long j, byte b);

    public abstract boolean h0(Object obj, long j);

    @Override // defpackage.fma
    public void i(pd80 pd80Var, int i, boolean z) {
        pd80Var.getClass();
        H(a0(pd80Var, i), z);
    }

    public abstract void i0(Object obj, long j, boolean z);

    @Override // defpackage.fma
    public void j(pd80 pd80Var, int i, double d) {
        pd80Var.getClass();
        K(a0(pd80Var, i), d);
    }

    public abstract float j0(Object obj, long j);

    @Override // defpackage.fma
    public void k(wv20 wv20Var, int i, byte b) {
        I(a0(wv20Var, i), b);
    }

    public abstract void k0(Object obj, long j, float f);

    @Override // defpackage.fma
    public void l(wv20 wv20Var, int i, float f) {
        M(a0(wv20Var, i), f);
    }

    public abstract double l0(Object obj, long j);

    @Override // defpackage.f4g
    public void m(pd80 pd80Var, int i) {
        pd80Var.getClass();
        L(c0(), pd80Var, i);
    }

    public abstract void m0(Object obj, long j, double d);

    @Override // defpackage.fma
    public void n(wv20 wv20Var, int i, short s) {
        Q(a0(wv20Var, i), s);
    }

    @Override // defpackage.fma
    public void o(pd80 pd80Var, int i, String str) {
        pd80Var.getClass();
        str.getClass();
        R(a0(pd80Var, i), str);
    }

    @Override // defpackage.f4g
    public void p(long j) {
        P(c0(), j);
    }

    @Override // defpackage.fma
    public void q(pd80 pd80Var, int i, he80 he80Var, Object obj) {
        pd80Var.getClass();
        he80Var.getClass();
        ((ArrayList) this.a).add(a0(pd80Var, i));
        x(he80Var, obj);
    }

    @Override // defpackage.fma
    public f4g r(wv20 wv20Var, int i) {
        return N(a0(wv20Var, i), wv20Var.g(i));
    }

    @Override // defpackage.f4g
    public void u(short s) {
        Q(c0(), s);
    }

    @Override // defpackage.f4g
    public void v(boolean z) {
        H(c0(), z);
    }

    @Override // defpackage.f4g
    public void w(float f) {
        M(c0(), f);
    }

    @Override // defpackage.f4g
    public abstract void x(he80 he80Var, Object obj);

    @Override // defpackage.f4g
    public void y(char c) {
        J(c0(), c);
    }

    public o(Unsafe unsafe) {
        this.a = unsafe;
    }
}
