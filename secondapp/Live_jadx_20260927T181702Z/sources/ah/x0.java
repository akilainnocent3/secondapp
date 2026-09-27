package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class x0<T> implements v0.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f5412a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d0 f5413b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f5414c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final j1 f5415d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<? extends T> f5416e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public volatile T f5417f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public x0(v vVar, Uri uri, int i10, a<? extends T> aVar) {
        this(vVar, new d0.b().j(uri).c(1).a(), i10, aVar);
    }

    public static <T> T e(v vVar, a<? extends T> aVar, d0 d0Var, int i10) throws IOException {
        x0 x0Var = new x0(vVar, d0Var, i10, aVar);
        x0Var.load();
        return (T) eh.a.g(x0Var.c());
    }

    public static <T> T f(v vVar, a<? extends T> aVar, Uri uri, int i10) throws IOException {
        x0 x0Var = new x0(vVar, uri, i10, aVar);
        x0Var.load();
        return (T) eh.a.g(x0Var.c());
    }

    public long a() {
        return this.f5415d.g();
    }

    public Map<String, List<String>> b() {
        return this.f5415d.j();
    }

    @Nullable
    public final T c() {
        return this.f5417f;
    }

    public Uri d() {
        return this.f5415d.i();
    }

    @Override // ah.v0.e
    public final void load() throws IOException {
        this.f5415d.k();
        b0 b0Var = new b0(this.f5415d, this.f5413b);
        try {
            b0Var.k();
            this.f5417f = this.f5416e.parse((Uri) eh.a.g(this.f5415d.getUri()), b0Var);
        } finally {
            eh.o1.t(b0Var);
        }
    }

    public x0(v vVar, d0 d0Var, int i10, a<? extends T> aVar) {
        this.f5415d = new j1(vVar);
        this.f5413b = d0Var;
        this.f5414c = i10;
        this.f5416e = aVar;
        this.f5412a = zf.z.a();
    }

    @Override // ah.v0.e
    public final void cancelLoad() {
    }
}
