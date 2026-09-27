package v1;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e {
    public static f.a a(Context context, Uri uri) {
        return Build.VERSION.SDK_INT < 24 ? new f.b(context, uri) : new f.c(context, uri);
    }
}
