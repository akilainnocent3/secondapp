package wa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class b extends g<Integer> {
    public b(List<hb.a<Integer>> list) {
        super(list);
    }

    public int r() {
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
    public int s(hb.a<Integer> aVar, float f10) {
        float f11;
        Float f12;
        if (aVar.f88080b == null || aVar.f88081c == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hb.j<A> jVar = this.f142557e;
        if (jVar == 0 || (f12 = aVar.f88086h) == null) {
            f11 = f10;
        } else {
            f11 = f10;
            Integer num = (Integer) jVar.b(aVar.f88085g, f12.floatValue(), aVar.f88080b, aVar.f88081c, f11, e(), f());
            if (num != null) {
                return num.intValue();
            }
        }
        return gb.e.c(gb.l.c(f11, 0.0f, 1.0f), aVar.f88080b.intValue(), aVar.f88081c.intValue());
    }

    @Override // wa.a
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public Integer i(hb.a<Integer> aVar, float f10) {
        return Integer.valueOf(s(aVar, f10));
    }
}
