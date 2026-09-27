package a5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class t1 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3784a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f3785b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f3786c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r.a f3787a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f3788b;

        public a(r.a aVar, b bVar) {
            this.f3787a = aVar;
            this.f3788b = bVar;
        }

        @Override // a5.r.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public t1 createDataSource() {
            return new t1(this.f3787a.createDataSource(), this.f3788b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface b {
        Uri a(Uri uri);

        z b(z zVar) throws IOException;
    }

    public t1(r rVar, b bVar) {
        this.f3784a = rVar;
        this.f3785b = bVar;
    }

    @Override // a5.r
    public void addTransferListener(x1 x1Var) {
        zi.l0.E(x1Var);
        this.f3784a.addTransferListener(x1Var);
    }

    @Override // a5.r
    public void close() throws IOException {
        if (this.f3786c) {
            this.f3786c = false;
            this.f3784a.close();
        }
    }

    @Override // a5.r
    public Map<String, List<String>> getResponseHeaders() {
        return this.f3784a.getResponseHeaders();
    }

    @Override // a5.r
    @Nullable
    public Uri getUri() {
        Uri uri = this.f3784a.getUri();
        if (uri == null) {
            return null;
        }
        return this.f3785b.a(uri);
    }

    @Override // a5.r
    public long open(z zVar) throws IOException {
        z zVarB = this.f3785b.b(zVar);
        this.f3786c = true;
        return this.f3784a.open(zVarB);
    }

    @Override // u4.c0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        return this.f3784a.read(bArr, i10, i11);
    }
}
