package com.sports.live.football.tv.utils.playerutils;

import android.content.Context;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.google.android.gms.cast.framework.CastOptions;
import com.google.android.gms.cast.framework.OptionsProvider;
import com.google.android.gms.cast.framework.SessionProvider;
import java.util.List;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class CastOptionsProvider implements OptionsProvider {
    @Override // com.google.android.gms.cast.framework.OptionsProvider
    @m
    public List<SessionProvider> getAdditionalSessionProviders(@l Context p10) {
        m0.p(p10, "p0");
        return null;
    }

    @Override // com.google.android.gms.cast.framework.OptionsProvider
    @l
    public CastOptions getCastOptions(@l Context p10) {
        m0.p(p10, "p0");
        CastOptions castOptionsBuild = new CastOptions.Builder().setReceiverApplicationId(CastMediaControlIntent.DEFAULT_MEDIA_RECEIVER_APPLICATION_ID).build();
        m0.o(castOptionsBuild, "build(...)");
        return castOptionsBuild;
    }
}
