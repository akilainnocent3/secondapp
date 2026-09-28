package defpackage;

import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class abl implements fwf {
    public final u580 a;
    public String b;
    public njg0 c;
    public a d;
    public boolean e;
    public long l;
    public final boolean[] f = new boolean[3];
    public final pbx g = new pbx(32);
    public final pbx h = new pbx(33);
    public final pbx i = new pbx(34);
    public final pbx j = new pbx(39);
    public final pbx k = new pbx(40);
    public long m = -9223372036854775807L;
    public final nsz n = new nsz();

    public static final class a {
        public final njg0 a;
        public long b;
        public boolean c;
        public int d;
        public long e;
        public boolean f;
        public boolean g;
        public boolean h;
        public boolean i;
        public boolean j;
        public long k;
        public long l;
        public boolean m;

        public a(njg0 njg0Var) {
            this.a = njg0Var;
        }

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
        public final void a(int i) {
            long j = this.l;
            if (j != -9223372036854775807L) {
                long j2 = this.b;
                long j3 = this.k;
                if (j2 == j3) {
                    return;
                }
                int i2 = (int) (j2 - j3);
                this.a.a(j, this.m ? 1 : 0, i2, i, null);
            }
        }
    }

    public abl(u580 u580Var) {
        this.a = u580Var;
    }

    @Override // defpackage.fwf
    public final void a(nsz nszVar) {
        int i;
        ly0.g(this.c);
        String str = jrh0.a;
        while (nszVar.a() > 0) {
            int i2 = nszVar.b;
            int i3 = nszVar.c;
            byte[] bArr = nszVar.a;
            this.l += (long) nszVar.a();
            this.c.f(nszVar.a(), nszVar);
            while (i2 < i3) {
                int iB = qbx.b(bArr, i2, i3, this.f);
                if (iB == i3) {
                    g(bArr, i2, i3);
                    return;
                }
                int i4 = (bArr[iB + 3] & 126) >> 1;
                if (iB <= 0 || bArr[iB - 1] != 0) {
                    i = 3;
                } else {
                    iB--;
                    i = 4;
                }
                int i5 = iB;
                int i6 = i;
                int i7 = i5 - i2;
                if (i7 > 0) {
                    g(bArr, i2, i5);
                }
                int i8 = i3 - i5;
                long j = this.l - ((long) i8);
                b(i8, i7 < 0 ? -i7 : 0, j, this.m);
                h(i8, i4, j, this.m);
                i2 = i5 + i6;
            }
        }
    }

    public final void b(int i, int i2, long j, long j2) {
        g850 g850Var = this.a.c;
        a aVar = this.d;
        boolean z = this.e;
        if (aVar.j && aVar.g) {
            aVar.m = aVar.c;
            aVar.j = false;
        } else if (aVar.h || aVar.g) {
            if (z && aVar.i) {
                aVar.a(i + ((int) (j - aVar.b)));
            }
            aVar.k = aVar.b;
            aVar.l = aVar.e;
            aVar.m = aVar.c;
            aVar.i = true;
        }
        if (!this.e) {
            pbx pbxVar = this.g;
            pbxVar.b(i2);
            pbx pbxVar2 = this.h;
            pbxVar2.b(i2);
            pbx pbxVar3 = this.i;
            pbxVar3.b(i2);
            if (pbxVar.c && pbxVar2.c && pbxVar3.c) {
                String str = this.b;
                int i3 = pbxVar.e;
                byte[] bArr = new byte[pbxVar2.e + i3 + pbxVar3.e];
                System.arraycopy(pbxVar.d, 0, bArr, 0, i3);
                System.arraycopy(pbxVar2.d, 0, bArr, pbxVar.e, pbxVar2.e);
                System.arraycopy(pbxVar3.d, 0, bArr, pbxVar.e + pbxVar2.e, pbxVar3.e);
                qbx.h hVarH = qbx.h(pbxVar2.d, 3, pbxVar2.e, null);
                qbx.c cVar = hVarH.b;
                String strA = cVar != null ? j08.a(cVar.a, cVar.b, cVar.c, cVar.d, cVar.e, cVar.f) : null;
                androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                c0062a.a = str;
                c0062a.l = gqv.m("video/mp2t");
                c0062a.m = gqv.m("video/hevc");
                c0062a.j = strA;
                c0062a.t = hVarH.e;
                c0062a.u = hVarH.f;
                c0062a.v = hVarH.g;
                c0062a.w = hVarH.h;
                c0062a.C = new n58(hVarH.k, hVarH.l, hVarH.m, hVarH.c + 8, hVarH.d + 8, null);
                c0062a.z = hVarH.i;
                c0062a.o = hVarH.j;
                c0062a.D = hVarH.a + 1;
                c0062a.p = Collections.singletonList(bArr);
                androidx.media3.common.a aVar2 = new androidx.media3.common.a(c0062a);
                this.c.d(aVar2);
                int i4 = aVar2.p;
                if (i4 == -1) {
                    fm20.a();
                    return;
                } else {
                    g850Var.c(i4);
                    this.e = true;
                }
            }
        }
        pbx pbxVar4 = this.j;
        boolean zB = pbxVar4.b(i2);
        nsz nszVar = this.n;
        if (zB) {
            nszVar.G(qbx.l(pbxVar4.e, pbxVar4.d), pbxVar4.d);
            nszVar.J(5);
            g850Var.a(j2, nszVar);
        }
        pbx pbxVar5 = this.k;
        if (pbxVar5.b(i2)) {
            nszVar.G(qbx.l(pbxVar5.e, pbxVar5.d), pbxVar5.d);
            nszVar.J(5);
            g850Var.a(j2, nszVar);
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.l = 0L;
        this.m = -9223372036854775807L;
        qbx.a(this.f);
        this.g.c();
        this.h.c();
        this.i.c();
        this.j.c();
        this.k.c();
        this.a.c.b(0);
        a aVar = this.d;
        if (aVar != null) {
            aVar.f = false;
            aVar.g = false;
            aVar.h = false;
            aVar.i = false;
            aVar.j = false;
        }
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
        ly0.g(this.c);
        String str = jrh0.a;
        if (z) {
            this.a.c.b(0);
            b(0, 0, this.l, this.m);
            h(0, 48, this.l, this.m);
        }
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.b = cVar.e;
        cVar.b();
        njg0 njg0VarR = m4hVar.r(cVar.d, 2);
        this.c = njg0VarR;
        this.d = new a(njg0VarR);
        this.a.a(m4hVar, cVar);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.m = j;
    }

    public final void g(byte[] bArr, int i, int i2) {
        a aVar = this.d;
        if (aVar.f) {
            int i3 = aVar.d;
            int i4 = (i + 2) - i3;
            if (i4 < i2) {
                aVar.g = (bArr[i4] & 128) != 0;
                aVar.f = false;
            } else {
                aVar.d = (i2 - i) + i3;
            }
        }
        if (!this.e) {
            this.g.a(bArr, i, i2);
            this.h.a(bArr, i, i2);
            this.i.a(bArr, i, i2);
        }
        this.j.a(bArr, i, i2);
        this.k.a(bArr, i, i2);
    }

    public final void h(int i, int i2, long j, long j2) {
        a aVar = this.d;
        boolean z = this.e;
        aVar.g = false;
        aVar.h = false;
        aVar.e = j2;
        aVar.d = 0;
        aVar.b = j;
        if (i2 >= 32 && i2 != 40) {
            if (aVar.i && !aVar.j) {
                if (z) {
                    aVar.a(i);
                }
                aVar.i = false;
            }
            if ((32 <= i2 && i2 <= 35) || i2 == 39) {
                aVar.h = !aVar.j;
                aVar.j = true;
            }
        }
        boolean z2 = i2 >= 16 && i2 <= 21;
        aVar.c = z2;
        aVar.f = z2 || i2 <= 9;
        if (!this.e) {
            this.g.d(i2);
            this.h.d(i2);
            this.i.d(i2);
        }
        this.j.d(i2);
        this.k.d(i2);
    }
}
