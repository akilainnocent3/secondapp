package com.startapp.sdk.ads.video.tracking;

import androidx.annotation.Keep;
import com.startapp.json.TypeInfo;
import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class VideoTrackingLink implements Serializable {
    private static final long serialVersionUID = 734821160635474852L;
    private boolean appendReplayParameter;
    private String replayParameter;

    @TypeInfo(type = TrackingSource.class)
    private TrackingSource trackingSource;
    private String trackingUrl;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    @Keep
    public enum TrackingSource {
        STARTAPP,
        EXTERNAL
    }

    public final void a(String str) {
        this.trackingUrl = str;
    }

    public final TrackingSource b() {
        return this.trackingSource;
    }

    public final String c() {
        return this.trackingUrl;
    }

    public final void d() {
        this.appendReplayParameter = true;
    }

    public final void e() {
        this.replayParameter = "";
    }

    public final boolean f() {
        return this.appendReplayParameter;
    }

    public final String a() {
        return this.replayParameter;
    }
}
