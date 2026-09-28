package defpackage;

import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.confirmation.compose.EditPlayTimeConfirmationScreenKt$EditPlayTimeConfirmationScreen$2$1", f = "EditPlayTimeConfirmationScreen.kt", l = {62}, m = "invokeSuspend", v = 2)
public final class drf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ mrf b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ ytw<uqf> d;
    public final /* synthetic */ ytw<String> e;

    public static final class a<T> implements myh {
        public final /* synthetic */ Context a;
        public final /* synthetic */ ytw<uqf> b;
        public final /* synthetic */ ytw<String> c;

        public a(Context context, ytw<uqf> ytwVar, ytw<String> ytwVar2) {
            this.a = context;
            this.b = ytwVar;
            this.c = ytwVar2;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            id90 id90Var = (id90) obj;
            if (id90Var instanceof grf.b) {
                this.b.setValue(((grf.b) id90Var).a);
            } else if (id90Var instanceof grf.c) {
                this.c.setValue(((grf.c) id90Var).a.g(this.a));
            } else if (id90Var instanceof grf.a) {
                sh8.c().e(o7d.a(wae.HOME));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public drf(mrf mrfVar, Context context, ytw<uqf> ytwVar, ytw<String> ytwVar2, v1b<? super drf> v1bVar) {
        super(2, v1bVar);
        this.b = mrfVar;
        this.c = context;
        this.d = ytwVar;
        this.e = ytwVar2;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new drf(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((drf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to drf for r7v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r7.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r7)
            return r2
        L10:
            defpackage.uj50.b(r8)
            goto L31
        L14:
            defpackage.uj50.b(r8)
            mrf r8 = r7.b
            t340 r8 = r8.d
            drf$a r1 = new drf$a
            ytw<uqf> r4 = r7.d
            ytw<java.lang.String> r5 = r7.e
            android.content.Context r6 = r7.c
            r1.<init>(r6, r4, r5)
            r7.a = r3
            a390<T> r8 = r8.a
            java.lang.Object r7 = r8.collect(r1, r7)
            if (r7 != r0) goto L31
            return r0
        L31:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.drf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
