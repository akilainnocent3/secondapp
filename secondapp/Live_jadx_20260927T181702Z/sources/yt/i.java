package yt;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes8.dex */
public abstract class i extends yt.a implements Serializable {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f159900a;

        static {
            int[] iArr = new int[z.c.values().length];
            f159900a = iArr;
            try {
                iArr[z.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f159900a[z.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class b<MessageType extends i, BuilderType extends b> extends yt.a.AbstractC1559a<BuilderType> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public yt.d f159901b = yt.d.f159862b;

        @Override // yt.a.AbstractC1559a
        /* JADX INFO: renamed from: e */
        public BuilderType m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        @Override // yt.r
        /* JADX INFO: renamed from: f */
        public abstract MessageType getDefaultInstanceForType();

        public final yt.d g() {
            return this.f159901b;
        }

        public abstract BuilderType i(MessageType messagetype);

        public final BuilderType j(yt.d dVar) {
            this.f159901b = dVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements e<MessageType> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public h<f> f159902c = h.g();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f159903d;

        public final h<f> l() {
            this.f159902c.q();
            this.f159903d = false;
            return this.f159902c;
        }

        @Override // yt.i.b
        public BuilderType m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final void n() {
            if (this.f159903d) {
                return;
            }
            this.f159902c = this.f159902c.clone();
            this.f159903d = true;
        }

        public boolean o() {
            return this.f159902c.n();
        }

        public final void p(MessageType messagetype) {
            n();
            this.f159902c.r(messagetype.f159904c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public interface e<MessageType extends d> extends r {
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static final class f implements h.b<f> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final j.b<?> f159909b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f159910c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final z.b f159911d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f159912e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f159913f;

        public f(j.b<?> bVar, int i10, z.b bVar2, boolean z10, boolean z11) {
            this.f159909b = bVar;
            this.f159910c = i10;
            this.f159911d = bVar2;
            this.f159912e = z10;
            this.f159913f = z11;
        }

        @Override // yt.h.b
        public q.a A0(q.a aVar, q qVar) {
            return ((b) aVar).i((i) qVar);
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compareTo(f fVar) {
            return this.f159910c - fVar.f159910c;
        }

        public j.b<?> b() {
            return this.f159909b;
        }

        @Override // yt.h.b
        public z.c getLiteJavaType() {
            return this.f159911d.d();
        }

        @Override // yt.h.b
        public z.b getLiteType() {
            return this.f159911d;
        }

        @Override // yt.h.b
        public int getNumber() {
            return this.f159910c;
        }

        @Override // yt.h.b
        public boolean isPacked() {
            return this.f159913f;
        }

        @Override // yt.h.b
        public boolean isRepeated() {
            return this.f159912e;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static class g<ContainingType extends q, Type> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ContainingType f159914a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Type f159915b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q f159916c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final f f159917d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Class f159918e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final Method f159919f;

        public g(ContainingType containingtype, Type type, q qVar, f fVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (fVar.getLiteType() == z.b.f159994n && qVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f159914a = containingtype;
            this.f159915b = type;
            this.f159916c = qVar;
            this.f159917d = fVar;
            this.f159918e = cls;
            if (j.a.class.isAssignableFrom(cls)) {
                this.f159919f = i.g(cls, "valueOf", Integer.TYPE);
            } else {
                this.f159919f = null;
            }
        }

        public Object a(Object obj) {
            if (!this.f159917d.isRepeated()) {
                return e(obj);
            }
            if (this.f159917d.getLiteJavaType() != z.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public ContainingType b() {
            return this.f159914a;
        }

        public q c() {
            return this.f159916c;
        }

        public int d() {
            return this.f159917d.getNumber();
        }

        public Object e(Object obj) {
            return this.f159917d.getLiteJavaType() == z.c.ENUM ? i.h(this.f159919f, null, (Integer) obj) : obj;
        }

        public Object f(Object obj) {
            return this.f159917d.getLiteJavaType() == z.c.ENUM ? Integer.valueOf(((j.a) obj).getNumber()) : obj;
        }
    }

    public i() {
    }

    public static Method g(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    public static Object h(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <ContainingType extends q, Type> g<ContainingType, Type> j(ContainingType containingtype, q qVar, j.b<?> bVar, int i10, z.b bVar2, boolean z10, Class cls) {
        return new g<>(containingtype, Collections.EMPTY_LIST, qVar, new f(bVar, i10, bVar2, true, z10), cls);
    }

    public static <ContainingType extends q, Type> g<ContainingType, Type> k(ContainingType containingtype, Type type, q qVar, j.b<?> bVar, int i10, z.b bVar2, Class cls) {
        return new g<>(containingtype, type, qVar, new f(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0010  */
    public static <MessageType extends q> boolean m(h<f> hVar, MessageType messagetype, yt.e eVar, yt.f fVar, yt.g gVar, int i10) throws IOException {
        boolean z10;
        boolean z11;
        Object objBuild;
        q qVar;
        int iB = z.b(i10);
        g gVarB = gVar.b(messagetype, z.a(i10));
        if (gVarB == null) {
            z11 = true;
            z10 = false;
        } else if (iB == h.l(gVarB.f159917d.getLiteType(), false)) {
            z11 = false;
            z10 = false;
        } else {
            f fVar2 = gVarB.f159917d;
            if (fVar2.f159912e && fVar2.f159911d.h() && iB == h.l(gVarB.f159917d.getLiteType(), true)) {
                z10 = true;
                z11 = false;
            } else {
                z11 = true;
                z10 = false;
            }
        }
        if (z11) {
            return eVar.P(i10, fVar);
        }
        if (z10) {
            int iJ = eVar.j(eVar.A());
            if (gVarB.f159917d.getLiteType() == z.b.f159997q) {
                while (eVar.e() > 0) {
                    j.a aVarFindValueByNumber = gVarB.f159917d.b().findValueByNumber(eVar.n());
                    if (aVarFindValueByNumber == null) {
                        return true;
                    }
                    hVar.a(gVarB.f159917d, gVarB.f(aVarFindValueByNumber));
                }
            } else {
                while (eVar.e() > 0) {
                    hVar.a(gVarB.f159917d, h.u(eVar, gVarB.f159917d.getLiteType(), false));
                }
            }
            eVar.i(iJ);
        } else {
            int i11 = a.f159900a[gVarB.f159917d.getLiteJavaType().ordinal()];
            if (i11 == 1) {
                q.a builder = (gVarB.f159917d.isRepeated() || (qVar = (q) hVar.h(gVarB.f159917d)) == null) ? null : qVar.toBuilder();
                if (builder == null) {
                    builder = gVarB.c().newBuilderForType();
                }
                if (gVarB.f159917d.getLiteType() == z.b.f159993m) {
                    eVar.r(gVarB.d(), builder, gVar);
                } else {
                    eVar.v(builder, gVar);
                }
                objBuild = builder.build();
            } else if (i11 != 2) {
                objBuild = h.u(eVar, gVarB.f159917d.getLiteType(), false);
            } else {
                int iN = eVar.n();
                j.a aVarFindValueByNumber2 = gVarB.f159917d.b().findValueByNumber(iN);
                if (aVarFindValueByNumber2 == null) {
                    fVar.o0(i10);
                    fVar.y0(iN);
                    return true;
                }
                objBuild = aVarFindValueByNumber2;
            }
            if (gVarB.f159917d.isRepeated()) {
                hVar.a(gVarB.f159917d, gVarB.f(objBuild));
            } else {
                hVar.v(gVarB.f159917d, gVarB.f(objBuild));
            }
        }
        return true;
    }

    @Override // yt.q
    public s<? extends q> getParserForType() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    public boolean l(yt.e eVar, yt.f fVar, yt.g gVar, int i10) throws IOException {
        return eVar.P(i10, fVar);
    }

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public static abstract class d<MessageType extends d<MessageType>> extends i implements e<MessageType> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final h<f> f159904c;

        /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Iterator<Map.Entry<f, Object>> f159905a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Map.Entry<f, Object> f159906b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final boolean f159907c;

            public /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, yt.f fVar) throws IOException {
                while (true) {
                    Map.Entry<f, Object> entry = this.f159906b;
                    if (entry == null || entry.getKey().getNumber() >= i10) {
                        return;
                    }
                    f key = this.f159906b.getKey();
                    if (this.f159907c && key.getLiteJavaType() == z.c.MESSAGE && !key.isRepeated()) {
                        fVar.f0(key.getNumber(), (q) this.f159906b.getValue());
                    } else {
                        h.z(key, this.f159906b.getValue(), fVar);
                    }
                    if (this.f159905a.hasNext()) {
                        this.f159906b = this.f159905a.next();
                    } else {
                        this.f159906b = null;
                    }
                }
            }

            public a(boolean z10) {
                Iterator<Map.Entry<f, Object>> itP = d.this.f159904c.p();
                this.f159905a = itP;
                if (itP.hasNext()) {
                    this.f159906b = itP.next();
                }
                this.f159907c = z10;
            }
        }

        public d() {
            this.f159904c = h.t();
        }

        @Override // yt.i
        public void i() {
            this.f159904c.q();
        }

        @Override // yt.i
        public boolean l(yt.e eVar, yt.f fVar, yt.g gVar, int i10) throws IOException {
            return i.m(this.f159904c, getDefaultInstanceForType(), eVar, fVar, gVar, i10);
        }

        public boolean o() {
            return this.f159904c.n();
        }

        public int p() {
            return this.f159904c.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type q(g<MessageType, Type> gVar) {
            v(gVar);
            Object objH = this.f159904c.h(gVar.f159917d);
            return objH == null ? gVar.f159915b : (Type) gVar.a(objH);
        }

        public final <Type> Type r(g<MessageType, List<Type>> gVar, int i10) {
            v(gVar);
            return (Type) gVar.e(this.f159904c.i(gVar.f159917d, i10));
        }

        public final <Type> int s(g<MessageType, List<Type>> gVar) {
            v(gVar);
            return this.f159904c.j(gVar.f159917d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean t(g<MessageType, Type> gVar) {
            v(gVar);
            return this.f159904c.m(gVar.f159917d);
        }

        public d<MessageType>.a u() {
            return new a(this, false, null);
        }

        public final void v(g<MessageType, ?> gVar) {
            if (gVar.b() != getDefaultInstanceForType()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        public d(c<MessageType, ?> cVar) {
            this.f159904c = cVar.l();
        }
    }

    public i(b bVar) {
    }

    public void i() {
    }
}
