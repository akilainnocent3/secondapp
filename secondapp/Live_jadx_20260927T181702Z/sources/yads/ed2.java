package yads;

import android.net.Uri;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ed2 implements p30 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ed2 f148658a = new ed2();

    static {
        new o30() { // from class: yads.zz3
            @Override // yads.o30
            public final p30 createDataSource() {
                return new ed2();
            }
        };
    }

    @Override // yads.p30
    public final void a(r83 r83Var) {
    }

    @Override // yads.p30
    public /* synthetic */ Map getResponseHeaders() {
        return y74.a(this);
    }

    @Override // yads.p30
    public final Uri getUri() {
        return null;
    }

    @Override // yads.l30
    public final int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // yads.p30
    public final long a(u30 u30Var) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // yads.p30
    public final void close() {
    }
}
