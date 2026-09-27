package com.chartboost.sdk.impl;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class e4 {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a extends e4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f38719a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(List clickTrackingUrls) {
            super(null);
            kotlin.jvm.internal.m0.p(clickTrackingUrls, "clickTrackingUrls");
            this.f38719a = clickTrackingUrls;
        }

        public final List a() {
            return this.f38719a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && kotlin.jvm.internal.m0.g(this.f38719a, ((a) obj).f38719a);
        }

        public int hashCode() {
            return this.f38719a.hashCode();
        }

        public String toString() {
            return "CtaClick(clickTrackingUrls=" + this.f38719a + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends e4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f38720a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List clickTrackingUrls) {
            super(null);
            kotlin.jvm.internal.m0.p(clickTrackingUrls, "clickTrackingUrls");
            this.f38720a = clickTrackingUrls;
        }

        public final List a() {
            return this.f38720a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && kotlin.jvm.internal.m0.g(this.f38720a, ((b) obj).f38720a);
        }

        public int hashCode() {
            return this.f38720a.hashCode();
        }

        public String toString() {
            return "GeneralClick(clickTrackingUrls=" + this.f38720a + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class c extends e4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f38721a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(List clickTrackingUrls) {
            super(null);
            kotlin.jvm.internal.m0.p(clickTrackingUrls, "clickTrackingUrls");
            this.f38721a = clickTrackingUrls;
        }

        public final List a() {
            return this.f38721a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && kotlin.jvm.internal.m0.g(this.f38721a, ((c) obj).f38721a);
        }

        public int hashCode() {
            return this.f38721a.hashCode();
        }

        public String toString() {
            return "VastCompanionClick(clickTrackingUrls=" + this.f38721a + gi.j.f86771d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class d extends e4 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f38722a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(List clickTrackingUrls) {
            super(null);
            kotlin.jvm.internal.m0.p(clickTrackingUrls, "clickTrackingUrls");
            this.f38722a = clickTrackingUrls;
        }

        public final List a() {
            return this.f38722a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && kotlin.jvm.internal.m0.g(this.f38722a, ((d) obj).f38722a);
        }

        public int hashCode() {
            return this.f38722a.hashCode();
        }

        public String toString() {
            return "VastVideoClick(clickTrackingUrls=" + this.f38722a + gi.j.f86771d;
        }
    }

    public e4() {
    }

    public /* synthetic */ e4(kotlin.jvm.internal.x xVar) {
        this();
    }
}
