package defpackage;

import android.content.Context;
import android.widget.Toast;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class qdp implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ qdp(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        String[] strArrNames;
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pd80 pd80Var = (pd80) obj2;
                wbp wbpVar = (wbp) obj;
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                fcp fcpVar = wbpVar.a;
                rdp.d(wbpVar, pd80Var);
                int iD = pd80Var.d();
                for (int i2 = 0; i2 < iD; i2++) {
                    List<Annotation> listF = pd80Var.f(i2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : listF) {
                        if (obj3 instanceof pdp) {
                            arrayList.add(obj3);
                        }
                    }
                    pdp pdpVar = (pdp) CollectionsKt.p0(arrayList);
                    if (pdpVar != null && (strArrNames = pdpVar.names()) != null) {
                        for (String str : strArrNames) {
                            String str2 = Intrinsics.g(pd80Var.getKind(), yd80.b.a) ? "enum value" : "property";
                            if (linkedHashMap.containsKey(str)) {
                                throw new idp("The suggested name '" + str + "' for " + str2 + ' ' + pd80Var.e(i2) + " is already one of the names for " + str2 + ' ' + pd80Var.e(((Number) kpu.c(str, linkedHashMap)).intValue()) + " in " + pd80Var);
                            }
                            linkedHashMap.put(str, Integer.valueOf(i2));
                        }
                    }
                }
                if (!linkedHashMap.isEmpty()) {
                    return linkedHashMap;
                }
                o2g o2gVar = o2g.a;
                o2gVar.getClass();
                return o2gVar;
            default:
                h2j0 h2j0Var = (h2j0) obj2;
                h2j0Var.getClass();
                ej5.c(o8i0.d(h2j0Var), null, null, new j2j0(h2j0Var, null), 3);
                Toast.makeText((Context) obj, "All done animation cache cleared", 0).show();
                return Unit.a;
        }
    }
}
