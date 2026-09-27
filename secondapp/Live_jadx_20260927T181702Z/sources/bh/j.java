package bh;

import androidx.annotation.Nullable;
import com.ironsource.C4235d4;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class j implements Comparable<j> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f21387b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f21388c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f21389d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f21390e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final File f21391f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21392g;

    public j(String str, long j10, long j11) {
        this(str, j10, j11, -9223372036854775807L, null);
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(j jVar) {
        if (!this.f21387b.equals(jVar.f21387b)) {
            return this.f21387b.compareTo(jVar.f21387b);
        }
        long j10 = this.f21388c - jVar.f21388c;
        if (j10 == 0) {
            return 0;
        }
        return j10 < 0 ? -1 : 1;
    }

    public boolean b() {
        return !this.f21390e;
    }

    public boolean c() {
        return this.f21389d == -1;
    }

    public String toString() {
        return C4235d4.j.f61460d + this.f21388c + ", " + this.f21389d + C4235d4.j.f61462e;
    }

    public j(String str, long j10, long j11, long j12, @Nullable File file) {
        this.f21387b = str;
        this.f21388c = j10;
        this.f21389d = j11;
        this.f21390e = file != null;
        this.f21391f = file;
        this.f21392g = j12;
    }
}
