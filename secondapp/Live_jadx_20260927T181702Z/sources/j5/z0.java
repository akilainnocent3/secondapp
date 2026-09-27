package j5;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import x4.m1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@m1
public final class z0 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.z f99717b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f99718c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f99719d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f99720e;

    public z0(a5.z zVar, Uri uri, Map<String, List<String>> map, long j10, Throwable th2) {
        super(th2);
        this.f99717b = zVar;
        this.f99718c = uri;
        this.f99719d = map;
        this.f99720e = j10;
    }
}
