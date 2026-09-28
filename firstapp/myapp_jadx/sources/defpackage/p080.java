package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public abstract class p080 {

    public static final class a extends p080 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 367667900;
        }

        public final String toString() {
            return "ShowEditBetMutexDialog";
        }
    }

    public static final class b extends p080 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -753112751;
        }

        public final String toString() {
            return "ShowJokerConflictDialog";
        }
    }

    public static final class c extends p080 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -651277606;
        }

        public final String toString() {
            return "ShowLimitExceededDialog";
        }
    }

    public static final class d extends p080 {
        public final String a;
        public final String b;
        public final boolean c;

        public d(String str, String str2, boolean z) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && Intrinsics.g(this.b, dVar.b) && this.c == dVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + gmf0.a(this.a.hashCode() * 31, 31, this.b);
        }

        public final String toString() {
            return mq0.a(ux5.a("ShowStatsDialog(eventId=", this.a, ", sportId=", this.b, ", isLive="), this.c, ")");
        }
    }

    public static final class e extends p080 {
        public final ResourceUiText a;

        public e(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oe90.a(this.a, "ShowToastMessage(message=", ")");
        }
    }
}
