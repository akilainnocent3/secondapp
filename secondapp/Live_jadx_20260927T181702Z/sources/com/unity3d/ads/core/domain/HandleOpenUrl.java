package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import java.util.Map;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface HandleOpenUrl {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object invoke$default(HandleOpenUrl handleOpenUrl, AdObject adObject, String str, String str2, String str3, Map map, boolean z10, f fVar, int i10, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: invoke");
            }
            if ((i10 & 8) != 0) {
                str3 = "android.intent.action.VIEW";
            }
            String str4 = str3;
            if ((i10 & 16) != 0) {
                map = null;
            }
            Map map2 = map;
            if ((i10 & 32) != 0) {
                z10 = false;
            }
            return handleOpenUrl.invoke(adObject, str, str2, str4, map2, z10, fVar);
        }
    }

    @m
    Object invoke(@l AdObject adObject, @l String str, @m String str2, @m String str3, @m Map<String, ? extends Object> map, boolean z10, @l f<? super Boolean> fVar);
}
