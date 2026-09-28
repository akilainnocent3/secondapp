package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class ghx extends zgx<fhx> {
    public final wkx i;
    public final String j;
    public final dq7 k;
    public final Object l;
    public final ArrayList m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghx(wkx wkxVar, Object obj, dq7 dq7Var, Map map) {
        super(wkxVar.b(wkx.a.a(nhx.class)), dq7Var, (Map<qhp, djx<?>>) map);
        wkxVar.getClass();
        obj.getClass();
        map.getClass();
        this.m = new ArrayList();
        this.i = wkxVar;
        this.l = obj;
    }

    @Override // defpackage.zgx
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final fhx a() {
        fhx fhxVar = (fhx) super.a();
        lhx lhxVar = fhxVar.i;
        lhxVar.getClass();
        ArrayList arrayList = this.m;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ygx ygxVar = (ygx) obj;
            if (ygxVar != null) {
                lhxVar.a(ygxVar);
            }
        }
        final Object obj2 = this.l;
        dq7 dq7Var = this.k;
        String str = this.j;
        if (str == null && dq7Var == null && obj2 == null) {
            if (this.c != null) {
                ib5.a("You must set a start destination route");
                return null;
            }
            ib5.a("You must set a start destination id");
            return null;
        }
        if (str != null) {
            lhxVar.g(str);
            return fhxVar;
        }
        if (dq7Var != null) {
            php phpVarB = ue80.b(dq7Var);
            int iB = w060.b(phpVarB);
            ygx ygxVarB = lhxVar.b(iB);
            if (ygxVarB == null) {
                i0b.b(phpVarB.getDescriptor().h(), "Cannot find startDestination ", " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
                return null;
            }
            String str2 = ygxVarB.b.f;
            str2.getClass();
            lhxVar.g(str2);
            lhxVar.c = iB;
            return fhxVar;
        }
        if (obj2 == null) {
            lhxVar.f(0);
            return fhxVar;
        }
        php phpVarB2 = ue80.b(jq40.a(obj2.getClass()));
        Function1 function1 = new Function1() { // from class: jhx
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj3) {
                ygx ygxVar2 = (ygx) obj3;
                ygxVar2.getClass();
                Map<String, ffx> mapF = ygxVar2.f();
                LinkedHashMap linkedHashMap = new LinkedHashMap(jpu.a(mapF.size()));
                Iterator<T> it = mapF.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    linkedHashMap.put(entry.getKey(), ((ffx) entry.getValue()).a);
                }
                return w060.d(obj2, linkedHashMap);
            }
        };
        int iB2 = w060.b(phpVarB2);
        ygx ygxVarB2 = lhxVar.b(iB2);
        if (ygxVarB2 != null) {
            lhxVar.g((String) function1.invoke(ygxVarB2));
            lhxVar.c = iB2;
        } else {
            i0b.b(phpVarB2.getDescriptor().h(), "Cannot find startDestination ", " from NavGraph. Ensure the starting NavDestination was added with route from KClass.");
        }
        return fhxVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghx(wkx wkxVar, dq7 dq7Var, dq7 dq7Var2, o2g o2gVar) {
        super(wkxVar.b(wkx.a.a(nhx.class)), dq7Var2, o2gVar);
        wkxVar.getClass();
        this.m = new ArrayList();
        this.i = wkxVar;
        this.k = dq7Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghx(wkx wkxVar, String str, String str2) {
        super(wkxVar.b(wkx.a.a(nhx.class)), -1, str2);
        wkxVar.getClass();
        str.getClass();
        this.m = new ArrayList();
        this.i = wkxVar;
        this.j = str;
    }
}
