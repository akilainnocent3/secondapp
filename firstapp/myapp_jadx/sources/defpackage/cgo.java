package defpackage;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes8.dex */
public final class cgo {
    public static final void a(int i, int i2, pd80 pd80Var) {
        pd80Var.getClass();
        ArrayList arrayList = new ArrayList();
        int i3 = (~i) & i2;
        for (int i4 = 0; i4 < 32; i4++) {
            if ((i3 & 1) != 0) {
                arrayList.add(pd80Var.e(i4));
            }
            i3 >>>= 1;
        }
        throw new uqv(pd80Var.h(), arrayList);
    }
}
