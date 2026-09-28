package defpackage;

/* JADX INFO: loaded from: classes.dex */
public final class bqa0 implements cpc.a<Object> {
    public final /* synthetic */ i2w.a a;
    public final /* synthetic */ cqa0 b;

    public bqa0(cqa0 cqa0Var, i2w.a aVar) {
        this.b = cqa0Var;
        this.a = aVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cpc.a
    public final void c(Exception exc) {
        cqa0 cqa0Var = this.b;
        i2w.a<?> aVar = this.a;
        i2w.a<?> aVar2 = cqa0Var.f;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        cqa0 cqa0Var2 = this.b;
        i2w.a aVar3 = this.a;
        u4d u4dVar = cqa0Var2.b;
        nlp nlpVar = cqa0Var2.i;
        cpc<Data> cpcVar = aVar3.c;
        u4dVar.a(nlpVar, exc, cpcVar, cpcVar.e());
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // cpc.a
    public final void f(Object obj) {
        cqa0 cqa0Var = this.b;
        i2w.a<?> aVar = this.a;
        i2w.a<?> aVar2 = cqa0Var.f;
        if (aVar2 == null || aVar2 != aVar) {
            return;
        }
        cqa0 cqa0Var2 = this.b;
        i2w.a aVar3 = this.a;
        hre hreVar = cqa0Var2.a.p;
        if (obj != null && hreVar.c(aVar3.c.e())) {
            cqa0Var2.e = obj;
            cqa0Var2.b.m(u4d.e.b);
        } else {
            u4d u4dVar = cqa0Var2.b;
            nlp nlpVar = aVar3.a;
            cpc<Data> cpcVar = aVar3.c;
            u4dVar.c(nlpVar, obj, cpcVar, cpcVar.e(), cqa0Var2.i);
        }
    }
}
