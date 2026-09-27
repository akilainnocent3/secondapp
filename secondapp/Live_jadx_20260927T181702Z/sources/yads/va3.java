package yads;

import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class va3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f156887a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f156888b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String[] f156889c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f156890d;

    public va3(String[] strArr, int[] iArr, String[] strArr2, int i10) {
        this.f156887a = strArr;
        this.f156888b = iArr;
        this.f156889c = strArr2;
        this.f156890d = i10;
    }

    public final String a(String str, long j10, int i10, long j11) {
        StringBuilder sb2 = new StringBuilder();
        int i11 = 0;
        while (true) {
            int i12 = this.f156890d;
            if (i11 >= i12) {
                sb2.append(this.f156887a[i12]);
                return sb2.toString();
            }
            sb2.append(this.f156887a[i11]);
            int i13 = this.f156888b[i11];
            if (i13 == 1) {
                sb2.append(str);
            } else if (i13 == 2) {
                sb2.append(String.format(Locale.US, this.f156889c[i11], Long.valueOf(j10)));
            } else if (i13 == 3) {
                sb2.append(String.format(Locale.US, this.f156889c[i11], Integer.valueOf(i10)));
            } else if (i13 == 4) {
                sb2.append(String.format(Locale.US, this.f156889c[i11], Long.valueOf(j11)));
            }
            i11++;
        }
    }
}
