package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public abstract class slt {

    public static final class a extends slt {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 168585488;
        }

        public final String toString() {
            return "Error";
        }
    }

    public static final class b extends slt {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 617535044;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c extends slt {
        public final LinkedHashMap a;

        public c(LinkedHashMap linkedHashMap) {
            this.a = linkedHashMap;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.g(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(lossLimitCards=" + this.a + ")";
        }
    }
}
