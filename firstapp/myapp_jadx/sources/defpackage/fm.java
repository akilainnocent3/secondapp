package defpackage;

import androidx.media3.common.a;
import java.util.Arrays;
import java.util.Collections;

/* JADX INFO: loaded from: classes.dex */
public final class fm implements fwf {
    public static final byte[] x = {73, 68, 51};
    public final boolean a;
    public final String d;
    public final int e;
    public final String f;
    public String g;
    public njg0 h;
    public njg0 i;
    public boolean m;
    public boolean n;
    public int q;
    public boolean r;
    public int t;
    public njg0 v;
    public long w;
    public final msz b = new msz(7, new byte[7]);
    public final nsz c = new nsz(Arrays.copyOf(x, 10));
    public int o = -1;
    public int p = -1;
    public long s = -9223372036854775807L;
    public long u = -9223372036854775807L;
    public int j = 0;
    public int k = 0;
    public int l = 256;

    public fm(int i, String str, String str2, boolean z) {
        this.a = z;
        this.d = str;
        this.e = i;
        this.f = str2;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x0205  */
    /* JADX WARN: Multi-variable type inference failed */
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
    @Override // defpackage.fwf
    public final void a(nsz nszVar) throws ssz {
        byte b;
        int i;
        int i2;
        char c;
        int i3;
        char c2;
        int i4;
        int i5;
        int i6;
        this.h.getClass();
        String str = jrh0.a;
        while (nszVar.a() > 0) {
            int i7 = this.j;
            byte b2 = -1;
            nsz nszVar2 = this.c;
            int i8 = 3;
            msz mszVar = this.b;
            int i9 = 0;
            int i10 = 4;
            int i11 = 1;
            if (i7 == 0) {
                byte[] bArr = nszVar.a;
                int i12 = nszVar.b;
                int i13 = nszVar.c;
                while (true) {
                    if (i12 < i13) {
                        int i14 = i12 + 1;
                        int i15 = i8;
                        byte b3 = bArr[i12];
                        int i16 = b3 & 255;
                        if (this.l == 512 && ((65280 | (((byte) i16) & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520) {
                            if (!this.n) {
                                int i17 = i12 - 1;
                                nszVar.I(i12);
                                byte[] bArr2 = mszVar.a;
                                if (nszVar.a() < i11) {
                                    b = -1;
                                } else {
                                    nszVar.h(bArr2, i9, i11);
                                    mszVar.m(i10);
                                    int iG = mszVar.g(i11);
                                    int i18 = this.o;
                                    if (i18 == -1 || iG == i18) {
                                        if (this.p != -1) {
                                            byte[] bArr3 = mszVar.a;
                                            if (nszVar.a() >= i11) {
                                                nszVar.h(bArr3, i9, i11);
                                                mszVar.m(2);
                                                i4 = 4;
                                                if (mszVar.g(4) != this.p) {
                                                    b = -1;
                                                } else {
                                                    nszVar.I(i14);
                                                }
                                            }
                                        } else {
                                            i4 = 4;
                                        }
                                        byte[] bArr4 = mszVar.a;
                                        if (nszVar.a() >= i4) {
                                            nszVar.h(bArr4, i9, i4);
                                            mszVar.m(14);
                                            int iG2 = mszVar.g(13);
                                            if (iG2 < 7) {
                                                b = -1;
                                            } else {
                                                byte[] bArr5 = nszVar.a;
                                                int i19 = nszVar.c;
                                                int i20 = i17 + iG2;
                                                if (i20 < i19) {
                                                    byte b4 = bArr5[i20];
                                                    b = -1;
                                                    if (b4 == -1) {
                                                        int i21 = i20 + 1;
                                                        if (i21 != i19) {
                                                            byte b5 = bArr5[i21];
                                                            if (((65280 | (b5 & 255 ? 1 : 0) ? 1 : 0) & 65526) == 65520 && ((b5 & 8) >> 3) == iG) {
                                                            }
                                                        }
                                                    } else if (b4 == 73 && ((i5 = i20 + 1) == i19 || (bArr5[i5] == 68 && ((i6 = i20 + 2) == i19 || bArr5[i6] == 51)))) {
                                                    }
                                                }
                                            }
                                        }
                                    } else {
                                        b = -1;
                                    }
                                }
                                i = 1;
                            }
                            this.q = (b3 & 8) >> 3;
                            this.m = (b3 & 1) == 0;
                            if (this.n) {
                                this.j = i15;
                                this.k = 0;
                            } else {
                                this.j = 1;
                                this.k = 0;
                            }
                            nszVar.I(i14);
                        } else {
                            b = b2;
                            i = i11;
                        }
                        int i22 = this.l;
                        int i23 = i16 | i22;
                        if (i23 == 329) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 768;
                        } else if (i23 == 511) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 512;
                        } else if (i23 == 836) {
                            i2 = 3;
                            c = 256;
                            i3 = 0;
                            c2 = 2;
                            this.l = 1024;
                        } else if (i23 != 1075) {
                            c = 256;
                            if (i22 != 256) {
                                this.l = 256;
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            } else {
                                i2 = 3;
                                i3 = 0;
                                c2 = 2;
                            }
                            i11 = i;
                            b2 = b;
                            i10 = 4;
                            i9 = i3;
                            i8 = i2;
                        } else {
                            this.j = 2;
                            this.k = 3;
                            this.t = 0;
                            nszVar2.I(0);
                            nszVar.I(i14);
                        }
                        i12 = i14;
                        i11 = i;
                        b2 = b;
                        i10 = 4;
                        i9 = i3;
                        i8 = i2;
                    } else {
                        nszVar.I(i12);
                    }
                }
            } else if (i7 != 1) {
                if (i7 == 2) {
                    byte[] bArr6 = nszVar2.a;
                    int iMin = Math.min(nszVar.a(), 10 - this.k);
                    nszVar.h(bArr6, this.k, iMin);
                    int i24 = this.k + iMin;
                    this.k = i24;
                    if (i24 == 10) {
                        this.i.f(10, nszVar2);
                        nszVar2.I(6);
                        njg0 njg0Var = this.i;
                        int iV = nszVar2.v() + 10;
                        this.j = 4;
                        this.k = 10;
                        this.v = njg0Var;
                        this.w = 0L;
                        this.t = iV;
                    }
                } else if (i7 == 3) {
                    int i25 = this.m ? 7 : 5;
                    byte[] bArr7 = mszVar.a;
                    int iMin2 = Math.min(nszVar.a(), i25 - this.k);
                    nszVar.h(bArr7, this.k, iMin2);
                    int i26 = this.k + iMin2;
                    this.k = i26;
                    if (i26 == i25) {
                        mszVar.m(0);
                        if (this.r) {
                            mszVar.o(10);
                        } else {
                            int iG3 = mszVar.g(2) + 1;
                            if (iG3 != 2) {
                                cft.g("AdtsReader", "Detected audio object type: " + iG3 + ", but assuming AAC LC.");
                                iG3 = 2;
                            }
                            mszVar.o(5);
                            int iG4 = mszVar.g(3);
                            int i27 = this.p;
                            byte[] bArr8 = {(byte) (((iG3 << 3) & 248) | ((i27 >> 1) & 7)), (byte) (((iG4 << 3) & 120) | ((i27 << 7) & 128))};
                            s1.a aVarB = s1.b(new msz(2, bArr8), false);
                            a.C0062a c0062a = new a.C0062a();
                            c0062a.a = this.g;
                            c0062a.l = gqv.m(this.f);
                            c0062a.m = gqv.m("audio/mp4a-latm");
                            c0062a.j = aVarB.c;
                            c0062a.E = aVarB.b;
                            c0062a.F = aVarB.a;
                            c0062a.p = Collections.singletonList(bArr8);
                            c0062a.d = this.d;
                            c0062a.f = this.e;
                            a aVar = new a(c0062a);
                            this.s = 1024000000 / ((long) aVar.G);
                            this.h.d(aVar);
                            this.r = true;
                        }
                        mszVar.o(4);
                        int iG5 = mszVar.g(13);
                        int i28 = iG5 - 7;
                        if (this.m) {
                            i28 = iG5 - 9;
                        }
                        njg0 njg0Var2 = this.h;
                        long j = this.s;
                        this.j = 4;
                        this.k = 0;
                        this.v = njg0Var2;
                        this.w = j;
                        this.t = i28;
                    }
                } else {
                    if (i7 != 4) {
                        fm20.a();
                        return;
                    }
                    int iMin3 = Math.min(nszVar.a(), this.t - this.k);
                    this.v.f(iMin3, nszVar);
                    int i29 = this.k + iMin3;
                    this.k = i29;
                    if (i29 == this.t) {
                        ly0.f(this.u != -9223372036854775807L);
                        this.v.a(this.u, 1, this.t, 0, null);
                        this.u += this.w;
                        this.j = 0;
                        this.k = 0;
                        this.l = 256;
                    }
                }
            } else if (nszVar.a() != 0) {
                mszVar.a[0] = nszVar.a[nszVar.b];
                mszVar.m(2);
                int iG6 = mszVar.g(4);
                int i30 = this.p;
                if (i30 == -1 || iG6 == i30) {
                    if (!this.n) {
                        this.n = true;
                        this.o = this.q;
                        this.p = iG6;
                    }
                    this.j = 3;
                    this.k = 0;
                } else {
                    this.n = false;
                    this.j = 0;
                    this.k = 0;
                    this.l = 256;
                }
            }
        }
    }

    @Override // defpackage.fwf
    public final void c() {
        this.u = -9223372036854775807L;
        this.n = false;
        this.j = 0;
        this.k = 0;
        this.l = 256;
    }

    @Override // defpackage.fwf
    public final void e(m4h m4hVar, wxg0.c cVar) {
        cVar.a();
        cVar.b();
        this.g = cVar.e;
        cVar.b();
        njg0 njg0VarR = m4hVar.r(cVar.d, 1);
        this.h = njg0VarR;
        this.v = njg0VarR;
        if (!this.a) {
            this.i = new dre();
            return;
        }
        cVar.a();
        cVar.b();
        njg0 njg0VarR2 = m4hVar.r(cVar.d, 5);
        this.i = njg0VarR2;
        a.C0062a c0062a = new a.C0062a();
        cVar.b();
        c0062a.a = cVar.e;
        c0062a.l = gqv.m(this.f);
        c0062a.m = gqv.m("application/id3");
        p0j0.a(c0062a, njg0VarR2);
    }

    @Override // defpackage.fwf
    public final void f(int i, long j) {
        this.u = j;
    }

    @Override // defpackage.fwf
    public final void d(boolean z) {
    }
}
