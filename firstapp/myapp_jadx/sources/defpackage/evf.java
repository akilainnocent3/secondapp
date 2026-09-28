package defpackage;

import android.content.Context;
import android.widget.Toast;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.username.EditUsernameBottomSheetKt$EditUsernameBottomSheet$2$1", f = "EditUsernameBottomSheet.kt", l = {75}, m = "invokeSuspend", v = 2)
public final class evf extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ lvf b;
    public final /* synthetic */ Context c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Function0<Unit> e;
    public final /* synthetic */ ytw<Boolean> f;
    public final /* synthetic */ ytw<Boolean> i;
    public final /* synthetic */ ytw<Boolean> v;

    public static final class a<T> implements myh {
        public final /* synthetic */ Context a;
        public final /* synthetic */ String b;
        public final /* synthetic */ Function0<Unit> c;
        public final /* synthetic */ ytw<Boolean> d;
        public final /* synthetic */ ytw<Boolean> e;
        public final /* synthetic */ ytw<Boolean> f;

        public a(Context context, String str, Function0<Unit> function0, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, ytw<Boolean> ytwVar3) {
            this.a = context;
            this.b = str;
            this.c = function0;
            this.d = ytwVar;
            this.e = ytwVar2;
            this.f = ytwVar3;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            id90 id90Var = (id90) obj;
            this.d.setValue(Boolean.FALSE);
            if (id90Var instanceof jvf.e) {
                this.e.setValue(Boolean.TRUE);
            } else if (Intrinsics.g(id90Var, jvf.a.a)) {
                this.f.setValue(Boolean.TRUE);
            } else if (!Intrinsics.g(id90Var, jvf.d.a) && !Intrinsics.g(id90Var, jvf.c.a)) {
                boolean zG = Intrinsics.g(id90Var, jvf.b.a);
                String str = this.b;
                Context context = this.a;
                if (zG) {
                    Toast.makeText(context, str, 0).show();
                    this.c.invoke();
                } else if (Intrinsics.g(id90Var, jvf.f.a)) {
                    Toast.makeText(context, str, 0).show();
                }
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public evf(lvf lvfVar, Context context, String str, Function0<Unit> function0, ytw<Boolean> ytwVar, ytw<Boolean> ytwVar2, ytw<Boolean> ytwVar3, v1b<? super evf> v1bVar) {
        super(2, v1bVar);
        this.b = lvfVar;
        this.c = context;
        this.d = str;
        this.e = function0;
        this.f = ytwVar;
        this.i = ytwVar2;
        this.v = ytwVar3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new evf(this.b, this.c, this.d, this.e, this.f, this.i, this.v, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        ((evf) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        return y5b.a;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to evf for r11v2 'this'  v1b
        	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
        	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
        	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
        	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // defpackage.pz1
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            y5b r0 = defpackage.y5b.a
            int r1 = r11.a
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L14
            if (r1 == r3) goto L10
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r11)
            return r2
        L10:
            defpackage.uj50.b(r12)
            goto L37
        L14:
            defpackage.uj50.b(r12)
            lvf r12 = r11.b
            t340 r12 = r12.d
            evf$a r4 = new evf$a
            ytw<java.lang.Boolean> r9 = r11.i
            ytw<java.lang.Boolean> r10 = r11.v
            android.content.Context r5 = r11.c
            java.lang.String r6 = r11.d
            kotlin.jvm.functions.Function0<kotlin.Unit> r7 = r11.e
            ytw<java.lang.Boolean> r8 = r11.f
            r4.<init>(r5, r6, r7, r8, r9, r10)
            r11.a = r3
            a390<T> r12 = r12.a
            java.lang.Object r11 = r12.collect(r4, r11)
            if (r11 != r0) goto L37
            return r0
        L37:
            defpackage.fkd.a()
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.evf.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
