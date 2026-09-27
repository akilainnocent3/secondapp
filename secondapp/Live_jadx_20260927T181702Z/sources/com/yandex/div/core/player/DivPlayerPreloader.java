package com.yandex.div.core.player;

import android.net.Uri;
import com.yandex.div.core.DivPreloader;
import cs.g;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface DivPlayerPreloader {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    @l
    @g
    public static final DivPlayerPreloader STUB = new DivPlayerPreloader() { // from class: com.yandex.div.core.player.DivPlayerPreloader$Companion$STUB$1
        @Override // com.yandex.div.core.player.DivPlayerPreloader
        @l
        public DivPreloader.PreloadReference preloadVideo(@l List<? extends Uri> list) {
            return DivPreloader.PreloadReference.Companion.getEMPTY();
        }
    };

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        private Companion() {
        }
    }

    @l
    DivPreloader.PreloadReference preloadVideo(@l List<? extends Uri> list);
}
