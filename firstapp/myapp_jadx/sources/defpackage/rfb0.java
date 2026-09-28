package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.Sports;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public abstract class rfb0 {

    public static final class a extends rfb0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 981922154;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class b extends rfb0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1679924476;
        }

        public final String toString() {
            return "NoSportsData";
        }
    }

    public static final class c extends rfb0 {
        public final Sports a;

        public c(Sports sports) {
            sports.getClass();
            this.a = sports;
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
            return "SportsExist(data=" + this.a + ")";
        }
    }
}
