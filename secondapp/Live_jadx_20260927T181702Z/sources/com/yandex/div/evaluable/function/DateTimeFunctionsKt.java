package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.types.DateTime;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.internal.m0;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DateTimeFunctionsKt {
    @l
    public static final Calendar toCalendar(@l DateTime dateTime) {
        m0.p(dateTime, "<this>");
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(dateTime.getTimezone$div_evaluable());
        calendar.setTimeInMillis(dateTime.getTimestampMillis$div_evaluable());
        m0.o(calendar, "calendar");
        return calendar;
    }

    @l
    public static final Date toDate(@l DateTime dateTime) {
        m0.p(dateTime, "<this>");
        return new Date(dateTime.getTimestampMillis$div_evaluable() - ((long) dateTime.getTimezone$div_evaluable().getRawOffset()));
    }
}
