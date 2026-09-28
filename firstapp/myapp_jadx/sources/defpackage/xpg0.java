package defpackage;

import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Locale;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public interface xpg0 extends pdd0 {

    public static final class a implements xpg0 {
        public final String a = "transaction_detail__verify_btn__click";

        public a(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("TransactionDetailVerifyBtnClickEvent(name=", this.a, ")");
        }
    }

    public static final class b implements xpg0 {
        public final String a = "transaction_detail__verify_btn__view";

        public b(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("TransactionDetailVerifyBtnViewEvent(name=", this.a, ")");
        }
    }

    public static final class c implements xpg0 {
        public final String a = "transaction_page__detail__click";
        public final String b;

        public c(String str) {
            this.b = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("type", this.b));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a.equals(cVar.a) && Intrinsics.g(this.b, cVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            String str = this.b;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public final String toString() {
            return tx5.a("TransactionPageDetailClickEvent(name=", this.a, ", type=", this.b, ")");
        }
    }

    public static final class d implements xpg0 {
        public final String a = "transaction_page__filter_category__click";
        public final bag b;
        public final String c;

        public d(bag bagVar, String str) {
            this.b = bagVar;
            this.c = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String lowerCase = null;
            bag bagVar = this.b;
            Pair pair = new Pair("entrance", bagVar != null ? bagVar.K0() : null);
            String str = this.c;
            if (str != null) {
                lowerCase = kotlin.text.c.p(str, " ", "_", false).toLowerCase(Locale.ROOT);
                lowerCase.getClass();
            }
            return kpu.d(pair, new Pair("value", lowerCase));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.a.equals(dVar.a) && Intrinsics.g(this.b, dVar.b) && Intrinsics.g(this.c, dVar.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            bag bagVar = this.b;
            int iHashCode2 = (iHashCode + (bagVar == null ? 0 : bagVar.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("TransactionPageFilterCategoryClickEvent(name=");
            sb.append(this.a);
            sb.append(", entrance=");
            sb.append(this.b);
            sb.append(", value=");
            return uf80.a(sb, this.c, ")");
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class e implements xpg0 {
        public final String a = "transaction_page__filter_time_apply__click";
        public final bag b;
        public final a c;

        public interface a extends Serializable {

            /* JADX INFO: renamed from: xpg0$e$a$a, reason: collision with other inner class name */
            public static final class C1305a implements a {
                public final Long a;
                public final Long b;

                public C1305a(Long l, Long l2) {
                    this.a = l;
                    this.b = l2;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1305a)) {
                        return false;
                    }
                    C1305a c1305a = (C1305a) obj;
                    return Intrinsics.g(this.a, c1305a.a) && Intrinsics.g(this.b, c1305a.b);
                }

                public final int hashCode() {
                    Long l = this.a;
                    int iHashCode = (l == null ? 0 : l.hashCode()) * 31;
                    Long l2 = this.b;
                    return iHashCode + (l2 != null ? l2.hashCode() : 0);
                }

                public final String toString() {
                    return "Manual(startTimeStamp=" + this.a + ", endTimeStamp=" + this.b + ")";
                }
            }

            public static final class b implements a {
                public final Integer a;

                public b(Integer num) {
                    this.a = num;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && Intrinsics.g(this.a, ((b) obj).a);
                }

                public final int hashCode() {
                    Integer num = this.a;
                    if (num == null) {
                        return 0;
                    }
                    return num.hashCode();
                }

                public final String toString() {
                    return "Quick(days=" + this.a + ")";
                }
            }
        }

        public e(bag bagVar, a aVar) {
            this.b = bagVar;
            this.c = aVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            String string;
            a aVar = this.c;
            if (aVar instanceof a.C1305a) {
                a.C1305a c1305a = (a.C1305a) aVar;
                Long l = c1305a.a;
                Long l2 = c1305a.b;
                if (l == null || l2 == null) {
                    string = null;
                } else {
                    long jLongValue = l2.longValue();
                    StringBuilder sbA = q6a0.a(l.longValue(), "custom_time_", "_");
                    sbA.append(jLongValue);
                    string = sbA.toString();
                }
            } else {
                if (!(aVar instanceof a.b)) {
                    uhc.a();
                    return null;
                }
                string = "last_" + ((a.b) aVar).a;
            }
            Pair pair = new Pair("value", string);
            bag bagVar = this.b;
            return kpu.d(pair, new Pair("entrance", bagVar != null ? bagVar.K0() : null));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.a.equals(eVar.a) && Intrinsics.g(this.b, eVar.b) && this.c.equals(eVar.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            bag bagVar = this.b;
            return this.c.hashCode() + ((iHashCode + (bagVar == null ? 0 : bagVar.hashCode())) * 31);
        }

        public final String toString() {
            return "TransactionPageFilterTimeApplyClickEvent(name=" + this.a + ", entrance=" + this.b + ", type=" + this.c + ")";
        }
    }

    public static final class f implements xpg0 {
        public final String a = "transaction_page__filter_time__click";
        public final bag b;

        public f(bag bagVar) {
            this.b = bagVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            bag bagVar = this.b;
            return kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && Intrinsics.g(this.b, fVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            bag bagVar = this.b;
            return iHashCode + (bagVar == null ? 0 : bagVar.hashCode());
        }

        public final String toString() {
            return "TransactionPageFilterTimeClickEvent(name=" + this.a + ", entrance=" + this.b + ")";
        }
    }

    public static final class g implements xpg0 {
        public final String a = "transaction_page__home__click";
        public final bag b;

        public g(bag bagVar) {
            this.b = bagVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            bag bagVar = this.b;
            return kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof g)) {
                return false;
            }
            g gVar = (g) obj;
            return this.a.equals(gVar.a) && Intrinsics.g(this.b, gVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            bag bagVar = this.b;
            return iHashCode + (bagVar == null ? 0 : bagVar.hashCode());
        }

        public final String toString() {
            return "TransactionPageHomeClickEvent(name=" + this.a + ", entrance=" + this.b + ")";
        }
    }

    public static final class h implements xpg0 {
        public final String a = "transaction_page__question_mark_cancel__click";

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("TransactionPageQuestionMarkCancelClickEvent(name=", this.a, ")");
        }
    }

    public static final class i implements xpg0 {
        public final String a = "transaction_page__question_mark__click";
        public final bag b;

        public i(bag bagVar) {
            this.b = bagVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            bag bagVar = this.b;
            return kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return this.a.equals(iVar.a) && Intrinsics.g(this.b, iVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            bag bagVar = this.b;
            return iHashCode + (bagVar == null ? 0 : bagVar.hashCode());
        }

        public final String toString() {
            return "TransactionPageQuestionMarkClickEvent(name=" + this.a + ", entrance=" + this.b + ")";
        }
    }

    public static final class j implements xpg0 {
        public final String a = "transaction_page__search__click";
        public final bag b;

        public j(bag bagVar) {
            this.b = bagVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            bag bagVar = this.b;
            return kpu.d(new Pair("entrance", bagVar != null ? bagVar.K0() : null));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return this.a.equals(jVar.a) && Intrinsics.g(this.b, jVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            bag bagVar = this.b;
            return iHashCode + (bagVar == null ? 0 : bagVar.hashCode());
        }

        public final String toString() {
            return "TransactionPageSearchClickEvent(name=" + this.a + ", entrance=" + this.b + ")";
        }
    }

    public static final class k implements xpg0 {
        public final bag a;
        public final String b = "transaction_page__view";

        public k(bag bagVar) {
            this.a = bagVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("entrance", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof k)) {
                return false;
            }
            k kVar = (k) obj;
            return this.a.equals(kVar.a) && this.b.equals(kVar.b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "TransactionPageViewEvent(entrance=" + this.a + ", name=" + this.b + ")";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class l implements xpg0 {
        public final String a = "transaction__verify_btn__click";

        public l(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof l) && Intrinsics.g(this.a, ((l) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a(xOgHBQVl.NmVAjanJQqdTcWN, this.a, ")");
        }
    }

    public static final class m implements xpg0 {
        public final String a = "transaction__verify_btn__view";

        public m(int i) {
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof m) && Intrinsics.g(this.a, ((m) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return this.a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("TransactionVerifyBtnViewEvent(name=", this.a, ")");
        }
    }
}
