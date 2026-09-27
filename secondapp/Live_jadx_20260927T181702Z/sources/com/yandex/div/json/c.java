package com.yandex.div.json;

import androidx.annotation.NonNull;
import com.yandex.div.internal.Assert;
import com.yandex.div.internal.Log;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class c {
    static {
        ParsingErrorLogger parsingErrorLogger = ParsingErrorLogger.LOG;
    }

    public static void a(ParsingErrorLogger parsingErrorLogger, @NonNull Exception exc, @NonNull String str) {
        parsingErrorLogger.logError(exc);
    }

    public static /* synthetic */ void b(Exception exc) {
        if (Log.isEnabled()) {
            Log.e("ParsingErrorLogger", "An error occurred during parsing process", exc);
        }
    }

    public static /* synthetic */ void c(Exception exc) {
        if (Assert.isEnabled()) {
            Assert.fail(exc.getMessage(), exc);
        }
    }
}
