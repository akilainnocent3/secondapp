package com.inmobi.media;

import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class G2 implements jw.c0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final G2 f54698a = new G2();

    @Override // jw.c0
    public final jw.n0 intercept(jw.c0.a chain) throws Exception {
        kotlin.jvm.internal.m0.p(chain, "chain");
        jw.l0 request = chain.request();
        String str = H2.f54752a;
        kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
        Objects.toString(request);
        try {
            jw.n0 n0VarA = chain.a(request);
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            Objects.toString(n0VarA);
            kotlin.jvm.internal.m0.m(request);
            kotlin.jvm.internal.m0.p(request, "request");
            kotlin.jvm.internal.m0.o(str, "access$getTAG$p(...)");
            Objects.toString(request);
            Objects.toString(n0VarA);
            kotlin.jvm.internal.m0.m(n0VarA);
            return n0VarA;
        } catch (Exception e10) {
            String str2 = H2.f54752a;
            Objects.toString(request);
            kotlin.jvm.internal.m0.m(request);
            kotlin.jvm.internal.m0.p(request, "request");
            throw e10;
        }
    }
}
