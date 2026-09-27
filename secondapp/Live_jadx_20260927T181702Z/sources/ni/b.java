package ni;

import android.graphics.RectF;
import androidx.annotation.NonNull;
import java.util.Arrays;
import k.y0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
@y0({y0.a.LIBRARY_GROUP})
public final class b implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f116718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f116719b;

    public b(float f10, @NonNull e eVar) {
        while (eVar instanceof b) {
            eVar = ((b) eVar).f116718a;
            f10 += ((b) eVar).f116719b;
        }
        this.f116718a = eVar;
        this.f116719b = f10;
    }

    @Override // ni.e
    public float a(@NonNull RectF rectF) {
        return Math.max(0.0f, this.f116718a.a(rectF) + this.f116719b);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f116718a.equals(bVar.f116718a) && this.f116719b == bVar.f116719b;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f116718a, Float.valueOf(this.f116719b)});
    }
}
