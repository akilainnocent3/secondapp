package com.google.android.material.datepicker;

import androidx.annotation.Nullable;
import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final w f50817c = new w(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Nullable
    public final Long f50818a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    public final TimeZone f50819b;

    public w(@Nullable Long l10, @Nullable TimeZone timeZone) {
        this.f50818a = l10;
        this.f50819b = timeZone;
    }

    public static w a(long j10) {
        return new w(Long.valueOf(j10), null);
    }

    public static w b(long j10, @Nullable TimeZone timeZone) {
        return new w(Long.valueOf(j10), timeZone);
    }

    public static w e() {
        return f50817c;
    }

    public Calendar c() {
        return d(this.f50819b);
    }

    public Calendar d(@Nullable TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f50818a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
