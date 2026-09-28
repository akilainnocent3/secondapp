package defpackage;

import com.google.android.gms.recaptchabase.WnDZ.CaxEybC;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class yal implements fwf {
    public static final float[] l = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    public final roh0 a;
    public final nsz b;
    public final boolean[] c = new boolean[4];
    public final a d;
    public final pbx e;
    public b f;
    public long g;
    public String h;
    public njg0 i;
    public boolean j;
    public long k;

    public static final class a {
        public static final byte[] f = {0, 0, 1};
        public boolean a;
        public int b;
        public int c;
        public int d;
        public byte[] e;

        public final void a(byte[] bArr, int i, int i2) {
            if (this.a) {
                int i3 = i2 - i;
                byte[] bArrCopyOf = this.e;
                int length = bArrCopyOf.length;
                int i4 = this.c + i3;
                if (length < i4) {
                    bArrCopyOf = Arrays.copyOf(bArrCopyOf, i4 * 2);
                    this.e = bArrCopyOf;
                }
                System.arraycopy(bArr, i, bArrCopyOf, this.c, i3);
                this.c += i3;
            }
        }
    }

    public static final class b {
        public final njg0 a;
        public boolean b;
        public boolean c;
        public boolean d;
        public int e;
        public int f;
        public long g;
        public long h;

        public b(njg0 njg0Var) {
            this.a = njg0Var;
        }

        public final void a(byte[] bArr, int i, int i2) {
            if (this.c) {
                int i3 = this.f;
                int i4 = (i + 1) - i3;
                if (i4 >= i2) {
                    this.f = (i2 - i) + i3;
                } else {
                    this.d = ((bArr[i4] & 192) >> 6) == 0;
                    this.c = false;
                }
            }
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
        public final void b(int i, long j, boolean z) {
            ly0.f(this.h != -9223372036854775807L);
            if (this.e == 182 && z && this.b) {
                this.a.a(this.h, this.d ? 1 : 0, (int) (j - this.g), i, null);
            }
            if (this.e != 179) {
                this.g = j;
            }
        }
    }

    public yal(roh0 roh0Var) {
        this.a = roh0Var;
        a aVar = new a();
        aVar.e = new byte[128];
        this.d = aVar;
        this.k = -9223372036854775807L;
        this.e = new pbx(178);
        this.b = new nsz();
    }

    @Override // defpackage.fwf
    public final void c() {
        qbx.a(this.c);
        a aVar = this.d;
        aVar.a = false;
        aVar.c = 0;
        aVar.b = 0;
        b bVar = this.f;
        if (bVar != null) {
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
        pbx pbxVar = this.e;
        if (pbxVar != null) {
            pbxVar.c();
        }
        this.g = 0L;
        this.k = -9223372036854775807L;
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
        ly0.g(this.f);
        if (z) {
            this.f.b(0, this.g, this.j);
            b bVar = this.f;
            bVar.b = false;
            bVar.c = false;
            bVar.d = false;
            bVar.e = -1;
        }
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.h = cVar.e;
        cVar.b();
        njg0 njg0VarR = m4hVar.r(cVar.d, 2);
        this.i = njg0VarR;
        this.f = new b(njg0VarR);
        this.a.b(m4hVar, cVar);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.k = j;
    }

    /* JADX WARN: Code duplicated, block: B:97:0x0231  */
    @Override // defpackage.fwf
    public final void a(nsz nszVar) {
        int i;
        int i2;
        boolean z;
        int i3;
        int i4;
        float f;
        ly0.g(this.f);
        ly0.g(this.i);
        int i5 = nszVar.b;
        int i6 = nszVar.c;
        byte[] bArr = nszVar.a;
        this.g += (long) nszVar.a();
        this.i.f(nszVar.a(), nszVar);
        while (true) {
            int iB = qbx.b(bArr, i5, i6, this.c);
            a aVar = this.d;
            pbx pbxVar = this.e;
            if (iB == i6) {
                if (!this.j) {
                    aVar.a(bArr, i5, i6);
                }
                this.f.a(bArr, i5, i6);
                if (pbxVar != null) {
                    pbxVar.a(bArr, i5, i6);
                    return;
                }
                return;
            }
            int i7 = iB + 3;
            byte b2 = nszVar.a[i7];
            int i8 = b2 & 255;
            int i9 = iB - i5;
            if (this.j) {
                i = i6;
                i2 = i7;
            } else {
                if (i9 > 0) {
                    aVar.a(bArr, i5, iB);
                }
                int i10 = i9 < 0 ? -i9 : 0;
                int i11 = aVar.b;
                if (i11 != 0) {
                    i = i6;
                    if (i11 == 1) {
                        i2 = i7;
                        i4 = 0;
                        if (i8 != 181) {
                            cft.g("H263Reader", "Unexpected start code value");
                            aVar.a = false;
                            aVar.c = 0;
                            aVar.b = 0;
                        } else {
                            aVar.b = 2;
                        }
                    } else if (i11 != 2) {
                        i2 = i7;
                        if (i11 != 3) {
                            if (i11 != 4) {
                                fm20.a();
                                return;
                            }
                            if (i8 == 179 || i8 == 181) {
                                aVar.c -= i10;
                                aVar.a = false;
                                njg0 njg0Var = this.i;
                                int i12 = aVar.d;
                                String str = this.h;
                                str.getClass();
                                byte[] bArrCopyOf = Arrays.copyOf(aVar.e, aVar.c);
                                msz mszVar = new msz(bArrCopyOf.length, bArrCopyOf);
                                mszVar.p(i12);
                                mszVar.p(4);
                                mszVar.n();
                                mszVar.o(8);
                                if (mszVar.f()) {
                                    mszVar.o(4);
                                    mszVar.o(3);
                                }
                                int iG = mszVar.g(4);
                                if (iG == 15) {
                                    int iG2 = mszVar.g(8);
                                    int iG3 = mszVar.g(8);
                                    if (iG3 == 0) {
                                        cft.g("H263Reader", "Invalid aspect ratio");
                                        f = 1.0f;
                                    } else {
                                        f = iG2 / iG3;
                                    }
                                } else if (iG < 7) {
                                    f = l[iG];
                                } else {
                                    cft.g("H263Reader", "Invalid aspect ratio");
                                    f = 1.0f;
                                }
                                if (mszVar.f()) {
                                    mszVar.o(2);
                                    mszVar.o(1);
                                    if (mszVar.f()) {
                                        mszVar.o(15);
                                        mszVar.n();
                                        mszVar.o(15);
                                        mszVar.n();
                                        mszVar.o(15);
                                        mszVar.n();
                                        mszVar.o(3);
                                        mszVar.o(11);
                                        mszVar.n();
                                        mszVar.o(15);
                                        mszVar.n();
                                    }
                                }
                                if (mszVar.g(2) != 0) {
                                    cft.g("H263Reader", CaxEybC.DxyXupDSPsYFa);
                                }
                                mszVar.n();
                                int iG4 = mszVar.g(16);
                                mszVar.n();
                                if (mszVar.f()) {
                                    if (iG4 == 0) {
                                        cft.g("H263Reader", "Invalid vop_increment_time_resolution");
                                    } else {
                                        int i13 = 0;
                                        for (int i14 = iG4 - 1; i14 > 0; i14 >>= 1) {
                                            i13++;
                                        }
                                        mszVar.o(i13);
                                    }
                                }
                                mszVar.n();
                                int iG5 = mszVar.g(13);
                                mszVar.n();
                                int iG6 = mszVar.g(13);
                                mszVar.n();
                                mszVar.n();
                                androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
                                c0062a.a = str;
                                c0062a.l = gqv.m("video/mp2t");
                                c0062a.m = gqv.m("video/mp4v-es");
                                c0062a.t = iG5;
                                c0062a.u = iG6;
                                c0062a.z = f;
                                c0062a.p = Collections.singletonList(bArrCopyOf);
                                p0j0.a(c0062a, njg0Var);
                                this.j = true;
                            } else {
                                i4 = 0;
                            }
                        } else if ((b2 & 240) != 32) {
                            cft.g("H263Reader", "Unexpected start code value");
                            i4 = 0;
                            aVar.a = false;
                            aVar.c = 0;
                            aVar.b = 0;
                        } else {
                            i4 = 0;
                            aVar.d = aVar.c;
                            aVar.b = 4;
                        }
                    } else {
                        i2 = i7;
                        i4 = 0;
                        if (i8 > 31) {
                            cft.g("H263Reader", "Unexpected start code value");
                            aVar.a = false;
                            aVar.c = 0;
                            aVar.b = 0;
                        } else {
                            aVar.b = 3;
                        }
                    }
                } else {
                    i = i6;
                    i2 = i7;
                    i4 = 0;
                    if (i8 == 176) {
                        aVar.b = 1;
                        aVar.a = true;
                    }
                }
                aVar.a(a.f, i4, 3);
            }
            this.f.a(bArr, i5, iB);
            if (pbxVar == null) {
                z = true;
            } else {
                if (i9 > 0) {
                    pbxVar.a(bArr, i5, iB);
                    i3 = 0;
                } else {
                    i3 = -i9;
                }
                if (pbxVar.b(i3)) {
                    int iL = qbx.l(pbxVar.e, pbxVar.d);
                    String str2 = jrh0.a;
                    byte[] bArr2 = pbxVar.d;
                    nsz nszVar2 = this.b;
                    nszVar2.G(iL, bArr2);
                    this.a.a(this.k, nszVar2);
                }
                if (i8 == 178) {
                    z = true;
                    if (nszVar.a[iB + 2] == 1) {
                        pbxVar.d(i8);
                    }
                } else {
                    z = true;
                }
            }
            int i15 = i - iB;
            this.f.b(i15, this.g - ((long) i15), this.j);
            b bVar = this.f;
            long j = this.k;
            bVar.e = i8;
            bVar.d = false;
            bVar.b = (i8 == 182 || i8 == 179) ? z : false;
            bVar.c = i8 == 182 ? z : false;
            bVar.f = 0;
            bVar.h = j;
            i6 = i;
            i5 = i2;
        }
    }
}
