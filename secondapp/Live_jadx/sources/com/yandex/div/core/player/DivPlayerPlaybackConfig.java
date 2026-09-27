package com.yandex.div.core.player;

import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import org.json.JSONObject;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DivPlayerPlaybackConfig {
    private final boolean autoplay;
    private final boolean isMuted;

    @m
    private final JSONObject payload;
    private final boolean repeatable;

    public DivPlayerPlaybackConfig() {
        this(false, false, false, null, 15, null);
    }

    public static /* synthetic */ DivPlayerPlaybackConfig copy$default(DivPlayerPlaybackConfig divPlayerPlaybackConfig, boolean z10, boolean z11, boolean z12, JSONObject jSONObject, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = divPlayerPlaybackConfig.autoplay;
        }
        if ((i10 & 2) != 0) {
            z11 = divPlayerPlaybackConfig.isMuted;
        }
        if ((i10 & 4) != 0) {
            z12 = divPlayerPlaybackConfig.repeatable;
        }
        if ((i10 & 8) != 0) {
            jSONObject = divPlayerPlaybackConfig.payload;
        }
        return divPlayerPlaybackConfig.copy(z10, z11, z12, jSONObject);
    }

    public final boolean component1() {
        return this.autoplay;
    }

    public final boolean component2() {
        return this.isMuted;
    }

    public final boolean component3() {
        return this.repeatable;
    }

    @m
    public final JSONObject component4() {
        return this.payload;
    }

    @l
    public final DivPlayerPlaybackConfig copy(boolean z10, boolean z11, boolean z12, @m JSONObject jSONObject) {
        return new DivPlayerPlaybackConfig(z10, z11, z12, jSONObject);
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DivPlayerPlaybackConfig)) {
            return false;
        }
        DivPlayerPlaybackConfig divPlayerPlaybackConfig = (DivPlayerPlaybackConfig) obj;
        return this.autoplay == divPlayerPlaybackConfig.autoplay && this.isMuted == divPlayerPlaybackConfig.isMuted && this.repeatable == divPlayerPlaybackConfig.repeatable && m0.g(this.payload, divPlayerPlaybackConfig.payload);
    }

    public final boolean getAutoplay() {
        return this.autoplay;
    }

    @m
    public final JSONObject getPayload() {
        return this.payload;
    }

    public final boolean getRepeatable() {
        return this.repeatable;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5, types: [int] */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r2v1, types: [int] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4 */
    public int hashCode() {
        boolean z10 = this.autoplay;
        ?? r10 = z10;
        if (z10) {
            r10 = 1;
        }
        int i10 = r10 * 31;
        boolean z11 = this.isMuted;
        ?? r11 = z11;
        if (z11) {
            r11 = 1;
        }
        int i11 = (i10 + r11) * 31;
        boolean z12 = this.repeatable;
        int i12 = (i11 + (z12 ? 1 : z12)) * 31;
        JSONObject jSONObject = this.payload;
        return i12 + (jSONObject == null ? 0 : jSONObject.hashCode());
    }

    public final boolean isMuted() {
        return this.isMuted;
    }

    @l
    public String toString() {
        return "DivPlayerPlaybackConfig(autoplay=" + this.autoplay + ", isMuted=" + this.isMuted + ", repeatable=" + this.repeatable + ", payload=" + this.payload + ')';
    }

    public DivPlayerPlaybackConfig(boolean z10, boolean z11, boolean z12, @m JSONObject jSONObject) {
        this.autoplay = z10;
        this.isMuted = z11;
        this.repeatable = z12;
        this.payload = jSONObject;
    }

    public /* synthetic */ DivPlayerPlaybackConfig(boolean z10, boolean z11, boolean z12, JSONObject jSONObject, int i10, x xVar) {
        this((i10 & 1) != 0 ? false : z10, (i10 & 2) != 0 ? false : z11, (i10 & 4) != 0 ? false : z12, (i10 & 8) != 0 ? null : jSONObject);
    }
}
