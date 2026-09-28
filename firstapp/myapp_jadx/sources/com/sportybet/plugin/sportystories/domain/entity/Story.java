package com.sportybet.plugin.sportystories.domain.entity;

import defpackage.d5d;
import defpackage.gmf0;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.ux5;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.d;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\u0018\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0015J\u0010\u0010\u0019\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\"\u0010\u001f\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J|\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u00072\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\f\u001a\u00020\n2\u001a\b\u0002\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\rHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b$\u0010\u001dJ\u001a\u0010'\u001a\u00020&2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b-\u0010\u0015R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010.\u001a\u0004\b/\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010.\u001a\u0004\b0\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001dR\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b3\u0010\u001dR)\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0011\u00104\u001a\u0004\b5\u0010 ¨\u00066"}, d2 = {"Lcom/sportybet/plugin/sportystories/domain/entity/Story;", "", "", "storyId", "imageUrl", "thumbnailUrl", "title", "Lkotlin/time/d;", "startTime", "endTime", "", "sortOrder", "durationSec", "", "Lcom/sportybet/plugin/sportystories/domain/entity/WidgetPosition;", "", "Lcom/sportybet/plugin/sportystories/domain/entity/StoryWidget;", "widgets", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/d;Lkotlin/time/d;IILjava/util/Map;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "()Lkotlin/time/d;", "component6", "component7", "()I", "component8", "component9", "()Ljava/util/Map;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/time/d;Lkotlin/time/d;IILjava/util/Map;)Lcom/sportybet/plugin/sportystories/domain/entity/Story;", "toString", "hashCode", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getStoryId", "getImageUrl", "getThumbnailUrl", "getTitle", "Lkotlin/time/d;", "getStartTime", "getEndTime", "I", "getSortOrder", "getDurationSec", "Ljava/util/Map;", "getWidgets", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class Story {
    public static final int $stable = 8;
    private final int durationSec;
    private final d endTime;
    private final String imageUrl;
    private final int sortOrder;
    private final d startTime;
    private final String storyId;
    private final String thumbnailUrl;
    private final String title;
    private final Map<WidgetPosition, List<StoryWidget>> widgets;

    /* JADX WARN: Multi-variable type inference failed */
    public Story(String str, String str2, String str3, String str4, d dVar, d dVar2, int i, int i2, Map<WidgetPosition, ? extends List<? extends StoryWidget>> map) {
        str.getClass();
        str2.getClass();
        str3.getClass();
        str4.getClass();
        dVar.getClass();
        dVar2.getClass();
        map.getClass();
        this.storyId = str;
        this.imageUrl = str2;
        this.thumbnailUrl = str3;
        this.title = str4;
        this.startTime = dVar;
        this.endTime = dVar2;
        this.sortOrder = i;
        this.durationSec = i2;
        this.widgets = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Story copy$default(Story story, String str, String str2, String str3, String str4, d dVar, d dVar2, int i, int i2, Map map, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = story.storyId;
        }
        if ((i3 & 2) != 0) {
            str2 = story.imageUrl;
        }
        if ((i3 & 4) != 0) {
            str3 = story.thumbnailUrl;
        }
        if ((i3 & 8) != 0) {
            str4 = story.title;
        }
        if ((i3 & 16) != 0) {
            dVar = story.startTime;
        }
        if ((i3 & 32) != 0) {
            dVar2 = story.endTime;
        }
        if ((i3 & 64) != 0) {
            i = story.sortOrder;
        }
        if ((i3 & 128) != 0) {
            i2 = story.durationSec;
        }
        if ((i3 & 256) != 0) {
            map = story.widgets;
        }
        int i4 = i2;
        Map map2 = map;
        d dVar3 = dVar2;
        int i5 = i;
        d dVar4 = dVar;
        String str5 = str3;
        return story.copy(str, str2, str5, str4, dVar4, dVar3, i5, i4, map2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getStoryId() {
        return this.storyId;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getImageUrl() {
        return this.imageUrl;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final d getStartTime() {
        return this.startTime;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final d getEndTime() {
        return this.endTime;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    /* JADX INFO: renamed from: component8, reason: from getter */
    public final int getDurationSec() {
        return this.durationSec;
    }

    public final Map<WidgetPosition, List<StoryWidget>> component9() {
        return this.widgets;
    }

    public final Story copy(String storyId, String imageUrl, String thumbnailUrl, String title, d startTime, d endTime, int sortOrder, int durationSec, Map<WidgetPosition, ? extends List<? extends StoryWidget>> widgets) {
        storyId.getClass();
        imageUrl.getClass();
        thumbnailUrl.getClass();
        title.getClass();
        startTime.getClass();
        endTime.getClass();
        widgets.getClass();
        return new Story(storyId, imageUrl, thumbnailUrl, title, startTime, endTime, sortOrder, durationSec, widgets);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Story)) {
            return false;
        }
        Story story = (Story) other;
        return Intrinsics.g(this.storyId, story.storyId) && Intrinsics.g(this.imageUrl, story.imageUrl) && Intrinsics.g(this.thumbnailUrl, story.thumbnailUrl) && Intrinsics.g(this.title, story.title) && Intrinsics.g(this.startTime, story.startTime) && Intrinsics.g(this.endTime, story.endTime) && this.sortOrder == story.sortOrder && this.durationSec == story.durationSec && Intrinsics.g(this.widgets, story.widgets);
    }

    public final int getDurationSec() {
        return this.durationSec;
    }

    public final d getEndTime() {
        return this.endTime;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final d getStartTime() {
        return this.startTime;
    }

    public final String getStoryId() {
        return this.storyId;
    }

    public final String getThumbnailUrl() {
        return this.thumbnailUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Map<WidgetPosition, List<StoryWidget>> getWidgets() {
        return this.widgets;
    }

    public int hashCode() {
        return this.widgets.hashCode() + gpp.a(this.durationSec, gpp.a(this.sortOrder, (this.endTime.hashCode() + ((this.startTime.hashCode() + gmf0.a(gmf0.a(gmf0.a(this.storyId.hashCode() * 31, 31, this.imageUrl), 31, this.thumbnailUrl), 31, this.title)) * 31)) * 31, 31), 31);
    }

    public String toString() {
        String str = this.storyId;
        String str2 = this.imageUrl;
        String str3 = this.thumbnailUrl;
        String str4 = this.title;
        d dVar = this.startTime;
        d dVar2 = this.endTime;
        int i = this.sortOrder;
        int i2 = this.durationSec;
        Map<WidgetPosition, List<StoryWidget>> map = this.widgets;
        StringBuilder sbA = ux5.a("Story(storyId=", str, ", imageUrl=", str2, ", thumbnailUrl=");
        hxa.c(sbA, str3, ", title=", str4, ", startTime=");
        sbA.append(dVar);
        sbA.append(", endTime=");
        sbA.append(dVar2);
        sbA.append(", sortOrder=");
        d5d.a(sbA, i, ", durationSec=", i2, ", widgets=");
        sbA.append(map);
        sbA.append(")");
        return sbA.toString();
    }
}
