package defpackage;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes8.dex */
public final class d2h extends HashMap<w1h<?>, Object> implements b2h {
    public final long a;
    public final int b;
    public int c = 0;

    public d2h(long j, int i) {
        this.a = j;
        this.b = i;
    }

    public final zw0 b() {
        ax0 ax0Var = new ax0();
        super.forEach(new c2h(ax0Var));
        ArrayList arrayList = ax0Var.a;
        if (arrayList.size() == 2 && arrayList.get(0) != null) {
            return new zw0(arrayList.toArray());
        }
        Object[] array = arrayList.toArray();
        Comparator<w1h<?>> comparator = zw0.d;
        for (int i = 0; i < array.length; i += 2) {
            w1h w1hVar = (w1h) array[i];
            if (w1hVar != null && w1hVar.getKey().isEmpty()) {
                array[i] = null;
            }
        }
        return new zw0(array, zw0.d);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Object put(w1h<?> w1hVar, Object obj) {
        if (obj == null) {
            return null;
        }
        this.c++;
        if (size() < this.a || containsKey(w1hVar)) {
            return super.put(w1hVar, l21.b(this.b, obj));
        }
        return null;
    }

    @Override // defpackage.b2h
    public final m21 d() {
        zw0 zw0Var;
        ax0 ax0Var = new ax0();
        super.forEach(new c2h(ax0Var));
        ArrayList arrayList = ax0Var.a;
        if (arrayList.size() != 2 || arrayList.get(0) == null) {
            Object[] array = arrayList.toArray();
            Comparator<w1h<?>> comparator = zw0.d;
            for (int i = 0; i < array.length; i += 2) {
                w1h w1hVar = (w1h) array[i];
                if (w1hVar != null && w1hVar.getKey().isEmpty()) {
                    array[i] = null;
                }
            }
            zw0Var = new zw0(array, zw0.d);
        } else {
            zw0Var = new zw0(arrayList.toArray());
        }
        return zw0Var.d();
    }

    @Override // java.util.AbstractMap
    public final String toString() {
        StringBuilder sb = new StringBuilder("ExtendedAttributesMap{data=");
        sb.append(super.toString());
        sb.append(", capacity=");
        sb.append(this.a);
        sb.append(", totalAddedValues=");
        return rr1.b(sb, this.c, '}');
    }
}
