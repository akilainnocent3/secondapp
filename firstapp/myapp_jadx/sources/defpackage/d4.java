package defpackage;

import d4.a;
import defpackage.d4;
import java.io.IOException;
import java.util.logging.Logger;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d4<MessageType extends d4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements wnv {
    protected int memoizedHashCode = 0;

    public static abstract class a<MessageType extends d4<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> implements wnv.a {
    }

    public int b() {
        throw new UnsupportedOperationException();
    }

    public int c(an70 an70Var) {
        int iB = b();
        if (iB != -1) {
            return iB;
        }
        int iE = an70Var.e(this);
        e(iE);
        return iE;
    }

    public final String d(String str) {
        return "Serializing " + getClass().getName() + " to a " + str + " threw an IOException (should never happen).";
    }

    public void e(int i) {
        throw new UnsupportedOperationException();
    }

    public final ql5.f f() {
        try {
            int iC = ((n1k) this).c(null);
            ql5.f fVar = ql5.b;
            byte[] bArr = new byte[iC];
            Logger logger = r08.d;
            r08.a aVar = new r08.a(iC, bArr);
            ((n1k) this).a(aVar);
            if (aVar.j0() == 0) {
                return new ql5.f(bArr);
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            jk40.a(d("ByteString"), e);
            return null;
        }
    }

    @Override // defpackage.wnv
    public final byte[] toByteArray() {
        try {
            int iC = ((n1k) this).c(null);
            byte[] bArr = new byte[iC];
            Logger logger = r08.d;
            r08.a aVar = new r08.a(iC, bArr);
            ((n1k) this).a(aVar);
            if (aVar.j0() == 0) {
                return bArr;
            }
            throw new IllegalStateException("Did not write as much data as expected.");
        } catch (IOException e) {
            jk40.a(d("byte array"), e);
            return null;
        }
    }
}
