package a5;

import android.net.Uri;
import androidx.annotation.Nullable;
import java.io.IOException;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@x4.m1
public final class o1 implements r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final o1 f3764a = new o1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final r.a f3765b = new r.a() { // from class: a5.n1
        @Override // a5.r.a
        public final r createDataSource() {
            return o1.a();
        }
    };

    public static /* synthetic */ o1 a() {
        return new o1();
    }

    @Override // a5.r
    public /* synthetic */ Map getResponseHeaders() {
        return q.a(this);
    }

    @Override // a5.r
    @Nullable
    public Uri getUri() {
        return null;
    }

    @Override // a5.r
    public long open(z zVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // u4.c0
    public int read(byte[] bArr, int i10, int i11) {
        throw new UnsupportedOperationException();
    }

    @Override // a5.r
    public void addTransferListener(x1 x1Var) {
    }

    @Override // a5.r
    public void close() {
    }
}
