package com.sporty.android.core.model.patron;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.t160;
import defpackage.wxa;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B1\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003J;\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\bHÖ\u0081\u0004J\n\u0010!\u001a\u00020\u0005HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0014\u001a\u00020\u00158F¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017¨\u0006#"}, d2 = {"Lcom/sporty/android/core/model/patron/KYCBannerItem;", "", "blocked", "", "groupId", "", "itemId", "level", "", AnalyticsParam.EVENT_STATUS, "<init>", "(ZLjava/lang/String;Ljava/lang/String;II)V", "getBlocked", "()Z", "getGroupId", "()Ljava/lang/String;", "getItemId", "getLevel", "()I", "getStatus", "tierStatus", "Lcom/sporty/android/core/model/patron/KYCTierStatus;", "getTierStatus", "()Lcom/sporty/android/core/model/patron/KYCTierStatus;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "Companion", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class KYCBannerItem {
    public static final int STATUS_ACCEPTED = 30;
    public static final int STATUS_DEPRECATE = 25;
    public static final int STATUS_ENDED = 50;
    public static final int STATUS_OPEN = 10;
    public static final int STATUS_REJECTED = 40;
    public static final int STATUS_REVIEWING = 20;
    private final boolean blocked;
    private final String groupId;
    private final String itemId;
    private final int level;
    private final int status;

    public KYCBannerItem(boolean z, String str, String str2, int i, int i2) {
        str.getClass();
        str2.getClass();
        this.blocked = z;
        this.groupId = str;
        this.itemId = str2;
        this.level = i;
        this.status = i2;
    }

    public static /* synthetic */ KYCBannerItem copy$default(KYCBannerItem kYCBannerItem, boolean z, String str, String str2, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            z = kYCBannerItem.blocked;
        }
        if ((i3 & 2) != 0) {
            str = kYCBannerItem.groupId;
        }
        if ((i3 & 4) != 0) {
            str2 = kYCBannerItem.itemId;
        }
        if ((i3 & 8) != 0) {
            i = kYCBannerItem.level;
        }
        if ((i3 & 16) != 0) {
            i2 = kYCBannerItem.status;
        }
        int i4 = i2;
        String str3 = str2;
        return kYCBannerItem.copy(z, str, str3, i, i4);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final boolean getBlocked() {
        return this.blocked;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getGroupId() {
        return this.groupId;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getItemId() {
        return this.itemId;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final int getLevel() {
        return this.level;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    public final KYCBannerItem copy(boolean blocked, String groupId, String itemId, int level, int status) {
        groupId.getClass();
        itemId.getClass();
        return new KYCBannerItem(blocked, groupId, itemId, level, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof KYCBannerItem)) {
            return false;
        }
        KYCBannerItem kYCBannerItem = (KYCBannerItem) other;
        return this.blocked == kYCBannerItem.blocked && Intrinsics.g(this.groupId, kYCBannerItem.groupId) && Intrinsics.g(this.itemId, kYCBannerItem.itemId) && this.level == kYCBannerItem.level && this.status == kYCBannerItem.status;
    }

    public final boolean getBlocked() {
        return this.blocked;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getItemId() {
        return this.itemId;
    }

    public final int getLevel() {
        return this.level;
    }

    public final int getStatus() {
        return this.status;
    }

    public final KYCTierStatus getTierStatus() {
        int i = this.status;
        if (i == 20) {
            return KYCTierStatus.UNDER_REVIEW;
        }
        if (i == 25 || i == 50) {
            return KYCTierStatus.UNAVAILABLE;
        }
        if (i == 30) {
            return KYCTierStatus.VERIFIED;
        }
        if (i == 40) {
            return KYCTierStatus.FAILED;
        }
        if (this.blocked) {
            return KYCTierStatus.UNAVAILABLE;
        }
        return i == 10 ? KYCTierStatus.AVAILABLE : KYCTierStatus.AVAILABLE;
    }

    public int hashCode() {
        return Integer.hashCode(this.status) + gpp.a(this.level, gmf0.a(gmf0.a(Boolean.hashCode(this.blocked) * 31, 31, this.groupId), 31, this.itemId), 31);
    }

    public String toString() {
        boolean z = this.blocked;
        String str = this.groupId;
        String str2 = this.itemId;
        int i = this.level;
        int i2 = this.status;
        StringBuilder sbA = t160.a("KYCBannerItem(blocked=", ", groupId=", str, ", itemId=", z);
        wxa.b(i, str2, ", level=", ", status=", sbA);
        return zk1.a(i2, ")", sbA);
    }

    public /* synthetic */ KYCBannerItem(boolean z, String str, String str2, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? false : z, str, str2, i, i2);
    }
}
