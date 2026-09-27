package com.yandex.div.json;

import android.util.Log;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.KLog;
import com.yandex.div.logging.Severity;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public interface LoadingErrorLogger {

    @l
    public static final Companion Companion = Companion.$$INSTANCE;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        static final /* synthetic */ Companion $$INSTANCE = new Companion();

        @l
        private static final LoadingErrorLogger ASSERT = new LoadingErrorLogger() { // from class: com.yandex.div.json.LoadingErrorLogger$Companion$ASSERT$1
            @Override // com.yandex.div.json.LoadingErrorLogger
            public void logError(@l Exception exc) {
                Assert.fail(exc.getMessage(), exc);
            }
        };

        @l
        private static final LoadingErrorLogger LOG = new LoadingErrorLogger() { // from class: com.yandex.div.json.LoadingErrorLogger$Companion$LOG$1
            @Override // com.yandex.div.json.LoadingErrorLogger
            public void logError(@l Exception exc) {
                if (KLog.INSTANCE.isAtLeast(Severity.ERROR)) {
                    Log.e("LoadingErrorLogger", "An error occurred during loading process", exc);
                }
            }
        };

        private Companion() {
        }

        @l
        public final LoadingErrorLogger getASSERT() {
            return ASSERT;
        }

        @l
        public final LoadingErrorLogger getLOG() {
            return LOG;
        }
    }

    void logError(@l Exception exc);
}
