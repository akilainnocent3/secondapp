package defpackage;

import com.google.protobuf.Reader;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes8.dex */
public final class d390 {
    public static final toe0 a = new toe0("NO_VALUE");
    public static final /* synthetic */ int b = 0;

    public static final b390 a(int i, int i2, pb5 pb5Var) {
        if (i < 0) {
            kb5.a(hce0.a(i, "replay cannot be negative, but was "));
            return null;
        }
        if (i2 < 0) {
            kb5.a(hce0.a(i2, "extraBufferCapacity cannot be negative, but was "));
            return null;
        }
        if (i <= 0 && i2 <= 0 && pb5Var != pb5.a) {
            r2z.a(pb5Var, "replay or extraBufferCapacity must be positive with non-default onBufferOverflow strategy ");
            return null;
        }
        int i3 = i2 + i;
        if (i3 < 0) {
            i3 = Reader.READ_DONE;
        }
        return new b390(i, i3, pb5Var);
    }

    public static /* synthetic */ b390 b(int i, int i2, pb5 pb5Var, int i3) {
        if ((i3 & 1) != 0) {
            i = 0;
        }
        if ((i3 & 2) != 0) {
            i2 = 0;
        }
        if ((i3 & 4) != 0) {
            pb5Var = pb5.a;
        }
        return a(i, i2, pb5Var);
    }

    public static final lyh c(a390 a390Var, CoroutineContext coroutineContext, int i, pb5 pb5Var) {
        return ((i == 0 || i == -3) && pb5Var == pb5.a) ? a390Var : new a77(i, pb5Var, a390Var, coroutineContext);
    }

    public static final void d(Object[] objArr, long j, Object obj) {
        objArr[((int) j) & (objArr.length - 1)] = obj;
    }
}
