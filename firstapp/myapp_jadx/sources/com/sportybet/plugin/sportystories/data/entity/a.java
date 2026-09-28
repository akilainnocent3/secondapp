package com.sportybet.plugin.sportystories.data.entity;

import com.sportybet.plugin.sportystories.domain.entity.StoryWidget;
import com.sportybet.plugin.sportystories.domain.entity.WidgetPosition;
import defpackage.n8v;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
public final class a {
    /* JADX WARN: Code duplicated, block: B:34:0x006e A[PHI: r9
      0x006e: PHI (r9v11 java.lang.String) = (r9v1 java.lang.String), (r9v14 java.lang.String) binds: [B:36:0x0074, B:33:0x006c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:35:0x0070  */
    /* JADX WARN: Code duplicated, block: B:75:0x012e  */
    public static final Pair<WidgetPosition, StoryWidget> a(WidgetApiModel widgetApiModel, Map<String, String> map) {
        Float fValueOf;
        WidgetPosition widgetPosition;
        String defaultText;
        String str;
        float fFloatValue;
        String str2;
        Integer intOrNull;
        widgetApiModel.getClass();
        WidgetPosition[] widgetPositionArrValues = WidgetPosition.values();
        int length = widgetPositionArrValues.length;
        int i = 0;
        while (true) {
            fValueOf = null;
            if (i >= length) {
                widgetPosition = null;
                break;
            }
            widgetPosition = widgetPositionArrValues[i];
            if (c.l(widgetPosition.name(), widgetApiModel.getAdditionalProperties().getPosition(), true)) {
                break;
            }
            i++;
        }
        if (widgetPosition != null) {
            String androidRedirectUrl = widgetApiModel.getAdditionalProperties().getAndroidRedirectUrl();
            if (androidRedirectUrl == null && (androidRedirectUrl = widgetApiModel.getAdditionalProperties().getRedirectUrl()) == null) {
                androidRedirectUrl = "";
            }
            String eventId = widgetApiModel.getAdditionalProperties().getEventId();
            if (eventId == null) {
                eventId = "";
            }
            String cmsTranslationKey = widgetApiModel.getCmsTranslationKey();
            if (cmsTranslationKey == null) {
                defaultText = widgetApiModel.getDefaultText();
                str = defaultText != null ? defaultText : "";
            } else {
                if (StringsKt.U(cmsTranslationKey)) {
                    cmsTranslationKey = null;
                }
                if (cmsTranslationKey == null || (defaultText = map.get(cmsTranslationKey)) == null) {
                    defaultText = widgetApiModel.getDefaultText();
                    if (defaultText != null) {
                    }
                } else {
                    if (StringsKt.U(defaultText)) {
                        defaultText = null;
                    }
                    if (defaultText == null) {
                        defaultText = widgetApiModel.getDefaultText();
                        if (defaultText != null) {
                        }
                    }
                }
            }
            String type = widgetApiModel.getType();
            int iHashCode = type.hashCode();
            if (iHashCode != -1377687758) {
                if (iHashCode != -1062505929) {
                    if (iHashCode != 3273) {
                        if (iHashCode == 3274 && type.equals("h2")) {
                            return new Pair<>(widgetPosition, new StoryWidget.d(str, widgetApiModel.getAdditionalProperties().getSortOrder()));
                        }
                    } else if (type.equals("h1")) {
                        return new Pair<>(widgetPosition, new StoryWidget.c(str, widgetApiModel.getAdditionalProperties().getSortOrder()));
                    }
                } else if (type.equals("featuredMatch")) {
                    return new Pair<>(widgetPosition, new StoryWidget.b(eventId, widgetApiModel.getAdditionalProperties().getSortOrder()));
                }
            } else if (type.equals("button")) {
                String width = widgetApiModel.getAdditionalProperties().getWidth();
                if (width == null) {
                    fFloatValue = 1.0f;
                } else {
                    n8v n8vVarE = new Regex("^\\s*(\\d+)\\s*%\\s*$").e(width);
                    if (n8vVarE != null && (str2 = (String) ((n8v.a) n8vVarE.a()).get(1)) != null && (intOrNull = StringsKt.toIntOrNull(str2)) != null) {
                        fValueOf = Float.valueOf(intOrNull.intValue() / 100.0f);
                    }
                    if (fValueOf != null) {
                        fFloatValue = fValueOf.floatValue();
                    } else {
                        fFloatValue = 1.0f;
                    }
                }
                return new Pair<>(widgetPosition, new StoryWidget.a(fFloatValue, widgetApiModel.getAdditionalProperties().getSortOrder(), str, androidRedirectUrl));
            }
        }
        return null;
    }
}
