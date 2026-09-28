package com.sportybet.android.data;

import defpackage.gmf0;
import defpackage.m2g;
import defpackage.nve;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u001aHÖ\u0081\u0004J\n\u0010\u001b\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010Ê\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u001c"}, d2 = {"Lcom/sportybet/android/data/NCMessageContent;", "", "title", "", "content", "bannerImageUrl", "buttons", "", "Lcom/sportybet/android/data/NCButtonData;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getContent", "getBannerImageUrl", "getButtons", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class NCMessageContent {
    public static final int $stable = 8;
    private final String bannerImageUrl;
    private final List<NCButtonData> buttons;
    private final String content;
    private final String title;

    public NCMessageContent(String str, String str2, String str3, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? "" : str3, (i & 8) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ NCMessageContent copy$default(NCMessageContent nCMessageContent, String str, String str2, String str3, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = nCMessageContent.title;
        }
        if ((i & 2) != 0) {
            str2 = nCMessageContent.content;
        }
        if ((i & 4) != 0) {
            str3 = nCMessageContent.bannerImageUrl;
        }
        if ((i & 8) != 0) {
            list = nCMessageContent.buttons;
        }
        return nCMessageContent.copy(str, str2, str3, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getBannerImageUrl() {
        return this.bannerImageUrl;
    }

    public final List<NCButtonData> component4() {
        return this.buttons;
    }

    public final NCMessageContent copy(String title, String content, String bannerImageUrl, List<NCButtonData> buttons) {
        title.getClass();
        content.getClass();
        bannerImageUrl.getClass();
        buttons.getClass();
        return new NCMessageContent(title, content, bannerImageUrl, buttons);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NCMessageContent)) {
            return false;
        }
        NCMessageContent nCMessageContent = (NCMessageContent) other;
        return Intrinsics.g(this.title, nCMessageContent.title) && Intrinsics.g(this.content, nCMessageContent.content) && Intrinsics.g(this.bannerImageUrl, nCMessageContent.bannerImageUrl) && Intrinsics.g(this.buttons, nCMessageContent.buttons);
    }

    public final String getBannerImageUrl() {
        return this.bannerImageUrl;
    }

    public final List<NCButtonData> getButtons() {
        return this.buttons;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        return this.buttons.hashCode() + gmf0.a(gmf0.a(this.title.hashCode() * 31, 31, this.content), 31, this.bannerImageUrl);
    }

    public String toString() {
        String str = this.title;
        String str2 = this.content;
        return nve.a(this.bannerImageUrl, ", buttons=", ")", ux5.a("NCMessageContent(title=", str, ", content=", str2, ", bannerImageUrl="), this.buttons);
    }

    public NCMessageContent(String str, String str2, String str3, List<NCButtonData> list) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        list.getClass();
        this.title = str;
        this.content = str2;
        this.bannerImageUrl = str3;
        this.buttons = list;
    }

    public NCMessageContent() {
        this(null, null, null, null, 15, null);
    }
}
