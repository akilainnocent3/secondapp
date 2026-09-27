package com.ironsource;

import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: com.ironsource.q0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class C4465q0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oy.l
    private final HashMap<String, S0> f63339a = new HashMap<>();

    /* JADX INFO: renamed from: com.ironsource.q0$a */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum a {
        DidntAttemptToLoad,
        FailedToLoad,
        LoadedSuccessfully,
        FailedToShow,
        ShowedSuccessfully,
        NotPartOfWaterfall
    }

    @oy.l
    public final S0 a(@oy.l String adUnitId, @oy.l List<? extends NetworkSettings> providers, int i10) {
        kotlin.jvm.internal.m0.p(adUnitId, "adUnitId");
        kotlin.jvm.internal.m0.p(providers, "providers");
        S0 s10 = this.f63339a.get(adUnitId);
        if (s10 != null) {
            return s10;
        }
        S0 s11 = new S0(providers, i10);
        this.f63339a.put(adUnitId, s11);
        return s11;
    }
}
