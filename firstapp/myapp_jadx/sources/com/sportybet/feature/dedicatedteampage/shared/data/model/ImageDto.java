package com.sportybet.feature.dedicatedteampage.shared.data.model;

import com.appsflyer.internal.m;
import defpackage.d5d;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ux5;
import defpackage.zk1;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\bHÆ\u0003J\t\u0010\u001b\u001a\u00020\bHÆ\u0003J\t\u0010\u001c\u001a\u00020\bHÆ\u0003JQ\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\bHÆ\u0001J\u0014\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010!\u001a\u00020\bHÖ\u0081\u0004J\n\u0010\"\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0013Ê\u0001\u0002\b$Ê\u0001\f\b%\u0012\b\b&\u0012\u0004\b\u0003\u0010\u0002¨\u0006#"}, d2 = {"Lcom/sportybet/feature/dedicatedteampage/shared/data/model/ImageDto;", "", "type", "", "url", "altText", "caption", "order", "", "width", "height", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;III)V", "getType", "()Ljava/lang/String;", "getUrl", "getAltText", "getCaption", "getOrder", "()I", "getWidth", "getHeight", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "dedicated-team-page", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class ImageDto {
    public static final int $stable = 0;
    private final String altText;
    private final String caption;
    private final int height;
    private final int order;
    private final String type;
    private final String url;
    private final int width;

    public ImageDto(String str, String str2, String str3, String str4, int i, int i2, int i3) {
        m.a(str2, str3, str4);
        this.type = str;
        this.url = str2;
        this.altText = str3;
        this.caption = str4;
        this.order = i;
        this.width = i2;
        this.height = i3;
    }

    public static /* synthetic */ ImageDto copy$default(ImageDto imageDto, String str, String str2, String str3, String str4, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            str = imageDto.type;
        }
        if ((i4 & 2) != 0) {
            str2 = imageDto.url;
        }
        if ((i4 & 4) != 0) {
            str3 = imageDto.altText;
        }
        if ((i4 & 8) != 0) {
            str4 = imageDto.caption;
        }
        if ((i4 & 16) != 0) {
            i = imageDto.order;
        }
        if ((i4 & 32) != 0) {
            i2 = imageDto.width;
        }
        if ((i4 & 64) != 0) {
            i3 = imageDto.height;
        }
        int i5 = i2;
        int i6 = i3;
        int i7 = i;
        String str5 = str3;
        return imageDto.copy(str, str2, str5, str4, i7, i5, i6);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getAltText() {
        return this.altText;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getCaption() {
        return this.caption;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final int getOrder() {
        return this.order;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    public final ImageDto copy(String type, String url, String altText, String caption, int order, int width, int height) {
        url.getClass();
        altText.getClass();
        caption.getClass();
        return new ImageDto(type, url, altText, caption, order, width, height);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ImageDto)) {
            return false;
        }
        ImageDto imageDto = (ImageDto) other;
        return Intrinsics.g(this.type, imageDto.type) && Intrinsics.g(this.url, imageDto.url) && Intrinsics.g(this.altText, imageDto.altText) && Intrinsics.g(this.caption, imageDto.caption) && this.order == imageDto.order && this.width == imageDto.width && this.height == imageDto.height;
    }

    public final String getAltText() {
        return this.altText;
    }

    public final String getCaption() {
        return this.caption;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getOrder() {
        return this.order;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        String str = this.type;
        return Integer.hashCode(this.height) + gpp.a(this.width, gpp.a(this.order, gmf0.a(gmf0.a(gmf0.a((str == null ? 0 : str.hashCode()) * 31, 31, this.url), 31, this.altText), 31, this.caption), 31), 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.url;
        String str3 = this.altText;
        String str4 = this.caption;
        int i = this.order;
        int i2 = this.width;
        int i3 = this.height;
        StringBuilder sbA = ux5.a("ImageDto(type=", str, ", url=", str2, ", altText=");
        hxa.c(sbA, str3, ", caption=", str4, ", order=");
        d5d.a(sbA, i, ", width=", i2, ", height=");
        return zk1.a(i3, ")", sbA);
    }
}
