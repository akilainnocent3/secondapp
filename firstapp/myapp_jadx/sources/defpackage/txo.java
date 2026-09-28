package defpackage;

import android.content.Intent;
import android.os.Bundle;
import com.sportygames.commons.SportyGamesManager;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* JADX INFO: loaded from: classes7.dex */
public final class txo {
    public static final boolean a(Intent intent) {
        intent.getClass();
        if (intent.hasExtra("sporthero_oldflow")) {
            Bundle extras = intent.getExtras();
            Object obj = extras != null ? extras.get("sporthero_oldflow") : null;
            if (obj instanceof Boolean) {
                return ((Boolean) obj).booleanValue();
            }
            if (obj instanceof String) {
                String string = StringsKt.t0((String) obj).toString();
                if (string.length() != 0) {
                    List listSplit$default = StringsKt__StringsKt.split$default(string, new String[]{","}, false, 0, 6, null);
                    ArrayList arrayList = new ArrayList(l48.r(listSplit$default, 10));
                    Iterator it = listSplit$default.iterator();
                    while (it.hasNext()) {
                        arrayList.add(StringsKt.t0((String) it.next()).toString());
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size = arrayList.size();
                    int i = 0;
                    while (i < size) {
                        Object obj2 = arrayList.get(i);
                        i++;
                        if (((String) obj2).length() > 0) {
                            arrayList2.add(obj2);
                        }
                    }
                    if (!ay0.s(String.valueOf(SportyGamesManager.getInstance().getVersionCode()), (String[]) arrayList2.toArray(new String[0]))) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
