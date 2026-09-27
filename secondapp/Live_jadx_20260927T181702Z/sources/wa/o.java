package wa;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
/* JADX INFO: loaded from: classes2.dex */
public class o extends g<za.b> {

    /* JADX INFO: compiled from: r8-map-id-fe3a094fefd4170380533b2bee0729f4459fea13fa461ce83871544caf231bbc */
    public class a extends hb.j<za.b> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ hb.b f142603d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ hb.j f142604e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ za.b f142605f;

        public a(hb.b bVar, hb.j jVar, za.b bVar2) {
            this.f142603d = bVar;
            this.f142604e = jVar;
            this.f142605f = bVar2;
        }

        @Override // hb.j
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public za.b a(hb.b<za.b> bVar) {
            this.f142603d.h(bVar.f(), bVar.a(), bVar.g().f160906a, bVar.b().f160906a, bVar.d(), bVar.c(), bVar.e());
            String str = (String) this.f142604e.a(this.f142603d);
            za.b bVarB = bVar.c() == 1.0f ? bVar.b() : bVar.g();
            this.f142605f.a(str, bVarB.f160907b, bVarB.f160908c, bVarB.f160909d, bVarB.f160910e, bVarB.f160911f, bVarB.f160912g, bVarB.f160913h, bVarB.f160914i, bVarB.f160915j, bVarB.f160916k, bVarB.f160917l, bVarB.f160918m);
            return this.f142605f;
        }
    }

    public o(List<hb.a<za.b>> list) {
        super(list);
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
    public za.b i(hb.a<za.b> aVar, float f10) {
        za.b bVar;
        hb.j<A> jVar = this.f142557e;
        if (jVar == 0) {
            return (f10 != 1.0f || (bVar = aVar.f88081c) == null) ? aVar.f88080b : bVar;
        }
        float f11 = aVar.f88085g;
        Float f12 = aVar.f88086h;
        float fFloatValue = f12 == null ? Float.MAX_VALUE : f12.floatValue();
        za.b bVar2 = aVar.f88080b;
        za.b bVar3 = bVar2;
        za.b bVar4 = aVar.f88081c;
        return (za.b) jVar.b(f11, fFloatValue, bVar3, bVar4 == null ? bVar2 : bVar4, f10, d(), f());
    }

    public void s(hb.j<String> jVar) {
        super.o(new a(new hb.b(), jVar, new za.b()));
    }
}
