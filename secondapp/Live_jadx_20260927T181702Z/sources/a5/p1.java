package a5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class p1 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f3766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final u4.x1 f3767b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3768c;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements r.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final r.a f3769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final u4.x1 f3770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f3771c;

        public a(r.a aVar, u4.x1 x1Var, int i10) {
            this.f3769a = aVar;
            this.f3770b = x1Var;
            this.f3771c = i10;
        }

        @Override // a5.r.a
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public p1 createDataSource() {
            return new p1(this.f3769a.createDataSource(), this.f3770b, this.f3771c);
        }
    }

    public p1(r rVar, u4.x1 x1Var, int i10) {
        this.f3766a = (r) zi.l0.E(rVar);
        this.f3767b = (u4.x1) zi.l0.E(x1Var);
        this.f3768c = i10;
    }

    @Override // a5.r
    public void addTransferListener(x1 x1Var) {
        zi.l0.E(x1Var);
        this.f3766a.addTransferListener(x1Var);
    }

    @Override // a5.r
    public void close() throws IOException {
        this.f3766a.close();
    }

    @Override // a5.r
    public Map<String, List<String>> getResponseHeaders() {
        return this.f3766a.getResponseHeaders();
    }

    @Override // a5.r
    @Nullable
    public Uri getUri() {
        return this.f3766a.getUri();
    }

    @Override // a5.r
    public long open(z zVar) throws IOException {
        this.f3767b.d(this.f3768c);
        return this.f3766a.open(zVar);
    }

    @Override // u4.c0
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        this.f3767b.d(this.f3768c);
        return this.f3766a.read(bArr, i10, i11);
    }
}
