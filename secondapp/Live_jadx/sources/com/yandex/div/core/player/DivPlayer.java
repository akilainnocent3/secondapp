package com.yandex.div.core.player;

import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivPlayer {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;
    public static final float VOLUME_FULL = 1.0f;
    public static final float VOLUME_MUTED = 0.0f;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();
        public static final float VOLUME_FULL = 1.0f;
        public static final float VOLUME_MUTED = 0.0f;

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface Observer {
        void onBuffering();

        void onCurrentTimeChange(long j10);

        void onEnd();

        void onFatal();

        void onPause();

        void onPlay();

        void onReady();
    }

    void addObserver(@l Observer observer);

    void pause();

    void play();

    void release();

    void removeObserver(@l Observer observer);

    void seek(long j10);

    void setMuted(boolean z10);

    void setSource(@l List<DivVideoSource> list, @l DivPlayerPlaybackConfig divPlayerPlaybackConfig);
}
