package com.yandex.div.storage.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.storage.util.SqlExtensionsKt;
import cr.c;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import oy.l;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
final class ClosableSqlCompiler implements SqlCompiler, Closeable {

    /* JADX INFO: renamed from: db, reason: collision with root package name */
    @l
    private final DatabaseOpenHelper.Database f76737db;

    @l
    private final List<SQLiteStatement> createdStatements = new ArrayList();

    @l
    private final List<Cursor> createdCursors = new ArrayList();

    public ClosableSqlCompiler(@l DatabaseOpenHelper.Database database) {
        this.f76737db = database;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Cursor compileQuery$lambda$2(ClosableSqlCompiler closableSqlCompiler, String str, String[] strArr) {
        Cursor cursorRawQuery = closableSqlCompiler.f76737db.rawQuery(str, strArr);
        closableSqlCompiler.createdCursors.add(cursorRawQuery);
        return cursorRawQuery;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        Iterator<T> it = this.createdStatements.iterator();
        while (it.hasNext()) {
            SqlExtensionsKt.closeSilently((SQLiteStatement) it.next());
        }
        this.createdStatements.clear();
        for (Cursor cursor : this.createdCursors) {
            if (!cursor.isClosed()) {
                SqlExtensionsKt.closeSilently(cursor);
            }
        }
        this.createdCursors.clear();
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    @l
    public ReadState compileQuery(@l final String str, @l final String... strArr) {
        return new ReadState(null, new c() { // from class: com.yandex.div.storage.database.a
            @Override // cr.c, am.d
            public final Object get() {
                return ClosableSqlCompiler.compileQuery$lambda$2(this.f76738a, str, strArr);
            }
        }, 1, null);
    }

    @Override // com.yandex.div.storage.database.SqlCompiler
    @l
    public SQLiteStatement compileStatement(@l String str) {
        SQLiteStatement sQLiteStatementCompileStatement = this.f76737db.compileStatement(str);
        this.createdStatements.add(sQLiteStatementCompileStatement);
        return sQLiteStatementCompileStatement;
    }
}
