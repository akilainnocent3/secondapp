package io.appmetrica.analytics.impl;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public final class qo {
    public static boolean a(String str) {
        UUID uuidFromString;
        if (str == null || str.length() != 32) {
            return false;
        }
        try {
            uuidFromString = UUID.fromString(b(str));
        } catch (Throwable unused) {
            uuidFromString = null;
        }
        return uuidFromString != null;
    }

    public static String b(String str) {
        return str.substring(0, 8) + TokenBuilder.TOKEN_DELIMITER + str.substring(8, 12) + TokenBuilder.TOKEN_DELIMITER + str.substring(12, 16) + TokenBuilder.TOKEN_DELIMITER + str.substring(16, 20) + TokenBuilder.TOKEN_DELIMITER + str.substring(20, 32);
    }
}
