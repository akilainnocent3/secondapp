package com.chartboost.sdk.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes3.dex */
public final class m3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m3 f39988a = new m3();

    public static final List a(File file, boolean z10) {
        if (file == null) {
            return fr.h0.J();
        }
        ArrayList arrayList = new ArrayList();
        File[] fileArrListFiles = file.listFiles();
        if (fileArrListFiles != null) {
            for (File file2 : fileArrListFiles) {
                if (file2.isFile() && !kotlin.jvm.internal.m0.g(file2.getName(), ".nomedia")) {
                    kotlin.jvm.internal.m0.m(file2);
                    arrayList.add(file2);
                } else if (file2.isDirectory() && z10) {
                    arrayList.addAll(a(file2, z10));
                }
            }
        }
        return arrayList;
    }

    public static final String b() {
        return "Chartboost-Android-SDK  9.11.0";
    }

    public static final String a() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("ZZZZ", Locale.US);
        simpleDateFormat.setTimeZone(TimeZone.getDefault());
        String str = simpleDateFormat.format(new Date());
        kotlin.jvm.internal.m0.o(str, "format(...)");
        return str;
    }
}
