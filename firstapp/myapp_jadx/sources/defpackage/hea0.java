package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.search.SocialNetworkSearchScreenKt$SocialNetworkSearchScreen$1$1", f = "SocialNetworkSearchScreen.kt", l = {73}, m = "invokeSuspend", v = 2)
public final class hea0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ rea0 b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ytw<Boolean> d;

    public static final class a<T> implements myh {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ytw<Boolean> b;

        public a(Context context, ytw<Boolean> ytwVar) {
            this.a = context;
            this.b = ytwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            id90 id90Var = (id90) obj;
            if (id90Var instanceof rb90) {
                UiText uiText = ((rb90) id90Var).a;
                Context context = this.a;
                Toast.makeText(context, uiText.g(context), 1).show();
            } else if (id90Var instanceof lea0) {
                uf00<d9a0> uf00Var = kea0.a;
                this.b.setValue(Boolean.TRUE);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hea0(rea0 rea0Var, Context context, ytw<Boolean> ytwVar, v1b<? super hea0> v1bVar) {
        super(2, v1bVar);
        this.b = rea0Var;
        this.c = context;
        this.d = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hea0(this.b, this.c, this.d, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((hea0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to hea0 for r6v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r6.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r6)
            return r2
        L10:
            defpackage.uj50.b(r7)
            goto L2f
        L14:
            defpackage.uj50.b(r7)
            rea0 r7 = r6.b
            t340 r7 = r7.d
            hea0$a r1 = new hea0$a
            android.content.Context r4 = r6.c
            ytw<java.lang.Boolean> r5 = r6.d
            r1.<init>(r4, r5)
            r6.a = r3
            a390<T> r7 = r7.a
            java.lang.Object r6 = r7.collect(r1, r6)
            if (r6 != r0) goto L2f
            return r0
        L2f:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hea0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
