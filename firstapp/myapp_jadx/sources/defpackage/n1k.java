package defpackage;

import com.google.protobuf.Reader;
import defpackage.n1k;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import n1k.a;

/* JADX INFO: loaded from: classes4.dex */
public abstract class n1k<MessageType extends n1k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends d4<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, n1k<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected cgh0 unknownFields = cgh0.f;

    public static abstract class a<MessageType extends n1k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends d4.a<MessageType, BuilderType> {
        public final MessageType a;
        public MessageType b;

        public a(MessageType messagetype) {
            this.a = messagetype;
            if (messagetype.n()) {
                hb5.a("Default instance must be immutable.");
                throw null;
            }
            this.b = (MessageType) messagetype.q();
        }

        public static <MessageType> void f(MessageType messagetype, MessageType messagetype2) {
            u630 u630Var = u630.c;
            u630Var.getClass();
            u630Var.a(messagetype.getClass()).mergeFrom(messagetype, messagetype2);
        }

        public final MessageType b() {
            MessageType messagetype = (MessageType) buildPartial();
            messagetype.getClass();
            if (n1k.m(messagetype, true)) {
                return messagetype;
            }
            throw new vdh0();
        }

        @Override // wnv.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final MessageType buildPartial() {
            boolean zN = this.b.n();
            MessageType messagetype = this.b;
            if (!zN) {
                return messagetype;
            }
            messagetype.getClass();
            u630 u630Var = u630.c;
            u630Var.getClass();
            u630Var.a(messagetype.getClass()).makeImmutable(messagetype);
            messagetype.o();
            return this.b;
        }

        @Override // 
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public final BuilderType clone() {
            BuilderType buildertype = (BuilderType) this.a.newBuilderForType();
            buildertype.b = (MessageType) buildPartial();
            return buildertype;
        }

        public final void e() {
            if (this.b.n()) {
                return;
            }
            MessageType messagetype = (MessageType) this.a.q();
            f(messagetype, this.b);
            this.b = messagetype;
        }

        @Override // defpackage.ynv
        public n1k getDefaultInstanceForType() {
            return this.a;
        }
    }

    public static class b<T extends n1k<T, ?>> extends k4<T> {
    }

    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends n1k<MessageType, BuilderType> implements ynv {
        protected njh<d> extensions = njh.d;

        @Override // defpackage.n1k, defpackage.ynv
        public final /* bridge */ /* synthetic */ n1k getDefaultInstanceForType() {
            return getDefaultInstanceForType();
        }

        @Override // defpackage.n1k, defpackage.wnv
        public final /* bridge */ /* synthetic */ a newBuilderForType() {
            return newBuilderForType();
        }
    }

    public static final class d implements njh.a<d> {
        @Override // java.lang.Comparable
        public final int compareTo(Object obj) {
            ((d) obj).getClass();
            return 0;
        }

        @Override // njh.a
        public final mgj0 getLiteJavaType() {
            throw null;
        }
    }

    public static class e<ContainingType extends wnv, Type> extends y3l {
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

    public static void g(n1k n1kVar) throws f0p {
        if (!m(n1kVar, true)) {
            throw new f0p(new vdh0().getMessage());
        }
    }

    public static <T extends n1k<?, ?>> T j(Class<T> cls) {
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
            T t2 = (T) ((n1k) chh0.a.allocateInstance(cls)).getDefaultInstanceForType();
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

    public static Object l(Method method, n1k n1kVar, Object... objArr) {
        try {
            return method.invoke(n1kVar, objArr);
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

    public static final <T extends n1k<T, ?>> boolean m(T t, boolean z) {
        byte bByteValue = ((Byte) t.i(f.a)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        u630 u630Var = u630.c;
        u630Var.getClass();
        boolean zIsInitialized = u630Var.a(t.getClass()).isInitialized(t);
        if (z) {
            t.i(f.b);
        }
        return zIsInitialized;
    }

    public static <T extends n1k<T, ?>> T r(T t, ql5 ql5Var, r3h r3hVar) throws f0p {
        m08.a aVarH = ql5Var.h();
        T t2 = (T) s(t, aVarH, r3hVar);
        aVarH.a(0);
        g(t2);
        return t2;
    }

    public static <T extends n1k<T, ?>> T s(T t, m08 m08Var, r3h r3hVar) throws f0p {
        T t2 = (T) t.q();
        try {
            u630 u630Var = u630.c;
            u630Var.getClass();
            an70 an70VarA = u630Var.a(t2.getClass());
            o08 o08Var = m08Var.d;
            if (o08Var == null) {
                o08Var = new o08(m08Var);
            }
            an70VarA.b(t2, o08Var, r3hVar);
            an70VarA.makeImmutable(t2);
            return t2;
        } catch (f0p e2) {
            if (e2.a) {
                throw new f0p(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof f0p) {
                throw ((f0p) e3.getCause());
            }
            throw new f0p(e3.getMessage(), e3);
        } catch (vdh0 e4) {
            throw new f0p(e4.getMessage());
        } catch (RuntimeException e5) {
            if (e5.getCause() instanceof f0p) {
                throw ((f0p) e5.getCause());
            }
            throw e5;
        }
    }

    public static <T extends n1k<?, ?>> void t(Class<T> cls, T t) {
        t.o();
        defaultInstanceMap.put(cls, t);
    }

    @Override // defpackage.wnv
    public final void a(r08.a aVar) {
        u630 u630Var = u630.c;
        u630Var.getClass();
        an70 an70VarA = u630Var.a(getClass());
        t08 t08Var = aVar.c;
        if (t08Var == null) {
            t08Var = new t08(aVar);
        }
        an70VarA.a(this, t08Var);
    }

    @Override // defpackage.d4
    public final int b() {
        return this.memoizedSerializedSize & Reader.READ_DONE;
    }

    @Override // defpackage.d4
    public final int c(an70 an70Var) {
        int iE;
        int iE2;
        if (n()) {
            if (an70Var == null) {
                u630 u630Var = u630.c;
                u630Var.getClass();
                iE2 = u630Var.a(getClass()).e(this);
            } else {
                iE2 = an70Var.e(this);
            }
            if (iE2 >= 0) {
                return iE2;
            }
            ib5.a(hce0.a(iE2, "serialized size must be non-negative, was "));
            return 0;
        }
        if (b() != Integer.MAX_VALUE) {
            return b();
        }
        if (an70Var == null) {
            u630 u630Var2 = u630.c;
            u630Var2.getClass();
            iE = u630Var2.a(getClass()).e(this);
        } else {
            iE = an70Var.e(this);
        }
        e(iE);
        return iE;
    }

    @Override // defpackage.d4
    public final void e(int i) {
        if (i < 0) {
            ib5.a(hce0.a(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Reader.READ_DONE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        u630 u630Var = u630.c;
        u630Var.getClass();
        return u630Var.a(getClass()).c(this, (n1k) obj);
    }

    @Override // defpackage.wnv
    public final int getSerializedSize() {
        return c(null);
    }

    public final <MessageType extends n1k<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType h() {
        return (BuilderType) i(f.e);
    }

    public final int hashCode() {
        if (n()) {
            u630 u630Var = u630.c;
            u630Var.getClass();
            return u630Var.a(getClass()).d(this);
        }
        int i = this.memoizedHashCode;
        if (i != 0) {
            return i;
        }
        u630 u630Var2 = u630.c;
        u630Var2.getClass();
        int iD = u630Var2.a(getClass()).d(this);
        this.memoizedHashCode = iD;
        return iD;
    }

    public abstract Object i(f fVar);

    @Override // defpackage.ynv
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public final MessageType getDefaultInstanceForType() {
        return (MessageType) i(f.f);
    }

    public final boolean n() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    public final void o() {
        this.memoizedSerializedSize &= Reader.READ_DONE;
    }

    @Override // defpackage.wnv
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final BuilderType newBuilderForType() {
        return (BuilderType) i(f.e);
    }

    public final MessageType q() {
        return (MessageType) i(f.d);
    }

    public final String toString() {
        String string = super.toString();
        char[] cArr = aov.a;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(string);
        aov.c(this, sb, 0);
        return sb.toString();
    }

    public final BuilderType u() {
        BuilderType buildertype = (BuilderType) i(f.e);
        if (!buildertype.a.equals(this)) {
            buildertype.e();
            a.f(buildertype.b, this);
        }
        return buildertype;
    }
}
