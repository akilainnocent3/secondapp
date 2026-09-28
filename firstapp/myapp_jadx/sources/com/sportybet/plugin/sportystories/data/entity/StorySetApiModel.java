package com.sportybet.plugin.sportystories.data.entity;

import defpackage.at6;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.m2g;
import defpackage.qn4;
import defpackage.ux5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\nHÆ\u0003J\u000f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003Ja\u0010#\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\n2\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0014\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010'\u001a\u00020\nHÖ\u0081\u0004J\n\u0010(\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aÊ\u0001\u0002\b*Ê\u0001\f\b+\u0012\b\b,\u0012\u0004\b\u0003\u0010\u0000¨\u0006)"}, d2 = {"Lcom/sportybet/plugin/sportystories/data/entity/StorySetApiModel;", "", "boId", "", "title", "titleCmsTranslationKey", "thumbnailUrl", "startTime", "endTime", "sortOrder", "", "stories", "", "Lcom/sportybet/plugin/sportystories/data/entity/StoryApiModel;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/util/List;)V", "getBoId", "()Ljava/lang/String;", "getTitle", "getTitleCmsTranslationKey", "getThumbnailUrl", "getStartTime", "getEndTime", "getSortOrder", "()I", "getStories", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StorySetApiModel {
    public static final int $stable = 8;
    private final String boId;
    private final String endTime;
    private final int sortOrder;
    private final String startTime;
    private final List<StoryApiModel> stories;
    private final String thumbnailUrl;
    private final String title;
    private final String titleCmsTranslationKey;

    public StorySetApiModel(String str, String str2, String str3, String str4, String str5, String str6, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i2 & 4) != 0 ? null : str3, str4, str5, str6, i, (i2 & 128) != 0 ? m2g.a : list);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StorySetApiModel copy$default(StorySetApiModel storySetApiModel, String str, String str2, String str3, String str4, String str5, String str6, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = storySetApiModel.boId;
        }
        if ((i2 & 2) != 0) {
            str2 = storySetApiModel.title;
        }
        if ((i2 & 4) != 0) {
            str3 = storySetApiModel.titleCmsTranslationKey;
        }
        if ((i2 & 8) != 0) {
            str4 = storySetApiModel.thumbnailUrl;
        }
        if ((i2 & 16) != 0) {
            str5 = storySetApiModel.startTime;
        }
        if ((i2 & 32) != 0) {
            str6 = storySetApiModel.endTime;
        }
        if ((i2 & 64) != 0) {
            i = storySetApiModel.sortOrder;
        }
        if ((i2 & 128) != 0) {
            list = storySetApiModel.stories;
        }
        int i3 = i;
        List list2 = list;
        String str7 = str5;
        String str8 = str6;
        return storySetApiModel.copy(str, str2, str3, str4, str7, str8, i3, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getBoId() {
        return this.boId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getTitleCmsTranslationKey() {
        return this.titleCmsTranslationKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final String getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final List<StoryApiModel> component8() {
        return this.stories;
    }

    public final StorySetApiModel copy(String boId, String title, String titleCmsTranslationKey, String thumbnailUrl, String startTime, String endTime, int sortOrder, List<StoryApiModel> stories) {
        qn4.b(boId, title, thumbnailUrl, startTime, endTime);
        stories.getClass();
        return new StorySetApiModel(boId, title, titleCmsTranslationKey, thumbnailUrl, startTime, endTime, sortOrder, stories);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StorySetApiModel)) {
            return false;
        }
        StorySetApiModel storySetApiModel = (StorySetApiModel) other;
        return Intrinsics.g(this.boId, storySetApiModel.boId) && Intrinsics.g(this.title, storySetApiModel.title) && Intrinsics.g(this.titleCmsTranslationKey, storySetApiModel.titleCmsTranslationKey) && Intrinsics.g(this.thumbnailUrl, storySetApiModel.thumbnailUrl) && Intrinsics.g(this.startTime, storySetApiModel.startTime) && Intrinsics.g(this.endTime, storySetApiModel.endTime) && this.sortOrder == storySetApiModel.sortOrder && Intrinsics.g(this.stories, storySetApiModel.stories);
    }

    public final String getBoId() {
        return this.boId;
    }

    public final String getEndTime() {
        return this.endTime;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final String getStartTime() {
        return this.startTime;
    }

    public final List<StoryApiModel> getStories() {
        return this.stories;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleCmsTranslationKey() {
        return this.titleCmsTranslationKey;
    }

    public int hashCode() {
        int iA = gmf0.a(this.boId.hashCode() * 31, 31, this.title);
        String str = this.titleCmsTranslationKey;
        return this.stories.hashCode() + gpp.a(this.sortOrder, gmf0.a(gmf0.a(gmf0.a((iA + (str == null ? 0 : str.hashCode())) * 31, 31, this.thumbnailUrl), 31, this.startTime), 31, this.endTime), 31);
    }

    public String toString() {
        String str = this.boId;
        String str2 = this.title;
        String str3 = this.titleCmsTranslationKey;
        String str4 = this.thumbnailUrl;
        String str5 = this.startTime;
        String str6 = this.endTime;
        int i = this.sortOrder;
        List<StoryApiModel> list = this.stories;
        StringBuilder sbA = ux5.a("StorySetApiModel(boId=", str, ", title=", str2, ", titleCmsTranslationKey=");
        hxa.c(sbA, str3, ", thumbnailUrl=", str4, ", startTime=");
        hxa.c(sbA, str5, ", endTime=", str6, ", sortOrder=");
        return at6.b(sbA, i, ", stories=", list, ")");
    }

    public StorySetApiModel(String str, String str2, String str3, String str4, String str5, String str6, int i, List<StoryApiModel> list) {
        qn4.b(str, str2, str4, str5, str6);
        list.getClass();
        this.boId = str;
        this.title = str2;
        this.titleCmsTranslationKey = str3;
        this.thumbnailUrl = str4;
        this.startTime = str5;
        this.endTime = str6;
        this.sortOrder = i;
        this.stories = list;
    }
}
