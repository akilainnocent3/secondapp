package zf;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class y implements ah.v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final ah.v f161502b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f161503c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final a f161504d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final byte[] f161505e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f161506f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface a {
        void a(eh.t0 t0Var);
    }

    public y(ah.v vVar, int i10, a aVar) {
        eh.a.a(i10 > 0);
        this.f161502b = vVar;
        this.f161503c = i10;
        this.f161504d = aVar;
        this.f161505e = new byte[1];
        this.f161506f = i10;
    }

    @Override // ah.v
    public long a(ah.d0 d0Var) {
        throw new UnsupportedOperationException();
    }

    @Override // ah.v
    public void close() {
        throw new UnsupportedOperationException();
    }

    @Override // ah.v
    public void d(ah.m1 m1Var) {
        eh.a.g(m1Var);
        this.f161502b.d(m1Var);
    }

    public final boolean g() throws IOException {
        if (this.f161502b.read(this.f161505e, 0, 1) == -1) {
            return false;
        }
        int i10 = (this.f161505e[0] & 255) << 4;
        if (i10 == 0) {
            return true;
        }
        byte[] bArr = new byte[i10];
        int i11 = i10;
        int i12 = 0;
        while (i11 > 0) {
            int i13 = this.f161502b.read(bArr, i12, i11);
            if (i13 == -1) {
                return false;
            }
            i12 += i13;
            i11 -= i13;
        }
        while (i10 > 0 && bArr[i10 - 1] == 0) {
            i10--;
        }
        if (i10 > 0) {
            this.f161504d.a(new eh.t0(bArr, i10));
        }
        return true;
    }

    @Override // ah.v
    public Map<String, List<String>> getResponseHeaders() {
        return this.f161502b.getResponseHeaders();
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        return this.f161502b.getUri();
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) throws IOException {
        if (this.f161506f == 0) {
            if (!g()) {
                return -1;
            }
            this.f161506f = this.f161503c;
        }
        int i12 = this.f161502b.read(bArr, i10, Math.min(this.f161506f, i11));
        if (i12 != -1) {
            this.f161506f -= i12;
        }
        return i12;
    }
}
