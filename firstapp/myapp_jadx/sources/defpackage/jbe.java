package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class jbe {
    public static final /* synthetic */ int a = 0;

    static {
        aw20[] aw20VarArr = {new ap(ibe.class)};
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
            y050.h(kbe.b);
            if (byf0.a()) {
                return;
            }
            y050.f(new bp(yo.class, new ap(ibe.class)), true);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
