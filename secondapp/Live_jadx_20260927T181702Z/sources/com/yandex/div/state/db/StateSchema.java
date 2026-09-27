package com.yandex.div.state.db;

import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class StateSchema {

    @l
    public static final StateSchema INSTANCE = new StateSchema();

    @l
    public static final String SQL_CREATE_INDICES_TABLE_QUERY = "CREATE UNIQUE INDEX IF NOT EXISTS `index_div_card_states_card_id_path` ON `div_card_states` (`card_id`, `path`)";

    @l
    public static final String SQL_CREATE_TABLE_QUERY = "CREATE TABLE IF NOT EXISTS `div_card_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `card_id` TEXT NOT NULL, `path` TEXT NOT NULL, `state_id` TEXT NOT NULL, `modification_time` INTEGER NOT NULL)";

    @l
    public static final String SQL_DELETE_ALL_EXCEPT_CARD_ID_QUERY_TEMPLATE = "DELETE FROM div_card_states WHERE card_id NOT IN (%s)";

    @l
    public static final String SQL_DELETE_ALL_MODIFIED_BEFORE_QUERY_TEMPLATE = "DELETE FROM div_card_states WHERE modification_time < ?";

    @l
    public static final String SQL_DELETE_ALL_QUERY = "DELETE FROM div_card_states";

    @l
    public static final String SQL_DELETE_BY_CARD_ID_QUERY_TEMPLATE = "DELETE FROM div_card_states WHERE card_id=?";

    @l
    public static final String SQL_DELETE_CARD_ROOT_STATE_QUERY_TEMPLATE = "DELETE FROM div_card_states WHERE card_id=? AND path='/'";

    @l
    public static final String SQL_DROP_TABLE_QUERY = "DROP TABLE IF EXISTS div_card_states";

    @l
    public static final String SQL_GET_ROOT_STATE_ID_QUERY_TEMPLATE = "SELECT state_id FROM div_card_states WHERE card_id=? AND path='/'";

    @l
    public static final String SQL_GET_STATES_QUERY_TEMPLATE = "SELECT path, state_id FROM div_card_states WHERE card_id=?";

    @l
    public static final String SQL_UPSERT_QUERY_TEMPLATE = "INSERT OR REPLACE INTO `div_card_states` (`card_id`,`path`,`state_id`,`modification_time`) VALUES (?,?,?,?)";

    private StateSchema() {
    }
}
