package com.sporty.android.core.model.welcomereward;

import com.google.gson.annotations.SerializedName;
import defpackage.eal;
import defpackage.mtg0;
import defpackage.xdp;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\b\u0018\u0000 -2\u00020\u0001:\u0001-B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ2\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\u00042\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\rR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b \u0010\u000fR\u0013\u0010$\u001a\u0004\u0018\u00010!8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0013\u0010(\u001a\u0004\u0018\u00010%8F¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0013\u0010,\u001a\u0004\u0018\u00010)8F¢\u0006\u0006\u001a\u0004\b*\u0010+¨\u0006."}, d2 = {"Lcom/sporty/android/core/model/welcomereward/Reward;", "", "Lcom/sporty/android/core/model/welcomereward/NonFtdRewardType;", "type", "", "unlocked", "Lxdp;", "metadata", "<init>", "(Lcom/sporty/android/core/model/welcomereward/NonFtdRewardType;ZLxdp;)V", "component1", "()Lcom/sporty/android/core/model/welcomereward/NonFtdRewardType;", "component2", "()Z", "component3", "()Lxdp;", "copy", "(Lcom/sporty/android/core/model/welcomereward/NonFtdRewardType;ZLxdp;)Lcom/sporty/android/core/model/welcomereward/Reward;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lcom/sporty/android/core/model/welcomereward/NonFtdRewardType;", "getType", "Z", "getUnlocked", "Lxdp;", "getMetadata", "Lcom/sporty/android/core/model/welcomereward/LuckyWheelMetadata;", "getLuckyWheelMetadata", "()Lcom/sporty/android/core/model/welcomereward/LuckyWheelMetadata;", "luckyWheelMetadata", "Lcom/sporty/android/core/model/welcomereward/LoyaltyMissionMetadata;", "getLoyaltyMissionMetadata", "()Lcom/sporty/android/core/model/welcomereward/LoyaltyMissionMetadata;", "loyaltyMissionMetadata", "Lcom/sporty/android/core/model/welcomereward/LoyaltyMetadata;", "getLoyaltyMetadata", "()Lcom/sporty/android/core/model/welcomereward/LoyaltyMetadata;", "loyaltyMetadata", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Reward {
    private static final eal gson = new eal();

    @SerializedName("metadata")
    private final xdp metadata;

    @SerializedName("type")
    private final NonFtdRewardType type;

    @SerializedName("unlocked")
    private final boolean unlocked;

    public /* synthetic */ Reward(NonFtdRewardType nonFtdRewardType, boolean z, xdp xdpVar, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : nonFtdRewardType, (i & 2) != 0 ? false : z, (i & 4) != 0 ? null : xdpVar);
    }

    public static /* synthetic */ Reward copy$default(Reward reward, NonFtdRewardType nonFtdRewardType, boolean z, xdp xdpVar, int i, Object obj) {
        if ((i & 1) != 0) {
            nonFtdRewardType = reward.type;
        }
        if ((i & 2) != 0) {
            z = reward.unlocked;
        }
        if ((i & 4) != 0) {
            xdpVar = reward.metadata;
        }
        return reward.copy(nonFtdRewardType, z, xdpVar);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final NonFtdRewardType getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final boolean getUnlocked() {
        return this.unlocked;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final xdp getMetadata() {
        return this.metadata;
    }

    public final Reward copy(NonFtdRewardType type, boolean unlocked, xdp metadata) {
        return new Reward(type, unlocked, metadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Reward)) {
            return false;
        }
        Reward reward = (Reward) other;
        return this.type == reward.type && this.unlocked == reward.unlocked && Intrinsics.g(this.metadata, reward.metadata);
    }

    public final LoyaltyMetadata getLoyaltyMetadata() {
        xdp xdpVar;
        if (this.type != NonFtdRewardType.LOYALTY || (xdpVar = this.metadata) == null) {
            return null;
        }
        return (LoyaltyMetadata) gson.b(xdpVar, LoyaltyMetadata.class);
    }

    public final LoyaltyMissionMetadata getLoyaltyMissionMetadata() {
        xdp xdpVar;
        if (this.type != NonFtdRewardType.LOYALTY_MISSION || (xdpVar = this.metadata) == null) {
            return null;
        }
        return (LoyaltyMissionMetadata) gson.b(xdpVar, LoyaltyMissionMetadata.class);
    }

    public final LuckyWheelMetadata getLuckyWheelMetadata() {
        xdp xdpVar;
        if (this.type != NonFtdRewardType.LUCKY_WHEEL || (xdpVar = this.metadata) == null) {
            return null;
        }
        return (LuckyWheelMetadata) gson.b(xdpVar, LuckyWheelMetadata.class);
    }

    public final xdp getMetadata() {
        return this.metadata;
    }

    public final NonFtdRewardType getType() {
        return this.type;
    }

    public final boolean getUnlocked() {
        return this.unlocked;
    }

    public int hashCode() {
        NonFtdRewardType nonFtdRewardType = this.type;
        int iA = mtg0.a((nonFtdRewardType == null ? 0 : nonFtdRewardType.hashCode()) * 31, 31, this.unlocked);
        xdp xdpVar = this.metadata;
        return iA + (xdpVar != null ? xdpVar.a.hashCode() : 0);
    }

    public String toString() {
        return "Reward(type=" + this.type + ", unlocked=" + this.unlocked + ", metadata=" + this.metadata + ")";
    }

    public Reward(NonFtdRewardType nonFtdRewardType, boolean z, xdp xdpVar) {
        this.type = nonFtdRewardType;
        this.unlocked = z;
        this.metadata = xdpVar;
    }

    public Reward() {
        this(null, false, null, 7, null);
    }
}
