package com.sporty.android.core.model.account;

import defpackage.uf80;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0014\u0010\u0014\u001a\u00020\u00032\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0016\u001a\u00020\u0017HÖ\u0081\u0004J\n\u0010\u0018\u001a\u00020\u0005HÖ\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rÊ\u0001\u0002\b\u001a¨\u0006\u0019"}, d2 = {"Lcom/sporty/android/core/model/account/AvatarFrame;", "", "frameApplied", "", "largeAvatarFrameUrl", "", "smallAvatarFrameUrl", "<init>", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)V", "getFrameApplied", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getLargeAvatarFrameUrl", "()Ljava/lang/String;", "getSmallAvatarFrameUrl", "component1", "component2", "component3", "copy", "(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;)Lcom/sporty/android/core/model/account/AvatarFrame;", "equals", "other", "hashCode", "", "toString", "model", "Landroidx/annotation/Keep;"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class AvatarFrame {
    private final Boolean frameApplied;
    private final String largeAvatarFrameUrl;
    private final String smallAvatarFrameUrl;

    public /* synthetic */ AvatarFrame(Boolean bool, String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? Boolean.TRUE : bool, (i & 2) != 0 ? "" : str, (i & 4) != 0 ? "" : str2);
    }

    public static /* synthetic */ AvatarFrame copy$default(AvatarFrame avatarFrame, Boolean bool, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            bool = avatarFrame.frameApplied;
        }
        if ((i & 2) != 0) {
            str = avatarFrame.largeAvatarFrameUrl;
        }
        if ((i & 4) != 0) {
            str2 = avatarFrame.smallAvatarFrameUrl;
        }
        return avatarFrame.copy(bool, str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final Boolean getFrameApplied() {
        return this.frameApplied;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getLargeAvatarFrameUrl() {
        return this.largeAvatarFrameUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getSmallAvatarFrameUrl() {
        return this.smallAvatarFrameUrl;
    }

    public final AvatarFrame copy(Boolean frameApplied, String largeAvatarFrameUrl, String smallAvatarFrameUrl) {
        return new AvatarFrame(frameApplied, largeAvatarFrameUrl, smallAvatarFrameUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AvatarFrame)) {
            return false;
        }
        AvatarFrame avatarFrame = (AvatarFrame) other;
        return Intrinsics.g(this.frameApplied, avatarFrame.frameApplied) && Intrinsics.g(this.largeAvatarFrameUrl, avatarFrame.largeAvatarFrameUrl) && Intrinsics.g(this.smallAvatarFrameUrl, avatarFrame.smallAvatarFrameUrl);
    }

    public final Boolean getFrameApplied() {
        return this.frameApplied;
    }

    public final String getLargeAvatarFrameUrl() {
        return this.largeAvatarFrameUrl;
    }

    public final String getSmallAvatarFrameUrl() {
        return this.smallAvatarFrameUrl;
    }

    public int hashCode() {
        Boolean bool = this.frameApplied;
        int iHashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.largeAvatarFrameUrl;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.smallAvatarFrameUrl;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        Boolean bool = this.frameApplied;
        String str = this.largeAvatarFrameUrl;
        String str2 = this.smallAvatarFrameUrl;
        StringBuilder sb = new StringBuilder("AvatarFrame(frameApplied=");
        sb.append(bool);
        sb.append(", largeAvatarFrameUrl=");
        sb.append(str);
        sb.append(", smallAvatarFrameUrl=");
        return uf80.a(sb, str2, ")");
    }

    public AvatarFrame(Boolean bool, String str, String str2) {
        this.frameApplied = bool;
        this.largeAvatarFrameUrl = str;
        this.smallAvatarFrameUrl = str2;
    }

    public AvatarFrame() {
        this(null, null, null, 7, null);
    }
}
