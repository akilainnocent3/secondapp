package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface tz6 {

    public static final class a implements tz6 {
        public final UiText a;

        public a(UiText uiText) {
            uiText.getClass();
            this.a = uiText;
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
            return xh8.a(this.a, "Error(msg=", ")");
        }
    }

    public static final class b implements tz6 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 843846207;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public static final class c implements tz6 {
        public final int a;
        public final uf00<g07> b;
        public final uf00<iz6> c;
        public final a07 d;
        public final boolean e;

        public c(int i, uf00<g07> uf00Var, uf00<iz6> uf00Var2, a07 a07Var, boolean z) {
            uf00Var.getClass();
            uf00Var2.getClass();
            a07Var.getClass();
            this.a = i;
            this.b = uf00Var;
            this.c = uf00Var2;
            this.d = a07Var;
            this.e = z;
        }

        public static c a(c cVar, uf00 uf00Var, uf00 uf00Var2, a07 a07Var, int i) {
            int i2 = cVar.a;
            if ((i & 2) != 0) {
                uf00Var = cVar.b;
            }
            uf00 uf00Var3 = uf00Var;
            if ((i & 4) != 0) {
                uf00Var2 = cVar.c;
            }
            uf00 uf00Var4 = uf00Var2;
            if ((i & 8) != 0) {
                a07Var = cVar.d;
            }
            a07 a07Var2 = a07Var;
            boolean z = (i & 16) != 0 ? cVar.e : true;
            uf00Var3.getClass();
            uf00Var4.getClass();
            a07Var2.getClass();
            return new c(i2, uf00Var3, uf00Var4, a07Var2, z);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && Intrinsics.g(this.b, cVar.b) && Intrinsics.g(this.c, cVar.c) && Intrinsics.g(this.d, cVar.d) && this.e == cVar.e;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.e) + ((this.d.hashCode() + yvz.a(this.c, yvz.a(this.b, Integer.hashCode(this.a) * 31, 31), 31)) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Success(tierTitleResId=");
            sb.append(this.a);
            sb.append(", filters=");
            sb.append(this.b);
            sb.append(", cards=");
            sb.append(this.c);
            sb.append(", emptyState=");
            sb.append(this.d);
            sb.append(", isReloading=");
            return mq0.a(sb, this.e, ")");
        }
    }
}
