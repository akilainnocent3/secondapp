package io.appmetrica.analytics.billinginterface.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public class Period {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final Pattern f95119a = Pattern.compile("P(\\d+)(\\S+)");
    public final int number;

    @NonNull
    public final TimeUnit timeUnit;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public enum TimeUnit {
        TIME_UNIT_UNKNOWN,
        DAY,
        WEEK,
        MONTH,
        YEAR
    }

    public Period(int i10, @NonNull TimeUnit timeUnit) {
        this.number = i10;
        this.timeUnit = timeUnit;
    }

    @Nullable
    public static Period parse(@NonNull String str) {
        TimeUnit timeUnit;
        Matcher matcher = f95119a.matcher(str);
        if (!matcher.find()) {
            return null;
        }
        String strGroup = matcher.group(1);
        String strGroup2 = matcher.group(2);
        if (strGroup == null || strGroup2 == null) {
            return null;
        }
        try {
            int i10 = Integer.parseInt(strGroup);
            char cCharAt = strGroup2.charAt(0);
            if (cCharAt == 'D') {
                timeUnit = TimeUnit.DAY;
            } else if (cCharAt == 'M') {
                timeUnit = TimeUnit.MONTH;
            } else if (cCharAt != 'W') {
                timeUnit = cCharAt != 'Y' ? TimeUnit.TIME_UNIT_UNKNOWN : TimeUnit.YEAR;
            } else {
                timeUnit = TimeUnit.WEEK;
            }
            return new Period(i10, timeUnit);
        } catch (Throwable unused) {
            return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Period period = (Period) obj;
        return this.number == period.number && this.timeUnit == period.timeUnit;
    }

    public int hashCode() {
        return this.timeUnit.hashCode() + (this.number * 31);
    }

    @NonNull
    public String toString() {
        return "Period{number=" + this.number + "timeUnit=" + this.timeUnit + "}";
    }
}
