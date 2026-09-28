package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class e4w {
    public static final e4w b = new e4w(Collections.unmodifiableMap(new HashMap()));
    public final Map<String, String> a;

    public e4w(Map<String, String> map) {
        this.a = map;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof e4w) {
            return this.a.equals(((e4w) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a.toString();
    }
}
