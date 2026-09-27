package gx;

import cv.p0;
import java.util.logging.Logger;
import kotlin.jvm.internal.m0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Logger f87542a = Logger.getLogger("okio.Okio");

    public static final boolean b(@oy.l AssertionError assertionError) {
        m0.p(assertionError, "<this>");
        if (assertionError.getCause() != null) {
            String message = assertionError.getMessage();
            if (message != null ? p0.n3(message, "getsockname failed", false, 2, null) : false) {
                return true;
            }
        }
        return false;
    }
}
