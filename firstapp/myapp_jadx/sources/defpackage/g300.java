package defpackage;

import androidx.compose.runtime.k;
import java.util.List;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes6.dex */
public final class g300 {
    public final List<String> a;
    public final int b;
    public final boolean c;
    public final osw d;
    public final osw e;

    public g300(int i, List list, boolean z) {
        list.getClass();
        this.a = list;
        this.b = i;
        this.c = z;
        this.d = k.a(0);
        this.e = k.a(list.isEmpty() ? 0 : Math.min(i - 1, b.j(list)));
    }

    public final void a() {
        int iMin;
        List<String> list = this.a;
        if (list.isEmpty()) {
            return;
        }
        u5a0 u5a0Var = (u5a0) this.e;
        int iD = (u5a0Var.D() + 1) % list.size();
        boolean z = this.c;
        int i = this.b;
        if (z) {
            iMin = list.size() <= i ? list.size() - 1 : ((i + iD) - 1) % list.size();
        } else {
            iMin = Math.min((i + iD) - 1, list.size() - 1);
        }
        ((u5a0) this.d).k(iD);
        u5a0Var.k(iMin);
    }
}
