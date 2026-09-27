package kotlin.jvm.internal;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class o0<R> implements f0<R>, Serializable {
    private final int arity;

    public o0(int i10) {
        this.arity = i10;
    }

    @Override // kotlin.jvm.internal.f0
    public int getArity() {
        return this.arity;
    }

    @oy.l
    public String toString() {
        String strX = m1.x(this);
        m0.o(strX, "renderLambdaToString(...)");
        return strX;
    }
}
