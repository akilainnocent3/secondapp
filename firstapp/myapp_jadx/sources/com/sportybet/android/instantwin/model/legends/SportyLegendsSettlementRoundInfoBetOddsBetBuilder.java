package com.sportybet.android.instantwin.model.legends;

import android.os.Parcel;
import android.os.Parcelable;
import com.sporty.android.common_ui.uitext.UiText;
import defpackage.gmf0;
import defpackage.nve;
import defpackage.p200;
import defpackage.tx5;
import defpackage.yvf;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/instantwin/model/legends/SportyLegendsSettlementRoundInfoBetOddsBetBuilder;", "Lcom/sportybet/android/instantwin/model/legends/SportyLegendsSettlementRoundInfoBetOdds;", "Landroid/os/Parcelable;", "Selection", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyLegendsSettlementRoundInfoBetOddsBetBuilder extends SportyLegendsSettlementRoundInfoBetOdds implements Parcelable {
    public static final Parcelable.Creator<SportyLegendsSettlementRoundInfoBetOddsBetBuilder> CREATOR = new a();
    public final boolean a;
    public final UiText b;
    public final String c;
    public final List<Selection> d;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/model/legends/SportyLegendsSettlementRoundInfoBetOddsBetBuilder$Selection;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Selection implements Parcelable {
        public static final Parcelable.Creator<Selection> CREATOR = new a();
        public final String a;
        public final String b;

        public static final class a implements Parcelable.Creator<Selection> {
            @Override // android.os.Parcelable.Creator
            public final Selection createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Selection(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Selection[] newArray(int i) {
                return new Selection[i];
            }
        }

        public Selection(String str, String str2) {
            str.getClass();
            str2.getClass();
            this.a = str;
            this.b = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Selection)) {
                return false;
            }
            Selection selection = (Selection) obj;
            return Intrinsics.g(this.a, selection.a) && Intrinsics.g(this.b, selection.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return tx5.a("Selection(betOutcomeDesc=", this.a, ", marketTitle=", this.b, ")");
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
        }
    }

    public static final class a implements Parcelable.Creator<SportyLegendsSettlementRoundInfoBetOddsBetBuilder> {
        @Override // android.os.Parcelable.Creator
        public final SportyLegendsSettlementRoundInfoBetOddsBetBuilder createFromParcel(Parcel parcel) {
            parcel.getClass();
            int iA = 0;
            boolean z = parcel.readInt() != 0;
            UiText uiText = (UiText) parcel.readParcelable(SportyLegendsSettlementRoundInfoBetOddsBetBuilder.class.getClassLoader());
            String string = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            while (iA != i) {
                iA = p200.a(Selection.CREATOR, parcel, arrayList, iA, 1);
            }
            return new SportyLegendsSettlementRoundInfoBetOddsBetBuilder(z, uiText, string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SportyLegendsSettlementRoundInfoBetOddsBetBuilder[] newArray(int i) {
            return new SportyLegendsSettlementRoundInfoBetOddsBetBuilder[i];
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SportyLegendsSettlementRoundInfoBetOddsBetBuilder(boolean z, UiText uiText, String str, List<Selection> list) {
        super(0);
        uiText.getClass();
        str.getClass();
        list.getClass();
        this.a = z;
        this.b = uiText;
        this.c = str;
        this.d = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportyLegendsSettlementRoundInfoBetOddsBetBuilder)) {
            return false;
        }
        SportyLegendsSettlementRoundInfoBetOddsBetBuilder sportyLegendsSettlementRoundInfoBetOddsBetBuilder = (SportyLegendsSettlementRoundInfoBetOddsBetBuilder) obj;
        return this.a == sportyLegendsSettlementRoundInfoBetOddsBetBuilder.a && Intrinsics.g(this.b, sportyLegendsSettlementRoundInfoBetOddsBetBuilder.b) && Intrinsics.g(this.c, sportyLegendsSettlementRoundInfoBetOddsBetBuilder.c) && Intrinsics.g(this.d, sportyLegendsSettlementRoundInfoBetOddsBetBuilder.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + gmf0.a(yvf.a(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SportyLegendsSettlementRoundInfoBetOddsBetBuilder(isHit=");
        sb.append(this.a);
        sb.append(", outcomeTitle=");
        sb.append(this.b);
        sb.append(", oddString=");
        return nve.a(this.c, ", selections=", ")", sb, this.d);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeInt(this.a ? 1 : 0);
        parcel.writeParcelable(this.b, i);
        parcel.writeString(this.c);
        List<Selection> list = this.d;
        parcel.writeInt(list.size());
        Iterator<Selection> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(parcel, i);
        }
    }
}
