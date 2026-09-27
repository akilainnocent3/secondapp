package wa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class l extends g<hb.k> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final hb.k f142591i;

    public l(List<hb.a<hb.k>> list) {
        super(list);
        this.f142591i = new hb.k();
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
    @Override // wa.a
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public hb.k i(hb.a<hb.k> aVar, float f10) {
        hb.k kVar;
        float f11;
        hb.k kVar2 = aVar.f88080b;
        if (kVar2 == null || (kVar = aVar.f88081c) == null) {
            throw new IllegalStateException("Missing values for keyframe.");
        }
        hb.k kVar3 = kVar2;
        hb.k kVar4 = kVar;
        hb.j<A> jVar = this.f142557e;
        if (jVar != 0) {
            f11 = f10;
            hb.k kVar5 = (hb.k) jVar.b(aVar.f88085g, aVar.f88086h.floatValue(), kVar3, kVar4, f11, e(), f());
            if (kVar5 != null) {
                return kVar5;
            }
        } else {
            f11 = f10;
        }
        this.f142591i.d(gb.l.k(kVar3.b(), kVar4.b(), f11), gb.l.k(kVar3.c(), kVar4.c(), f11));
        return this.f142591i;
    }
}
