package defpackage;

import android.content.Context;
import com.sporty.android.core.antest.room.AnTestOverrideDB;

/* JADX INFO: loaded from: classes5.dex */
public final class ny implements l730 {
    public static AnTestOverrideDB a(Context context) {
        lv50.a aVarA = dv50.a(context, AnTestOverrideDB.class, "an_test_override.db");
        aVarA.o = false;
        aVarA.p = true;
        aVarA.q = false;
        return (AnTestOverrideDB) aVarA.b();
    }
}
