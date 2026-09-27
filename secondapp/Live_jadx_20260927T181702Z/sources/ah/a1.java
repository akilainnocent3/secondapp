package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class a1 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5036b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final eh.v0 f5037c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f5038d;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements v.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final v.a f5039a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final eh.v0 f5040b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f5041c;

        public a(v.a aVar, eh.v0 v0Var, int i10) {
            this.f5039a = aVar;
            this.f5040b = v0Var;
            this.f5041c = i10;
        }

        @Override // ah.v.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public a1 createDataSource() {
            return new a1(this.f5039a.createDataSource(), this.f5040b, this.f5041c);
        }
    }

    public a1(v vVar, eh.v0 v0Var, int i10) {
        this.f5036b = (v) eh.a.g(vVar);
        this.f5037c = (eh.v0) eh.a.g(v0Var);
        this.f5038d = i10;
    }

    @Override // ah.v
    public long a(d0 d0Var) throws IOException {
        this.f5037c.d(this.f5038d);
        return this.f5036b.a(d0Var);
    }

    @Override // ah.v
    public void close() throws IOException {
        this.f5036b.close();
    }

    @Override // ah.v
    public void d(m1 m1Var) {
        eh.a.g(m1Var);
        this.f5036b.d(m1Var);
    }

    @Override // ah.v
    public Map<String, List<String>> getResponseHeaders() {
        return this.f5036b.getResponseHeaders();
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        return this.f5036b.getUri();
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f5037c.d(this.f5038d);
        return this.f5036b.read(bArr, i10, i11);
    }
}
