package dc;

import android.graphics.Bitmap;
import androidx.annotation.NonNull;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class c0 extends i {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final String f78695g = "com.bumptech.glide.load.resource.bitmap.GranularRoundedCorners";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final byte[] f78696h = f78695g.getBytes(tb.f.f136431b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f78697c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f78698d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f78699e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f78700f;

    public c0(float f10, float f11, float f12, float f13) {
        this.f78697c = f10;
        this.f78698d = f11;
        this.f78699e = f12;
        this.f78700f = f13;
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        messageDigest.update(f78696h);
        messageDigest.update(ByteBuffer.allocate(16).putFloat(this.f78697c).putFloat(this.f78698d).putFloat(this.f78699e).putFloat(this.f78700f).array());
    }

    @Override // dc.i
    public Bitmap c(@NonNull wb.e eVar, @NonNull Bitmap bitmap, int i10, int i11) {
        return n0.p(eVar, bitmap, this.f78697c, this.f78698d, this.f78699e, this.f78700f);
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof c0) {
            c0 c0Var = (c0) obj;
            if (this.f78697c == c0Var.f78697c && this.f78698d == c0Var.f78698d && this.f78699e == c0Var.f78699e && this.f78700f == c0Var.f78700f) {
                return true;
            }
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        return pc.o.o(this.f78700f, pc.o.o(this.f78699e, pc.o.o(this.f78698d, pc.o.q(-2013597734, pc.o.n(this.f78697c)))));
    }
}
