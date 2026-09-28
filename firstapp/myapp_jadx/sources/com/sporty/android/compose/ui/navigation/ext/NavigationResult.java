package com.sporty.android.compose.ui.navigation.ext;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.gk50;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/sporty/android/compose/ui/navigation/ext/NavigationResult;", "Landroid/os/Parcelable;", "T", "compose-ui"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class NavigationResult<T extends Parcelable> implements Parcelable {
    public static final Parcelable.Creator<NavigationResult<?>> CREATOR = new a();
    public final gk50 a;
    public final String b;
    public final T c;

    public static final class a implements Parcelable.Creator<NavigationResult<?>> {
        @Override // android.os.Parcelable.Creator
        public final NavigationResult<?> createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new NavigationResult<>(gk50.valueOf(parcel.readString()), parcel.readString(), parcel.readParcelable(NavigationResult.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final NavigationResult<?>[] newArray(int i) {
            return new NavigationResult[i];
        }
    }

    public NavigationResult(gk50 gk50Var, String str, T t) {
        this.a = gk50Var;
        this.b = str;
        this.c = t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a.name());
        parcel.writeString(this.b);
        parcel.writeParcelable(this.c, i);
    }
}
