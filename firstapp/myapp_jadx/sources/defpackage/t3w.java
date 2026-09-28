package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final class t3w {
    public final String a;
    public final LinkedHashSet<pu90<?>> b;
    public final LinkedHashMap<String, ynn<?>> c;
    public final LinkedHashSet<cb30> d;
    public final ArrayList e;

    public t3w(int i) {
        this.a = z7b.d();
        this.b = new LinkedHashSet<>();
        this.c = new LinkedHashMap<>();
        this.d = new LinkedHashSet<>();
        this.e = new ArrayList();
    }

    public final void a(ynn<?> ynnVar) {
        String value;
        yd2<?> yd2Var = ynnVar.a;
        dq7 dq7Var = yd2Var.b;
        cb30 cb30Var = yd2Var.c;
        cb30 cb30Var2 = yd2Var.a;
        StringBuilder sb = new StringBuilder(zgp.a(dq7Var));
        sb.append(':');
        if (cb30Var == null || (value = cb30Var.getValue()) == null) {
            value = "";
        }
        sb.append(value);
        sb.append(':');
        sb.append(cb30Var2);
        this.c.put(sb.toString(), ynnVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t3w)) {
            return false;
        }
        return Intrinsics.g(this.a, ((t3w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public t3w() {
        this(0);
    }
}
