package defpackage;

import java.io.Serializable;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes8.dex */
public final class s2y {
    public static final s2y a;
    public static final /* synthetic */ s2y[] b;

    public static final class a implements Serializable {
    }

    public static final class b implements Serializable {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return yby.a(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NotificationLite.Error[" + this.a + "]";
        }
    }

    public static final class c implements Serializable {
    }

    static {
        s2y s2yVar = new s2y("COMPLETE", 0);
        a = s2yVar;
        b = new s2y[]{s2yVar};
    }

    public s2y() {
        throw null;
    }

    public static s2y valueOf(String str) {
        return (s2y) Enum.valueOf(s2y.class, str);
    }

    public static s2y[] values() {
        return (s2y[]) b.clone();
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "NotificationLite.Complete";
    }
}
