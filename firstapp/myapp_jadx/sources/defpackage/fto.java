package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ServiceLoader;

/* JADX INFO: loaded from: classes8.dex */
public final class fto {
    public static final /* synthetic */ int a = 0;

    static {
        ArrayList arrayList = new ArrayList();
        Iterator it = ServiceLoader.load(eto.class).iterator();
        while (it.hasNext()) {
            arrayList.add(new xyo((eto) it.next()));
        }
        yyo.a = arrayList;
    }
}
