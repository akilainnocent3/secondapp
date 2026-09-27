package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class k5 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends k5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f39701c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f39702d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final x4 f39703e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f39704f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, String str2, Integer num, List universalAdIds, x4 companionAds, List list) {
            super(null);
            kotlin.jvm.internal.m0.p(universalAdIds, "universalAdIds");
            kotlin.jvm.internal.m0.p(companionAds, "companionAds");
            this.f39699a = str;
            this.f39700b = str2;
            this.f39701c = num;
            this.f39702d = universalAdIds;
            this.f39703e = companionAds;
            this.f39704f = list;
        }

        public final x4 a() {
            return this.f39703e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.m0.g(this.f39699a, aVar.f39699a) && kotlin.jvm.internal.m0.g(this.f39700b, aVar.f39700b) && kotlin.jvm.internal.m0.g(this.f39701c, aVar.f39701c) && kotlin.jvm.internal.m0.g(this.f39702d, aVar.f39702d) && kotlin.jvm.internal.m0.g(this.f39703e, aVar.f39703e) && kotlin.jvm.internal.m0.g(this.f39704f, aVar.f39704f);
        }

        public int hashCode() {
            String str = this.f39699a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f39700b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f39701c;
            int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.f39702d.hashCode()) * 31) + this.f39703e.hashCode()) * 31;
            List list = this.f39704f;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "CompanionCreative(id=" + this.f39699a + ", adId=" + this.f39700b + ", sequence=" + this.f39701c + ", universalAdIds=" + this.f39702d + ", companionAds=" + this.f39703e + ", creativeExtensions=" + this.f39704f + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends k5 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f39705a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f39706b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Integer f39707c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List f39708d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final lb f39709e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final List f39710f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, String str2, Integer num, List universalAdIds, lb linear, List list) {
            super(null);
            kotlin.jvm.internal.m0.p(universalAdIds, "universalAdIds");
            kotlin.jvm.internal.m0.p(linear, "linear");
            this.f39705a = str;
            this.f39706b = str2;
            this.f39707c = num;
            this.f39708d = universalAdIds;
            this.f39709e = linear;
            this.f39710f = list;
        }

        public final lb a() {
            return this.f39709e;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return kotlin.jvm.internal.m0.g(this.f39705a, bVar.f39705a) && kotlin.jvm.internal.m0.g(this.f39706b, bVar.f39706b) && kotlin.jvm.internal.m0.g(this.f39707c, bVar.f39707c) && kotlin.jvm.internal.m0.g(this.f39708d, bVar.f39708d) && kotlin.jvm.internal.m0.g(this.f39709e, bVar.f39709e) && kotlin.jvm.internal.m0.g(this.f39710f, bVar.f39710f);
        }

        public int hashCode() {
            String str = this.f39705a;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f39706b;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            Integer num = this.f39707c;
            int iHashCode3 = (((((iHashCode2 + (num == null ? 0 : num.hashCode())) * 31) + this.f39708d.hashCode()) * 31) + this.f39709e.hashCode()) * 31;
            List list = this.f39710f;
            return iHashCode3 + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "LinearCreative(id=" + this.f39705a + ", adId=" + this.f39706b + ", sequence=" + this.f39707c + ", universalAdIds=" + this.f39708d + ", linear=" + this.f39709e + ", creativeExtensions=" + this.f39710f + gi.j.f86771d;
        }
    }

    public k5() {
    }

    public /* synthetic */ k5(kotlin.jvm.internal.x xVar) {
        this();
    }
}
