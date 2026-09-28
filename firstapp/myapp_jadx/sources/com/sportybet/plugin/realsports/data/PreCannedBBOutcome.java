package com.sportybet.plugin.realsports.data;

import android.os.Parcel;
import android.os.Parcelable;
import com.appsflyer.internal.m;
import defpackage.gmf0;
import defpackage.hxa;
import defpackage.uf80;
import defpackage.uqe0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0005HÆ\u0003J=\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u0018\u001a\u00020\u0003J\u0014\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0003HÖ\u0081\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\u0016\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020\u0003R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eÊ\u0001\u0002\b%Ê\u0001\f\b&\u0012\b\b'\u0012\u0004\b\u0003\u0010\u0000¨\u0006$"}, d2 = {"Lcom/sportybet/plugin/realsports/data/PreCannedBBOutcome;", "Landroid/os/Parcelable;", "marketId", "", "marketName", "", "outcomeId", "outcomeDesc", "specifier", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getMarketId", "()I", "getMarketName", "()Ljava/lang/String;", "getOutcomeId", "getOutcomeDesc", "getSpecifier", "component1", "component2", "component3", "component4", "component5", "copy", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "africa-bet-android", "Lkotlinx/parcelize/Parcelize;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class PreCannedBBOutcome implements Parcelable {
    private final int marketId;
    private final String marketName;
    private final String outcomeDesc;
    private final String outcomeId;
    private final String specifier;
    public static final Parcelable.Creator<PreCannedBBOutcome> CREATOR = new Creator();
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PreCannedBBOutcome> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreCannedBBOutcome createFromParcel(Parcel parcel) {
            parcel.getClass();
            return new PreCannedBBOutcome(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final PreCannedBBOutcome[] newArray(int i) {
            return new PreCannedBBOutcome[i];
        }
    }

    public PreCannedBBOutcome(int i, String str, String str2, String str3, String str4) {
        m.a(str, str2, str3);
        this.marketId = i;
        this.marketName = str;
        this.outcomeId = str2;
        this.outcomeDesc = str3;
        this.specifier = str4;
    }

    public static /* synthetic */ PreCannedBBOutcome copy$default(PreCannedBBOutcome preCannedBBOutcome, int i, String str, String str2, String str3, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = preCannedBBOutcome.marketId;
        }
        if ((i2 & 2) != 0) {
            str = preCannedBBOutcome.marketName;
        }
        if ((i2 & 4) != 0) {
            str2 = preCannedBBOutcome.outcomeId;
        }
        if ((i2 & 8) != 0) {
            str3 = preCannedBBOutcome.outcomeDesc;
        }
        if ((i2 & 16) != 0) {
            str4 = preCannedBBOutcome.specifier;
        }
        String str5 = str4;
        String str6 = str2;
        return preCannedBBOutcome.copy(i, str, str6, str3, str5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final int getMarketId() {
        return this.marketId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getMarketName() {
        return this.marketName;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getOutcomeId() {
        return this.outcomeId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getSpecifier() {
        return this.specifier;
    }

    public final PreCannedBBOutcome copy(int marketId, String marketName, String outcomeId, String outcomeDesc, String specifier) {
        marketName.getClass();
        outcomeId.getClass();
        outcomeDesc.getClass();
        return new PreCannedBBOutcome(marketId, marketName, outcomeId, outcomeDesc, specifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PreCannedBBOutcome)) {
            return false;
        }
        PreCannedBBOutcome preCannedBBOutcome = (PreCannedBBOutcome) other;
        return this.marketId == preCannedBBOutcome.marketId && Intrinsics.g(this.marketName, preCannedBBOutcome.marketName) && Intrinsics.g(this.outcomeId, preCannedBBOutcome.outcomeId) && Intrinsics.g(this.outcomeDesc, preCannedBBOutcome.outcomeDesc) && Intrinsics.g(this.specifier, preCannedBBOutcome.specifier);
    }

    public final int getMarketId() {
        return this.marketId;
    }

    public final String getMarketName() {
        return this.marketName;
    }

    public final String getOutcomeDesc() {
        return this.outcomeDesc;
    }

    public final String getOutcomeId() {
        return this.outcomeId;
    }

    public final String getSpecifier() {
        return this.specifier;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(gmf0.a(Integer.hashCode(this.marketId) * 31, 31, this.marketName), 31, this.outcomeId), 31, this.outcomeDesc);
        String str = this.specifier;
        return iA + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        int i = this.marketId;
        String str = this.marketName;
        String str2 = this.outcomeId;
        String str3 = this.outcomeDesc;
        String str4 = this.specifier;
        StringBuilder sbA = uqe0.a(i, "PreCannedBBOutcome(marketId=", ", marketName=", str, ", outcomeId=");
        hxa.c(sbA, str2, ", outcomeDesc=", str3, ", specifier=");
        return uf80.a(sbA, str4, ")");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        dest.getClass();
        dest.writeInt(this.marketId);
        dest.writeString(this.marketName);
        dest.writeString(this.outcomeId);
        dest.writeString(this.outcomeDesc);
        dest.writeString(this.specifier);
    }
}
