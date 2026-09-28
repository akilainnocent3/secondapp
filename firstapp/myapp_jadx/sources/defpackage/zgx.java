package defpackage;

import defpackage.ygx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class zgx<D extends ygx> {
    public final vkx<? extends D> a;
    public final int b;
    public final String c;
    public final Map<qhp, ? extends djx<?>> d;
    public String e;
    public final LinkedHashMap f;
    public final ArrayList g;
    public final LinkedHashMap h;

    public zgx(vkx<? extends D> vkxVar, ygp<?> ygpVar, Map<qhp, djx<?>> map) {
        map.getClass();
        int iB = ygpVar != null ? w060.b(ue80.b(ygpVar)) : -1;
        int i = 0;
        String str = null;
        if (ygpVar != null) {
            php phpVarB = ue80.b(ygpVar);
            if (phpVarB instanceof i120) {
                StringBuilder sb = new StringBuilder("Cannot generate route pattern from polymorphic class ");
                ygp ygpVarA = ggy.a(((i120) phpVarB).getDescriptor());
                throw new IllegalArgumentException(uf80.a(sb, ygpVarA != null ? ygpVarA.k() : null, ". Routes can only be generated from concrete classes or objects."));
            }
            r060 r060Var = new r060(phpVarB);
            i5a i5aVar = new i5a(r060Var, 1);
            int iD = phpVarB.getDescriptor().d();
            for (int i2 = 0; i2 < iD; i2++) {
                String strE = phpVarB.getDescriptor().e(i2);
                djx<Object> djxVarA = w060.a(phpVarB.getDescriptor().g(i2), map);
                if (djxVarA == null) {
                    hb5.a(w060.f(strE, phpVarB.getDescriptor().g(i2).h(), phpVarB.getDescriptor().h(), map.toString()));
                    throw null;
                }
                i5aVar.invoke(Integer.valueOf(i2), strE, djxVarA);
            }
            str = r060Var.b + r060Var.c + r060Var.d;
        }
        this(vkxVar, iB, str);
        if (ygpVar != null) {
            ArrayList arrayListC = w060.c(ue80.b(ygpVar), map);
            int size = arrayListC.size();
            while (i < size) {
                Object obj = arrayListC.get(i);
                i++;
                nex nexVar = (nex) obj;
                this.f.put(nexVar.a, nexVar.b);
            }
        }
        this.d = map;
    }

    public D a() {
        D d = (D) b();
        d.d = this.e;
        dhx dhxVar = d.b;
        for (Map.Entry entry : this.f.entrySet()) {
            String str = (String) entry.getKey();
            ffx ffxVar = (ffx) entry.getValue();
            str.getClass();
            ffxVar.getClass();
            dhxVar.getClass();
            dhxVar.d.put(str, ffxVar);
        }
        ArrayList arrayList = this.g;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            d.b((pgx) obj);
        }
        for (Map.Entry entry2 : this.h.entrySet()) {
            d.l(((Number) entry2.getKey()).intValue(), (afx) entry2.getValue());
        }
        String str2 = this.c;
        if (str2 != null) {
            d.m(str2);
        }
        int i2 = this.b;
        if (i2 != -1) {
            dhxVar.e = i2;
            dhxVar.b = null;
        }
        return d;
    }

    public D b() {
        return (D) this.a.a();
    }

    public zgx(vkx<? extends D> vkxVar, int i, String str) {
        this.a = vkxVar;
        this.b = i;
        this.c = str;
        this.f = new LinkedHashMap();
        this.g = new ArrayList();
        this.h = new LinkedHashMap();
    }
}
