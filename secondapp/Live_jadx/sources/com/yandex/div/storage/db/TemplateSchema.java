package com.yandex.div.storage.db;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateSchema {

    @l
    public static final String CREATE_TEMPLATES_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS `templates` (`template_id` TEXT NOT NULL, `template_data` BLOB NOT NULL, PRIMARY KEY(`template_id`))";

    @l
    public static final String CREATE_TEMPLATE_USAGES_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS `template_usages` (`card_id` TEXT NOT NULL, `template_id` TEXT NOT NULL, PRIMARY KEY(`card_id`, `template_id`))";

    @l
    public static final TemplateSchema INSTANCE = new TemplateSchema();

    private TemplateSchema() {
    }
}
