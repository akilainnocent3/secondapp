package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.home.HomeViewModel$checkIsPasswordResetForced$1", f = "HomeViewModel.kt", l = {914}, m = "invokeSuspend", v = 2)
public final class bim extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ iim b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bim(iim iimVar, v1b<? super bim> v1bVar) {
        super(2, v1bVar);
        this.b = iimVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new bim(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((bim) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
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
        String phoneNumber;
        y5b y5bVar = y5b.a;
        int i = this.a;
        iim iimVar = this.b;
        if (i == 0) {
            uj50.b(obj);
            ui7 ui7Var = iimVar.K;
            this.a = 1;
            obj = ui7Var.a(this);
            if (obj == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        lk50 lk50Var = (lk50) obj;
        if ((lk50Var instanceof lk50.c) && (phoneNumber = iimVar.d.getPhoneNumber()) != null && !StringsKt.U(phoneNumber)) {
            iimVar.M0.a(((lk50.c) lk50Var).a);
        }
        return Unit.a;
    }
}
