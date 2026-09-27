package com.bytedance.sdk.component.tq.hww.tq;

import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
final class vgm extends vy {

    /* JADX INFO: renamed from: ok, reason: collision with root package name */
    final transient int[] f35060ok;
    final transient byte[][] vgm;

    public vgm(hww hwwVar, int i10) {
        super(null);
        rs.hww(hwwVar.f35059tq, 0L, i10);
        hv hvVar = hwwVar.hww;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (i12 < i10) {
            int i14 = hvVar.f35056sd;
            int i15 = hvVar.f35057tq;
            if (i14 == i15) {
                throw new AssertionError("s.limit == s.pos");
            }
            i12 += i14 - i15;
            i13++;
            hvVar = hvVar.f35054hu;
        }
        this.vgm = new byte[i13][];
        this.f35060ok = new int[i13 * 2];
        hv hvVar2 = hwwVar.hww;
        int i16 = 0;
        while (i11 < i10) {
            byte[][] bArr = this.vgm;
            bArr[i16] = hvVar2.hww;
            int i17 = hvVar2.f35056sd;
            int i18 = hvVar2.f35057tq;
            i11 += i17 - i18;
            if (i11 > i10) {
                i11 = i10;
            }
            int[] iArr = this.f35060ok;
            iArr[i16] = i11;
            iArr[bArr.length + i16] = i18;
            hvVar2.vy = true;
            i16++;
            hvVar2 = hvVar2.f35054hu;
        }
    }

    private vy hv() {
        return new vy(vy());
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof vy) {
            vy vyVar = (vy) obj;
            if (vyVar.sd() == sd() && hww(0, vyVar, 0, sd())) {
                return true;
            }
        }
        return false;
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public int hashCode() {
        int i10 = this.f35064hv;
        if (i10 != 0) {
            return i10;
        }
        int length = this.vgm.length;
        int i11 = 0;
        int i12 = 1;
        int i13 = 0;
        while (i11 < length) {
            byte[] bArr = this.vgm[i11];
            int[] iArr = this.f35060ok;
            int i14 = iArr[length + i11];
            int i15 = iArr[i11];
            int i16 = (i15 - i13) + i14;
            while (i14 < i16) {
                i12 = (i12 * 31) + bArr[i14];
                i14++;
            }
            i11++;
            i13 = i15;
        }
        this.f35064hv = i12;
        return i12;
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public String hww() {
        return hv().hww();
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public int sd() {
        return this.f35060ok[this.vgm.length - 1];
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public String toString() {
        return hv().toString();
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public String tq() {
        return hv().tq();
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public byte[] vy() {
        int[] iArr = this.f35060ok;
        byte[][] bArr = this.vgm;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int[] iArr2 = this.f35060ok;
            int i12 = iArr2[length + i10];
            int i13 = iArr2[i10];
            System.arraycopy(this.vgm[i10], i12, bArr2, i11, i13 - i11);
            i10++;
            i11 = i13;
        }
        return bArr2;
    }

    private int tq(int i10) {
        int iBinarySearch = Arrays.binarySearch(this.f35060ok, 0, this.vgm.length, i10 + 1);
        return iBinarySearch >= 0 ? iBinarySearch : ~iBinarySearch;
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public vy hww(int i10, int i11) {
        return hv().hww(i10, i11);
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public byte hww(int i10) {
        rs.hww(this.f35060ok[this.vgm.length - 1], i10, 1L);
        int iTq = tq(i10);
        int i11 = iTq == 0 ? 0 : this.f35060ok[iTq - 1];
        int[] iArr = this.f35060ok;
        byte[][] bArr = this.vgm;
        return bArr[iTq][(i10 - i11) + iArr[bArr.length + iTq]];
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public boolean hww(int i10, vy vyVar, int i11, int i12) {
        if (i10 < 0 || i10 > sd() - i12) {
            return false;
        }
        int iTq = tq(i10);
        while (i12 > 0) {
            int i13 = iTq == 0 ? 0 : this.f35060ok[iTq - 1];
            int iMin = Math.min(i12, ((this.f35060ok[iTq] - i13) + i13) - i10);
            int[] iArr = this.f35060ok;
            byte[][] bArr = this.vgm;
            if (!vyVar.hww(i11, bArr[iTq], (i10 - i13) + iArr[bArr.length + iTq], iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iTq++;
        }
        return true;
    }

    @Override // com.bytedance.sdk.component.tq.hww.tq.vy
    public boolean hww(int i10, byte[] bArr, int i11, int i12) {
        if (i10 < 0 || i10 > sd() - i12 || i11 < 0 || i11 > bArr.length - i12) {
            return false;
        }
        int iTq = tq(i10);
        while (i12 > 0) {
            int i13 = iTq == 0 ? 0 : this.f35060ok[iTq - 1];
            int iMin = Math.min(i12, ((this.f35060ok[iTq] - i13) + i13) - i10);
            int[] iArr = this.f35060ok;
            byte[][] bArr2 = this.vgm;
            if (!rs.hww(bArr2[iTq], (i10 - i13) + iArr[bArr2.length + iTq], bArr, i11, iMin)) {
                return false;
            }
            i10 += iMin;
            i11 += iMin;
            i12 -= iMin;
            iTq++;
        }
        return true;
    }
}
