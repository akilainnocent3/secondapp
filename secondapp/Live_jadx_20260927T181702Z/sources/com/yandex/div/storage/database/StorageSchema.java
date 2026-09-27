package com.yandex.div.storage.database;

import cs.j;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@j(name = "StorageSchema")
public final class StorageSchema {

    @l
    public static final String COLUMN_CARD_DATA = "card_data";

    @l
    public static final String COLUMN_CARD_GROUP_ID = "group_id";

    @l
    public static final String COLUMN_CARD_ID = "card_id";

    @l
    public static final String COLUMN_CARD_METADATA = "metadata";

    @l
    public static final String COLUMN_GROUP_ID = "group_id";

    @l
    public static final String COLUMN_LAYOUT_ID = "layout_id";

    @l
    public static final String COLUMN_RAW_JSON_DATA = "raw_json_data";

    @l
    public static final String COLUMN_RAW_JSON_ID = "raw_json_id";

    @l
    public static final String COLUMN_TEMPLATE_DATA = "template_data";

    @l
    public static final String COLUMN_TEMPLATE_HASH = "template_hash";

    @l
    public static final String COLUMN_TEMPLATE_ID = "template_id";

    @l
    public static final String CREATE_TABLE_CARDS = "\n    CREATE TABLE IF NOT EXISTS cards(\n    layout_id TEXT NOT NULL PRIMARY KEY,\n    card_data BLOB NULLABLE,\n    metadata BLOB NULLABLE,\n    group_id TEXT NOT NULL)";

    @l
    public static final String CREATE_TABLE_RAW_JSON = "\n    CREATE TABLE IF NOT EXISTS raw_json(\n    raw_json_id TEXT NOT NULL PRIMARY KEY,\n    raw_json_data BLOB NULLABLE)";

    @l
    public static final String CREATE_TABLE_TEMPLATES = "\n    CREATE TABLE IF NOT EXISTS templates(\n    template_hash TEXT NOT NULL PRIMARY KEY,\n    template_data BLOB NULLABLE)";

    @l
    public static final String CREATE_TABLE_TEMPLATE_REFERENCES = "\n    CREATE TABLE IF NOT EXISTS template_references(\n    group_id TEXT NOT NULL,\n    template_id TEXT NOT NULL,\n    template_hash TEXT NOT NULL,\n    PRIMARY KEY(group_id, template_id))";
    public static final int DB_VERSION = 3;

    @l
    public static final String TABLE_CARDS = "cards";

    @l
    public static final String TABLE_RAW_JSON = "raw_json";

    @l
    public static final String TABLE_TEMPLATES = "templates";

    @l
    public static final String TABLE_TEMPLATE_REFERENCES = "template_references";
}
