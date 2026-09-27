package com.applovin.mediation;

import android.os.Bundle;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class AppLovinExtras {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Builder {
        private boolean muteAudio;

        public Bundle build() {
            Bundle bundle = new Bundle(1);
            bundle.putBoolean(Keys.MUTE_AUDIO, this.muteAudio);
            return bundle;
        }

        public Builder setMuteAudio(boolean z10) {
            this.muteAudio = z10;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class Keys {
        public static final String KEY_WATERMARK = "google_watermark";
        public static final String MUTE_AUDIO = "mute_audio";

        private Keys() {
        }
    }
}
