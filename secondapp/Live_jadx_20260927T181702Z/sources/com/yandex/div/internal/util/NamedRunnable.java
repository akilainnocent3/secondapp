package com.yandex.div.internal.util;

import androidx.annotation.NonNull;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import com.yandex.div.core.annotations.InternalApi;
import k.i1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public abstract class NamedRunnable implements Runnable {

    @NonNull
    private final String mThreadSuffix;

    public NamedRunnable(@NonNull String str) {
        this.mThreadSuffix = str;
    }

    @i1
    public abstract void execute();

    @Override // java.lang.Runnable
    public final void run() {
        String name = Thread.currentThread().getName();
        Thread.currentThread().setName(name + TokenBuilder.TOKEN_DELIMITER + this.mThreadSuffix);
        try {
            execute();
        } finally {
            Thread.currentThread().setName(name);
        }
    }
}
