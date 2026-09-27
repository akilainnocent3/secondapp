package dc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class n extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f78764c = "com.bumptech.glide.load.resource.bitmap.CenterCrop";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f78765d = f78764c.getBytes(tb.f.f136431b);

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f78765d);
    }

    @Override // dc.i
    public Bitmap c(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return n0.b(eVar, bitmap, i10, i11);
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        return obj instanceof n;
    }

    @Override // tb.f
    public int hashCode() {
        return -599754482;
    }
}
