package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes.dex */
public final class q3h {
    public static volatile q3h b;
    public static final q3h c = new q3h(0);
    public final Map<a, m1k.e<?, ?>> a;

    public static final class a {
        public final Object a;
        public final int b;

        public a(int i, xnv xnvVar) {
            this.a = xnvVar;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.a) * Settings.DEFAULT_INITIAL_WINDOW_SIZE) + this.b;
        }
    }

    public q3h() {
        this.a = new HashMap();
    }

    public static q3h a() {
        q3h q3hVar;
        w630 w630Var = w630.c;
        q3h q3hVar2 = b;
        if (q3hVar2 != null) {
            return q3hVar2;
        }
        synchronized (q3h.class) {
            try {
                q3hVar = b;
                if (q3hVar == null) {
                    Class<?> cls = p3h.a;
                    q3h q3hVar3 = null;
                    if (cls != null) {
                        try {
                            q3hVar3 = (q3h) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    q3hVar = q3hVar3 != null ? q3hVar3 : c;
                    b = q3hVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return q3hVar;
    }

    public q3h(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
