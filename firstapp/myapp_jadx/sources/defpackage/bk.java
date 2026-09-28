package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface bk {

    public static final class a implements bk {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        @Override // defpackage.bk
        public final String getNumber() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Disabled(number=", this.a, ")");
        }
    }

    public static final class b implements bk {
        public final String a;

        public b(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        @Override // defpackage.bk
        public final String getNumber() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("Enabled(number=", this.a, ")");
        }
    }

    public static final class c implements bk {
        public final String a;
        public final ResourceUiText b;

        public c(ResourceUiText resourceUiText, String str) {
            str.getClass();
            this.a = str;
            this.b = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.a, cVar.a) && this.b.equals(cVar.b);
        }

        @Override // defpackage.bk
        public final String getNumber() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Error(number=" + this.a + ", errorText=" + this.b + ")";
        }
    }

    public static final class d implements bk {
        public final String a;
        public final ResourceUiText b;

        public d(ResourceUiText resourceUiText, String str) {
            str.getClass();
            this.a = str;
            this.b = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b.equals(dVar.b);
        }

        @Override // defpackage.bk
        public final String getNumber() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Hint(number=" + this.a + ", hintText=" + this.b + ")";
        }
    }

    String getNumber();
}
