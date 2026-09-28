package defpackage;

import androidx.navigation.fragment.b;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
public final class xix {
    public static final void a(b bVar, List list) {
        list.getClass();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            nex nexVar = (nex) it.next();
            ffx ffxVar = nexVar.b;
            String str = nexVar.a;
            str.getClass();
            LinkedHashMap linkedHashMap = bVar.f;
            gfx gfxVar = new gfx();
            djx<Object> djxVar = ffxVar.a;
            ffx.a aVar = gfxVar.a;
            aVar.a = djxVar;
            aVar.b = ffxVar.b;
            if (ffxVar.c) {
                gfxVar.a(ffxVar.e);
            }
            Unit unit = Unit.a;
            linkedHashMap.put(str, aVar.a());
        }
    }
}
