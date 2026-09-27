package androidx.leanback.widget;

import java.io.PrintWriter;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public abstract class w2 extends h0 {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public f0.f<a> f13131k = new f0.f<>(64);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13132l = -1;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public Object f13133m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13134n;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a extends h0.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13135b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13136c;

        public a(int i10, int i11, int i12) {
            super(i10);
            this.f13135b = i11;
            this.f13136c = i12;
        }
    }

    public final boolean I(int i10, boolean z10) {
        int i11;
        int iA;
        int i12;
        if (this.f13131k.m() == 0) {
            return false;
        }
        int count = this.f12590b.getCount();
        int i13 = this.f12595g;
        if (i13 >= 0) {
            i11 = i13 + 1;
            iA = this.f12590b.a(i13);
        } else {
            int i14 = this.f12597i;
            i11 = i14 != -1 ? i14 : 0;
            if (i11 > N() + 1 || i11 < M()) {
                this.f13131k.c();
                return false;
            }
            if (i11 > N()) {
                return false;
            }
            iA = Integer.MAX_VALUE;
        }
        int iN = N();
        int i15 = i11;
        while (i15 < count && i15 <= iN) {
            a aVarR = r(i15);
            if (iA != Integer.MAX_VALUE) {
                iA += aVarR.f13135b;
            }
            int i16 = iA;
            int i17 = aVarR.f12598a;
            int iC = this.f12590b.c(i15, true, this.f12589a, false);
            if (iC != aVarR.f13136c) {
                aVarR.f13136c = iC;
                this.f13131k.k(iN - i15);
                i12 = i15;
            } else {
                i12 = iN;
            }
            this.f12595g = i15;
            if (this.f12594f < 0) {
                this.f12594f = i15;
            }
            this.f12590b.e(this.f12589a[0], i15, iC, i17, i16);
            if (!z10 && d(i10)) {
                return true;
            }
            int iA2 = i16 == Integer.MAX_VALUE ? this.f12590b.a(i15) : i16;
            if (i17 == this.f12593e - 1 && z10) {
                return true;
            }
            i15++;
            iN = i12;
            iA = iA2;
        }
        return false;
    }

    public final int J(int i10, int i11, int i12) {
        int iA;
        int i13 = this.f12595g;
        if (i13 >= 0 && (i13 != N() || this.f12595g != i10 - 1)) {
            throw new IllegalStateException();
        }
        int i14 = this.f12595g;
        if (i14 < 0) {
            iA = (this.f13131k.m() <= 0 || i10 != N() + 1) ? 0 : L(i11);
        } else {
            iA = i12 - this.f12590b.a(i14);
        }
        a aVar = new a(i11, iA, 0);
        this.f13131k.b(aVar);
        Object obj = this.f13133m;
        if (obj != null) {
            aVar.f13136c = this.f13134n;
            this.f13133m = null;
        } else {
            aVar.f13136c = this.f12590b.c(i10, true, this.f12589a, false);
            obj = this.f12589a[0];
        }
        Object obj2 = obj;
        if (this.f13131k.m() == 1) {
            this.f12595g = i10;
            this.f12594f = i10;
            this.f13132l = i10;
        } else {
            int i15 = this.f12595g;
            if (i15 < 0) {
                this.f12595g = i10;
                this.f12594f = i10;
            } else {
                this.f12595g = i15 + 1;
            }
        }
        this.f12590b.e(obj2, i10, aVar.f13136c, i11, i12);
        return aVar.f13136c;
    }

    public abstract boolean K(int i10, boolean z10);

    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0039 -> B:17:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final int L(int r3) {
        /*
            r2 = this;
            int r0 = r2.N()
        L4:
            int r1 = r2.f13132l
            if (r0 < r1) goto L14
            androidx.leanback.widget.w2$a r1 = r2.r(r0)
            int r1 = r1.f12598a
            if (r1 != r3) goto L11
            goto L18
        L11:
            int r0 = r0 + (-1)
            goto L4
        L14:
            int r0 = r2.N()
        L18:
            boolean r3 = r2.v()
            if (r3 == 0) goto L28
            androidx.leanback.widget.w2$a r3 = r2.r(r0)
            int r3 = r3.f13136c
            int r3 = -r3
            int r1 = r2.f12592d
            goto L3f
        L28:
            androidx.leanback.widget.w2$a r3 = r2.r(r0)
            int r3 = r3.f13136c
            int r1 = r2.f12592d
            int r3 = r3 + r1
        L31:
            int r0 = r0 + 1
            int r1 = r2.N()
            if (r0 > r1) goto L41
            androidx.leanback.widget.w2$a r1 = r2.r(r0)
            int r1 = r1.f13135b
        L3f:
            int r3 = r3 - r1
            goto L31
        L41:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.leanback.widget.w2.L(int):int");
    }

    public final int M() {
        return this.f13132l;
    }

    public final int N() {
        return (this.f13132l + this.f13131k.m()) - 1;
    }

    @Override // androidx.leanback.widget.h0
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public final a r(int i10) {
        int i11 = i10 - this.f13132l;
        if (i11 < 0 || i11 >= this.f13131k.m()) {
            return null;
        }
        return this.f13131k.e(i11);
    }

    public final int P() {
        return this.f13131k.m();
    }

    public final boolean Q(int i10, boolean z10) {
        int i11;
        int iA;
        int i12;
        if (this.f13131k.m() == 0) {
            return false;
        }
        int i13 = this.f12594f;
        if (i13 >= 0) {
            iA = this.f12590b.a(i13);
            i12 = r(this.f12594f).f13135b;
            i11 = this.f12594f - 1;
        } else {
            int i14 = this.f12597i;
            i11 = i14 != -1 ? i14 : 0;
            if (i11 > N() || i11 < M() - 1) {
                this.f13131k.c();
                return false;
            }
            if (i11 < M()) {
                return false;
            }
            iA = Integer.MAX_VALUE;
            i12 = 0;
        }
        int iMax = Math.max(this.f12590b.d(), this.f13132l);
        for (int i15 = i11; i15 >= iMax; i15--) {
            a aVarR = r(i15);
            int i16 = aVarR.f12598a;
            int iC = this.f12590b.c(i15, false, this.f12589a, false);
            if (iC != aVarR.f13136c) {
                this.f13131k.l((i15 + 1) - this.f13132l);
                this.f13132l = this.f12594f;
                this.f13133m = this.f12589a[0];
                this.f13134n = iC;
                return false;
            }
            this.f12594f = i15;
            if (this.f12595g < 0) {
                this.f12595g = i15;
            }
            this.f12590b.e(this.f12589a[0], i15, iC, i16, iA - i12);
            if (!z10 && e(i10)) {
                return true;
            }
            iA = this.f12590b.a(i15);
            i12 = aVarR.f13135b;
            if (i16 == 0 && z10) {
                return true;
            }
        }
        return false;
    }

    public final int R(int i10, int i11, int i12) {
        int i13 = this.f12594f;
        if (i13 >= 0 && (i13 != M() || this.f12594f != i10 + 1)) {
            throw new IllegalStateException();
        }
        int i14 = this.f13132l;
        a aVarR = i14 >= 0 ? r(i14) : null;
        int iA = this.f12590b.a(this.f13132l);
        a aVar = new a(i11, 0, 0);
        this.f13131k.a(aVar);
        Object obj = this.f13133m;
        if (obj != null) {
            aVar.f13136c = this.f13134n;
            this.f13133m = null;
        } else {
            aVar.f13136c = this.f12590b.c(i10, false, this.f12589a, false);
            obj = this.f12589a[0];
        }
        Object obj2 = obj;
        this.f12594f = i10;
        this.f13132l = i10;
        if (this.f12595g < 0) {
            this.f12595g = i10;
        }
        int i15 = !this.f12591c ? i12 - aVar.f13136c : i12 + aVar.f13136c;
        if (aVarR != null) {
            aVarR.f13135b = iA - i15;
        }
        this.f12590b.e(obj2, i10, aVar.f13136c, i11, i15);
        return aVar.f13136c;
    }

    public abstract boolean S(int i10, boolean z10);

    @Override // androidx.leanback.widget.h0
    public final boolean c(int i10, boolean z10) {
        if (this.f12590b.getCount() == 0) {
            return false;
        }
        if (!z10 && d(i10)) {
            return false;
        }
        try {
            if (I(i10, z10)) {
                return true;
            }
            return K(i10, z10);
        } finally {
            this.f12589a[0] = null;
            this.f13133m = null;
        }
    }

    @Override // androidx.leanback.widget.h0
    public final void h(PrintWriter printWriter) {
        int iM = this.f13131k.m();
        for (int i10 = 0; i10 < iM; i10++) {
            printWriter.print("<" + (this.f13132l + i10) + "," + this.f13131k.e(i10).f12598a + ">");
            printWriter.print(" ");
            printWriter.println();
        }
    }

    @Override // androidx.leanback.widget.h0
    public final f0.g[] p(int i10, int i11) {
        for (int i12 = 0; i12 < this.f12593e; i12++) {
            this.f12596h[i12].c();
        }
        if (i10 >= 0) {
            while (i10 <= i11) {
                f0.g gVar = this.f12596h[r(i10).f12598a];
                if (gVar.m() <= 0 || gVar.g() != i10 - 1) {
                    gVar.b(i10);
                    gVar.b(i10);
                } else {
                    gVar.j();
                    gVar.b(i10);
                }
                i10++;
            }
        }
        return this.f12596h;
    }

    @Override // androidx.leanback.widget.h0
    public void u(int i10) {
        super.u(i10);
        this.f13131k.k((N() - i10) + 1);
        if (this.f13131k.m() == 0) {
            this.f13132l = -1;
        }
    }

    @Override // androidx.leanback.widget.h0
    public final boolean y(int i10, boolean z10) {
        if (this.f12590b.getCount() == 0) {
            return false;
        }
        if (!z10 && e(i10)) {
            return false;
        }
        try {
            if (Q(i10, z10)) {
                return true;
            }
            return S(i10, z10);
        } finally {
            this.f12589a[0] = null;
            this.f13133m = null;
        }
    }
}
