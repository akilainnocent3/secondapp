package ni;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class c implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f116720a;

    public c(float f10) {
        this.f116720a = f10;
    }

    @NonNull
    public static c b(@NonNull a aVar) {
        return new c(aVar.b());
    }

    public static float c(@NonNull RectF rectF) {
        return Math.min(rectF.width() / 2.0f, rectF.height() / 2.0f);
    }

    @Override // ni.e
    public float a(@NonNull RectF rectF) {
        return Math.min(this.f116720a, c(rectF));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && this.f116720a == ((c) obj).f116720a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f116720a)});
    }
}
