package z5;

import a5.v1;
import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Map;
import s5.e0;
import x4.b2;
import x4.m1;
import zi.l0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@m1
public final class v<T> implements s.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f160525a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a5.z f160526b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f160527c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final v1 f160528d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final a<? extends T> f160529e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    public volatile T f160530f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a<T> {
        T parse(Uri uri, InputStream inputStream) throws IOException;
    }

    public v(a5.r rVar, Uri uri, int i10, a<? extends T> aVar) {
        this(rVar, new a5.z.b().j(uri).c(1).a(), i10, aVar);
    }

    public static <T> T e(a5.r rVar, a<? extends T> aVar, a5.z zVar, int i10) throws IOException {
        v vVar = new v(rVar, zVar, i10, aVar);
        vVar.load();
        return (T) l0.E(vVar.c());
    }

    public static <T> T f(a5.r rVar, a<? extends T> aVar, Uri uri, int i10) throws IOException {
        v vVar = new v(rVar, uri, i10, aVar);
        vVar.load();
        return (T) l0.E(vVar.c());
    }

    public long a() {
        return this.f160528d.a();
    }

    public Map<String, List<String>> b() {
        return this.f160528d.d();
    }

    @Nullable
    public final T c() {
        return this.f160530f;
    }

    public Uri d() {
        return this.f160528d.c();
    }

    @Override // z5.s.e
    public final void load() throws IOException {
        this.f160528d.e();
        a5.x xVar = new a5.x(this.f160528d, this.f160526b);
        try {
            xVar.k();
            this.f160530f = this.f160529e.parse((Uri) l0.E(this.f160528d.getUri()), xVar);
        } finally {
            b2.t(xVar);
        }
    }

    public v(a5.r rVar, a5.z zVar, int i10, a<? extends T> aVar) {
        this.f160528d = new v1(rVar);
        this.f160526b = zVar;
        this.f160527c = i10;
        this.f160529e = aVar;
        this.f160525a = e0.b();
    }

    @Override // z5.s.e
    public final void cancelLoad() {
    }
}
