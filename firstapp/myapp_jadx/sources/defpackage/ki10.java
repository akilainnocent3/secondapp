package defpackage;

import android.net.Uri;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ki10 implements zpc {
    public static final ki10 a = new ki10();

    @Override // defpackage.zpc
    public final long a(gqc gqcVar) throws IOException {
        throw new IOException("PlaceholderDataSource cannot be opened");
    }

    @Override // defpackage.zpc
    public final Uri getUri() {
        return null;
    }

    @Override // defpackage.tpc
    public final int read(byte[] bArr, int i, int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.zpc
    public final void close() {
    }

    @Override // defpackage.zpc
    public final void g(mrg0 mrg0Var) {
    }
}
