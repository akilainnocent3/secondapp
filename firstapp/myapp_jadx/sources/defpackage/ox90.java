package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class ox90 extends t12 {
    public final mw0<a> c;

    public static class a {
        public String a;
        public int b;
        public int c;
        public pnv d;
        public boolean e;
    }

    public static class b extends hpc {
        public char[] a;
        public String[] b;

        public b(InputStream inputStream) {
            super(inputStream);
            this.a = new char[32];
        }

        public final String f() throws IOException {
            int i;
            int iD = d(true);
            if (iD == 0) {
                return null;
            }
            if (iD == 1) {
                return "";
            }
            int i2 = iD - 1;
            char[] cArr = this.a;
            if (cArr.length < i2) {
                cArr = new char[i2];
                this.a = cArr;
            }
            int i3 = 0;
            int i4 = 0;
            while (i3 < i2) {
                int i5 = read();
                int i6 = i5 >> 4;
                if (i6 == -1) {
                    throw new EOFException();
                }
                switch (i6) {
                    case 12:
                    case 13:
                        i = i4 + 1;
                        cArr[i4] = (char) (((i5 & 31) << 6) | (read() & 63));
                        i3 += 2;
                        break;
                    case 14:
                        i = i4 + 1;
                        cArr[i4] = (char) (((i5 & 15) << 12) | ((read() & 63) << 6) | (read() & 63));
                        i3 += 3;
                        break;
                    default:
                        i = i4 + 1;
                        cArr[i4] = (char) i5;
                        i3++;
                        break;
                }
                i4 = i;
            }
            return new String(cArr, 0, i4);
        }

        public final String g() throws IOException {
            int iD = d(true);
            if (iD == 0) {
                return null;
            }
            return this.b[iD - 1];
        }
    }

    public static class c {
        public int a;
        public int[] b;
        public float[] c;
    }

    public ox90(v20 v20Var) {
        super(v20Var);
        this.c = new mw0<>();
    }

    public static void B(b bVar, mw0 mw0Var, lh0.c cVar) throws IOException {
        float f = bVar.readFloat();
        float f2 = bVar.readFloat() * 1.0f;
        int iC = cVar.c() - 1;
        int i = 0;
        float f3 = f;
        float f4 = f2;
        int i2 = 0;
        while (true) {
            int i3 = i << 1;
            float[] fArr = cVar.b;
            fArr[i3] = f3;
            fArr[i3 + 1] = f4;
            if (i == iC) {
                mw0Var.a(cVar);
                return;
            }
            float f5 = bVar.readFloat();
            float f6 = bVar.readFloat() * 1.0f;
            byte b2 = bVar.readByte();
            if (b2 == 1) {
                cVar.i(i);
            } else if (b2 == 2) {
                F(bVar, cVar, i2, i, 0, f3, f5, f4, f6);
                i2++;
            }
            i++;
            f3 = f5;
            f4 = f6;
        }
    }

    public static void D(b bVar, mw0 mw0Var, lh0.d dVar) throws IOException {
        float f;
        float f2;
        lh0.d dVar2 = dVar;
        float f3 = bVar.readFloat();
        float f4 = bVar.readFloat() * 1.0f;
        float f5 = bVar.readFloat() * 1.0f;
        int iC = dVar2.c() - 1;
        float f6 = f3;
        float f7 = f4;
        float f8 = f5;
        int i = 0;
        int i2 = 0;
        while (true) {
            int i3 = i2 * 3;
            float[] fArr = dVar2.b;
            fArr[i3] = f6;
            fArr[i3 + 1] = f7;
            fArr[i3 + 2] = f8;
            if (i2 == iC) {
                mw0Var.a(dVar);
                return;
            }
            float f9 = bVar.readFloat();
            float f10 = bVar.readFloat() * 1.0f;
            float f11 = bVar.readFloat() * 1.0f;
            byte b2 = bVar.readByte();
            if (b2 == 1) {
                f = f9;
                f2 = f11;
                dVar2.i(i2);
            } else if (b2 != 2) {
                f = f9;
                f2 = f11;
            } else {
                f = f9;
                F(bVar, dVar2, i, i2, 0, f6, f, f7, f10);
                dVar2 = dVar;
                f2 = f11;
                F(bVar, dVar2, i + 1, i2, 1, f6, f, f8, f2);
                i += 2;
            }
            i2++;
            f6 = f;
            f8 = f2;
            f7 = f10;
        }
    }

    public static c E(b bVar, boolean z) throws IOException {
        int[] iArr;
        int[] iArr2;
        int iD = bVar.d(true);
        c cVar = new c();
        int i = iD << 1;
        cVar.a = i;
        if (!z) {
            cVar.c = l(bVar, i);
            return cVar;
        }
        owh owhVar = new owh(i * 9, 0);
        int[] iArr3 = new int[cVar.a * 3];
        int i2 = 0;
        for (int i3 = 0; i3 < iD; i3++) {
            int iD2 = bVar.d(true);
            if (i2 == iArr3.length) {
                int iMax = Math.max(8, (int) (i2 * 1.75f));
                iArr = new int[iMax];
                System.arraycopy(iArr3, 0, iArr, 0, Math.min(i2, iMax));
                iArr3 = iArr;
            } else {
                iArr = iArr3;
            }
            iArr3[i2] = iD2;
            i2++;
            iArr3 = iArr;
            int i4 = 0;
            while (i4 < iD2) {
                int iD3 = bVar.d(true);
                if (i2 == iArr3.length) {
                    int iMax2 = Math.max(8, (int) (i2 * 1.75f));
                    iArr2 = new int[iMax2];
                    System.arraycopy(iArr3, 0, iArr2, 0, Math.min(i2, iMax2));
                    iArr3 = iArr2;
                } else {
                    iArr2 = iArr3;
                }
                iArr3[i2] = iD3;
                owhVar.a(bVar.readFloat() * 1.0f);
                owhVar.a(bVar.readFloat() * 1.0f);
                owhVar.a(bVar.readFloat());
                i4++;
                i2++;
                iArr3 = iArr2;
            }
        }
        int i5 = owhVar.b;
        float[] fArr = new float[i5];
        System.arraycopy(owhVar.a, 0, fArr, 0, i5);
        cVar.c = fArr;
        int[] iArr4 = new int[i2];
        System.arraycopy(iArr3, 0, iArr4, 0, i2);
        cVar.b = iArr4;
        return cVar;
    }

    public static void F(b bVar, lh0.e eVar, int i, int i2, int i3, float f, float f2, float f3, float f4) {
        eVar.h(i, i2, i3, f, f3, bVar.readFloat(), bVar.readFloat() * 1.0f, bVar.readFloat(), bVar.readFloat() * 1.0f, f2, f4);
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 31721. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    public static defpackage.lh0 h(ox90.b r45, java.lang.String r46, defpackage.tx90 r47) {
        /*
            Method dump skipped, instruction units count: 3172
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ox90.h(ox90$b, java.lang.String, tx90):lh0");
    }

    public static float[] l(b bVar, int i) {
        float[] fArr = new float[i];
        for (int i2 = 0; i2 < i; i2++) {
            fArr[i2] = bVar.readFloat();
        }
        return fArr;
    }

    public static uc80 q(b bVar) {
        uc80 uc80Var = new uc80(bVar.d(true));
        uc80Var.c = bVar.d(true);
        uc80Var.d = bVar.d(true);
        uc80Var.e = bVar.d(true);
        return uc80Var;
    }

    @Override // defpackage.t12
    public final tx90 d(ckh ckhVar) {
        tx90 tx90VarR = r(ckhVar.c());
        String name = ckhVar.a.getName();
        int iLastIndexOf = name.lastIndexOf(46);
        if (iLastIndexOf != -1) {
            name = name.substring(0, iLastIndexOf);
        }
        tx90VarR.a = name;
        return tx90VarR;
    }

    public final tx90 r(InputStream inputStream) {
        mw0<a> mw0Var = this.c;
        if (inputStream == null) {
            hb5.a("dataInput cannot be null.");
            return null;
        }
        b bVar = new b(inputStream);
        tx90 tx90Var = new tx90();
        try {
            try {
                long j = bVar.readLong();
                if (j != 0) {
                    Long.toString(j);
                }
                bVar.f().getClass();
                bVar.readFloat();
                bVar.readFloat();
                bVar.readFloat();
                bVar.readFloat();
                float f = 1.0f;
                tx90Var.l = bVar.readFloat() * 1.0f;
                boolean z = bVar.readBoolean();
                if (z) {
                    bVar.readFloat();
                    bVar.f().getClass();
                    bVar.f().getClass();
                }
                int iD = bVar.d(true);
                String[] strArr = new String[iD];
                bVar.b = strArr;
                for (int i = 0; i < iD; i++) {
                    strArr[i] = bVar.f();
                }
                mw0<mh4> mw0Var2 = tx90Var.b;
                int iD2 = bVar.d(true);
                mh4[] mh4VarArrH = mw0Var2.h(iD2);
                int i2 = 0;
                while (i2 < iD2) {
                    mh4 mh4Var = new mh4(i2, bVar.f(), i2 == 0 ? null : mh4VarArrH[bVar.d(true)]);
                    mh4Var.g = bVar.readFloat();
                    mh4Var.e = bVar.readFloat() * 1.0f;
                    mh4Var.f = bVar.readFloat() * 1.0f;
                    mh4Var.h = bVar.readFloat();
                    mh4Var.i = bVar.readFloat();
                    mh4Var.j = bVar.readFloat();
                    mh4Var.k = bVar.readFloat();
                    mh4Var.d = bVar.readFloat() * 1.0f;
                    mh4Var.l = mh4.a.d[bVar.readByte()];
                    mh4Var.m = bVar.readBoolean();
                    if (z) {
                        i58.d(mh4Var.n, bVar.readInt());
                        bVar.f();
                        bVar.readBoolean();
                    }
                    mh4VarArrH[i2] = mh4Var;
                    i2++;
                }
                mw0<h1a0> mw0Var3 = tx90Var.c;
                int iD3 = bVar.d(true);
                h1a0[] h1a0VarArrH = mw0Var3.h(iD3);
                for (int i3 = 0; i3 < iD3; i3++) {
                    h1a0 h1a0Var = new h1a0(i3, bVar.f(), mh4VarArrH[bVar.d(true)]);
                    i58.d(h1a0Var.d, bVar.readInt());
                    int i4 = bVar.readInt();
                    if (i4 != -1) {
                        i58 i58Var = new i58();
                        h1a0Var.e = i58Var;
                        i58.c(i58Var, i4);
                    }
                    h1a0Var.f = bVar.g();
                    h1a0Var.g = ef4.a[bVar.d(true)];
                    if (z) {
                        bVar.readBoolean();
                    }
                    h1a0VarArrH[i3] = h1a0Var;
                }
                mw0<q7n> mw0Var4 = tx90Var.h;
                int iD4 = bVar.d(true);
                q7n[] q7nVarArrH = mw0Var4.h(iD4);
                int i5 = 0;
                while (i5 < iD4) {
                    q7n q7nVar = new q7n(bVar.f());
                    q7nVar.b = bVar.d(true);
                    mw0<mh4> mw0Var5 = q7nVar.d;
                    float f2 = f;
                    int iD5 = bVar.d(true);
                    mh4[] mh4VarArrH2 = mw0Var5.h(iD5);
                    for (int i6 = 0; i6 < iD5; i6++) {
                        mh4VarArrH2[i6] = mh4VarArrH[bVar.d(true)];
                    }
                    q7nVar.e = mh4VarArrH[bVar.d(true)];
                    int i7 = bVar.read();
                    q7nVar.c = (i7 & 1) != 0;
                    q7nVar.f = (i7 & 2) != 0 ? 1 : -1;
                    q7nVar.g = (i7 & 4) != 0;
                    q7nVar.h = (i7 & 8) != 0;
                    q7nVar.i = (i7 & 16) != 0;
                    if ((i7 & 32) != 0) {
                        q7nVar.j = (i7 & 64) != 0 ? bVar.readFloat() : f2;
                    }
                    if ((i7 & 128) != 0) {
                        q7nVar.k = bVar.readFloat() * f2;
                    }
                    q7nVarArrH[i5] = q7nVar;
                    i5++;
                    f = f2;
                }
                float f3 = f;
                mw0<esg0> mw0Var6 = tx90Var.i;
                int iD6 = bVar.d(true);
                esg0[] esg0VarArrH = mw0Var6.h(iD6);
                for (int i8 = 0; i8 < iD6; i8++) {
                    esg0 esg0Var = new esg0(bVar.f());
                    esg0Var.b = bVar.d(true);
                    mw0<mh4> mw0Var7 = esg0Var.d;
                    int iD7 = bVar.d(true);
                    mh4[] mh4VarArrH3 = mw0Var7.h(iD7);
                    for (int i9 = 0; i9 < iD7; i9++) {
                        mh4VarArrH3[i9] = mh4VarArrH[bVar.d(true)];
                    }
                    esg0Var.e = mh4VarArrH[bVar.d(true)];
                    int i10 = bVar.read();
                    esg0Var.c = (i10 & 1) != 0;
                    esg0Var.s = (i10 & 2) != 0;
                    esg0Var.r = (i10 & 4) != 0;
                    if ((i10 & 8) != 0) {
                        esg0Var.l = bVar.readFloat();
                    }
                    if ((i10 & 16) != 0) {
                        esg0Var.m = bVar.readFloat() * f3;
                    }
                    if ((i10 & 32) != 0) {
                        esg0Var.n = bVar.readFloat() * f3;
                    }
                    if ((i10 & 64) != 0) {
                        esg0Var.o = bVar.readFloat();
                    }
                    if ((i10 & 128) != 0) {
                        esg0Var.p = bVar.readFloat();
                    }
                    int i11 = bVar.read();
                    if ((i11 & 1) != 0) {
                        esg0Var.q = bVar.readFloat();
                    }
                    if ((i11 & 2) != 0) {
                        esg0Var.f = bVar.readFloat();
                    }
                    if ((i11 & 4) != 0) {
                        esg0Var.g = bVar.readFloat();
                    }
                    if ((i11 & 8) != 0) {
                        esg0Var.h = bVar.readFloat();
                    }
                    if ((i11 & 16) != 0) {
                        esg0Var.i = bVar.readFloat();
                    }
                    if ((i11 & 32) != 0) {
                        esg0Var.j = bVar.readFloat();
                    }
                    if ((i11 & 64) != 0) {
                        esg0Var.k = bVar.readFloat();
                    }
                    esg0VarArrH[i8] = esg0Var;
                }
                mw0<ixz> mw0Var8 = tx90Var.j;
                int iD8 = bVar.d(true);
                ixz[] ixzVarArrH = mw0Var8.h(iD8);
                for (int i12 = 0; i12 < iD8; i12++) {
                    ixz ixzVar = new ixz(bVar.f());
                    ixzVar.b = bVar.d(true);
                    ixzVar.c = bVar.readBoolean();
                    mw0<mh4> mw0Var9 = ixzVar.d;
                    int iD9 = bVar.d(true);
                    mh4[] mh4VarArrH4 = mw0Var9.h(iD9);
                    for (int i13 = 0; i13 < iD9; i13++) {
                        mh4VarArrH4[i13] = mh4VarArrH[bVar.d(true)];
                    }
                    ixzVar.e = h1a0VarArrH[bVar.d(true)];
                    int i14 = bVar.read();
                    ixzVar.f = ixz.a.c[i14 & 1];
                    ixzVar.g = ixz.c.c[(i14 >> 1) & 3];
                    ixzVar.h = ixz.b.d[(i14 >> 3) & 3];
                    if ((i14 & 128) != 0) {
                        ixzVar.i = bVar.readFloat();
                    }
                    float f4 = bVar.readFloat();
                    ixzVar.j = f4;
                    if (ixzVar.f == ixz.a.a) {
                        ixzVar.j = f4 * f3;
                    }
                    float f5 = bVar.readFloat();
                    ixzVar.k = f5;
                    ixz.c cVar = ixzVar.g;
                    if (cVar == ixz.c.a || cVar == ixz.c.b) {
                        ixzVar.k = f5 * f3;
                    }
                    ixzVar.l = bVar.readFloat();
                    ixzVar.m = bVar.readFloat();
                    ixzVar.n = bVar.readFloat();
                    ixzVarArrH[i12] = ixzVar;
                }
                mw0<ft00> mw0Var10 = tx90Var.k;
                int iD10 = bVar.d(true);
                ft00[] ft00VarArrH = mw0Var10.h(iD10);
                for (int i15 = 0; i15 < iD10; i15++) {
                    ft00 ft00Var = new ft00(bVar.f());
                    ft00Var.b = bVar.d(true);
                    ft00Var.d = mh4VarArrH[bVar.d(true)];
                    int i16 = bVar.read();
                    ft00Var.c = (i16 & 1) != 0;
                    if ((i16 & 2) != 0) {
                        ft00Var.e = bVar.readFloat();
                    }
                    if ((i16 & 4) != 0) {
                        ft00Var.f = bVar.readFloat();
                    }
                    if ((i16 & 8) != 0) {
                        ft00Var.g = bVar.readFloat();
                    }
                    if ((i16 & 16) != 0) {
                        ft00Var.h = bVar.readFloat();
                    }
                    if ((i16 & 32) != 0) {
                        ft00Var.i = bVar.readFloat();
                    }
                    ft00Var.j = ((i16 & 64) != 0 ? bVar.readFloat() : 5000.0f) * f3;
                    ft00Var.k = f3 / bVar.readUnsignedByte();
                    ft00Var.l = bVar.readFloat();
                    ft00Var.m = bVar.readFloat();
                    ft00Var.n = bVar.readFloat();
                    ft00Var.o = (i16 & 128) != 0 ? bVar.readFloat() : f3;
                    ft00Var.p = bVar.readFloat();
                    ft00Var.q = bVar.readFloat();
                    int i17 = bVar.read();
                    if ((i17 & 1) != 0) {
                        ft00Var.s = true;
                    }
                    if ((i17 & 2) != 0) {
                        ft00Var.t = true;
                    }
                    if ((i17 & 4) != 0) {
                        ft00Var.u = true;
                    }
                    if ((i17 & 8) != 0) {
                        ft00Var.v = true;
                    }
                    if ((i17 & 16) != 0) {
                        ft00Var.w = true;
                    }
                    if ((i17 & 32) != 0) {
                        ft00Var.x = true;
                    }
                    if ((i17 & 64) != 0) {
                        ft00Var.y = true;
                    }
                    ft00Var.r = (i17 & 128) != 0 ? bVar.readFloat() : f3;
                    ft00VarArrH[i15] = ft00Var;
                }
                ly90 ly90VarZ = z(bVar, tx90Var, true, z);
                mw0<ly90> mw0Var11 = tx90Var.d;
                if (ly90VarZ != null) {
                    tx90Var.e = ly90VarZ;
                    mw0Var11.a(ly90VarZ);
                }
                int i18 = mw0Var11.b;
                int iD11 = bVar.d(true) + i18;
                ly90[] ly90VarArrH = mw0Var11.h(iD11);
                while (i18 < iD11) {
                    ly90VarArrH[i18] = z(bVar, tx90Var, false, z);
                    i18++;
                }
                int i19 = mw0Var.b;
                a[] aVarArr = mw0Var.a;
                for (int i20 = 0; i20 < i19; i20++) {
                    a aVar = aVarArr[i20];
                    int i21 = aVar.b;
                    String str = aVar.a;
                    pnv pnvVar = aVar.d;
                    b21 b21VarA = mw0Var11.get(i21).a(aVar.c, str);
                    if (b21VarA == null) {
                        throw new fe80("Parent mesh not found: " + str);
                    }
                    pnvVar.d = aVar.e ? (r2i0) b21VarA : pnvVar;
                    pnvVar.h((pnv) b21VarA);
                    if (pnvVar.a() == null) {
                        pnvVar.c();
                    }
                }
                mw0Var.clear();
                mw0<hng> mw0Var12 = tx90Var.f;
                int iD12 = bVar.d(true);
                hng[] hngVarArrH = mw0Var12.h(iD12);
                for (int i22 = 0; i22 < iD12; i22++) {
                    hng hngVar = new hng(bVar.f());
                    hngVar.b = bVar.d(false);
                    hngVar.c = bVar.readFloat();
                    hngVar.d = bVar.f();
                    String strF = bVar.f();
                    hngVar.e = strF;
                    if (strF != null) {
                        hngVar.f = bVar.readFloat();
                        hngVar.g = bVar.readFloat();
                    }
                    hngVarArrH[i22] = hngVar;
                }
                mw0<lh0> mw0Var13 = tx90Var.g;
                int iD13 = bVar.d(true);
                lh0[] lh0VarArrH = mw0Var13.h(iD13);
                for (int i23 = 0; i23 < iD13; i23++) {
                    lh0VarArrH[i23] = h(bVar, bVar.f(), tx90Var);
                }
                try {
                    bVar.close();
                } catch (IOException unused) {
                }
                return tx90Var;
            } catch (IOException e) {
                throw new fe80("Error reading skeleton file.", e);
            }
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (IOException unused2) {
            }
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v23, types: [b21] */
    /* JADX WARN: Type inference failed for: r4v32 */
    /* JADX WARN: Type inference failed for: r4v33 */
    /* JADX WARN: Type inference failed for: r4v34 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r7v1, types: [ly90] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4 */
    public final ly90 z(b bVar, tx90 tx90Var, boolean z, boolean z2) throws IOException {
        mw0<gwa> mw0Var;
        int iD;
        ?? ly90Var;
        int i;
        o65 o65Var;
        pnv pnvVar;
        ?? r4;
        Object obj;
        Object obj2;
        tx90 tx90Var2 = tx90Var;
        Object obj3 = null;
        boolean z3 = true;
        if (z) {
            iD = bVar.d(true);
            if (iD == 0) {
                return null;
            }
            ly90Var = new ly90("default");
        } else {
            ly90 ly90Var2 = new ly90(bVar.f());
            if (z2) {
                i58.d(ly90Var2.f, bVar.readInt());
            }
            int iD2 = bVar.d(true);
            mw0<mh4> mw0Var2 = ly90Var2.c;
            mh4[] mh4VarArrH = mw0Var2.h(iD2);
            mh4[] mh4VarArr = tx90Var2.b.a;
            int i2 = mw0Var2.b;
            for (int i3 = 0; i3 < i2; i3++) {
                mh4VarArrH[i3] = mh4VarArr[bVar.d(true)];
            }
            q7n[] q7nVarArr = tx90Var2.h.a;
            int iD3 = bVar.d(true);
            int i4 = 0;
            while (true) {
                mw0Var = ly90Var2.d;
                if (i4 >= iD3) {
                    break;
                }
                mw0Var.a(q7nVarArr[bVar.d(true)]);
                i4++;
            }
            esg0[] esg0VarArr = tx90Var2.i.a;
            int iD4 = bVar.d(true);
            for (int i5 = 0; i5 < iD4; i5++) {
                mw0Var.a(esg0VarArr[bVar.d(true)]);
            }
            ixz[] ixzVarArr = tx90Var2.j.a;
            int iD5 = bVar.d(true);
            for (int i6 = 0; i6 < iD5; i6++) {
                mw0Var.a(ixzVarArr[bVar.d(true)]);
            }
            ft00[] ft00VarArr = tx90Var2.k.a;
            int iD6 = bVar.d(true);
            for (int i7 = 0; i7 < iD6; i7++) {
                mw0Var.a(ft00VarArr[bVar.d(true)]);
            }
            mw0Var.i();
            iD = bVar.d(true);
            ly90Var = ly90Var2;
        }
        int i8 = 0;
        while (i8 < iD) {
            int iD7 = bVar.d(z3);
            int iD8 = bVar.d(z3);
            int i9 = 0;
            while (i9 < iD8) {
                String strG = bVar.g();
                v20 v20Var = (v20) this.b;
                byte b2 = bVar.readByte();
                String strG2 = (b2 & 8) != 0 ? bVar.g() : strG;
                switch (c21.a[b2 & 7].ordinal()) {
                    case 0:
                        iD = iD;
                        i = i8;
                        String strG3 = (b2 & 16) != 0 ? bVar.g() : null;
                        int i10 = (b2 & 32) != 0 ? bVar.readInt() : -1;
                        uc80 uc80VarQ = (b2 & 64) != 0 ? q(bVar) : null;
                        float f = (b2 & 128) != 0 ? bVar.readFloat() : 0.0f;
                        float f2 = bVar.readFloat();
                        float f3 = bVar.readFloat();
                        float f4 = bVar.readFloat();
                        float f5 = bVar.readFloat();
                        float f6 = bVar.readFloat();
                        float f7 = bVar.readFloat();
                        if (strG3 == null) {
                            strG3 = strG2;
                        }
                        qs40 qs40VarC = v20Var.c(strG2, strG3, uc80VarQ);
                        qs40VarC.d = f2 * 1.0f;
                        qs40VarC.e = f3 * 1.0f;
                        qs40VarC.f = f4;
                        qs40VarC.g = f5;
                        qs40VarC.h = f;
                        qs40VarC.i = f6 * 1.0f;
                        qs40VarC.j = f7 * 1.0f;
                        i58.d(qs40VarC.m, i10);
                        qs40VarC.n = uc80VarQ;
                        pnvVar = qs40VarC;
                        if (uc80VarQ == null) {
                            qs40VarC.c();
                            pnvVar = qs40VarC;
                        }
                        r4 = pnvVar;
                        break;
                    case 1:
                        iD = iD;
                        i = i8;
                        c cVarE = E(bVar, (b2 & 16) != 0 ? z3 : false);
                        int i11 = z2 ? bVar.readInt() : 0;
                        o65Var = new o65(strG2);
                        o65Var.g = cVarE.a;
                        o65Var.f = cVarE.c;
                        o65Var.e = cVarE.b;
                        r4 = o65Var;
                        if (z2) {
                            i58.d(o65Var.i, i11);
                        }
                        break;
                    case 2:
                        iD = iD;
                        String strG4 = (b2 & 16) != 0 ? bVar.g() : strG2;
                        int i12 = (b2 & 32) != 0 ? bVar.readInt() : -1;
                        uc80 uc80VarQ2 = (b2 & 64) != 0 ? q(bVar) : null;
                        int iD9 = bVar.d(true);
                        c cVarE2 = E(bVar, (b2 & 128) != 0);
                        float[] fArrL = l(bVar, cVarE2.a);
                        int i13 = ((cVarE2.a - iD9) - 2) * 3;
                        short[] sArr = new short[i13];
                        i = i8;
                        int i14 = 0;
                        while (i14 < i13) {
                            int i15 = i14;
                            sArr[i15] = (short) bVar.d(true);
                            i14 = i15 + 1;
                            i13 = i13;
                        }
                        if (z2) {
                            int iD10 = bVar.d(true);
                            short[] sArr2 = new short[iD10];
                            int i16 = 0;
                            while (i16 < iD10) {
                                int i17 = i16;
                                sArr2[i17] = (short) bVar.d(true);
                                i16 = i17 + 1;
                                iD10 = iD10;
                            }
                            bVar.readFloat();
                            bVar.readFloat();
                        }
                        pnv pnvVarB = v20Var.b(strG2, strG4, uc80VarQ2);
                        i58.d(pnvVarB.m, i12);
                        pnvVarB.e = cVarE2.b;
                        pnvVarB.f = cVarE2.c;
                        pnvVarB.g = cVarE2.a;
                        pnvVarB.l = sArr;
                        pnvVarB.j = fArrL;
                        if (uc80VarQ2 == null) {
                            pnvVarB.c();
                        }
                        pnvVarB.n = uc80VarQ2;
                        pnvVar = pnvVarB;
                        r4 = pnvVar;
                        break;
                    case 3:
                        String strG5 = (b2 & 16) != 0 ? bVar.g() : strG2;
                        int i18 = (b2 & 32) != 0 ? bVar.readInt() : -1;
                        uc80 uc80VarQ3 = (b2 & 64) != 0 ? q(bVar) : null;
                        boolean z4 = (b2 & 128) != 0;
                        int iD11 = bVar.d(true);
                        String strG6 = bVar.g();
                        if (z2) {
                            bVar.readFloat();
                            bVar.readFloat();
                        }
                        pnv pnvVarB2 = v20Var.b(strG2, strG5, uc80VarQ3);
                        i58.d(pnvVarB2.m, i18);
                        pnvVarB2.n = uc80VarQ3;
                        a aVar = new a();
                        aVar.d = pnvVarB2;
                        aVar.b = iD11;
                        aVar.c = iD7;
                        aVar.a = strG6;
                        aVar.e = z4;
                        this.c.a(aVar);
                        obj = pnvVarB2;
                        i = i8;
                        r4 = obj;
                        break;
                    case 4:
                        boolean z5 = (b2 & 16) != 0 ? z3 : false;
                        boolean z6 = (b2 & 32) != 0 ? z3 : false;
                        c cVarE3 = E(bVar, (b2 & 64) != 0 ? z3 : false);
                        int i19 = cVarE3.a / 6;
                        float[] fArr = new float[i19];
                        for (int i20 = 0; i20 < i19; i20++) {
                            fArr[i20] = bVar.readFloat() * 1.0f;
                        }
                        int i21 = z2 ? bVar.readInt() : 0;
                        exz exzVar = new exz(strG2);
                        exzVar.j = z5;
                        exzVar.k = z6;
                        exzVar.g = cVarE3.a;
                        exzVar.f = cVarE3.c;
                        exzVar.e = cVarE3.b;
                        exzVar.i = fArr;
                        if (z2) {
                            i58.d(exzVar.l, i21);
                        }
                        iD = iD;
                        i = i8;
                        r4 = exzVar;
                        break;
                    case 5:
                        bVar.readFloat();
                        bVar.readFloat();
                        bVar.readFloat();
                        int i22 = z2 ? bVar.readInt() : 0;
                        xz10 xz10Var = new xz10(strG2);
                        obj2 = xz10Var;
                        if (z2) {
                            i58.d(xz10Var.c, i22);
                            obj2 = xz10Var;
                        }
                        obj = obj2;
                        i = i8;
                        r4 = obj;
                        break;
                    case 6:
                        int iD12 = bVar.d(z3);
                        c cVarE4 = E(bVar, (b2 & 16) != 0 ? z3 : false);
                        int i23 = z2 ? bVar.readInt() : 0;
                        ps7 ps7Var = new ps7(strG2);
                        ps7Var.i = tx90Var2.c.get(iD12);
                        ps7Var.g = cVarE4.a;
                        ps7Var.f = cVarE4.c;
                        ps7Var.e = cVarE4.b;
                        obj2 = ps7Var;
                        if (z2) {
                            i58.d(ps7Var.j, i23);
                            obj2 = ps7Var;
                        }
                        obj = obj2;
                        i = i8;
                        r4 = obj;
                        break;
                    default:
                        obj2 = obj3;
                        obj = obj2;
                        i = i8;
                        r4 = obj;
                        break;
                }
                if (r4 != 0) {
                    r4 = o65Var;
                    ly90Var.b(iD7, strG, r4);
                } else {
                    r4 = o65Var;
                }
                i9++;
                this = this;
                tx90Var2 = tx90Var;
                iD = iD;
                i8 = i;
                obj3 = null;
                z3 = true;
            }
            i8++;
            tx90Var2 = tx90Var;
            obj3 = null;
            z3 = true;
        }
        return ly90Var;
    }
}
