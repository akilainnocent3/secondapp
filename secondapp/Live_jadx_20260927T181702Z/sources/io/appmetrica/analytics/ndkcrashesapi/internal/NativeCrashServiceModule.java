package io.appmetrica.analytics.ndkcrashesapi.internal;

import android.content.Context;
import java.util.List;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class NativeCrashServiceModule {
    public abstract void deleteCompletedCrashes();

    @l
    public abstract List<NativeCrash> getAllCrashes();

    public abstract void init(@l Context context, @l NativeCrashServiceConfig nativeCrashServiceConfig);

    public abstract void markCrashCompleted(@l String str);

    public abstract void setDefaultCrashHandler(@m NativeCrashHandler nativeCrashHandler);
}
