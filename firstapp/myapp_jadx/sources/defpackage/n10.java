package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.compose.foundation.gestures.AnchoredDraggableNode$drag$2", f = "AnchoredDraggable.kt", l = {409}, m = "invokeSuspend")
public final class n10 extends tje0 implements gaj<t00, n9f<Object>, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ t00 b;
    public final /* synthetic */ g9f.a c;
    public final /* synthetic */ q10<Object> d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n10(g9f.a aVar, q10 q10Var, v1b v1bVar) {
        super(3, v1bVar);
        this.c = aVar;
        this.d = q10Var;
    }

    @Override // defpackage.gaj
    public final Object invoke(t00 t00Var, n9f<Object> n9fVar, v1b<? super Unit> v1bVar) {
        n10 n10Var = new n10(this.c, this.d, v1bVar);
        n10Var.b = t00Var;
        return n10Var.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            final t00 t00Var = this.b;
            final q10<Object> q10Var = this.d;
            Function1<? super v7f.b, ? extends Unit> function1 = new Function1() { // from class: m10
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
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    long j = ((v7f.b) obj2).a;
                    q10 q10Var2 = q10Var;
                    long jG = gly.g(q10Var2.C2() ? -1.0f : 1.0f, j);
                    t00Var.a(q10Var2.O.d(Float.intBitsToFloat((int) (q10Var2.P == i3z.a ? jG & 4294967295L : jG >> 32))), 0.0f);
                    return Unit.a;
                }
            };
            this.a = 1;
            if (this.c.invoke(function1, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
