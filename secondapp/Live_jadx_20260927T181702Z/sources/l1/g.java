package l1;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.net.Uri;
import k.t0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes.dex */
@SuppressLint({"ClassVerificationFailure"})
public final class g {
    @t0(26)
    @oy.l
    public static final Icon a(@oy.l Bitmap bitmap) {
        return Icon.createWithAdaptiveBitmap(bitmap);
    }

    @t0(26)
    @oy.l
    public static final Icon b(@oy.l Bitmap bitmap) {
        return Icon.createWithBitmap(bitmap);
    }

    @t0(26)
    @oy.l
    public static final Icon c(@oy.l Uri uri) {
        return Icon.createWithContentUri(uri);
    }

    @t0(26)
    @oy.l
    public static final Icon d(@oy.l byte[] bArr) {
        return Icon.createWithData(bArr, 0, bArr.length);
    }
}
