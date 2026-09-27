package yads;

import java.io.FilterInputStream;
import java.io.IOException;
import java.net.HttpURLConnection;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class c21 extends FilterInputStream {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HttpURLConnection f147480a;

    public c21(HttpURLConnection httpURLConnection) {
        super(d21.a(httpURLConnection));
        this.f147480a = httpURLConnection;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        super.close();
        this.f147480a.disconnect();
    }
}
