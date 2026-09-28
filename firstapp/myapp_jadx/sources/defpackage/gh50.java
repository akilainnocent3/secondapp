package defpackage;

import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class gh50<Data> implements i2w<Integer, Data> {
    public final i2w<Uri, Data> a;
    public final Resources b;

    public static final class a implements j2w<Integer, AssetFileDescriptor> {
        public final Resources a;

        public a(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.j2w
        public final i2w<Integer, AssetFileDescriptor> c(wjw wjwVar) {
            return new gh50(this.a, wjwVar.b(Uri.class, AssetFileDescriptor.class));
        }
    }

    public static class b implements j2w<Integer, InputStream> {
        public final Resources a;

        public b(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.j2w
        public final i2w<Integer, InputStream> c(wjw wjwVar) {
            return new gh50(this.a, wjwVar.b(Uri.class, InputStream.class));
        }
    }

    public static class c implements j2w<Integer, Uri> {
        public final Resources a;

        public c(Resources resources) {
            this.a = resources;
        }

        @Override // defpackage.j2w
        public final i2w<Integer, Uri> c(wjw wjwVar) {
            return new gh50(this.a, bfh0.a);
        }
    }

    public gh50(Resources resources, i2w<Uri, Data> i2wVar) {
        this.b = resources;
        this.a = i2wVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(Integer num, int i, int i2, s2z s2zVar) {
        Uri uri;
        Integer num2 = num;
        try {
            uri = Uri.parse("android.resource://" + this.b.getResourcePackageName(num2.intValue()) + '/' + num2);
        } catch (Resources.NotFoundException e) {
            if (Log.isLoggable("ResourceLoader", 5)) {
                Log.w("ResourceLoader", "Received invalid resource id: " + num2, e);
            }
            uri = null;
        }
        if (uri == null) {
            return null;
        }
        return this.a.a(uri, i, i2, s2zVar);
    }

    @Override // defpackage.i2w
    public final boolean b(Integer num) {
        return true;
    }
}
