package com.sportybet.feature.luckynumber.showoff.data;

import defpackage.tx5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0014\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0010\u001a\u00020\u0011HÖ\u0081\u0004J\n\u0010\u0012\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bÊ\u0001\u0002\b\u0014Ê\u0001\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u0013"}, d2 = {"Lcom/sportybet/feature/luckynumber/showoff/data/LNUploadImgDTO;", "", "url", "", "shareUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getShareUrl", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "luckynumber", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class LNUploadImgDTO {
    public static final int $stable = 0;
    private final String shareUrl;
    private final String url;

    public LNUploadImgDTO(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.url = str;
        this.shareUrl = str2;
    }

    public static /* synthetic */ LNUploadImgDTO copy$default(LNUploadImgDTO lNUploadImgDTO, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lNUploadImgDTO.url;
        }
        if ((i & 2) != 0) {
            str2 = lNUploadImgDTO.shareUrl;
        }
        return lNUploadImgDTO.copy(str, str2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final LNUploadImgDTO copy(String url, String shareUrl) {
        url.getClass();
        shareUrl.getClass();
        return new LNUploadImgDTO(url, shareUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LNUploadImgDTO)) {
            return false;
        }
        LNUploadImgDTO lNUploadImgDTO = (LNUploadImgDTO) other;
        return Intrinsics.g(this.url, lNUploadImgDTO.url) && Intrinsics.g(this.shareUrl, lNUploadImgDTO.shareUrl);
    }

    public final String getShareUrl() {
        return this.shareUrl;
    }

    public final String getUrl() {
        return this.url;
    }

    public int hashCode() {
        return this.shareUrl.hashCode() + (this.url.hashCode() * 31);
    }

    public String toString() {
        return tx5.a("LNUploadImgDTO(url=", this.url, ", shareUrl=", this.shareUrl, ")");
    }
}
