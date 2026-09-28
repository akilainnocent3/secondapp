package defpackage;

import android.content.Context;
import android.net.Uri;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.io.InputStream;

/* JADX INFO: loaded from: classes.dex */
public final class wkv implements i2w<Uri, InputStream> {
    public final Context a;

    public static class a implements j2w<Uri, InputStream> {
        public final Context a;

        public a(Context context) {
            this.a = context;
        }

        @Override // defpackage.j2w
        public final i2w<Uri, InputStream> c(wjw wjwVar) {
            return new wkv(this.a);
        }
    }

    public wkv(Context context) {
        this.a = context.getApplicationContext();
    }

    @Override // defpackage.i2w
    public final i2w.a<InputStream> a(Uri uri, int i, int i2, s2z s2zVar) {
        Uri uri2 = uri;
        if (i == Integer.MIN_VALUE || i2 == Integer.MIN_VALUE || i > 512 || i2 > 384) {
            return null;
        }
        acy acyVar = new acy(uri2);
        Context context = this.a;
        return new i2w.a<>(acyVar, rpf0.c(context, uri2, new rpf0.a(context.getContentResolver())));
    }

    @Override // defpackage.i2w
    public final boolean b(Uri uri) {
        Uri uri2 = uri;
        return xkv.b(uri2) && !uri2.getPathSegments().contains(AnalyticsParam.SOCIAL_NEWS_CARD_CLICK_SOURCE_VIDEO);
    }
}
