package com.yandex.div.internal.util;

import android.os.SystemClock;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.yandex.div.core.annotations.InternalApi;
import java.util.concurrent.TimeUnit;
import k.h1;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@InternalApi
public class Clock {

    @NonNull
    private static Clock sDefault = new Clock();

    @cr.a
    public Clock() {
    }

    @NonNull
    public static Clock get() {
        return sDefault;
    }

    @h1
    public static void setForTests(@Nullable Clock clock) {
        if (clock == null) {
            clock = new Clock();
        }
        sDefault = clock;
    }

    public long getCurrentTimeMs() {
        return System.currentTimeMillis();
    }

    public long getCurrentUnixTimestamp() {
        return TimeUnit.MILLISECONDS.toSeconds(getCurrentTimeMs());
    }

    public long getElapsedRealtimeMs() {
        return SystemClock.elapsedRealtime();
    }

    public long getUptimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
