package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.data.model.CacheResult;
import com.unity3d.ads.core.data.model.CachedFile;
import dr.w2;
import or.f;
import org.json.JSONArray;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface CacheRepository {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DefaultImpls {
        public static /* synthetic */ Object getFile$default(CacheRepository cacheRepository, String str, JSONArray jSONArray, int i10, f fVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: getFile");
            }
            if ((i11 & 2) != 0) {
                jSONArray = null;
            }
            if ((i11 & 4) != 0) {
                i10 = 0;
            }
            return cacheRepository.getFile(str, jSONArray, i10, fVar);
        }
    }

    @m
    Object clearCache(@l f<? super w2> fVar);

    @m
    Object doesFileExist(@l String str, @l f<? super Boolean> fVar);

    @m
    Object getCacheSize(@l f<? super Long> fVar);

    @m
    Object getFile(@l String str, @m JSONArray jSONArray, int i10, @l f<? super CacheResult> fVar);

    @m
    Object getWebviewFile(@l String str, @l String str2, @l f<? super CacheResult> fVar);

    boolean removeFile(@l CachedFile cachedFile);

    @m
    Object retrieveFile(@l String str, @l f<? super CacheResult> fVar);
}
