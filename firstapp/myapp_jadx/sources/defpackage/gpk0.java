package defpackage;

import java.util.EnumMap;

/* JADX INFO: loaded from: classes4.dex */
public final class gpk0 {
    public final EnumMap a;

    public gpk0(EnumMap enumMap) {
        EnumMap enumMap2 = new EnumMap(hbl0.class);
        this.a = enumMap2;
        enumMap2.putAll(enumMap);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x001b  */
    public final void a(hbl0 hbl0Var, int i) {
        cpk0 cpk0Var;
        if (i == -30) {
            cpk0Var = cpk0.TCF;
        } else if (i == -20) {
            cpk0Var = cpk0.API;
        } else if (i == -10) {
            cpk0Var = cpk0.MANIFEST;
        } else if (i != 0) {
            cpk0Var = i != 30 ? cpk0.UNSET : cpk0.INITIALIZATION;
        } else {
            cpk0Var = cpk0.API;
        }
        this.a.put(hbl0Var, cpk0Var);
    }

    public final void b(hbl0 hbl0Var, cpk0 cpk0Var) {
        this.a.put(hbl0Var, cpk0Var);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("1");
        for (hbl0 hbl0Var : hbl0.values()) {
            cpk0 cpk0Var = (cpk0) this.a.get(hbl0Var);
            if (cpk0Var == null) {
                cpk0Var = cpk0.UNSET;
            }
            sb.append(cpk0Var.a);
        }
        return sb.toString();
    }

    public gpk0() {
        this.a = new EnumMap(hbl0.class);
    }
}
