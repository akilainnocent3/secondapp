package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface aoe0 {

    public static final class a implements aoe0 {
        public final int a;
        public final String b;
        public final String c;
        public final Boolean d;
        public final Integer e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final String i;

        public a(int i, String str, String str2, Boolean bool, Integer num, boolean z, boolean z2, boolean z3, String str3) {
            str3.getClass();
            this.a = i;
            this.b = str;
            this.c = str2;
            this.d = bool;
            this.e = num;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = str3;
        }

        @Override // defpackage.aoe0
        public final boolean a() {
            return this.g;
        }

        @Override // defpackage.aoe0
        public final boolean b() {
            return this.f;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && Intrinsics.g(this.b, aVar.b) && Intrinsics.g(this.c, aVar.c) && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && this.f == aVar.f && this.g == aVar.g && this.h == aVar.h && Intrinsics.g(this.i, aVar.i);
        }

        @Override // defpackage.aoe0
        public final Object getId() {
            return Integer.valueOf(this.a);
        }

        public final int hashCode() {
            int iHashCode = Integer.hashCode(this.a) * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Boolean bool = this.d;
            int iHashCode4 = (iHashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
            Integer num = this.e;
            return this.i.hashCode() + mtg0.a(mtg0.a(mtg0.a((iHashCode4 + (num != null ? num.hashCode() : 0)) * 31, 31, this.f), 31, this.g), 31, this.h);
        }

        public final String toString() {
            StringBuilder sbA = uqe0.a(this.a, "Bank(id=", ", bankName=", this.b, ", bankIconUrl=");
            x03.a(sbA, this.c, ", ranked=", this.d, ", rank=");
            sbA.append(this.e);
            sbA.append(", isSelected=");
            sbA.append(this.f);
            sbA.append(", isEditing=");
            nng.a(", isRecommended=", ", description=", sbA, this.g, this.h);
            return uf80.a(sbA, this.i, ")");
        }
    }

    public static final class b implements aoe0, e, c, d {
        public final Object a;
        public final String b;
        public final String c;
        public final String d;
        public final String e;
        public final boolean f;
        public final boolean g;
        public final boolean h;
        public final boolean i;
        public final a j;

        /* JADX WARN: Enum visitor error
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v1 aoe0$b$a[], still in use, count: 1, list:
          (r0v1 aoe0$b$a[]) from 0x003a: CONSTRUCTOR (r0v1 aoe0$b$a[]) A[MD:(T extends java.lang.Enum<T>[]):void (m), WRAPPED] (LINE:59) call: uag.<init>(java.lang.Enum[]):void type: CONSTRUCTOR
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.lambda$unbindInsns$1(InsnRemover.java:101)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.utils.InsnRemover.unbindInsns(InsnRemover.java:100)
        	at jadx.core.utils.InsnRemover.removeAllAndUnbind(InsnRemover.java:257)
        	at jadx.core.dex.visitors.EnumVisitor.convertToEnum(EnumVisitor.java:187)
        	at jadx.core.dex.visitors.EnumVisitor.visit(EnumVisitor.java:102)
         */
        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        public static final class a {
            /* JADX INFO: Fake field, exist only in values array */
            NONE(10),
            /* JADX INFO: Fake field, exist only in values array */
            SUBMITTED(20),
            /* JADX INFO: Fake field, exist only in values array */
            APPROVED(30),
            /* JADX INFO: Fake field, exist only in values array */
            REJECTED(40),
            /* JADX INFO: Fake field, exist only in values array */
            MISSING(50);

            public static final C0082a b = new C0082a();
            public static final /* synthetic */ uag d = new uag(new a[]{new a(10), new a(20), new a(30), new a(40), new a(50)});
            public final int a;

            /* JADX INFO: renamed from: aoe0$b$a$a, reason: collision with other inner class name */
            public static final class C0082a {
            }

            static {
            }

            public a(int i) {
                super(str, i);
                this.a = i;
            }

            public static a valueOf(String str) {
                return (a) Enum.valueOf(a.class, str);
            }

            public static a[] values() {
                return (a[]) c.clone();
            }
        }

        public b(Object obj, String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4, a aVar) {
            obj.getClass();
            this.a = obj;
            this.b = str;
            this.c = str2;
            this.d = str3;
            this.e = str4;
            this.f = z;
            this.g = z2;
            this.h = z3;
            this.i = z4;
            this.j = aVar;
        }

        @Override // defpackage.aoe0
        public final boolean a() {
            return this.g;
        }

        @Override // defpackage.aoe0
        public final boolean b() {
            return this.f;
        }

        @Override // aoe0.d
        public final boolean c() {
            return this.i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return Intrinsics.g(this.a, bVar.a) && Intrinsics.g(this.b, bVar.b) && Intrinsics.g(this.c, bVar.c) && Intrinsics.g(this.d, bVar.d) && Intrinsics.g(this.e, bVar.e) && this.f == bVar.f && this.g == bVar.g && this.h == bVar.h && this.i == bVar.i && this.j == bVar.j;
        }

        @Override // defpackage.aoe0
        public final Object getId() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.d;
            int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.e;
            int iA = mtg0.a(mtg0.a(mtg0.a(mtg0.a((iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h), 31, this.i);
            a aVar = this.j;
            return iA + (aVar != null ? aVar.hashCode() : 0);
        }

        @Override // aoe0.e
        public final boolean isDefault() {
            return this.h;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BankAccount(id=");
            sb.append(this.a);
            sb.append(", bankName=");
            sb.append(this.b);
            sb.append(", bankIconUrl=");
            hxa.c(sb, this.c, ", bankAccountNumber=", this.d, ", bankAccountName=");
            uts.b(this.e, ", isSelected=", ", isEditing=", sb, this.f);
            nng.a(", isDefault=", ", isDisabled=", sb, this.g, this.h);
            sb.append(this.i);
            sb.append(", status=");
            sb.append(this.j);
            sb.append(")");
            return sb.toString();
        }
    }

    public interface c {
    }

    public interface d {
        boolean c();
    }

    public interface e {
        boolean isDefault();
    }

    public static final class f implements aoe0 {
        public final Object a;
        public final boolean b;
        public final boolean c;
        public final UiText d;

        public f(Object obj, boolean z, boolean z2, UiText uiText) {
            obj.getClass();
            uiText.getClass();
            this.a = obj;
            this.b = z;
            this.c = z2;
            this.d = uiText;
        }

        @Override // defpackage.aoe0
        public final boolean a() {
            return this.c;
        }

        @Override // defpackage.aoe0
        public final boolean b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return Intrinsics.g(this.a, fVar.a) && this.b == fVar.b && this.c == fVar.c && Intrinsics.g(this.d, fVar.d);
        }

        @Override // defpackage.aoe0
        public final Object getId() {
            return this.a;
        }

        public final int hashCode() {
            return this.d.hashCode() + mtg0.a(mtg0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        }

        public final String toString() {
            return "Label(id=" + this.a + ", isSelected=" + this.b + ", isEditing=" + this.c + ", label=" + this.d + ")";
        }
    }

    public static final class g implements aoe0, e {
        public final Object a;
        public final String b;
        public final boolean c;
        public final boolean d;
        public final boolean e;
        public final boolean f;

        public g(Object obj, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            obj.getClass();
            str.getClass();
            this.a = obj;
            this.b = str;
            this.c = z;
            this.d = z2;
            this.e = z3;
            this.f = z4;
        }

        @Override // defpackage.aoe0
        public final boolean a() {
            return this.d;
        }

        @Override // defpackage.aoe0
        public final boolean b() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.g(this.a, gVar.a) && Intrinsics.g(this.b, gVar.b) && this.c == gVar.c && this.d == gVar.d && this.e == gVar.e && this.f == gVar.f;
        }

        @Override // defpackage.aoe0
        public final Object getId() {
            return this.a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.f) + mtg0.a(mtg0.a(mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e);
        }

        @Override // aoe0.e
        public final boolean isDefault() {
            return this.e;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MobileNumber(id=");
            sb.append(this.a);
            sb.append(", mobileNumber=");
            sb.append(this.b);
            sb.append(", isSelected=");
            nng.a(", isEditing=", ", isDefault=", sb, this.c, this.d);
            return lng.a(", isPrimary=", ")", sb, this.e, this.f);
        }
    }

    public static final class h implements aoe0 {
        public final Object a;
        public final String b;
        public final String c;
        public final boolean d;
        public final boolean e;

        public h(Object obj, String str, String str2, boolean z, boolean z2) {
            this.a = obj;
            this.b = str;
            this.c = str2;
            this.d = z;
            this.e = z2;
        }

        @Override // defpackage.aoe0
        public final boolean a() {
            return this.e;
        }

        @Override // defpackage.aoe0
        public final boolean b() {
            return this.d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return this.a.equals(hVar.a) && Intrinsics.g(this.b, hVar.b) && Intrinsics.g(this.c, hVar.c) && this.d == hVar.d && this.e == hVar.e;
        }

        @Override // defpackage.aoe0
        public final Object getId() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.c;
            return Boolean.hashCode(this.e) + mtg0.a((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("MomoTelecom(id=");
            sb.append(this.a);
            sb.append(", channelDisplayName=");
            sb.append(this.b);
            sb.append(", channelIconUrl=");
            uts.b(this.c, ", isSelected=", ", isEditing=", sb, this.d);
            return mq0.a(sb, this.e, ")");
        }
    }

    boolean a();

    boolean b();

    Object getId();
}
