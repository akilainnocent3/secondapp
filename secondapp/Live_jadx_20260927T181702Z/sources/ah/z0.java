package ah;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public final class z0 implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final z0 f5422b = new z0();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final v.a f5423c = new v.a() { // from class: ah.y0
        @Override // ah.v.a
        public final v createDataSource() {
            return z0.g();
        }
    };

    public static /* synthetic */ z0 g() {
        return new z0();
    }

    @Override // ah.v
    public long a(d0 d0Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // ah.v
    public /* synthetic */ Map getResponseHeaders() {
        return u.a(this);
    }

    @Override // ah.v
    @Nullable
    public Uri getUri() {
        return null;
    }

    @Override // ah.r
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // ah.v
    public void close() {
    }

    @Override // ah.v
    public void d(m1 m1Var) {
    }
}
