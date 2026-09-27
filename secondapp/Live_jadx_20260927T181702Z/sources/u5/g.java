package u5;

import a5.v1;
import a5.z;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import s5.e0;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public abstract class g implements z5.s.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f139194a = e0.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f139195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f139196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final androidx.media3.common.a f139197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f139198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Object f139199f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f139200g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f139201h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v1 f139202i;

    public g(a5.r rVar, z zVar, int i10, androidx.media3.common.a aVar, int i11, @Nullable Object obj, long j10, long j11) {
        this.f139202i = new v1(rVar);
        this.f139195b = (z) l0.E(zVar);
        this.f139196c = i10;
        this.f139197d = aVar;
        this.f139198e = i11;
        this.f139199f = obj;
        this.f139200g = j10;
        this.f139201h = j11;
    }

    public final long a() {
        return this.f139202i.a();
    }

    public final long b() {
        return this.f139201h - this.f139200g;
    }

    public final Map<String, List<String>> c() {
        return this.f139202i.d();
    }

    public final Uri d() {
        return this.f139202i.c();
    }
}
