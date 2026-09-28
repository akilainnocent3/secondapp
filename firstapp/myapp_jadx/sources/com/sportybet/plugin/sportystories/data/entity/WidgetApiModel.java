package com.sportybet.plugin.sportystories.data.entity;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import defpackage.gpp;
import defpackage.hxa;
import defpackage.kwi;
import defpackage.ml5;
import defpackage.ux5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J5\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0014\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u0018\u001a\u00020\u0019HÖ\u0081\u0004J\n\u0010\u001a\u001a\u00020\u0003HÖ\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fÊ\u0001\u0002\b\u001dÊ\u0001\f\b\u001e\u0012\b\b\u001f\u0012\u0004\b\u0003\u0010\u0002¨\u0006\u001c"}, d2 = {"Lcom/sportybet/plugin/sportystories/data/entity/WidgetApiModel;", "", "type", "", "defaultText", "cmsTranslationKey", "additionalProperties", "Lcom/sportybet/plugin/sportystories/data/entity/WidgetApiModel$AdditionalProperties;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sportybet/plugin/sportystories/data/entity/WidgetApiModel$AdditionalProperties;)V", "getType", "()Ljava/lang/String;", "getDefaultText", "getCmsTranslationKey", "getAdditionalProperties", "()Lcom/sportybet/plugin/sportystories/data/entity/WidgetApiModel$AdditionalProperties;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "AdditionalProperties", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final /* data */ class WidgetApiModel {
    public static final int $stable = 0;
    private final AdditionalProperties additionalProperties;
    private final String cmsTranslationKey;
    private final String defaultText;
    private final String type;

    public WidgetApiModel(String str, String str2, String str3, AdditionalProperties additionalProperties) {
        str.getClass();
        additionalProperties.getClass();
        this.type = str;
        this.defaultText = str2;
        this.cmsTranslationKey = str3;
        this.additionalProperties = additionalProperties;
    }

    public static /* synthetic */ WidgetApiModel copy$default(WidgetApiModel widgetApiModel, String str, String str2, String str3, AdditionalProperties additionalProperties, int i, Object obj) {
        if ((i & 1) != 0) {
            str = widgetApiModel.type;
        }
        if ((i & 2) != 0) {
            str2 = widgetApiModel.defaultText;
        }
        if ((i & 4) != 0) {
            str3 = widgetApiModel.cmsTranslationKey;
        }
        if ((i & 8) != 0) {
            additionalProperties = widgetApiModel.additionalProperties;
        }
        return widgetApiModel.copy(str, str2, str3, additionalProperties);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getDefaultText() {
        return this.defaultText;
    }

    /* JADX INFO: renamed from: component3, reason: from getter */
    public final String getCmsTranslationKey() {
        return this.cmsTranslationKey;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final AdditionalProperties getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final WidgetApiModel copy(String type, String defaultText, String cmsTranslationKey, AdditionalProperties additionalProperties) {
        type.getClass();
        additionalProperties.getClass();
        return new WidgetApiModel(type, defaultText, cmsTranslationKey, additionalProperties);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WidgetApiModel)) {
            return false;
        }
        WidgetApiModel widgetApiModel = (WidgetApiModel) other;
        return Intrinsics.g(this.type, widgetApiModel.type) && Intrinsics.g(this.defaultText, widgetApiModel.defaultText) && Intrinsics.g(this.cmsTranslationKey, widgetApiModel.cmsTranslationKey) && Intrinsics.g(this.additionalProperties, widgetApiModel.additionalProperties);
    }

    public final AdditionalProperties getAdditionalProperties() {
        return this.additionalProperties;
    }

    public final String getCmsTranslationKey() {
        return this.cmsTranslationKey;
    }

    public final String getDefaultText() {
        return this.defaultText;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        int iHashCode = this.type.hashCode() * 31;
        String str = this.defaultText;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.cmsTranslationKey;
        return this.additionalProperties.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public String toString() {
        String str = this.type;
        String str2 = this.defaultText;
        String str3 = this.cmsTranslationKey;
        AdditionalProperties additionalProperties = this.additionalProperties;
        StringBuilder sbA = ux5.a("WidgetApiModel(type=", str, ", defaultText=", str2, ", cmsTranslationKey=");
        sbA.append(str3);
        sbA.append(", additionalProperties=");
        sbA.append(additionalProperties);
        sbA.append(")");
        return sbA.toString();
    }

    public /* synthetic */ WidgetApiModel(String str, String str2, String str3, AdditionalProperties additionalProperties, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, additionalProperties);
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0005HÖ\u0081\u0004J\n\u0010\u001f\u001a\u00020\u0003HÖ\u0081\u0004R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rÊ\u0001\u0002\b!Ê\u0001\f\b\"\u0012\b\b#\u0012\u0004\b\u0003\u0010\u0002¨\u0006 "}, d2 = {"Lcom/sportybet/plugin/sportystories/data/entity/WidgetApiModel$AdditionalProperties;", "", "position", "", "sortOrder", "", "redirectUrl", "androidRedirectUrl", "width", AnalyticsParam.EVENT_PARAM_PAGE_VIEW_EVENT_ID, "<init>", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPosition", "()Ljava/lang/String;", "getSortOrder", "()I", "getRedirectUrl", "getAndroidRedirectUrl", "getWidth", "getEventId", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "africa-bet-android", "Landroidx/annotation/Keep;", "Landroidx/compose/runtime/internal/StabilityInferred;", "parameters"}, k = 1, mv = {2, 4, 0}, xi = 48)
    public static final /* data */ class AdditionalProperties {
        public static final int $stable = 0;
        private final String androidRedirectUrl;
        private final String eventId;
        private final String position;
        private final String redirectUrl;
        private final int sortOrder;
        private final String width;

        public /* synthetic */ AdditionalProperties(String str, int i, String str2, String str3, String str4, String str5, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? null : str, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : str2, (i2 & 8) != 0 ? null : str3, (i2 & 16) != 0 ? null : str4, (i2 & 32) != 0 ? null : str5);
        }

        public static /* synthetic */ AdditionalProperties copy$default(AdditionalProperties additionalProperties, String str, int i, String str2, String str3, String str4, String str5, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = additionalProperties.position;
            }
            if ((i2 & 2) != 0) {
                i = additionalProperties.sortOrder;
            }
            if ((i2 & 4) != 0) {
                str2 = additionalProperties.redirectUrl;
            }
            if ((i2 & 8) != 0) {
                str3 = additionalProperties.androidRedirectUrl;
            }
            if ((i2 & 16) != 0) {
                str4 = additionalProperties.width;
            }
            if ((i2 & 32) != 0) {
                str5 = additionalProperties.eventId;
            }
            String str6 = str4;
            String str7 = str5;
            return additionalProperties.copy(str, i, str2, str3, str6, str7);
        }

        /* JADX INFO: renamed from: component1, reason: from getter */
        public final String getPosition() {
            return this.position;
        }

        /* JADX INFO: renamed from: component2, reason: from getter */
        public final int getSortOrder() {
            return this.sortOrder;
        }

        /* JADX INFO: renamed from: component3, reason: from getter */
        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        /* JADX INFO: renamed from: component4, reason: from getter */
        public final String getAndroidRedirectUrl() {
            return this.androidRedirectUrl;
        }

        /* JADX INFO: renamed from: component5, reason: from getter */
        public final String getWidth() {
            return this.width;
        }

        /* JADX INFO: renamed from: component6, reason: from getter */
        public final String getEventId() {
            return this.eventId;
        }

        public final AdditionalProperties copy(String position, int sortOrder, String redirectUrl, String androidRedirectUrl, String width, String eventId) {
            return new AdditionalProperties(position, sortOrder, redirectUrl, androidRedirectUrl, width, eventId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdditionalProperties)) {
                return false;
            }
            AdditionalProperties additionalProperties = (AdditionalProperties) other;
            return Intrinsics.g(this.position, additionalProperties.position) && this.sortOrder == additionalProperties.sortOrder && Intrinsics.g(this.redirectUrl, additionalProperties.redirectUrl) && Intrinsics.g(this.androidRedirectUrl, additionalProperties.androidRedirectUrl) && Intrinsics.g(this.width, additionalProperties.width) && Intrinsics.g(this.eventId, additionalProperties.eventId);
        }

        public final String getAndroidRedirectUrl() {
            return this.androidRedirectUrl;
        }

        public final String getEventId() {
            return this.eventId;
        }

        public final String getPosition() {
            return this.position;
        }

        public final String getRedirectUrl() {
            return this.redirectUrl;
        }

        public final int getSortOrder() {
            return this.sortOrder;
        }

        public final String getWidth() {
            return this.width;
        }

        public int hashCode() {
            String str = this.position;
            int iA = gpp.a(this.sortOrder, (str == null ? 0 : str.hashCode()) * 31, 31);
            String str2 = this.redirectUrl;
            int iHashCode = (iA + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.androidRedirectUrl;
            int iHashCode2 = (iHashCode + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.width;
            int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.eventId;
            return iHashCode3 + (str5 != null ? str5.hashCode() : 0);
        }

        public String toString() {
            String str = this.position;
            int i = this.sortOrder;
            String str2 = this.redirectUrl;
            String str3 = this.androidRedirectUrl;
            String str4 = this.width;
            String str5 = this.eventId;
            StringBuilder sbA = ml5.a(i, "AdditionalProperties(position=", str, ", sortOrder=", ", redirectUrl=");
            hxa.c(sbA, str2, ", androidRedirectUrl=", str3, ", width=");
            return kwi.a(sbA, str4, ", eventId=", str5, ")");
        }

        public AdditionalProperties(String str, int i, String str2, String str3, String str4, String str5) {
            this.position = str;
            this.sortOrder = i;
            this.redirectUrl = str2;
            this.androidRedirectUrl = str3;
            this.width = str4;
            this.eventId = str5;
        }

        public AdditionalProperties() {
            this(null, 0, null, null, null, null, 63, null);
        }
    }
}
