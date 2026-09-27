package yads;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class t51 implements Serializable {
    private static final long serialVersionUID = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object[] f155704b;

    public t51(Object[] objArr) {
        this.f155704b = objArr;
    }

    public Object readResolve() {
        Object[] objArr = this.f155704b;
        int length = objArr.length;
        if (length != 0) {
            return length != 1 ? u51.b(objArr.length, (Object[]) objArr.clone()) : new xz2(objArr[0]);
        }
        return ym2.f158410j;
    }
}
