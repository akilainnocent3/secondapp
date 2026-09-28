package defpackage;

import com.sportybet.feature.gift.gift.presentation.k;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.gift.gift.presentation.navigation.GiftNavHostKt$GiftNavHost$1$1", f = "GiftNavHost.kt", l = {38}, m = "invokeSuspend", v = 2)
public final class upk extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ ifx b;
    public final /* synthetic */ k c;

    public static final class a<T> implements myh {
        public final /* synthetic */ ifx a;
        public final /* synthetic */ k b;

        public a(ifx ifxVar, k kVar) {
            this.a = ifxVar;
            this.b = kVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            if (((Boolean) obj).booleanValue()) {
                this.a.a().e(Boolean.FALSE, "redeem_success");
                k kVar = this.b;
                kzh.d(kVar.b.h(pu0.c.a), o8i0.d(kVar));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public upk(ifx ifxVar, k kVar, v1b<? super upk> v1bVar) {
        super(2, v1bVar);
        this.b = ifxVar;
        this.c = kVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new upk(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((upk) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to upk for r6v3 'this'  v1b
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
            goto L3b
        L14:
            defpackage.uj50.b(r7)
            ifx r7 = r6.b
            if (r7 == 0) goto L3f
            vu60 r1 = r7.a()
            if (r1 == 0) goto L3f
            java.lang.String r4 = "redeem_success"
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            v340 r1 = r1.d(r5, r4)
            upk$a r4 = new upk$a
            com.sportybet.feature.gift.gift.presentation.k r5 = r6.c
            r4.<init>(r7, r5)
            r6.a = r3
            uwd0<T> r7 = r1.a
            java.lang.Object r6 = r7.collect(r4, r6)
            if (r6 != r0) goto L3b
            return r0
        L3b:
            defpackage.fkd.a()
            return r2
        L3f:
            kotlin.Unit r6 = kotlin.Unit.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.upk.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
