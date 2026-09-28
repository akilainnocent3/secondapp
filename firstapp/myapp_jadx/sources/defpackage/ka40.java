package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class ka40 implements abe0 {
    public final long a;
    public final kyi0 b;
    public final b c;

    public static final class a {
        public final u7n a;
        public final Map<String, Object> b;
        public final long c;

        public a(u7n u7nVar, Map<String, ? extends Object> map, long j) {
            this.a = u7nVar;
            this.b = map;
            this.c = j;
        }
    }

    public static final class b extends q4u<vlv.b, a> {
        public b(long j) {
            super(j);
        }

        @Override // defpackage.q4u
        public final void a(vlv.b bVar, a aVar, a aVar2) {
            a aVar3 = aVar;
            ka40.this.b.f(bVar, aVar3.a, aVar3.b, aVar3.c);
        }
    }

    public ka40(long j, kyi0 kyi0Var) {
        this.a = j;
        this.b = kyi0Var;
        this.c = new b(j);
    }

    @Override // defpackage.abe0
    public final long a() {
        return this.c.b();
    }

    @Override // defpackage.abe0
    public final vlv.c b(vlv.b bVar) {
        a aVar = (a) this.c.a.get(bVar);
        if (aVar != null) {
            return new vlv.c(aVar.a, aVar.b);
        }
        return null;
    }

    @Override // defpackage.abe0
    public final void c(long j) {
        b bVar = this.c;
        bVar.b = j;
        bVar.d(j);
    }

    @Override // defpackage.abe0
    public final void clear() {
        this.c.d(-1L);
    }

    @Override // defpackage.abe0
    public final long d() {
        return this.a;
    }

    @Override // defpackage.abe0
    public final long e() {
        return this.c.b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.abe0
    public final void f(vlv.b bVar, u7n u7nVar, Map<String, ? extends Object> map, long j) {
        b bVar2 = this.c;
        long j2 = bVar2.b;
        LinkedHashMap linkedHashMap = bVar2.a;
        if (j > j2) {
            Object objRemove = linkedHashMap.remove(bVar);
            if (objRemove != null) {
                bVar2.c = bVar2.b() - bVar2.c(bVar, objRemove);
                bVar2.a(bVar, objRemove, null);
            }
            this.b.f(bVar, u7nVar, map, j);
            return;
        }
        a aVar = new a(u7nVar, map, j);
        Object objPut = linkedHashMap.put(bVar, aVar);
        bVar2.c = bVar2.c(bVar, aVar) + bVar2.b();
        if (objPut != null) {
            bVar2.c = bVar2.b() - bVar2.c(bVar, objPut);
            bVar2.a(bVar, objPut, aVar);
        }
        bVar2.d(bVar2.b);
    }

    @Override // defpackage.abe0
    public final void g(long j) {
        this.c.d(j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.abe0
    public final boolean h(vlv.b bVar) {
        b bVar2 = this.c;
        Object objRemove = bVar2.a.remove(bVar);
        if (objRemove != null) {
            bVar2.c = bVar2.b() - bVar2.c(bVar, objRemove);
            bVar2.a(bVar, objRemove, null);
        }
        return objRemove != null;
    }
}
