package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class q21 extends HashMap<e21<?>, Object> implements m21 {
    public final long a;
    public final int b;
    public int c = 0;

    public q21(long j, int i) {
        this.a = j;
        this.b = i;
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public final Object put(e21<?> e21Var, Object obj) {
        if (obj == null) {
            return null;
        }
        this.c++;
        if (size() < this.a || containsKey(e21Var)) {
            return super.put(e21Var, l21.b(this.b, obj));
        }
        return null;
    }

    @Override // defpackage.m21
    public final <T> T e(e21<T> e21Var) {
        return (T) get(e21Var);
    }

    @Override // defpackage.m21
    public final xw0 toBuilder() {
        xw0 xw0Var = new xw0();
        xw0Var.c(this);
        return xw0Var;
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("AttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.a);
        sb.append(", totalAddedValues=");
        return rr1.b(sb, this.c, '}');
    }
}
