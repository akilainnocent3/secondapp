package com.inmobi.media;

import android.text.TextUtils;
import com.startapp.simple.bloomfilter.parsing.TokenBuilder;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public abstract class Ki {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f55002a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static String f55003b = "dir";

    public static final String a() {
        String str = "pr-SAND-11.1.0-20251110";
        if (TextUtils.isEmpty("")) {
            return str;
        }
        return str + TokenBuilder.TOKEN_DELIMITER + "";
    }
}
