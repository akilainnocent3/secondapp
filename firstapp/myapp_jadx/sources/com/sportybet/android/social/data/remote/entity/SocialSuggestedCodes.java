package com.sportybet.android.social.data.remote.entity;

import com.google.gson.annotations.SerializedName;
import com.sportybet.android.instantwin.presentation.legendsrace.AxRn.LGxrN;
import defpackage.hfb0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001a\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0015JJ\u0010\u001b\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001cJ\u0014\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010 \u001a\u00020\nHÖ\u0081\u0004J\n\u0010!\u001a\u00020\bHÖ\u0081\u0004R-\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR-\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000eR'\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R)\u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u0092\u0002\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\t¢\u0006\n\n\u0002\u0010\u0016\u001a\u0004\b\u0014\u0010\u0015Ê\u0001\u0002\b#Ê\u0001\f\b$\u0012\b\b%\u0012\u0004\b\u0003\u0010\u0002¨\u0006\""}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodes;", "", "items", "", "Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodeItem;", "sections", "Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedSection;", "nextCursor", "", "followingPoolSize", "", "<init>", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "getSections", "getNextCursor", "()Ljava/lang/String;", "getFollowingPoolSize", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/Integer;)Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedCodes;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialSuggestedCodes {
    public static final int $stable = 0;

    @SerializedName("followingPoolSize")
    private final Integer followingPoolSize;

    @SerializedName("items")
    private final List<SocialSuggestedCodeItem> items;

    @SerializedName("nextCursor")
    private final String nextCursor;

    @SerializedName("sections")
    private final List<SocialSuggestedSection> sections;

    public /* synthetic */ SocialSuggestedCodes(List list, List list2, String str, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : list, (i & 2) != 0 ? null : list2, (i & 4) != 0 ? null : str, (i & 8) != 0 ? null : num);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SocialSuggestedCodes copy$default(SocialSuggestedCodes socialSuggestedCodes, List list, List list2, String str, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            list = socialSuggestedCodes.items;
        }
        if ((i & 2) != 0) {
            list2 = socialSuggestedCodes.sections;
        }
        if ((i & 4) != 0) {
            str = socialSuggestedCodes.nextCursor;
        }
        if ((i & 8) != 0) {
            num = socialSuggestedCodes.followingPoolSize;
        }
        return socialSuggestedCodes.copy(list, list2, str, num);
    }

    public final List<SocialSuggestedCodeItem> component1() {
        return this.items;
    }

    public final List<SocialSuggestedSection> component2() {
        return this.sections;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getNextCursor() {
        return this.nextCursor;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final Integer getFollowingPoolSize() {
        return this.followingPoolSize;
    }

    public final SocialSuggestedCodes copy(List<SocialSuggestedCodeItem> items, List<SocialSuggestedSection> sections, String nextCursor, Integer followingPoolSize) {
        return new SocialSuggestedCodes(items, sections, nextCursor, followingPoolSize);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialSuggestedCodes)) {
            return false;
        }
        SocialSuggestedCodes socialSuggestedCodes = (SocialSuggestedCodes) other;
        return Intrinsics.g(this.items, socialSuggestedCodes.items) && Intrinsics.g(this.sections, socialSuggestedCodes.sections) && Intrinsics.g(this.nextCursor, socialSuggestedCodes.nextCursor) && Intrinsics.g(this.followingPoolSize, socialSuggestedCodes.followingPoolSize);
    }

    public final Integer getFollowingPoolSize() {
        return this.followingPoolSize;
    }

    public final List<SocialSuggestedCodeItem> getItems() {
        return this.items;
    }

    public final String getNextCursor() {
        return this.nextCursor;
    }

    public final List<SocialSuggestedSection> getSections() {
        return this.sections;
    }

    public int hashCode() {
        List<SocialSuggestedCodeItem> list = this.items;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<SocialSuggestedSection> list2 = this.sections;
        int iHashCode2 = (iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str = this.nextCursor;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.followingPoolSize;
        return iHashCode3 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        List<SocialSuggestedCodeItem> list = this.items;
        List<SocialSuggestedSection> list2 = this.sections;
        String str = this.nextCursor;
        Integer num = this.followingPoolSize;
        StringBuilder sbA = hfb0.a(LGxrN.prL, ", sections=", ", nextCursor=", list, list2);
        sbA.append(str);
        sbA.append(", followingPoolSize=");
        sbA.append(num);
        sbA.append(")");
        return sbA.toString();
    }

    public SocialSuggestedCodes(List<SocialSuggestedCodeItem> list, List<SocialSuggestedSection> list2, String str, Integer num) {
        this.items = list;
        this.sections = list2;
        this.nextCursor = str;
        this.followingPoolSize = num;
    }

    public SocialSuggestedCodes() {
        this(null, null, null, null, 15, null);
    }
}
