package yads;

import android.net.Uri;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Uri f155683a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f155686d;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public String f155688f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f155689g;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f155684b = 1;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f155685c = Collections.EMPTY_MAP;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f155687e = -1;

    public final u30 a() {
        ni.a(this.f155683a, "The uri must be set.");
        return new u30(this.f155683a, 0L, this.f155684b, null, this.f155685c, this.f155686d, this.f155687e, this.f155688f, this.f155689g, null);
    }

    public final t30 a(int i10) {
        this.f155689g = i10;
        return this;
    }

    public final t30 a(String str) {
        this.f155688f = str;
        return this;
    }

    public final t30 a(Uri uri) {
        this.f155683a = uri;
        return this;
    }
}
