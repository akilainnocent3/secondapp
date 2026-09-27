package com.google.android.material.datepicker;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.Arrays;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
public final class CalendarConstraints implements Parcelable {
    public static final Parcelable.Creator<CalendarConstraints> CREATOR = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NonNull
    public final Month f50597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NonNull
    public final Month f50598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NonNull
    public final DateValidator f50599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    public Month f50600e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f50601f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f50602g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f50603h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface DateValidator extends Parcelable {
        boolean i(long j10);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<CalendarConstraints> {
        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints createFromParcel(@NonNull Parcel parcel) {
            return new CalendarConstraints((Month) parcel.readParcelable(Month.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), (DateValidator) parcel.readParcelable(DateValidator.class.getClassLoader()), (Month) parcel.readParcelable(Month.class.getClassLoader()), parcel.readInt(), null);
        }

        @Override // android.os.Parcelable.Creator
        @NonNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public CalendarConstraints[] newArray(int i10) {
            return new CalendarConstraints[i10];
        }
    }

    public /* synthetic */ CalendarConstraints(Month month, Month month2, DateValidator dateValidator, Month month3, int i10, a aVar) {
        this(month, month2, dateValidator, month3, i10);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CalendarConstraints)) {
            return false;
        }
        CalendarConstraints calendarConstraints = (CalendarConstraints) obj;
        return this.f50597b.equals(calendarConstraints.f50597b) && this.f50598c.equals(calendarConstraints.f50598c) && e2.s.a(this.f50600e, calendarConstraints.f50600e) && this.f50601f == calendarConstraints.f50601f && this.f50599d.equals(calendarConstraints.f50599d);
    }

    public Month f(Month month) {
        if (month.compareTo(this.f50597b) < 0) {
            return this.f50597b;
        }
        return month.compareTo(this.f50598c) > 0 ? this.f50598c : month;
    }

    public DateValidator g() {
        return this.f50599d;
    }

    @NonNull
    public Month h() {
        return this.f50598c;
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{this.f50597b, this.f50598c, this.f50600e, Integer.valueOf(this.f50601f), this.f50599d});
    }

    public long j() {
        return this.f50598c.f50628g;
    }

    public int k() {
        return this.f50601f;
    }

    public int l() {
        return this.f50603h;
    }

    @Nullable
    public Month m() {
        return this.f50600e;
    }

    @Nullable
    public Long n() {
        Month month = this.f50600e;
        if (month == null) {
            return null;
        }
        return Long.valueOf(month.f50628g);
    }

    @NonNull
    public Month o() {
        return this.f50597b;
    }

    public long p() {
        return this.f50597b.f50628g;
    }

    public int q() {
        return this.f50602g;
    }

    public boolean r(long j10) {
        if (this.f50597b.f(1) > j10) {
            return false;
        }
        Month month = this.f50598c;
        return j10 <= month.f(month.f50627f);
    }

    public void s(@Nullable Month month) {
        this.f50600e = month;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeParcelable(this.f50597b, 0);
        parcel.writeParcelable(this.f50598c, 0);
        parcel.writeParcelable(this.f50600e, 0);
        parcel.writeParcelable(this.f50599d, 0);
        parcel.writeInt(this.f50601f);
    }

    public CalendarConstraints(@NonNull Month month, @NonNull Month month2, @NonNull DateValidator dateValidator, @Nullable Month month3, int i10) {
        Objects.requireNonNull(month, "start cannot be null");
        Objects.requireNonNull(month2, "end cannot be null");
        Objects.requireNonNull(dateValidator, "validator cannot be null");
        this.f50597b = month;
        this.f50598c = month2;
        this.f50600e = month3;
        this.f50601f = i10;
        this.f50599d = dateValidator;
        if (month3 != null && month.compareTo(month3) > 0) {
            throw new IllegalArgumentException("start Month cannot be after current Month");
        }
        if (month3 != null && month3.compareTo(month2) > 0) {
            throw new IllegalArgumentException("current Month cannot be after end Month");
        }
        if (i10 < 0 || i10 > c0.x().getMaximum(7)) {
            throw new IllegalArgumentException("firstDayOfWeek is not valid");
        }
        this.f50603h = month.l(month2) + 1;
        this.f50602g = (month2.f50625d - month.f50625d) + 1;
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f50604f = c0.a(Month.b(1900, 0).f50628g);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f50605g = c0.a(Month.b(2100, 11).f50628g);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final String f50606h = "DEEP_COPY_VALIDATOR_KEY";

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public long f50607a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f50608b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f50609c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f50610d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public DateValidator f50611e;

        public b() {
            this.f50607a = f50604f;
            this.f50608b = f50605g;
            this.f50611e = DateValidatorPointForward.a(Long.MIN_VALUE);
        }

        @NonNull
        public CalendarConstraints a() {
            Bundle bundle = new Bundle();
            bundle.putParcelable(f50606h, this.f50611e);
            Month monthC = Month.c(this.f50607a);
            Month monthC2 = Month.c(this.f50608b);
            DateValidator dateValidator = (DateValidator) bundle.getParcelable(f50606h);
            Long l10 = this.f50609c;
            return new CalendarConstraints(monthC, monthC2, dateValidator, l10 == null ? null : Month.c(l10.longValue()), this.f50610d, null);
        }

        @NonNull
        @qj.a
        public b b(long j10) {
            this.f50608b = j10;
            return this;
        }

        @NonNull
        @qj.a
        public b c(int i10) {
            this.f50610d = i10;
            return this;
        }

        @NonNull
        @qj.a
        public b d(long j10) {
            this.f50609c = Long.valueOf(j10);
            return this;
        }

        @NonNull
        @qj.a
        public b e(long j10) {
            this.f50607a = j10;
            return this;
        }

        @NonNull
        @qj.a
        public b f(@NonNull DateValidator dateValidator) {
            Objects.requireNonNull(dateValidator, "validator cannot be null");
            this.f50611e = dateValidator;
            return this;
        }

        public b(@NonNull CalendarConstraints calendarConstraints) {
            this.f50607a = f50604f;
            this.f50608b = f50605g;
            this.f50611e = DateValidatorPointForward.a(Long.MIN_VALUE);
            this.f50607a = calendarConstraints.f50597b.f50628g;
            this.f50608b = calendarConstraints.f50598c.f50628g;
            this.f50609c = Long.valueOf(calendarConstraints.f50600e.f50628g);
            this.f50610d = calendarConstraints.f50601f;
            this.f50611e = calendarConstraints.f50599d;
        }
    }
}
