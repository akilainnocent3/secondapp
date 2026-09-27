package dc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b0 extends i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f78692c = "com.bumptech.glide.load.resource.bitmap.FitCenter";

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f78693d = f78692c.getBytes(tb.f.f136431b);

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f78693d);
    }

    @Override // dc.i
    public Bitmap c(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return n0.f(eVar, bitmap, i10, i11);
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        return obj instanceof b0;
    }

    @Override // tb.f
    public int hashCode() {
        return 1572326941;
    }
}
