package androidx.leanback.widget;

import android.util.SparseIntArray;
import androidx.recyclerview.widget.RecyclerView;
import java.io.PrintWriter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f12588j = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public b f12590b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f12591c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f12592d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f12593e;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public f0.g[] f12596h;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object[] f12589a = new Object[1];

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f12594f = -1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f12595g = -1;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f12597i = -1;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f12598a;

        public a(int i10) {
            this.f12598a = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        int a(int i10);

        int b(int i10);

        int c(int i10, boolean z10, Object[] objArr, boolean z11);

        int d();

        void e(Object obj, int i10, int i11, int i12, int i13);

        int getCount();

        void removeItem(int i10);
    }

    public static h0 g(int i10) {
        if (i10 == 1) {
            return new t2();
        }
        x2 x2Var = new x2();
        x2Var.D(i10);
        return x2Var;
    }

    public void A(int i10, int i11) {
        while (true) {
            int i12 = this.f12595g;
            int i13 = this.f12594f;
            if (i12 >= i13 && i13 < i10) {
                int iB = this.f12590b.b(i13);
                if (!this.f12591c) {
                    if (this.f12590b.a(this.f12594f) + iB > i11) {
                        break;
                    }
                    this.f12590b.removeItem(this.f12594f);
                    this.f12594f++;
                } else {
                    if (this.f12590b.a(this.f12594f) - iB < i11) {
                        break;
                    }
                    this.f12590b.removeItem(this.f12594f);
                    this.f12594f++;
                }
            } else {
                break;
            }
        }
        C();
    }

    public void B() {
        this.f12595g = -1;
        this.f12594f = -1;
    }

    public final void C() {
        if (this.f12595g < this.f12594f) {
            B();
        }
    }

    public void D(int i10) {
        if (i10 <= 0) {
            throw new IllegalArgumentException();
        }
        if (this.f12593e == i10) {
            return;
        }
        this.f12593e = i10;
        this.f12596h = new f0.g[i10];
        for (int i11 = 0; i11 < this.f12593e; i11++) {
            this.f12596h[i11] = new f0.g();
        }
    }

    public void E(b bVar) {
        this.f12590b = bVar;
    }

    public final void F(boolean z10) {
        this.f12591c = z10;
    }

    public final void G(int i10) {
        this.f12592d = i10;
    }

    public void H(int i10) {
        this.f12597i = i10;
    }

    public boolean a() {
        return c(this.f12591c ? Integer.MAX_VALUE : Integer.MIN_VALUE, true);
    }

    public final void b(int i10) {
        c(i10, false);
    }

    public abstract boolean c(int i10, boolean z10);

    public final boolean d(int i10) {
        if (this.f12595g < 0) {
            return false;
        }
        if (this.f12591c) {
            return m(true, null) <= i10 + this.f12592d;
        }
        return k(false, null) >= i10 - this.f12592d;
    }

    public final boolean e(int i10) {
        if (this.f12595g < 0) {
            return false;
        }
        if (this.f12591c) {
            return k(false, null) >= i10 - this.f12592d;
        }
        return m(true, null) <= i10 + this.f12592d;
    }

    public abstract void h(PrintWriter printWriter);

    public void i(int[] iArr, int i10, SparseIntArray sparseIntArray) {
        int iQ = q();
        int iBinarySearch = iQ >= 0 ? Arrays.binarySearch(iArr, 0, i10, iQ) : 0;
        if (iBinarySearch < 0) {
            int iA = this.f12591c ? (this.f12590b.a(iQ) - this.f12590b.b(iQ)) - this.f12592d : this.f12590b.a(iQ) + this.f12590b.b(iQ) + this.f12592d;
            for (int i11 = (-iBinarySearch) - 1; i11 < i10; i11++) {
                int i12 = iArr[i11];
                int i13 = sparseIntArray.get(i12);
                int i14 = i13 < 0 ? 0 : i13;
                int iC = this.f12590b.c(i12, true, this.f12589a, true);
                this.f12590b.e(this.f12589a[0], i12, iC, i14, iA);
                iA = this.f12591c ? (iA - iC) - this.f12592d : iA + iC + this.f12592d;
            }
        }
        int iN = n();
        int iBinarySearch2 = iN >= 0 ? Arrays.binarySearch(iArr, 0, i10, iN) : 0;
        if (iBinarySearch2 < 0) {
            int i15 = (-iBinarySearch2) - 2;
            int iA2 = this.f12591c ? this.f12590b.a(iN) : this.f12590b.a(iN);
            while (i15 >= 0) {
                int i16 = iArr[i15];
                int i17 = sparseIntArray.get(i16);
                int i18 = i17 < 0 ? 0 : i17;
                int iC2 = this.f12590b.c(i16, false, this.f12589a, true);
                int i19 = this.f12591c ? iA2 + this.f12592d + iC2 : (iA2 - this.f12592d) - iC2;
                this.f12590b.e(this.f12589a[0], i16, iC2, i18, i19);
                i15--;
                iA2 = i19;
            }
        }
    }

    public abstract int j(boolean z10, int i10, int[] iArr);

    public final int k(boolean z10, int[] iArr) {
        return j(z10, this.f12591c ? this.f12594f : this.f12595g, iArr);
    }

    public abstract int l(boolean z10, int i10, int[] iArr);

    public final int m(boolean z10, int[] iArr) {
        return l(z10, this.f12591c ? this.f12595g : this.f12594f, iArr);
    }

    public final int n() {
        return this.f12594f;
    }

    public final f0.g[] o() {
        return p(n(), q());
    }

    public abstract f0.g[] p(int i10, int i11);

    public final int q() {
        return this.f12595g;
    }

    public abstract a r(int i10);

    public int s() {
        return this.f12593e;
    }

    public final int t(int i10) {
        a aVarR = r(i10);
        if (aVarR == null) {
            return -1;
        }
        return aVarR.f12598a;
    }

    public void u(int i10) {
        int i11;
        if (i10 >= 0 && (i11 = this.f12595g) >= 0) {
            if (i11 >= i10) {
                this.f12595g = i10 - 1;
            }
            C();
            if (n() < 0) {
                H(i10);
            }
        }
    }

    public boolean v() {
        return this.f12591c;
    }

    public final boolean w() {
        return y(this.f12591c ? Integer.MIN_VALUE : Integer.MAX_VALUE, true);
    }

    public final void x(int i10) {
        y(i10, false);
    }

    public abstract boolean y(int i10, boolean z10);

    public void z(int i10, int i11) {
        while (true) {
            int i12 = this.f12595g;
            if (i12 >= this.f12594f && i12 > i10) {
                if (!this.f12591c) {
                    if (this.f12590b.a(i12) < i11) {
                        break;
                    }
                    this.f12590b.removeItem(this.f12595g);
                    this.f12595g--;
                } else {
                    if (this.f12590b.a(i12) > i11) {
                        break;
                    }
                    this.f12590b.removeItem(this.f12595g);
                    this.f12595g--;
                }
            } else {
                break;
            }
        }
        C();
    }

    public void f(int i10, int i11, RecyclerView.p.c cVar) {
    }
}
