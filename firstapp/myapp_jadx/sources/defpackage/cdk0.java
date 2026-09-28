package defpackage;

import java.util.logging.Logger;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes8.dex */
public final class cdk0 {
    public static final Logger a = Logger.getLogger("okio.Okio");

    public static final boolean a(AssertionError assertionError) {
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? StringsKt.M(message, "getsockname failed", false) : false) {
                return true;
            }
        }
        return false;
    }
}
