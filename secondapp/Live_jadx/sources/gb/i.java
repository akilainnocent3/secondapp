package gb;

import androidx.media3.session.fe;
import u1.i0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f86372e = 5;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String[] f86373a = new String[5];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long[] f86374b = new long[5];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f86375c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f86376d = 0;

    public void a(String str) {
        int i10 = this.f86375c;
        if (i10 == 5) {
            this.f86376d++;
            return;
        }
        this.f86373a[i10] = str;
        this.f86374b[i10] = System.nanoTime();
        i0.b(str);
        this.f86375c++;
    }

    public float b(String str) {
        int i10 = this.f86376d;
        if (i10 > 0) {
            this.f86376d = i10 - 1;
            return 0.0f;
        }
        int i11 = this.f86375c - 1;
        this.f86375c = i11;
        if (i11 == -1) {
            throw new IllegalStateException("Can't end trace section. There are none.");
        }
        if (str.equals(this.f86373a[i11])) {
            i0.d();
            return (System.nanoTime() - this.f86374b[this.f86375c]) / 1000000.0f;
        }
        throw new IllegalStateException("Unbalanced trace call " + str + ". Expected " + this.f86373a[this.f86375c] + fe.F);
    }
}
