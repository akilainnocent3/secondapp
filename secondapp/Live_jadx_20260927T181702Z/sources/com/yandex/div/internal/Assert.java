package com.yandex.div.internal;

import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import fw.b;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class Assert {

    @NonNull
    private static AssertionErrorHandler sAssertionErrorHandler = new AssertionErrorHandler() { // from class: com.yandex.div.internal.a
        @Override // com.yandex.div.internal.AssertionErrorHandler
        public final void handleError(AssertionError assertionError) {
            Assert.a(assertionError);
        }
    };
    private static volatile boolean sEnabled = false;

    private Assert() {
    }

    public static void assertEquals(@Nullable Object obj, @Nullable Object obj2) {
        assertEquals((String) null, obj, obj2);
    }

    public static void assertFalse(@Nullable String str, boolean z10) {
        assertTrue(str, !z10);
    }

    public static void assertMainThread() {
        if (isEnabled()) {
            assertSame("Code run not in main thread!", Looper.getMainLooper(), Looper.myLooper());
        }
    }

    public static void assertNotMainThread() {
        if (isEnabled()) {
            assertNotSame("Code run in main thread!", Looper.getMainLooper(), Looper.myLooper());
        }
    }

    public static void assertNotNull(@Nullable String str, @Nullable Object obj) {
        assertTrue(str, obj != null);
    }

    public static void assertNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            failSame(str);
        }
    }

    public static void assertNull(@Nullable String str, @Nullable Object obj) {
        assertTrue(str, obj == null);
    }

    public static void assertSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == obj2) {
            return;
        }
        failNotSame(str, obj, obj2);
    }

    public static void assertTrue(@Nullable String str, boolean z10) {
        if (z10) {
            return;
        }
        fail(str);
    }

    public static void fail() {
        fail(null);
    }

    private static void failNotEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        fail(format(str, obj, obj2));
    }

    private static void failNotSame(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        fail(str2 + "expected same:<" + obj + "> was not:<" + obj2 + ">");
    }

    private static void failSame(@Nullable String str) {
        String str2;
        if (str != null) {
            str2 = str + " ";
        } else {
            str2 = "";
        }
        fail(str2 + "expected not same");
    }

    public static String format(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        String str2 = "";
        if (str != null && !str.equals("")) {
            str2 = str + " ";
        }
        String strValueOf = String.valueOf(obj);
        String strValueOf2 = String.valueOf(obj2);
        if (strValueOf.equals(strValueOf2)) {
            return str2 + "expected: " + formatClassAndValue(obj, strValueOf) + " but was: " + formatClassAndValue(obj2, strValueOf2);
        }
        return str2 + "expected:<" + strValueOf + "> but was:<" + strValueOf2 + ">";
    }

    private static String formatClassAndValue(@Nullable Object obj, @Nullable String str) {
        return (obj == null ? b.f85379f : obj.getClass().getName()) + "<" + str + ">";
    }

    public static boolean isEnabled() {
        return sEnabled;
    }

    private static void performFail(@NonNull AssertionError assertionError) {
        if (isEnabled()) {
            sAssertionErrorHandler.handleError(assertionError);
        }
    }

    public static void setAssertPerformer(@NonNull AssertionErrorHandler assertionErrorHandler) {
        sAssertionErrorHandler = assertionErrorHandler;
    }

    public static void setEnabled(boolean z10) {
        sEnabled = z10;
    }

    public static void assertEquals(@Nullable String str, @Nullable Object obj, @Nullable Object obj2) {
        if (obj == null && obj2 == null) {
            return;
        }
        if (obj == null || !obj.equals(obj2)) {
            if (!(obj instanceof String) || !(obj2 instanceof String)) {
                failNotEquals(str, obj, obj2);
                return;
            }
            if (str == null) {
                str = "";
            }
            performFail(new ComparisonFailure(str, (String) obj, (String) obj2));
        }
    }

    public static void assertFalse(boolean z10) {
        assertFalse(null, z10);
    }

    public static void assertNotNull(@Nullable Object obj) {
        assertNotNull(null, obj);
    }

    public static void assertNotSame(@Nullable Object obj, @Nullable Object obj2) {
        assertNotSame(null, obj, obj2);
    }

    public static void assertNull(@Nullable Object obj) {
        assertNull(null, obj);
    }

    public static void assertSame(@Nullable Object obj, @Nullable Object obj2) {
        assertSame(null, obj, obj2);
    }

    public static void assertTrue(boolean z10) {
        assertTrue(null, z10);
    }

    public static void fail(@Nullable String str) {
        if (sEnabled) {
            if (str == null) {
                str = "";
            }
            performFail(new AssertionError(str));
        }
    }

    public static void fail(@Nullable String str, @Nullable Throwable th2) {
        if (sEnabled) {
            AssertionError assertionError = new AssertionError(str);
            assertionError.initCause(th2);
            performFail(assertionError);
        }
    }

    public static void assertEquals(long j10, long j11) {
        assertEquals((String) null, j10, j11);
    }

    public static void assertEquals(int i10, int i11) {
        assertEquals((String) null, i10, i11);
    }

    public static void assertEquals(@Nullable String str, long j10, long j11) {
        assertEquals(str, Long.valueOf(j10), Long.valueOf(j11));
    }

    public static /* synthetic */ void a(AssertionError assertionError) {
        throw assertionError;
    }
}
