package bg;

import ah.d0;
import ah.j1;
import ah.v;
import ah.v0;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.util.List;
import java.util.Map;
import re.n2;
import zf.z;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public abstract class f implements v0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f21248a = z.a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f21249b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f21250c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n2 f21251d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f21252e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public final Object f21253f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f21254g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final long f21255h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j1 f21256i;

    public f(v vVar, d0 d0Var, int i10, n2 n2Var, int i11, @Nullable Object obj, long j10, long j11) {
        this.f21256i = new j1(vVar);
        this.f21249b = (d0) eh.a.g(d0Var);
        this.f21250c = i10;
        this.f21251d = n2Var;
        this.f21252e = i11;
        this.f21253f = obj;
        this.f21254g = j10;
        this.f21255h = j11;
    }

    public final long a() {
        return this.f21256i.g();
    }

    public final long b() {
        return this.f21255h - this.f21254g;
    }

    public final Map<String, List<String>> c() {
        return this.f21256i.j();
    }

    public final Uri d() {
        return this.f21256i.i();
    }
}
