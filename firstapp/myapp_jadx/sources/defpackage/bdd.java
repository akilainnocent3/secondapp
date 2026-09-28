package defpackage;

import androidx.media3.common.a;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class bdd implements mam {
    public static final int[] c = {8, 13, 11, 2, 0, 1, 7};
    public ugd a;
    public boolean b;

    public static void a(int i, ArrayList arrayList) {
        int i2 = 0;
        while (true) {
            if (i2 >= 7) {
                i2 = -1;
                break;
            } else if (c[i2] == i) {
                break;
            } else {
                i2++;
            }
        }
        if (i2 == -1 || arrayList.contains(Integer.valueOf(i))) {
            return;
        }
        arrayList.add(Integer.valueOf(i));
    }

    public final a b(a aVar) {
        if (!this.b || !this.a.d(aVar)) {
            return aVar;
        }
        a.C0062a c0062aA = aVar.a();
        String str = aVar.k;
        c0062aA.m = gqv.m("application/x-media3-cues");
        c0062aA.K = this.a.e(aVar);
        StringBuilder sb = new StringBuilder();
        sb.append(aVar.n);
        sb.append(str != null ? " ".concat(str) : "");
        c0062aA.j = sb.toString();
        c0062aA.r = Long.MAX_VALUE;
        return new a(c0062aA);
    }
}
