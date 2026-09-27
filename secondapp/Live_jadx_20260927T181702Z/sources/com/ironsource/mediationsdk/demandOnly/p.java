package com.ironsource.mediationsdk.demandOnly;

import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface p {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class a implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62628a;

        public a(@oy.l String plumbus) {
            m0.p(plumbus, "plumbus");
            this.f62628a = plumbus;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.p
        @oy.l
        public String value() {
            return this.f62628a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b extends a {
        public b() {
            super("");
        }
    }

    @oy.l
    String value();
}
