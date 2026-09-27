package yads;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class li1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f151998a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f151999b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final i73[] f152000c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int[] f152001d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[][][] f152002e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final i73 f152003f;

    public li1(int[] iArr, i73[] i73VarArr, int[] iArr2, int[][][] iArr3, i73 i73Var) {
        this.f151999b = iArr;
        this.f152000c = i73VarArr;
        this.f152002e = iArr3;
        this.f152001d = iArr2;
        this.f152003f = i73Var;
        this.f151998a = iArr.length;
    }

    public final int a(int i10, int i11) {
        int i12 = this.f152000c[i10].a(i11).f149961b;
        int[] iArr = new int[i12];
        int i13 = 0;
        int i14 = 0;
        for (int i15 = 0; i15 < i12; i15++) {
            if ((this.f152002e[i10][i11][i15] & 7) == 4) {
                iArr[i14] = i15;
                i14++;
            }
        }
        int[] iArrCopyOf = Arrays.copyOf(iArr, i14);
        int iMin = 16;
        int i16 = 0;
        String str = null;
        boolean z10 = false;
        while (i13 < iArrCopyOf.length) {
            String str2 = this.f152000c[i10].a(i11).f149964e[iArrCopyOf[i13]].f152729m;
            int i17 = i16 + 1;
            if (i16 == 0) {
                str = str2;
            } else {
                z10 |= !ib3.a(str, str2);
            }
            iMin = Math.min(iMin, this.f152002e[i10][i11][i13] & 24);
            i13++;
            i16 = i17;
        }
        return z10 ? Math.min(iMin, this.f152001d[i10]) : iMin;
    }
}
