package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final class gtp {
    public final boolean a;
    public final a b;
    public final boolean c;

    public interface a {

        /* JADX INFO: renamed from: gtp$a$a, reason: collision with other inner class name */
        public static final class C0608a implements a {
            public final ResourceUiText a;
            public final int b;

            public C0608a(int i, ResourceUiText resourceUiText) {
                this.a = resourceUiText;
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0608a)) {
                    return false;
                }
                C0608a c0608a = (C0608a) obj;
                return this.a.equals(c0608a.a) && this.b == c0608a.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "HtmlText(text=" + this.a + ", minTier=" + this.b + ")";
            }
        }

        public static final class b implements a {
            public final ResourceUiText a;

            public b(ResourceUiText resourceUiText) {
                this.a = resourceUiText;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.a.equals(((b) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return oe90.a(this.a, "SimpleText(text=", ")");
            }
        }
    }

    public gtp(boolean z, a aVar, boolean z2) {
        this.a = z;
        this.b = aVar;
        this.c = z2;
    }

    public static gtp a(gtp gtpVar, boolean z, a aVar, boolean z2, int i) {
        if ((i & 1) != 0) {
            z = gtpVar.a;
        }
        if ((i & 2) != 0) {
            aVar = gtpVar.b;
        }
        if ((i & 4) != 0) {
            z2 = gtpVar.c;
        }
        return new gtp(z, aVar, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gtp)) {
            return false;
        }
        gtp gtpVar = (gtp) obj;
        return this.a == gtpVar.a && Intrinsics.g(this.b, gtpVar.b) && this.c == gtpVar.c;
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.a) * 31;
        a aVar = this.b;
        return Boolean.hashCode(this.c) + ((iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("KycMessageState(isVisible=");
        sb.append(this.a);
        sb.append(", message=");
        sb.append(this.b);
        sb.append(", isClickable=");
        return mq0.a(sb, this.c, ")");
    }

    public /* synthetic */ gtp(int i) {
        this(false, null, false);
    }

    public gtp() {
        this(0);
    }
}
