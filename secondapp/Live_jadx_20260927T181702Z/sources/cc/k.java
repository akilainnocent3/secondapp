package cc;

import androidx.annotation.NonNull;
import pc.m;
import vb.v;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class k<T> implements v<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final T f22975b;

    public k(@NonNull T t10) {
        this.f22975b = (T) m.e(t10);
    }

    @Override // vb.v
    @NonNull
    public Class<T> b() {
        return (Class<T>) this.f22975b.getClass();
    }

    @Override // vb.v
    @NonNull
    public final T get() {
        return this.f22975b;
    }

    @Override // vb.v
    public final int getSize() {
        return 1;
    }

    @Override // vb.v
    public void a() {
    }
}
