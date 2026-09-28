package okhttp3.internal;

import defpackage.cc5;
import defpackage.lb5;
import defpackage.y740;
import java.io.EOFException;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcc5;", "", "codePointLimit", "", "isProbablyUtf8", "(Lcc5;J)Z", "okhttp"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class IsProbablyUtf8Kt {
    public static final boolean isProbablyUtf8(cc5 cc5Var, long j) {
        cc5Var.getClass();
        try {
            y740 y740VarPeek = cc5Var.peek();
            for (long j2 = 0; j2 < j && !y740VarPeek.N0(); j2++) {
                y740VarPeek.q0(1L);
                lb5 lb5Var = y740VarPeek.b;
                byte bM = lb5Var.m(0L);
                if ((bM & 224) == 192) {
                    y740VarPeek.q0(2L);
                } else if ((bM & 240) == 224) {
                    y740VarPeek.q0(3L);
                } else if ((bM & 248) == 240) {
                    y740VarPeek.q0(4L);
                }
                int iZ = lb5Var.Z();
                if (Character.isISOControl(iZ) && !Character.isWhitespace(iZ)) {
                    return false;
                }
            }
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static /* synthetic */ boolean isProbablyUtf8$default(cc5 cc5Var, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            j = Long.MAX_VALUE;
        }
        return isProbablyUtf8(cc5Var, j);
    }
}
