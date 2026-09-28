package com.sportybet.plugin.sportystories.data.entity;

import com.google.gson.annotations.SerializedName;
import defpackage.at6;
import defpackage.gpp;
import defpackage.ml5;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR+\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004\u0092\u0002\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012Ê\u0001\u0002\b!Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0000¨\u0006 "}, d2 = {"Lcom/sportybet/plugin/sportystories/data/entity/StoryApiModel;", "", "mediaUrl", "", "durationSec", "", "sortOrder", "widgetList", "", "Lcom/sportybet/plugin/sportystories/data/entity/WidgetApiModel;", "<init>", "(Ljava/lang/String;IILjava/util/List;)V", "getMediaUrl", "()Ljava/lang/String;", "getDurationSec", "()I", "getSortOrder", "getWidgetList", "()Ljava/util/List;", "Lcom/google/gson/annotations/SerializedName;", "value", "ctaConfig", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class StoryApiModel {
    public static final int $stable = 8;
    private final int durationSec;
    private final String mediaUrl;
    private final int sortOrder;

    @SerializedName("ctaConfig")
    private final List<WidgetApiModel> widgetList;

    public StoryApiModel(String str, int i, int i2, List<WidgetApiModel> list) {
        str.getClass();
        list.getClass();
        this.mediaUrl = str;
        this.durationSec = i;
        this.sortOrder = i2;
        this.widgetList = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StoryApiModel copy$default(StoryApiModel storyApiModel, String str, int i, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = storyApiModel.mediaUrl;
        }
        if ((i3 & 2) != 0) {
            i = storyApiModel.durationSec;
        }
        if ((i3 & 4) != 0) {
            i2 = storyApiModel.sortOrder;
        }
        if ((i3 & 8) != 0) {
            list = storyApiModel.widgetList;
        }
        return storyApiModel.copy(str, i, i2, list);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final int getDurationSec() {
        return this.durationSec;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final List<WidgetApiModel> component4() {
        return this.widgetList;
    }

    public final StoryApiModel copy(String mediaUrl, int durationSec, int sortOrder, List<WidgetApiModel> widgetList) {
        mediaUrl.getClass();
        widgetList.getClass();
        return new StoryApiModel(mediaUrl, durationSec, sortOrder, widgetList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StoryApiModel)) {
            return false;
        }
        StoryApiModel storyApiModel = (StoryApiModel) other;
        return Intrinsics.g(this.mediaUrl, storyApiModel.mediaUrl) && this.durationSec == storyApiModel.durationSec && this.sortOrder == storyApiModel.sortOrder && Intrinsics.g(this.widgetList, storyApiModel.widgetList);
    }

    public final int getDurationSec() {
        return this.durationSec;
    }

    public final String getMediaUrl() {
        return this.mediaUrl;
    }

    public final int getSortOrder() {
        return this.sortOrder;
    }

    public final List<WidgetApiModel> getWidgetList() {
        return this.widgetList;
    }

    public int hashCode() {
        return this.widgetList.hashCode() + gpp.a(this.sortOrder, gpp.a(this.durationSec, this.mediaUrl.hashCode() * 31, 31), 31);
    }

    public String toString() {
        String str = this.mediaUrl;
        int i = this.durationSec;
        return at6.b(ml5.a(i, "StoryApiModel(mediaUrl=", str, ", durationSec=", ", sortOrder="), this.sortOrder, ", widgetList=", this.widgetList, ")");
    }
}
