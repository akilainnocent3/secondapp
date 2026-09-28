package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.net.Uri;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class sy0<Data> implements i2w<Uri, Data> {
    public final AssetManager a;
    public final a<Data> b;

    public interface a<Data> {
        cpc<Data> a(AssetManager assetManager, String str);
    }

    public static class b implements j2w<Uri, AssetFileDescriptor>, a<AssetFileDescriptor> {
        public final AssetManager a;

        public b(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // sy0.a
        public final cpc<AssetFileDescriptor> a(AssetManager assetManager, String str) {
            return new wjh(assetManager, str);
        }

        @Override // defpackage.j2w
        public final i2w<Uri, AssetFileDescriptor> c(wjw wjwVar) {
            return new sy0(this.a, this);
        }
    }

    public static class c implements j2w<Uri, InputStream>, a<InputStream> {
        public final AssetManager a;

        public c(AssetManager assetManager) {
            this.a = assetManager;
        }

        @Override // sy0.a
        public final cpc<InputStream> a(AssetManager assetManager, String str) {
            return new t7e0(assetManager, str);
        }

        @Override // defpackage.j2w
        public final i2w<Uri, InputStream> c(wjw wjwVar) {
            return new sy0(this.a, this);
        }
    }

    public sy0(AssetManager assetManager, a<Data> aVar) {
        this.a = assetManager;
        this.b = aVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(Uri uri, int i, int i2, s2z s2zVar) {
        Uri uri2 = uri;
        return new i2w.a(new acy(uri2), this.b.a(this.a, uri2.toString().substring(22)));
    }

    @Override // defpackage.i2w
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return "file".equals(uri2.getScheme()) && !uri2.getPathSegments().isEmpty() && "android_asset".equals(uri2.getPathSegments().get(0));
    }
}
