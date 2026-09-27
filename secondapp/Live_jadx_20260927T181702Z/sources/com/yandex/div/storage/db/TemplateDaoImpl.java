package com.yandex.div.storage.db;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.div.internal.Assert;
import com.yandex.div.storage.entity.Template;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class TemplateDaoImpl implements TemplateDao {

    @l
    private final SQLiteDatabase writableDatabase;

    public TemplateDaoImpl(@l SQLiteDatabase sQLiteDatabase) {
        this.writableDatabase = sQLiteDatabase;
        if (sQLiteDatabase.isReadOnly()) {
            Assert.fail(TemplateDaoImpl.class.getName() + " requires writable db!");
        }
    }

    private final byte[] getData(Cursor cursor) {
        return cursor.getBlob(cursor.getColumnIndexOrThrow("template_data"));
    }

    private final String getId(Cursor cursor) {
        return cursor.getString(cursor.getColumnIndexOrThrow("template_id"));
    }

    private final List<Template> retrieveTemplates(Cursor cursor) {
        ArrayList arrayList = new ArrayList();
        while (cursor.moveToNext()) {
            arrayList.add(new Template(getId(cursor), getData(cursor)));
        }
        return arrayList;
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    public void deleteAllTemplates() {
        this.writableDatabase.execSQL("DELETE FROM templates");
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    public void deleteUnusedTemplates() {
        this.writableDatabase.execSQL(TemplateQueries.DELETE_UNUSED_TEMPLATES_QUERY_TEMPLATE);
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    @l
    public List<Template> getAllTemplates() {
        Cursor cursorRawQuery = this.writableDatabase.rawQuery(TemplateQueries.GET_ALL_TEMPLATES_QUERY, new String[0]);
        List<Template> listRetrieveTemplates = retrieveTemplates(cursorRawQuery);
        cursorRawQuery.close();
        return listRetrieveTemplates;
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    @l
    public List<Template> getTemplates(@l String str) {
        Cursor cursorRawQuery = this.writableDatabase.rawQuery(TemplateQueries.GET_TEMPLATES_BY_CARD_ID_QUERY_TEMPLATE, new String[]{str});
        List<Template> listRetrieveTemplates = retrieveTemplates(cursorRawQuery);
        cursorRawQuery.close();
        return listRetrieveTemplates;
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    @l
    public List<Template> getTemplatesByIds(@l List<String> list) {
        Cursor cursorRawQuery = this.writableDatabase.rawQuery(DBKt.appendPlaceholders(new StringBuilder(TemplateQueries.GET_TEMPLATES_BY_IDS_QUERY_TEMPLATE_WITHOUT_PLACEHOLDER), list.size()).toString(), (String[]) list.toArray(new String[0]));
        List<Template> listRetrieveTemplates = retrieveTemplates(cursorRawQuery);
        cursorRawQuery.close();
        return listRetrieveTemplates;
    }

    @Override // com.yandex.div.storage.db.TemplateDao
    public void insertTemplate(@l Template template) {
        this.writableDatabase.execSQL(TemplateQueries.INSERT_TEMPLATE_QUERY_TEMPLATE, new Serializable[]{template.getId(), template.getData()});
    }
}
