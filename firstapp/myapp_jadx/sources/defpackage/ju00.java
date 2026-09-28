package defpackage;

import com.sportygames.newcms.CMSRes;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface ju00 {

    public static final class a implements ju00 {
        public final CMSRes a;

        public a(CMSRes cMSRes) {
            cMSRes.getClass();
            this.a = cMSRes;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "HasMusic(res=" + this.a + ')';
        }
    }

    public static final class b implements ju00 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -557449854;
        }

        public final String toString() {
            return "NoMusic";
        }
    }
}
