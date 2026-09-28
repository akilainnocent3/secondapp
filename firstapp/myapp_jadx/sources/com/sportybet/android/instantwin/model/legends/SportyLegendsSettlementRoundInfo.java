package com.sportybet.android.instantwin.model.legends;

import android.os.Parcel;
import android.os.Parcelable;
import defpackage.dd3;
import defpackage.ng1;
import defpackage.ux5;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/model/legends/SportyLegendsSettlementRoundInfo;", "Landroid/os/Parcelable;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SportyLegendsSettlementRoundInfo implements Parcelable {
    public static final Parcelable.Creator<SportyLegendsSettlementRoundInfo> CREATOR = new a();
    public final String a;
    public final String b;
    public final BigDecimal c;
    public final SportyLegendsSettlementRoundInfoEvent d;
    public final List<SportyLegendsSettlementRoundInfoBetOdds> e;

    public static final class a implements Parcelable.Creator<SportyLegendsSettlementRoundInfo> {
        @Override // android.os.Parcelable.Creator
        public final SportyLegendsSettlementRoundInfo createFromParcel(Parcel parcel) {
            parcel.getClass();
            String string = parcel.readString();
            String string2 = parcel.readString();
            BigDecimal bigDecimal = (BigDecimal) parcel.readSerializable();
            SportyLegendsSettlementRoundInfoEvent sportyLegendsSettlementRoundInfoEventCreateFromParcel = SportyLegendsSettlementRoundInfoEvent.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(parcel.readParcelable(SportyLegendsSettlementRoundInfo.class.getClassLoader()));
            }
            return new SportyLegendsSettlementRoundInfo(string, string2, bigDecimal, sportyLegendsSettlementRoundInfoEventCreateFromParcel, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final SportyLegendsSettlementRoundInfo[] newArray(int i) {
            return new SportyLegendsSettlementRoundInfo[i];
        }
    }

    static {
        Parcelable.Creator<SportyLegendsSettlementRoundInfoEvent> creator = SportyLegendsSettlementRoundInfoEvent.CREATOR;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SportyLegendsSettlementRoundInfo(String str, String str2, BigDecimal bigDecimal, SportyLegendsSettlementRoundInfoEvent sportyLegendsSettlementRoundInfoEvent, List<? extends SportyLegendsSettlementRoundInfoBetOdds> list) {
        bigDecimal.getClass();
        sportyLegendsSettlementRoundInfoEvent.getClass();
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = bigDecimal;
        this.d = sportyLegendsSettlementRoundInfoEvent;
        this.e = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SportyLegendsSettlementRoundInfo)) {
            return false;
        }
        SportyLegendsSettlementRoundInfo sportyLegendsSettlementRoundInfo = (SportyLegendsSettlementRoundInfo) obj;
        return Intrinsics.g(this.a, sportyLegendsSettlementRoundInfo.a) && Intrinsics.g(this.b, sportyLegendsSettlementRoundInfo.b) && Intrinsics.g(this.c, sportyLegendsSettlementRoundInfo.c) && Intrinsics.g(this.d, sportyLegendsSettlementRoundInfo.d) && Intrinsics.g(this.e, sportyLegendsSettlementRoundInfo.e);
    }

    public final int hashCode() {
        String str = this.a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.e.hashCode() + ((this.d.hashCode() + dd3.a(this.c, (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31)) * 31);
    }

    public final String toString() {
        StringBuilder sbA = ux5.a("SportyLegendsSettlementRoundInfo(ticketId=", this.a, ", roundId=", this.b, ", totalReturn=");
        sbA.append(this.c);
        sbA.append(", eventItem=");
        sbA.append(this.d);
        sbA.append(", betOdds=");
        return ng1.a(sbA, this.e, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.a);
        parcel.writeString(this.b);
        parcel.writeSerializable(this.c);
        this.d.writeToParcel(parcel, i);
        List<SportyLegendsSettlementRoundInfoBetOdds> list = this.e;
        parcel.writeInt(list.size());
        Iterator<SportyLegendsSettlementRoundInfoBetOdds> it = list.iterator();
        while (it.hasNext()) {
            parcel.writeParcelable(it.next(), i);
        }
    }
}
