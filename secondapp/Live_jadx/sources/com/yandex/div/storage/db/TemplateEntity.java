package com.yandex.div.storage.db;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateEntity {

    @l
    public static final TemplateEntity INSTANCE = new TemplateEntity();

    @l
    public static final String TEMPLATES_TABLE = "templates";

    @l
    public static final String TEMPLATE_DATA = "template_data";

    @l
    public static final String TEMPLATE_ID = "template_id";

    @l
    public static final String TEMPLATE_USAGES_CARD_ID = "card_id";

    @l
    public static final String TEMPLATE_USAGES_TABLE = "template_usages";

    private TemplateEntity() {
    }
}
