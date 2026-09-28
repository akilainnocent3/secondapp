package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.sportystories.presentation.viewer.StoriesViewerKt$StoryCarousel$1$1", f = "StoriesViewer.kt", l = {144}, m = "invokeSuspend", v = 2)
public final class u2e0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ c2e0 b;
    public final /* synthetic */ zpz c;

    public static final class a<T> implements myh {
        public final /* synthetic */ zpz a;

        public a(zpz zpzVar) {
            this.a = zpzVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            int iIntValue = ((Number) obj).intValue();
            zpz zpzVar = this.a;
            return iIntValue != zpzVar.k() ? zpzVar.f(iIntValue, yi0.d(0.0f, 0.0f, null, 7), v1bVar) : Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2e0(c2e0 c2e0Var, zpz zpzVar, v1b<? super u2e0> v1bVar) {
        super(2, v1bVar);
        this.b = c2e0Var;
        this.c = zpzVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u2e0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u2e0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to u2e0 for r4v5 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r5) {
        /*
            r4 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r4.a
            r2 = 1
            if (r1 == 0) goto L14
            if (r1 != r2) goto Ld
            defpackage.uj50.b(r5)
            goto L37
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r4)
            r4 = 0
            return r4
        L14:
            defpackage.uj50.b(r5)
            c2e0 r5 = r4.b
            v340 r5 = r5.C
            u2e0$a r1 = new u2e0$a
            zpz r3 = r4.c
            r1.<init>(r3)
            r4.a = r2
            f1i$a r2 = new f1i$a
            r2.<init>(r1)
            uwd0<T> r5 = r5.a
            java.lang.Object r4 = r5.collect(r2, r4)
            if (r4 != r0) goto L32
            goto L34
        L32:
            kotlin.Unit r4 = kotlin.Unit.a
        L34:
            if (r4 != r0) goto L37
            return r0
        L37:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u2e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
