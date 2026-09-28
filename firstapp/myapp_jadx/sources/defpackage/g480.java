package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.security.newdevicelogin.securityaction.SecurityActionViewModel$logoutAllDevices$1", f = "SecurityActionViewModel.kt", l = {90}, m = "invokeSuspend", v = 2)
public final class g480 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ h480 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ h480 a;

        public a(h480 h480Var) {
            this.a = h480Var;
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
        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            wa aVar;
            lk50 lk50Var = (lk50) obj;
            h480 h480Var = this.a;
            wwd0 wwd0Var = h480Var.f;
            if (lk50Var instanceof lk50.c) {
                ej5.c(o8i0.d(h480Var), null, null, new f480(h480Var, null), 3);
                aVar = wa.d.b;
            } else if (lk50Var instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof SprThrowable) {
                    aVar = new wa.a(new StringUiText(((SprThrowable) th).getE()));
                } else {
                    StringUiText stringUiText = vch0.a;
                    aVar = new wa.a(new ResourceUiText(R.string.common_feedback__something_went_wrong_please_try_again));
                }
            } else {
                aVar = wa.c.b;
            }
            wwd0Var.setValue(aVar);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g480(h480 h480Var, v1b<? super g480> v1bVar) {
        super(2, v1bVar);
        this.b = h480Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g480(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g480) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            h480 h480Var = this.b;
            yzh yzhVarA = bm50.a(h480Var.a.X());
            a aVar = new a(h480Var);
            this.a = 1;
            if (yzhVarA.collect(aVar, this) == y5bVar) {
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
