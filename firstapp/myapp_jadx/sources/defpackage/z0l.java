package defpackage;

import com.sportybet.plugin.sportypicks.domain.model.Kjqv.DZsoPoBl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface z0l extends id90 {

    public static final class a implements z0l {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1526433364;
        }

        public final String toString() {
            return "DismissProgressIndicator";
        }
    }

    public static final class b implements z0l {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 376236668;
        }

        public final String toString() {
            return "NavigateToAllTab";
        }
    }

    public static final class c implements z0l {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return pe4.b(this.a, "SelectOuterTab(tabIndex=", ")");
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class d implements z0l {
        public final n990 a;

        public d(n990 n990Var) {
            n990Var.getClass();
            this.a = n990Var;
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
            return "ShowChannelTooltipDialog(instructions=" + this.a + DZsoPoBl.TXIFMYIqASbyEmy;
        }
    }

    public static final class e implements z0l {
        public static final e a = new e();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        public final int hashCode() {
            return 36250889;
        }

        public final String toString() {
            return "ShowProgressIndicator";
        }
    }

    public static final class f implements z0l {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 1102640431;
        }

        public final String toString() {
            return "ShowSomethingWentWrongToast";
        }
    }
}
