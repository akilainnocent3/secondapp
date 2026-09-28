package defpackage;

import com.appsflyer.internal.h;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface y43 {

    public interface a extends y43 {

        /* JADX INFO: renamed from: y43$a$a, reason: collision with other inner class name */
        public static final class C1324a implements a {
            public final int a;
            public final boolean b;

            public C1324a(int i, boolean z) {
                this.a = i;
                this.b = z;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1324a)) {
                    return false;
                }
                C1324a c1324a = (C1324a) obj;
                return this.a == c1324a.a && this.b == c1324a.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "BankerCheckChanged(adapterPosition=" + this.a + ", isChecked=" + this.b + ")";
            }
        }

        public static final class b implements a {
            public final int a;
            public final boolean b;

            public b(int i, boolean z) {
                this.a = i;
                this.b = z;
            }

            @Override // defpackage.y43
            public final int a() {
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
                return this.a == bVar.a && this.b == bVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "EarlyGoalsStatusChanged(adapterPosition=" + this.a + ", isChecked=" + this.b + ")";
            }
        }

        public static final class c implements a {
            public final int a;

            public c(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
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
                return pe4.b(this.a, "EditBetUndoClicked(adapterPosition=", ")");
            }
        }

        public static final class d implements a {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "GoToDepositClicked(adapterPosition=", ")");
            }
        }

        public static final class e implements a {
            public final int a;

            public e(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "ItemClicked(adapterPosition=", ")");
            }
        }

        public static final class f implements a {
            public final int a;

            public f(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "ItemDeleteClicked(adapterPosition=", ")");
            }
        }

        public static final class g implements a {
            public final int a;

            public g(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.a == ((g) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "ItemPartClicked(adapterPosition=", ")");
            }
        }

        public static final class h implements a {
            public final int a;

            public h(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && this.a == ((h) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "NeverDownInfoClicked(adapterPosition=", ")");
            }
        }

        public static final class i implements a {
            public final int a;
            public final boolean b;

            public i(int i, boolean z) {
                this.a = i;
                this.b = z;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof i)) {
                    return false;
                }
                i iVar = (i) obj;
                return this.a == iVar.a && this.b == iVar.b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return "NeverDownStatusChanged(adapterPosition=" + this.a + ", toActivated=" + this.b + ")";
            }
        }

        public static final class j implements a {
            public final int a;
            public final zuy b;
            public final huy c;
            public final avy d;
            public final avy e;

            public j(int i, zuy zuyVar, huy huyVar, avy avyVar, avy avyVar2) {
                this.a = i;
                this.b = zuyVar;
                this.c = huyVar;
                this.d = avyVar;
                this.e = avyVar2;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.a == jVar.a && this.b == jVar.b && this.c == jVar.c && this.d == jVar.d && this.e == jVar.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31)) * 31)) * 31);
            }

            public final String toString() {
                return "OneTwoUpStatusChanged(adapterPosition=" + this.a + ", upState=" + this.b + ", upCase=" + this.c + ", toStatus=" + this.d + ", fromStatus=" + this.e + ")";
            }
        }

        public static final class k implements a {
            public final int a;
            public final String b;

            public k(int i, String str) {
                str.getClass();
                this.a = i;
                this.b = str;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof k)) {
                    return false;
                }
                k kVar = (k) obj;
                return this.a == kVar.a && Intrinsics.g(this.b, kVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return com.appsflyer.internal.h.a(this.a, "SingleStakeAmountTextChanged(adapterPosition=", ", amountText=", this.b, ")");
            }
        }

        public static final class l implements a {
            public final int a;

            public l(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof l) && this.a == ((l) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "SingleStakeEditTextClicked(adapterPosition=", ")");
            }
        }

        public static final class m implements a {
            public final int a;

            public m(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof m) && this.a == ((m) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "SingleStakeEditTextTouched(adapterPosition=", ")");
            }
        }

        public static final class n implements a {
            public final int a;

            public n(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof n) && this.a == ((n) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "SingleStakeKeyboardDoneClicked(adapterPosition=", ")");
            }
        }
    }

    public interface b extends y43 {

        public static final class a implements b {
            public final int a;

            public a(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.a == ((a) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "GoToDepositClicked(adapterPosition=", ")");
            }
        }

        /* JADX INFO: renamed from: y43$b$b, reason: collision with other inner class name */
        public static final class C1325b implements b {
            public final int a;

            public C1325b(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1325b) && this.a == ((C1325b) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "ItemClicked(adapterPosition=", ")");
            }
        }

        public static final class c implements b {
            public final int a;
            public final String b;

            public c(int i, String str) {
                str.getClass();
                this.a = i;
                this.b = str;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.a == cVar.a && Intrinsics.g(this.b, cVar.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return h.a(this.a, "SystemStakeAmountTextChanged(adapterPosition=", ", amountText=", this.b, ")");
            }
        }

        public static final class d implements b {
            public final int a;

            public d(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && this.a == ((d) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "SystemStakeEditTextClicked(adapterPosition=", ")");
            }
        }

        public static final class e implements b {
            public final int a;

            public e(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof e) && this.a == ((e) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "SystemStakeEditTextTouched(adapterPosition=", ")");
            }
        }

        public static final class f implements b {
            public final int a;

            public f(int i) {
                this.a = i;
            }

            @Override // defpackage.y43
            public final int a() {
                return this.a;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof f) && this.a == ((f) obj).a;
            }

            public final int hashCode() {
                return Integer.hashCode(this.a);
            }

            public final String toString() {
                return pe4.b(this.a, "SystemStakeKeyboardDoneClicked(adapterPosition=", ")");
            }
        }
    }

    int a();
}
