package defpackage;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import okhttp3.internal.http2.Settings;

/* JADX INFO: loaded from: classes4.dex */
public final class r3h {
    public static volatile r3h b;
    public static final r3h c = new r3h(0);
    public final Map<a, n1k.e<?, ?>> a;

    public static final class a {
        public final Object a;
        public final int b;

        public a(wnv wnvVar, int i) {
            this.a = wnvVar;
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

    public r3h() {
        this.a = new HashMap();
    }

    public static r3h a() {
        r3h r3hVar;
        r3h r3hVar2 = b;
        if (r3hVar2 != null) {
            return r3hVar2;
        }
        synchronized (r3h.class) {
            try {
                r3hVar = b;
                if (r3hVar == null) {
                    Class<?> cls = o3h.a;
                    r3h r3hVar3 = null;
                    if (cls != null) {
                        try {
                            r3hVar3 = (r3h) cls.getDeclaredMethod("getEmptyRegistry", null).invoke(null, null);
                        } catch (Exception unused) {
                        }
                    }
                    r3hVar = r3hVar3 != null ? r3hVar3 : c;
                    b = r3hVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return r3hVar;
    }

    public r3h(int i) {
        this.a = Collections.EMPTY_MAP;
    }
}
