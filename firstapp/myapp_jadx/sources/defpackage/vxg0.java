package defpackage;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.util.SparseIntArray;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class vxg0 implements k4h {
    public final int a;
    public final int b;
    public final List<zxf0> c;
    public final nsz d;
    public final SparseIntArray e;
    public final tid f;
    public final ree0.a g;
    public final SparseArray<wxg0> h;
    public final SparseBooleanArray i;
    public final SparseBooleanArray j;
    public final txg0 k;
    public sxg0 l;
    public m4h m;
    public int n;
    public boolean o;
    public boolean p;
    public boolean q;
    public wxg0 r;
    public int s;
    public int t;

    public vxg0(int i, int i2, ree0.a aVar, zxf0 zxf0Var, tid tidVar) {
        this.f = tidVar;
        this.a = i;
        this.b = i2;
        this.g = aVar;
        if (i == 1 || i == 2) {
            this.c = Collections.singletonList(zxf0Var);
        } else {
            ArrayList arrayList = new ArrayList();
            this.c = arrayList;
            arrayList.add(zxf0Var);
        }
        this.d = new nsz(0, new byte[9400]);
        SparseBooleanArray sparseBooleanArray = new SparseBooleanArray();
        this.i = sparseBooleanArray;
        this.j = new SparseBooleanArray();
        SparseArray<wxg0> sparseArray = new SparseArray<>();
        this.h = sparseArray;
        this.e = new SparseIntArray();
        this.k = new txg0();
        this.m = m4h.m;
        this.t = -1;
        sparseBooleanArray.clear();
        sparseArray.clear();
        SparseArray sparseArray2 = new SparseArray();
        int size = sparseArray2.size();
        for (int i3 = 0; i3 < size; i3++) {
            sparseArray.put(sparseArray2.keyAt(i3), (wxg0) sparseArray2.valueAt(i3));
        }
        sparseArray.put(0, new i380(new a()));
        this.r = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v4 */
    /* JADX WARN: Type inference failed for: r10v5 */
    /* JADX WARN: Type inference failed for: r10v6, types: [int] */
    /* JADX WARN: Type inference failed for: r10v8 */
    /* JADX WARN: Type inference failed for: r10v9 */
    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2 */
    /* JADX WARN: Type inference failed for: r14v3 */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r4v8, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2, types: [android.util.SparseBooleanArray] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v2, types: [wxg0] */
    /* JADX WARN: Type inference failed for: r8v8 */
    @Override // defpackage.k4h
    public final int a(l4h l4hVar, k620 k620Var) throws ssz {
        l4h l4hVar2;
        ?? r1;
        int i;
        int i2;
        int i3;
        int i4;
        wxg0 wxg0Var;
        boolean z;
        long jA;
        long length = l4hVar.getLength();
        int i5 = this.a;
        boolean z2 = i5 == 2;
        if (this.o) {
            long j = -9223372036854775807L;
            txg0 txg0Var = this.k;
            if (length != -1 && !z2 && !txg0Var.c) {
                int i6 = this.t;
                zxf0 zxf0Var = txg0Var.a;
                nsz nszVar = txg0Var.b;
                if (i6 <= 0) {
                    txg0Var.a(l4hVar);
                    return 0;
                }
                if (txg0Var.e) {
                    if (txg0Var.g == -9223372036854775807L) {
                        txg0Var.a(l4hVar);
                        return 0;
                    }
                    if (txg0Var.d) {
                        long j2 = txg0Var.f;
                        if (j2 == -9223372036854775807L) {
                            txg0Var.a(l4hVar);
                            return 0;
                        }
                        txg0Var.h = zxf0Var.c(txg0Var.g) - zxf0Var.b(j2);
                        txg0Var.a(l4hVar);
                        return 0;
                    }
                    int iMin = (int) Math.min(112800L, l4hVar.getLength());
                    if (l4hVar.getPosition() != 0) {
                        k620Var.a = 0L;
                        return 1;
                    }
                    nszVar.F(iMin);
                    l4hVar.e();
                    l4hVar.m(nszVar.a, 0, iMin);
                    int i7 = nszVar.c;
                    for (int i8 = nszVar.b; i8 < i7; i8++) {
                        if (nszVar.a[i8] == 71) {
                            jA = xxg0.a(nszVar, i8, i6);
                            if (jA != -9223372036854775807L) {
                                txg0Var.f = jA;
                                txg0Var.d = true;
                                return 0;
                            }
                        }
                    }
                    jA = -9223372036854775807L;
                    txg0Var.f = jA;
                    txg0Var.d = true;
                    return 0;
                }
                long length2 = l4hVar.getLength();
                int iMin2 = (int) Math.min(112800L, length2);
                long j3 = length2 - ((long) iMin2);
                if (l4hVar.getPosition() != j3) {
                    k620Var.a = j3;
                    return 1;
                }
                nszVar.F(iMin2);
                l4hVar.e();
                l4hVar.m(nszVar.a, 0, iMin2);
                int i9 = nszVar.b;
                int i10 = nszVar.c;
                for (int i11 = i10 - 188; i11 >= i9; i11--) {
                    byte[] bArr = nszVar.a;
                    int i12 = 0;
                    for (int i13 = -4; i13 <= 4; i13++) {
                        int i14 = (i13 * 188) + i11;
                        if (i14 >= i9 && i14 < i10 && bArr[i14] == 71) {
                            i12++;
                            if (i12 == 5) {
                                long jA2 = xxg0.a(nszVar, i11, i6);
                                if (jA2 == -9223372036854775807L) {
                                    break;
                                }
                                j = jA2;
                                break;
                            }
                        } else {
                            i12 = 0;
                        }
                    }
                }
                txg0Var.g = j;
                txg0Var.e = true;
                return 0;
            }
            if (this.p) {
                i = 1;
                z = false;
                i2 = i5;
            } else {
                this.p = true;
                long j4 = txg0Var.h;
                if (j4 != -9223372036854775807L) {
                    i = 1;
                    z = false;
                    i2 = i5;
                    sxg0 sxg0Var = new sxg0(new b64.b(), new sxg0.a(this.t, txg0Var.a), j4, j4 + 1, 0L, length, 188L, 940);
                    this.l = sxg0Var;
                    this.m.k(sxg0Var.a);
                } else {
                    i = 1;
                    z = false;
                    i2 = i5;
                    this.m.k(new p480.b(j4));
                }
            }
            if (this.q) {
                this.q = z;
                c(0L, 0L);
                if (l4hVar.getPosition() != 0) {
                    k620Var.a = 0L;
                    return i;
                }
            }
            sxg0 sxg0Var2 = this.l;
            if (sxg0Var2 != null && sxg0Var2.c != null) {
                return sxg0Var2.a(l4hVar, k620Var);
            }
            l4hVar2 = l4hVar;
            r1 = z;
        } else {
            l4hVar2 = l4hVar;
            r1 = 0;
            i = 1;
            i2 = i5;
        }
        nsz nszVar2 = this.d;
        byte[] bArr2 = nszVar2.a;
        if (9400 - nszVar2.b < 188) {
            int iA = nszVar2.a();
            if (iA > 0) {
                System.arraycopy(bArr2, nszVar2.b, bArr2, r1, iA);
            }
            nszVar2.G(iA, bArr2);
        }
        while (true) {
            int iA2 = nszVar2.a();
            SparseArray<wxg0> sparseArray = this.h;
            if (iA2 >= 188) {
                int i15 = nszVar2.b;
                int i16 = nszVar2.c;
                byte[] bArr3 = nszVar2.a;
                int i17 = i15;
                while (i17 < i16 && bArr3[i17] != 71) {
                    i17++;
                }
                nszVar2.I(i17);
                int i18 = i17 + 188;
                ?? r8 = 0;
                if (i18 > i16) {
                    int i19 = (i17 - i15) + this.s;
                    this.s = i19;
                    i3 = i2;
                    i4 = 2;
                    if (i3 == 2 && i19 > 376) {
                        throw ssz.a(null, "Cannot find sync byte. Most likely not a Transport Stream.");
                    }
                } else {
                    i3 = i2;
                    i4 = 2;
                    this.s = r1;
                }
                int i20 = nszVar2.c;
                if (i18 > i20) {
                    return r1;
                }
                int iJ = nszVar2.j();
                if ((8388608 & iJ) != 0) {
                    nszVar2.I(i18);
                    return r1;
                }
                ?? r10 = (4194304 & iJ) != 0 ? 1 : r1;
                int i21 = (2096896 & iJ) >> 8;
                ?? r14 = (iJ & 32) != 0 ? 1 : r1;
                if ((iJ & 16) != 0) {
                    wxg0Var = sparseArray.get(i21);
                }
                if (r8 == 0) {
                    r8 = wxg0Var;
                    nszVar2.I(i18);
                    return r1;
                }
                if (i3 != i4) {
                    int i22 = iJ & 15;
                    SparseIntArray sparseIntArray = this.e;
                    int i23 = sparseIntArray.get(i21, i22 - 1);
                    sparseIntArray.put(i21, i22);
                    if (i23 == i22) {
                        nszVar2.I(i18);
                        return r1;
                    }
                    if (i22 != ((i23 + 1) & 15)) {
                        r8.c();
                    }
                }
                if (r14 != 0) {
                    int iW = nszVar2.w();
                    r10 = (r10 == true ? 1 : 0) | ((nszVar2.w() & 64) != 0 ? i4 : r1);
                    nszVar2.J(iW - 1);
                }
                boolean z3 = this.o;
                if (i3 == i4 || z3 || !this.j.get(i21, r1)) {
                    nszVar2.H(i18);
                    r8.a(r10, nszVar2);
                    nszVar2.H(i20);
                }
                if (i3 != i4 && !z3 && this.o && length != -1) {
                    this.q = true;
                }
                nszVar2.I(i18);
                return r1;
            }
            int i24 = nszVar2.c;
            int i25 = l4hVar2.read(bArr2, i24, 9400 - i24);
            if (i25 == -1) {
                for (?? r4 = r1; r4 < sparseArray.size(); r4++) {
                    wxg0 wxg0VarValueAt = sparseArray.valueAt(r4);
                    if (wxg0VarValueAt instanceof or00) {
                        or00 or00Var = (or00) wxg0VarValueAt;
                        ?? r3 = (!z2 || or00Var.e()) ? i : r1;
                        if (or00Var.c == 3 && or00Var.j == -1 && ((!z2 || !(or00Var.a instanceof xal)) && r3 != 0)) {
                            or00Var.a(i, new nsz());
                        }
                    }
                    i = 1;
                }
                return -1;
            }
            nszVar2.H(i24 + i25);
            i = 1;
        }
    }

    @Override // defpackage.k4h
    public final boolean b(l4h l4hVar) throws EOFException, InterruptedIOException {
        byte[] bArr = this.d.a;
        jcd jcdVar = (jcd) l4hVar;
        jcdVar.c(bArr, 0, 940, false);
        for (int i = 0; i < 188; i++) {
            int i2 = 0;
            while (true) {
                if (i2 >= 5) {
                    jcdVar.b(i, false);
                    return true;
                }
                if (bArr[(i2 * 188) + i] != 71) {
                    break;
                }
                i2++;
            }
        }
        return false;
    }

    @Override // defpackage.k4h
    public final void c(long j, long j2) {
        sxg0 sxg0Var;
        long j3;
        SparseArray<wxg0> sparseArray = this.h;
        List<zxf0> list = this.c;
        ly0.f(this.a != 2);
        int size = list.size();
        for (int i = 0; i < size; i++) {
            zxf0 zxf0Var = list.get(i);
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
        }
        if (j2 != 0 && (sxg0Var = this.l) != null) {
            sxg0Var.c(j2);
        }
        this.d.F(0);
        this.e.clear();
        for (int i2 = 0; i2 < sparseArray.size(); i2++) {
            sparseArray.valueAt(i2).c();
        }
        this.s = 0;
    }

    @Override // defpackage.k4h
    public final void l(m4h m4hVar) {
        if ((this.b & 1) == 0) {
            m4hVar = new see0(m4hVar, this.g);
        }
        this.m = m4hVar;
    }

    @Override // defpackage.k4h
    public final void release() {
    }

    public class a implements h380 {
        public final msz a = new msz(4, new byte[4]);

        public a() {
        }

        @Override // defpackage.h380
        public final void a(nsz nszVar) {
            vxg0 vxg0Var = vxg0.this;
            SparseArray<wxg0> sparseArray = vxg0Var.h;
            if (nszVar.w() == 0 && (nszVar.w() & 128) != 0) {
                nszVar.J(6);
                int iA = nszVar.a() / 4;
                for (int i = 0; i < iA; i++) {
                    msz mszVar = this.a;
                    nszVar.h(mszVar.a, 0, 4);
                    mszVar.m(0);
                    int iG = mszVar.g(16);
                    mszVar.o(3);
                    if (iG == 0) {
                        mszVar.o(13);
                    } else {
                        int iG2 = mszVar.g(13);
                        if (sparseArray.get(iG2) == null) {
                            sparseArray.put(iG2, new i380(vxg0Var.new b(iG2)));
                            vxg0Var.n++;
                        }
                    }
                }
                if (vxg0Var.a != 2) {
                    sparseArray.remove(0);
                }
            }
        }

        @Override // defpackage.h380
        public final void b(zxf0 zxf0Var, m4h m4hVar, wxg0.c cVar) {
        }
    }

    public class b implements h380 {
        public final msz a = new msz(5, new byte[5]);
        public final SparseArray<wxg0> b = new SparseArray<>();
        public final SparseIntArray c = new SparseIntArray();
        public final int d;

        public b(int i) {
            this.d = i;
        }

        /* JADX WARN: Code duplicated, block: B:41:0x0136  */
        @Override // defpackage.h380
        public final void a(nsz nszVar) {
            zxf0 zxf0Var;
            zxf0 zxf0Var2;
            SparseArray<wxg0> sparseArray;
            int i;
            char c;
            vxg0 vxg0Var = vxg0.this;
            SparseArray<wxg0> sparseArray2 = vxg0Var.h;
            SparseBooleanArray sparseBooleanArray = vxg0Var.i;
            tid tidVar = vxg0Var.f;
            List<zxf0> list = vxg0Var.c;
            int i2 = vxg0Var.a;
            if (nszVar.w() != 2) {
                return;
            }
            int i3 = 0;
            if (i2 == 1 || i2 == 2 || vxg0Var.n == 1) {
                zxf0Var = list.get(0);
            } else {
                zxf0Var = new zxf0(list.get(0).d());
                list.add(zxf0Var);
            }
            if ((nszVar.w() & 128) == 0) {
                return;
            }
            nszVar.J(1);
            int iC = nszVar.C();
            nszVar.J(3);
            msz mszVar = this.a;
            nszVar.h(mszVar.a, 0, 2);
            mszVar.m(0);
            mszVar.o(3);
            vxg0Var.t = mszVar.g(13);
            nszVar.h(mszVar.a, 0, 2);
            mszVar.m(0);
            mszVar.o(4);
            nszVar.J(mszVar.g(12));
            if (i2 == 2 && vxg0Var.r == null) {
                wxg0 wxg0VarA = tidVar.a(21, new wxg0.b(21, null, 0, null, jrh0.b));
                vxg0Var.r = wxg0VarA;
                if (wxg0VarA != null) {
                    wxg0VarA.b(zxf0Var, vxg0Var.m, new wxg0.c(iC, 21, 8192));
                }
            }
            SparseArray<wxg0> sparseArray3 = this.b;
            sparseArray3.clear();
            SparseIntArray sparseIntArray = this.c;
            sparseIntArray.clear();
            int iA = nszVar.a();
            while (iA > 0) {
                nszVar.h(mszVar.a, i3, 5);
                mszVar.m(i3);
                int iG = mszVar.g(8);
                mszVar.o(3);
                int iG2 = mszVar.g(13);
                mszVar.o(4);
                int iG3 = mszVar.g(12);
                int i4 = nszVar.b;
                msz mszVar2 = mszVar;
                int i5 = i4 + iG3;
                int i6 = -1;
                String str = null;
                ArrayList arrayList = null;
                int iW = 0;
                int i7 = iA;
                while (nszVar.b < i5) {
                    int iW2 = nszVar.w();
                    int iW3 = nszVar.b + nszVar.w();
                    if (iW3 > i5) {
                        break;
                    }
                    SparseArray<wxg0> sparseArray4 = sparseArray2;
                    if (iW2 == 5) {
                        long jY = nszVar.y();
                        if (jY == 1094921523) {
                            i6 = 129;
                        } else if (jY == 1161904947) {
                            i6 = 135;
                        } else if (jY == 1094921524) {
                            i6 = 172;
                        } else if (jY == 1212503619) {
                            i6 = 36;
                        }
                    } else if (iW2 == 106) {
                        iW3 = iW3;
                        i6 = 129;
                    } else if (iW2 == 122) {
                        i6 = 135;
                        iW3 = iW3;
                    } else if (iW2 == 127) {
                        int iW4 = nszVar.w();
                        if (iW4 == 21) {
                            i6 = 172;
                        } else if (iW4 == 14) {
                            i6 = 136;
                        } else if (iW4 == 33) {
                            i6 = 139;
                        }
                    } else if (iW2 == 123) {
                        i6 = 138;
                    } else if (iW2 == 10) {
                        String strTrim = nszVar.u(3, StandardCharsets.UTF_8).trim();
                        iW = nszVar.w();
                        str = strTrim;
                    } else if (iW2 == 89) {
                        ArrayList arrayList2 = new ArrayList();
                        while (nszVar.b < iW3) {
                            String strTrim2 = nszVar.u(3, StandardCharsets.UTF_8).trim();
                            nszVar.w();
                            zxf0 zxf0Var3 = zxf0Var;
                            byte[] bArr = new byte[4];
                            nszVar.h(bArr, 0, 4);
                            arrayList2.add(new wxg0.a(strTrim2, bArr));
                            zxf0Var = zxf0Var3;
                            iW3 = iW3;
                            iC = iC;
                        }
                        iW3 = iW3;
                        iC = iC;
                        zxf0Var = zxf0Var;
                        arrayList = arrayList2;
                        i6 = 89;
                    } else {
                        iW3 = iW3;
                        iC = iC;
                        zxf0Var = zxf0Var;
                        if (iW2 == 111) {
                            i6 = 257;
                        }
                    }
                    nszVar.J(iW3 - nszVar.b);
                    zxf0Var = zxf0Var;
                    sparseArray2 = sparseArray4;
                    iC = iC;
                }
                SparseArray<wxg0> sparseArray5 = sparseArray2;
                int i8 = iC;
                zxf0 zxf0Var4 = zxf0Var;
                nszVar.I(i5);
                wxg0.b bVar = new wxg0.b(i6, str, iW, arrayList, Arrays.copyOfRange(nszVar.a, i4, i5));
                if (iG == 6 || iG == 5) {
                    iG = i6;
                }
                iA = i7 - (iG3 + 5);
                int i9 = i2 == 2 ? iG : iG2;
                if (sparseBooleanArray.get(i9)) {
                    c = 21;
                } else {
                    c = 21;
                    wxg0 wxg0VarA2 = (i2 == 2 && iG == 21) ? vxg0Var.r : tidVar.a(iG, bVar);
                    if (i2 != 2 || iG2 < sparseIntArray.get(i9, 8192)) {
                        sparseIntArray.put(i9, iG2);
                        sparseArray3.put(i9, wxg0VarA2);
                    }
                }
                zxf0Var = zxf0Var4;
                mszVar = mszVar2;
                sparseArray2 = sparseArray5;
                iC = i8;
                i3 = 0;
            }
            SparseArray<wxg0> sparseArray6 = sparseArray2;
            int i10 = iC;
            zxf0 zxf0Var5 = zxf0Var;
            int size = sparseIntArray.size();
            int i11 = 0;
            while (i11 < size) {
                int iKeyAt = sparseIntArray.keyAt(i11);
                int iValueAt = sparseIntArray.valueAt(i11);
                sparseBooleanArray.put(iKeyAt, true);
                vxg0Var.j.put(iValueAt, true);
                wxg0 wxg0VarValueAt = sparseArray3.valueAt(i11);
                if (wxg0VarValueAt != null) {
                    if (wxg0VarValueAt != vxg0Var.r) {
                        m4h m4hVar = vxg0Var.m;
                        i = i10;
                        wxg0.c cVar = new wxg0.c(i, iKeyAt, 8192);
                        zxf0Var2 = zxf0Var5;
                        wxg0VarValueAt.b(zxf0Var2, m4hVar, cVar);
                    } else {
                        zxf0Var2 = zxf0Var5;
                        i = i10;
                    }
                    sparseArray = sparseArray6;
                    sparseArray.put(iValueAt, wxg0VarValueAt);
                } else {
                    zxf0Var2 = zxf0Var5;
                    sparseArray = sparseArray6;
                    i = i10;
                }
                i11++;
                zxf0Var5 = zxf0Var2;
                sparseArray6 = sparseArray;
                i10 = i;
            }
            SparseArray<wxg0> sparseArray7 = sparseArray6;
            if (i2 == 2) {
                if (vxg0Var.o) {
                    return;
                }
                vxg0Var.m.n();
                vxg0Var.n = 0;
                vxg0Var.o = true;
                return;
            }
            sparseArray7.remove(this.d);
            int i12 = i2 == 1 ? 0 : vxg0Var.n - 1;
            vxg0Var.n = i12;
            if (i12 == 0) {
                vxg0Var.m.n();
                vxg0Var.o = true;
            }
        }

        @Override // defpackage.h380
        public final void b(zxf0 zxf0Var, m4h m4hVar, wxg0.c cVar) {
        }
    }
}
