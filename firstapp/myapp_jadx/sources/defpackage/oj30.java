package defpackage;

import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.compose.ui.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oj30 implements Function2 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ Object b;

    public /* synthetic */ oj30(tak0 tak0Var) {
        this.b = tak0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rj30.b((d) obj3, (a) obj, qj40.a(1));
                break;
            default:
                final tak0 tak0Var = (tak0) obj3;
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ytw ytwVarC = wyh.c(((xak0) tak0Var.f.getValue()).b, aVar, 0, 7);
                    o0z.a(null, null, null, null, null, pp8.b(1349191371, new Function2() { // from class: pak0
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
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj4, Object obj5) {
                            String string;
                            String string2;
                            a aVar2 = (a) obj4;
                            int iIntValue2 = ((Integer) obj5).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                tak0 tak0Var2 = tak0Var;
                                Bundle arguments = tak0Var2.getArguments();
                                String string3 = arguments != null ? arguments.getString("WORLD_CUP_PASS_PRICE") : null;
                                twd0 twd0Var = ytwVarC;
                                if (string3 != null) {
                                    aVar2.N(1456335626);
                                    String str = ((wak0) twd0Var.getValue()).a;
                                    boolean zA = aVar2.A(tak0Var2);
                                    Object objY = aVar2.y();
                                    Object obj6 = a.C0041a.a;
                                    if (zA || objY == obj6) {
                                        objY = new avb(tak0Var2, 4);
                                        aVar2.r(objY);
                                    }
                                    Function0<Unit> function0 = (Function0) objY;
                                    boolean zA2 = aVar2.A(tak0Var2);
                                    Object objY2 = aVar2.y();
                                    if (zA2 || objY2 == obj6) {
                                        objY2 = new p13(tak0Var2, 1);
                                        aVar2.r(objY2);
                                    }
                                    tak0Var2.o0(string3, str, function0, (Function0) objY2, aVar2, 0);
                                    aVar2.H();
                                } else {
                                    aVar2.N(1456854256);
                                    Bundle arguments2 = tak0Var2.getArguments();
                                    String str2 = (arguments2 == null || (string2 = arguments2.getString("MESSAGE")) == null) ? "" : string2;
                                    Bundle arguments3 = tak0Var2.getArguments();
                                    String str3 = (arguments3 == null || (string = arguments3.getString("ACTION")) == null) ? "" : string;
                                    Bundle arguments4 = tak0Var2.getArguments();
                                    tak0Var2.n0(0, aVar2, str2, ((wak0) twd0Var.getValue()).a, str3, arguments4 != null ? arguments4.getBoolean("SHOW_SUCCESSFUL_STATUS") : false);
                                    aVar2.H();
                                }
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 196608);
                } else {
                    aVar.G();
                }
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ oj30(d dVar, int i) {
        this.b = dVar;
    }
}
