package com.yandex.div.storage.database;

import cs.j;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@j(name = "StorageQueries")
public final class StorageQueries {

    @l
    public static final String DELETE_CARDS = "DELETE FROM cards";

    @l
    public static final String DELETE_CARDS_IDS = "DELETE FROM cards WHERE layout_id IN ";

    @l
    public static final String DELETE_RAW_JSON_BY_IDS = "DELETE FROM raw_json WHERE raw_json_id IN";

    @l
    public static final String DELETE_TEMPLATES = "DELETE FROM templates";

    @l
    public static final String DELETE_TEMPLATE_USAGES = "DELETE FROM template_references";

    @l
    public static final String DELETE_TEMPLATE_USAGES_BY_CARD_IDS = "\n    DELETE FROM template_references WHERE group_id IN\n";

    @l
    public static final String DELETE_UNUSED_TEMPLATES = "\n    DELETE FROM templates\n    WHERE template_hash NOT IN\n        (SELECT DISTINCT template_hash FROM template_references)\n    ";

    @l
    public static final String DELETE_UNUSED_TEMPLATE_REFERENCES = "\n    DELETE FROM template_references\n    WHERE group_id NOT IN\n        (SELECT group_id FROM cards)\n    ";

    @l
    public static final String INSERT_TEMPLATE = "INSERT OR IGNORE INTO templates VALUES (?, ?)";

    @l
    public static final String INSERT_TEMPLATE_USAGE = "INSERT OR IGNORE INTO template_references VALUES (?, ?, ?)";

    @l
    public static final String REPLACE_CARD = "INSERT OR REPLACE INTO cards VALUES (?, ?, ?, ?)";

    @l
    public static final String REPLACE_RAW_JSON = "INSERT OR REPLACE INTO raw_json VALUES (?, ?)";

    @l
    public static final String SELECT_RAW_JSONS_BY_IDS = "\n    SELECT raw_json_id, raw_json_data\n    FROM raw_json\n    WHERE raw_json_id IN\n";

    @l
    public static final String SELECT_TEMPLATES_BY_HASHES = "\n    SELECT t.template_hash, t.template_data\n    FROM templates AS t\n    WHERE t.template_hash in\n";
}
