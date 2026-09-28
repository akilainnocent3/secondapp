package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class zwh extends dpp<Float> {
    @Override // defpackage.u12
    public final Object f(cpp cppVar, float f) {
        return Float.valueOf(m(cppVar, f));
    }

    public final float l() {
        return m(this.c.b(), c());
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
    public final float m(cpp<Float> cppVar, float f) {
        float f2;
        Float f3 = cppVar.b;
        Float f4 = cppVar.b;
        if (f3 == null || cppVar.c == null) {
            ib5.a("Missing values for keyframe.");
            return 0.0f;
        }
        cpt<A> cptVar = this.e;
        if (cptVar != 0) {
            f2 = f;
            Float f5 = (Float) cptVar.b(cppVar.g, cppVar.h.floatValue(), f4, cppVar.c, f2, d(), this.d);
            if (f5 != null) {
                return f5.floatValue();
            }
        } else {
            f2 = f;
        }
        float fFloatValue = cppVar.i;
        if (fFloatValue == -3987645.8f) {
            fFloatValue = f4.floatValue();
            cppVar.i = fFloatValue;
        }
        float fFloatValue2 = cppVar.j;
        if (fFloatValue2 == -3987645.8f) {
            fFloatValue2 = cppVar.c.floatValue();
            cppVar.j = fFloatValue2;
        }
        return rqv.f(fFloatValue, fFloatValue2, f2);
    }
}
