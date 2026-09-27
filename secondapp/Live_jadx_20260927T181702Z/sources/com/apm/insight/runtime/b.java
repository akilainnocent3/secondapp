package com.apm.insight.runtime;

import com.startapp.simple.bloomfilter.codec.IOUtils;
import java.io.File;
import java.io.IOException;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static long f26221a = -30000;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static File f26222b;

    public static void a(long j10) throws Throwable {
        if (j10 - f26221a < 30000) {
            return;
        }
        f26221a = j10;
        try {
            if (f26222b == null) {
                long jCurrentTimeMillis = System.currentTimeMillis();
                f26222b = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((jCurrentTimeMillis - (jCurrentTimeMillis % 86400000)) / 86400000) + to.c.userBaseDel + com.apm.insight.e.f());
            }
            com.apm.insight.l.f.a(f26222b, String.valueOf(System.currentTimeMillis()), false);
        } catch (IOException unused) {
        }
    }

    public static String a(long j10, String str) {
        try {
            return com.apm.insight.l.f.a(new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/" + ((j10 - (j10 % 86400000)) / 86400000) + to.c.userBaseDel + str), IOUtils.LINE_SEPARATOR_UNIX);
        } catch (Throwable th2) {
            return th2.getMessage();
        }
    }

    public static void a() {
        File file = new File(com.apm.insight.l.j.j(com.apm.insight.e.g()), "apminsight/TrackInfo/");
        String[] list = file.list();
        if (list != null && list.length > 5) {
            Arrays.sort(list);
            for (int i10 = 0; i10 < list.length - 5; i10++) {
                com.apm.insight.l.f.a(new File(file, list[i10]));
            }
        }
    }
}
