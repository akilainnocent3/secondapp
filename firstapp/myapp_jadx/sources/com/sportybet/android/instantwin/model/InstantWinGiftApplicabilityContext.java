package com.sportybet.android.instantwin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.sportybet.plugin.realsports.data.BetOrderType;
import defpackage.lng;
import defpackage.mtg0;
import defpackage.n36;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext;", "Landroid/os/Parcelable;", "BetSlipType", "BetCount", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class InstantWinGiftApplicabilityContext implements Parcelable {
    public static final Parcelable.Creator<InstantWinGiftApplicabilityContext> CREATOR = new a();
    public final BetSlipType a;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005Ê\u0001\u0002\b\u0007¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetCount;", "Landroid/os/Parcelable;", "Single", BetOrderType.MULTIPLE, "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetCount$Multiple;", "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetCount$Single;", "instantWin", "Lkotlinx/parcelize/Parcelize;"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface BetCount extends Parcelable {

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetCount$Multiple;", "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetCount;", "<init>", "()V", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Multiple implements BetCount {
            public static final Multiple a = new Multiple();
            public static final Parcelable.Creator<Multiple> CREATOR = new a();

            public static final class a implements Parcelable.Creator<Multiple> {
                @Override // android.os.Parcelable.Creator
                public final Multiple createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    parcel.readInt();
                    return Multiple.a;
                }

                @Override // android.os.Parcelable.Creator
                public final Multiple[] newArray(int i) {
                    return new Multiple[i];
                }
            }

            private Multiple() {
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Multiple);
            }

            public final int hashCode() {
                return 1183104305;
            }

            public final String toString() {
                return BetOrderType.MULTIPLE;
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(1);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetCount$Single;", "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetCount;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Single implements BetCount {
            public static final Parcelable.Creator<Single> CREATOR = new a();
            public final int a;
            public final int b;

            public static final class a implements Parcelable.Creator<Single> {
                @Override // android.os.Parcelable.Creator
                public final Single createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Single(parcel.readInt(), parcel.readInt());
                }

                @Override // android.os.Parcelable.Creator
                public final Single[] newArray(int i) {
                    return new Single[i];
                }
            }

            public Single(int i, int i2) {
                this.a = i;
                this.b = i2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Single)) {
                    return false;
                }
                Single single = (Single) obj;
                return this.a == single.a && this.b == single.b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
            }

            public final String toString() {
                return n36.a("Single(betDetailCount=", this.a, this.b, ", betBuilderBetDetailCount=", ")");
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeInt(this.a);
                parcel.writeInt(this.b);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType;", "Landroid/os/Parcelable;", "Single", BetOrderType.MULTIPLE, BetOrderType.SYSTEM, "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType$Multiple;", "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType$Single;", "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType$System;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public interface BetSlipType extends Parcelable {

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType$Multiple;", "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Multiple implements BetSlipType {
            public static final Parcelable.Creator<Multiple> CREATOR = new a();
            public final BigDecimal a;
            public final BetCount b;
            public final boolean c;
            public final boolean d;

            public static final class a implements Parcelable.Creator<Multiple> {
                @Override // android.os.Parcelable.Creator
                public final Multiple createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Multiple((BigDecimal) parcel.readSerializable(), (BetCount) parcel.readParcelable(Multiple.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
                }

                @Override // android.os.Parcelable.Creator
                public final Multiple[] newArray(int i) {
                    return new Multiple[i];
                }
            }

            public Multiple(BigDecimal bigDecimal, BetCount betCount, boolean z, boolean z2) {
                bigDecimal.getClass();
                betCount.getClass();
                this.a = bigDecimal;
                this.b = betCount;
                this.c = z;
                this.d = z2;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Multiple)) {
                    return false;
                }
                Multiple multiple = (Multiple) obj;
                return Intrinsics.g(this.a, multiple.a) && Intrinsics.g(this.b, multiple.b) && this.c == multiple.c && this.d == multiple.d;
            }

            @Override // com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext.BetSlipType
            /* JADX INFO: renamed from: getTotalStake, reason: from getter */
            public final BigDecimal getA() {
                return this.a;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.d) + mtg0.a((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Multiple(totalStake=");
                sb.append(this.a);
                sb.append(", betCount=");
                sb.append(this.b);
                sb.append(", flexiSelected=");
                return lng.a(", oneCutSelected=", ")", sb, this.c, this.d);
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeSerializable(this.a);
                parcel.writeParcelable(this.b, i);
                parcel.writeInt(this.c ? 1 : 0);
                parcel.writeInt(this.d ? 1 : 0);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType$Single;", "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class Single implements BetSlipType {
            public static final Parcelable.Creator<Single> CREATOR = new a();
            public final BigDecimal a;
            public final BetCount b;

            public static final class a implements Parcelable.Creator<Single> {
                @Override // android.os.Parcelable.Creator
                public final Single createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new Single((BigDecimal) parcel.readSerializable(), (BetCount) parcel.readParcelable(Single.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final Single[] newArray(int i) {
                    return new Single[i];
                }
            }

            public Single(BigDecimal bigDecimal, BetCount betCount) {
                bigDecimal.getClass();
                betCount.getClass();
                this.a = bigDecimal;
                this.b = betCount;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Single)) {
                    return false;
                }
                Single single = (Single) obj;
                return Intrinsics.g(this.a, single.a) && Intrinsics.g(this.b, single.b);
            }

            @Override // com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext.BetSlipType
            /* JADX INFO: renamed from: getTotalStake, reason: from getter */
            public final BigDecimal getA() {
                return this.a;
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                return "Single(totalStake=" + this.a + ", betCount=" + this.b + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeSerializable(this.a);
                parcel.writeParcelable(this.b, i);
            }
        }

        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType$System;", "Lcom/sportybet/android/instantwin/model/InstantWinGiftApplicabilityContext$BetSlipType;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
        public static final /* data */ class System implements BetSlipType {
            public static final Parcelable.Creator<System> CREATOR = new a();
            public final BigDecimal a;

            public static final class a implements Parcelable.Creator<System> {
                @Override // android.os.Parcelable.Creator
                public final System createFromParcel(Parcel parcel) {
                    parcel.getClass();
                    return new System((BigDecimal) parcel.readSerializable());
                }

                @Override // android.os.Parcelable.Creator
                public final System[] newArray(int i) {
                    return new System[i];
                }
            }

            public System(BigDecimal bigDecimal) {
                bigDecimal.getClass();
                this.a = bigDecimal;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof System) && Intrinsics.g(this.a, ((System) obj).a);
            }

            @Override // com.sportybet.android.instantwin.model.InstantWinGiftApplicabilityContext.BetSlipType
            /* JADX INFO: renamed from: getTotalStake, reason: from getter */
            public final BigDecimal getA() {
                return this.a;
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "System(totalStake=" + this.a + ")";
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(Parcel parcel, int i) {
                parcel.getClass();
                parcel.writeSerializable(this.a);
            }
        }

        /* JADX INFO: renamed from: getTotalStake */
        BigDecimal getA();
    }

    public static final class a implements Parcelable.Creator<InstantWinGiftApplicabilityContext> {
        @Override // android.os.Parcelable.Creator
        public final InstantWinGiftApplicabilityContext createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new InstantWinGiftApplicabilityContext((BetSlipType) parcel.readParcelable(InstantWinGiftApplicabilityContext.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InstantWinGiftApplicabilityContext[] newArray(int i) {
            return new InstantWinGiftApplicabilityContext[i];
        }
    }

    public InstantWinGiftApplicabilityContext(BetSlipType betSlipType) {
        betSlipType.getClass();
        this.a = betSlipType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof InstantWinGiftApplicabilityContext) && Intrinsics.g(this.a, ((InstantWinGiftApplicabilityContext) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "InstantWinGiftApplicabilityContext(betSlipType=" + this.a + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeParcelable(this.a, i);
    }
}
