package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes7.dex */
public final class ck60 {
    public final SharedPreferences a;

    public ck60(Context context, String str) {
        SharedPreferences sharedPreferences;
        context.getClass();
        if (str == null) {
            sharedPreferences = un20.a(context);
            sharedPreferences.getClass();
        } else {
            sharedPreferences = context.getSharedPreferences(str, 0);
            sharedPreferences.getClass();
        }
        this.a = sharedPreferences;
    }

    public final Map a() {
        SharedPreferences sharedPreferences = this.a;
        String string = sharedPreferences != null ? sharedPreferences.getString("user_search", "") : null;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map map = (Map) new eal().e(string != null ? string : "", linkedHashMap.getClass());
        return map == null ? linkedHashMap : map;
    }

    public final void b(String str, boolean z) {
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (editorEdit != null) {
            editorEdit.putBoolean(str, z);
        }
        if (editorEdit != null) {
            editorEdit.apply();
        }
    }

    public final void c(Map map) {
        String strJ = new eal().j(map);
        SharedPreferences sharedPreferences = this.a;
        SharedPreferences.Editor editorEdit = sharedPreferences != null ? sharedPreferences.edit() : null;
        if (editorEdit != null) {
            editorEdit.putString("user_search", strJ);
        }
        if (editorEdit != null) {
            editorEdit.apply();
        }
    }
}
