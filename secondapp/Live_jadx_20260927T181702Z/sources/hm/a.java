package hm;

import gi.j;
import java.text.ParseException;
import java.text.ParsePosition;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;
import kj.e;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final String f88486a = "UTC";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final TimeZone f88487b = TimeZone.getTimeZone("UTC");

    public static boolean a(String str, int i10, char c10) {
        return i10 < str.length() && str.charAt(i10) == c10;
    }

    public static String b(Date date) {
        return d(date, false, f88487b);
    }

    public static String c(Date date, boolean z10) {
        return d(date, z10, f88487b);
    }

    public static String d(Date date, boolean z10, TimeZone timeZone) {
        GregorianCalendar gregorianCalendar = new GregorianCalendar(timeZone, Locale.US);
        gregorianCalendar.setTime(date);
        StringBuilder sb2 = new StringBuilder(19 + (z10 ? 4 : 0) + (timeZone.getRawOffset() == 0 ? 1 : 6));
        f(sb2, gregorianCalendar.get(1), 4);
        sb2.append('-');
        f(sb2, gregorianCalendar.get(2) + 1, 2);
        sb2.append('-');
        f(sb2, gregorianCalendar.get(5), 2);
        sb2.append('T');
        f(sb2, gregorianCalendar.get(11), 2);
        sb2.append(':');
        f(sb2, gregorianCalendar.get(12), 2);
        sb2.append(':');
        f(sb2, gregorianCalendar.get(13), 2);
        if (z10) {
            sb2.append(e.f102543c);
            f(sb2, gregorianCalendar.get(14), 3);
        }
        int offset = timeZone.getOffset(gregorianCalendar.getTimeInMillis());
        if (offset != 0) {
            int i10 = offset / 60000;
            int iAbs = Math.abs(i10 / 60);
            int iAbs2 = Math.abs(i10 % 60);
            sb2.append(offset >= 0 ? '+' : '-');
            f(sb2, iAbs, 2);
            sb2.append(':');
            f(sb2, iAbs2, 2);
        } else {
            sb2.append('Z');
        }
        return sb2.toString();
    }

    public static int e(String str, int i10) {
        while (i10 < str.length()) {
            char cCharAt = str.charAt(i10);
            if (cCharAt < '0' || cCharAt > '9') {
                return i10;
            }
            i10++;
        }
        return str.length();
    }

    public static void f(StringBuilder sb2, int i10, int i11) {
        String string = Integer.toString(i10);
        for (int length = i11 - string.length(); length > 0; length--) {
            sb2.append('0');
        }
        sb2.append(string);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x00df A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:55:0x00e5 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:56:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:63:0x0115  */
    /* JADX WARN: Code duplicated, block: B:64:0x0116 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0190 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01c3 A[Catch: IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, TryCatch #2 {IllegalArgumentException -> 0x004e, IndexOutOfBoundsException -> 0x0051, blocks: (B:3:0x0004, B:5:0x0017, B:6:0x0019, B:8:0x0025, B:9:0x0027, B:11:0x0037, B:13:0x003d, B:21:0x005b, B:23:0x006b, B:24:0x006d, B:26:0x0079, B:27:0x007c, B:29:0x0082, B:33:0x008c, B:38:0x009c, B:40:0x00a4, B:51:0x00d9, B:53:0x00df, B:55:0x00e5, B:79:0x0192, B:59:0x00ef, B:60:0x010a, B:61:0x010b, B:65:0x0127, B:67:0x0134, B:70:0x013d, B:72:0x015c, B:75:0x016b, B:76:0x018d, B:78:0x0190, B:64:0x0116, B:81:0x01c3, B:82:0x01ca, B:44:0x00bc, B:45:0x00bf), top: B:93:0x0004 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:85:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:90:0x01ef  */
    /* JADX WARN: Instruction removed from duplicated block: B:64:0x0116, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:85:0x01cf, please report this as an issue */
    /* JADX WARN: Instruction removed from duplicated block: B:90:0x01ef, please report this as an issue */
    public static Date g(String str, ParsePosition parsePosition) throws ParseException {
        String str2;
        String message;
        int i10;
        int i11;
        int i12;
        int iH;
        char cCharAt;
        String strSubstring;
        int length;
        TimeZone timeZone;
        char cCharAt2;
        try {
            int index = parsePosition.getIndex();
            int i13 = index + 4;
            int iH2 = h(str, index, i13);
            if (a(str, i13, '-')) {
                i13 = index + 5;
            }
            int i14 = i13 + 2;
            int iH3 = h(str, i13, i14);
            if (a(str, i14, '-')) {
                i14 = i13 + 3;
            }
            int i15 = i14 + 2;
            int iH4 = h(str, i14, i15);
            boolean zA = a(str, i15, 'T');
            if (!zA && str.length() <= i15) {
                GregorianCalendar gregorianCalendar = new GregorianCalendar(iH2, iH3 - 1, iH4);
                gregorianCalendar.setLenient(false);
                parsePosition.setIndex(i15);
                return gregorianCalendar.getTime();
            }
            if (zA) {
                int i16 = i14 + 5;
                int iH5 = h(str, i14 + 3, i16);
                if (a(str, i16, ':')) {
                    i16 = i14 + 6;
                }
                int i17 = i16 + 2;
                int iH6 = h(str, i16, i17);
                if (a(str, i17, ':')) {
                    i17 = i16 + 3;
                }
                if (str.length() <= i17 || (cCharAt2 = str.charAt(i17)) == 'Z' || cCharAt2 == '+' || cCharAt2 == '-') {
                    i15 = i17;
                    i10 = iH5;
                    i11 = iH6;
                } else {
                    int i18 = i17 + 2;
                    iH = h(str, i17, i18);
                    if (iH > 59 && iH < 63) {
                        iH = 59;
                    }
                    if (a(str, i18, e.f102543c)) {
                        int i19 = i17 + 3;
                        int iE = e(str, i17 + 4);
                        int iMin = Math.min(iE, i17 + 6);
                        int iH7 = h(str, i19, iMin);
                        int i20 = iMin - i19;
                        if (i20 == 1) {
                            iH7 *= 100;
                        } else if (i20 == 2) {
                            iH7 *= 10;
                        }
                        i10 = iH5;
                        i15 = iE;
                        i11 = iH6;
                        i12 = iH7;
                    } else {
                        i10 = iH5;
                        i15 = i18;
                        i11 = iH6;
                        i12 = 0;
                    }
                }
                if (str.length() > i15) {
                    throw new IllegalArgumentException("No time zone indicator");
                }
                cCharAt = str.charAt(i15);
                if (cCharAt == 'Z') {
                    timeZone = f88487b;
                    length = i15 + 1;
                } else {
                    if (cCharAt != '+' && cCharAt != '-') {
                        throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                    }
                    strSubstring = str.substring(i15);
                    if (strSubstring.length() >= 5) {
                        strSubstring = strSubstring + "00";
                    }
                    length = i15 + strSubstring.length();
                    if (!strSubstring.equals("+0000") || strSubstring.equals("+00:00")) {
                        timeZone = f88487b;
                    } else {
                        String str3 = "GMT" + strSubstring;
                        TimeZone timeZone2 = TimeZone.getTimeZone(str3);
                        String id2 = timeZone2.getID();
                        if (!id2.equals(str3) && !id2.replace(":", "").equals(str3)) {
                            throw new IndexOutOfBoundsException("Mismatching time zone indicator: " + str3 + " given, resolves to " + timeZone2.getID());
                        }
                        timeZone = timeZone2;
                    }
                }
                GregorianCalendar gregorianCalendar2 = new GregorianCalendar(timeZone);
                gregorianCalendar2.setLenient(false);
                gregorianCalendar2.set(1, iH2);
                gregorianCalendar2.set(2, iH3 - 1);
                gregorianCalendar2.set(5, iH4);
                gregorianCalendar2.set(11, i10);
                gregorianCalendar2.set(12, i11);
                gregorianCalendar2.set(13, iH);
                gregorianCalendar2.set(14, i12);
                parsePosition.setIndex(length);
                return gregorianCalendar2.getTime();
            }
            i10 = 0;
            i11 = 0;
            i12 = 0;
            iH = 0;
            if (str.length() > i15) {
                throw new IllegalArgumentException("No time zone indicator");
            }
            cCharAt = str.charAt(i15);
            if (cCharAt == 'Z') {
                timeZone = f88487b;
                length = i15 + 1;
            } else {
                if (cCharAt != '+') {
                    throw new IndexOutOfBoundsException("Invalid time zone indicator '" + cCharAt + "'");
                }
                strSubstring = str.substring(i15);
                if (strSubstring.length() >= 5) {
                    strSubstring = strSubstring + "00";
                }
                length = i15 + strSubstring.length();
                if (strSubstring.equals("+0000")) {
                    timeZone = f88487b;
                } else {
                    timeZone = f88487b;
                }
            }
            GregorianCalendar gregorianCalendar3 = new GregorianCalendar(timeZone);
            gregorianCalendar3.setLenient(false);
            gregorianCalendar3.set(1, iH2);
            gregorianCalendar3.set(2, iH3 - 1);
            gregorianCalendar3.set(5, iH4);
            gregorianCalendar3.set(11, i10);
            gregorianCalendar3.set(12, i11);
            gregorianCalendar3.set(13, iH);
            gregorianCalendar3.set(14, i12);
            parsePosition.setIndex(length);
            return gregorianCalendar3.getTime();
        } catch (IllegalArgumentException e10) {
            e = e10;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null || message.isEmpty()) {
                message = j.f86770c + e.getClass().getName() + j.f86771d;
            }
            ParseException parseException = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException.initCause(e);
            throw parseException;
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
            if (str == null) {
                str2 = null;
            } else {
                str2 = '\"' + str + '\"';
            }
            message = e.getMessage();
            if (message != null) {
                message = j.f86770c + e.getClass().getName() + j.f86771d;
            } else {
                message = j.f86770c + e.getClass().getName() + j.f86771d;
            }
            ParseException parseException2 = new ParseException("Failed to parse date [" + str2 + "]: " + message, parsePosition.getIndex());
            parseException2.initCause(e);
            throw parseException2;
        }
    }

    public static int h(String str, int i10, int i11) throws NumberFormatException {
        int i12;
        int i13;
        if (i10 < 0 || i11 > str.length() || i10 > i11) {
            throw new NumberFormatException(str);
        }
        if (i10 < i11) {
            i13 = i10 + 1;
            int iDigit = Character.digit(str.charAt(i10), 10);
            if (iDigit < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = -iDigit;
        } else {
            i12 = 0;
            i13 = i10;
        }
        while (i13 < i11) {
            int i14 = i13 + 1;
            int iDigit2 = Character.digit(str.charAt(i13), 10);
            if (iDigit2 < 0) {
                throw new NumberFormatException("Invalid number: " + str.substring(i10, i11));
            }
            i12 = (i12 * 10) - iDigit2;
            i13 = i14;
        }
        return -i12;
    }
}
