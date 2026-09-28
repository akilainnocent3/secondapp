package defpackage;

import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import java.io.File;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class z9e0<Data> implements i2w<String, Data> {
    public final i2w<Uri, Data> a;

    public static final class a implements j2w<String, AssetFileDescriptor> {
        @Override // defpackage.j2w
        public final i2w<String, AssetFileDescriptor> c(wjw wjwVar) {
            return new z9e0(wjwVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements j2w<String, ParcelFileDescriptor> {
        @Override // defpackage.j2w
        public final i2w<String, ParcelFileDescriptor> c(wjw wjwVar) {
            return new z9e0(wjwVar.b(Uri.class, ParcelFileDescriptor.class));
        }
    }

    public static class c implements j2w<String, InputStream> {
        @Override // defpackage.j2w
        public final i2w<String, InputStream> c(wjw wjwVar) {
            return new z9e0(wjwVar.b(Uri.class, InputStream.class));
        }
    }

    public z9e0(i2w<Uri, Data> i2wVar) {
        this.a = i2wVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(String str, int i, int i2, s2z s2zVar) {
        Uri uriFromFile;
        String str2 = str;
        if (TextUtils.isEmpty(str2)) {
            uriFromFile = null;
        } else if (str2.charAt(0) == '/') {
            uriFromFile = Uri.fromFile(new File(str2));
        } else {
            Uri uri = Uri.parse(str2);
            uriFromFile = uri.getScheme() == null ? Uri.fromFile(new File(str2)) : uri;
        }
        if (uriFromFile != null) {
            i2w<Uri, Data> i2wVar = this.a;
            if (i2wVar.b(uriFromFile)) {
                return i2wVar.a(uriFromFile, i, i2, s2zVar);
            }
        }
        return null;
    }

    @Override // defpackage.i2w
    public final boolean b(String str) {
        return true;
    }
}
