package com.yandex.div.storage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import com.yandex.div.core.annotations.PublicApi;
import com.yandex.div.storage.db.TemplateDao;
import com.yandex.div.storage.db.TemplateUsageDao;
import com.yandex.div.storage.entity.Template;
import com.yandex.div.storage.entity.TemplateUsage;
import cs.k;
import dr.i0;
import dr.k0;
import dr.v1;
import dr.w2;
import dr.z0;
import fr.a0;
import fr.m1;
import java.io.Closeable;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import k.i1;
import kotlin.jvm.internal.j0;
import kotlin.jvm.internal.x;
import ms.u;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
@PublicApi
public final class DivDatabaseStorage implements DivTemplateStorage, Closeable {

    @l
    private final i0 database$delegate;

    @l
    private final i0 templateDao$delegate;

    @l
    private final i0 templateUsageDao$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    @k
    public DivDatabaseStorage(@l Context context) {
        this(context, null, 2, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SQLiteDatabase getDatabase() {
        return (SQLiteDatabase) this.database$delegate.getValue();
    }

    private final TemplateDao getTemplateDao() {
        return (TemplateDao) this.templateDao$delegate.getValue();
    }

    private final TemplateUsageDao getTemplateUsageDao() {
        return (TemplateUsageDao) this.templateUsageDao$delegate.getValue();
    }

    private final void inTransaction(SQLiteDatabase sQLiteDatabase, ds.a<w2> aVar) {
        sQLiteDatabase.beginTransaction();
        try {
            aVar.invoke();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            j0.d(1);
            sQLiteDatabase.endTransaction();
            j0.c(1);
        }
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @i1
    public void clear() {
        SQLiteDatabase database = getDatabase();
        database.beginTransaction();
        try {
            getTemplateDao().deleteAllTemplates();
            getTemplateUsageDao().deleteAllTemplateUsages();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        getDatabase().close();
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @i1
    public void deleteTemplates(@l String str) {
        SQLiteDatabase database = getDatabase();
        database.beginTransaction();
        try {
            getTemplateUsageDao().deleteTemplateUsages(str);
            getTemplateDao().deleteUnusedTemplates();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    @i1
    @l
    public final Map<String, byte[]> readAllTemplates() {
        List<Template> allTemplates = getTemplateDao().getAllTemplates();
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(m1.j(fr.i0.d0(allTemplates, 10)), 16));
        for (Template template : allTemplates) {
            z0 z0VarA = v1.a(template.getId(), template.getData());
            linkedHashMap.put(z0VarA.j(), z0VarA.k());
        }
        return linkedHashMap;
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @i1
    @l
    public Map<String, byte[]> readTemplates(@l String str) {
        List<Template> templates = getTemplateDao().getTemplates(str);
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(m1.j(fr.i0.d0(templates, 10)), 16));
        for (Template template : templates) {
            z0 z0VarA = v1.a(template.getId(), template.getData());
            linkedHashMap.put(z0VarA.j(), z0VarA.k());
        }
        return linkedHashMap;
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @i1
    @l
    public Map<String, byte[]> readTemplatesByIds(@l String... strArr) {
        List<Template> templatesByIds = getTemplateDao().getTemplatesByIds(a0.Uy(strArr));
        LinkedHashMap linkedHashMap = new LinkedHashMap(u.u(m1.j(fr.i0.d0(templatesByIds, 10)), 16));
        for (Template template : templatesByIds) {
            z0 z0VarA = v1.a(template.getId(), template.getData());
            linkedHashMap.put(z0VarA.j(), z0VarA.k());
        }
        return linkedHashMap;
    }

    @Override // com.yandex.div.storage.DivTemplateStorage
    @i1
    public void writeTemplates(@l String str, @l Map<String, byte[]> map) {
        SQLiteDatabase database = getDatabase();
        database.beginTransaction();
        try {
            getTemplateUsageDao().deleteTemplateUsages(str);
            for (Map.Entry<String, byte[]> entry : map.entrySet()) {
                String key = entry.getKey();
                getTemplateDao().insertTemplate(new Template(key, entry.getValue()));
                getTemplateUsageDao().insertTemplateUsage(new TemplateUsage(str, key));
            }
            getTemplateDao().deleteUnusedTemplates();
            database.setTransactionSuccessful();
        } finally {
            database.endTransaction();
        }
    }

    @k
    public DivDatabaseStorage(@l Context context, @l String str) {
        this.database$delegate = k0.b(new DivDatabaseStorage$database$2(context, str));
        this.templateDao$delegate = k0.b(new DivDatabaseStorage$templateDao$2(this));
        this.templateUsageDao$delegate = k0.b(new DivDatabaseStorage$templateUsageDao$2(this));
    }

    public /* synthetic */ DivDatabaseStorage(Context context, String str, int i10, x xVar) {
        this(context, (i10 & 2) != 0 ? "div.db" : str);
    }
}
