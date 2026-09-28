package defpackage;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class jq40 {
    public static final mq40 a;
    public static final ygp[] b;

    static {
        mq40 mq40Var = null;
        try {
            mq40Var = (mq40) Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
        } catch (ClassCastException | ClassNotFoundException | IllegalAccessException | InstantiationException unused) {
        }
        if (mq40Var == null) {
            mq40Var = new mq40();
        }
        a = mq40Var;
        b = new ygp[0];
    }

    public static dq7 a(Class cls) {
        a.getClass();
        return new dq7(cls);
    }

    public static b9h0 b(Class cls) {
        dq7 dq7VarA = a(cls);
        List list = Collections.EMPTY_LIST;
        a.getClass();
        return new b9h0(dq7VarA);
    }
}
