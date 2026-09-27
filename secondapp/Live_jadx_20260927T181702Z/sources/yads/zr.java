package yads;

import com.ironsource.C4235d4;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public abstract class zr implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f158998b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f158999c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f159000d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f159001e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final File f159002f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f159003g;

    public zr(String str, long j10, long j11, long j12, File file) {
        this.f158998b = str;
        this.f158999c = j10;
        this.f159000d = j11;
        this.f159001e = file != null;
        this.f159002f = file;
        this.f159003g = j12;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        zr zrVar = (zr) obj;
        if (!this.f158998b.equals(zrVar.f158998b)) {
            return this.f158998b.compareTo(zrVar.f158998b);
        }
        long j10 = this.f158999c - zrVar.f158999c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public final String toString() {
        return C4235d4.j.f61460d + this.f158999c + ", " + this.f159000d + C4235d4.j.f61462e;
    }
}
