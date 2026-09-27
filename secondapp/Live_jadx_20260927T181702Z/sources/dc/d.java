package dc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
@Deprecated
public class d implements tb.m<BitmapDrawable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb.m<Drawable> f78701c;

    public d(tb.m<Bitmap> mVar) {
        this.f78701c = (tb.m) pc.m.e(new z(mVar, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static vb.v<BitmapDrawable> c(vb.v<Drawable> vVar) {
        if (vVar.get() instanceof BitmapDrawable) {
            return vVar;
        }
        throw new IllegalArgumentException("Wrapped transformation unexpectedly returned a non BitmapDrawable resource: " + vVar.get());
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        this.f78701c.a(messageDigest);
    }

    @Override // tb.m
    @NonNull
    public vb.v<BitmapDrawable> b(@NonNull Context context, @NonNull vb.v<BitmapDrawable> vVar, int i10, int i11) {
        return c(this.f78701c.b(context, d(vVar), i10, i11));
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof d) {
            return this.f78701c.equals(((d) obj).f78701c);
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        return this.f78701c.hashCode();
    }

    public static vb.v<Drawable> d(vb.v<BitmapDrawable> vVar) {
        return vVar;
    }
}
