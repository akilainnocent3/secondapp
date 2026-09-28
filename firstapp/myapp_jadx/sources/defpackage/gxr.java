package defpackage;

import androidx.compose.foundation.lazy.layout.c;

/* JADX INFO: loaded from: classes.dex */
public final class gxr {
    public static final int a(int i, c cVar, Object obj) {
        int iC;
        return (obj == null || cVar.a() == 0 || (i < cVar.a() && obj.equals(cVar.g(i))) || (iC = cVar.c(obj)) == -1) ? i : iC;
    }
}
