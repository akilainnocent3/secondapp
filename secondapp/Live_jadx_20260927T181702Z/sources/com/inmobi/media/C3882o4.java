package com.inmobi.media;

import com.inmobi.media.core.config.models.Config;

/* JADX INFO: renamed from: com.inmobi.media.o4, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C3882o4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f57181a = C3882o4.class.getSimpleName();

    public final C3774jl a(C3681g2 configResponseObj, C3832m4 configRequestContext) {
        Integer num;
        kotlin.jvm.internal.m0.p(configResponseObj, "configResponseObj");
        kotlin.jvm.internal.m0.p(configRequestContext, "configRequestContext");
        int iB = configResponseObj.b();
        Config config = configRequestContext.f56988b;
        if (iB == 200) {
            try {
                Config configA = configResponseObj.a();
                if (configA == null) {
                    String tag = this.f57181a;
                    kotlin.jvm.internal.m0.o(tag, "tag");
                    num = 3;
                } else if (configA.isValid()) {
                    num = null;
                } else {
                    String tag2 = this.f57181a;
                    kotlin.jvm.internal.m0.o(tag2, "tag");
                    num = 4;
                }
                if (num != null) {
                    iB = num.intValue();
                } else {
                    if (configA == null) {
                        throw new IllegalArgumentException("Config object is null");
                    }
                    config = configA;
                }
            } catch (IllegalArgumentException unused) {
                iB = 2;
            }
        } else if (iB != 304) {
            String tag3 = this.f57181a;
            kotlin.jvm.internal.m0.o(tag3, "tag");
            iB += 1000;
        } else {
            String tag4 = this.f57181a;
            kotlin.jvm.internal.m0.o(tag4, "tag");
            configRequestContext.f56988b.getType();
        }
        return new C3774jl(iB, config);
    }
}
