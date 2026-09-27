package pc;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class g<T> implements com.bumptech.glide.f.b<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int[] f120680a;

    public g(int i10, int i11) {
        this.f120680a = new int[]{i10, i11};
    }

    @Override // com.bumptech.glide.f.b
    @Nullable
    public int[] a(@NonNull T t10, int i10, int i11) {
        return this.f120680a;
    }
}
