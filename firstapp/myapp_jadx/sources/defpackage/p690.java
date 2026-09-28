package defpackage;

import android.content.Context;
import com.google.android.material.circularreveal.cardview.Kghu.xOgHBQVl;
import com.sporty.android.platform.features.homeshortcut.db.ShortcutDatabase;

/* JADX INFO: loaded from: classes2.dex */
public final class p690 {
    public final Context a;
    public ShortcutDatabase b;

    public p690(Context context) {
        this.a = context;
    }

    public final ShortcutDatabase a() {
        ShortcutDatabase.a aVar = ShortcutDatabase.l;
        Context context = this.a;
        try {
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            lv50.a aVarA = dv50.a(applicationContext, ShortcutDatabase.class, "shortcut.db");
            aVarA.j = lv50.c.c;
            aVarA.a(aVar);
            aVarA.c();
            return (ShortcutDatabase) aVarA.b();
        } catch (Exception e) {
            itf0.a aVar2 = itf0.a;
            aVar2.f(e, "Failed to open database, attempting to delete and recreate", new Object[0]);
            context.deleteDatabase("shortcut.db");
            Context applicationContext2 = context.getApplicationContext();
            applicationContext2.getClass();
            lv50.a aVarA2 = dv50.a(applicationContext2, ShortcutDatabase.class, "shortcut.db");
            aVarA2.j = lv50.c.c;
            aVarA2.a(aVar);
            aVarA2.c();
            ShortcutDatabase shortcutDatabase = (ShortcutDatabase) aVarA2.b();
            aVar2.g(xOgHBQVl.VNiNKPbAuhm, new Object[0]);
            return shortcutDatabase;
        }
    }
}
