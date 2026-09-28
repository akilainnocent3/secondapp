package defpackage;

import defpackage.wnv;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class gnp<KeyProtoT extends wnv> {
    public final Class<KeyProtoT> a;
    public final Map<Class<?>, aw20<?, KeyProtoT>> b;
    public final Class<?> c;

    public static abstract class a<KeyFormatProtoT extends wnv, KeyProtoT extends wnv> {
        public final Class<KeyFormatProtoT> a;

        /* JADX INFO: renamed from: gnp$a$a, reason: collision with other inner class name */
        public static final class C0605a<KeyFormatProtoT> {
            public final KeyFormatProtoT a;
            public final anp.a b;

            /* JADX WARN: Multi-variable type inference failed */
            public C0605a(n1k n1kVar, anp.a aVar) {
                this.a = n1kVar;
                this.b = aVar;
            }
        }

        public a(Class<KeyFormatProtoT> cls) {
            this.a = cls;
        }

        public abstract KeyProtoT a(KeyFormatProtoT keyformatprotot);

        public Map<String, C0605a<KeyFormatProtoT>> b() {
            return Collections.EMPTY_MAP;
        }

        public abstract KeyFormatProtoT c(ql5 ql5Var);

        public abstract void d(KeyFormatProtoT keyformatprotot);
    }

    @SafeVarargs
    public gnp(Class<KeyProtoT> cls, aw20<?, KeyProtoT>... aw20VarArr) {
        this.a = cls;
        HashMap map = new HashMap();
        for (aw20<?, KeyProtoT> aw20Var : aw20VarArr) {
            boolean zContainsKey = map.containsKey(aw20Var.a);
            Class<?> cls2 = aw20Var.a;
            if (zContainsKey) {
                hb5.a(kv50.a(cls2, new StringBuilder("KeyTypeManager constructed with duplicate factories for primitive ")));
                throw null;
            }
            map.put(cls2, aw20Var);
        }
        if (aw20VarArr.length > 0) {
            this.c = aw20VarArr[0].a;
        } else {
            this.c = Void.class;
        }
        this.b = Collections.unmodifiableMap(map);
    }

    public byf0.a a() {
        return byf0.a.a;
    }

    public abstract String b();

    public abstract a<?, KeyProtoT> c();

    public abstract bmp.b d();

    public abstract KeyProtoT e(ql5 ql5Var);

    public abstract void f(KeyProtoT keyprotot);
}
