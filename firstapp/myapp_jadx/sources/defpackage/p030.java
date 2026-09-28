package defpackage;

import android.content.Intent;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.webcontainer.activities.WebViewActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.profile.ProfileFragment$collectTelegramBindingAction$1", f = "ProfileFragment.kt", l = {878}, m = "invokeSuspend", v = 2)
public final class p030 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ d030 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ d030 a;

        public a(d030 d030Var) {
            this.a = d030Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            naf0 naf0Var = (naf0) obj;
            if (naf0Var instanceof naf0.a) {
                d030 d030Var = this.a;
                Intent intent = new Intent(d030Var.requireContext(), (Class<?>) WebViewActivity.class);
                intent.putExtra("title", sn5.d(d030Var, R.string.telegram__bind_title, new Object[0]));
                intent.putExtra("url", ((naf0.a) naf0Var).a.toString());
                intent.putExtra("requestCode", 7);
                ee<Intent> eeVar = d030Var.R;
                if (eeVar == null) {
                    Intrinsics.n("activityResultLauncher");
                    throw null;
                }
                eeVar.b(intent);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p030(v1b v1bVar, d030 d030Var) {
        super(2, v1bVar);
        this.b = d030Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new p030(v1bVar, this.b);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((p030) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to p030 for r5v3 'this'  v1b
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
            goto L4e
        L14:
            defpackage.uj50.b(r6)
            d030 r6 = r5.b
            psm r1 = r6.o0()
            boolean r1 = r1.r()
            if (r1 != 0) goto L52
            psm r1 = r6.o0()
            boolean r1 = r1.W()
            if (r1 != 0) goto L52
            psm r1 = r6.o0()
            boolean r1 = r1.O()
            if (r1 == 0) goto L38
            goto L52
        L38:
            vaf0 r1 = r6.r0()
            t340 r1 = r1.A
            p030$a r4 = new p030$a
            r4.<init>(r6)
            r5.a = r3
            a390<T> r6 = r1.a
            java.lang.Object r5 = r6.collect(r4, r5)
            if (r5 != r0) goto L4e
            return r0
        L4e:
            defpackage.fkd.a()
            return r2
        L52:
            kotlin.Unit r5 = kotlin.Unit.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p030.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
