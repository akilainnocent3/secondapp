package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ldf0 {
    public static final boolean a(nk0 nk0Var) {
        int length = nk0Var.b.length();
        List<nk0.d<? extends nk0.a>> list = nk0Var.a;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                nk0.d<? extends nk0.a> dVar = list.get(i);
                if ((dVar.a instanceof rfs) && qk0.b(0, length, dVar.b, dVar.c)) {
                    return true;
                }
            }
        }
        return false;
    }
}
