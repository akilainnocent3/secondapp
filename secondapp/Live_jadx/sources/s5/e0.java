package s5;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@x4.m1
public final class e0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLong f129147h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f129148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.z f129149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f129150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f129151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f129152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f129153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f129154g;

    public e0(long j10, a5.z zVar, long j11) {
        this(j10, zVar, zVar.f3834a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long b() {
        return f129147h.getAndIncrement();
    }

    public e0 a(long j10, long j11) {
        return new e0(j10, this.f129149b, this.f129150c, this.f129151d, this.f129152e, j11, this.f129154g);
    }

    public e0(long j10, a5.z zVar, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f129148a = j10;
        this.f129149b = zVar;
        this.f129150c = uri;
        this.f129151d = map;
        this.f129152e = j11;
        this.f129153f = j12;
        this.f129154g = j13;
    }
}
