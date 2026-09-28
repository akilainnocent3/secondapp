package com.sportybet.android.instantwin.router.sportylegends;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.mtg0;
import defpackage.plf;
import defpackage.z620;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/router/sportylegends/SportyLegendsInput;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyLegendsInput implements Parcelable {
    public static final Parcelable.Creator<SportyLegendsInput> CREATOR = new a();
    public final String a;
    public final boolean b;
    public final UiText c;

    public static final class a implements Parcelable.Creator<SportyLegendsInput> {
        @Override // android.os.Parcelable.Creator
        public final SportyLegendsInput createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new SportyLegendsInput((UiText) parcel.readParcelable(SportyLegendsInput.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SportyLegendsInput[] newArray(int i) {
            return new SportyLegendsInput[i];
        }
    }

    public SportyLegendsInput(UiText uiText, String str, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = uiText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportyLegendsInput)) {
            return false;
        }
        SportyLegendsInput sportyLegendsInput = (SportyLegendsInput) obj;
        return Intrinsics.g(this.a, sportyLegendsInput.a) && this.b == sportyLegendsInput.b && Intrinsics.g(this.c, sportyLegendsInput.c);
    }

    public final int hashCode() {
        int iA = mtg0.a(this.a.hashCode() * 31, 31, this.b);
        UiText uiText = this.c;
        return iA + (uiText == null ? 0 : uiText.hashCode());
    }

    public final String toString() {
        return plf.a(z620.a("SportyLegendsInput(sportId=", this.a, ", isBetBuilderMode=", ", snackbarUiText=", this.b), this.c, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeInt(this.b ? 1 : 0);
        parcel.writeParcelable(this.c, i);
    }
}
