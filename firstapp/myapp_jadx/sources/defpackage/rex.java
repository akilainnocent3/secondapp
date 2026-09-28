package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.core.datastore.NamedSharedPreferencesMigrationKt$getMigrationFunction$3", f = "NamedSharedPreferencesMigration.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rex extends tje0 implements gaj<u390, zn20, v1b<? super zn20>, Object> {
    public /* synthetic */ u390 a;
    public /* synthetic */ zn20 b;
    public final /* synthetic */ Function1<String, String> c;
    public final /* synthetic */ Function1<String, Boolean> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public rex(Function1<? super String, String> function1, Function1<? super String, Boolean> function2, v1b<? super rex> v1bVar) {
        super(3, v1bVar);
        this.c = function1;
        this.d = function2;
    }

    @Override // defpackage.gaj
    public final Object invoke(u390 u390Var, zn20 zn20Var, v1b<? super zn20> v1bVar) {
        rex rexVar = new rex(this.c, this.d, v1bVar);
        rexVar.a = u390Var;
        rexVar.b = zn20Var;
        return rexVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Function1<String, String> function1;
        u390 u390Var = this.a;
        zn20 zn20Var = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Set<zn20.a<?>> setKeySet = zn20Var.a().keySet();
        ArrayList arrayList = new ArrayList(l48.r(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((zn20.a) it.next()).a);
        }
        LinkedHashMap linkedHashMapA = u390Var.a();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it2 = linkedHashMapA.entrySet().iterator();
        while (true) {
            boolean zHasNext = it2.hasNext();
            function1 = this.c;
            if (!zHasNext) {
                break;
            }
            Map.Entry entry = (Map.Entry) it2.next();
            String str = (String) entry.getKey();
            if (str != null && !arrayList.contains(function1.invoke(str)) && this.d.invoke(str).booleanValue()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        jtw jtwVarD = zn20Var.d();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str2 = (String) entry2.getKey();
            Object value = entry2.getValue();
            String strInvoke = function1.invoke(str2);
            if (value instanceof String) {
                jtwVarD.h(co20.f(strInvoke), value);
            } else if (value instanceof Integer) {
                jtwVarD.h(co20.d(strInvoke), value);
            } else if (value instanceof Long) {
                jtwVarD.h(co20.e(strInvoke), value);
            } else if (value instanceof Float) {
                jtwVarD.h(co20.c(strInvoke), value);
            } else {
                if (!(value instanceof Boolean)) {
                    hb5.a("Unsupported type");
                    return null;
                }
                jtwVarD.h(co20.a(strInvoke), value);
            }
        }
        return jtwVarD;
    }
}
