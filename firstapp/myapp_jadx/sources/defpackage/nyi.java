package defpackage;

import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.transition.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class nyi {
    public static final oyi a = new oyi();
    public static final ryi b;

    static {
        ryi ryiVar = null;
        try {
            ryiVar = (ryi) a.class.getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = ryiVar;
    }

    public static final void a(Fragment fragment, Fragment fragment2, boolean z, ox0 ox0Var) {
        ox0Var.getClass();
        if ((z ? fragment2.getEnterTransitionCallback() : fragment.getEnterTransitionCallback()) != null) {
            ArrayList arrayList = new ArrayList(ox0Var.c);
            Iterator it = ((ox0.a) ox0Var.entrySet()).iterator();
            while (it.hasNext()) {
                arrayList.add((View) ((Map.Entry) it.next()).getValue());
            }
            ArrayList arrayList2 = new ArrayList(ox0Var.c);
            Iterator it2 = ((ox0.a) ox0Var.entrySet()).iterator();
            while (it2.hasNext()) {
                arrayList2.add((String) ((Map.Entry) it2.next()).getKey());
            }
        }
    }

    public static final String b(ox0<String, String> ox0Var, String str) {
        str.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : (ox0.a) ox0Var.entrySet()) {
            if (Intrinsics.g(entry.getValue(), str)) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList = new ArrayList(linkedHashMap.size());
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            arrayList.add((String) ((Map.Entry) it.next()).getKey());
        }
        return (String) CollectionsKt.firstOrNull(arrayList);
    }

    public static final void c(int i, ArrayList arrayList) {
        arrayList.getClass();
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((View) obj).setVisibility(i);
        }
    }
}
