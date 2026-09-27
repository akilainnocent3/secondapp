package zf;

import android.net.Uri;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final AtomicLong f161508h = new AtomicLong();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f161509a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.d0 f161510b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f161511c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f161512d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f161513e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final long f161514f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f161515g;

    public z(long j10, ah.d0 d0Var, long j11) {
        this(j10, d0Var, d0Var.f5063a, Collections.EMPTY_MAP, j11, 0L, 0L);
    }

    public static long a() {
        return f161508h.getAndIncrement();
    }

    public z(long j10, ah.d0 d0Var, Uri uri, Map<String, List<String>> map, long j11, long j12, long j13) {
        this.f161509a = j10;
        this.f161510b = d0Var;
        this.f161511c = uri;
        this.f161512d = map;
        this.f161513e = j11;
        this.f161514f = j12;
        this.f161515g = j13;
    }
}
