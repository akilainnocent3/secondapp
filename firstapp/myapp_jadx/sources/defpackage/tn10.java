package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.playtimecontrol.navigation.PlayTimeControlNavigationKt$mainScreen$1$5$1", f = "PlayTimeControlNavigation.kt", l = {95}, m = "invokeSuspend", v = 2)
public final class tn10 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ cn10 b;
    public final /* synthetic */ phx c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ytw<Boolean> e;

    public static final class a<T> implements myh {
        public final /* synthetic */ phx a;
        public final /* synthetic */ Context b;
        public final /* synthetic */ ytw<Boolean> c;

        public a(phx phxVar, Context context, ytw<Boolean> ytwVar) {
            this.a = phxVar;
            this.b = context;
            this.c = ytwVar;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            id90 id90Var = (id90) obj;
            if (id90Var instanceof dr10.a) {
                yfx.h(this.a, new dn10(((dr10.a) id90Var).a.name(), "", ""), bjx.a(new r8a(1, new kkx())), 4);
            } else if (id90Var instanceof rb90) {
                UiText uiText = ((rb90) id90Var).a;
                Context context = this.b;
                Toast.makeText(context, uiText.g(context), 1).show();
            } else if (id90Var instanceof dr10.b) {
                this.c.setValue(Boolean.TRUE);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tn10(cn10 cn10Var, phx phxVar, Context context, ytw<Boolean> ytwVar, v1b<? super tn10> v1bVar) {
        super(2, v1bVar);
        this.b = cn10Var;
        this.c = phxVar;
        this.d = context;
        this.e = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new tn10(this.b, this.c, this.d, this.e, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((tn10) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to tn10 for r7v2 'this'  v1b
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
            cn10 r8 = r7.b
            t340 r8 = r8.d
            tn10$a r1 = new tn10$a
            android.content.Context r4 = r7.d
            ytw<java.lang.Boolean> r5 = r7.e
            phx r6 = r7.c
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
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn10.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
