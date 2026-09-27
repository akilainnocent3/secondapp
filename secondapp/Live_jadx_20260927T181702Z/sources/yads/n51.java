package yads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class n51 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f152885b;

    public n51(Object[] objArr) {
        this.f152885b = objArr;
    }

    public Object readResolve() {
        return p51.b(this.f152885b);
    }
}
