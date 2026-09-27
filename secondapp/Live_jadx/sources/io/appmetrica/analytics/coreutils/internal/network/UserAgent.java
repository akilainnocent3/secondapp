package io.appmetrica.analytics.coreutils.internal.network;

import android.os.Build;
import cs.o;
import cv.k0;
import io.appmetrica.analytics.coreutils.internal.StringExtensionsKt;
import kj.e;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class UserAgent {

    @l
    public static final UserAgent INSTANCE = new UserAgent();

    private UserAgent() {
    }

    @l
    @o
    public static final String getFor(@l String str, @l String str2, @l String str3) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append('/');
        sb2.append(str2);
        sb2.append(e.f102543c);
        sb2.append(str3);
        sb2.append(" (");
        INSTANCE.getClass();
        String str4 = Build.MODEL;
        String str5 = Build.MANUFACTURER;
        if (!k0.J2(str4, str5, false, 2, null)) {
            str4 = str5 + ' ' + str4;
        }
        sb2.append(StringExtensionsKt.replaceFirstCharWithTitleCase(str4));
        sb2.append("; Android ");
        sb2.append(Build.VERSION.RELEASE);
        sb2.append(')');
        return sb2.toString();
    }
}
