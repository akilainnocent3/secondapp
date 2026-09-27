package com.fyber.inneractive.sdk.player.exoplayer2.text.webvtt;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Pattern f46919a = Pattern.compile("^NOTE(( |\t).*)?$");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Pattern f46920b = Pattern.compile("^\ufeff?WEBVTT(( |\t).*)?$");

    public static long a(String str) {
        String[] strArrSplit = str.split("\\.", 2);
        long j10 = 0;
        for (String str2 : strArrSplit[0].split(":")) {
            j10 = (j10 * 60) + Long.parseLong(str2);
        }
        return (Long.parseLong(strArrSplit[1]) + (j10 * 1000)) * 1000;
    }
}
