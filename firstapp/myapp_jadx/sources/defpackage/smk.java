package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public interface smk {

    public interface a extends smk {

        /* JADX INFO: renamed from: smk$a$a, reason: collision with other inner class name */
        public static final class C1095a implements a {
            public static final C1095a a = new C1095a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1095a);
            }

            public final int hashCode() {
                return -1721243457;
            }

            public final String toString() {
                return "DismissRequested";
            }
        }

        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -32182803;
            }

            public final String toString() {
                return "RetryFetch";
            }
        }

        public static final class c implements a {
            public final String a;

            public c(String str) {
                this.a = str;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && this.a.equals(((c) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return tug.a("SelectGift(selectedGiftId=", this.a, ")");
            }
        }

        public static final class d implements a {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 580743702;
            }

            public final String toString() {
                return "ShowRequested";
            }
        }

        public static final class e implements a {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 449660700;
            }

            public final String toString() {
                return "UseCashOnlyClicked";
            }
        }
    }

    public interface b extends smk {

        public static final class a implements b {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 956989516;
            }

            public final String toString() {
                return "CancelRequested";
            }
        }

        /* JADX INFO: renamed from: smk$b$b, reason: collision with other inner class name */
        public static final class C1096b implements b {
            public final boolean a;

            public C1096b(boolean z) {
                this.a = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1096b) && this.a == ((C1096b) obj).a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.a);
            }

            public final String toString() {
                return b6c.a("SetAddToStakeEnabled(isEnabled=", ")", this.a);
            }
        }

        public static final class c implements b {
            public final cyk a;

            public c(cyk cykVar) {
                cykVar.getClass();
                this.a = cykVar;
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
                return "SetGiftValueOption(option=" + this.a + ")";
            }
        }

        public static final class d implements b {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1433625897;
            }

            public final String toString() {
                return "ShowRequested";
            }
        }

        public static final class e implements b {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 2109181327;
            }

            public final String toString() {
                return "UseGift";
            }
        }

        public static final class f implements b {
            public static final f a = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 2070549345;
            }

            public final String toString() {
                return "UseOtherGift";
            }
        }
    }

    public interface c extends smk {

        public static final class a implements c {
            public static final a a = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1992796118;
            }

            public final String toString() {
                return "HideGiftSelector";
            }
        }

        public static final class b implements c {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 280672999;
            }

            public final String toString() {
                return "HideGiftValueEditor";
            }
        }

        /* JADX INFO: renamed from: smk$c$c, reason: collision with other inner class name */
        public static final class C1097c implements c {
            public static final C1097c a = new C1097c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1097c);
            }

            public final int hashCode() {
                return -627285261;
            }

            public final String toString() {
                return "RequestFetchGifts";
            }
        }

        public static final class d implements c {
            public static final d a = new d();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof d);
            }

            public final int hashCode() {
                return 1206838545;
            }

            public final String toString() {
                return "ShowGiftSelector";
            }
        }

        public static final class e implements c {
            public static final e a = new e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof e);
            }

            public final int hashCode() {
                return 1980313548;
            }

            public final String toString() {
                return "ShowGiftValueEditor";
            }
        }
    }
}
