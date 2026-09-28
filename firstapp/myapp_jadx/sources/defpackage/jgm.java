package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface jgm {

    public static final class a implements jgm {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 864729407;
        }

        public final String toString() {
            return "Finish";
        }
    }

    public static final class b implements jgm {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 890704458;
        }

        public final String toString() {
            return "LaunchLogin";
        }
    }

    public static final class c implements jgm {
        public final int a;
        public final Integer b;
        public final boolean c;

        public c(int i, Integer num, int i2) {
            num = (i2 & 2) != 0 ? null : num;
            boolean z = (i2 & 4) == 0;
            this.a = i;
            this.b = num;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && this.c == cVar.c;
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            Integer num = this.b;
            return Boolean.hashCode(this.c) + ((iHashCode + (num == null ? 0 : num.hashCode())) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ShowSnackbar(messageStringId=");
            sb.append(this.a);
            sb.append(", formatArgRes=");
            sb.append(this.b);
            sb.append(", withDismissAction=");
            return mq0.a(sb, this.c, ")");
        }
    }

    public static final class d implements jgm {
        public final UiText a;
        public final boolean b;

        public d(UiText uiText, boolean z) {
            uiText.getClass();
            this.a = uiText;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "ShowSnackbarMessage(message=" + this.a + ", withDismissAction=" + this.b + ")";
        }
    }
}
