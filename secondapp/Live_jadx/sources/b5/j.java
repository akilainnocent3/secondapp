package b5;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.io.File;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public class j implements Comparable<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f20693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final File f20694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f20695g;

    public j(String str, long j10, long j11) {
        this(str, j10, j11, -9223372036854775807L, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        if (!this.f20690b.equals(jVar.f20690b)) {
            return this.f20690b.compareTo(jVar.f20690b);
        }
        long j10 = this.f20691c - jVar.f20691c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f20693e;
    }

    public boolean c() {
        return this.f20692d == -1;
    }

    public String toString() {
        return C4235d4.j.f61460d + this.f20691c + ", " + this.f20692d + C4235d4.j.f61462e;
    }

    public j(String str, long j10, long j11, long j12, @Nullable File file) {
        this.f20690b = str;
        this.f20691c = j10;
        this.f20692d = j11;
        this.f20693e = file != null;
        this.f20694f = file;
        this.f20695g = j12;
    }
}
