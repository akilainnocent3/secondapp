package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class yu6 implements jee0 {
    public final List<j4c> a;

    public yu6(List<j4c> list) {
        this.a = list;
    }

    @Override // defpackage.jee0
    public final int a(long j) {
        return j < 0 ? 0 : -1;
    }

    @Override // defpackage.jee0
    public final List<j4c> b(long j) {
        return j >= 0 ? this.a : Collections.EMPTY_LIST;
    }

    @Override // defpackage.jee0
    public final long c(int i) {
        ly0.b(i == 0);
        return 0L;
    }

    @Override // defpackage.jee0
    public final int d() {
        return 1;
    }
}
