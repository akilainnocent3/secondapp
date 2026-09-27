package com.google.android.material.datepicker;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Calendar;
import java.util.GregorianCalendar;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
final class Month implements Comparable<Month>, Parcelable {
    public static final Parcelable.Creator<Month> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Calendar f50623b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f50624c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f50625d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f50626e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f50627f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final long f50628g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    public String f50629h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<Month> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Month createFromParcel(@NonNull Parcel parcel) {
            return Month.b(parcel.readInt(), parcel.readInt());
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public Month[] newArray(int i10) {
            return new Month[i10];
        }
    }

    public Month(@NonNull Calendar calendar) {
        calendar.set(5, 1);
        Calendar calendarF = c0.f(calendar);
        this.f50623b = calendarF;
        this.f50624c = calendarF.get(2);
        this.f50625d = calendarF.get(1);
        this.f50626e = calendarF.getMaximum(7);
        this.f50627f = calendarF.getActualMaximum(5);
        this.f50628g = calendarF.getTimeInMillis();
    }

    @NonNull
    public static Month b(int i10, int i11) {
        Calendar calendarX = c0.x();
        calendarX.set(1, i10);
        calendarX.set(2, i11);
        return new Month(calendarX);
    }

    @NonNull
    public static Month c(long j10) {
        Calendar calendarX = c0.x();
        calendarX.setTimeInMillis(j10);
        return new Month(calendarX);
    }

    @NonNull
    public static Month d() {
        return new Month(c0.v());
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public int compareTo(@NonNull Month month) {
        return this.f50623b.compareTo(month.f50623b);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e(int i10) {
        int i11 = this.f50623b.get(7);
        if (i10 <= 0) {
            i10 = this.f50623b.getFirstDayOfWeek();
        }
        int i12 = i11 - i10;
        return i12 < 0 ? i12 + this.f50626e : i12;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Month)) {
            return false;
        }
        Month month = (Month) obj;
        return this.f50624c == month.f50624c && this.f50625d == month.f50625d;
    }

    public long f(int i10) {
        Calendar calendarF = c0.f(this.f50623b);
        calendarF.set(5, i10);
        return calendarF.getTimeInMillis();
    }

    public int g(long j10) {
        Calendar calendarF = c0.f(this.f50623b);
        calendarF.setTimeInMillis(j10);
        return calendarF.get(5);
    }

    @NonNull
    public String h() {
        if (this.f50629h == null) {
            this.f50629h = j.l(this.f50623b.getTimeInMillis());
        }
        return this.f50629h;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f50624c), Integer.valueOf(this.f50625d)});
    }

    public long j() {
        return this.f50623b.getTimeInMillis();
    }

    @NonNull
    public Month k(int i10) {
        Calendar calendarF = c0.f(this.f50623b);
        calendarF.add(2, i10);
        return new Month(calendarF);
    }

    public int l(@NonNull Month month) {
        if (this.f50623b instanceof GregorianCalendar) {
            return ((month.f50625d - this.f50625d) * 12) + (month.f50624c - this.f50624c);
        }
        throw new IllegalArgumentException("Only Gregorian calendars are supported.");
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@NonNull Parcel parcel, int i10) {
        parcel.writeInt(this.f50625d);
        parcel.writeInt(this.f50624c);
    }
}
