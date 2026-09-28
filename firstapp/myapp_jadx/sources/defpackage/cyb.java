package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class cyb {
    public final LinkedHashMap a = new LinkedHashMap();

    public static final class a extends cyb {
        public static final a b = new a();

        @Override // defpackage.cyb
        public final <T> T a(b<T> bVar) {
            return null;
        }
    }

    public interface b<T> {
    }

    public abstract <T> T a(b<T> bVar);

    public final boolean equals(Object obj) {
        if (obj instanceof cyb) {
            return Intrinsics.g(this.a, ((cyb) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "CreationExtras(extras=" + this.a + ')';
    }
}
