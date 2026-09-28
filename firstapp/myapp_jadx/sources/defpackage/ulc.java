package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Pair;

/* JADX INFO: loaded from: classes4.dex */
public interface ulc extends pdd0 {

    public static final class a implements ulc {
        public final nkf a;
        public final pkf b;

        public a(nkf nkfVar, pkf pkfVar) {
            this.a = nkfVar;
            this.b = pkfVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("from", yjf.c(this.a)), new Pair("value", yjf.d(this.b)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.DC_ONE_UP_CHECKBOX_SELECTION_BETSLIP_CLICK;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DCOneUpCheckBoxSelectionClick(from=" + this.a + ", value=" + this.b + ")";
        }
    }

    public static final class b implements ulc {
        public final nkf a;
        public final pkf b;

        public b(nkf nkfVar, pkf pkfVar) {
            this.a = nkfVar;
            this.b = pkfVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("from", yjf.c(this.a)), new Pair("value", yjf.d(this.b)));
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

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.DC_ONE_UP_CHECKBOX_SELECTION_BETSLIP_VIEW;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DCOneUpCheckBoxSelectionView(from=" + this.a + ", value=" + this.b + ")";
        }
    }

    public static final class c implements ulc {
        public final lkf a;
        public final pkf b;

        public c(lkf lkfVar, pkf pkfVar) {
            zjf zjfVar = zjf.a;
            this.a = lkfVar;
            this.b = pkfVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("from", yjf.b(this.a)), new Pair("type", yjf.a(zjf.b)), new Pair("value", yjf.d(this.b)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            if (this.a != cVar.a) {
                return false;
            }
            zjf zjfVar = zjf.a;
            return this.b == cVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "dc1up_toggle_market_bar__click";
        }

        public final int hashCode() {
            return this.b.hashCode() + ((zjf.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "DCOneUpToggleMarketBarClick(from=" + this.a + ", type=" + zjf.b + ", value=" + this.b + ")";
        }
    }

    public static final class d implements ulc {
        public final lkf a;
        public final pkf b;

        public d(lkf lkfVar, pkf pkfVar) {
            zjf zjfVar = zjf.a;
            this.a = lkfVar;
            this.b = pkfVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("from", yjf.b(this.a)), new Pair("type", yjf.a(zjf.b)), new Pair("value", yjf.d(this.b)));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (this.a != dVar.a) {
                return false;
            }
            zjf zjfVar = zjf.a;
            return this.b == dVar.b;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "dc1up_toggle_market_bar__view";
        }

        public final int hashCode() {
            return this.b.hashCode() + ((zjf.b.hashCode() + (this.a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "DCOneUpToggleMarketBarView(from=" + this.a + ", type=" + zjf.b + ", value=" + this.b + ")";
        }
    }
}
