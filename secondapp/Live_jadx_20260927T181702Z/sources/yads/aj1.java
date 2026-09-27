package yads;

import com.startapp.simple.bloomfilter.parsing.TokenBuilder;
import java.util.Locale;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes9.dex */
public final class aj1 {
    public static String a() {
        String lowerCase = cv.k0.z2(UUID.randomUUID().toString(), TokenBuilder.TOKEN_DELIMITER, "", false, 4, null).toLowerCase(Locale.ROOT);
        kotlin.jvm.internal.m0.o(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }
}
