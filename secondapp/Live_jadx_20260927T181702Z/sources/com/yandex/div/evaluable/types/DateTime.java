package com.yandex.div.evaluable.types;

import cv.p0;
import dr.i0;
import dr.k0;
import f0.p;
import java.util.Calendar;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.x;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class DateTime implements Comparable<DateTime> {

    @l
    public static final Companion Companion = new Companion(null);

    @l
    private static final SimpleTimeZone utcTimezone = new SimpleTimeZone(0, "UTC");

    @l
    private final i0 calendar$delegate;
    private final long timestampMillis;
    private final long timestampUtc;

    @l
    private final TimeZone timezone;
    private final int timezoneMinutes;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class Companion {
        public /* synthetic */ Companion(x xVar) {
            this();
        }

        @l
        public final String formatDate$div_evaluable(@l Calendar c10) {
            m0.p(c10, "c");
            return String.valueOf(c10.get(1)) + '-' + p0.m4(String.valueOf(c10.get(2) + 1), 2, '0') + '-' + p0.m4(String.valueOf(c10.get(5)), 2, '0') + ' ' + p0.m4(String.valueOf(c10.get(11)), 2, '0') + ':' + p0.m4(String.valueOf(c10.get(12)), 2, '0') + ':' + p0.m4(String.valueOf(c10.get(13)), 2, '0');
        }

        private Companion() {
        }
    }

    public DateTime(long j10, @l TimeZone timezone) {
        m0.p(timezone, "timezone");
        this.timestampMillis = j10;
        this.timezone = timezone;
        this.calendar$delegate = k0.a(dr.m0.NONE, new DateTime$calendar$2(this));
        int rawOffset = timezone.getRawOffset() / 60;
        this.timezoneMinutes = rawOffset;
        this.timestampUtc = j10 - ((long) (rawOffset * 60000));
    }

    private final Calendar getCalendar() {
        return (Calendar) this.calendar$delegate.getValue();
    }

    public boolean equals(@m Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof DateTime) && this.timestampUtc == ((DateTime) obj).timestampUtc;
    }

    public final long getTimestampMillis$div_evaluable() {
        return this.timestampMillis;
    }

    @l
    public final TimeZone getTimezone$div_evaluable() {
        return this.timezone;
    }

    public final int getTimezoneMinutes$div_evaluable() {
        return this.timezoneMinutes;
    }

    public int hashCode() {
        return p.a(this.timestampUtc);
    }

    @l
    public String toString() {
        Companion companion = Companion;
        Calendar calendar = getCalendar();
        m0.o(calendar, "calendar");
        return companion.formatDate$div_evaluable(calendar);
    }

    @Override // java.lang.Comparable
    public int compareTo(@l DateTime other) {
        m0.p(other, "other");
        return m0.u(this.timestampUtc, other.timestampUtc);
    }
}
