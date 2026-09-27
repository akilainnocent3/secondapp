package a2;

import android.text.Html;
import android.text.Spanned;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
public final class d {
    @oy.l
    public static final Spanned a(@oy.l String str, int i10, @oy.m Html.ImageGetter imageGetter, @oy.m Html.TagHandler tagHandler) {
        return c.b(str, i10, imageGetter, tagHandler);
    }

    public static /* synthetic */ Spanned b(String str, int i10, Html.ImageGetter imageGetter, Html.TagHandler tagHandler, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            imageGetter = null;
        }
        if ((i11 & 4) != 0) {
            tagHandler = null;
        }
        return c.b(str, i10, imageGetter, tagHandler);
    }

    @oy.l
    public static final String c(@oy.l Spanned spanned, int i10) {
        return c.c(spanned, i10);
    }

    public static /* synthetic */ String d(Spanned spanned, int i10, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        return c.c(spanned, i10);
    }
}
