package yads;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class ox1 implements y43, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f153640b;

    public ox1(int i10) {
        this.f153640b = kx.a(i10, "expectedValuesPerKey");
    }

    @Override // yads.y43
    public final Object get() {
        return new ArrayList(this.f153640b);
    }
}
