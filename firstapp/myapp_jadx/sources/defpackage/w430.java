package defpackage;

import com.appsflyer.AppsFlyerProperties;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import java.util.HashMap;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public interface w430 extends pdd0 {

    public static final class a implements w430 {
        public static final a a = new a();
        public static final String b = AnalyticsEvent.PROMOS_PAGE_AZ_MENU_LOBBY_VIEW;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return -2128485571;
        }

        public final String toString() {
            return "AZMenuPromosLobbyViewEvent";
        }
    }

    public static final class b implements w430 {
        public static final b a = new b();
        public static final String b = AnalyticsEvent.PROMOS_PAGE_HOME_LOBBY_VIEW;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 1430904324;
        }

        public final String toString() {
            return "HomePromosLobbyViewEvent";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class c implements w430 {
        public final String a;

        public c(String str) {
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("data", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a.equals(((c) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.SOCIAL_BTN_TAPPED;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("LoyaltyShareButtonTapEvent(loyaltyData=", this.a, ")");
        }
    }

    public static final class d implements w430 {
        public final String a;

        public d(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("promosName", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && Intrinsics.g(this.a, ((d) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.PROMOS_PAGE_BACK_BUTTON_CLICK;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("PromosPageBackButtonClickEvent(promotionName=", this.a, ")");
        }
    }

    public static final class e implements w430 {
        public final String a;

        public e(String str) {
            str.getClass();
            this.a = str;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair("promosName", this.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && Intrinsics.g(this.a, ((e) obj).a);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.PROMOS_PAGE_BACK_BUTTON_VIEW;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return tug.a("PromosPageBackButtonViewEvent(promotionName=", this.a, ")");
        }
    }

    public static final class f implements w430 {
        public static final f a = new f();
        public static final String b = AnalyticsEvent.PROMOS_PAGE_SHARE_BUTTON_CLICK;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 260235169;
        }

        public final String toString() {
            return "ShareButtonClickEvent";
        }
    }

    public static final class g implements w430 {
        public static final g a = new g();
        public static final String b = AnalyticsEvent.PROMOS_PAGE_SHARE_BUTTON_VIEW;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof g);
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return b;
        }

        public final int hashCode() {
            return 238372710;
        }

        public final String toString() {
            return "ShareButtonViewEvent";
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public enum h {
        X("x"),
        TELEGRAM("telegram"),
        COPY_LINK("copylink"),
        WHATSAPP("whatsapp"),
        FACEBOOK("facebook");

        public final String a;

        h(String str) {
            this.a = str;
        }
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class i implements w430 {
        public final h a;

        public i(h hVar) {
            this.a = hVar;
        }

        @Override // defpackage.pdd0
        public final HashMap<String, Object> createCustomMetrics() {
            return kpu.d(new Pair(AppsFlyerProperties.CHANNEL, this.a.a));
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.a == ((i) obj).a;
        }

        @Override // defpackage.pdd0
        public final String getName() {
            return AnalyticsEvent.PROMOS_PAGE_SHARE_VIA_CHANNEL_CLICK;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShareViaClickEvent(shareType=" + this.a + ")";
        }
    }
}
