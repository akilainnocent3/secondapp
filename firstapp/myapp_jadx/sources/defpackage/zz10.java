package defpackage;

import android.graphics.PointF;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class zz10 extends dpp<PointF> {
    public final PointF i;

    public zz10(List<cpp<PointF>> list) {
        super(list);
        this.i = new PointF();
    }

    @Override // defpackage.u12
    public final Object f(cpp cppVar, float f) {
        return g(cppVar, f, f, f);
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
    @Override // defpackage.u12
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public final PointF g(cpp<PointF> cppVar, float f, float f2, float f3) {
        PointF pointF;
        PointF pointF2;
        PointF pointF3 = cppVar.b;
        if (pointF3 == null || (pointF = cppVar.c) == null) {
            ib5.a("Missing values for keyframe.");
            return null;
        }
        PointF pointF4 = pointF3;
        PointF pointF5 = pointF;
        cpt<A> cptVar = this.e;
        if (cptVar != 0 && (pointF2 = (PointF) cptVar.b(cppVar.g, cppVar.h.floatValue(), pointF4, pointF5, f, d(), this.d)) != null) {
            return pointF2;
        }
        float f4 = pointF4.x;
        float fA = hxa.a(pointF5.x, f4, f2, f4);
        float f5 = pointF4.y;
        float fA2 = hxa.a(pointF5.y, f5, f3, f5);
        PointF pointF6 = this.i;
        pointF6.set(fA, fA2);
        return pointF6;
    }
}
