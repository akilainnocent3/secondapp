package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface cdr {

    public static final class a implements cdr {
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

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("SaveImage(imageUrl=", this.a, ")");
        }
    }

    public static final class b implements cdr {
        public final bcr a;
        public final String b;
        public final String c;
        public final ResourceUiText d;

        public b(bcr bcrVar, String str, String str2, ResourceUiText resourceUiText) {
            str.getClass();
            str2.getClass();
            this.a = bcrVar;
            this.b = str;
            this.c = str2;
            this.d = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && this.d.equals(bVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + gmf0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "ShareUrl(type=" + this.a + ", shareUrl=" + this.b + ", shareImageUrl=" + this.c + ", shareText=" + this.d + ")";
        }
    }

    public static final class c implements cdr {
        public final String a;

        public c(String str) {
            str.getClass();
            this.a = str;
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
            return tug.a("ZoomIn(localeImageUrl=", this.a, ")");
        }
    }
}
