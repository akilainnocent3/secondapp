package com.startapp.sdk.internal;

import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class bj implements Comparable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Pattern f74603c = Pattern.compile("\\d{2}:\\d{2}:\\d{2}(.\\d{3})?");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Pattern f74604d = Pattern.compile("((\\d{1,2})|(100))%");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f74605a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Number f74606b;

    /* JADX WARN: Multi-variable type inference failed */
    public bj(String str, Comparable comparable) {
        this.f74605a = str;
        this.f74606b = (Number) comparable;
    }

    public static Integer a(String str) {
        String[] strArrSplit = str.split(":");
        if (strArrSplit.length != 3) {
            return null;
        }
        try {
            return Integer.valueOf((Integer.parseInt(strArrSplit[1]) * 60000) + (Integer.parseInt(strArrSplit[0]) * mk.e.f107640n) + ((int) (Float.parseFloat(strArrSplit[2]) * 1000.0f)));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Comparable, java.lang.Number] */
    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.f74606b.compareTo(((bj) obj).f74606b);
    }
}
