package defpackage;

import android.util.SparseArray;
import java.io.EOFException;
import java.io.InterruptedIOException;

/* JADX INFO: loaded from: classes.dex */
public final class h830 implements k4h {
    public boolean e;
    public boolean f;
    public boolean g;
    public long h;
    public e830 i;
    public m4h j;
    public boolean k;
    public final zxf0 a = new zxf0(0);
    public final nsz c = new nsz(4096);
    public final SparseArray<a> b = new SparseArray<>();
    public final f830 d = new f830();

    public static final class a {
        public final fwf a;
        public final zxf0 b;
        public final msz c = new msz(64, new byte[64]);
        public boolean d;
        public boolean e;
        public boolean f;

        public a(fwf fwfVar, zxf0 zxf0Var) {
            this.a = fwfVar;
            this.b = zxf0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) {
        char c;
        long j;
        ?? r4;
        ?? r5;
        long jB;
        fwf xalVar;
        long j2;
        long j3;
        f830 f830Var = this.d;
        zxf0 zxf0Var = f830Var.a;
        ly0.g(this.j);
        long length = l4hVar.getLength();
        if (length != -1) {
            c = 3;
            if (!f830Var.c) {
                nsz nszVar = f830Var.b;
                if (!f830Var.e) {
                    long length2 = l4hVar.getLength();
                    int iMin = (int) Math.min(20000L, length2);
                    long j4 = length2 - ((long) iMin);
                    if (l4hVar.getPosition() != j4) {
                        k620Var.a = j4;
                        return 1;
                    }
                    nszVar.F(iMin);
                    l4hVar.e();
                    l4hVar.m(nszVar.a, 0, iMin);
                    int i = nszVar.b;
                    for (int i2 = nszVar.c - 4; i2 >= i; i2--) {
                        if (f830.b(i2, nszVar.a) == 442) {
                            nszVar.I(i2 + 4);
                            long jC = f830.c(nszVar);
                            if (jC != -9223372036854775807L) {
                                j3 = jC;
                                f830Var.g = j3;
                                f830Var.e = true;
                                return 0;
                            }
                        }
                    }
                    j3 = -9223372036854775807L;
                    f830Var.g = j3;
                    f830Var.e = true;
                    return 0;
                }
                if (f830Var.g == -9223372036854775807L) {
                    f830Var.a(l4hVar);
                    return 0;
                }
                if (f830Var.d) {
                    long j5 = f830Var.f;
                    if (j5 == -9223372036854775807L) {
                        f830Var.a(l4hVar);
                        return 0;
                    }
                    f830Var.h = zxf0Var.c(f830Var.g) - zxf0Var.b(j5);
                    f830Var.a(l4hVar);
                    return 0;
                }
                int iMin2 = (int) Math.min(20000L, l4hVar.getLength());
                if (l4hVar.getPosition() != 0) {
                    k620Var.a = 0L;
                    return 1;
                }
                nszVar.F(iMin2);
                l4hVar.e();
                l4hVar.m(nszVar.a, 0, iMin2);
                int i3 = nszVar.c;
                for (int i4 = nszVar.b; i4 < i3 - 3; i4++) {
                    if (f830.b(i4, nszVar.a) == 442) {
                        nszVar.I(i4 + 4);
                        long jC2 = f830.c(nszVar);
                        if (jC2 != -9223372036854775807L) {
                            j2 = jC2;
                            f830Var.f = j2;
                            f830Var.d = true;
                            return 0;
                        }
                    }
                }
                j2 = -9223372036854775807L;
                f830Var.f = j2;
                f830Var.d = true;
                return 0;
            }
        } else {
            c = 3;
        }
        if (this.k) {
            j = 0;
            r4 = 1;
            r5 = 0;
        } else {
            this.k = true;
            long j6 = f830Var.h;
            if (j6 != -9223372036854775807L) {
                j = 0;
                r5 = 0;
                r4 = 1;
                e830 e830Var = new e830(new b64.b(), new e830.a(zxf0Var), j6, 1 + j6, 0L, length, 188L, 1000);
                this.i = e830Var;
                this.j.k(e830Var.a);
            } else {
                j = 0;
                r4 = 1;
                r5 = 0;
                this.j.k(new p480.b(j6));
            }
        }
        e830 e830Var2 = this.i;
        if (e830Var2 != null && e830Var2.c != null) {
            return e830Var2.a(l4hVar, k620Var);
        }
        l4hVar.e();
        long jH = length != -1 ? length - l4hVar.h() : -1L;
        if (jH != -1 && jH < 4) {
            return -1;
        }
        nsz nszVar2 = this.c;
        if (!l4hVar.c(nszVar2.a, r5, 4, r4)) {
            return -1;
        }
        nszVar2.I(r5);
        int iJ = nszVar2.j();
        if (iJ == 441) {
            return -1;
        }
        if (iJ == 442) {
            l4hVar.m(nszVar2.a, r5, 10);
            nszVar2.I(9);
            l4hVar.l((nszVar2.w() & 7) + 14);
            return r5;
        }
        if (iJ == 443) {
            l4hVar.m(nszVar2.a, r5, 2);
            nszVar2.I(r5);
            l4hVar.l(nszVar2.C() + 6);
            return r5;
        }
        if (((iJ & (-256)) >> 8) != r4) {
            l4hVar.l(r4);
            return r5;
        }
        int i5 = iJ & 255;
        SparseArray<a> sparseArray = this.b;
        a aVar = sparseArray.get(i5);
        if (!this.e) {
            if (aVar == null) {
                if (i5 == 189) {
                    xalVar = new o5("video/mp2p");
                    this.f = r4;
                    this.h = l4hVar.getPosition();
                } else if ((iJ & 224) == 192) {
                    xalVar = new j8w(null, r5, "video/mp2p");
                    this.f = r4;
                    this.h = l4hVar.getPosition();
                } else if ((iJ & 240) == 224) {
                    xalVar = new xal(null, "video/mp2p");
                    this.g = r4;
                    this.h = l4hVar.getPosition();
                } else {
                    xalVar = null;
                }
                if (xalVar != null) {
                    xalVar.e(this.j, new wxg0.c(i5, 256));
                    aVar = new a(xalVar, this.a);
                    sparseArray.put(i5, aVar);
                }
            }
            if (l4hVar.getPosition() > ((this.f && this.g) ? this.h + 8192 : 1048576L)) {
                this.e = r4;
                this.j.n();
            }
        }
        l4hVar.m(nszVar2.a, r5, 2);
        nszVar2.I(r5);
        int iC = nszVar2.C() + 6;
        if (aVar == null) {
            l4hVar.l(iC);
            return r5;
        }
        nszVar2.F(iC);
        l4hVar.readFully(nszVar2.a, r5, iC);
        nszVar2.I(6);
        fwf fwfVar = aVar.a;
        msz mszVar = aVar.c;
        nszVar2.h(mszVar.a, r5, 3);
        mszVar.m(r5);
        mszVar.o(8);
        aVar.d = mszVar.f();
        aVar.e = mszVar.f();
        mszVar.o(6);
        nszVar2.h(mszVar.a, r5, mszVar.g(8));
        mszVar.m(r5);
        zxf0 zxf0Var2 = aVar.b;
        if (aVar.d) {
            mszVar.o(4);
            long jG = ((long) mszVar.g(3)) << 30;
            mszVar.o(r4);
            long jG2 = jG | ((long) (mszVar.g(15) << 15));
            mszVar.o(r4);
            long jG3 = jG2 | ((long) mszVar.g(15));
            mszVar.o(r4);
            if (!aVar.f && aVar.e) {
                mszVar.o(4);
                long jG4 = ((long) mszVar.g(3)) << 30;
                mszVar.o(r4);
                long jG5 = jG4 | ((long) (mszVar.g(15) << 15));
                mszVar.o(r4);
                long jG6 = ((long) mszVar.g(15)) | jG5;
                mszVar.o(r4);
                zxf0Var2.b(jG6);
                aVar.f = r4;
            }
            jB = zxf0Var2.b(jG3);
        } else {
            jB = j;
        }
        fwfVar.f(4, jB);
        fwfVar.a(nszVar2);
        fwfVar.d(r5);
        nszVar2.H(nszVar2.a.length);
        return r5;
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        byte[] bArr = new byte[14];
        jcd jcdVar = (jcd) l4hVar;
        jcdVar.c(bArr, 0, 14, false);
        if (442 == (((bArr[0] & 255) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255)) && (bArr[4] & 196) == 68 && (bArr[6] & 4) == 4 && (bArr[8] & 4) == 4 && (bArr[9] & 1) == 1 && (bArr[12] & 3) == 3) {
            jcdVar.n(bArr[13] & 7, false);
            jcdVar.c(bArr, 0, 3, false);
            if (1 == (((bArr[0] & 255) << 16) | ((bArr[1] & 255) << 8) | (bArr[2] & 255))) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        long j3;
        SparseArray<a> sparseArray = this.b;
        zxf0 zxf0Var = this.a;
        synchronized (zxf0Var) {
            j3 = zxf0Var.b;
        }
        boolean z = j3 == -9223372036854775807L;
        if (!z) {
            long jD = zxf0Var.d();
            z = (jD == -9223372036854775807L || jD == 0 || jD == j2) ? false : true;
        }
        if (z) {
            zxf0Var.f(j2);
        }
        e830 e830Var = this.i;
        if (e830Var != null) {
            e830Var.c(j2);
        }
        for (int i = 0; i < sparseArray.size(); i++) {
            a aVarValueAt = sparseArray.valueAt(i);
            aVarValueAt.f = false;
            aVarValueAt.a.c();
        }
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        this.j = m4hVar;
    }

    @Override // defpackage.k4h
    public final void release() {
    }
}
