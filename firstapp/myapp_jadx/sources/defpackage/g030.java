package defpackage;

import com.sporty.android.common.network.data.SprThrowable;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileFragment$collectModifyUserInfoResult$1", f = "ProfileFragment.kt", l = {824}, m = "invokeSuspend", v = 2)
public final class g030 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d030 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ d030 a;

        public a(d030 d030Var) {
            this.a = d030Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            lk50 lk50Var = (lk50) obj;
            boolean z = lk50Var instanceof lk50.c;
            d030 d030Var = this.a;
            if (z) {
                zyf0.c(1, sn5.d(d030Var, R.string.common_feedback__succeeded, new Object[0]));
            } else if (lk50Var instanceof lk50.a) {
                Throwable th = ((lk50.a) lk50Var).a;
                if (th instanceof SprThrowable) {
                    zyf0.c(1, th.getMessage());
                } else {
                    zyf0.c(1, sn5.d(d030Var, R.string.common_functions__l_error, new Object[0]));
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g030(v1b v1bVar, d030 d030Var) {
        super(2, v1bVar);
        this.b = d030Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new g030(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((g030) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to g030 for r5v7 'this'  v1b
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
            goto L49
        L14:
            defpackage.uj50.b(r6)
            d030 r6 = r5.b
            nsm r1 = r6.A
            if (r1 == 0) goto L4d
            boolean r1 = r1.isConnected()
            if (r1 != 0) goto L33
            r5 = 0
            java.lang.Object[] r5 = new java.lang.Object[r5]
            r0 = 2132018143(0x7f1403df, float:1.9674584E38)
            java.lang.String r5 = defpackage.sn5.d(r6, r0, r5)
            defpackage.zyf0.c(r3, r5)
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        L33:
            a230 r1 = r6.s0()
            t340 r1 = r1.B
            g030$a r4 = new g030$a
            r4.<init>(r6)
            r5.a = r3
            a390<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L49
            return r0
        L49:
            defpackage.fkd.a()
            return r2
        L4d:
            java.lang.String r5 = "connectivityMonitor"
            kotlin.jvm.internal.Intrinsics.n(r5)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g030.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
