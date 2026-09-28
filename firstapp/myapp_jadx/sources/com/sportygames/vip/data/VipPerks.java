package com.sportygames.vip.data;

import defpackage.gmf0;
import defpackage.m2g;
import defpackage.mtg0;
import defpackage.o8i;
import defpackage.qn4;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\t\u0010\"\u001a\u00020\u0003HÆ\u0003J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0003Jm\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\rHÆ\u0001J\u0013\u0010&\u001a\u00020\t2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0011R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00030\r¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001b¨\u0006+"}, d2 = {"Lcom/sportygames/vip/data/VipPerks;", "", "title", "", "width", "top", "height", "right", "floatRight", "", "image", "description", "howItWorks", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getWidth", "getTop", "getHeight", "getRight", "getFloatRight", "()Z", "getImage", "getDescription", "getHowItWorks", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "", "toString", "vip_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VipPerks {
    public static final int $stable = 8;
    private final String description;
    private final boolean floatRight;
    private final String height;
    private final List<String> howItWorks;
    private final String image;
    private final String right;
    private final String title;
    private final String top;
    private final String width;

    public VipPerks(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List<String> list) {
        qn4.b(str, str2, str3, str6, str7);
        list.getClass();
        this.title = str;
        this.width = str2;
        this.top = str3;
        this.height = str4;
        this.right = str5;
        this.floatRight = z;
        this.image = str6;
        this.description = str7;
        this.howItWorks = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ VipPerks copy$default(VipPerks vipPerks, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = vipPerks.title;
        }
        if ((i & 2) != 0) {
            str2 = vipPerks.width;
        }
        if ((i & 4) != 0) {
            str3 = vipPerks.top;
        }
        if ((i & 8) != 0) {
            str4 = vipPerks.height;
        }
        if ((i & 16) != 0) {
            str5 = vipPerks.right;
        }
        if ((i & 32) != 0) {
            z = vipPerks.floatRight;
        }
        if ((i & 64) != 0) {
            str6 = vipPerks.image;
        }
        if ((i & 128) != 0) {
            str7 = vipPerks.description;
        }
        if ((i & 256) != 0) {
            list = vipPerks.howItWorks;
        }
        String str8 = str7;
        List list2 = list;
        boolean z2 = z;
        String str9 = str6;
        String str10 = str5;
        String str11 = str3;
        return vipPerks.copy(str, str2, str11, str4, str10, z2, str9, str8, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getWidth() {
        return this.width;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTop() {
        return this.top;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getRight() {
        return this.right;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final boolean getFloatRight() {
        return this.floatRight;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getImage() {
        return this.image;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final List<String> component9() {
        return this.howItWorks;
    }

    public final VipPerks copy(String title, String width, String top, String height, String right, boolean floatRight, String image, String description, List<String> howItWorks) {
        qn4.b(title, width, top, image, description);
        howItWorks.getClass();
        return new VipPerks(title, width, top, height, right, floatRight, image, description, howItWorks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VipPerks)) {
            return false;
        }
        VipPerks vipPerks = (VipPerks) other;
        return Intrinsics.g(this.title, vipPerks.title) && Intrinsics.g(this.width, vipPerks.width) && Intrinsics.g(this.top, vipPerks.top) && Intrinsics.g(this.height, vipPerks.height) && Intrinsics.g(this.right, vipPerks.right) && this.floatRight == vipPerks.floatRight && Intrinsics.g(this.image, vipPerks.image) && Intrinsics.g(this.description, vipPerks.description) && Intrinsics.g(this.howItWorks, vipPerks.howItWorks);
    }

    public final String getDescription() {
        return this.description;
    }

    public final boolean getFloatRight() {
        return this.floatRight;
    }

    public final String getHeight() {
        return this.height;
    }

    public final List<String> getHowItWorks() {
        return this.howItWorks;
    }

    public final String getImage() {
        return this.image;
    }

    public final String getRight() {
        return this.right;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTop() {
        return this.top;
    }

    public final String getWidth() {
        return this.width;
    }

    public int hashCode() {
        int iA = gmf0.a(gmf0.a(this.title.hashCode() * 31, 31, this.width), 31, this.top);
        String str = this.height;
        int iHashCode = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.right;
        return this.howItWorks.hashCode() + gmf0.a(gmf0.a(mtg0.a((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.floatRight), 31, this.image), 31, this.description);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("VipPerks(title=");
        sb.append(this.title);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", top=");
        sb.append(this.top);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", right=");
        sb.append(this.right);
        sb.append(", floatRight=");
        sb.append(this.floatRight);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", howItWorks=");
        return o8i.a(sb, this.howItWorks, ')');
    }

    public VipPerks(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : str5, (i & 32) != 0 ? false : z, str6, str7, (i & 256) != 0 ? m2g.a : list);
    }
}
