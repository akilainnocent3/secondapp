package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class ftr {
    public final Object a;
    public final LinkedHashMap b = new LinkedHashMap();

    public ftr(Object obj) {
        this.a = obj;
    }

    public Object a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ftr) && Intrinsics.g(a(), ((ftr) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
