package ze;

import android.net.Uri;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class d0 extends IOException {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.d0 f160983b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Uri f160984c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map<String, List<String>> f160985d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final long f160986e;

    public d0(ah.d0 d0Var, Uri uri, Map<String, List<String>> map, long j10, Throwable th2) {
        super(th2);
        this.f160983b = d0Var;
        this.f160984c = uri;
        this.f160985d = map;
        this.f160986e = j10;
    }
}
