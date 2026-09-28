package com.sporty.android.book.presentation.sportsmenu.time;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.l;
import com.appsflyer.internal.m;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportygames.crash.models.header.snc.OdQr;
import defpackage.bwf0;
import defpackage.f87;
import defpackage.gmf0;
import defpackage.tug;
import defpackage.ux5;
import defpackage.yt5;
import defpackage.zug;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\f\b\u0087\b\u0018\u0000 22\u00020\u0001:\u00013B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\u0015\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0000¢\u0006\u0004\b\u0012\u0010\u0013J\r\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0010\u0010!\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b#\u0010\"JB\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b&\u0010\u001eJ\u0010\u0010'\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b'\u0010\u0016J\u001a\u0010)\u001a\u00020\u000b2\b\u0010\u0011\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b)\u0010*R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010+\u001a\u0004\b,\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010+\u001a\u0004\b-\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010+\u001a\u0004\b.\u0010\u001eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010/\u001a\u0004\b0\u0010\"R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010/\u001a\u0004\b1\u0010\"¨\u00064"}, d2 = {"Lcom/sporty/android/book/presentation/sportsmenu/time/TimePickerItem;", "Landroid/os/Parcelable;", "", AnalyticsParam.EVENT_PARAM_ID, "name", "shortName", "", "startTime", "endTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)V", "", "isAll", "()Z", "isToday", "isTimeRange", "isDateRange", "other", "isSameAs", "(Lcom/sporty/android/book/presentation/sportsmenu/time/TimePickerItem;)Z", "", "describeContents", "()I", "Landroid/os/Parcel;", "dest", "flags", "", "writeToParcel", "(Landroid/os/Parcel;I)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "()J", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJ)Lcom/sporty/android/book/presentation/sportsmenu/time/TimePickerItem;", "toString", "hashCode", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getName", "getShortName", "J", "getStartTime", "getEndTime", "Companion", "a", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class TimePickerItem implements Parcelable {
    public static final int $stable = 8;
    private final long endTime;
    private final String id;
    private final String name;
    private final String shortName;
    private final long startTime;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public static final Parcelable.Creator<TimePickerItem> CREATOR = new b();

    /* JADX INFO: renamed from: com.sporty.android.book.presentation.sportsmenu.time.TimePickerItem$a, reason: from kotlin metadata */
    public static final class Companion {
        public static TimePickerItem a(long j) {
            return new TimePickerItem("custom", "Custom", null, j, j, 4, null);
        }

        public static TimePickerItem b(Calendar calendar, Calendar calendar2) {
            calendar.getClass();
            calendar2.getClass();
            Date time = calendar.getTime();
            time.getClass();
            Locale locale = Locale.getDefault();
            locale.getClass();
            String strL = bwf0.l(time, "dd/MM/yy", locale, 0, 0);
            Date time2 = calendar2.getTime();
            time2.getClass();
            Locale locale2 = Locale.getDefault();
            locale2.getClass();
            String strA = tug.a(strL, "~\n", bwf0.l(time2, "dd/MM/yy", locale2, 0, 0));
            yt5.e(calendar);
            long timeInMillis = calendar.getTimeInMillis();
            yt5.e(calendar2);
            return new TimePickerItem("date_range", strA, null, timeInMillis, calendar2.getTimeInMillis() + 86399999, 4, null);
        }
    }

    public static final class b implements Parcelable.Creator<TimePickerItem> {
        @Override // android.os.Parcelable.Creator
        public final TimePickerItem createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new TimePickerItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readLong(), parcel.readLong());
        }

        @Override // android.os.Parcelable.Creator
        public final TimePickerItem[] newArray(int i) {
            return new TimePickerItem[i];
        }
    }

    public TimePickerItem(String str, String str2, String str3, long j, long j2) {
        m.a(str, str2, str3);
        this.id = str;
        this.name = str2;
        this.shortName = str3;
        this.startTime = j;
        this.endTime = j2;
    }

    public static /* synthetic */ TimePickerItem copy$default(TimePickerItem timePickerItem, String str, String str2, String str3, long j, long j2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = timePickerItem.id;
        }
        if ((i & 2) != 0) {
            str2 = timePickerItem.name;
        }
        if ((i & 4) != 0) {
            str3 = timePickerItem.shortName;
        }
        if ((i & 8) != 0) {
            j = timePickerItem.startTime;
        }
        if ((i & 16) != 0) {
            j2 = timePickerItem.endTime;
        }
        long j3 = j2;
        String str4 = str3;
        return timePickerItem.copy(str, str2, str4, j, j3);
    }

    private final boolean isAll() {
        if (Intrinsics.g(this.id, "all")) {
            return true;
        }
        return Intrinsics.g(this.id, "custom") && this.startTime == 0;
    }

    private final boolean isToday() {
        if (Intrinsics.g(this.id, "today")) {
            return true;
        }
        return Intrinsics.g(this.id, "custom") && this.startTime == -1;
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getShortName() {
        return this.shortName;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final long getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final long getEndTime() {
        return this.endTime;
    }

    public final TimePickerItem copy(String id, String name, String shortName, long startTime, long endTime) {
        id.getClass();
        name.getClass();
        shortName.getClass();
        return new TimePickerItem(id, name, shortName, startTime, endTime);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimePickerItem)) {
            return false;
        }
        TimePickerItem timePickerItem = (TimePickerItem) other;
        return Intrinsics.g(this.id, timePickerItem.id) && Intrinsics.g(this.name, timePickerItem.name) && Intrinsics.g(this.shortName, timePickerItem.shortName) && this.startTime == timePickerItem.startTime && this.endTime == timePickerItem.endTime;
    }

    public final long getEndTime() {
        return this.endTime;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getShortName() {
        return this.shortName;
    }

    public final long getStartTime() {
        return this.startTime;
    }

    public int hashCode() {
        return Long.hashCode(this.endTime) + f87.a(gmf0.a(gmf0.a(this.id.hashCode() * 31, 31, this.name), 31, this.shortName), this.startTime, 31);
    }

    public final boolean isSameAs(TimePickerItem other) {
        other.getClass();
        if (!Intrinsics.g(this.id, "custom") && !Intrinsics.g(other.id, "custom")) {
            return Intrinsics.g(this.id, other.id);
        }
        if (isAll() && other.isAll()) {
            return true;
        }
        return (isToday() && other.isToday()) || this.startTime == other.startTime;
    }

    public final boolean isTimeRange() {
        return Intrinsics.g(this.id, "custom") && this.startTime > 0;
    }

    public String toString() {
        String str = this.id;
        String str2 = this.name;
        String str3 = this.shortName;
        long j = this.startTime;
        long j2 = this.endTime;
        StringBuilder sbA = ux5.a("TimePickerItem(id=", str, ", name=", str2, ", shortName=");
        l.a(j, str3, ", startTime=", sbA);
        return zug.a(j2, ", endTime=", ")", sbA);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.id);
        dest.writeString(this.name);
        dest.writeString(this.shortName);
        dest.writeLong(this.startTime);
        dest.writeLong(this.endTime);
    }

    public final boolean isDateRange() {
        return Intrinsics.g(this.id, OdQr.jKZoaL);
    }

    public /* synthetic */ TimePickerItem(String str, String str2, String str3, long j, long j2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? str2 : str3, j, j2);
    }
}
