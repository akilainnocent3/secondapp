package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class fkf0 extends dpp<kye> {
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
    @Override // defpackage.u12
    public final Object f(cpp cppVar, float f) {
        T t;
        T t2 = cppVar.b;
        cpt<A> cptVar = this.e;
        if (cptVar == 0) {
            return (f != 1.0f || (t = cppVar.c) == 0) ? (kye) t2 : (kye) t;
        }
        float f2 = cppVar.g;
        Float f3 = cppVar.h;
        float fFloatValue = f3 == null ? Float.MAX_VALUE : f3.floatValue();
        kye kyeVar = (kye) t2;
        T t3 = cppVar.c;
        return (kye) cptVar.b(f2, fFloatValue, kyeVar, t3 == 0 ? kyeVar : (kye) t3, f, c(), this.d);
    }
}
