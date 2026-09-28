package defpackage;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class ay80 implements a0b {
    public final String a;
    public final List<a0b> b;
    public final boolean c;

    public ay80(String str, boolean z, List list) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // defpackage.a0b
    public final cza a(iot iotVar, xmt xmtVar, w12 w12Var) {
        return new mza(iotVar, w12Var, this, xmtVar);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
