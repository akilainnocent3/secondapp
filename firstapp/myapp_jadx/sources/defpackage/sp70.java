package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class sp70 implements xgz {
    public final int a;
    public final List<sp70> b;
    public Float c = null;
    public Float d = null;
    public vo70 e = null;
    public vo70 f = null;

    public sp70(int i, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
    }

    @Override // defpackage.xgz
    public final boolean Z0() {
        return this.b.contains(this);
    }
}
