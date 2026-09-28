package com.sportybet.plugin.realsports.data;

import com.google.gson.annotations.SerializedName;
import defpackage.nf;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J#\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0014\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0014\u001a\u00020\u0015HÖ\u0081\u0004J\n\u0010\u0016\u001a\u00020\u0003HÖ\u0081\u0004R%\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR+\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rÊ\u0001\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\u0003\u0010\u0000¨\u0006\u0017"}, d2 = {"Lcom/sportybet/plugin/realsports/data/GiftGrabInfoPage;", "", "image", "", "contents", "", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getImage", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getContents", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "africa-bet-android", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class GiftGrabInfoPage {
    public static final int $stable = 8;

    @SerializedName("contents")
    private final List<String> contents;

    @SerializedName("image")
    private final String image;

    public GiftGrabInfoPage(String str, List<String> list) {
        str.getClass();
        list.getClass();
        this.image = str;
        this.contents = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GiftGrabInfoPage copy$default(GiftGrabInfoPage giftGrabInfoPage, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = giftGrabInfoPage.image;
        }
        if ((i & 2) != 0) {
            list = giftGrabInfoPage.contents;
        }
        return giftGrabInfoPage.copy(str, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    public final List<String> component2() {
        return this.contents;
    }

    public final GiftGrabInfoPage copy(String image, List<String> contents) {
        image.getClass();
        contents.getClass();
        return new GiftGrabInfoPage(image, contents);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GiftGrabInfoPage)) {
            return false;
        }
        GiftGrabInfoPage giftGrabInfoPage = (GiftGrabInfoPage) other;
        return Intrinsics.g(this.image, giftGrabInfoPage.image) && Intrinsics.g(this.contents, giftGrabInfoPage.contents);
    }

    public final List<String> getContents() {
        return this.contents;
    }

    public final String getImage() {
        return this.image;
    }

    public int hashCode() {
        return this.contents.hashCode() + (this.image.hashCode() * 31);
    }

    public String toString() {
        return nf.b("GiftGrabInfoPage(image=", this.image, ", contents=", ")", this.contents);
    }
}
