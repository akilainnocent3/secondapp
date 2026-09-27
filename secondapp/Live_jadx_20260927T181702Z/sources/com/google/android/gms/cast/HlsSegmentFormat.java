package com.google.android.gms.cast;

import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
@Retention(RetentionPolicy.CLASS)
public @interface HlsSegmentFormat {

    @NonNull
    public static final String AAC = "aac";

    @NonNull
    public static final String AC3 = "ac3";

    @NonNull
    public static final String E_AC3 = "e-ac3";

    @NonNull
    public static final String FMP4 = "fmp4";

    @NonNull
    public static final String MP3 = "mp3";

    @NonNull
    public static final String TS = "ts";

    @NonNull
    public static final String TS_AAC = "ts_aac";
}
