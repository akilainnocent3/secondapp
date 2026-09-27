package com.monetization.ads.mediation.base;

import gi.j;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class MediatedAdRequestError {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f71858a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f71859b;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Code {

        @l
        public static final Code INSTANCE = new Code();
        public static final int INTERNAL_ERROR = 1;
        public static final int INVALID_REQUEST = 2;
        public static final int NETWORK_ERROR = 3;
        public static final int NO_FILL = 4;
        public static final int SYSTEM_ERROR = 5;
        public static final int UNKNOWN_ERROR = 0;

        private Code() {
        }
    }

    public MediatedAdRequestError(int i10, @l String str) {
        this.f71858a = i10;
        this.f71859b = str;
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!m0.g(MediatedAdRequestError.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        m0.n(obj, "null cannot be cast to non-null type com.monetization.ads.mediation.base.MediatedAdRequestError");
        MediatedAdRequestError mediatedAdRequestError = (MediatedAdRequestError) obj;
        if (this.f71858a != mediatedAdRequestError.f71858a) {
            return false;
        }
        return m0.g(this.f71859b, mediatedAdRequestError.f71859b);
    }

    public final int getCode() {
        return this.f71858a;
    }

    @l
    public final String getDescription() {
        return this.f71859b;
    }

    public int hashCode() {
        return this.f71859b.hashCode() + (this.f71858a * 31);
    }

    @l
    public String toString() {
        return "AdRequestError (code: " + this.f71858a + ", description: " + this.f71859b + j.f86771d;
    }
}
