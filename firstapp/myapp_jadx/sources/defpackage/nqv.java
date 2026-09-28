package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public abstract class nqv implements pdd0 {
    public final String a;

    public static final class a extends nqv {
        public final String b;
        public final oqv c;

        public a(String str, oqv oqvVar) {
            super("mini__game__entrance_btn__click");
            this.b = str;
            this.c = oqvVar;
        }

        @Override // defpackage.nqv
        public final oqv e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.b.equals(aVar.b) && this.c == aVar.c;
        }

        @Override // defpackage.nqv
        public final String f() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "MiniGameEntranceButtonClick(timing=" + this.b + ", page=" + this.c + ")";
        }
    }

    public static final class b extends nqv {
        public final String b;
        public final oqv c;

        public b(String str, oqv oqvVar) {
            super("mini__game__hide_btn__click");
            this.b = str;
            this.c = oqvVar;
        }

        @Override // defpackage.nqv
        public final oqv e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.b.equals(bVar.b) && this.c == bVar.c;
        }

        @Override // defpackage.nqv
        public final String f() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "MiniGameHideButtonClick(timing=" + this.b + ", page=" + this.c + ")";
        }
    }

    public static final class c extends nqv {
        public final String b;
        public final oqv c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, oqv oqvVar) {
            super("mini__game__icon__view");
            str.getClass();
            this.b = str;
            this.c = oqvVar;
        }

        @Override // defpackage.nqv
        public final oqv e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.g(this.b, cVar.b) && this.c == cVar.c;
        }

        @Override // defpackage.nqv
        public final String f() {
            return this.b;
        }

        public final int hashCode() {
            return this.c.hashCode() + (this.b.hashCode() * 31);
        }

        public final String toString() {
            return "MiniGameIconView(timing=" + this.b + ", page=" + this.c + ")";
        }
    }

    public static final class d extends nqv {
        public final String b;
        public final oqv c;
        public final String d;
        public final Boolean e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, oqv oqvVar, String str2, Boolean bool) {
            super("mini__game__place_bet__btn__click");
            str2.getClass();
            this.b = str;
            this.c = oqvVar;
            this.d = str2;
            this.e = bool;
        }

        @Override // defpackage.nqv, defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            HashMap<String, Object> mapCreateCustomMetrics = super.createCustomMetrics();
            mapCreateCustomMetrics.put("source", this.d);
            Boolean bool = this.e;
            if (bool != null) {
                mapCreateCustomMetrics.put(AnalyticsParam.MINI_GAMES_IS_REBET, bool);
            }
            return mapCreateCustomMetrics;
        }

        @Override // defpackage.nqv
        public final oqv e() {
            return this.c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.b.equals(dVar.b) && this.c == dVar.c && Intrinsics.g(this.d, dVar.d) && Intrinsics.g(this.e, dVar.e);
        }

        @Override // defpackage.nqv
        public final String f() {
            return this.b;
        }

        public final int hashCode() {
            int iA = gmf0.a((this.c.hashCode() + (this.b.hashCode() * 31)) * 31, 31, this.d);
            Boolean bool = this.e;
            return iA + (bool == null ? 0 : bool.hashCode());
        }

        public final String toString() {
            return "MiniGamePlaceBetButtonClick(timing=" + this.b + ", page=" + this.c + ", source=" + this.d + ", rebet=" + this.e + ")";
        }
    }

    public nqv(String str) {
        this.a = str;
    }

    @Override // defpackage.pdd0
    public HashMap<String, Object> createCustomMetrics() {
        return kpu.d(new Pair(AnalyticsParam.MINI_GAMES_TIMING, f()), new Pair(AnalyticsParam.MINI_GAMES_PAGE, e().a));
    }

    public abstract oqv e();

    public abstract String f();

    @Override // defpackage.pdd0
    public final String getName() {
        return this.a;
    }
}
