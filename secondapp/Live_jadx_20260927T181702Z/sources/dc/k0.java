package dc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k0 extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final String f78753d = "com.bumptech.glide.load.resource.bitmap.Rotate";

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final byte[] f78754e = f78753d.getBytes(tb.f.f136431b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f78755c;

    public k0(int i10) {
        this.f78755c = i10;
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f78754e);
        messageDigest.update(ByteBuffer.allocate(4).putInt(this.f78755c).array());
    }

    @Override // dc.i
    public Bitmap c(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return n0.n(bitmap, this.f78755c);
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        return (obj instanceof k0) && this.f78755c == ((k0) obj).f78755c;
    }

    @Override // tb.f
    public int hashCode() {
        return pc.o.q(-950519196, pc.o.p(this.f78755c));
    }
}
