package com.yandex.div.state.db;

import android.provider.BaseColumns;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class StateEntry implements BaseColumns {

    @l
    public static final String COLUMN_CARD_ID = "card_id";

    @l
    public static final String COLUMN_ID = "id";

    @l
    public static final String COLUMN_MOD_TIME = "modification_time";

    @l
    public static final String COLUMN_PATH = "path";

    @l
    public static final String COLUMN_STATE_ID = "state_id";

    @l
    public static final String INDICES_NAME = "index_div_card_states_card_id_path";
    public static final int INIT_DB_VERSION = 1;

    @l
    public static final StateEntry INSTANCE = new StateEntry();

    @l
    public static final String TABLE_NAME = "div_card_states";

    private StateEntry() {
    }
}
