package com.yandex.div.storage.db;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateQueries {

    @l
    public static final String DELETE_ALL_TEMPLATES_QUERY = "DELETE FROM templates";

    @l
    public static final String DELETE_UNUSED_TEMPLATES_QUERY_TEMPLATE = "DELETE FROM templates WHERE template_id NOT IN (SELECT DISTINCT template_id FROM template_usages)";

    @l
    public static final String GET_ALL_TEMPLATES_QUERY = "SELECT * FROM templates";

    @l
    public static final String GET_TEMPLATES_BY_CARD_ID_QUERY_TEMPLATE = "SELECT templates.template_id, templates.template_data FROM templates INNER JOIN template_usages ON templates.template_id = template_usages.template_id WHERE template_usages.card_id = ?";

    @l
    public static final String GET_TEMPLATES_BY_IDS_QUERY_TEMPLATE_WITHOUT_PLACEHOLDER = "SELECT template_id, template_data FROM templates WHERE template_id IN ";

    @l
    public static final String INSERT_TEMPLATE_QUERY_TEMPLATE = "INSERT OR IGNORE INTO `templates` (`template_id`,`template_data`) VALUES (?,?)";

    @l
    public static final TemplateQueries INSTANCE = new TemplateQueries();

    private TemplateQueries() {
    }
}
