package defpackage;

import android.content.Context;
import androidx.navigation.fragment.NavHostFragment;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileFragment$collectProfileEffect$1", f = "ProfileFragment.kt", l = {947}, m = "invokeSuspend", v = 2)
public final class o030 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d030 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ d030 a;

        public a(d030 d030Var) {
            this.a = d030Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            oz20 oz20Var = (oz20) obj;
            boolean z = oz20Var instanceof oz20.c;
            d030 d030Var = this.a;
            yfx yfxVarA = null;
            if (z) {
                try {
                    if (d030Var.isAdded()) {
                        yfxVarA = NavHostFragment.a.a(d030Var);
                    }
                } catch (IllegalStateException e) {
                    itf0.a.f(e, "Failed to find NavController", new Object[0]);
                }
                if (yfxVarA != null) {
                    xxf.c(yfxVarA, ((oz20.c) oz20Var).a);
                }
            } else if (oz20Var instanceof oz20.a) {
                ResourceUiText resourceUiText = ((oz20.a) oz20Var).a;
                Context contextRequireContext = d030Var.requireContext();
                contextRequireContext.getClass();
                zyf0.c(1, resourceUiText.e(contextRequireContext).toString());
            } else {
                if (!Intrinsics.g(oz20Var, oz20.b.a)) {
                    uhc.a();
                    return null;
                }
                try {
                    if (d030Var.isAdded()) {
                        yfxVarA = NavHostFragment.a.a(d030Var);
                    }
                } catch (IllegalStateException e2) {
                    itf0.a.f(e2, "Failed to find NavController", new Object[0]);
                }
                if (yfxVarA != null) {
                    yfx.h(yfxVarA, xwe.INSTANCE, bjx.a(new r8a(1, new kkx())), 4);
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o030(v1b v1bVar, d030 d030Var) {
        super(2, v1bVar);
        this.b = d030Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new o030(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((o030) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to o030 for r5v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r6) {
        /*
            r5 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r5.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r5)
            return r2
        L10:
            defpackage.uj50.b(r6)
            goto L31
        L14:
            defpackage.uj50.b(r6)
            ohp<java.lang.Object>[] r6 = defpackage.d030.S
            d030 r6 = r5.b
            a230 r1 = r6.s0()
            t340 r1 = r1.H
            o030$a r4 = new o030$a
            r4.<init>(r6)
            r5.a = r3
            a390<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L31
            return r0
        L31:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o030.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
