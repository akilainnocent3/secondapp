package defpackage;

import com.sporty.android.core.model.MyLog;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@c0d(c = "com.sporty.android.common.survey.SurveyWebViewManager$collectSurveyCancellation$1", f = "SurveyWebViewManager.kt", l = {221}, m = "invokeSuspend", v = 2)
public final class hje0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ oje0 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ oje0 a;

        public a(oje0 oje0Var) {
            this.a = oje0Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            oje0 oje0Var = this.a;
            h5b h5bVar = oje0Var.j;
            if (h5bVar != null) {
                h5bVar.a();
            }
            oje0Var.i = false;
            itf0.a aVar = itf0.a;
            aVar.q(MyLog.TAG_SURVEY);
            aVar.a("SurveyWebViewManager: cancel timer, " + oje0Var.i, new Object[0]);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hje0(oje0 oje0Var, v1b<? super hje0> v1bVar) {
        super(2, v1bVar);
        this.b = oje0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new hje0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((hje0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to hje0 for r5v2 'this'  v1b
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
            goto L2d
        L14:
            defpackage.uj50.b(r6)
            oje0 r6 = r5.b
            eje0 r1 = r6.e
            t340 r1 = r1.d
            hje0$a r4 = new hje0$a
            r4.<init>(r6)
            r5.a = r3
            a390<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L2d
            return r0
        L2d:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hje0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
