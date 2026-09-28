package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.edit.compose.EditPlayTimeControlScreenKt$EditPlayTimeControlScreen$2$1", f = "EditPlayTimeControlScreen.kt", l = {70}, m = "invokeSuspend", v = 2)
public final class fsf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ suf b;
    public final /* synthetic */ phx c;

    public static final class a<T> implements myh {
        public final /* synthetic */ phx a;

        public a(phx phxVar) {
            this.a = phxVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            id90 id90Var = (id90) obj;
            if (id90Var instanceof jsf.a) {
                jsf.a aVar = (jsf.a) id90Var;
                yfx.h(this.a, new en10(aVar.a.name(), aVar.b), bjx.a(new r8a(1, new kkx())), 4);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fsf(suf sufVar, phx phxVar, v1b<? super fsf> v1bVar) {
        super(2, v1bVar);
        this.b = sufVar;
        this.c = phxVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new fsf(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((fsf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to fsf for r5v2 'this'  v1b
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
            suf r6 = r5.b
            t340 r6 = r6.d
            fsf$a r1 = new fsf$a
            phx r4 = r5.c
            r1.<init>(r4)
            r5.a = r3
            a390<T> r6 = r6.a
            java.lang.Object r5 = r6.collect(r1, r5)
            if (r5 != r0) goto L2d
            return r0
        L2d:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fsf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
