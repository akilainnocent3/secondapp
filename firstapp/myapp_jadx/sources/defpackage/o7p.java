package defpackage;

import com.twilio.voice.EventKeys;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface o7p extends pdd0 {

    public static final class a {
        public final String a;
        public final String b;
        public final boolean c;
        public final String d;
        public final String e;
        public final String f;

        public a(String str, String str2, String str3, String str4, String str5, boolean z) {
            str5.getClass();
            this.a = str;
            this.b = str2;
            this.c = z;
            this.d = str3;
            this.e = str4;
            this.f = str5;
        }

        public final HashMap<String, Object> a() {
            HashMap<String, Object> mapD = kpu.d(new Pair("total_stake", this.a), new Pair("pay_amount", this.b), new Pair("use_gift", Boolean.valueOf(this.c)), new Pair("currency", this.f));
            String str = this.d;
            if (str != null) {
                mapD.put("gift_type", str);
            }
            String str2 = this.e;
            if (str2 != null) {
                mapD.put("gift_value", str2);
            }
            return mapD;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a.equals(aVar.a) && this.b.equals(aVar.b) && this.c == aVar.c && Intrinsics.g(this.d, aVar.d) && Intrinsics.g(this.e, aVar.e) && Intrinsics.g(this.f, aVar.f);
        }

        public final int hashCode() {
            int iA = mtg0.a(gmf0.a(this.a.hashCode() * 31, 31, this.b), 31, this.c);
            String str = this.d;
            int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.e;
            return this.f.hashCode() + ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
        }

        public final String toString() {
            StringBuilder sbA = ux5.a("BetParams(totalStake=", this.a, ", payAmount=", this.b, ", useGift=");
            mng.a(", giftType=", this.d, ", giftValue=", sbA, this.c);
            return kwi.a(sbA, this.e, ", currency=", this.f, ")");
        }
    }

    public static final class b implements o7p {
        public static final b a = new b();
        public static final String b = "jackpot__current_round_tab__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 311197343;
        }

        public final String toString() {
            return "CurrentRoundTabClick";
        }
    }

    public static final class c implements o7p {
        public static final c a = new c();
        public static final String b = "jackpot__how_to_play_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 2020592192;
        }

        public final String toString() {
            return "HowToPlayClick";
        }
    }

    public static final class d implements o7p {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("entrance", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a.equals(((d) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "jackpot__page__view";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("PageView(entrance=", this.a, ")");
        }
    }

    public static final class e implements o7p {
        public final a a;

        public e(a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return this.a.a();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a.equals(((e) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "jackpot__place_bet_btn__click";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "PlaceBetClick(params=" + this.a + ")";
        }
    }

    public static final class f implements o7p {
        public final a a;
        public final Integer b;
        public final String c;

        public f(a aVar, Integer num, String str) {
            this.a = aVar;
            this.b = num;
            this.c = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapA = this.a.a();
            Integer num = this.b;
            if (num != null) {
                mapA.put("biz_code", Integer.valueOf(num.intValue()));
            }
            String str = this.c;
            if (str == null) {
                if (num == null) {
                    str = null;
                } else if (num.intValue() == 10000) {
                    str = "Success";
                } else if (num.intValue() == 4100) {
                    str = "Cash Not Enough";
                } else if (num.intValue() == 4200) {
                    str = "Insufficient Balance";
                } else if (num.intValue() == 4210) {
                    str = "Gift Unavailable";
                } else {
                    str = num.intValue() == 80001 ? "Bettor Limit Exceeded" : "General Error";
                }
            }
            if (str != null) {
                mapA.put(EventKeys.ERROR_MESSAGE, str);
            }
            return mapA;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return this.a.equals(fVar.a) && Intrinsics.g(this.b, fVar.b) && Intrinsics.g(this.c, fVar.c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "jackpot__place_bet_confirm_btn__click";
        }

        public final int hashCode() {
            int iHashCode = this.a.hashCode() * 31;
            Integer num = this.b;
            int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
            String str = this.c;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PlaceBetConfirmClick(params=");
            sb.append(this.a);
            sb.append(", bizCode=");
            sb.append(this.b);
            sb.append(", message=");
            return uf80.a(sb, this.c, ")");
        }
    }

    public static final class g implements o7p {
        public static final g a = new g();
        public static final String b = "jackpot__place_bet_success__view";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1573719801;
        }

        public final String toString() {
            return "PlaceBetSuccessView";
        }
    }

    public static final class h implements o7p {
        public static final h a = new h();
        public static final String b = "jackpot__results_tab__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 695331250;
        }

        public final String toString() {
            return "ResultsTabClick";
        }
    }

    public static final class i implements o7p {
        public static final i a = new i();
        public static final String b = "jackpot__rush_btn__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof i);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1571853319;
        }

        public final String toString() {
            return "RushClick";
        }
    }
}
