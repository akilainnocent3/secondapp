package ni;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class a implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f116717a;

    public a(float f10) {
        this.f116717a = f10;
    }

    @Override // ni.e
    public float a(@NonNull RectF rectF) {
        return this.f116717a;
    }

    public float b() {
        return this.f116717a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f116717a == ((a) obj).f116717a;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Float.valueOf(this.f116717a)});
    }
}
