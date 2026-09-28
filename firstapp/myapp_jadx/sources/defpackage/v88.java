package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.android.instantwin.presentation.openbet.fNZf.oLsIjJCWb;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface v88 extends pdd0 {

    public static final class a implements v88 {
        public final String a;

        public a(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("from", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.g(this.a, ((a) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.COMMENT_LOAD_BOOKING_CODE;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoadCommentsShareCode(from=", this.a, ")");
        }
    }

    public static final class b implements v88 {
        public static final b a = new b();
        public static final String b = "event_page_comments_back_to_top_btn";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1068796051;
        }

        public final String toString() {
            return "PreMatchEventPageCommentsBackToTopButton";
        }
    }

    public static final class c implements v88 {
        public static final c a = new c();
        public static final String b = "prematch_event_page_comments__recommend_code_image";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -870862844;
        }

        public final String toString() {
            return "PreMatchEventPageCommentsRecommendCodeImage";
        }
    }

    public static final class d implements v88 {
        public static final d a = new d();
        public static final String b = "prematch_event_page_comments__recommend_code_image__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1980987420;
        }

        public final String toString() {
            return "PreMatchEventPageCommentsRecommendCodeImageClick";
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class e implements v88 {
        public static final e a = new e();
        public static final String b = oLsIjJCWb.aiEjteo;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof e);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -1725907767;
        }

        public final String toString() {
            return "PreMatchEventPageCommentsRecommendCodeImageView";
        }
    }

    public static final class f implements v88 {
        public static final f a = new f();
        public static final String b = "prematch_event_page__comments_tab";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -215874589;
        }

        public final String toString() {
            return "PreMatchEventPageCommentsTab";
        }
    }

    public static final class g implements v88 {
        public static final g a = new g();
        public static final String b = "prematch_event_page__comments_tab__click";

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1474742117;
        }

        public final String toString() {
            return "PreMatchEventPageCommentsTabClick";
        }
    }

    public static final class h implements v88 {
        public final String a;

        public h(String str) {
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("type", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof h) && this.a.equals(((h) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return "prematch_event_page__load_code__add_to_betslip";
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("PreMatchEventPageLoadCodeAddToBetSlip(type=", this.a, ")");
        }
    }
}
