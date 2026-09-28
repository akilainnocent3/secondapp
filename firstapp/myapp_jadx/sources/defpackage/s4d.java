package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public final class s4d<Transcode> {
    public final ArrayList a = new ArrayList();
    public final ArrayList b = new ArrayList();
    public wzk c;
    public Object d;
    public int e;
    public int f;
    public Class<?> g;
    public u4d.c h;
    public s2z i;
    public Map<Class<?>, nsg0<?>> j;
    public Class<Transcode> k;
    public boolean l;
    public boolean m;
    public nlp n;
    public lw20 o;
    public hre p;
    public boolean q;
    public boolean r;

    public final ArrayList a() {
        boolean z = this.m;
        ArrayList arrayList = this.b;
        if (!z) {
            this.m = true;
            arrayList.clear();
            ArrayList arrayListB = b();
            int size = arrayListB.size();
            for (int i = 0; i < size; i++) {
                i2w.a aVar = (i2w.a) arrayListB.get(i);
                nlp nlpVar = aVar.a;
                List<nlp> list = aVar.b;
                if (!arrayList.contains(nlpVar)) {
                    arrayList.add(aVar.a);
                }
                for (int i2 = 0; i2 < list.size(); i2++) {
                    if (!arrayList.contains(list.get(i2))) {
                        arrayList.add(list.get(i2));
                    }
                }
            }
        }
        return arrayList;
    }

    public final ArrayList b() {
        boolean z = this.l;
        ArrayList arrayList = this.a;
        if (!z) {
            this.l = true;
            arrayList.clear();
            List listF = this.c.a().f(this.d);
            int size = listF.size();
            for (int i = 0; i < size; i++) {
                i2w.a aVarA = ((i2w) listF.get(i)).a(this.d, this.e, this.f, this.i);
                if (aVarA != null) {
                    arrayList.add(aVarA);
                }
            }
        }
        return arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*  JADX ERROR: JadxRuntimeException in pass: FinishTypeInference
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r1v16 fxs<?, ?, ?>
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.lambda$visit$0(FinishTypeInference.java:27)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
        	at jadx.core.dex.visitors.typeinference.FinishTypeInference.visit(FinishTypeInference.java:22)
        */
    public final <Data> defpackage.fxs<Data, ?, Transcode> c(java.lang.Class<Data> r24) {
        /*
            Method dump skipped, instruction units count: 411
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s4d.c(java.lang.Class):fxs");
    }

    public final <X> g4g<X> d(X x) {
        g4g<X> g4gVar;
        i4g i4gVar = this.c.a().b;
        Class<?> cls = x.getClass();
        synchronized (i4gVar) {
            ArrayList arrayList = i4gVar.a;
            int size = arrayList.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    g4gVar = null;
                    break;
                }
                Object obj = arrayList.get(i);
                i++;
                i4g.a aVar = (i4g.a) obj;
                if (aVar.a.isAssignableFrom(cls)) {
                    g4gVar = (g4g<X>) aVar.b;
                    break;
                }
            }
        }
        if (g4gVar != null) {
            return g4gVar;
        }
        throw new x050.e("Failed to find source encoder for data class: " + x.getClass());
    }

    public final <Z> nsg0<Z> e(Class<Z> cls) {
        nsg0<Z> nsg0Var = (nsg0) this.j.get(cls);
        if (nsg0Var == null) {
            for (Map.Entry<Class<?>, nsg0<?>> entry : this.j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    nsg0Var = (nsg0) entry.getValue();
                    break;
                }
            }
        }
        if (nsg0Var != null) {
            return nsg0Var;
        }
        if (!this.j.isEmpty() || !this.q) {
            return ffh0.b;
        }
        zqh0.a(cls, "Missing transformation for ", ". If you wish to ignore unknown resource types, use the optional transformation methods.");
        return null;
    }
}
