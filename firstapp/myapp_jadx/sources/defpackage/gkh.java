package defpackage;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class gkh implements ekh.d<InputStream> {
    @Override // ekh.d
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // ekh.d
    public final void b(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // ekh.d
    public final InputStream c(File file) {
        return new FileInputStream(file);
    }
}
