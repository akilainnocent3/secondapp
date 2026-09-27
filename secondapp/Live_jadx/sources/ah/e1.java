package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class e1 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5104b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final b f5105c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5106d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v.a f5107a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f5108b;

        public a(v.a aVar, b bVar) {
            this.f5107a = aVar;
            this.f5108b = bVar;
        }

        @Override // ah.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public e1 createDataSource() {
            return new e1(this.f5107a.createDataSource(), this.f5108b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        Uri a(Uri uri);

        d0 b(d0 d0Var) throws IOException;
    }

    public e1(v vVar, b bVar) {
        this.f5104b = vVar;
        this.f5105c = bVar;
    }

    @Override // ah.v
    public long a(d0 d0Var) throws IOException {
        d0 d0VarB = this.f5105c.b(d0Var);
        this.f5106d = true;
        return this.f5104b.a(d0VarB);
    }

    @Override // ah.v
    public void close() throws IOException {
        if (this.f5106d) {
            this.f5106d = false;
            this.f5104b.close();
        }
    }

    @Override // ah.v
    public void d(m1 m1Var) {
        eh.a.g(m1Var);
        this.f5104b.d(m1Var);
    }

    @Override // ah.v
    public Map<String, List<String>> getResponseHeaders() {
        return this.f5104b.getResponseHeaders();
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        Uri uri = this.f5104b.getUri();
        if (uri == null) {
            return null;
        }
        return this.f5105c.a(uri);
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f5104b.read(bArr, i10, i11);
    }
}
