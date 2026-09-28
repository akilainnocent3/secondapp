package com.google.android.gms.tasks;

import android.os.Handler;
import android.os.Looper;
import defpackage.vlk0;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes4.dex */
final class zzu implements Executor {
    private final Handler zza = new vlk0(Looper.getMainLooper());

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.zza.post(runnable);
    }
}
