package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.util.Log;
import java.io.InputStream;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sh50<DataT> implements i2w<Uri, DataT> {
    public final Context a;
    public final i2w<Integer, DataT> b;

    public static final class a implements j2w<Uri, AssetFileDescriptor> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.j2w
        public final i2w<Uri, AssetFileDescriptor> c(wjw wjwVar) {
            return new sh50(this.a, wjwVar.b(Integer.class, AssetFileDescriptor.class));
        }
    }

    public static final class b implements j2w<Uri, InputStream> {
        public final Context a;

        public b(Context context) {
            this.a = context;
        }

        @Override // defpackage.j2w
        public final i2w<Uri, InputStream> c(wjw wjwVar) {
            return new sh50(this.a, wjwVar.b(Integer.class, InputStream.class));
        }
    }

    public sh50(Context context, i2w<Integer, DataT> i2wVar) {
        this.a = context.getApplicationContext();
        this.b = i2wVar;
    }

    @Override // defpackage.i2w
    public final i2w.a a(Uri uri, int i, int i2, s2z s2zVar) {
        Uri uri2 = uri;
        List<String> pathSegments = uri2.getPathSegments();
        int size = pathSegments.size();
        i2w<Integer, DataT> i2wVar = this.b;
        if (size == 1) {
            try {
                int i3 = Integer.parseInt(uri2.getPathSegments().get(0));
                if (i3 != 0) {
                    return i2wVar.a(Integer.valueOf(i3), i, i2, s2zVar);
                }
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse a valid non-0 resource id from: " + uri2);
                    return null;
                }
            } catch (NumberFormatException e) {
                if (Log.isLoggable("ResourceUriLoader", 5)) {
                    Log.w("ResourceUriLoader", "Failed to parse resource id from: " + uri2, e);
                }
            }
        } else if (pathSegments.size() == 2) {
            List<String> pathSegments2 = uri2.getPathSegments();
            String str = pathSegments2.get(0);
            String str2 = pathSegments2.get(1);
            Context context = this.a;
            int identifier = context.getResources().getIdentifier(str2, str, context.getPackageName());
            if (identifier != 0) {
                return i2wVar.a(Integer.valueOf(identifier), i, i2, s2zVar);
            }
            if (Log.isLoggable("ResourceUriLoader", 5)) {
                Log.w("ResourceUriLoader", "Failed to find resource id for: " + uri2);
                return null;
            }
        } else if (Log.isLoggable("ResourceUriLoader", 5)) {
            Log.w("ResourceUriLoader", "Failed to parse resource uri: " + uri2);
        }
        return null;
    }

    @Override // defpackage.i2w
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return "android.resource".equals(uri2.getScheme()) && this.a.getPackageName().equals(uri2.getAuthority());
    }
}
