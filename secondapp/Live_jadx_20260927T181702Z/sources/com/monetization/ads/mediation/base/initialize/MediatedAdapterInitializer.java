package com.monetization.ads.mediation.base.initialize;

import android.content.Context;
import java.util.Map;
import or.f;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public interface MediatedAdapterInitializer {
    @m
    Object initialize(@l Context context, @l Map<String, String> map, @l f<? super MediatedAdapterInitializationResult> fVar);
}
