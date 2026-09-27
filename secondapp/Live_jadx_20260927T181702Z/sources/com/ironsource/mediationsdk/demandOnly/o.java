package com.ironsource.mediationsdk.demandOnly;

import com.ironsource.InterfaceC4486r5;
import com.ironsource.Kb;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface o extends InterfaceC4486r5<String> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oy.l
        private final String f62627a;

        public a(@oy.l String rowAdm) {
            m0.p(rowAdm, "rowAdm");
            this.f62627a = rowAdm;
        }

        @Override // com.ironsource.InterfaceC4486r5
        @oy.l
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public String a() {
            return this.f62627a;
        }

        @Override // com.ironsource.mediationsdk.demandOnly.o
        public <T> T a(@oy.l Kb<String, T> mapper) {
            m0.p(mapper, "mapper");
            return mapper.a(this.f62627a);
        }
    }

    <T> T a(@oy.l Kb<String, T> kb2);
}
