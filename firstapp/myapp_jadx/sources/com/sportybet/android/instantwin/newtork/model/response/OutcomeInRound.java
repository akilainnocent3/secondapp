package com.sportybet.android.instantwin.newtork.model.response;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import defpackage.hxa;
import defpackage.mtg0;
import defpackage.nyf;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0016\u001a\u00020\u0017J\u0014\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0083\u0004J\n\u0010\u001b\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u001c\u001a\u00020\u0003HÖ\u0081\u0004J\u0016\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u0017R&\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\f\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R&\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\f\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R&\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\f\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0005¢\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\f\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0006¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004\u0092\u0002\u0002\b\f\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\u0007¢\u0006\u0002\n\u0000R&\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\f\u0092\u0002\f\b\r\u0012\b\b\u000e\u0012\u0004\b\b(\t¢\u0006\u0002\n\u0000Ê\u0001\u0002\b#Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0000¨\u0006\""}, d2 = {"Lcom/sportybet/android/instantwin/newtork/model/response/OutcomeInRound;", "Landroid/os/Parcelable;", "outcomeId", "", "marketId", "desc", "odds", "hit", "", "prob", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "instantWin", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class OutcomeInRound implements Parcelable {

    @SerializedName("desc")
    public final String desc;

    @SerializedName("hit")
    public final boolean hit;

    @SerializedName("marketId")
    public final String marketId;

    @SerializedName("odds")
    public final String odds;

    @SerializedName("outcomeId")
    public final String outcomeId;

    @SerializedName("prob")
    public final String prob;
    public static final Parcelable.Creator<OutcomeInRound> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<OutcomeInRound> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OutcomeInRound createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new OutcomeInRound(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final OutcomeInRound[] newArray(int i) {
            return new OutcomeInRound[i];
        }
    }

    public OutcomeInRound(String str, String str2, String str3, String str4, boolean z, String str5) {
        this.outcomeId = str;
        this.marketId = str2;
        this.desc = str3;
        this.odds = str4;
        this.hit = z;
        this.prob = str5;
    }

    public static /* synthetic */ OutcomeInRound copy$default(OutcomeInRound outcomeInRound, String str, String str2, String str3, String str4, boolean z, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = outcomeInRound.outcomeId;
        }
        if ((i & 2) != 0) {
            str2 = outcomeInRound.marketId;
        }
        if ((i & 4) != 0) {
            str3 = outcomeInRound.desc;
        }
        if ((i & 8) != 0) {
            str4 = outcomeInRound.odds;
        }
        if ((i & 16) != 0) {
            z = outcomeInRound.hit;
        }
        if ((i & 32) != 0) {
            str5 = outcomeInRound.prob;
        }
        boolean z2 = z;
        String str6 = str5;
        return outcomeInRound.copy(str, str2, str3, str4, z2, str6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOdds() {
        return this.odds;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getHit() {
        return this.hit;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getProb() {
        return this.prob;
    }

    public final OutcomeInRound copy(String outcomeId, String marketId, String desc, String odds, boolean hit, String prob) {
        return new OutcomeInRound(outcomeId, marketId, desc, odds, hit, prob);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OutcomeInRound)) {
            return false;
        }
        OutcomeInRound outcomeInRound = (OutcomeInRound) other;
        return Intrinsics.g(this.outcomeId, outcomeInRound.outcomeId) && Intrinsics.g(this.marketId, outcomeInRound.marketId) && Intrinsics.g(this.desc, outcomeInRound.desc) && Intrinsics.g(this.odds, outcomeInRound.odds) && this.hit == outcomeInRound.hit && Intrinsics.g(this.prob, outcomeInRound.prob);
    }

    public int hashCode() {
        String str = this.outcomeId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.marketId;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.desc;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.odds;
        int iA = mtg0.a((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.hit);
        String str5 = this.prob;
        return iA + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        String str = this.outcomeId;
        String str2 = this.marketId;
        String str3 = this.desc;
        String str4 = this.odds;
        boolean z = this.hit;
        String str5 = this.prob;
        StringBuilder sbA = ux5.a("OutcomeInRound(outcomeId=", str, ", marketId=", str2, ", desc=");
        hxa.c(sbA, str3, ", odds=", str4, ", hit=");
        return nyf.a(", prob=", str5, ")", sbA, z);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeString(this.outcomeId);
        dest.writeString(this.marketId);
        dest.writeString(this.desc);
        dest.writeString(this.odds);
        dest.writeInt(this.hit ? 1 : 0);
        dest.writeString(this.prob);
    }

    public /* synthetic */ OutcomeInRound(String str, String str2, String str3, String str4, boolean z, String str5, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, z, (i & 32) != 0 ? null : str5);
    }
}
