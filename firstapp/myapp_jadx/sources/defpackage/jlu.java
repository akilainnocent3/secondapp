package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.home.MainViewModel$tryLaunchLoyaltyPromote$1", f = "MainViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jlu extends tje0 implements Function2<lk50<? extends Boolean>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ oku b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlu(v1b v1bVar, oku okuVar) {
        super(2, v1bVar);
        this.b = okuVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jlu jluVar = new jlu(v1bVar, this.b);
        jluVar.a = obj;
        return jluVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Boolean> lk50Var, v1b<? super Unit> v1bVar) {
        return ((jlu) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
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
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (!(lk50Var instanceof lk50.a) && !Intrinsics.g(lk50Var, lk50.b.a)) {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            this.b.c0.m(((lk50.c) lk50Var).a);
        }
        return Unit.a;
    }
}
