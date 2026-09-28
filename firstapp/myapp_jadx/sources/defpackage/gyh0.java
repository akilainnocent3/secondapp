package defpackage;

import com.sportybet.android.account.mfa.Verify2FAFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.account.mfa.Verify2FAFragment$collectMFAFacialRecognitionEvent$1", f = "Verify2FAFragment.kt", l = {206}, m = "invokeSuspend", v = 2)
public final class gyh0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Verify2FAFragment b;

    public static final class a<T> implements myh {
        public final /* synthetic */ Verify2FAFragment a;

        public a(Verify2FAFragment verify2FAFragment) {
            this.a = verify2FAFragment;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            u6h u6hVar = (u6h) obj;
            ee<u6h> eeVar = this.a.H;
            if (eeVar != null) {
                eeVar.b(u6hVar);
                return Unit.a;
            }
            Intrinsics.n("launcher");
            throw null;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gyh0(v1b v1bVar, Verify2FAFragment verify2FAFragment) {
        super(2, v1bVar);
        this.b = verify2FAFragment;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new gyh0(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((gyh0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to gyh0 for r5v3 'this'  v1b
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
            goto L2f
        L14:
            defpackage.uj50.b(r6)
            com.sportybet.android.account.mfa.Verify2FAFragment r6 = r5.b
            ocu r1 = r6.C
            if (r1 == 0) goto L33
            t340 r1 = r1.B
            gyh0$a r4 = new gyh0$a
            r4.<init>(r6)
            r5.a = r3
            a390<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L2f
            return r0
        L2f:
            defpackage.fkd.a()
            return r2
        L33:
            java.lang.String r5 = "viewModel"
            kotlin.jvm.internal.Intrinsics.n(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gyh0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
