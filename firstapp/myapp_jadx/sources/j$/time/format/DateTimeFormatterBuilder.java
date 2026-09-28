package j$.time.format;

import j$.time.LocalDate;
import j$.time.chrono.Chronology;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import okhttp3.internal.http.HttpStatusCodesKt;

/* JADX INFO: compiled from: r8-map-id-341f12e635949ce385fe972d9bf062aa0727e156e520e84a100f26e1747f2bcc */
/* JADX INFO: loaded from: classes3.dex */
public final class DateTimeFormatterBuilder {
    public static final j$.time.f h = new j$.time.f(3);
    public static final Map i;
    public DateTimeFormatterBuilder a;
    public final DateTimeFormatterBuilder b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap map = new HashMap();
        i = map;
        map.put('G', j$.time.temporal.a.ERA);
        map.put('y', j$.time.temporal.a.YEAR_OF_ERA);
        map.put('u', j$.time.temporal.a.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.a;
        map.put('Q', gVar);
        map.put('q', gVar);
        j$.time.temporal.a aVar = j$.time.temporal.a.MONTH_OF_YEAR;
        map.put('M', aVar);
        map.put('L', aVar);
        map.put('D', j$.time.temporal.a.DAY_OF_YEAR);
        map.put('d', j$.time.temporal.a.DAY_OF_MONTH);
        map.put('F', j$.time.temporal.a.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        j$.time.temporal.a aVar2 = j$.time.temporal.a.DAY_OF_WEEK;
        map.put('E', aVar2);
        map.put('c', aVar2);
        map.put('e', aVar2);
        map.put('a', j$.time.temporal.a.AMPM_OF_DAY);
        map.put('H', j$.time.temporal.a.HOUR_OF_DAY);
        map.put('k', j$.time.temporal.a.CLOCK_HOUR_OF_DAY);
        map.put('K', j$.time.temporal.a.HOUR_OF_AMPM);
        map.put('h', j$.time.temporal.a.CLOCK_HOUR_OF_AMPM);
        map.put('m', j$.time.temporal.a.MINUTE_OF_HOUR);
        map.put('s', j$.time.temporal.a.SECOND_OF_MINUTE);
        j$.time.temporal.a aVar3 = j$.time.temporal.a.NANO_OF_SECOND;
        map.put('S', aVar3);
        map.put('A', j$.time.temporal.a.MILLI_OF_DAY);
        map.put('n', aVar3);
        map.put('N', j$.time.temporal.a.NANO_OF_DAY);
        map.put('g', j$.time.temporal.k.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public static String getLocalizedDateTimePattern(FormatStyle formatStyle, FormatStyle formatStyle2, Chronology chronology, Locale locale) {
        DateFormat timeInstance;
        Objects.requireNonNull(locale, "locale");
        Objects.requireNonNull(chronology, "chrono");
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either dateStyle or timeStyle must be non-null");
        }
        if (formatStyle2 == null) {
            timeInstance = DateFormat.getDateInstance(formatStyle.ordinal(), locale);
        } else {
            timeInstance = formatStyle == null ? DateFormat.getTimeInstance(formatStyle2.ordinal(), locale) : DateFormat.getDateTimeInstance(formatStyle.ordinal(), formatStyle2.ordinal(), locale);
        }
        if (!(timeInstance instanceof SimpleDateFormat)) {
            throw new UnsupportedOperationException("Can't determine pattern from " + timeInstance);
        }
        String pattern = ((SimpleDateFormat) timeInstance).toPattern();
        if (pattern == null) {
            return null;
        }
        int i2 = 0;
        boolean z = pattern.indexOf(66) != -1;
        boolean z2 = pattern.indexOf(98) != -1;
        if (!z && !z2) {
            return pattern;
        }
        StringBuilder sb = new StringBuilder(pattern.length());
        char c = ' ';
        while (i2 < pattern.length()) {
            char cCharAt = pattern.charAt(i2);
            if (cCharAt != ' ') {
                if (cCharAt != 'B' && cCharAt != 'b') {
                    sb.append(cCharAt);
                }
            } else if (i2 == 0 || (c != 'B' && c != 'b')) {
                sb.append(cCharAt);
            }
            i2++;
            c = cCharAt;
        }
        int length = sb.length() - 1;
        if (length >= 0 && sb.charAt(length) == ' ') {
            sb.deleteCharAt(length);
        }
        return sb.toString();
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        d dVar = dateTimeFormatter.a;
        if (dVar.b) {
            dVar = new d(dVar.a, false);
        }
        c(dVar);
    }

    public final void b(j$.time.temporal.a aVar, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new f(aVar, i2, i3, z));
        } else {
            k(new f(aVar, i2, i3, z));
        }
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            k kVar = new k(eVar, i2, dateTimeFormatterBuilder.f);
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = (char) 0;
            eVar = kVar;
        }
        ((ArrayList) dateTimeFormatterBuilder.c).add(eVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        dateTimeFormatterBuilder2.g = -1;
        return ((ArrayList) dateTimeFormatterBuilder2.c).size() - 1;
    }

