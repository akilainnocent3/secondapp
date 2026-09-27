package com.mbridge.msdk.config.component.load.downloader.database;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Handler;
import com.ironsource.Y5;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.database.IDatabaseHelper;
import com.mbridge.msdk.foundation.tools.q0;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes6.dex */
public class a implements com.mbridge.msdk.config.component.load.downloader.database.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.mbridge.msdk.config.component.load.downloader.database.d f65459a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Handler f65460b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f65461c = com.mbridge.msdk.config.component.database.c.TABLE_FILE_DB;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile SQLiteDatabase f65462d;

    /* JADX INFO: renamed from: com.mbridge.msdk.config.component.load.downloader.database.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class RunnableC0613a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.c.a f65463a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f65464b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f65465c;

        public RunnableC0613a(com.mbridge.msdk.config.component.load.downloader.database.c.a aVar, String str, String str2) {
            this.f65463a = aVar;
            this.f65464b = str;
            this.f65465c = str2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v11, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v12, types: [android.database.Cursor] */
        /* JADX WARN: Type inference failed for: r0v14 */
        @Override // java.lang.Runnable
        public void run() throws Throwable {
            Cursor cursorRawQuery;
            com.mbridge.msdk.config.component.load.downloader.database.c.a aVar;
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d)) {
                a aVar2 = a.this;
                aVar2.f65462d = aVar2.f65459a.getWritableDatabase();
            }
            com.mbridge.msdk.config.component.load.downloader.database.b bVarA = null;
            if (!com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d)) {
                ?? IsOpen = a.this.f65462d.isOpen();
                try {
                    if (IsOpen != 0) {
                        try {
                            cursorRawQuery = a.this.f65462d.rawQuery("SELECT * FROM " + a.this.f65461c + " WHERE URL = ? AND " + Y5.c.f60368c + " = ?", new String[]{this.f65464b, this.f65465c});
                            if (cursorRawQuery != null) {
                                try {
                                    if (cursorRawQuery.moveToFirst()) {
                                        bVarA = com.mbridge.msdk.config.component.load.downloader.database.b.a(cursorRawQuery);
                                    }
                                } catch (Exception e10) {
                                    e = e10;
                                    if (MBridgeConstans.DEBUG) {
                                        e.printStackTrace();
                                    }
                                    if (cursorRawQuery != null) {
                                        cursorRawQuery.close();
                                    }
                                    aVar = this.f65463a;
                                    if (aVar == null) {
                                        return;
                                    }
                                }
                            }
                            if (cursorRawQuery != null) {
                                cursorRawQuery.close();
                            }
                            aVar = this.f65463a;
                            if (aVar == null) {
                                return;
                            }
                        } catch (Exception e11) {
                            e = e11;
                            cursorRawQuery = null;
                        } catch (Throwable th2) {
                            th = th2;
                            IsOpen = 0;
                            if (IsOpen != 0) {
                                IsOpen.close();
                            }
                            com.mbridge.msdk.config.component.load.downloader.database.c.a aVar3 = this.f65463a;
                            if (aVar3 != null) {
                                aVar3.a(null);
                            }
                            throw th;
                        }
                        aVar.a(bVarA);
                        return;
                    }
                } catch (Throwable th3) {
                    th = th3;
                }
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.a(this.f65463a)) {
                this.f65463a.a(null);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f65467a;

        public b(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
            this.f65467a = bVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d)) {
                a aVar = a.this;
                aVar.f65462d = aVar.f65459a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d) || !a.this.f65462d.isOpen()) {
                return;
            }
            try {
                a.this.f65462d.beginTransaction();
                a.this.f65462d.insert(a.this.f65461c, null, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f65467a));
                a.this.f65462d.setTransactionSuccessful();
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            } finally {
                try {
                    if (a.this.f65462d.inTransaction()) {
                        a.this.f65462d.endTransaction();
                    }
                } catch (Throwable th2) {
                    q0.b(IDatabaseHelper.TAG, th2.getMessage());
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f65469a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f65470b;

        public c(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
            this.f65469a = bVar;
            this.f65470b = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d)) {
                a aVar = a.this;
                aVar.f65462d = aVar.f65459a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d) || !a.this.f65462d.isOpen()) {
                return;
            }
            try {
                a.this.f65462d.update(a.this.f65461c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f65469a), "URL = ? AND filePath = ?", new String[]{this.f65469a.c(), this.f65470b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class d implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.mbridge.msdk.config.component.load.downloader.database.b f65472a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f65473b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ String f65474c;

        public d(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str, String str2) {
            this.f65472a = bVar;
            this.f65473b = str;
            this.f65474c = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d)) {
                a aVar = a.this;
                aVar.f65462d = aVar.f65459a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d) || !a.this.f65462d.isOpen()) {
                return;
            }
            try {
                a.this.f65462d.update(a.this.f65461c, com.mbridge.msdk.config.component.load.downloader.database.b.a(this.f65472a), "URL = ? AND filePath = ?", new String[]{this.f65473b, this.f65474c});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class e implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f65476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f65477b;

        public e(String str, String str2) {
            this.f65476a = str;
            this.f65477b = str2;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d)) {
                a aVar = a.this;
                aVar.f65462d = aVar.f65459a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d) || !a.this.f65462d.isOpen()) {
                return;
            }
            try {
                a.this.f65462d.execSQL("DELETE FROM " + a.this.f65461c + " WHERE URL = ? AND " + Y5.c.f60368c + " = ?", new Object[]{this.f65476a, this.f65477b});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f65479a;

        public f(String str) {
            this.f65479a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d)) {
                a aVar = a.this;
                aVar.f65462d = aVar.f65459a.getWritableDatabase();
            }
            if (com.mbridge.msdk.config.component.load.downloader.utils.a.b(a.this.f65462d) || !a.this.f65462d.isOpen()) {
                return;
            }
            try {
                a.this.f65462d.execSQL("DELETE FROM " + a.this.f65461c + " WHERE URL = ?", new Object[]{this.f65479a});
            } catch (Exception e10) {
                q0.b(IDatabaseHelper.TAG, e10.getMessage());
            }
        }
    }

    public a(Handler handler, com.mbridge.msdk.config.component.load.downloader.database.d dVar) {
        this.f65460b = handler;
        this.f65459a = dVar;
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str, String str2) {
        this.f65460b.post(new e(str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void remove(String str) {
        this.f65460b.post(new f(str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.c.a aVar) {
        this.f65460b.post(new RunnableC0613a(aVar, str, str2));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f65460b.postAtFrontOfQueue(new b(bVar));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(com.mbridge.msdk.config.component.load.downloader.database.b bVar, String str) {
        this.f65460b.post(new c(bVar, str));
    }

    @Override // com.mbridge.msdk.config.component.load.downloader.database.c
    public void a(String str, String str2, com.mbridge.msdk.config.component.load.downloader.database.b bVar) {
        this.f65460b.post(new d(bVar, str, str2));
    }
}
