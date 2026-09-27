package com.iab.omid.library.bigosg.adsession.video;

import com.iab.omid.library.bigosg.d.e;

/* JADX INFO: loaded from: classes4.dex */
public final class VastProperties {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f52749a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Float f52750b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f52751c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Position f52752d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private com.iab.omid.library.bigosg.adsession.media.VastProperties f52753e;

    private VastProperties(boolean z10, Float f10, boolean z11, Position position, com.iab.omid.library.bigosg.adsession.media.VastProperties vastProperties) {
        this.f52749a = z10;
        this.f52750b = f10;
        this.f52751c = z11;
        this.f52752d = position;
        this.f52753e = vastProperties;
    }

    public static VastProperties createVastPropertiesForNonSkippableVideo(boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(false, null, z10, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForNonSkippableMedia(z10, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public static VastProperties createVastPropertiesForSkippableVideo(float f10, boolean z10, Position position) {
        e.a(position, "Position is null");
        return new VastProperties(true, Float.valueOf(f10), z10, position, com.iab.omid.library.bigosg.adsession.media.VastProperties.createVastPropertiesForSkippableMedia(f10, z10, com.iab.omid.library.bigosg.adsession.media.Position.valueOf(position.toString().toUpperCase())));
    }

    public final com.iab.omid.library.bigosg.adsession.media.VastProperties a() {
        return this.f52753e;
    }

    public final Position getPosition() {
        return this.f52752d;
    }

    public final Float getSkipOffset() {
        return this.f52750b;
    }

    public final boolean isAutoPlay() {
        return this.f52751c;
    }

    public final boolean isSkippable() {
        return this.f52749a;
    }
}
