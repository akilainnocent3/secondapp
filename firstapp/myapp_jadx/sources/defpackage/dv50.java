package defpackage;

import android.content.Context;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public final class dv50 {
    public static final <T extends lv50> lv50.a<T> a(Context context, Class<T> cls, String str) {
        context.getClass();
        if (StringsKt.U(str)) {
            hb5.a("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        if (!str.equals(":memory:")) {
            return new lv50.a<>(context, cls, str);
        }
        hb5.a("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }
}
