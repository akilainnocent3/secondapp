package com.facebook.ads.redexgen.core;

import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.TreeSet;
import l3.a;

/* JADX INFO: renamed from: com.facebook.ads.redexgen.X.Mg, reason: case insensitive filesystem */
/* JADX INFO: loaded from: assets/audience_network/classes2.dex */
public final class C2139Mg {
    public static byte[] A05;
    public static String[] A06 = {"nQDli3B322dNyuNUEmcA1lNjVYYmcThQ", "JG8wfEU3nZ2EADYXO0uZDMHFqmVSkpWr", "8K0NmfCVVugnhGVgpCD", "5JHmUKWu4ei3dzUY0lNr", "xKwnuhTKVDH3YhaAiUGpqwLltg47C3CG", "Jcwv8MY0", "vBOLiuiZ", "hny3hth3cGmNH4IG9ndqfAmzri4VXjHL"};
    public C3110kN A00;
    public final int A01;
    public final String A02;
    public final ArrayList<C2138Mf> A03;
    public final TreeSet<C3108kL> A04;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 47);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A05 = new byte[]{115, a.f103484u7, a.f103452q7, 115, -100, -70, -68, a.f103444p7, -66, -67, -100, -56, a.f103484u7, a.f103520y7, -66, a.f103484u7, a.f103520y7, a.f103484u7, -30, -22, -19, -26, -27, -95, -11, -16, -95, -13, -26, -17, -30, -18, -26, -95};
    }

    static {
        A01();
    }

    public C2139Mg(int i10, String str) {
        this(i10, str, C3110kN.A03);
    }

    public C2139Mg(int i10, String str, C3110kN c3110kN) {
        this.A01 = i10;
        this.A02 = str;
        this.A00 = c3110kN;
        this.A04 = new TreeSet<>();
        this.A03 = new ArrayList<>();
    }

    public final long A02(long j10, long j11) {
        boolean z10 = true;
        AbstractC16843y.A07(j10 >= 0);
        if (j11 < 0) {
            z10 = false;
        }
        AbstractC16843y.A07(z10);
        C3108kL c3108kLA04 = A04(j10, j11);
        if (c3108kLA04.A03()) {
            return -Math.min(c3108kLA04.A04() ? Long.MAX_VALUE : c3108kLA04.A01, j11);
        }
        long j12 = j10 + j11;
        if (j12 < 0) {
            j12 = Long.MAX_VALUE;
        }
        long currentEndPosition = c3108kLA04.A02 + c3108kLA04.A01;
        if (currentEndPosition < j12) {
            TreeSet<C3108kL> treeSet = this.A04;
            String[] strArr = A06;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A06;
            strArr2[2] = "31viDRwdD8ErVcI5dXS";
            strArr2[3] = "q1k4diPGE3D0s4ujqDJA";
            for (C3108kL c3108kL : treeSet.tailSet(c3108kLA04, false)) {
                if (c3108kL.A02 > currentEndPosition) {
                    break;
                }
                long j13 = c3108kL.A02;
                long queryEndPosition = c3108kL.A01;
                currentEndPosition = Math.max(currentEndPosition, j13 + queryEndPosition);
                if (currentEndPosition >= j12) {
                    break;
                }
            }
        }
        return Math.min(currentEndPosition - j10, j11);
    }

    public final C3110kN A03() {
        return this.A00;
    }

    public final C3108kL A04(long j10, long j11) {
        C3108kL c3108kLA03 = C3108kL.A03(this.A02, j10);
        C3108kL c3108kLFloor = this.A04.floor(c3108kLA03);
        if (c3108kLFloor != null && c3108kLFloor.A02 + c3108kLFloor.A01 > j10) {
            return c3108kLFloor;
        }
        C3108kL lookupSpan = this.A04.ceiling(c3108kLA03);
        if (lookupSpan != null) {
            long jMin = lookupSpan.A02 - j10;
            if (j11 != -1) {
                jMin = Math.min(jMin, j11);
            }
            j11 = jMin;
        }
        return C3108kL.A04(this.A02, j10, j11);
    }

    public final C3108kL A05(C3108kL c3108kL, long j10, boolean z10) {
        AbstractC16843y.A08(this.A04.remove(c3108kL));
        File file = (File) AbstractC16843y.A01(c3108kL.A03);
        if (z10) {
            File file2 = file.getParentFile();
            File fileA05 = C3108kL.A05((File) AbstractC16843y.A01(file2), this.A01, c3108kL.A02, j10);
            if (file.renameTo(fileA05)) {
                file = fileA05;
            } else {
                AbstractC16924g.A07(A00(4, 13, 42), A00(17, 17, 82) + file + A00(0, 4, 36) + fileA05);
            }
        }
        C3108kL newCacheSpan = c3108kL.A09(file, j10);
        this.A04.add(newCacheSpan);
        return newCacheSpan;
    }

    public final TreeSet<C3108kL> A06() {
        return this.A04;
    }

    public final void A07(long j10) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A03.get(i10).A01 == j10) {
                this.A03.remove(i10);
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void A08(C3108kL c3108kL) {
        this.A04.add(c3108kL);
    }

    public final boolean A09() {
        return this.A04.isEmpty();
    }

    public final boolean A0A() {
        return this.A03.isEmpty();
    }

    public final boolean A0B(long j10, long j11) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A03.get(i10).A00(j10, j11)) {
                return true;
            }
        }
        return false;
    }

    public final boolean A0C(long j10, long j11) {
        for (int i10 = 0; i10 < i; i10++) {
            if (this.A03.get(i10).A01(j10, j11)) {
                return false;
            }
        }
        this.A03.add(new C2138Mf(j10, j11));
        return true;
    }

    public final boolean A0D(MZ mz) {
        if (this.A04.remove(mz)) {
            if (mz.A03 != null) {
                mz.A03.delete();
                return true;
            }
            return true;
        }
        String[] strArr = A06;
        if (strArr[2].length() == strArr[3].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A06;
        strArr2[2] = "U4uu0ltzeeg5QMm1KwS";
        strArr2[3] = "VtFGErd1YdVsfyUNL3Po";
        return false;
    }

    public final boolean A0E(C2144Ml c2144Ml) {
        C3110kN c3110kN = this.A00;
        C3110kN oldMetadata = this.A00;
        this.A00 = oldMetadata.A05(c2144Ml);
        C3110kN oldMetadata2 = this.A00;
        return !oldMetadata2.equals(c3110kN);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C2139Mg c2139Mg = (C2139Mg) obj;
        if (this.A01 == c2139Mg.A01 && this.A02.equals(c2139Mg.A02) && this.A04.equals(c2139Mg.A04) && this.A00.equals(c2139Mg.A00)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A01;
        int i10 = result * 31;
        int result2 = this.A02.hashCode();
        return ((i10 + result2) * 31) + this.A00.hashCode();
    }
}
