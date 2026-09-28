package defpackage;

import android.content.res.AssetManager;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class t7e0 extends qy0<InputStream> {
    @Override // defpackage.cpc
    public final Class<InputStream> a() {
        return InputStream.class;
    }

    @Override // defpackage.qy0
    public final void c(InputStream inputStream) throws IOException {
        inputStream.close();
    }

    @Override // defpackage.qy0
    public final InputStream f(AssetManager assetManager, String str) {
        return assetManager.open(str);
    }
}
