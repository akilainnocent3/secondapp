package yads;

import java.util.ArrayList;
import java.util.Collections;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class gr {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final fr f149745e = new fr();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f149746a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ArrayList f149747b = new ArrayList(64);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f149748c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f149749d = 4096;

    public final synchronized byte[] a(int i10) {
        for (int i11 = 0; i11 < this.f149747b.size(); i11++) {
            byte[] bArr = (byte[]) this.f149747b.get(i11);
            if (bArr.length >= i10) {
                this.f149748c -= bArr.length;
                this.f149747b.remove(i11);
                this.f149746a.remove(bArr);
                return bArr;
            }
        }
        return new byte[i10];
    }

    public final synchronized void a(byte[] bArr) {
        if (bArr != null) {
            if (bArr.length <= this.f149749d) {
                this.f149746a.add(bArr);
                int iBinarySearch = Collections.binarySearch(this.f149747b, bArr, f149745e);
                if (iBinarySearch < 0) {
                    iBinarySearch = (-iBinarySearch) - 1;
                }
                this.f149747b.add(iBinarySearch, bArr);
                this.f149748c += bArr.length;
                a();
            }
        }
    }

    public final synchronized void a() {
        while (this.f149748c > this.f149749d) {
            byte[] bArr = (byte[]) this.f149746a.remove(0);
            this.f149747b.remove(bArr);
            this.f149748c -= bArr.length;
        }
    }
}
