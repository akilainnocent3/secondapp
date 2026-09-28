package defpackage;

import com.sportygames.multilevel.common.model.UserLevelProgressDto;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface jph0 {

    public static final class a implements jph0 {
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

    public static final class b implements jph0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -411955070;
        }

        public final String toString() {
            return "Idle";
        }
    }

    public static final class c implements jph0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1135421902;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class d implements jph0 {
        public final UserLevelProgressDto a;

        public d(UserLevelProgressDto userLevelProgressDto) {
            userLevelProgressDto.getClass();
            this.a = userLevelProgressDto;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Success(progress=" + this.a + ")";
        }
    }
}
