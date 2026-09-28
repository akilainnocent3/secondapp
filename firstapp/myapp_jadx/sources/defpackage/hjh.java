package defpackage;

import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class hjh {
    public final String a;
    public final Map<Class<?>, Object> b;

    public hjh(String str, Map<Class<?>, Object> map) {
        this.a = str;
        this.b = map;
    }

    public static hjh a(String str) {
        return new hjh(str, Collections.EMPTY_MAP);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hjh)) {
            return false;
        }
        hjh hjhVar = (hjh) obj;
        return this.a.equals(hjhVar.a) && this.b.equals(hjhVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FieldDescriptor{name=" + this.a + ", properties=" + this.b.values() + "}";
    }
}
