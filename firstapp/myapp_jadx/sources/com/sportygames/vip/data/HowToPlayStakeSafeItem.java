package com.sportygames.vip.data;

import defpackage.gmf0;
import defpackage.ruw;
import defpackage.wd7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/sportygames/vip/data/HowToPlayStakeSafeItem;", "", "width", "", "height", "text", "image", "right", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getWidth", "()Ljava/lang/String;", "getHeight", "getText", "getImage", "getRight", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class HowToPlayStakeSafeItem {
    public static final int $stable = 0;
    private final String height;
    private final String image;
    private final boolean right;
    private final String text;
    private final String width;

    public HowToPlayStakeSafeItem(String str, String str2, String str3, String str4, boolean z) {
        wd7.a(str, str2, str3, str4);
        this.width = str;
        this.height = str2;
        this.text = str3;
        this.image = str4;
        this.right = z;
    }

    public static /* synthetic */ HowToPlayStakeSafeItem copy$default(HowToPlayStakeSafeItem howToPlayStakeSafeItem, String str, String str2, String str3, String str4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = howToPlayStakeSafeItem.width;
        }
        if ((i & 2) != 0) {
            str2 = howToPlayStakeSafeItem.height;
        }
        if ((i & 4) != 0) {
            str3 = howToPlayStakeSafeItem.text;
        }
        if ((i & 8) != 0) {
            str4 = howToPlayStakeSafeItem.image;
        }
        if ((i & 16) != 0) {
            z = howToPlayStakeSafeItem.right;
        }
        boolean z2 = z;
        String str5 = str3;
        return howToPlayStakeSafeItem.copy(str, str2, str5, str4, z2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getText() {
        return this.text;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final boolean getRight() {
        return this.right;
    }

    public final HowToPlayStakeSafeItem copy(String width, String height, String text, String image, boolean right) {
        width.getClass();
        height.getClass();
        text.getClass();
        image.getClass();
        return new HowToPlayStakeSafeItem(width, height, text, image, right);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HowToPlayStakeSafeItem)) {
            return false;
        }
        HowToPlayStakeSafeItem howToPlayStakeSafeItem = (HowToPlayStakeSafeItem) other;
        return Intrinsics.g(this.width, howToPlayStakeSafeItem.width) && Intrinsics.g(this.height, howToPlayStakeSafeItem.height) && Intrinsics.g(this.text, howToPlayStakeSafeItem.text) && Intrinsics.g(this.image, howToPlayStakeSafeItem.image) && this.right == howToPlayStakeSafeItem.right;
    }

    public final String getHeight() {
        return this.height;
    }

    public final String getImage() {
        return this.image;
    }

    public final boolean getRight() {
        return this.right;
    }

    public final String getText() {
        return this.text;
    }

    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Boolean.hashCode(this.right) + gmf0.a(gmf0.a(gmf0.a(this.width.hashCode() * 31, 31, this.height), 31, this.text), 31, this.image);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("HowToPlayStakeSafeItem(width=");
        sb.append(this.width);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", right=");
        return ruw.a(sb, this.right, ')');
    }

    public /* synthetic */ HowToPlayStakeSafeItem(String str, String str2, String str3, String str4, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? false : z);
    }
}
