package com.sportybet.android.user.avatar;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.uf80;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0013\u001a\u00020\u0014HÖ\u0081\u0004J\n\u0010\u0015\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tÊ\u0001\u0002\b\u0017Ê\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0016"}, d2 = {"Lcom/sportybet/android/user/avatar/FrameData;", "", AnalyticsParam.EVENT_PARAM_ID, "", "largeAvatarFrameUrl", "smallAvatarFrameUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getLargeAvatarFrameUrl", "getSmallAvatarFrameUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class FrameData {
    public static final int $stable = 0;
    private final String id;
    private final String largeAvatarFrameUrl;
    private final String smallAvatarFrameUrl;

    public FrameData(String str, String str2, String str3) {
        this.id = str;
        this.largeAvatarFrameUrl = str2;
        this.smallAvatarFrameUrl = str3;
    }

    public static /* synthetic */ FrameData copy$default(FrameData frameData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = frameData.id;
        }
        if ((i & 2) != 0) {
            str2 = frameData.largeAvatarFrameUrl;
        }
        if ((i & 4) != 0) {
            str3 = frameData.smallAvatarFrameUrl;
        }
        return frameData.copy(str, str2, str3);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLargeAvatarFrameUrl() {
        return this.largeAvatarFrameUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSmallAvatarFrameUrl() {
        return this.smallAvatarFrameUrl;
    }

    public final FrameData copy(String id, String largeAvatarFrameUrl, String smallAvatarFrameUrl) {
        return new FrameData(id, largeAvatarFrameUrl, smallAvatarFrameUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FrameData)) {
            return false;
        }
        FrameData frameData = (FrameData) other;
        return Intrinsics.g(this.id, frameData.id) && Intrinsics.g(this.largeAvatarFrameUrl, frameData.largeAvatarFrameUrl) && Intrinsics.g(this.smallAvatarFrameUrl, frameData.smallAvatarFrameUrl);
    }

    public final String getId() {
        return this.id;
    }

    public final String getLargeAvatarFrameUrl() {
        return this.largeAvatarFrameUrl;
    }

    public final String getSmallAvatarFrameUrl() {
        return this.smallAvatarFrameUrl;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.largeAvatarFrameUrl;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.smallAvatarFrameUrl;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public String toString() {
        String str = this.id;
        String str2 = this.largeAvatarFrameUrl;
        return uf80.a(ux5.a("FrameData(id=", str, ", largeAvatarFrameUrl=", str2, ", smallAvatarFrameUrl="), this.smallAvatarFrameUrl, ")");
    }
}