    public final void d(char c) {
        c(new c(c));
    }

    public final void e(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        int i2 = 1;
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(str, i2));
        }
    }

    public final void f(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(textStyle, 0));
    }

    public final void g(String str, String str2) {
        c(new j(str, str2));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:108:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:109:0x0180  */
    /* JADX WARN: Code duplicated, block: B:110:0x0185 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x0187  */
    /* JADX WARN: Code duplicated, block: B:148:0x0200  */
    /* JADX WARN: Code duplicated, block: B:249:0x0369  */
    /* JADX WARN: Code duplicated, block: B:251:0x0373  */
    /* JADX WARN: Code duplicated, block: B:252:0x0377  */
    /* JADX WARN: Code duplicated, block: B:284:0x018c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:297:0x0382 A[SYNTHETIC] */
    public final void h(String str) {
        String strSubstring;
        boolean z;
        int i2;
        int i3;
        Objects.requireNonNull(str, "pattern");
        int i4 = 0;
        while (i4 < str.length()) {
            char cCharAt = str.charAt(i4);
            if ((cCharAt >= 'A' && cCharAt <= 'Z') || (cCharAt >= 'a' && cCharAt <= 'z')) {
                int i5 = i4 + 1;
                while (i5 < str.length() && str.charAt(i5) == cCharAt) {
                    i5++;
                }
                int i6 = i5 - i4;
                if (cCharAt == 'p') {
                    if (i5 >= str.length() || (((cCharAt = str.charAt(i5)) < 'A' || cCharAt > 'Z') && (cCharAt < 'a' || cCharAt > 'z'))) {
                        i2 = i5;
                        i3 = i6;
                        i6 = 0;
                    } else {
                        i2 = i5 + 1;
                        while (i2 < str.length() && str.charAt(i2) == cCharAt) {
                            i2++;
                        }
                        i3 = i2 - i5;
                    }
                    if (i6 == 0) {
                        throw new IllegalArgumentException("Pad letter 'p' must be followed by valid pad pattern: ".concat(str));
                    }
                    if (i6 < 1) {
                        j$.time.h.h("The pad width must be at least one but was ", i6);
                        return;
                    }
                    DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
                    dateTimeFormatterBuilder.e = i6;
                    dateTimeFormatterBuilder.f = ' ';
                    dateTimeFormatterBuilder.g = -1;
                    i6 = i3;
                    i5 = i2;
                }
                j$.time.temporal.n nVar = (j$.time.temporal.n) ((HashMap) i).get(Character.valueOf(cCharAt));
                if (nVar != null) {
                    if (cCharAt == 'A') {
                        n(nVar, i6, 19, c0.NOT_NEGATIVE);
                    } else {
                        if (cCharAt == 'Q') {
                            z = false;
                        } else if (cCharAt == 'S') {
                            b(j$.time.temporal.a.NANO_OF_SECOND, i6, i6, false);
                        } else if (cCharAt == 'a') {
                            if (i6 != 1) {
                                j$.time.h.j("Too many pattern letters: ", cCharAt);
                                return;
                            }
                            j(nVar, TextStyle.SHORT);
                        } else if (cCharAt == 'k') {
                            if (i6 == 1) {
                                l(nVar);
                            } else {
                                if (i6 == 2) {
                                    j$.time.h.j("Too many pattern letters: ", cCharAt);
                                    return;
                                }
                                m(nVar, i6);
                            }
                        } else if (cCharAt == 'q') {
                            z = true;
                        } else if (cCharAt == 's') {
                            if (i6 == 1) {
                                l(nVar);
                            } else {
                                if (i6 == 2) {
                                    j$.time.h.j("Too many pattern letters: ", cCharAt);
                                    return;
                                }
                                m(nVar, i6);
                            }
                        } else if (cCharAt == 'u' || cCharAt == 'y') {
                            if (i6 == 2) {
                                LocalDate localDate = o.h;
                                Objects.requireNonNull(localDate, "baseDate");
                                k(new o(nVar, 2, 2, localDate, 0));
                            } else if (i6 < 4) {
                                n(nVar, i6, 19, c0.NORMAL);
                            } else {
                                n(nVar, i6, 19, c0.EXCEEDS_PAD);
                            }
                        } else if (cCharAt == 'g') {
                            n(nVar, i6, 19, c0.NORMAL);
                        } else if (cCharAt == 'h' || cCharAt == 'm') {
                            if (i6 == 1) {
                                l(nVar);
                            } else {
                                if (i6 == 2) {
                                    j$.time.h.j("Too many pattern letters: ", cCharAt);
                                    return;
                                }
                                m(nVar, i6);
                            }
                        } else if (cCharAt != 'n') {
                            switch (cCharAt) {
                                case 'D':
                                    if (i6 == 1) {
                                        l(nVar);
                                    } else {
                                        if (i6 != 2 && i6 != 3) {
                                            j$.time.h.j("Too many pattern letters: ", cCharAt);
                                            return;
                                        }
                                        n(nVar, i6, 3, c0.NOT_NEGATIVE);
                                    }
                                    break;
                                case 'E':
                                    z = false;
                                    break;
                                case 'F':
                                    if (i6 != 1) {
                                        j$.time.h.j("Too many pattern letters: ", cCharAt);
                                        return;
                                    }
                                    l(nVar);
                                    break;
                                case 'G':
                                    if (i6 == 1 || i6 == 2 || i6 == 3) {
                                        j(nVar, TextStyle.SHORT);
                                    } else if (i6 == 4) {
                                        j(nVar, TextStyle.FULL);
                                    } else {
                                        if (i6 != 5) {
                                            j$.time.h.j("Too many pattern letters: ", cCharAt);
                                            return;
                                        }
                                        j(nVar, TextStyle.NARROW);
                                    }
                                    break;
                                default:
                                    switch (cCharAt) {
                                        case 'K':
                                            break;
                                        case 'L':
                                            z = true;
                                            break;
                                        case 'M':
                                            z = false;
                                            break;
                                        case 'N':
                                            n(nVar, i6, 19, c0.NOT_NEGATIVE);
                                            break;
                                        default:
                                            switch (cCharAt) {
                                                case 'c':
                                                    if (i6 == 1) {
                                                        int i7 = i6;
                                                        k(new r(cCharAt, i7, i7, i7, 0));
                                                    } else {
                                                        if (i6 == 2) {
                                                            throw new IllegalArgumentException("Invalid pattern \"cc\"");
                                                        }
                                                        z = true;
                                                    }
                                                    break;
                                                case 'd':
                                                    break;
                                                case HttpStatusCodesKt.HTTP_SWITCHING_PROTOCOLS /* 101 */:
                                                    z = false;
                                                    break;
                                                default:
                                                    if (i6 != 1) {
                                                        m(nVar, i6);
                                                    } else {
                                                        l(nVar);
                                                    }
                                                    break;
                                            }
                                            break;
                                    }
                                case 'H':
                                    if (i6 == 1) {
                                        l(nVar);
                                    } else {
                                        if (i6 == 2) {
                                            j$.time.h.j("Too many pattern letters: ", cCharAt);
                                            return;
                                        }
                                        m(nVar, i6);
                                    }
                                    break;
                            }
                        } else {
                            n(nVar, i6, 19, c0.NOT_NEGATIVE);
                        }
                        if (i6 == 1 || i6 == 2) {
                            if (cCharAt == 'e') {
                                int i8 = i6;
                                k(new r(cCharAt, i8, i8, i8, 0));
                            } else if (cCharAt == 'E') {
                                j(nVar, TextStyle.SHORT);
                            } else if (i6 == 1) {
                                l(nVar);
                            } else {
                                m(nVar, 2);
                            }
                        } else if (i6 == 3) {
                            j(nVar, z ? TextStyle.SHORT_STANDALONE : TextStyle.SHORT);
                        } else if (i6 == 4) {
                            j(nVar, z ? TextStyle.FULL_STANDALONE : TextStyle.FULL);
                        } else {
                            if (i6 != 5) {
                                j$.time.h.j("Too many pattern letters: ", cCharAt);
                                return;
                            }
                            j(nVar, z ? TextStyle.NARROW_STANDALONE : TextStyle.NARROW);
                        }
                    }
                } else if (cCharAt == 'z') {
                    if (i6 > 4) {
                        j$.time.h.j("Too many pattern letters: ", cCharAt);
                        return;
                    } else if (i6 == 4) {
                        c(new t(TextStyle.FULL, false));
                    } else {
                        c(new t(TextStyle.SHORT, false));
                    }
                } else if (cCharAt == 'V') {
                    if (i6 != 2) {
                        j$.time.h.j("Pattern letter count must be 2: ", cCharAt);
                        return;
                    }
                    c(new s(j$.time.temporal.o.a, "ZoneId()"));
                } else if (cCharAt != 'v') {
                    String str2 = "+0000";
                    if (cCharAt == 'Z') {
                        if (i6 < 4) {
                            g("+HHMM", "+0000");
                        } else if (i6 == 4) {
                            f(TextStyle.FULL);
                        } else {
                            if (i6 != 5) {
                                j$.time.h.j("Too many pattern letters: ", cCharAt);
                                return;
                            }
                            g("+HH:MM:ss", "Z");
                        }
                    } else if (cCharAt == 'O') {
                        if (i6 == 1) {
                            f(TextStyle.SHORT);
                        } else {
                            if (i6 != 4) {
                                j$.time.h.j("Pattern letter count must be 1 or 4: ", cCharAt);
                                return;
                            }
                            f(TextStyle.FULL);
                        }
                    } else if (cCharAt == 'X') {
                        if (i6 > 5) {
                            j$.time.h.j("Too many pattern letters: ", cCharAt);
                            return;
                        }
                        g(j.d[i6 + (i6 == 1 ? 0 : 1)], "Z");
                    } else if (cCharAt == 'x') {
                        if (i6 > 5) {
                            j$.time.h.j("Too many pattern letters: ", cCharAt);
                            return;
                        }
                        if (i6 == 1) {
                            str2 = "+00";
                        } else if (i6 % 2 != 0) {
                            str2 = "+00:00";
                        }
                        g(j.d[i6 + (i6 == 1 ? 0 : 1)], str2);
                    } else if (cCharAt != 'W') {
                        int i9 = i6;
                        if (cCharAt == 'w') {
                            if (i9 > 2) {
                                j$.time.h.j("Too many pattern letters: ", cCharAt);
                                return;
                            }
                            k(new r(cCharAt, i9, i9, 2, 0));
                        } else if (cCharAt != 'Y') {
                            j$.time.h.j("Unknown pattern letter: ", cCharAt);
                            return;
                        } else if (i9 == 2) {
                            k(new r(cCharAt, i9, i9, 2, 0));
                        } else {
                            k(new r(cCharAt, i9, i9, 19, 0));
                        }
                    } else if (i6 > 1) {
                        j$.time.h.j("Too many pattern letters: ", cCharAt);
                        return;
                    } else {
                        int i10 = i6;
                        k(new r(cCharAt, i10, i10, i10, 0));
                    }
                } else if (i6 == 1) {
                    c(new t(TextStyle.SHORT, true));
                } else {
                    if (i6 != 4) {
                        j$.time.h.j("Wrong number of  pattern letters: ", cCharAt);
                        return;
                    }
                    c(new t(TextStyle.FULL, true));
                }
                i4 = i5 - 1;
            } else if (cCharAt == '\'') {
                int i11 = i4 + 1;
                int i12 = i11;
                while (i12 < str.length()) {
                    if (str.charAt(i12) == '\'') {
                        int i13 = i12 + 1;
                        if (i13 < str.length() && str.charAt(i13) == '\'') {
                            i12 = i13;
                        } else {
                            if (i12 < str.length()) {
                                throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                            }
                            strSubstring = str.substring(i11, i12);
                            if (strSubstring.isEmpty()) {
                                d('\'');
                            } else {
                                e(strSubstring.replace("''", "'"));
                            }
                            i4 = i12;
                        }
                    }
                    i12++;
                }
                if (i12 < str.length()) {
                    throw new IllegalArgumentException("Pattern ends with an incomplete string literal: ".concat(str));
                }
                strSubstring = str.substring(i11, i12);
                if (strSubstring.isEmpty()) {
                    d('\'');
                } else {
                    e(strSubstring.replace("''", "'"));
                }
                i4 = i12;
            } else if (cCharAt == '[') {
                p();
            } else if (cCharAt == ']') {
                if (this.a.b == null) {
                    throw new IllegalArgumentException("Pattern invalid as it contains ] without previous [");
                }
                o();
            } else {
                if (cCharAt == '{' || cCharAt == '}' || cCharAt == '#') {
                    throw new IllegalArgumentException("Pattern includes reserved character: '" + cCharAt + "'");
                }
                d(cCharAt);
            }
            i4++;
        }
    }

    public final void i(j$.time.temporal.a aVar, Map map) {
        Objects.requireNonNull(aVar, "field");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new q(aVar, textStyle, new a(new y(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void j(j$.time.temporal.n nVar, TextStyle textStyle) {
        Objects.requireNonNull(nVar, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        c(new q(nVar, textStyle, z.c));
    }

    public final void k(i iVar) {
        i iVarD;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0) {
            dateTimeFormatterBuilder.g = c(iVar);
            return;
        }
        i iVar2 = (i) ((ArrayList) dateTimeFormatterBuilder.c).get(i2);
        int i3 = iVar.b;
        int i4 = iVar.c;
        if (i3 == i4 && iVar.d == c0.NOT_NEGATIVE) {
            iVarD = iVar2.e(i4);
            c(iVar.d());
            this.a.g = i2;
        } else {
            iVarD = iVar2.d();
            this.a.g = c(iVar);
        }
        ((ArrayList) this.a.c).set(i2, iVarD);
    }

    public final void l(j$.time.temporal.n nVar) {
        k(new i(nVar, 1, 19, c0.NORMAL));
    }

    public final void m(j$.time.temporal.n nVar, int i2) {
        Objects.requireNonNull(nVar, "field");
        if (i2 < 1 || i2 > 19) {
            j$.time.h.h("The width must be from 1 to 19 inclusive but was ", i2);
        } else {
            k(new i(nVar, i2, i2, c0.NOT_NEGATIVE));
        }
    }

    public final void n(j$.time.temporal.n nVar, int i2, int i3, c0 c0Var) {
        if (i2 == i3 && c0Var == c0.NOT_NEGATIVE) {
            m(nVar, i3);
            return;
        }
        Objects.requireNonNull(nVar, "field");
        Objects.requireNonNull(c0Var, "signStyle");
        if (i2 < 1 || i2 > 19) {
            j$.time.h.h("The minimum width must be from 1 to 19 inclusive but was ", i2);
            return;
        }
        if (i3 < 1 || i3 > 19) {
            j$.time.h.h("The maximum width must be from 1 to 19 inclusive but was ", i3);
            return;
        }
        if (i3 >= i2) {
            k(new i(nVar, i2, i3, c0Var));
            return;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void o() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        int size = ((ArrayList) dateTimeFormatterBuilder.c).size();
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        if (size <= 0) {
            this.a = dateTimeFormatterBuilder2.b;
            return;
        }
        d dVar = new d(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
        this.a = this.a.b;
        c(dVar);
    }

    public final void p() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final DateTimeFormatter q(b0 b0Var, Chronology chronology) {
        return r(Locale.getDefault(), b0Var, chronology);
    }

    public final DateTimeFormatter r(Locale locale, b0 b0Var, Chronology chronology) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            o();
        }
        return new DateTimeFormatter(new d(this.c, false), locale, DecimalStyle.d, b0Var, chronology);
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }
}
