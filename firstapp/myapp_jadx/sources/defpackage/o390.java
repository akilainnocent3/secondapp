package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getMigrationFunction$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
public final class o390 extends tje0 implements gaj<u390, zn20, v1b<? super zn20>, Object> {
    public /* synthetic */ u390 a;
    public /* synthetic */ zn20 b;

    @Override // defpackage.gaj
    public final Object invoke(u390 u390Var, zn20 zn20Var, v1b<? super zn20> v1bVar) {
        o390 o390Var = new o390(3, v1bVar);
        o390Var.a = u390Var;
        o390Var.b = zn20Var;
        return o390Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        u390 u390Var = this.a;
        zn20 zn20Var = this.b;
        Set<zn20.a<?>> setKeySet = zn20Var.a().keySet();
        ArrayList arrayList = new ArrayList(l48.r(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((zn20.a) it.next()).a);
        }
        LinkedHashMap linkedHashMapA = u390Var.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : linkedHashMapA.entrySet()) {
            if (!arrayList.contains((String) entry.getKey())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        jtw jtwVarD = zn20Var.d();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str = (String) entry2.getKey();
            Object value = entry2.getValue();
            if (value instanceof Boolean) {
                jtwVarD.h(co20.a(str), value);
            } else if (value instanceof Float) {
                jtwVarD.h(co20.c(str), value);
            } else if (value instanceof Integer) {
                jtwVarD.h(co20.d(str), value);
            } else if (value instanceof Long) {
                jtwVarD.h(co20.e(str), value);
            } else if (value instanceof String) {
                jtwVarD.h(co20.f(str), value);
            } else if (value instanceof Set) {
                jtwVarD.h(co20.g(str), (Set) value);
            }
        }
        return new jtw(new LinkedHashMap(jtwVarD.a()), true);
    }
}
