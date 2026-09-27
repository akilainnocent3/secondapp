package com.yandex.div.storage.analytics;

import com.yandex.div.json.ParsingException;
import cv.k0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateCardErrorTransformerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final String getTemplateName(ParsingException parsingException) {
        String message = parsingException.getMessage();
        if (message == null) {
            return null;
        }
        return k0.z2(k0.z2(message, "Template '", "", false, 4, null), "' is missing!", "", false, 4, null);
    }
}
