package com.sportybet.android.social.data.remote.entity;

import com.appsflyer.internal.v;
import com.google.gson.annotations.SerializedName;
import defpackage.ew7;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ\u0010\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000eJ2\u0010\u0014\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0015J\u0014\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0019\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R'\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0002¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR)\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0004¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\r\u0010\u000eR)\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004\u0092\u0002\f\b\u000b\u0012\b\b\f\u0012\u0004\b\b(\u0006¢\u0006\n\n\u0002\u0010\u000f\u001a\u0004\b\u0010\u0010\u000eÊ\u0001\u0002\b\u001cÊ\u0001\f\b\u001d\u0012\b\b\u001e\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001b"}, d2 = {"Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedSection;", "", "section", "", "from", "", "to", "<init>", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getSection", "()Ljava/lang/String;", "Lcom/google/gson/annotations/SerializedName;", "value", "getFrom", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTo", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/sportybet/android/social/data/remote/entity/SocialSuggestedSection;", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class SocialSuggestedSection {
    public static final int $stable = 0;

    @SerializedName("from")
    private final Integer from;

    @SerializedName("section")
    private final String section;

    @SerializedName("to")
    private final Integer to;

    public /* synthetic */ SocialSuggestedSection(String str, Integer num, Integer num2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : num, (i & 4) != 0 ? null : num2);
    }

    public static /* synthetic */ SocialSuggestedSection copy$default(SocialSuggestedSection socialSuggestedSection, String str, Integer num, Integer num2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = socialSuggestedSection.section;
        }
        if ((i & 2) != 0) {
            num = socialSuggestedSection.from;
        }
        if ((i & 4) != 0) {
            num2 = socialSuggestedSection.to;
        }
        return socialSuggestedSection.copy(str, num, num2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getSection() {
        return this.section;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final Integer getFrom() {
        return this.from;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final Integer getTo() {
        return this.to;
    }

    public final SocialSuggestedSection copy(String section, Integer from, Integer to) {
        return new SocialSuggestedSection(section, from, to);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SocialSuggestedSection)) {
            return false;
        }
        SocialSuggestedSection socialSuggestedSection = (SocialSuggestedSection) other;
        return Intrinsics.g(this.section, socialSuggestedSection.section) && Intrinsics.g(this.from, socialSuggestedSection.from) && Intrinsics.g(this.to, socialSuggestedSection.to);
    }

    public final Integer getFrom() {
        return this.from;
    }

    public final String getSection() {
        return this.section;
    }

    public final Integer getTo() {
        return this.to;
    }

    public int hashCode() {
        String str = this.section;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.from;
        int iHashCode2 = (iHashCode + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.to;
        return iHashCode2 + (num2 != null ? num2.hashCode() : 0);
    }

    public String toString() {
        String str = this.section;
        Integer num = this.from;
        return v.a(ew7.a(num, "SocialSuggestedSection(section=", str, ", from=", ", to="), this.to, ")");
    }

    public SocialSuggestedSection(String str, Integer num, Integer num2) {
        this.section = str;
        this.from = num;
        this.to = num2;
    }

    public SocialSuggestedSection() {
        this(null, null, null, 7, null);
    }
}
