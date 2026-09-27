package dc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class l0 extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f78756d = "com.bumptech.glide.load.resource.bitmap.RoundedCorners";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f78757e = f78756d.getBytes(tb.f.f136431b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78758c;

    public l0(int i10) {
        pc.m.b(i10 > 0, "roundingRadius must be greater than 0.");
        this.f78758c = i10;
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f78757e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f78758c).array());
    }

    @Override // dc.i
    public Bitmap c(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return n0.q(eVar, bitmap, this.f78758c);
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        return (obj instanceof l0) && this.f78758c == ((l0) obj).f78758c;
    }

    @Override // tb.f
    public int hashCode() {
        return pc.o.q(-569625254, pc.o.p(this.f78758c));
    }
}
