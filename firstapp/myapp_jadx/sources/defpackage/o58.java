package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class o58 extends dpp<Integer> {
    @Override // defpackage.u12
    public final Object f(cpp cppVar, float f) {
        return Integer.valueOf(l(cppVar, f));
    }

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
    public final int l(cpp<Integer> cppVar, float f) {
        float f2;
        Float f3;
        Integer num = cppVar.b;
        Integer num2 = cppVar.b;
        if (num == null || cppVar.c == null) {
            ib5.a("Missing values for keyframe.");
            return 0;
        }
        cpt<A> cptVar = this.e;
        if (cptVar == 0 || (f3 = cppVar.h) == null) {
            f2 = f;
        } else {
            f2 = f;
            Integer num3 = (Integer) cptVar.b(cppVar.g, f3.floatValue(), num2, cppVar.c, f2, d(), this.d);
            if (num3 != null) {
                return num3.intValue();
            }
        }
        return fyj.c(rqv.b(f2, 0.0f, 1.0f), num2.intValue(), cppVar.c.intValue());
    }
}
