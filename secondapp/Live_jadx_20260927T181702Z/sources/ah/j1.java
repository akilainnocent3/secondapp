package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class j1 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5229b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f5230c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Uri f5231d = Uri.EMPTY;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Map<String, List<String>> f5232e = Collections.EMPTY_MAP;

    public j1(v vVar) {
        this.f5229b = (v) eh.a.g(vVar);
    }

    @Override // ah.v
    public long a(d0 d0Var) throws IOException {
        this.f5231d = d0Var.f5063a;
        this.f5232e = Collections.EMPTY_MAP;
        long jA = this.f5229b.a(d0Var);
        this.f5231d = (Uri) eh.a.g(getUri());
        this.f5232e = getResponseHeaders();
        return jA;
    }

    @Override // ah.v
    public void close() throws IOException {
        this.f5229b.close();
    }

    @Override // ah.v
    public void d(m1 m1Var) {
        eh.a.g(m1Var);
        this.f5229b.d(m1Var);
    }

    public long g() {
        return this.f5230c;
    }

    @Override // ah.v
    public Map<String, List<String>> getResponseHeaders() {
        return this.f5229b.getResponseHeaders();
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        return this.f5229b.getUri();
    }

    public Uri i() {
        return this.f5231d;
    }

    public Map<String, List<String>> j() {
        return this.f5232e;
    }

    public void k() {
        this.f5230c = 0L;
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        int i12 = this.f5229b.read(bArr, i10, i11);
        if (i12 != -1) {
            this.f5230c += (long) i12;
        }
        return i12;
    }
}
