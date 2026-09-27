package com.bytedance.adsdk.hww.tq.hv.hww;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class ok {
    private static Object hww(int i10, Number number) {
        if ((number instanceof Integer) || (number instanceof Short) || (number instanceof Byte)) {
            return Integer.valueOf(i10 + number.intValue());
        }
        if (number instanceof Long) {
            return Long.valueOf(((long) i10) + number.longValue());
        }
        if (number instanceof Float) {
            return Float.valueOf(i10 + number.floatValue());
        }
        if (number instanceof Double) {
            return Double.valueOf(((double) i10) + number.doubleValue());
        }
        throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
    }

    private static Object hww(long j10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Long.valueOf(j10 + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(j10 + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(j10 + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Long.valueOf(j10 + ((long) number.intValue()));
    }

    private static Object hww(float f10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Float.valueOf(f10 + number.longValue());
            }
            if (number instanceof Float) {
                return Float.valueOf(f10 + number.floatValue());
            }
            if (number instanceof Double) {
                return Double.valueOf(((double) f10) + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Float.valueOf(f10 + number.intValue());
    }

    private static Object hww(double d10, Number number) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return Double.valueOf(d10 + number.longValue());
            }
            if (number instanceof Float) {
                return Double.valueOf(d10 + ((double) number.floatValue()));
            }
            if (number instanceof Double) {
                return Double.valueOf(d10 + number.doubleValue());
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return Double.valueOf(d10 + ((double) number.intValue()));
    }

    public static Object hww(Number number, Number number2) {
        if (!(number instanceof Integer) && !(number instanceof Short) && !(number instanceof Byte)) {
            if (number instanceof Long) {
                return hww(number.longValue(), number2);
            }
            if (number instanceof Float) {
                return hww(number.floatValue(), number2);
            }
            if (number instanceof Double) {
                return hww(number.doubleValue(), number2);
            }
            throw new UnsupportedOperationException(number.getClass().getName() + "This type of addition operation is not supported");
        }
        return hww(number.intValue(), number2);
    }
}
