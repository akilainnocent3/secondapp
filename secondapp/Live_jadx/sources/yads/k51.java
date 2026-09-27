package yads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class k51 extends b0 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f151400b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f151401c;

    public k51(Object obj, Object obj2) {
        this.f151400b = obj;
        this.f151401c = obj2;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f151400b;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return this.f151401c;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        throw new UnsupportedOperationException();
    }
}
