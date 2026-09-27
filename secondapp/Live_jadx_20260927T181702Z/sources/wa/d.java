package wa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class d extends g<Float> {
    public d(List<hb.a<Float>> list) {
        super(list);
    }

    public float r() {
        return s(b(), d());
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
    public float s(hb.a<Float> aVar, float f10) {
        float f11;
        if (aVar.f88080b == null || aVar.f88081c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hb.j<A> jVar = this.f142557e;
        if (jVar != 0) {
            f11 = f10;
            Float f12 = (Float) jVar.b(aVar.f88085g, aVar.f88086h.floatValue(), aVar.f88080b, aVar.f88081c, f11, e(), f());
            if (f12 != null) {
                return f12.floatValue();
            }
        } else {
            f11 = f10;
        }
        return gb.l.k(aVar.g(), aVar.d(), f11);
    }

    @Override // wa.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Float i(hb.a<Float> aVar, float f10) {
        return Float.valueOf(s(aVar, f10));
    }
}
