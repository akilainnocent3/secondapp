package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface ne90 {

    public static final class a implements ne90 {
        public final float a;

        public a(float f) {
            this.a = f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && g7f.b(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return Float.hashCode(this.a);
        }

        public final String toString() {
            return tug.a("BottomSpacing(lastSectionHeight=", g7f.c(this.a), ")");
        }
    }

    public static final class b implements g {
        public final uf00<x690> a;

        public b(uf00<x690> uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        @Override // ne90.g
        public final uf00<x690> a() {
            return this.a;
        }
    }

    public static final class c implements d {
        public final ResourceUiText a;

        public c(ResourceUiText resourceUiText) {
            this.a = resourceUiText;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        @Override // ne90.d
        public final UiText getTitle() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oe90.a(this.a, "CommonTitle(title=", ")");
        }
    }

    public interface d extends ne90 {
        UiText getTitle();
    }

    public static final class e implements ne90 {
        public final uf00<x690> a;

        public e(uf00<x690> uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
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
            return "HomeShortcutRow(shortcuts=" + this.a + ")";
        }
    }

    public static final class f implements ne90 {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return -1893855239;
        }

        public final String toString() {
            return "SectionSeparator";
        }
    }

    public interface g extends ne90 {
        uf00<x690> a();
    }

    public static final class h implements ne90 {
        public final uf00<yg90> a;

        public h(uf00<yg90> uf00Var) {
            uf00Var.getClass();
            this.a = uf00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && Intrinsics.g(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TabBar(tabs=" + this.a + ")";
        }
    }

    public interface i {
        v690 b();
    }

    public static final class j implements d, i {
        public final ResourceUiText a;
        public final v690 b;

        public j(ResourceUiText resourceUiText, v690 v690Var) {
            v690Var.getClass();
            this.a = resourceUiText;
            this.b = v690Var;
        }

        @Override // ne90.i
        public final v690 b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && this.b == jVar.b;
        }

        @Override // ne90.d
        public final UiText getTitle() {
            return this.a;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TabHeader(title=" + this.a + ", group=" + this.b + ")";
        }
    }

    public static final class k implements ne90, i {
        public final v690 a;

        public k(v690 v690Var) {
            v690Var.getClass();
            this.a = v690Var;
        }

        @Override // ne90.i
        public final v690 b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof k) && this.a == ((k) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "TabSeparator(group=" + this.a + ")";
        }
    }

    public static final class l implements g, i {
        public final uf00<x690> a;
        public final v690 b;

        public l(uf00<x690> uf00Var, v690 v690Var) {
            uf00Var.getClass();
            v690Var.getClass();
            this.a = uf00Var;
            this.b = v690Var;
        }

        @Override // ne90.g
        public final uf00<x690> a() {
            return this.a;
        }

        @Override // ne90.i
        public final v690 b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return Intrinsics.g(this.a, lVar.a) && this.b == lVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TabShorts(shortcuts=" + this.a + ", group=" + this.b + ")";
        }
    }
}
