package com.yandex.div.storage.entity;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateUsage {

    @l
    private final String cardId;

    @l
    private final String templateId;

    public TemplateUsage(@l String str, @l String str2) {
        this.cardId = str;
        this.templateId = str2;
    }

    @l
    public final String getCardId() {
        return this.cardId;
    }

    @l
    public final String getTemplateId() {
        return this.templateId;
    }
}
