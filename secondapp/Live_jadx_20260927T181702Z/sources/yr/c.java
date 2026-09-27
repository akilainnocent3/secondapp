package yr;

import dr.l1;
import f6.q;
import kotlin.jvm.internal.s1;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@s1({"SMAP\nBase64.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n*L\n1#1,843:1\n13547#2,3:844\n13547#2,3:847\n*S KotlinDebug\n*F\n+ 1 Base64.kt\nkotlin/io/encoding/Base64Kt\n*L\n785#1:844,3\n801#1:847,3\n*E\n"})
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l
    public static final byte[] f159829a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l
    public static final int[] f159830b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l
    public static final byte[] f159831c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @l
    public static final int[] f159832d;

    static {
        byte[] bArr = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, q.f83619w, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, q.A, 114, 115, 116, 117, 118, 119, rg.a.f127263w, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47};
        f159829a = bArr;
        int[] iArr = new int[256];
        fr.q.T1(iArr, -1, 0, 0, 6, null);
        iArr[61] = -2;
        int length = bArr.length;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        while (i11 < length) {
            iArr[bArr[i11]] = i12;
            i11++;
            i12++;
        }
        f159830b = iArr;
        byte[] bArr2 = {65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, q.f83619w, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, q.A, 114, 115, 116, 117, 118, 119, rg.a.f127263w, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 45, 95};
        f159831c = bArr2;
        int[] iArr2 = new int[256];
        fr.q.T1(iArr2, -1, 0, 0, 6, null);
        iArr2[61] = -2;
        int length2 = bArr2.length;
        int i13 = 0;
        while (i10 < length2) {
            iArr2[bArr2[i10]] = i13;
            i10++;
            i13++;
        }
        f159832d = iArr2;
    }

    @l1(version = "1.8")
    public static final boolean e(int i10) {
        if (i10 < 0) {
            return false;
        }
        int[] iArr = f159830b;
        return i10 < iArr.length && iArr[i10] != -1;
    }
}
