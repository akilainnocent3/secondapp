package io.appmetrica.analytics.modulesapi.internal.common;

import io.appmetrica.analytics.coreapi.internal.db.DatabaseScript;
import java.util.List;
import java.util.Map;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public interface TableDescription {
    @l
    List<String> getColumnNames();

    @l
    String getCreateTableScript();

    @l
    Map<Integer, DatabaseScript> getDatabaseProviderUpgradeScript();

    @l
    String getDropTableScript();

    @l
    String getTableName();
}
