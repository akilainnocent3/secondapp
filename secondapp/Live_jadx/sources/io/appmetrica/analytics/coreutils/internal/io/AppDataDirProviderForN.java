package io.appmetrica.analytics.coreutils.internal.io;

import android.annotation.TargetApi;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import java.io.File;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
@DoNotInline
@TargetApi(24)
public final class AppDataDirProviderForN {

    @l
    public static final AppDataDirProviderForN INSTANCE = new AppDataDirProviderForN();

    private AppDataDirProviderForN() {
    }

    @m
    public final File dataDir(@l Context context) {
        return context.getDataDir();
    }
}
