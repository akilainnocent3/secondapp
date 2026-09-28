package defpackage;

import com.google.protobuf.Reader;
import defpackage.m1k;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import m1k.a;

/* JADX INFO: loaded from: classes.dex */
public abstract class m1k<MessageType extends m1k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends c4<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, m1k<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected dgh0 unknownFields = dgh0.f;

    public static abstract class a<MessageType extends m1k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends c4.a<MessageType, BuilderType> {
        public final MessageType a;
        public MessageType b;

        public a(MessageType messagetype) {
            this.a = messagetype;
            if (messagetype.i()) {
                hb5.a("Default instance must be immutable.");
                throw null;
            }
            this.b = (MessageType) messagetype.k();
        }

        public final MessageType b() {
            MessageType messagetype = (MessageType) c();
            messagetype.getClass();
            if (m1k.h(messagetype, true)) {
                return messagetype;
            }
            throw new wdh0();
        }

        public final MessageType c() {
            boolean zI = this.b.i();
            MessageType messagetype = this.b;
            if (!zI) {
                return messagetype;
            }
            messagetype.getClass();
            w630 w630Var = w630.c;
            w630Var.getClass();
            w630Var.a(messagetype.getClass()).makeImmutable(messagetype);
            messagetype.j();
            return this.b;
        }

        public final Object clone() {
            a aVar = (a) this.a.e(f.e);
            aVar.b = (MessageType) c();
            return aVar;
        }

        public final void d() {
            if (this.b.i()) {
                return;
            }
            MessageType messagetype = (MessageType) this.a.k();
            MessageType messagetype2 = this.b;
            w630 w630Var = w630.c;
            w630Var.getClass();
            w630Var.a(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
            this.b = messagetype;
        }
    }

    public static class b<T extends m1k<T, ?>> extends l4<T> {
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends m1k<MessageType, BuilderType> implements znv {
        protected mjh<d> extensions = mjh.d;

        @Override // defpackage.m1k, defpackage.znv
        public final m1k getDefaultInstanceForType() {
            return (m1k) e(f.f);
        }

        @Override // defpackage.m1k, defpackage.xnv
        public final a newBuilderForType() {
            return (a) e(f.e);
        }
    }

    public static final class d implements mjh.a<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // mjh.a
        public final ngj0 getLiteJavaType() {
            throw null;
        }
    }

    public static class e<ContainingType extends xnv, Type> extends kni0 {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class f {
        public static final f a;
        public static final f b;
        public static final f c;
        public static final f d;
        public static final f e;
        public static final f f;
        public static final /* synthetic */ f[] i;

        static {
            f fVar = new f("GET_MEMOIZED_IS_INITIALIZED", 0);
            a = fVar;
            f fVar2 = new f("SET_MEMOIZED_IS_INITIALIZED", 1);
            b = fVar2;
            f fVar3 = new f("BUILD_MESSAGE_INFO", 2);
            c = fVar3;
            f fVar4 = new f("NEW_MUTABLE_INSTANCE", 3);
            d = fVar4;
            f fVar5 = new f("NEW_BUILDER", 4);
            e = fVar5;
            f fVar6 = new f("GET_DEFAULT_INSTANCE", 5);
            f = fVar6;
            i = new f[]{fVar, fVar2, fVar3, fVar4, fVar5, fVar6, new f("GET_PARSER", 6)};
        }

        public f() {
            throw null;
        }

        public static f valueOf(String str) {
            return (f) Enum.valueOf(f.class, str);
        }

        public static f[] values() {
            return (f[]) i.clone();
        }
    }

    public static <T extends m1k<?, ?>> T f(Class<T> cls) {
        T t = (T) defaultInstanceMap.get(cls);
        if (t == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                t = (T) defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                rzk.b("Class initialization cannot fail.", e2);
                return null;
            }
        }
        if (t != null) {
            return t;
        }
        try {
            T t2 = (T) ((m1k) bhh0.a.allocateInstance(cls)).e(f.f);
            if (t2 != null) {
                defaultInstanceMap.put(cls, t2);
                return t2;
            }
            fm20.a();
            return null;
        } catch (InstantiationException e3) {
            dad.a(e3);
            return null;
        }
    }

    public static Object g(Method method, m1k m1kVar, Object... objArr) {
        try {
            return method.invoke(m1kVar, objArr);
        } catch (IllegalAccessException e2) {
            jk40.a("Couldn't use Java reflection to implement protocol message reflection.", e2);
            return null;
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            jk40.a("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final <T extends m1k<T, ?>> boolean h(T t, boolean z) {
        byte bByteValue = ((Byte) t.e(f.a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        w630 w630Var = w630.c;
        w630Var.getClass();
        boolean zIsInitialized = w630Var.a(t.getClass()).isInitialized(t);
        if (z) {
            t.e(f.b);
        }
        return zIsInitialized;
    }

    public static <T extends m1k<?, ?>> void l(Class<T> cls, T t) {
        t.j();
        defaultInstanceMap.put(cls, t);
    }

    @Override // defpackage.xnv
    public final void a(q08 q08Var) {
        w630 w630Var = w630.c;
        w630Var.getClass();
        bn70 bn70VarA = w630Var.a(getClass());
        u08 u08Var = q08Var.b;
        if (u08Var == null) {
            u08Var = new u08(q08Var);
        }
        bn70VarA.e(this, u08Var);
    }

    @Override // defpackage.c4
    public final int b() {
        return this.memoizedSerializedSize & Reader.READ_DONE;
    }

    @Override // defpackage.c4
    public final int c(bn70 bn70Var) {
        int iA;
        int iA2;
        if (i()) {
            if (bn70Var == null) {
                w630 w630Var = w630.c;
                w630Var.getClass();
                iA2 = w630Var.a(getClass()).a(this);
            } else {
                iA2 = bn70Var.a(this);
            }
            if (iA2 >= 0) {
                return iA2;
            }
            ib5.a(hce0.a(iA2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (b() != Integer.MAX_VALUE) {
            return b();
        }
        if (bn70Var == null) {
            w630 w630Var2 = w630.c;
            w630Var2.getClass();
            iA = w630Var2.a(getClass()).a(this);
        } else {
            iA = bn70Var.a(this);
        }
        d(iA);
        return iA;
    }

    @Override // defpackage.c4
    public final void d(int i) {
        if (i < 0) {
            ib5.a(hce0.a(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Reader.READ_DONE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public abstract Object e(f fVar);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        w630 w630Var = w630.c;
        w630Var.getClass();
        return w630Var.a(getClass()).b(this, (m1k) obj);
    }

    @Override // defpackage.znv
    public m1k getDefaultInstanceForType() {
        return (m1k) e(f.f);
    }

    @Override // defpackage.xnv
    public final int getSerializedSize() {
        return c(null);
    }

    public final int hashCode() {
        if (i()) {
            w630 w630Var = w630.c;
            w630Var.getClass();
            return w630Var.a(getClass()).d(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        w630 w630Var2 = w630.c;
        w630Var2.getClass();
        int iD = w630Var2.a(getClass()).d(this);
        this.memoizedHashCode = iD;
        return iD;
    }

    public final boolean i() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void j() {
        this.memoizedSerializedSize &= Reader.READ_DONE;
    }

    public final MessageType k() {
        return (MessageType) e(f.d);
    }

    @Override // defpackage.xnv
    public a newBuilderForType() {
        return (a) e(f.e);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = bov.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        bov.c(this, sb, 0);
        return sb.toString();
    }
}
