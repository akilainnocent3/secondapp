package com.ironsource;

import com.unity3d.mediation.rewarded.LevelPlayReward;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class Id implements S7, S7.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final Map<String, LevelPlayReward> f59285a = new LinkedHashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oy.l
    private final Map<String, LevelPlayReward> f59286b = new LinkedHashMap();

    @Override // com.ironsource.S7.a
    public void a(@oy.l String placement, @oy.l String rewardName, int i10) {
        kotlin.jvm.internal.m0.p(placement, "placement");
        kotlin.jvm.internal.m0.p(rewardName, "rewardName");
        this.f59285a.put(placement, new LevelPlayReward(rewardName, i10));
    }

    @Override // com.ironsource.S7.a
    public void b(@oy.l String adUnitId, @oy.l String rewardName, int i10) {
        kotlin.jvm.internal.m0.p(adUnitId, "adUnitId");
        kotlin.jvm.internal.m0.p(rewardName, "rewardName");
        this.f59286b.put(adUnitId, new LevelPlayReward(rewardName, i10));
    }

    private final LevelPlayReward b(String str) {
        if (str == null || str.length() == 0) {
            return null;
        }
        return this.f59285a.get(str);
    }

    @Override // com.ironsource.S7
    @oy.m
    public LevelPlayReward a(@oy.m String str, @oy.l String adUnitId) {
        kotlin.jvm.internal.m0.p(adUnitId, "adUnitId");
        LevelPlayReward levelPlayRewardB = b(str);
        return levelPlayRewardB == null ? a(adUnitId) : levelPlayRewardB;
    }

    private final LevelPlayReward a(String str) {
        return this.f59286b.get(str);
    }
}
