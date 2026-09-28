package com.sportybet.plugin.event;

import com.sportybet.plugin.realsports.data.Market;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public interface d {

    public static final class a implements d {
        public final Market a;
        public final int b;

        public a(Market market, int i) {
            market.getClass();
            this.a = market;
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.g(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "FavoriteMarketStatusUpdated(market=" + this.a + ", updateMessageRes=" + this.b + ")";
        }
    }

    public static final class b implements d {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1764738911;
        }

        public final String toString() {
            return "OpenMatchTracker";
        }
    }

    public static final class c implements d {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 240454267;
        }

        public final String toString() {
            return "RequireLoginForFavoriteMarket";
        }
    }
}
