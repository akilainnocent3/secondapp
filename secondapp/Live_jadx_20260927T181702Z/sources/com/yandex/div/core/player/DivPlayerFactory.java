package com.yandex.div.core.player;

import android.content.Context;
import android.util.AttributeSet;
import cs.g;
import java.util.List;
import kotlin.jvm.internal.x;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivPlayerFactory {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    @g
    public static final DivPlayerFactory STUB = new DivPlayerFactory() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerFactory
        public /* bridge */ /* synthetic */ DivPlayer makePlayer(List list, DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return makePlayer((List<DivVideoSource>) list, divPlayerPlaybackConfig);
        }

        @Override // com.yandex.div.core.player.DivPlayerFactory
        public /* synthetic */ DivPlayerPreloader makePreloader() {
            return c.a(this);
        }

        /* JADX WARN: Type inference failed for: r1v1, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @l
        public DivPlayerFactory$Companion$STUB$1$makePlayer$1 makePlayer(@l List<DivVideoSource> list, @l DivPlayerPlaybackConfig divPlayerPlaybackConfig) {
            return new DivPlayer() { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayer$1
                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void addObserver(DivPlayer.Observer observer) {
                    a.a(this, observer);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void pause() {
                    a.b(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void play() {
                    a.c(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void release() {
                    a.d(this);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void removeObserver(DivPlayer.Observer observer) {
                    a.e(this, observer);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void seek(long j10) {
                    a.f(this, j10);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void setMuted(boolean z10) {
                    a.g(this, z10);
                }

                @Override // com.yandex.div.core.player.DivPlayer
                public /* synthetic */ void setSource(List list2, DivPlayerPlaybackConfig divPlayerPlaybackConfig2) {
                    a.h(this, list2, divPlayerPlaybackConfig2);
                }
            };
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1] */
        @Override // com.yandex.div.core.player.DivPlayerFactory
        @l
        public DivPlayerFactory$Companion$STUB$1$makePlayerView$1 makePlayerView(@l final Context context) {
            return new DivPlayerView(context) { // from class: com.yandex.div.core.player.DivPlayerFactory$Companion$STUB$1$makePlayerView$1
                {
                    int i10 = 6;
                    x xVar = null;
                    AttributeSet attributeSet = null;
                    int i11 = 0;
                }
            };
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @l
    DivPlayer makePlayer(@l List<DivVideoSource> list, @l DivPlayerPlaybackConfig divPlayerPlaybackConfig);

    @l
    DivPlayerView makePlayerView(@l Context context);

    @l
    DivPlayerPreloader makePreloader();
}
