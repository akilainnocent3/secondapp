package com.twilio.voice;

import android.content.Context;
import defpackage.bmy;
import defpackage.d580;
import defpackage.fm20;
import defpackage.hb5;
import defpackage.hce0;
import defpackage.ib5;
import defpackage.mae0;

/* JADX INFO: loaded from: classes4.dex */
final class Preconditions {
    private Preconditions() {
    }

    private static String badElementIndex(int i, int i2, String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return format("%s (%s) must be less than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hb5.a(hce0.a(i2, "negative size: "));
        return null;
    }

    private static String badPositionIndex(int i, int i2, String str) {
        if (i < 0) {
            return format("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return format("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hb5.a(hce0.a(i2, "negative size: "));
        return null;
    }

    private static String badPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i > i3) {
            return badPositionIndex(i, i3, "start index");
        }
        return (i2 < 0 || i2 > i3) ? badPositionIndex(i2, i3, "end index") : format("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
    }

    public static void checkApplicationContext(Context context) {
        checkApplicationContext(context, "Context is not application context");
    }

    public static void checkArgument(boolean z, String str, char c, char c2) {
        if (z) {
            return;
        }
        hb5.a(format(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    public static int checkElementIndex(int i, int i2, String str) {
        if (i >= 0 && i < i2) {
            return i;
        }
        mae0.a(badElementIndex(i, i2, str));
        return 0;
    }

    public static <T> T checkNotNull(T t, String str, char c, char c2) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Character.valueOf(c), Character.valueOf(c2)));
        return null;
    }

    public static int checkPositionIndex(int i, int i2, String str) {
        if (i >= 0 && i <= i2) {
            return i;
        }
        mae0.a(badPositionIndex(i, i2, str));
        return 0;
    }

    public static void checkPositionIndexes(int i, int i2, int i3) {
        if (i < 0 || i2 < i || i2 > i3) {
            mae0.a(badPositionIndexes(i, i2, i3));
        }
    }

    public static void checkState(boolean z, String str, char c, char c2) {
        if (z) {
            return;
        }
        ib5.a(format(str, Character.valueOf(c), Character.valueOf(c2)));
    }

    public static String format(String str, Object... objArr) {
        int iIndexOf;
        String strValueOf = String.valueOf(str);
        StringBuilder sb = new StringBuilder((objArr.length * 16) + strValueOf.length());
        int i = 0;
        int i2 = 0;
        while (i < objArr.length && (iIndexOf = strValueOf.indexOf("%s", i2)) != -1) {
            sb.append((CharSequence) strValueOf, i2, iIndexOf);
            sb.append(objArr[i]);
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) strValueOf, i2, strValueOf.length());
        if (i < objArr.length) {
            sb.append(" [");
            sb.append(objArr[i]);
            for (int i3 = i + 1; i3 < objArr.length; i3++) {
                sb.append(", ");
                sb.append(objArr[i3]);
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static void checkApplicationContext(Context context, String str) {
    }

    public static int checkElementIndex(int i, int i2) {
        return checkElementIndex(i, i2, "index");
    }

    public static int checkPositionIndex(int i, int i2) {
        return checkPositionIndex(i, i2, "index");
    }

    public static void checkArgument(boolean z, Object obj) {
        if (!z) {
            throw new IllegalArgumentException(String.valueOf(obj));
        }
    }

    public static void checkState(boolean z, Object obj) {
        if (!z) {
            throw new IllegalStateException(String.valueOf(obj));
        }
    }

    public static void checkArgument(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        hb5.a(format(str, objArr));
    }

    public static <T> T checkNotNull(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }

    public static void checkState(boolean z, String str, Object... objArr) {
        if (z) {
            return;
        }
        ib5.a(format(str, objArr));
    }

    public static void checkArgument(boolean z, String str, char c) {
        if (z) {
            return;
        }
        hb5.a(format(str, Character.valueOf(c)));
    }

    public static <T> T checkNotNull(T t, String str, Object... objArr) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, objArr));
        return null;
    }

    public static void checkState(boolean z, String str, char c) {
        if (z) {
            return;
        }
        ib5.a(format(str, Character.valueOf(c)));
    }

    public static void checkArgument(boolean z, String str, int i) {
        if (z) {
            return;
        }
        hb5.a(format(str, Integer.valueOf(i)));
    }

    public static <T> T checkNotNull(T t, String str, char c) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Character.valueOf(c)));
        return null;
    }

    public static void checkState(boolean z, String str, int i) {
        if (z) {
            return;
        }
        ib5.a(format(str, Integer.valueOf(i)));
    }

    public static void checkArgument(boolean z, String str, long j) {
        if (z) {
            return;
        }
        hb5.a(format(str, Long.valueOf(j)));
    }

    public static <T> T checkNotNull(T t, String str, int i) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Integer.valueOf(i)));
        return null;
    }

    public static void checkState(boolean z, String str, long j) {
        if (z) {
            return;
        }
        ib5.a(format(str, Long.valueOf(j)));
    }

    public static void checkArgument(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        hb5.a(format(str, obj));
    }

    public static <T> T checkNotNull(T t, String str, long j) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Long.valueOf(j)));
        return null;
    }

    public static void checkState(boolean z, String str, Object obj) {
        if (z) {
            return;
        }
        ib5.a(format(str, obj));
    }

    public static void checkArgument(boolean z) {
        if (z) {
            return;
        }
        d580.a();
    }

    public static <T> T checkNotNull(T t, String str, Object obj) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, obj));
        return null;
    }

    public static void checkState(boolean z) {
        if (z) {
            return;
        }
        fm20.a();
    }

    public static void checkArgument(boolean z, String str, char c, int i) {
        if (z) {
            return;
        }
        hb5.a(format(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    public static <T> T checkNotNull(T t) {
        t.getClass();
        return t;
    }

    public static void checkState(boolean z, String str, char c, int i) {
        if (z) {
            return;
        }
        ib5.a(format(str, Character.valueOf(c), Integer.valueOf(i)));
    }

    public static void checkArgument(boolean z, String str, char c, long j) {
        if (z) {
            return;
        }
        hb5.a(format(str, Character.valueOf(c), Long.valueOf(j)));
    }

    public static <T> T checkNotNull(T t, String str, char c, int i) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Character.valueOf(c), Integer.valueOf(i)));
        return null;
    }

    public static void checkState(boolean z, String str, char c, long j) {
        if (z) {
            return;
        }
        ib5.a(format(str, Character.valueOf(c), Long.valueOf(j)));
    }

    public static void checkArgument(boolean z, String str, char c, Object obj) {
        if (z) {
            return;
        }
        hb5.a(format(str, Character.valueOf(c), obj));
    }

    public static <T> T checkNotNull(T t, String str, char c, long j) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Character.valueOf(c), Long.valueOf(j)));
        return null;
    }

    public static void checkState(boolean z, String str, char c, Object obj) {
        if (z) {
            return;
        }
        ib5.a(format(str, Character.valueOf(c), obj));
    }

    public static void checkArgument(boolean z, String str, int i, char c) {
        if (z) {
            return;
        }
        hb5.a(format(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    public static <T> T checkNotNull(T t, String str, char c, Object obj) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Character.valueOf(c), obj));
        return null;
    }

    public static void checkState(boolean z, String str, int i, char c) {
        if (z) {
            return;
        }
        ib5.a(format(str, Integer.valueOf(i), Character.valueOf(c)));
    }

    public static void checkArgument(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        hb5.a(format(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static <T> T checkNotNull(T t, String str, int i, char c) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Integer.valueOf(i), Character.valueOf(c)));
        return null;
    }

    public static void checkState(boolean z, String str, int i, int i2) {
        if (z) {
            return;
        }
        ib5.a(format(str, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    public static void checkArgument(boolean z, String str, int i, long j) {
        if (z) {
            return;
        }
        hb5.a(format(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    public static <T> T checkNotNull(T t, String str, int i, int i2) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Integer.valueOf(i), Integer.valueOf(i2)));
        return null;
    }

    public static void checkState(boolean z, String str, int i, long j) {
        if (z) {
            return;
        }
        ib5.a(format(str, Integer.valueOf(i), Long.valueOf(j)));
    }

    public static void checkArgument(boolean z, String str, int i, Object obj) {
        if (z) {
            return;
        }
        hb5.a(format(str, Integer.valueOf(i), obj));
    }

    public static <T> T checkNotNull(T t, String str, int i, long j) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Integer.valueOf(i), Long.valueOf(j)));
        return null;
    }

    public static void checkState(boolean z, String str, int i, Object obj) {
        if (z) {
            return;
        }
        ib5.a(format(str, Integer.valueOf(i), obj));
    }

    public static void checkArgument(boolean z, String str, long j, char c) {
        if (z) {
            return;
        }
        hb5.a(format(str, Long.valueOf(j), Character.valueOf(c)));
    }

    public static <T> T checkNotNull(T t, String str, int i, Object obj) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Integer.valueOf(i), obj));
        return null;
    }

    public static void checkState(boolean z, String str, long j, char c) {
        if (z) {
            return;
        }
        ib5.a(format(str, Long.valueOf(j), Character.valueOf(c)));
    }

    public static void checkArgument(boolean z, String str, long j, int i) {
        if (z) {
            return;
        }
        hb5.a(format(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    public static <T> T checkNotNull(T t, String str, long j, char c) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Long.valueOf(j), Character.valueOf(c)));
        return null;
    }

    public static void checkState(boolean z, String str, long j, int i) {
        if (z) {
            return;
        }
        ib5.a(format(str, Long.valueOf(j), Integer.valueOf(i)));
    }

    public static void checkArgument(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        hb5.a(format(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static <T> T checkNotNull(T t, String str, long j, int i) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Long.valueOf(j), Integer.valueOf(i)));
        return null;
    }

    public static void checkState(boolean z, String str, long j, long j2) {
        if (z) {
            return;
        }
        ib5.a(format(str, Long.valueOf(j), Long.valueOf(j2)));
    }

    public static void checkArgument(boolean z, String str, long j, Object obj) {
        if (z) {
            return;
        }
        hb5.a(format(str, Long.valueOf(j), obj));
    }

    public static <T> T checkNotNull(T t, String str, long j, long j2) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Long.valueOf(j), Long.valueOf(j2)));
        return null;
    }

    public static void checkState(boolean z, String str, long j, Object obj) {
        if (z) {
            return;
        }
        ib5.a(format(str, Long.valueOf(j), obj));
    }

    public static void checkArgument(boolean z, String str, Object obj, char c) {
        if (z) {
            return;
        }
        hb5.a(format(str, obj, Character.valueOf(c)));
    }

    public static <T> T checkNotNull(T t, String str, long j, Object obj) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, Long.valueOf(j), obj));
        return null;
    }

    public static void checkState(boolean z, String str, Object obj, char c) {
        if (z) {
            return;
        }
        ib5.a(format(str, obj, Character.valueOf(c)));
    }

    public static void checkArgument(boolean z, String str, Object obj, int i) {
        if (z) {
            return;
        }
        hb5.a(format(str, obj, Integer.valueOf(i)));
    }

    public static <T> T checkNotNull(T t, String str, Object obj, char c) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, obj, Character.valueOf(c)));
        return null;
    }

    public static void checkState(boolean z, String str, Object obj, int i) {
        if (z) {
            return;
        }
        ib5.a(format(str, obj, Integer.valueOf(i)));
    }

    public static void checkArgument(boolean z, String str, Object obj, long j) {
        if (z) {
            return;
        }
        hb5.a(format(str, obj, Long.valueOf(j)));
    }

    public static <T> T checkNotNull(T t, String str, Object obj, int i) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, obj, Integer.valueOf(i)));
        return null;
    }

    public static void checkState(boolean z, String str, Object obj, long j) {
        if (z) {
            return;
        }
        ib5.a(format(str, obj, Long.valueOf(j)));
    }

    public static void checkArgument(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        hb5.a(format(str, obj, obj2));
    }

    public static <T> T checkNotNull(T t, String str, Object obj, long j) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, obj, Long.valueOf(j)));
        return null;
    }

    public static void checkState(boolean z, String str, Object obj, Object obj2) {
        if (z) {
            return;
        }
        ib5.a(format(str, obj, obj2));
    }

    public static void checkArgument(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
            return;
        }
        hb5.a(format(str, obj, obj2, obj3));
    }

    public static <T> T checkNotNull(T t, String str, Object obj, Object obj2) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, obj, obj2));
        return null;
    }

    public static void checkState(boolean z, String str, Object obj, Object obj2, Object obj3) {
        if (z) {
            return;
        }
        ib5.a(format(str, obj, obj2, obj3));
    }

    public static void checkArgument(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (z) {
            return;
        }
        hb5.a(format(str, obj, obj2, obj3, obj4));
    }

    public static <T> T checkNotNull(T t, String str, Object obj, Object obj2, Object obj3) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, obj, obj2, obj3));
        return null;
    }

    public static void checkState(boolean z, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (z) {
            return;
        }
        ib5.a(format(str, obj, obj2, obj3, obj4));
    }

    public static <T> T checkNotNull(T t, String str, Object obj, Object obj2, Object obj3, Object obj4) {
        if (t != null) {
            return t;
        }
        bmy.a(format(str, obj, obj2, obj3, obj4));
        return null;
    }
}
