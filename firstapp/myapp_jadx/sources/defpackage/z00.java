package defpackage;

import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.SportyTvRedirectActivity;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.a;
import com.sportybet.feature.loyalty.impl.worldcuppass.sportyTvRedirect.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class z00 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ z00(Object obj, int i) {
        this.a = i;
        this.b = obj;
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
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return Float.valueOf(((mmd) obj).C1(125.0f));
            case 1:
                tud tudVarS0 = ((usd) obj).P0();
                ej5.c(o8i0.d(tudVarS0), null, null, new ptd(tudVarS0, null), 3);
                return Unit.a;
            default:
                int i2 = SportyTvRedirectActivity.c;
                b bVar = (b) ((SportyTvRedirectActivity) obj).b.getValue();
                wed0 wed0Var = wed0.a;
                wed0Var.getClass();
                if (wed0Var.equals(wed0Var)) {
                    bVar.x1(a.C0402a.a);
                    return Unit.a;
                }
                uhc.a();
                return null;
        }
    }
}
