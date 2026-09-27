package dc;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.security.MessageDigest;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class z implements tb.m<Drawable> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final tb.m<Bitmap> f78861c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f78862d;

    public z(tb.m<Bitmap> mVar, boolean z10) {
        this.f78861c = mVar;
        this.f78862d = z10;
    }

    @Override // tb.f
    public void a(@NonNull MessageDigest messageDigest) {
        this.f78861c.a(messageDigest);
    }

    @Override // tb.m
    @NonNull
    public vb.v<Drawable> b(@NonNull Context context, @NonNull vb.v<Drawable> vVar, int i10, int i11) {
        wb.e eVarH = com.bumptech.glide.b.e(context).h();
        Drawable drawable = vVar.get();
        vb.v<Bitmap> vVarA = y.a(eVarH, drawable, i10, i11);
        if (vVarA != null) {
            vb.v<Bitmap> vVarB = this.f78861c.b(context, vVarA, i10, i11);
            if (!vVarB.equals(vVarA)) {
                return d(context, vVarB);
            }
            vVarB.a();
            return vVar;
        }
        if (!this.f78862d) {
            return vVar;
        }
        throw new IllegalArgumentException("Unable to convert " + drawable + " to a Bitmap");
    }

    public final vb.v<Drawable> d(Context context, vb.v<Bitmap> vVar) {
        return g0.f(context.getResources(), vVar);
    }

    @Override // tb.f
    public boolean equals(Object obj) {
        if (obj instanceof z) {
            return this.f78861c.equals(((z) obj).f78861c);
        }
        return false;
    }

    @Override // tb.f
    public int hashCode() {
        return this.f78861c.hashCode();
    }

    public tb.m<BitmapDrawable> c() {
        return this;
    }
}
