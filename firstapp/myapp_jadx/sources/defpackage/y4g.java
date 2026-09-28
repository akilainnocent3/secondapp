package defpackage;

import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequestsDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes6.dex */
public final class y4g extends tv50 {
    public final /* synthetic */ EncryptedRequestsDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y4g(EncryptedRequestsDatabase_Impl encryptedRequestsDatabase_Impl) {
        super(1, "1de493f677edb7eb179fc5ab39499bf9", "4a5f60ecb193db4b4542936e31ffd343");
        this.d = encryptedRequestsDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `debug_screen_encrypted_requests` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `start_time` INTEGER NOT NULL, `url` TEXT NOT NULL, `method` TEXT NOT NULL, `original_body` TEXT NOT NULL, `encrypted_body` TEXT NOT NULL)", vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '1de493f677edb7eb179fc5ab39499bf9')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        vp60Var.getClass();
        up60.a(vp60Var, "DROP TABLE IF EXISTS `debug_screen_encrypted_requests`");
    }

    @Override // defpackage.tv50
    public final void c(vp60 vp60Var) {
        vp60Var.getClass();
    }

    @Override // defpackage.tv50
    public final void d(vp60 vp60Var) {
        vp60Var.getClass();
        this.d.s(vp60Var);
    }

    @Override // defpackage.tv50
    public final void e(vp60 vp60Var) {
        vp60Var.getClass();
    }

    @Override // defpackage.tv50
    public final void f(vp60 vp60Var) {
        vp60Var.getClass();
        klc.a(vp60Var);
    }

    @Override // defpackage.tv50
    public final tv50.a g(vp60 vp60Var) {
        vp60Var.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(AnalyticsParam.EVENT_PARAM_ID, new o3f0.a(1, 1, AnalyticsParam.EVENT_PARAM_ID, "INTEGER", null, true));
        linkedHashMap.put("start_time", new o3f0.a(0, 1, "start_time", "INTEGER", null, true));
        linkedHashMap.put("url", new o3f0.a(0, 1, "url", "TEXT", null, true));
        linkedHashMap.put("method", new o3f0.a(0, 1, "method", "TEXT", null, true));
        linkedHashMap.put("original_body", new o3f0.a(0, 1, "original_body", "TEXT", null, true));
        o3f0 o3f0Var = new o3f0("debug_screen_encrypted_requests", linkedHashMap, yy.b(linkedHashMap, "encrypted_body", new o3f0.a(0, 1, "encrypted_body", "TEXT", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "debug_screen_encrypted_requests");
        return !o3f0Var.equals(o3f0VarA) ? new tv50.a(false, dvj0.a("debug_screen_encrypted_requests(com.sportybet.feature.debugscreen.impl.encrypt.data.EncryptedRequest).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA)) : new tv50.a(true, null);
    }
}
