package defpackage;

import com.sportybet.android.social.domain.SocialRouter$PersonalSocial;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface bba0 {

    public static final class a implements bba0 {
        public final String a;
        public final String b;

        public a(String str, String str2) {
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && Intrinsics.g(this.b, aVar.b);
        }

        public final int hashCode() {
            String str = this.a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            return tx5.a("CreateMySportySocial(nickname=", this.a, ", toFollow=", this.b, ")");
        }
    }

    public static final class b implements bba0 {
        public final bba0 a;

        public b(bba0 bba0Var) {
            this.a = bba0Var;
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
            return "DemandAccount(by=" + this.a + ")";
        }
    }

    public static final class c implements bba0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1408466027;
        }

        public final String toString() {
            return "ExceedFollowLimit";
        }
    }

    public static final class d implements bba0 {
        public final String a;
        public final boolean b;

        public d(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return Intrinsics.g(this.a, dVar.a) && this.b == dVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("FollowUser(nickname=", this.a, ", update=", ")", this.b);
        }
    }

    public static final class e implements bba0 {
        public final SocialRouter$PersonalSocial.Data a;

        static {
            SocialRouter$PersonalSocial.Data.Companion companion = SocialRouter$PersonalSocial.Data.INSTANCE;
        }

        public e(SocialRouter$PersonalSocial.Data data) {
            data.getClass();
            this.a = data;
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
            return "NotifyCodeState(state=" + this.a + ")";
        }
    }

    public static final class f implements bba0 {
        public final String a;

        public f(String str) {
            str.getClass();
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && Intrinsics.g(this.a, ((f) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("NotifyCreationSuccess(nickname=", this.a, ")");
        }
    }

    public static final class g implements bba0 {
        public final String a;
        public final boolean b;

        public g(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return Intrinsics.g(this.a, gVar.a) && this.b == gVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("NotifyFollowSuccess(nickname=", this.a, ", isUnfollow=", ")", this.b);
        }
    }

    public static final class h implements bba0 {
        public final String a;
        public final boolean b;

        public h(String str, boolean z) {
            str.getClass();
            this.a = str;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            h hVar = (h) obj;
            return Intrinsics.g(this.a, hVar.a) && this.b == hVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tzx.a("UnfollowUser(nickname=", this.a, ", update=", ")", this.b);
        }
    }

    public static final class i implements bba0 {
        public static final i a = new i();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        public final int hashCode() {
            return 2118531126;
        }

        public final String toString() {
            return "UpdateFollowState";
        }
    }
}
