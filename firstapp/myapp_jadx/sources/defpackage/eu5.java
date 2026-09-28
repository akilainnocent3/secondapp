package defpackage;

import j$.time.DayOfWeek;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.chrono.Chronology;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.DateTimeParseException;
import j$.time.format.DecimalStyle;
import j$.time.format.FormatStyle;
import j$.time.format.TextStyle;
import j$.time.temporal.WeekFields;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.Pair;

/* JADX INFO: loaded from: classes.dex */
public final class eu5 extends du5 {
    public static final ZoneId e = ZoneId.of("UTC");
    public final int c;
    public final ArrayList d;

    public static final class a {
        public static DateTimeFormatter a(String str, Locale locale, LinkedHashMap linkedHashMap) {
            StringBuilder sbB = mq0.b("P:", str);
            sbB.append(locale.toLanguageTag());
            String string = sbB.toString();
            Object objWithDecimalStyle = linkedHashMap.get(string);
            if (objWithDecimalStyle == null) {
                objWithDecimalStyle = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
                linkedHashMap.put(string, objWithDecimalStyle);
            }
            objWithDecimalStyle.getClass();
            return (DateTimeFormatter) objWithDecimalStyle;
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ uag a = om2.a(DayOfWeek.values());
    }

    public eu5(Locale locale) {
        super(locale);
        this.c = WeekFields.of(locale).getFirstDayOfWeek().getValue();
        uag uagVar = b.a;
        ArrayList arrayList = new ArrayList(uagVar.b());
        int iB = uagVar.b();
        for (int i = 0; i < iB; i++) {
            DayOfWeek dayOfWeek = (DayOfWeek) uagVar.get(i);
            arrayList.add(new Pair(dayOfWeek.getDisplayName(TextStyle.FULL_STANDALONE, locale), dayOfWeek.getDisplayName(TextStyle.NARROW_STANDALONE, locale)));
        }
        this.d = arrayList;
    }

    @Override // defpackage.du5
    public final String a(long j, String str, Locale locale) {
        return Instant.ofEpochMilli(j).atZone(e).m().format(a.a(str, locale, this.b));
    }

    @Override // defpackage.du5
    public final xt5 b(long j) {
        LocalDate localDateM = Instant.ofEpochMilli(j).atZone(e).m();
        return new xt5(localDateM.getYear(), localDateM.getMonthValue(), localDateM.getDayOfMonth(), 1000 * localDateM.atStartOfDay().toEpochSecond(ZoneOffset.UTC));
    }

    @Override // defpackage.du5
    public final jsc c(Locale locale) {
        return gu5.a(DateTimeFormatterBuilder.getLocalizedDateTimePattern(FormatStyle.SHORT, null, Chronology.ofLocale(locale), locale));
    }

    @Override // defpackage.du5
    public final int d() {
        return this.c;
    }

    @Override // defpackage.du5
    public final iu5 e(int i, int i2) {
        return l(LocalDate.of(i, i2, 1));
    }

    @Override // defpackage.du5
    public final iu5 f(long j) {
        return l(Instant.ofEpochMilli(j).atZone(e).withDayOfMonth(1).m());
    }

    @Override // defpackage.du5
    public final iu5 g(xt5 xt5Var) {
        return l(LocalDate.of(xt5Var.a, xt5Var.b, 1));
    }

    @Override // defpackage.du5
    public final xt5 h() {
        LocalDate localDateNow = LocalDate.now();
        return new xt5(localDateNow.getYear(), localDateNow.getMonthValue(), localDateNow.getDayOfMonth(), localDateNow.M(LocalTime.MIDNIGHT).H(e).toInstant().toEpochMilli());
    }

    @Override // defpackage.du5
    public final List<Pair<String, String>> i() {
        return this.d;
    }

    @Override // defpackage.du5
    public final xt5 j(String str, String str2, Locale locale) {
        try {
            LocalDate localDate = LocalDate.parse(str, a.a(str2, locale, this.b));
            return new xt5(localDate.getYear(), localDate.getMonth().getValue(), localDate.getDayOfMonth(), localDate.M(LocalTime.MIDNIGHT).H(e).toInstant().toEpochMilli());
        } catch (DateTimeParseException unused) {
            return null;
        }
    }

    @Override // defpackage.du5
    public final iu5 k(iu5 iu5Var, int i) {
        return i <= 0 ? iu5Var : l(Instant.ofEpochMilli(iu5Var.e).atZone(e).m().plusMonths(i));
    }

    public final iu5 l(LocalDate localDate) {
        int value = localDate.getDayOfWeek().getValue() - this.c;
        if (value < 0) {
            value += 7;
        }
        return new iu5(localDate.getYear(), localDate.getMonthValue(), localDate.lengthOfMonth(), value, localDate.M(LocalTime.MIDNIGHT).H(e).toInstant().toEpochMilli());
    }

    public final String toString() {
        return "CalendarModel";
    }
}
