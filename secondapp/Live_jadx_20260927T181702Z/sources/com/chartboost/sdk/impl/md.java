package com.chartboost.sdk.impl;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public interface md {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class a {
        public static /* synthetic */ Object a(md mdVar, String str, Map map, or.f fVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: get");
            }
            if ((i10 & 2) != 0) {
                map = fr.n1.z();
            }
            return mdVar.a(str, map, fVar);
        }
    }

    Object a(String str, String str2, Map map, String str3, or.f fVar);

    Object a(String str, Map map, or.f fVar);
}
