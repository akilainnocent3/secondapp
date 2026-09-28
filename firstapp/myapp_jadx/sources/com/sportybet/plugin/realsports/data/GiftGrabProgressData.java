package com.sportybet.plugin.realsports.data;

import com.google.gson.annotations.SerializedName;
import defpackage.cwz;
import defpackage.gpp;
import defpackage.mq0;
import defpackage.mtg0;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J;\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0006HÖ\u0081\u0004J\n\u0010\u0017\u001a\u00020\u0018HÖ\u0081\u0004R$\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0002¢\u0006\u0002\n\u0000R$\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0004¢\u0006\u0002\n\u0000R$\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0005¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\u0007¢\u0006\u0002\n\u0000R$\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\u0002\b\u000b\u0092\u0002\f\b\f\u0012\b\b\r\u0012\u0004\b\b(\b¢\u0006\u0002\n\u0000Ê\u0001\f\b\u001a\u0012\b\b\u001b\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0019"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabProgressData;", "", "grabAvailable", "", "hasUpdatePercentage", "percentage", "", "giftGrabActivityEnded", "settleQualification", "<init>", "(ZZIZZ)V", "Lkotlin/jvm/JvmField;", "Lcom/google/gson/annotations/SerializedName;", "value", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGrabProgressData {
    public static final int $stable = 0;

    @SerializedName("giftGrabActivityEnded")
    public final boolean giftGrabActivityEnded;

    @SerializedName("grabAvailable")
    public final boolean grabAvailable;

    @SerializedName("hasUpdatePercentage")
    public final boolean hasUpdatePercentage;

    @SerializedName("percentage")
    public final int percentage;

    @SerializedName("settleQualification")
    public final boolean settleQualification;

    public /* synthetic */ GiftGrabProgressData(boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2, (i2 & 4) != 0 ? 0 : i, (i2 & 8) != 0 ? false : z3, (i2 & 16) != 0 ? false : z4);
    }

    public static /* synthetic */ GiftGrabProgressData copy$default(GiftGrabProgressData giftGrabProgressData, boolean z, boolean z2, int i, boolean z3, boolean z4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            z = giftGrabProgressData.grabAvailable;
        }
        if ((i2 & 2) != 0) {
            z2 = giftGrabProgressData.hasUpdatePercentage;
        }
        if ((i2 & 4) != 0) {
            i = giftGrabProgressData.percentage;
        }
        if ((i2 & 8) != 0) {
            z3 = giftGrabProgressData.giftGrabActivityEnded;
        }
        if ((i2 & 16) != 0) {
            z4 = giftGrabProgressData.settleQualification;
        }
        boolean z5 = z4;
        int i3 = i;
        return giftGrabProgressData.copy(z, z2, i3, z3, z5);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getGrabAvailable() {
        return this.grabAvailable;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getHasUpdatePercentage() {
        return this.hasUpdatePercentage;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getPercentage() {
        return this.percentage;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final boolean getGiftGrabActivityEnded() {
        return this.giftGrabActivityEnded;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getSettleQualification() {
        return this.settleQualification;
    }

    public final GiftGrabProgressData copy(boolean grabAvailable, boolean hasUpdatePercentage, int percentage, boolean giftGrabActivityEnded, boolean settleQualification) {
        return new GiftGrabProgressData(grabAvailable, hasUpdatePercentage, percentage, giftGrabActivityEnded, settleQualification);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftGrabProgressData)) {
            return false;
        }
        GiftGrabProgressData giftGrabProgressData = (GiftGrabProgressData) other;
        return this.grabAvailable == giftGrabProgressData.grabAvailable && this.hasUpdatePercentage == giftGrabProgressData.hasUpdatePercentage && this.percentage == giftGrabProgressData.percentage && this.giftGrabActivityEnded == giftGrabProgressData.giftGrabActivityEnded && this.settleQualification == giftGrabProgressData.settleQualification;
    }

    public int hashCode() {
        return Boolean.hashCode(this.settleQualification) + mtg0.a(gpp.a(this.percentage, mtg0.a(Boolean.hashCode(this.grabAvailable) * 31, 31, this.hasUpdatePercentage), 31), 31, this.giftGrabActivityEnded);
    }

    public String toString() {
        boolean z = this.grabAvailable;
        boolean z2 = this.hasUpdatePercentage;
        int i = this.percentage;
        boolean z3 = this.giftGrabActivityEnded;
        boolean z4 = this.settleQualification;
        StringBuilder sbA = cwz.a("GiftGrabProgressData(grabAvailable=", ", hasUpdatePercentage=", ", percentage=", z, z2);
        sbA.append(i);
        sbA.append(", giftGrabActivityEnded=");
        sbA.append(z3);
        sbA.append(", settleQualification=");
        return mq0.a(sbA, z4, ")");
    }

    public GiftGrabProgressData(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        this.grabAvailable = z;
        this.hasUpdatePercentage = z2;
        this.percentage = i;
        this.giftGrabActivityEnded = z3;
        this.settleQualification = z4;
    }

    public GiftGrabProgressData() {
        this(false, false, 0, false, false, 31, null);
    }
}
