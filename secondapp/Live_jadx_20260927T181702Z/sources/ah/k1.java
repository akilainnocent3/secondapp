package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class k1 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final v f5244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f5245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f5246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f5247e;

    public k1(v vVar, t tVar) {
        this.f5244b = (v) eh.a.g(vVar);
        this.f5245c = (t) eh.a.g(tVar);
    }

    @Override // ah.v
    public long a(d0 d0Var) throws IOException {
        long jA = this.f5244b.a(d0Var);
        this.f5247e = jA;
        if (jA == 0) {
            return 0L;
        }
        if (d0Var.f5070h == -1 && jA != -1) {
            d0Var = d0Var.f(0L, jA);
        }
        this.f5246d = true;
        this.f5245c.a(d0Var);
        return this.f5247e;
    }

    @Override // ah.v
    public void close() throws IOException {
        try {
            this.f5244b.close();
        } finally {
            if (this.f5246d) {
                this.f5246d = false;
                this.f5245c.close();
            }
        }
    }

    @Override // ah.v
    public void d(m1 m1Var) {
        eh.a.g(m1Var);
        this.f5244b.d(m1Var);
    }

    @Override // ah.v
    public Map<String, List<String>> getResponseHeaders() {
        return this.f5244b.getResponseHeaders();
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        return this.f5244b.getUri();
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f5247e == 0) {
            return -1;
        }
        int i12 = this.f5244b.read(bArr, i10, i11);
        if (i12 > 0) {
            this.f5245c.write(bArr, i10, i12);
            long j10 = this.f5247e;
            if (j10 != -1) {
                this.f5247e = j10 - ((long) i12);
            }
        }
        return i12;
    }
}
