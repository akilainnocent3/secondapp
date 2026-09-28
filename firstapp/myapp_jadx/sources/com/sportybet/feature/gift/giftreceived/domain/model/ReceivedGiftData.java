package com.sportybet.feature.gift.giftreceived.domain.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.transition.nfj.CaBJCMnsV;
import com.sportybet.core.domain.model.ApplicableCategoryIds;
import defpackage.awk;
import defpackage.gmf0;
import defpackage.l25;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sportybet/feature/gift/giftreceived/domain/model/ReceivedGiftData;", "Landroid/os/Parcelable;", "General", "Boost", "Lcom/sportybet/feature/gift/giftreceived/domain/model/ReceivedGiftData$Boost;", "Lcom/sportybet/feature/gift/giftreceived/domain/model/ReceivedGiftData$General;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
public interface ReceivedGiftData extends Parcelable {

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/gift/giftreceived/domain/model/ReceivedGiftData$General;", "Lcom/sportybet/feature/gift/giftreceived/domain/model/ReceivedGiftData;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class General implements ReceivedGiftData {
        public static final Parcelable.Creator<General> CREATOR = new a();
        public final String a;
        public final String b;
        public final awk c;
        public final List<? extends Integer> d;

        public static final class a implements Parcelable.Creator<General> {
            @Override // android.os.Parcelable.Creator
            public final General createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new General(parcel.readString(), parcel.readString(), awk.valueOf(parcel.readString()), ((ApplicableCategoryIds) parcel.readParcelable(General.class.getClassLoader())).a);
            }

            @Override // android.os.Parcelable.Creator
            public final General[] newArray(int i) {
                return new General[i];
            }
        }

        public General(String str, String str2, awk awkVar, List<? extends Integer> list) {
            str.getClass();
            str2.getClass();
            awkVar.getClass();
            list.getClass();
            this.a = str;
            this.b = str2;
            this.c = awkVar;
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
            if (!(obj instanceof General)) {
                return false;
            }
            General general = (General) obj;
            if (!Intrinsics.g(this.a, general.a) || !Intrinsics.g(this.b, general.b) || this.c != general.c) {
                return false;
            }
            List<? extends Integer> list = general.d;
            Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
            return Intrinsics.g(this.d, list);
        }

        public final int hashCode() {
            int iHashCode = (this.c.hashCode() + gmf0.a(this.a.hashCode() * 31, 31, this.b)) * 31;
            Parcelable.Creator<ApplicableCategoryIds> creator = ApplicableCategoryIds.CREATOR;
            return this.d.hashCode() + iHashCode;
        }

        public final String toString() {
            String strE = ApplicableCategoryIds.e(this.d);
            StringBuilder sbA = ux5.a("General(currencyCode=", this.a, ", amount=", this.b, ", giftType=");
            sbA.append(this.c);
            sbA.append(", applicableCategoryIds=");
            sbA.append(strE);
            sbA.append(")");
            return sbA.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b);
            parcel.writeString(this.c.name());
            parcel.writeParcelable(new ApplicableCategoryIds(this.d), i);
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/feature/gift/giftreceived/domain/model/ReceivedGiftData$Boost;", "Lcom/sportybet/feature/gift/giftreceived/domain/model/ReceivedGiftData;", "gift"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class Boost implements ReceivedGiftData {
        public static final Parcelable.Creator<Boost> CREATOR = new a();
        public final String a;
        public final l25 b;

        /* JADX INFO: loaded from: classes6.dex */
        public static final class a implements Parcelable.Creator<Boost> {
            @Override // android.os.Parcelable.Creator
            public final Boost createFromParcel(Parcel parcel) {
                parcel.getClass();
                return new Boost(parcel.readString(), l25.valueOf(parcel.readString()));
            }

            @Override // android.os.Parcelable.Creator
            public final Boost[] newArray(int i) {
                return new Boost[i];
            }
        }

        public Boost(String str, l25 l25Var) {
            str.getClass();
            l25Var.getClass();
            this.a = str;
            this.b = l25Var;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Boost)) {
                return false;
            }
            Boost boost = (Boost) obj;
            return Intrinsics.g(this.a, boost.a) && this.b == boost.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "Boost(text=" + this.a + ", boostGiftType=" + this.b + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.a);
            parcel.writeString(this.b.name());
        }

        public Boost() {
            this(CaBJCMnsV.Zfuvv, l25.Unknown);
        }
    }
}
