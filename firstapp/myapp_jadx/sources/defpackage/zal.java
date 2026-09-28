package defpackage;

import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class zal implements fwf {
    public final u580 a;
    public final boolean b;
    public final boolean c;
    public long g;
    public String i;
    public njg0 j;
    public a k;
    public boolean l;
    public boolean n;
    public final boolean[] h = new boolean[3];
    public final pbx d = new pbx(7);
    public final pbx e = new pbx(8);
    public final pbx f = new pbx(6);
    public long m = -9223372036854775807L;
    public final nsz o = new nsz();

    public static final class a {
        public final njg0 a;
        public final boolean b;
        public final boolean c;
        public final osz f;
        public byte[] g;
        public int h;
        public int i;
        public long j;
        public long l;
        public long p;
        public long q;
        public boolean r;
        public boolean s;
        public final SparseArray<qbx.m> d = new SparseArray<>();
        public final SparseArray<qbx.l> e = new SparseArray<>();
        public C1383a m = new C1383a();
        public C1383a n = new C1383a();
        public boolean k = false;
        public boolean o = false;

        /* JADX INFO: renamed from: zal$a$a, reason: collision with other inner class name */
        public static final class C1383a {
            public boolean a;
            public boolean b;
            public qbx.m c;
            public int d;
            public int e;
            public int f;
            public int g;
            public boolean h;
            public boolean i;
            public boolean j;
            public boolean k;
            public int l;
            public int m;
            public int n;
            public int o;
            public int p;
        }

        public a(njg0 njg0Var, boolean z, boolean z2) {
            this.a = njg0Var;
            this.b = z;
            this.c = z2;
            byte[] bArr = new byte[128];
            this.g = bArr;
            this.f = new osz(bArr, 0, 0);
            C1383a c1383a = this.n;
            c1383a.b = false;
            c1383a.a = false;
        }
    }

    public zal(u580 u580Var, boolean z, boolean z2) {
        this.a = u580Var;
        this.b = z;
        this.c = z2;
    }

    @Override // defpackage.fwf
    public final void a(nsz nszVar) {
        int i;
        ly0.g(this.j);
        String str = jrh0.a;
        int i2 = nszVar.b;
        int i3 = nszVar.c;
        byte[] bArr = nszVar.a;
        this.g += (long) nszVar.a();
        this.j.f(nszVar.a(), nszVar);
        while (true) {
            int iB = qbx.b(bArr, i2, i3, this.h);
            if (iB == i3) {
                this.g(bArr, i2, i3);
                return;
            }
            int i4 = bArr[iB + 3] & 31;
            if (iB <= 0 || bArr[iB - 1] != 0) {
                i = 3;
            } else {
                iB--;
                i = 4;
            }
            int i5 = iB - i2;
            if (i5 > 0) {
                this.g(bArr, i2, iB);
            }
            int i6 = i3 - iB;
            long j = this.g - ((long) i6);
            zal zalVar = this;
            zalVar.b(i6, i5 < 0 ? -i5 : 0, j, this.m);
            zalVar.h(i4, j, zalVar.m);
            i2 = iB + i;
            this = zalVar;
        }
    }

    /* JADX WARN: Code duplicated, block: B:65:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:66:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:70:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:73:0x0200  */
    /* JADX WARN: Code duplicated, block: B:92:0x023d  */
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
    public final void b(int i, int i2, long j, long j2) {
        long j3;
        int i3;
        long j4;
        long j5;
        boolean z;
        boolean z2;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        g850 g850Var = this.a.c;
        if (!this.l || this.k.c) {
            pbx pbxVar = this.d;
            pbxVar.b(i2);
            pbx pbxVar2 = this.e;
            pbxVar2.b(i2);
            boolean z4 = this.l;
            boolean z5 = pbxVar.c;
            if (z4) {
                if (z5) {
                    qbx.m mVarJ = qbx.j(pbxVar.d, 3, pbxVar.e);
                    g850Var.c(mVarJ.s);
                    this.k.d.append(mVarJ.d, mVarJ);
                    pbxVar.c();
                } else if (pbxVar2.c) {
                    osz oszVar = new osz(pbxVar2.d, 4, pbxVar2.e);
                    int iF = oszVar.f();
                    int iF2 = oszVar.f();
                    oszVar.i();
                    this.k.e.append(iF, new qbx.l(iF, iF2, oszVar.d()));
                    pbxVar2.c();
                }
            } else if (z5 && pbxVar2.c) {
                ArrayList arrayList = new ArrayList();
                arrayList.add(Arrays.copyOf(pbxVar.d, pbxVar.e));
                arrayList.add(Arrays.copyOf(pbxVar2.d, pbxVar2.e));
                qbx.m mVarJ2 = qbx.j(pbxVar.d, 3, pbxVar.e);
                int i8 = mVarJ2.s;
                osz oszVar2 = new osz(pbxVar2.d, 4, pbxVar2.e);
                int iF3 = oszVar2.f();
                int iF4 = oszVar2.f();
                oszVar2.i();
                qbx.l lVar = new qbx.l(iF3, iF4, oszVar2.d());
                int i9 = mVarJ2.a;
                int i10 = mVarJ2.b;
                int i11 = mVarJ2.c;
                byte[] bArr = j08.a;
                String str = String.format("avc1.%02X%02X%02X", Integer.valueOf(i9), Integer.valueOf(i10), Integer.valueOf(i11));
                njg0 njg0Var = this.j;
                androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                c0062a.a = this.i;
                c0062a.l = gqv.m("video/mp2t");
                c0062a.m = gqv.m("video/avc");
                c0062a.j = str;
                c0062a.t = mVarJ2.e;
                c0062a.u = mVarJ2.f;
                c0062a.C = new n58(mVarJ2.p, mVarJ2.q, mVarJ2.r, mVarJ2.h + 8, mVarJ2.i + 8, null);
                c0062a.z = mVarJ2.g;
                c0062a.p = arrayList;
                c0062a.o = i8;
                p0j0.a(c0062a, njg0Var);
                this.l = true;
                g850Var.c(i8);
                this.k.d.append(mVarJ2.d, mVarJ2);
                this.k.e.append(iF3, lVar);
                pbxVar.c();
                pbxVar2.c();
            }
        }
        pbx pbxVar3 = this.f;
        if (pbxVar3.b(i2)) {
            int iL = qbx.l(pbxVar3.e, pbxVar3.d);
            byte[] bArr2 = pbxVar3.d;
            nsz nszVar = this.o;
            nszVar.G(iL, bArr2);
            nszVar.I(4);
            g850Var.a(j2, nszVar);
        }
        a aVar = this.k;
        boolean z6 = this.l;
        if (aVar.i == 9) {
            if (z6 && aVar.o) {
                j3 = aVar.j;
                i3 = i + ((int) (j - j3));
                j4 = aVar.q;
                if (j4 != -9223372036854775807L) {
                    j5 = aVar.p;
                    if (j3 != j5) {
                        aVar.a.a(j4, aVar.r ? 1 : 0, (int) (j3 - j5), i3, null);
                    }
                }
            }
            aVar.p = aVar.j;
            aVar.q = aVar.l;
            aVar.r = false;
            aVar.o = true;
        } else if (aVar.c) {
            a.C1383a c1383a = aVar.n;
            a.C1383a c1383a2 = aVar.m;
            if (c1383a.a) {
                if (c1383a2.a) {
                    qbx.m mVar = c1383a.c;
                    ly0.g(mVar);
                    qbx.m mVar2 = c1383a2.c;
                    ly0.g(mVar2);
                    int i12 = mVar2.m;
                    if (c1383a.f != c1383a2.f || c1383a.g != c1383a2.g || c1383a.h != c1383a2.h || ((c1383a.i && c1383a2.i && c1383a.j != c1383a2.j) || (((i5 = c1383a.d) != (i6 = c1383a2.d) && (i5 == 0 || i6 == 0)) || (((i7 = mVar.m) == 0 && i12 == 0 && (c1383a.m != c1383a2.m || c1383a.n != c1383a2.n)) || ((i7 == 1 && i12 == 1 && (c1383a.o != c1383a2.o || c1383a.p != c1383a2.p)) || (z3 = c1383a.k) != c1383a2.k || (z3 && c1383a.l != c1383a2.l)))))) {
                        if (z6) {
                            j3 = aVar.j;
                            i3 = i + ((int) (j - j3));
                            j4 = aVar.q;
                            if (j4 != -9223372036854775807L) {
                                j5 = aVar.p;
                                if (j3 != j5) {
                                    aVar.a.a(j4, aVar.r ? 1 : 0, (int) (j3 - j5), i3, null);
                                }
                            }
                        }
                        aVar.p = aVar.j;
                        aVar.q = aVar.l;
                        aVar.r = false;
                        aVar.o = true;
                    }
                } else {
                    if (z6) {
                        j3 = aVar.j;
                        i3 = i + ((int) (j - j3));
                        j4 = aVar.q;
                        if (j4 != -9223372036854775807L) {
                            j5 = aVar.p;
                            if (j3 != j5) {
                                aVar.a.a(j4, aVar.r ? 1 : 0, (int) (j3 - j5), i3, null);
                            }
                        }
                    }
                    aVar.p = aVar.j;
                    aVar.q = aVar.l;
                    aVar.r = false;
                    aVar.o = true;
                }
            }
        }
        if (aVar.b) {
            a.C1383a c1383a3 = aVar.n;
            z = c1383a3.b && ((i4 = c1383a3.e) == 7 || i4 == 2);
        } else {
            z = aVar.s;
        }
        boolean z7 = aVar.r;
        int i13 = aVar.i;
        if (i13 == 5) {
            z2 = true;
        } else if (z) {
            z2 = true;
            if (i13 != 1) {
                z2 = false;
            }
        } else {
            z2 = false;
        }
        boolean z8 = z7 | z2;
        aVar.r = z8;
        aVar.i = 24;
        if (z8) {
            this.n = false;
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.g = 0L;
        this.n = false;
        this.m = -9223372036854775807L;
        qbx.a(this.h);
        this.d.c();
        this.e.c();
        this.f.c();
        this.a.c.b(0);
        a aVar = this.k;
        if (aVar != null) {
            aVar.k = false;
            aVar.o = false;
            a.C1383a c1383a = aVar.n;
            c1383a.b = false;
            c1383a.a = false;
        }
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
        ly0.g(this.j);
        String str = jrh0.a;
        if (z) {
            this.a.c.b(0);
            b(0, 0, this.g, this.m);
            h(9, this.g, this.m);
            b(0, 0, this.g, this.m);
        }
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.i = cVar.e;
        cVar.b();
        njg0 njg0VarR = m4hVar.r(cVar.d, 2);
        this.j = njg0VarR;
        this.k = new a(njg0VarR, this.b, this.c);
        this.a.a(m4hVar, cVar);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.m = j;
        this.n = ((i & 2) != 0) | this.n;
    }

    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0100  */
    /* JADX WARN: Code duplicated, block: B:59:0x0102  */
    /* JADX WARN: Code duplicated, block: B:61:0x0105  */
    /* JADX WARN: Code duplicated, block: B:64:0x010c  */
    /* JADX WARN: Code duplicated, block: B:65:0x0111  */
    /* JADX WARN: Code duplicated, block: B:68:0x0116  */
    /* JADX WARN: Code duplicated, block: B:71:0x011d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0137  */
    public final void g(byte[] bArr, int i, int i2) {
        boolean zD;
        boolean zD2;
        boolean z;
        boolean z2;
        int iF;
        int i3;
        int iE;
        int i4;
        int iG;
        int iG2;
        if (!this.l || this.k.c) {
            this.d.a(bArr, i, i2);
            this.e.a(bArr, i, i2);
        }
        this.f.a(bArr, i, i2);
        a aVar = this.k;
        SparseArray<qbx.l> sparseArray = aVar.e;
        osz oszVar = aVar.f;
        if (aVar.k) {
            int i5 = i2 - i;
            byte[] bArrCopyOf = aVar.g;
            int length = bArrCopyOf.length;
            int i6 = aVar.h + i5;
            if (length < i6) {
                bArrCopyOf = Arrays.copyOf(bArrCopyOf, i6 * 2);
                aVar.g = bArrCopyOf;
            }
            System.arraycopy(bArr, i, bArrCopyOf, aVar.h, i5);
            int i7 = aVar.h + i5;
            aVar.h = i7;
            oszVar.a = aVar.g;
            oszVar.c = 0;
            oszVar.b = i7;
            oszVar.d = 0;
            oszVar.a();
            if (oszVar.b(8)) {
                oszVar.i();
                int iE2 = oszVar.e(2);
                oszVar.j(5);
                if (oszVar.c()) {
                    oszVar.f();
                    if (oszVar.c()) {
                        int iF2 = oszVar.f();
                        if (!aVar.c) {
                            aVar.k = false;
                            a.C1383a c1383a = aVar.n;
                            c1383a.e = iF2;
                            c1383a.b = true;
                            return;
                        }
                        if (oszVar.c()) {
                            int iF3 = oszVar.f();
                            if (sparseArray.indexOfKey(iF3) < 0) {
                                aVar.k = false;
                                return;
                            }
                            qbx.l lVar = sparseArray.get(iF3);
                            SparseArray<qbx.m> sparseArray2 = aVar.d;
                            int i8 = lVar.a;
                            boolean z3 = lVar.b;
                            qbx.m mVar = sparseArray2.get(i8);
                            boolean z4 = mVar.j;
                            int i9 = mVar.n;
                            int i10 = mVar.l;
                            if (z4) {
                                if (!oszVar.b(2)) {
                                    return;
                                } else {
                                    oszVar.j(2);
                                }
                            }
                            if (oszVar.b(i10)) {
                                int iE3 = oszVar.e(i10);
                                if (!mVar.k) {
                                    if (oszVar.b(1)) {
                                        zD = oszVar.d();
                                        if (!zD) {
                                            zD2 = false;
                                        } else {
                                            if (!oszVar.b(1)) {
                                                return;
                                            }
                                            zD2 = oszVar.d();
                                            z = true;
                                        }
                                        if (aVar.i == 5) {
                                            z2 = true;
                                        } else {
                                            z2 = false;
                                        }
                                        if (z2) {
                                            iF = 0;
                                        } else if (!oszVar.c()) {
                                            return;
                                        } else {
                                            iF = oszVar.f();
                                        }
                                        i3 = mVar.m;
                                        if (i3 != 0) {
                                            if (oszVar.b(i9)) {
                                                iE = oszVar.e(i9);
                                                if (!z3 && !zD) {
                                                    if (!oszVar.c()) {
                                                        return;
                                                    }
                                                    iG2 = oszVar.g();
                                                    i4 = 0;
                                                }
                                                iG = 0;
                                                a.C1383a c1383a2 = aVar.n;
                                                c1383a2.c = mVar;
                                                c1383a2.d = iE2;
                                                c1383a2.e = iF2;
                                                c1383a2.f = iE3;
                                                c1383a2.g = iF3;
                                                c1383a2.h = zD;
                                                c1383a2.i = z;
                                                c1383a2.j = zD2;
                                                c1383a2.k = z2;
                                                c1383a2.l = iF;
                                                c1383a2.m = iE;
                                                c1383a2.n = iG2;
                                                c1383a2.o = i4;
                                                c1383a2.p = iG;
                                                c1383a2.a = true;
                                                c1383a2.b = true;
                                                aVar.k = false;
                                            }
                                            return;
                                        }
                                        if (i3 == 1 || mVar.o) {
                                            iE = 0;
                                        } else {
                                            if (!oszVar.c()) {
                                                return;
                                            }
                                            int iG3 = oszVar.g();
                                            if (!z3 || zD) {
                                                i4 = iG3;
                                                iE = 0;
                                                iG2 = 0;
                                                iG = 0;
                                            } else {
                                                if (!oszVar.c()) {
                                                    return;
                                                }
                                                iG = oszVar.g();
                                                iG2 = 0;
                                                i4 = iG3;
                                                iE = 0;
                                            }
                                        }
                                        a.C1383a c1383a3 = aVar.n;
                                        c1383a3.c = mVar;
                                        c1383a3.d = iE2;
                                        c1383a3.e = iF2;
                                        c1383a3.f = iE3;
                                        c1383a3.g = iF3;
                                        c1383a3.h = zD;
                                        c1383a3.i = z;
                                        c1383a3.j = zD2;
                                        c1383a3.k = z2;
                                        c1383a3.l = iF;
                                        c1383a3.m = iE;
                                        c1383a3.n = iG2;
                                        c1383a3.o = i4;
                                        c1383a3.p = iG;
                                        c1383a3.a = true;
                                        c1383a3.b = true;
                                        aVar.k = false;
                                        i4 = 0;
                                        iG2 = 0;
                                        iG = 0;
                                        a.C1383a c1383a4 = aVar.n;
                                        c1383a4.c = mVar;
                                        c1383a4.d = iE2;
                                        c1383a4.e = iF2;
                                        c1383a4.f = iE3;
                                        c1383a4.g = iF3;
                                        c1383a4.h = zD;
                                        c1383a4.i = z;
                                        c1383a4.j = zD2;
                                        c1383a4.k = z2;
                                        c1383a4.l = iF;
                                        c1383a4.m = iE;
                                        c1383a4.n = iG2;
                                        c1383a4.o = i4;
                                        c1383a4.p = iG;
                                        c1383a4.a = true;
                                        c1383a4.b = true;
                                        aVar.k = false;
                                    }
                                    return;
                                }
                                zD = false;
                                zD2 = false;
                                z = zD2;
                                if (aVar.i == 5) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                if (z2) {
                                    iF = 0;
                                } else if (!oszVar.c()) {
                                    return;
                                } else {
                                    iF = oszVar.f();
                                }
                                i3 = mVar.m;
                                if (i3 != 0) {
                                    if (i3 == 1) {
                                    }
                                    iE = 0;
                                } else {
                                    if (oszVar.b(i9)) {
                                        return;
                                    }
                                    iE = oszVar.e(i9);
                                    if (!z3) {
                                    }
                                }
                                i4 = 0;
                                iG2 = 0;
                                iG = 0;
                                a.C1383a c1383a5 = aVar.n;
                                c1383a5.c = mVar;
                                c1383a5.d = iE2;
                                c1383a5.e = iF2;
                                c1383a5.f = iE3;
                                c1383a5.g = iF3;
                                c1383a5.h = zD;
                                c1383a5.i = z;
                                c1383a5.j = zD2;
                                c1383a5.k = z2;
                                c1383a5.l = iF;
                                c1383a5.m = iE;
                                c1383a5.n = iG2;
                                c1383a5.o = i4;
                                c1383a5.p = iG;
                                c1383a5.a = true;
                                c1383a5.b = true;
                                aVar.k = false;
                            }
                        }
                    }
                }
            }
        }
    }

    public final void h(int i, long j, long j2) {
        if (!this.l || this.k.c) {
            this.d.d(i);
            this.e.d(i);
        }
        this.f.d(i);
        a aVar = this.k;
        boolean z = this.n;
        aVar.i = i;
        aVar.l = j2;
        aVar.j = j;
        aVar.s = z;
        if (!aVar.b || i != 1) {
            if (!aVar.c) {
                return;
            }
            if (i != 5 && i != 1 && i != 2) {
                return;
            }
        }
        a.C1383a c1383a = aVar.m;
        aVar.m = aVar.n;
        aVar.n = c1383a;
        c1383a.b = false;
        c1383a.a = false;
        aVar.h = 0;
        aVar.k = true;
    }
}
