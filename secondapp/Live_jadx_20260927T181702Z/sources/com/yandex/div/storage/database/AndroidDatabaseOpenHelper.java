package com.yandex.div.storage.database;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.database.sqlite.SQLiteStatement;
import com.yandex.div.internal.Assert;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import k.h1;
import kotlin.jvm.internal.m0;
import oy.l;
import oy.m;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public class AndroidDatabaseOpenHelper implements DatabaseOpenHelper {

    @l
    private final DatabaseManager databaseManager;

    @l
    private final SQLiteOpenHelper mSQLiteOpenHelper;

    @l
    private final Object mOpenCloseLock = new Object();

    @l
    private final Map<SQLiteDatabase, OpenCloseInfo> mOpenCloseInfoMap = new HashMap();

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public final class AndroidSQLiteDatabase implements DatabaseOpenHelper.Database {

        @l
        private final SQLiteDatabase mDb;

        @l
        private final OpenCloseInfo mOpenCloseInfo;

        public AndroidSQLiteDatabase(@l SQLiteDatabase sQLiteDatabase, OpenCloseInfo openCloseInfo) {
            this.mDb = sQLiteDatabase;
            this.mOpenCloseInfo = openCloseInfo;
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void beginTransaction() {
            this.mDb.beginTransaction();
        }

        @Override // java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            AndroidDatabaseOpenHelper.this.databaseManager.closeDatabase(this.mDb);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @l
        public SQLiteStatement compileStatement(@l String str) {
            return this.mDb.compileStatement(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void endTransaction() {
            this.mDb.endTransaction();
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void execSQL(@l String str) {
            this.mDb.execSQL(str);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @l
        public Cursor query(@l String str, @m String[] strArr, @m String str2, @m String[] strArr2, @m String str3, @m String str4, @m String str5, @m String str6) {
            return this.mDb.query(str, strArr, str2, strArr2, str3, str4, str5, str6);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        @l
        public Cursor rawQuery(@l String str, @m String[] strArr) {
            return this.mDb.rawQuery(str, strArr);
        }

        @Override // com.yandex.div.storage.database.DatabaseOpenHelper.Database
        public void setTransactionSuccessful() {
            this.mDb.setTransactionSuccessful();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class DatabaseManager {

        @l
        private final SQLiteOpenHelper databaseHelper;

        @m
        private SQLiteDatabase readableDatabase;
        private int readableUsersCount;

        @m
        private SQLiteDatabase writableDatabase;
        private int writableUsersCount;

        @l
        private final Set<Thread> readableUsers = new LinkedHashSet();

        @l
        private final Set<Thread> writableUsers = new LinkedHashSet();

        public DatabaseManager(@l SQLiteOpenHelper sQLiteOpenHelper) {
            this.databaseHelper = sQLiteOpenHelper;
        }

        public final synchronized void closeDatabase(@l SQLiteDatabase sQLiteDatabase) {
            try {
                if (m0.g(sQLiteDatabase, this.writableDatabase)) {
                    this.writableUsers.remove(Thread.currentThread());
                    if (this.writableUsers.isEmpty()) {
                        while (true) {
                            int i10 = this.writableUsersCount;
                            this.writableUsersCount = i10 - 1;
                            if (i10 <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase2 = this.writableDatabase;
                            m0.m(sQLiteDatabase2);
                            sQLiteDatabase2.close();
                        }
                    }
                } else if (m0.g(sQLiteDatabase, this.readableDatabase)) {
                    this.readableUsers.remove(Thread.currentThread());
                    if (this.readableUsers.isEmpty()) {
                        while (true) {
                            int i11 = this.readableUsersCount;
                            this.readableUsersCount = i11 - 1;
                            if (i11 <= 0) {
                                break;
                            }
                            SQLiteDatabase sQLiteDatabase3 = this.readableDatabase;
                            m0.m(sQLiteDatabase3);
                            sQLiteDatabase3.close();
                        }
                    }
                } else {
                    Assert.fail("Trying to close unknown database from DatabaseManager");
                    sQLiteDatabase.close();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }

        @l
        public final synchronized SQLiteDatabase openReadableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.readableDatabase = this.databaseHelper.getReadableDatabase();
            this.readableUsersCount++;
            this.readableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.readableDatabase;
            m0.m(sQLiteDatabase);
            return sQLiteDatabase;
        }

        @l
        public final synchronized SQLiteDatabase openWritableDatabase() {
            SQLiteDatabase sQLiteDatabase;
            this.writableDatabase = this.databaseHelper.getWritableDatabase();
            this.writableUsersCount++;
            this.writableUsers.add(Thread.currentThread());
            sQLiteDatabase = this.writableDatabase;
            m0.m(sQLiteDatabase);
            return sQLiteDatabase;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class OpenCloseInfo {
        private int currentlyOpenedCount;

        public final int getCurrentlyOpenedCount() {
            return this.currentlyOpenedCount;
        }

        public final void setCurrentlyOpenedCount(int i10) {
            this.currentlyOpenedCount = i10;
        }
    }

    public AndroidDatabaseOpenHelper(@l Context context, @l String str, int i10, @l final DatabaseOpenHelper.CreateCallback createCallback, @l final DatabaseOpenHelper.UpgradeCallback upgradeCallback) {
        SQLiteOpenHelper sQLiteOpenHelper = new SQLiteOpenHelper(context, str, i10) { // from class: com.yandex.div.storage.database.AndroidDatabaseOpenHelper.1
            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onConfigure(@l SQLiteDatabase sQLiteDatabase) {
                sQLiteDatabase.setForeignKeyConstraintsEnabled(true);
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onCreate(@l SQLiteDatabase sQLiteDatabase) {
                createCallback.onCreate(this.wrapDataBase(sQLiteDatabase));
            }

            @Override // android.database.sqlite.SQLiteOpenHelper
            public void onUpgrade(@l SQLiteDatabase sQLiteDatabase, int i11, int i12) {
                upgradeCallback.onUpgrade(this.wrapDataBase(sQLiteDatabase), i11, i12);
            }
        };
        this.mSQLiteOpenHelper = sQLiteOpenHelper;
        this.databaseManager = new DatabaseManager(sQLiteOpenHelper);
    }

    private OpenCloseInfo getOpenCloseInfo(SQLiteDatabase sQLiteDatabase) {
        OpenCloseInfo openCloseInfo;
        synchronized (this.mOpenCloseLock) {
            try {
                openCloseInfo = this.mOpenCloseInfoMap.get(sQLiteDatabase);
                if (openCloseInfo == null) {
                    openCloseInfo = new OpenCloseInfo();
                    this.mOpenCloseInfoMap.put(sQLiteDatabase, openCloseInfo);
                }
                openCloseInfo.setCurrentlyOpenedCount(openCloseInfo.getCurrentlyOpenedCount() + 1);
                openCloseInfo.getCurrentlyOpenedCount();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return openCloseInfo;
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @l
    public DatabaseOpenHelper.Database getReadableDatabase() {
        return wrapDataBase(this.databaseManager.openReadableDatabase());
    }

    @Override // com.yandex.div.storage.database.DatabaseOpenHelper
    @l
    public DatabaseOpenHelper.Database getWritableDatabase() {
        return wrapDataBase(this.databaseManager.openWritableDatabase());
    }

    @l
    @h1
    public DatabaseOpenHelper.Database wrapDataBase(@l SQLiteDatabase sQLiteDatabase) {
        return new AndroidSQLiteDatabase(sQLiteDatabase, getOpenCloseInfo(sQLiteDatabase));
    }
}
