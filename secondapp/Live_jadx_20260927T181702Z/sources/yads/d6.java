package yads;

import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class d6 implements xq {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final wq f148077i = new wq() { // from class: yads.kz3
        @Override // yads.wq
        public final xq fromBundle(Bundle bundle) {
            return d6.a(bundle);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f148078b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f148079c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Uri[] f148080d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int[] f148081e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long[] f148082f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f148083g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final boolean f148084h;

    public d6(long j10, int i10, int[] iArr, Uri[] uriArr, long[] jArr, long j11, boolean z10) {
        ni.a(iArr.length == uriArr.length);
        this.f148078b = j10;
        this.f148079c = i10;
        this.f148081e = iArr;
        this.f148080d = uriArr;
        this.f148082f = jArr;
        this.f148083g = j11;
        this.f148084h = z10;
    }

    public static d6 a(Bundle bundle) {
        long j10 = bundle.getLong(Integer.toString(0, 36));
        int i10 = bundle.getInt(Integer.toString(1, 36), -1);
        ArrayList parcelableArrayList = bundle.getParcelableArrayList(Integer.toString(2, 36));
        int[] intArray = bundle.getIntArray(Integer.toString(3, 36));
        long[] longArray = bundle.getLongArray(Integer.toString(4, 36));
        long j11 = bundle.getLong(Integer.toString(5, 36));
        boolean z10 = bundle.getBoolean(Integer.toString(6, 36));
        int[] iArr = intArray;
        if (iArr == null) {
            iArr = new int[0];
        }
        Uri[] uriArr = parcelableArrayList == null ? new Uri[0] : (Uri[]) parcelableArrayList.toArray(new Uri[0]);
        if (longArray == null) {
            longArray = new long[0];
        }
        return new d6(j10, i10, iArr, uriArr, longArray, j11, z10);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && d6.class == obj.getClass()) {
            d6 d6Var = (d6) obj;
            if (this.f148078b == d6Var.f148078b && this.f148079c == d6Var.f148079c && Arrays.equals(this.f148080d, d6Var.f148080d) && Arrays.equals(this.f148081e, d6Var.f148081e) && Arrays.equals(this.f148082f, d6Var.f148082f) && this.f148083g == d6Var.f148083g && this.f148084h == d6Var.f148084h) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = this.f148079c * 31;
        long j10 = this.f148078b;
        int iHashCode = (Arrays.hashCode(this.f148082f) + ((Arrays.hashCode(this.f148081e) + ((((i10 + ((int) (j10 ^ (j10 >>> 32)))) * 31) + Arrays.hashCode(this.f148080d)) * 31)) * 31)) * 31;
        long j11 = this.f148083g;
        return ((iHashCode + ((int) (j11 ^ (j11 >>> 32)))) * 31) + (this.f148084h ? 1 : 0);
    }

    public final int a(int i10) {
        int i11;
        int i12 = i10 + 1;
        while (true) {
            int[] iArr = this.f148081e;
            if (i12 >= iArr.length || this.f148084h || (i11 = iArr[i12]) == 0 || i11 == 1) {
                break;
            }
            i12++;
        }
        return i12;
    }

    public final d6 a() {
        int[] iArr = this.f148081e;
        int length = iArr.length;
        int iMax = Math.max(0, length);
        int[] iArrCopyOf = Arrays.copyOf(iArr, iMax);
        Arrays.fill(iArrCopyOf, length, iMax, 0);
        long[] jArr = this.f148082f;
        int length2 = jArr.length;
        int iMax2 = Math.max(0, length2);
        long[] jArrCopyOf = Arrays.copyOf(jArr, iMax2);
        Arrays.fill(jArrCopyOf, length2, iMax2, -9223372036854775807L);
        return new d6(this.f148078b, 0, iArrCopyOf, (Uri[]) Arrays.copyOf(this.f148080d, 0), jArrCopyOf, this.f148083g, this.f148084h);
    }
}
