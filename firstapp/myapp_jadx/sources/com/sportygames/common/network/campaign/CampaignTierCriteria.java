package com.sportygames.common.network.campaign;

import defpackage.gmf0;
import defpackage.o8i;
import defpackage.tvh;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\"\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J%\u0010\u001b\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\tHÆ\u0003J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0003J]\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032$\b\u0002\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R-\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\bj\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003`\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lcom/sportygames/common/network/campaign/CampaignTierCriteria;", "", "title", "", "progress", "", "type", "valueMap", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "conditions", "", "Lcom/sportygames/common/network/campaign/CampaignTierCriteriaCondition;", "<init>", "(Ljava/lang/String;FLjava/lang/String;Ljava/util/HashMap;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getProgress", "()F", "getType", "getValueMap", "()Ljava/util/HashMap;", "getConditions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "common_sportybetRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class CampaignTierCriteria {
    private final List<CampaignTierCriteriaCondition> conditions;
    private final float progress;
    private final String title;
    private final String type;
    private final HashMap<String, String> valueMap;

    public CampaignTierCriteria(String str, float f, String str2, HashMap<String, String> map, List<CampaignTierCriteriaCondition> list) {
        str.getClass();
        str2.getClass();
        map.getClass();
        list.getClass();
        this.title = str;
        this.progress = f;
        this.type = str2;
        this.valueMap = map;
        this.conditions = list;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CampaignTierCriteria copy$default(CampaignTierCriteria campaignTierCriteria, String str, float f, String str2, HashMap map, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = campaignTierCriteria.title;
        }
        if ((i & 2) != 0) {
            f = campaignTierCriteria.progress;
        }
        if ((i & 4) != 0) {
            str2 = campaignTierCriteria.type;
        }
        if ((i & 8) != 0) {
            map = campaignTierCriteria.valueMap;
        }
        if ((i & 16) != 0) {
            list = campaignTierCriteria.conditions;
        }
        List list2 = list;
        String str3 = str2;
        return campaignTierCriteria.copy(str, f, str3, map, list2);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final float getProgress() {
        return this.progress;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final HashMap<String, String> component4() {
        return this.valueMap;
    }

    public final List<CampaignTierCriteriaCondition> component5() {
        return this.conditions;
    }

    public final CampaignTierCriteria copy(String title, float progress, String type, HashMap<String, String> valueMap, List<CampaignTierCriteriaCondition> conditions) {
        title.getClass();
        type.getClass();
        valueMap.getClass();
        conditions.getClass();
        return new CampaignTierCriteria(title, progress, type, valueMap, conditions);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CampaignTierCriteria)) {
            return false;
        }
        CampaignTierCriteria campaignTierCriteria = (CampaignTierCriteria) other;
        return Intrinsics.g(this.title, campaignTierCriteria.title) && Float.compare(this.progress, campaignTierCriteria.progress) == 0 && Intrinsics.g(this.type, campaignTierCriteria.type) && Intrinsics.g(this.valueMap, campaignTierCriteria.valueMap) && Intrinsics.g(this.conditions, campaignTierCriteria.conditions);
    }

    public final List<CampaignTierCriteriaCondition> getConditions() {
        return this.conditions;
    }

    public final float getProgress() {
        return this.progress;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getType() {
        return this.type;
    }

    public final HashMap<String, String> getValueMap() {
        return this.valueMap;
    }

    public int hashCode() {
        return this.conditions.hashCode() + ((this.valueMap.hashCode() + gmf0.a(tvh.a(this.progress, this.title.hashCode() * 31, 31), 31, this.type)) * 31);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CampaignTierCriteria(title=");
        sb.append(this.title);
        sb.append(", progress=");
        sb.append(this.progress);
        sb.append(", type=");
        sb.append(this.type);
        sb.append(", valueMap=");
        sb.append(this.valueMap);
        sb.append(", conditions=");
        return o8i.a(sb, this.conditions, ')');
    }
}
