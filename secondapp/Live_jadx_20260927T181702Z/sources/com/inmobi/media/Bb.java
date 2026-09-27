package com.inmobi.media;

import com.google.android.gms.cast.MediaError;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Bb {
    public static final Ab a(String logLevel) {
        kotlin.jvm.internal.m0.p(logLevel, "logLevel");
        if (cv.k0.c2(logLevel, "DEBUG", true)) {
            return Ab.DEBUG;
        }
        if (cv.k0.c2(logLevel, MediaError.ERROR_TYPE_ERROR, true)) {
            return Ab.ERROR;
        }
        if (cv.k0.c2(logLevel, "INFO", true)) {
            return Ab.INFO;
        }
        return cv.k0.c2(logLevel, "STATE", true) ? Ab.STATE : Ab.ERROR;
    }
}
