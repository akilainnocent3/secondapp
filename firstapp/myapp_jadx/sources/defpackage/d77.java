package defpackage;

import com.google.protobuf.Reader;

/* JADX INFO: loaded from: classes8.dex */
public final class d77 {
    public static final tb5 a(int i, pb5 pb5Var, vuw vuwVar) {
        if (i == -2) {
            if (pb5Var != pb5.a) {
                return new eua(1, pb5Var, vuwVar);
            }
            l67.j.getClass();
            return new tb5(l67.a.b, vuwVar);
        }
        if (i == -1) {
            if (pb5Var == pb5.a) {
                return new eua(1, pb5.b, vuwVar);
            }
            hb5.a("CONFLATED capacity cannot be used with non-default onBufferOverflow");
            return null;
        }
        if (i == 0) {
            return pb5Var == pb5.a ? new tb5(0, vuwVar) : new eua(1, pb5Var, vuwVar);
        }
        if (i != Integer.MAX_VALUE) {
            return pb5Var == pb5.a ? new tb5(i, vuwVar) : new eua(i, pb5Var, vuwVar);
        }
        return new tb5(Reader.READ_DONE, vuwVar);
    }

    public static /* synthetic */ tb5 b(int i, int i2, pb5 pb5Var) {
        if ((i2 & 1) != 0) {
            i = 0;
        }
        if ((i2 & 2) != 0) {
            pb5Var = pb5.a;
        }
        return a(i, pb5Var, null);
    }
}
