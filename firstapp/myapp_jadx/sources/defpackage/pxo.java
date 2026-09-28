package defpackage;

import android.graphics.PointF;

/* JADX INFO: loaded from: classes.dex */
public final class pxo extends dpp<Integer> {
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
        int iIntValue;
        float f2;
        int iIntValue2;
        T t = cppVar.b;
        if (t == 0) {
            ib5.a("Missing values for keyframe.");
            return null;
        }
        T t2 = cppVar.c;
        if (t2 == 0) {
            iIntValue = cppVar.k;
            if (iIntValue == 784923401) {
                iIntValue = ((Integer) t).intValue();
                cppVar.k = iIntValue;
            }
        } else {
            int i = cppVar.l;
            if (i == 784923401) {
                iIntValue = ((Integer) t2).intValue();
                cppVar.l = iIntValue;
            } else {
                iIntValue = i;
            }
        }
        cpt<A> cptVar = this.e;
        if (cptVar != 0) {
            f2 = f;
            Integer num = (Integer) cptVar.b(cppVar.g, cppVar.h.floatValue(), (Integer) t, Integer.valueOf(iIntValue), f2, d(), this.d);
            if (num != null) {
                iIntValue2 = num.intValue();
            }
            return Integer.valueOf(iIntValue2);
        }
        f2 = f;
        int iIntValue3 = cppVar.k;
        if (iIntValue3 == 784923401) {
            iIntValue3 = ((Integer) t).intValue();
            cppVar.k = iIntValue3;
        }
        PointF pointF = rqv.a;
        iIntValue2 = (int) ((f2 * (iIntValue - iIntValue3)) + iIntValue3);
        return Integer.valueOf(iIntValue2);
    }
}
