package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface t1f {

    public static final class a implements t1f {
        public final boolean a;
        public final UiText b;
        public final String c;
        public final ArrayList d;

        /* JADX INFO: renamed from: t1f$a$a, reason: collision with other inner class name */
        public static final class C1111a {
            public final String a;
            public final String b;

            public C1111a(String str, String str2) {
                str.getClass();
                str2.getClass();
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1111a)) {
                    return false;
                }
                C1111a c1111a = (C1111a) obj;
                return Intrinsics.g(this.a, c1111a.a) && Intrinsics.g(this.b, c1111a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return tx5.a("Selection(betOutcomeDesc=", this.a, ", marketTitle=", this.b, ")");
            }
        }

        public a(boolean z, UiText uiText, String str, ArrayList arrayList) {
            uiText.getClass();
            str.getClass();
            this.a = z;
            this.b = uiText;
            this.c = str;
            this.d = arrayList;
        }

        @Override // defpackage.t1f
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && this.d.equals(aVar.d);
        }

        public final int hashCode() {
            return this.d.hashCode() + gmf0.a(yvf.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "BetBuilder(isHit=" + this.a + ", outcomeTitle=" + this.b + ", oddString=" + this.c + ", selections=" + this.d + ")";
        }
    }

    public static final class b implements t1f {
        public final boolean a;
        public final UiText b;
        public final String c;
        public final String d;
        public final String e;

        public b(boolean z, UiText uiText, String str, String str2, String str3) {
            uiText.getClass();
            str.getClass();
            str2.getClass();
            str3.getClass();
            this.a = z;
            this.b = uiText;
            this.c = str;
            this.d = str2;
            this.e = str3;
        }

        @Override // defpackage.t1f
        public final boolean a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e);
        }

        public final int hashCode() {
            return this.e.hashCode() + gmf0.a(gmf0.a(yvf.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Common(isHit=");
            sb.append(this.a);
            sb.append(", outcomeTitle=");
            sb.append(this.b);
            sb.append(", oddString=");
            hxa.c(sb, this.c, ", marketTitle=", this.d, ", betOutcomeDesc=");
            return uf80.a(sb, this.e, ")");
        }
    }

    boolean a();
}
