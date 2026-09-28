package defpackage;

import android.os.LocaleList;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class o80 {
    public LocaleList a;
    public cet b;
    public final ppe0 c = new ppe0();

    public final cet a() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (this.c) {
            cet cetVar = this.b;
            if (cetVar != null && localeList == this.a) {
                return cetVar;
            }
            int size = localeList.size();
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(new bet(localeList.get(i)));
            }
            cet cetVar2 = new cet(arrayList);
            this.a = localeList;
            this.b = cetVar2;
            return cetVar2;
        }
    }
}
