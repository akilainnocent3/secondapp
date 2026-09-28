package defpackage;

import defpackage.bel0;
import defpackage.zdl0;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class bel0<MessageType extends bel0<MessageType, BuilderType>, BuilderType extends zdl0<MessageType, BuilderType>> implements lkl0 {
    protected int zza = 0;

    public final byte[] e() {
        try {
            thl0 thl0Var = (thl0) this;
            int iA = thl0Var.a();
            byte[] bArr = new byte[iA];
            Logger logger = ufl0.b;
            qfl0 qfl0Var = new qfl0(iA, bArr);
            thl0Var.c(qfl0Var);
            qfl0Var.d();
            return bArr;
        } catch (IOException e) {
            String name = getClass().getName();
            jk40.a(pr0.a(new StringBuilder(name.length() + 72), "Serializing ", name, " to a byte array threw an IOException (should never happen)."), e);
            return null;
        }
    }

    public int f(ill0 ill0Var) {
        throw null;
    }
}
