package com.sporty.android.core.model.social;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0014\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0012\u001a\u00020\u0013HÖ\u0081\u0004J\n\u0010\u0014\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/sporty/android/core/model/social/ShareUrl;", "", "sth", "", "intentType", "Lcom/sporty/android/core/model/social/ShareIntentType;", "<init>", "(Ljava/lang/String;Lcom/sporty/android/core/model/social/ShareIntentType;)V", "getSth", "()Ljava/lang/String;", "getIntentType", "()Lcom/sporty/android/core/model/social/ShareIntentType;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "model"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ShareUrl {
    private final ShareIntentType intentType;
    private final String sth;

    public ShareUrl(String str, ShareIntentType shareIntentType) {
        str.getClass();
        this.sth = str;
        this.intentType = shareIntentType;
    }

    public static /* synthetic */ ShareUrl copy$default(ShareUrl shareUrl, String str, ShareIntentType shareIntentType, int i, Object obj) {
        if ((i & 1) != 0) {
            str = shareUrl.sth;
        }
        if ((i & 2) != 0) {
            shareIntentType = shareUrl.intentType;
        }
        return shareUrl.copy(str, shareIntentType);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSth() {
        return this.sth;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final ShareIntentType getIntentType() {
        return this.intentType;
    }

    public final ShareUrl copy(String sth, ShareIntentType intentType) {
        sth.getClass();
        return new ShareUrl(sth, intentType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShareUrl)) {
            return false;
        }
        ShareUrl shareUrl = (ShareUrl) other;
        return Intrinsics.g(this.sth, shareUrl.sth) && this.intentType == shareUrl.intentType;
    }

    public final ShareIntentType getIntentType() {
        return this.intentType;
    }

    public final String getSth() {
        return this.sth;
    }

    public int hashCode() {
        int iHashCode = this.sth.hashCode() * 31;
        ShareIntentType shareIntentType = this.intentType;
        return iHashCode + (shareIntentType == null ? 0 : shareIntentType.hashCode());
    }

    public String toString() {
        return "ShareUrl(sth=" + this.sth + ", intentType=" + this.intentType + ")";
    }

    public /* synthetic */ ShareUrl(String str, ShareIntentType shareIntentType, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : shareIntentType);
    }
}
