package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes.dex */
public final class yjh extends xdt<ParcelFileDescriptor> {
    @Override // defpackage.cpc
    public final Class<ParcelFileDescriptor> a() {
        return ParcelFileDescriptor.class;
    }

    @Override // defpackage.xdt
    public final void c(ParcelFileDescriptor parcelFileDescriptor) throws IOException {
        parcelFileDescriptor.close();
    }

    @Override // defpackage.xdt
    public final ParcelFileDescriptor f(Uri uri, ContentResolver contentResolver) throws FileNotFoundException {
        boolean z = this.a;
        ContentResolver contentResolver2 = this.c;
        AssetFileDescriptor assetFileDescriptorC = (z && xkv.b(uri) && xkv.a()) ? xkv.c(uri, contentResolver2) : contentResolver2.openAssetFileDescriptor(uri, "r");
        if (assetFileDescriptorC != null) {
            return assetFileDescriptorC.getParcelFileDescriptor();
        }
        throw new FileNotFoundException(ffe0.a(uri, "FileDescriptor is null for: "));
    }
}
