package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes.dex */
public final class nmh0<Data> implements i2w<Uri, Data> {
    public static final Set<String> b = Collections.unmodifiableSet(new HashSet(Arrays.asList("file", "content", "android.resource")));
    public final c<Data> a;

    public static final class a implements j2w<Uri, AssetFileDescriptor>, c<AssetFileDescriptor> {
        public final ContentResolver a;
        public final boolean b;

        public a(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // nmh0.c
        public final cpc<AssetFileDescriptor> a(Uri uri) {
            return new ny0(this.a, uri, this.b);
        }

        @Override // defpackage.j2w
        public final i2w<Uri, AssetFileDescriptor> c(wjw wjwVar) {
            return new nmh0(this);
        }
    }

    public static class b implements j2w<Uri, ParcelFileDescriptor>, c<ParcelFileDescriptor> {
        public final ContentResolver a;
        public final boolean b;

        public b(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // nmh0.c
        public final cpc<ParcelFileDescriptor> a(Uri uri) {
            return new yjh(this.a, uri, this.b);
        }

        @Override // defpackage.j2w
        public final i2w<Uri, ParcelFileDescriptor> c(wjw wjwVar) {
            return new nmh0(this);
        }
    }

    public interface c<Data> {
        cpc<Data> a(Uri uri);
    }

    public static class d implements j2w<Uri, InputStream>, c<InputStream> {
        public final ContentResolver a;
        public final boolean b;

        public d(ContentResolver contentResolver, boolean z) {
            this.a = contentResolver;
            this.b = z;
        }

        @Override // nmh0.c
        public final cpc<InputStream> a(Uri uri) {
            return new b8e0(this.a, uri, this.b);
        }

        @Override // defpackage.j2w
        public final i2w<Uri, InputStream> c(wjw wjwVar) {
            return new nmh0(this);
        }
    }

    public nmh0(c<Data> cVar) {
        this.a = cVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(Uri uri, int i, int i2, s2z s2zVar) {
        Uri uri2 = uri;
        return new i2w.a(new acy(uri2), this.a.a(uri2));
    }

    @Override // defpackage.i2w
    public final boolean b(Uri uri) {
        return b.contains(uri.getScheme());
    }
}
