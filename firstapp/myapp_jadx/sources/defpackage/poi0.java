package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: loaded from: classes.dex */
public final class poi0 extends d8e0 {
    public a n;
    public int o;
    public boolean p;
    public qoi0.c q;
    public qoi0.a r;

    public static final class a {
        public final qoi0.c a;
        public final qoi0.a b;
        public final byte[] c;
        public final qoi0.b[] d;
        public final int e;

        public a(qoi0.c cVar, qoi0.a aVar, byte[] bArr, qoi0.b[] bVarArr, int i) {
            this.a = cVar;
            this.b = aVar;
            this.c = bArr;
            this.d = bVarArr;
            this.e = i;
        }
    }

    @Override // defpackage.d8e0
    public final void a(long j) {
        this.g = j;
        this.p = j != 0;
        qoi0.c cVar = this.q;
        this.o = cVar != null ? cVar.e : 0;
    }

    @Override // defpackage.d8e0
    public final long b(nsz nszVar) {
        byte b = nszVar.a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        a aVar = this.n;
        ly0.g(aVar);
        boolean z = aVar.d[(b >> 1) & (255 >>> (8 - aVar.e))].a;
        qoi0.c cVar = aVar.a;
        int i = !z ? cVar.e : cVar.f;
        long j = this.p ? (this.o + i) / 4 : 0;
        byte[] bArr = nszVar.a;
        int length = bArr.length;
        int i2 = nszVar.c + 4;
        if (length < i2) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i2);
            nszVar.G(bArrCopyOf.length, bArrCopyOf);
        } else {
            nszVar.H(i2);
        }
        byte[] bArr2 = nszVar.a;
        int i3 = nszVar.c;
        bArr2[i3 - 4] = (byte) (j & 255);
        bArr2[i3 - 3] = (byte) ((j >>> 8) & 255);
        bArr2[i3 - 2] = (byte) ((j >>> 16) & 255);
        bArr2[i3 - 1] = (byte) ((j >>> 24) & 255);
        this.p = true;
        this.o = i;
        return j;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03a9 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x03ac  */
    @Override // defpackage.d8e0
    public final boolean c(nsz nszVar, long j, d8e0.a aVar) throws ssz {
        a aVar2;
        if (this.n != null) {
            aVar.a.getClass();
            return false;
        }
        qoi0.c cVar = this.q;
        int i = 4;
        if (cVar != null) {
            qoi0.a aVar3 = this.r;
            if (aVar3 == null) {
                this.r = qoi0.b(nszVar, true, true);
            } else {
                int i2 = nszVar.c;
                byte[] bArr = new byte[i2];
                System.arraycopy(nszVar.a, 0, bArr, 0, i2);
                int i3 = cVar.a;
                int i4 = 5;
                qoi0.c(5, nszVar, false);
                int iW = nszVar.w() + 1;
                moi0 moi0Var = new moi0(nszVar.a);
                int i5 = 8;
                moi0Var.c(nszVar.b * 8);
                int i6 = 0;
                while (true) {
                    int i7 = i5;
                    int i8 = 16;
                    if (i6 >= iW) {
                        qoi0.c cVar2 = cVar;
                        int i9 = 6;
                        int iB = moi0Var.b(6) + 1;
                        for (int i10 = 0; i10 < iB; i10++) {
                            if (moi0Var.b(16) != 0) {
                                throw ssz.a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i11 = 1;
                        int iB2 = moi0Var.b(6) + 1;
                        int i12 = 0;
                        while (true) {
                            int i13 = 3;
                            if (i12 >= iB2) {
                                int iB3 = moi0Var.b(i9) + 1;
                                int i14 = 0;
                                while (i14 < iB3) {
                                    if (moi0Var.b(16) > 2) {
                                        throw ssz.a(null, "residueType greater than 2 is not decodable");
                                    }
                                    moi0Var.c(24);
                                    moi0Var.c(24);
                                    moi0Var.c(24);
                                    int iB4 = moi0Var.b(i9) + 1;
                                    int i15 = 8;
                                    moi0Var.c(8);
                                    int[] iArr = new int[iB4];
                                    for (int i16 = 0; i16 < iB4; i16++) {
                                        iArr[i16] = ((moi0Var.a() ? moi0Var.b(5) : 0) * 8) + moi0Var.b(3);
                                    }
                                    int i17 = 0;
                                    while (i17 < iB4) {
                                        int i18 = 0;
                                        while (i18 < i15) {
                                            if ((iArr[i17] & (1 << i18)) != 0) {
                                                moi0Var.c(i15);
                                            }
                                            i18++;
                                            i15 = 8;
                                        }
                                        i17++;
                                        i15 = 8;
                                    }
                                    i14++;
                                    i9 = 6;
                                }
                                int iB5 = moi0Var.b(i9) + 1;
                                for (int i19 = 0; i19 < iB5; i19++) {
                                    int iB6 = moi0Var.b(16);
                                    if (iB6 != 0) {
                                        cft.c("VorbisUtil", "mapping type other than 0 not supported: " + iB6);
                                    } else {
                                        int iB7 = moi0Var.a() ? moi0Var.b(4) + 1 : 1;
                                        if (moi0Var.a()) {
                                            int iB8 = moi0Var.b(8) + 1;
                                            for (int i20 = 0; i20 < iB8; i20++) {
                                                int i21 = i3 - 1;
                                                int i22 = 0;
                                                for (int i23 = i21; i23 > 0; i23 >>>= 1) {
                                                    i22++;
                                                }
                                                moi0Var.c(i22);
                                                int i24 = 0;
                                                while (i21 > 0) {
                                                    i24++;
                                                    i21 >>>= 1;
                                                }
                                                moi0Var.c(i24);
                                            }
                                        }
                                        if (moi0Var.b(2) != 0) {
                                            throw ssz.a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iB7 > 1) {
                                            for (int i25 = 0; i25 < i3; i25++) {
                                                moi0Var.c(4);
                                            }
                                        }
                                        for (int i26 = 0; i26 < iB7; i26++) {
                                            moi0Var.c(8);
                                            moi0Var.c(8);
                                            moi0Var.c(8);
                                        }
                                    }
                                }
                                int iB9 = moi0Var.b(6);
                                int i27 = iB9 + 1;
                                qoi0.b[] bVarArr = new qoi0.b[i27];
                                for (int i28 = 0; i28 < i27; i28++) {
                                    boolean zA = moi0Var.a();
                                    moi0Var.b(16);
                                    moi0Var.b(16);
                                    moi0Var.b(8);
                                    bVarArr[i28] = new qoi0.b(zA);
                                }
                                if (!moi0Var.a()) {
                                    throw ssz.a(null, "framing bit after modes not set as expected");
                                }
                                int i29 = 0;
                                while (iB9 > 0) {
                                    i29++;
                                    iB9 >>>= 1;
                                }
                                aVar2 = new a(cVar2, aVar3, bArr, bVarArr, i29);
                                break;
                            }
                            int iB10 = moi0Var.b(i8);
                            if (iB10 == 0) {
                                int i30 = i7;
                                moi0Var.c(i30);
                                moi0Var.c(16);
                                moi0Var.c(16);
                                moi0Var.c(6);
                                moi0Var.c(i30);
                                int iB11 = moi0Var.b(4) + 1;
                                int i31 = 0;
                                while (i31 < iB11) {
                                    moi0Var.c(i30);
                                    i31++;
                                    i30 = 8;
                                }
                            } else {
                                if (iB10 != i11) {
                                    throw ssz.a(null, "floor type greater than 1 not decodable: " + iB10);
                                }
                                int iB12 = moi0Var.b(5);
                                int[] iArr2 = new int[iB12];
                                int i32 = -1;
                                for (int i33 = 0; i33 < iB12; i33++) {
                                    int iB13 = moi0Var.b(4);
                                    iArr2[i33] = iB13;
                                    if (iB13 > i32) {
                                        i32 = iB13;
                                    }
                                }
                                int i34 = i32 + 1;
                                int[] iArr3 = new int[i34];
                                int i35 = 0;
                                while (i35 < i34) {
                                    iArr3[i35] = moi0Var.b(i13) + 1;
                                    int iB14 = moi0Var.b(2);
                                    int i36 = i7;
                                    if (iB14 > 0) {
                                        moi0Var.c(i36);
                                    }
                                    int i37 = i34;
                                    int i38 = 0;
                                    for (int i39 = 1; i38 < (i39 << iB14); i39 = 1) {
                                        moi0Var.c(i36);
                                        i38++;
                                        i36 = 8;
                                    }
                                    i35++;
                                    i34 = i37;
                                    i7 = 8;
                                    i13 = 3;
                                }
                                moi0Var.c(2);
                                int iB15 = moi0Var.b(4);
                                int i40 = 0;
                                int i41 = 0;
                                for (int i42 = 0; i42 < iB12; i42++) {
                                    i40 += iArr3[iArr2[i42]];
                                    while (i41 < i40) {
                                        moi0Var.c(iB15);
                                        i41++;
                                    }
                                }
                            }
                            i12++;
                            i7 = 8;
                            i9 = 6;
                            i11 = 1;
                            i8 = 16;
                        }
                    } else {
                        if (moi0Var.b(24) != 5653314) {
                            throw ssz.a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((moi0Var.c * 8) + moi0Var.d));
                        }
                        int iB16 = moi0Var.b(16);
                        int iB17 = moi0Var.b(24);
                        if (moi0Var.a()) {
                            moi0Var.c(i4);
                            int iB18 = 0;
                            while (iB18 < iB17) {
                                int i43 = 0;
                                for (int i44 = iB17 - iB18; i44 > 0; i44 >>>= 1) {
                                    i43++;
                                }
                                iB18 += moi0Var.b(i43);
                            }
                        } else {
                            boolean zA2 = moi0Var.a();
                            for (int i45 = 0; i45 < iB17; i45++) {
                                if (!zA2) {
                                    moi0Var.c(i4);
                                } else if (moi0Var.a()) {
                                    moi0Var.c(i4);
                                }
                            }
                        }
                        int iB19 = moi0Var.b(i);
                        if (iB19 > 2) {
                            throw ssz.a(null, "lookup type greater than 2 not decodable: " + iB19);
                        }
                        if (iB19 == 1 || iB19 == 2) {
                            moi0Var.c(32);
                            moi0Var.c(32);
                            int iB20 = moi0Var.b(i) + 1;
                            moi0Var.c(1);
                            moi0Var.c((int) ((iB19 == 1 ? iB16 != 0 ? (long) Math.floor(Math.pow(iB17, 1.0d / ((double) iB16))) : 0L : ((long) iB16) * ((long) iB17)) * ((long) iB20)));
                        } else {
                            cVar = cVar;
                        }
                        i6++;
                        i5 = i7;
                        cVar = cVar;
                        i = 4;
                        i4 = 5;
                    }
                }
            }
            this.n = aVar2;
            if (aVar2 == null) {
                return true;
            }
            qoi0.c cVar3 = aVar2.a;
            ArrayList arrayList = new ArrayList();
            arrayList.add(cVar3.g);
            arrayList.add(aVar2.c);
            uov uovVarA = qoi0.a(pcn.k(aVar2.b.a));
            androidx.media3.common.a.C0062a c0062a = new androidx.media3.common.a.C0062a();
            c0062a.l = gqv.m("audio/ogg");
            c0062a.m = gqv.m("audio/vorbis");
            c0062a.h = cVar3.d;
            c0062a.i = cVar3.c;
            c0062a.E = cVar3.a;
            c0062a.F = cVar3.b;
            c0062a.p = arrayList;
            c0062a.k = uovVarA;
            aVar.a = new androidx.media3.common.a(c0062a);
            return true;
        }
        qoi0.c(1, nszVar, false);
        nszVar.o();
        int iW2 = nszVar.w();
        int iO = nszVar.o();
        int iL = nszVar.l();
        int i46 = iL <= 0 ? -1 : iL;
        int iL2 = nszVar.l();
        int i47 = iL2 <= 0 ? -1 : iL2;
        nszVar.l();
        int iW3 = nszVar.w();
        int iPow = (int) Math.pow(2.0d, iW3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iW3 & 240) >> 4);
        nszVar.w();
        this.q = new qoi0.c(iW2, iO, i46, i47, iPow, iPow2, Arrays.copyOf(nszVar.a, nszVar.c));
        aVar2 = null;
        this.n = aVar2;
        if (aVar2 == null) {
            return true;
        }
        qoi0.c cVar4 = aVar2.a;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(cVar4.g);
        arrayList2.add(aVar2.c);
        uov uovVarA2 = qoi0.a(pcn.k(aVar2.b.a));
        androidx.media3.common.a.C0062a c0062a2 = new androidx.media3.common.a.C0062a();
        c0062a2.l = gqv.m("audio/ogg");
        c0062a2.m = gqv.m("audio/vorbis");
        c0062a2.h = cVar4.d;
        c0062a2.i = cVar4.c;
        c0062a2.E = cVar4.a;
        c0062a2.F = cVar4.b;
        c0062a2.p = arrayList2;
        c0062a2.k = uovVarA2;
        aVar.a = new androidx.media3.common.a(c0062a2);
        return true;
    }

    @Override // defpackage.d8e0
    public final void d(boolean z) {
        super.d(z);
        if (z) {
            this.n = null;
            this.q = null;
            this.r = null;
        }
        this.o = 0;
        this.p = false;
    }
}
