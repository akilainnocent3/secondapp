package com.yandex.div.storage.db;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateUsageQueries {

    @l
    public static final String DELETE_ALL_TEMPLATE_USAGES_QUERY = "DELETE FROM template_usages";

    @l
    public static final String DELETE_TEMPLATE_USAGE_BY_CARD_ID_QUERY_TEMPLATE = "DELETE FROM template_usages WHERE card_id = ?";

    @l
    public static final String INSERT_TEMPLATE_USAGE_QUERY_TEMPLATE = "INSERT OR IGNORE INTO `template_usages` (`card_id`,`template_id`) VALUES (?,?)";

    @l
    public static final TemplateUsageQueries INSTANCE = new TemplateUsageQueries();

    private TemplateUsageQueries() {
    }
}
