package defpackage;

import c4.a;
import defpackage.c4;

/* JADX INFO: loaded from: classes.dex */
public abstract class c4<MessageType extends c4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements xnv {
    protected int memoizedHashCode = 0;

    public static abstract class a<MessageType extends c4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements znv, Cloneable {
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public int c(bn70 bn70Var) {
        int iB = b();
        if (iB != -1) {
            return iB;
        }
        int iA = bn70Var.a(this);
        d(iA);
        return iA;
    }

    public void d(int i) {
        throw new UnsupportedOperationException();
    }
}
