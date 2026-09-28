package defpackage;

import android.app.Activity;
import android.content.Intent;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.codehub.ui.CodeHubActivity;
import com.sportybet.feature.worldcup.WorldCupActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.worldcuptournament.ui.WorldCupPanelKt$WorldCupPanelComponent$16$1", f = "WorldCupPanel.kt", l = {132}, m = "invokeSuspend", v = 2)
public final class yzj0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ t0k0 b;
    public final /* synthetic */ Activity c;

    public static final class a<T> implements myh {
        public final /* synthetic */ Activity a;

        public a(Activity activity) {
            this.a = activity;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            m0k0 m0k0Var = (m0k0) obj;
            boolean z = m0k0Var instanceof m0k0.f;
            Activity activity = this.a;
            if (z) {
                activity.getClass();
                FragmentManager supportFragmentManager = ((fq0) activity).getSupportFragmentManager();
                supportFragmentManager.getClass();
                m0k0.f fVar = (m0k0.f) m0k0Var;
                String str = fVar.a;
                String str2 = fVar.b;
                boolean z2 = fVar.c;
                str.getClass();
                str2.getClass();
                xyd0 xyd0VarA = xyd0.a.a(str, str2, z2, null);
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                aVar.e(0, xyd0VarA, "statisticsDialogFragment", 1);
                s75.a(aVar.k(false, true));
            } else if (Intrinsics.g(m0k0Var, m0k0.e.a)) {
                qz3.p(activity);
            } else if (Intrinsics.g(m0k0Var, m0k0.c.a)) {
                qz3.m(activity);
            } else if (Intrinsics.g(m0k0Var, m0k0.d.a)) {
                qz3.o(activity);
            } else if (Intrinsics.g(m0k0Var, m0k0.b.a)) {
                if (activity != null) {
                    int i = WorldCupActivity.b;
                    activity.startActivity(new Intent(activity, (Class<?>) WorldCupActivity.class));
                }
            } else {
                if (!Intrinsics.g(m0k0Var, m0k0.a.a)) {
                    uhc.a();
                    return null;
                }
                if (activity != null) {
                    activity.startActivity(new Intent(activity, (Class<?>) CodeHubActivity.class));
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yzj0(t0k0 t0k0Var, Activity activity, v1b<? super yzj0> v1bVar) {
        super(2, v1bVar);
        this.b = t0k0Var;
        this.c = activity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new yzj0(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((yzj0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to yzj0 for r5v2 'this'  v1b
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
            t0k0 r6 = r5.b
            t340 r6 = r6.Q
            yzj0$a r1 = new yzj0$a
            android.app.Activity r4 = r5.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yzj0.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
