package com.fyber.inneractive.sdk.logger;

import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class FMPLogger {
    public abstract void debug(String str, Object... objArr);

    public abstract void error(String str, Throwable th2, Object... objArr);

    public abstract void info(String str, Object... objArr);

    public abstract void initialize(Context context);

    public abstract void log(int i10, Exception exc, String str, Object... objArr);

    public abstract void verbose(String str, Throwable th2, Object... objArr);

    public abstract void verbose(String str, Object... objArr);

    public abstract void warning(String str, Object... objArr);
}
