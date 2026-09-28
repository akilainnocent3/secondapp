package defpackage;

import com.sporty.android.platform.features.homeshortcut.db.ShortcutDatabase_Impl;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: classes5.dex */
public final class r690 extends tv50 {
    public final /* synthetic */ ShortcutDatabase_Impl d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r690(ShortcutDatabase_Impl shortcutDatabase_Impl) {
        super(2, "a792612001b8d16760fa9538a6284c1c", "0c1c61217181d4272ec03b5d9719cc5b");
        this.d = shortcutDatabase_Impl;
    }

    @Override // defpackage.tv50
    public final void a(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "CREATE TABLE IF NOT EXISTS `shortcut_record` (`shortcutId` TEXT NOT NULL, `lastModified` INTEGER NOT NULL, PRIMARY KEY(`shortcutId`))", vp60Var, "CREATE TABLE IF NOT EXISTS `home_shortcut` (`shortcutId` TEXT NOT NULL, `createdAt` INTEGER NOT NULL, `asDefault` INTEGER NOT NULL, PRIMARY KEY(`shortcutId`))");
        up60.a(vp60Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        up60.a(vp60Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'a792612001b8d16760fa9538a6284c1c')");
    }

    @Override // defpackage.tv50
    public final void b(vp60 vp60Var) {
        xy.a(vp60Var, vp60Var, "DROP TABLE IF EXISTS `shortcut_record`", vp60Var, "DROP TABLE IF EXISTS `home_shortcut`");
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
        linkedHashMap.put("shortcutId", new o3f0.a(1, 1, "shortcutId", "TEXT", null, true));
        o3f0 o3f0Var = new o3f0("shortcut_record", linkedHashMap, yy.b(linkedHashMap, "lastModified", new o3f0.a(0, 1, "lastModified", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA = o3f0.b.a(vp60Var, "shortcut_record");
        if (!o3f0Var.equals(o3f0VarA)) {
            return new tv50.a(false, dvj0.a("shortcut_record(com.sporty.android.platform.features.homeshortcut.db.ShortcutEntity).\n Expected:\n", o3f0Var, "\n Found:\n", o3f0VarA));
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        linkedHashMap2.put("shortcutId", new o3f0.a(1, 1, "shortcutId", "TEXT", null, true));
        linkedHashMap2.put("createdAt", new o3f0.a(0, 1, "createdAt", "INTEGER", null, true));
        o3f0 o3f0Var2 = new o3f0("home_shortcut", linkedHashMap2, yy.b(linkedHashMap2, "asDefault", new o3f0.a(0, 1, "asDefault", "INTEGER", null, true)), new LinkedHashSet());
        o3f0 o3f0VarA2 = o3f0.b.a(vp60Var, "home_shortcut");
        return !o3f0Var2.equals(o3f0VarA2) ? new tv50.a(false, dvj0.a("home_shortcut(com.sporty.android.platform.features.homeshortcut.db.HomeShortcutEntity).\n Expected:\n", o3f0Var2, "\n Found:\n", o3f0VarA2)) : new tv50.a(true, null);
    }
}
