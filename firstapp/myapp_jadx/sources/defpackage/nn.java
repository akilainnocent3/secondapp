package defpackage;

import com.sporty.android.core.model.bookingcode.jT.yFmFZvuWxAYfEj;
import java.lang.reflect.GenericDeclaration;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class nn extends aw20<vm, ln> {
    @Override // defpackage.aw20
    public final vm a(wnv wnvVar) {
        ln lnVar = (ln) wnvVar;
        aw20[] aw20VarArr = {new sn(xen.class)};
        HashMap map = new HashMap();
        for (aw20 aw20Var : aw20VarArr) {
            boolean zContainsKey = map.containsKey(aw20Var.a);
            Class<PrimitiveT> cls = aw20Var.a;
            if (zContainsKey) {
                hb5.a(kv50.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                return null;
            }
            map.put(cls, aw20Var);
        }
        if (aw20VarArr.length > 0) {
            GenericDeclaration genericDeclaration = aw20VarArr[0].a;
        }
        Map mapUnmodifiableMap = Collections.unmodifiableMap(map);
        qn qnVarW = lnVar.w();
        aw20 aw20Var2 = (aw20) mapUnmodifiableMap.get(xen.class);
        String str = yFmFZvuWxAYfEj.qSCdoB;
        if (aw20Var2 == null) {
            d9h0.a(xen.class.getCanonicalName(), "Requested primitive class ", str);
            return null;
        }
        xen xenVar = (xen) aw20Var2.a(qnVarW);
        aw20[] aw20VarArr2 = {new lbm.a(uhu.class)};
        HashMap map2 = new HashMap();
        for (aw20 aw20Var3 : aw20VarArr2) {
            boolean zContainsKey2 = map2.containsKey(aw20Var3.a);
            Class<PrimitiveT> cls2 = aw20Var3.a;
            if (zContainsKey2) {
                hb5.a(kv50.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                return null;
            }
            map2.put(cls2, aw20Var3);
        }
        if (aw20VarArr2.length > 0) {
            GenericDeclaration genericDeclaration2 = aw20VarArr2[0].a;
        }
        Map mapUnmodifiableMap2 = Collections.unmodifiableMap(map2);
        ibm ibmVarX = lnVar.x();
        aw20 aw20Var4 = (aw20) mapUnmodifiableMap2.get(uhu.class);
        if (aw20Var4 != null) {
            return new l4g(xenVar, (uhu) aw20Var4.a(ibmVarX), lnVar.x().y().y());
        }
        d9h0.a(uhu.class.getCanonicalName(), "Requested primitive class ", str);
        return null;
    }
}
