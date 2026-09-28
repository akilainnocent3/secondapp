package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class vhu {
    static {
        aw20[] aw20VarArr = {new lbm.a(uhu.class)};
        HashMap map = new HashMap();
        aw20 aw20Var = aw20VarArr[0];
        boolean zContainsKey = map.containsKey(aw20Var.a);
        Class<PrimitiveT> cls = aw20Var.a;
        if (zContainsKey) {
            hb5.a(kv50.a(cls, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
            return;
        }
        map.put(cls, aw20Var);
        GenericDeclaration genericDeclaration = aw20VarArr[0].a;
        Collections.unmodifiableMap(map);
        int i = z050.CONFIG_NAME_FIELD_NUMBER;
        try {
            a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }

    public static void a() {
        y050.h(yhu.c);
        y050.h(tn7.a);
        y050.f(new lbm(ibm.class, new lbm.a(uhu.class)), true);
        zrz zrzVar = pbm.a;
        ttw ttwVar = ttw.b;
        ttwVar.e(pbm.a);
        ttwVar.d(pbm.b);
        ttwVar.c(pbm.c);
        ttwVar.b(pbm.d);
        ktw ktwVar = ktw.b;
        ktwVar.a(lbm.d);
        if (byf0.a()) {
            return;
        }
        y050.f(new gn(cn.class, new fn(uhu.class)), true);
        ttwVar.e(kn.a);
        ttwVar.d(kn.b);
        ttwVar.c(kn.c);
        ttwVar.b(kn.d);
        ktwVar.a(gn.d);
    }
}
