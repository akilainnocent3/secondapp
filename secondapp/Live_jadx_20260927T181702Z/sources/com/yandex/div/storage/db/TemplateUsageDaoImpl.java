package com.yandex.div.storage.db;

import android.database.sqlite.SQLiteDatabase;
import com.yandex.div.internal.Assert;
import com.yandex.div.storage.entity.TemplateUsage;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateUsageDaoImpl implements TemplateUsageDao {

    @l
    private final SQLiteDatabase writableDatabase;

    public TemplateUsageDaoImpl(@l SQLiteDatabase sQLiteDatabase) {
        this.writableDatabase = sQLiteDatabase;
        if (sQLiteDatabase.isReadOnly()) {
            Assert.fail(TemplateUsageDaoImpl.class.getName() + " requires writable db!");
        }
    }

    @Override // com.yandex.div.storage.db.TemplateUsageDao
    public void deleteAllTemplateUsages() {
        this.writableDatabase.execSQL(TemplateUsageQueries.DELETE_ALL_TEMPLATE_USAGES_QUERY);
    }

    @Override // com.yandex.div.storage.db.TemplateUsageDao
    public void deleteTemplateUsages(@l String str) {
        this.writableDatabase.execSQL(TemplateUsageQueries.DELETE_TEMPLATE_USAGE_BY_CARD_ID_QUERY_TEMPLATE, new String[]{str});
    }

    @Override // com.yandex.div.storage.db.TemplateUsageDao
    public void insertTemplateUsage(@l TemplateUsage templateUsage) {
        this.writableDatabase.execSQL(TemplateUsageQueries.INSERT_TEMPLATE_USAGE_QUERY_TEMPLATE, new String[]{templateUsage.getCardId(), templateUsage.getTemplateId()});
    }
}
