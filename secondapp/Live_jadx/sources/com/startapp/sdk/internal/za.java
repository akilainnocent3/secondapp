package com.startapp.sdk.internal;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public abstract class za implements Runnable {

    @NonNull
    protected final ya callback;

    @NonNull
    protected final Context context;

    @Nullable
    protected final Bundle extras;

    public za(Context context, ya yaVar, Bundle bundle) {
        this.context = context;
        this.callback = yaVar;
        this.extras = bundle;
    }

    @k.i1
    public boolean runSync() {
        return false;
    }
}
