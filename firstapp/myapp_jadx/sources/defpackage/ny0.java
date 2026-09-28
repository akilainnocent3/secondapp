package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class ny0 extends xdt<AssetFileDescriptor> {
    @Override // defpackage.cpc
    public final Class<AssetFileDescriptor> a() {
        return AssetFileDescriptor.class;
    }

    @Override // defpackage.xdt
    public final void c(AssetFileDescriptor assetFileDescriptor) throws IOException {
        assetFileDescriptor.close();
    }

    @Override // defpackage.xdt
    public final AssetFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        boolean z = this.a;
        ContentResolver contentResolver2 = this.c;
        AssetFileDescriptor assetFileDescriptorC = (z && xkv.b(uri) && xkv.a()) ? xkv.c(uri, contentResolver2) : contentResolver2.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorC != null) {
            return assetFileDescriptorC;
        }
        throw new FileNotFoundException(ffe0.a(uri, "FileDescriptor is null for: "));
    }
}
