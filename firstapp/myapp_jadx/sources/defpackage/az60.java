package defpackage;

import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class az60 extends dpp<cz60> {
    public final cz60 i;

    public az60(List<cpp<cz60>> list) {
        super(list);
        this.i = new cz60();
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
    @Override // defpackage.u12
    public final Object f(cpp cppVar, float f) {
        T t;
        float f2;
        T t2 = cppVar.b;
        if (t2 == 0 || (t = cppVar.c) == 0) {
            ib5.a("Missing values for keyframe.");
            return null;
        }
        cz60 cz60Var = (cz60) t2;
        cz60 cz60Var2 = (cz60) t;
        cpt<A> cptVar = this.e;
        if (cptVar != 0) {
            f2 = f;
            cz60 cz60Var3 = (cz60) cptVar.b(cppVar.g, cppVar.h.floatValue(), cz60Var, cz60Var2, f2, d(), this.d);
            if (cz60Var3 != null) {
                return cz60Var3;
            }
        } else {
            f2 = f;
        }
        float f3 = rqv.f(cz60Var.a, cz60Var2.a, f2);
        float f4 = rqv.f(cz60Var.b, cz60Var2.b, f2);
        cz60 cz60Var4 = this.i;
        cz60Var4.a = f3;
        cz60Var4.b = f4;
        return cz60Var4;
    }
}
