package com.google.android.material.timepicker;

import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Nullable;
import java.util.Arrays;
import k.b1;
import k.e0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes5.dex */
class TimeModel implements Parcelable {
    public static final Parcelable.Creator<TimeModel> CREATOR = new a();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final String f51859i = "%02d";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final String f51860j = "%d";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f51861b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final f f51862c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f51863d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f51864e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f51865f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f51866g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f51867h;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements Parcelable.Creator<TimeModel> {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TimeModel createFromParcel(Parcel parcel) {
            return new TimeModel(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public TimeModel[] newArray(int i10) {
            return new TimeModel[i10];
        }
    }

    public TimeModel() {
        this(0);
    }

    @Nullable
    public static String a(Resources resources, CharSequence charSequence) {
        return b(resources, charSequence, f51859i);
    }

    @Nullable
    public static String b(Resources resources, CharSequence charSequence, String str) {
        try {
            return String.format(resources.getConfiguration().locale, str, Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static int g(int i10) {
        return i10 >= 12 ? 1 : 0;
    }

    @b1
    public int c() {
        return this.f51863d == 1 ? ih.a.m.f92610t0 : ih.a.m.f92616v0;
    }

    public int d() {
        if (this.f51863d == 1) {
            return this.f51864e % 24;
        }
        int i10 = this.f51864e;
        if (i10 % 12 == 0) {
            return 12;
        }
        return this.f51867h == 1 ? i10 - 12 : i10;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public f e() {
        return this.f51862c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TimeModel)) {
            return false;
        }
        TimeModel timeModel = (TimeModel) obj;
        return this.f51864e == timeModel.f51864e && this.f51865f == timeModel.f51865f && this.f51863d == timeModel.f51863d && this.f51866g == timeModel.f51866g;
    }

    public f f() {
        return this.f51861b;
    }

    public void h(int i10) {
        if (this.f51863d == 1) {
            this.f51864e = i10;
        } else {
            this.f51864e = (i10 % 12) + (this.f51867h != 1 ? 0 : 12);
        }
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.f51863d), Integer.valueOf(this.f51864e), Integer.valueOf(this.f51865f), Integer.valueOf(this.f51866g)});
    }

    public void j(int i10) {
        this.f51867h = g(i10);
        this.f51864e = i10;
    }

    public void k(@e0(from = 0, to = 59) int i10) {
        this.f51865f = i10 % 60;
    }

    public void l(int i10) {
        if (i10 != this.f51867h) {
            this.f51867h = i10;
            int i11 = this.f51864e;
            if (i11 < 12 && i10 == 1) {
                this.f51864e = i11 + 12;
            } else {
                if (i11 < 12 || i10 != 0) {
                    return;
                }
                this.f51864e = i11 - 12;
            }
        }
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f51864e);
        parcel.writeInt(this.f51865f);
        parcel.writeInt(this.f51866g);
        parcel.writeInt(this.f51863d);
    }

    public TimeModel(int i10) {
        this(0, 0, 10, i10);
    }

    public TimeModel(int i10, int i11, int i12, int i13) {
        this.f51864e = i10;
        this.f51865f = i11;
        this.f51866g = i12;
        this.f51863d = i13;
        this.f51867h = g(i10);
        this.f51861b = new f(59);
        this.f51862c = new f(i13 == 1 ? 23 : 12);
    }

    public TimeModel(Parcel parcel) {
        this(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt());
    }
}
