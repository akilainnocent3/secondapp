package com.sportybet.android.multimaker.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.gmf0;
import defpackage.mq0;
import defpackage.mtg0;
import defpackage.uts;
import defpackage.vch0;
import defpackage.x45;
import defpackage.yvf;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/multimaker/domain/model/MultiMakerSport;", "Landroid/os/Parcelable;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class MultiMakerSport implements Parcelable {
    public static final Parcelable.Creator<MultiMakerSport> CREATOR = new a();
    public final String a;
    public final UiText b;
    public final String c;
    public final boolean d;
    public final boolean e;

    public static final class a implements Parcelable.Creator<MultiMakerSport> {
        @Override // android.os.Parcelable.Creator
        public final MultiMakerSport createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            UiText uiText = (UiText) parcel.readParcelable(MultiMakerSport.class.getClassLoader());
            String string2 = parcel.readString();
            boolean z = false;
            if (parcel.readInt() != 0) {
                z = true;
            }
            return new MultiMakerSport(uiText, string, string2, z, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final MultiMakerSport[] newArray(int i) {
            return new MultiMakerSport[i];
        }
    }

    public MultiMakerSport(String str, UiText uiText, String str2, boolean z, int i) {
        this((i & 2) != 0 ? vch0.a : uiText, (i & 1) != 0 ? "" : str, (i & 4) != 0 ? "" : str2, true, (i & 16) != 0 ? false : z);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiMakerSport)) {
            return false;
        }
        MultiMakerSport multiMakerSport = (MultiMakerSport) obj;
        return Intrinsics.g(this.a, multiMakerSport.a) && Intrinsics.g(this.b, multiMakerSport.b) && Intrinsics.g(this.c, multiMakerSport.c) && this.d == multiMakerSport.d && this.e == multiMakerSport.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + mtg0.a(gmf0.a(yvf.a(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sbA = x45.a(this.b, "MultiMakerSport(id=", this.a, ", nameUiText=", ", iconUrl=");
        uts.b(this.c, ", isEnabled=", ", isSelected=", sbA, this.d);
        return mq0.a(sbA, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        parcel.writeInt(this.d ? 1 : 0);
        parcel.writeInt(this.e ? 1 : 0);
    }

    public MultiMakerSport(UiText uiText, String str, String str2, boolean z, boolean z2) {
        str.getClass();
        uiText.getClass();
        str2.getClass();
        this.a = str;
        this.b = uiText;
        this.c = str2;
        this.d = z;
        this.e = z2;
    }

    public MultiMakerSport() {
        this((String) null, (UiText) null, (String) null, false, 31);
    }
}
