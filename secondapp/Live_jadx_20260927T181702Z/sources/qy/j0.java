package qy;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes7.dex */
public final class j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ConcurrentHashMap<Method, Object> f123187a = new ConcurrentHashMap<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final jw.e.a f123188b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final jw.b0 f123189c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List<i.a> f123190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f123191e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final List<e.a> f123192f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f123193g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @zq.h
    public final Executor f123194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f123195i;

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object[] f123196a = new Object[0];

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Class f123197b;

        public a(Class cls) {
            this.f123197b = cls;
        }

        @Override // java.lang.reflect.InvocationHandler
        @zq.h
        public Object invoke(Object obj, Method method, @zq.h Object[] objArr) throws Throwable {
            if (method.getDeclaringClass() == Object.class) {
                return method.invoke(this, objArr);
            }
            if (objArr == null) {
                objArr = this.f123196a;
            }
            c0 c0Var = a0.f123107b;
            return c0Var.c(method) ? c0Var.b(method, this.f123197b, obj, objArr) : j0.this.h(this.f123197b, method).a(obj, objArr);
        }
    }

    public j0(jw.e.a aVar, jw.b0 b0Var, List<i.a> list, int i10, List<e.a> list2, int i11, @zq.h Executor executor, boolean z10) {
        this.f123188b = aVar;
        this.f123189c = b0Var;
        this.f123190d = list;
        this.f123191e = i10;
        this.f123192f = list2;
        this.f123193g = i11;
        this.f123194h = executor;
        this.f123195i = z10;
    }

    public jw.b0 a() {
        return this.f123189c;
    }

    public e<?, ?> b(Type type, Annotation[] annotationArr) {
        return j(null, type, annotationArr);
    }

    public List<e.a> c() {
        return this.f123192f;
    }

    public jw.e.a d() {
        return this.f123188b;
    }

    @zq.h
    public Executor e() {
        return this.f123194h;
    }

    public List<i.a> f() {
        return this.f123190d;
    }

    public <T> T g(Class<T> cls) {
        p(cls);
        return (T) Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new a(cls));
    }

    public k0<?> h(Class<?> cls, Method method) {
        while (true) {
            Object objPutIfAbsent = this.f123187a.get(method);
            if (objPutIfAbsent instanceof k0) {
                return (k0) objPutIfAbsent;
            }
            if (objPutIfAbsent == null) {
                Object obj = new Object();
                synchronized (obj) {
                    try {
                        objPutIfAbsent = this.f123187a.putIfAbsent(method, obj);
                        if (objPutIfAbsent == null) {
                            try {
                                k0<?> k0VarB = k0.b(this, cls, method);
                                this.f123187a.put(method, k0VarB);
                                return k0VarB;
                            } catch (Throwable th2) {
                                this.f123187a.remove(method);
                                throw th2;
                            }
                        }
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
            }
            synchronized (objPutIfAbsent) {
                try {
                    Object obj2 = this.f123187a.get(method);
                    if (obj2 != null) {
                        return (k0) obj2;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
    }

    public b i() {
        return new b(this);
    }

    public e<?, ?> j(@zq.h e.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "returnType == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f123192f.indexOf(aVar) + 1;
        int size = this.f123192f.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            e<?, ?> eVarA = this.f123192f.get(i10).a(type, annotationArr, this);
            if (eVarA != null) {
                return eVarA;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate call adapter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f123192f.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f123192f.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f123192f.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> i<T, jw.m0> k(@zq.h i.a aVar, Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "parameterAnnotations == null");
        Objects.requireNonNull(annotationArr2, "methodAnnotations == null");
        int iIndexOf = this.f123190d.indexOf(aVar) + 1;
        int size = this.f123190d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            i<T, jw.m0> iVar = (i<T, jw.m0>) this.f123190d.get(i10).c(type, annotationArr, annotationArr2, this);
            if (iVar != null) {
                return iVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate RequestBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f123190d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f123190d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f123190d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> i<jw.o0, T> l(@zq.h i.a aVar, Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int iIndexOf = this.f123190d.indexOf(aVar) + 1;
        int size = this.f123190d.size();
        for (int i10 = iIndexOf; i10 < size; i10++) {
            i<jw.o0, T> iVar = (i<jw.o0, T>) this.f123190d.get(i10).d(type, annotationArr, this);
            if (iVar != null) {
                return iVar;
            }
        }
        StringBuilder sb2 = new StringBuilder("Could not locate ResponseBody converter for ");
        sb2.append(type);
        sb2.append(".\n");
        if (aVar != null) {
            sb2.append("  Skipped:");
            for (int i11 = 0; i11 < iIndexOf; i11++) {
                sb2.append("\n   * ");
                sb2.append(this.f123190d.get(i11).getClass().getName());
            }
            sb2.append('\n');
        }
        sb2.append("  Tried:");
        int size2 = this.f123190d.size();
        while (iIndexOf < size2) {
            sb2.append("\n   * ");
            sb2.append(this.f123190d.get(iIndexOf).getClass().getName());
            iIndexOf++;
        }
        throw new IllegalArgumentException(sb2.toString());
    }

    public <T> i<T, jw.m0> m(Type type, Annotation[] annotationArr, Annotation[] annotationArr2) {
        return k(null, type, annotationArr, annotationArr2);
    }

    public <T> i<jw.o0, T> n(Type type, Annotation[] annotationArr) {
        return l(null, type, annotationArr);
    }

    public <T> i<T, String> o(Type type, Annotation[] annotationArr) {
        Objects.requireNonNull(type, "type == null");
        Objects.requireNonNull(annotationArr, "annotations == null");
        int size = this.f123190d.size();
        for (int i10 = 0; i10 < size; i10++) {
            i<T, String> iVar = (i<T, String>) this.f123190d.get(i10).e(type, annotationArr, this);
            if (iVar != null) {
                return iVar;
            }
        }
        return qy.b.d.f123112a;
    }

    public final void p(Class<?> cls) {
        if (!cls.isInterface()) {
            throw new IllegalArgumentException("API declarations must be interfaces.");
        }
        ArrayDeque arrayDeque = new ArrayDeque(1);
        arrayDeque.add(cls);
        while (!arrayDeque.isEmpty()) {
            Class<?> cls2 = (Class) arrayDeque.removeFirst();
            if (cls2.getTypeParameters().length != 0) {
                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                sb2.append(cls2.getName());
                if (cls2 != cls) {
                    sb2.append(" which is an interface of ");
                    sb2.append(cls.getName());
                }
                throw new IllegalArgumentException(sb2.toString());
            }
            Collections.addAll(arrayDeque, cls2.getInterfaces());
        }
        if (this.f123195i) {
            c0 c0Var = a0.f123107b;
            for (Method method : cls.getDeclaredMethods()) {
                if (!c0Var.c(method) && !Modifier.isStatic(method.getModifiers()) && !method.isSynthetic()) {
                    h(cls, method);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @zq.h
        public jw.e.a f123199a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @zq.h
        public jw.b0 f123200b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final List<i.a> f123201c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final List<e.a> f123202d = new ArrayList();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @zq.h
        public Executor f123203e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f123204f;

        public b() {
        }

        public b a(e.a aVar) {
            List<e.a> list = this.f123202d;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b b(i.a aVar) {
            List<i.a> list = this.f123201c;
            Objects.requireNonNull(aVar, "factory == null");
            list.add(aVar);
            return this;
        }

        public b c(String str) {
            Objects.requireNonNull(str, "baseUrl == null");
            return e(jw.b0.B(str));
        }

        public b d(URL url) {
            Objects.requireNonNull(url, "baseUrl == null");
            return e(jw.b0.B(url.toString()));
        }

        public b e(jw.b0 b0Var) {
            Objects.requireNonNull(b0Var, "baseUrl == null");
            List<String> listK = b0Var.K();
            if ("".equals(listK.get(listK.size() - 1))) {
                this.f123200b = b0Var;
                return this;
            }
            throw new IllegalArgumentException("baseUrl must end in /: " + b0Var);
        }

        public j0 f() {
            if (this.f123200b == null) {
                throw new IllegalStateException("Base URL required.");
            }
            jw.e.a j0Var = this.f123199a;
            if (j0Var == null) {
                j0Var = new jw.j0();
            }
            jw.e.a aVar = j0Var;
            Executor executor = this.f123203e;
            if (executor == null) {
                executor = a0.f123106a;
            }
            Executor executor2 = executor;
            c cVar = a0.f123108c;
            ArrayList arrayList = new ArrayList(this.f123202d);
            List<? extends e.a> listA = cVar.a(executor2);
            arrayList.addAll(listA);
            List<? extends i.a> listB = cVar.b();
            int size = listB.size();
            ArrayList arrayList2 = new ArrayList(this.f123201c.size() + 1 + size);
            arrayList2.add(new qy.b());
            arrayList2.addAll(this.f123201c);
            arrayList2.addAll(listB);
            return new j0(aVar, this.f123200b, Collections.unmodifiableList(arrayList2), size, Collections.unmodifiableList(arrayList), listA.size(), executor2, this.f123204f);
        }

        public List<e.a> g() {
            return this.f123202d;
        }

        public b h(jw.e.a aVar) {
            Objects.requireNonNull(aVar, "factory == null");
            this.f123199a = aVar;
            return this;
        }

        public b i(Executor executor) {
            Objects.requireNonNull(executor, "executor == null");
            this.f123203e = executor;
            return this;
        }

        public b j(jw.j0 j0Var) {
            Objects.requireNonNull(j0Var, "client == null");
            return h(j0Var);
        }

        public List<i.a> k() {
            return this.f123201c;
        }

        public b l(boolean z10) {
            this.f123204f = z10;
            return this;
        }

        public b(j0 j0Var) {
            this.f123199a = j0Var.f123188b;
            this.f123200b = j0Var.f123189c;
            int size = j0Var.f123190d.size() - j0Var.f123191e;
            for (int i10 = 1; i10 < size; i10++) {
                this.f123201c.add(j0Var.f123190d.get(i10));
            }
            int size2 = j0Var.f123192f.size() - j0Var.f123193g;
            for (int i11 = 0; i11 < size2; i11++) {
                this.f123202d.add(j0Var.f123192f.get(i11));
            }
            this.f123203e = j0Var.f123194h;
            this.f123204f = j0Var.f123195i;
        }
    }
}
