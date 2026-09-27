package fb;

import cv.z0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f83819a = 1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f83820b = 2;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f83821c = 3;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f83822d = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f83823e = 5;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f83824f = 6;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f83825g = 7;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f83826h = 8;

    public static String a(int i10, int[] iArr, String[] strArr, int[] iArr2) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(z0.f77338c);
        for (int i11 = 0; i11 < i10; i11++) {
            int i12 = iArr[i11];
            if (i12 == 1 || i12 == 2) {
                sb2.append(fw.b.f85384k);
                sb2.append(iArr2[i11]);
                sb2.append(fw.b.f85385l);
            } else if (i12 == 3 || i12 == 4 || i12 == 5) {
                sb2.append(kj.e.f102543c);
                String str = strArr[i11];
                if (str != null) {
                    sb2.append(str);
                }
            }
        }
        return sb2.toString();
    }
}
