package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.CacheResult;
import or.f;
import org.json.JSONArray;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface CacheFile {
    @m
    Object invoke(@l String str, @l AdObject adObject, @m JSONArray jSONArray, int i10, @l f<? super CacheResult> fVar);
}
