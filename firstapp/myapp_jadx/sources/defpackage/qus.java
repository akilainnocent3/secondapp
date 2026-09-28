package defpackage;

import com.sportybet.plugin.realsports.data.LiveStreamData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class qus {

    public static final class a extends qus {
        public final String a;

        public a(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return tug.a("Error(message=", this.a, ")");
        }
    }

    public static final class b extends qus {
        public final LiveStreamData a;

        public b(LiveStreamData liveStreamData) {
            this.a = liveStreamData;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            LiveStreamData liveStreamData = this.a;
            if (liveStreamData == null) {
                return 0;
            }
            return liveStreamData.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.a + ")";
        }
    }

    public static final class c extends qus {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1930017696;
        }

        public final String toString() {
            return "Unavailable";
        }
    }
}
