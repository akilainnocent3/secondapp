package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.bonuscup.presentation.BonusCupViewModel$observeGameState$1", f = "BonusCupViewModel.kt", l = {228}, m = "invokeSuspend", v = 1)
public final class dq4 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ qq4 b;

    public static final class a<T> implements myh {
        public final /* synthetic */ qq4 a;

        public a(qq4 qq4Var) {
            this.a = qq4Var;
        }

        @Override // defpackage.myh
        public final Object emit(Object obj, v1b v1bVar) {
            il4 il4Var = (il4) obj;
            wwd0 wwd0Var = this.a.G;
            Object value = wwd0Var.getValue();
            eku ekuVar = value instanceof eku ? (eku) value : null;
            if (ekuVar == null) {
                return Unit.a;
            }
            eku ekuVarA = eku.a(hi9.b(il4Var), ekuVar.a, ekuVar.b && il4Var.a == hl4.a, ekuVar.c, 504);
            wwd0Var.getClass();
            wwd0Var.k(null, ekuVarA);
            Unit unit = Unit.a;
            y5b y5bVar = y5b.a;
            return unit;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dq4(qq4 qq4Var, v1b<? super dq4> v1bVar) {
        super(2, v1bVar);
        this.b = qq4Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new dq4(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((dq4) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type v1b to dq4 for r4v3 'this'  v1b
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
            goto L2f
        Ld:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.ib5.a(r4)
            r4 = 0
            return r4
        L14:
            defpackage.uj50.b(r5)
            qq4 r5 = r4.b
            rrm r1 = r5.d
            v340 r1 = r1.a()
            dq4$a r3 = new dq4$a
            r3.<init>(r5)
            r4.a = r2
            uwd0<T> r5 = r1.a
            java.lang.Object r4 = r5.collect(r3, r4)
            if (r4 != r0) goto L2f
            return r0
        L2f:
            kotlin.Unit r4 = kotlin.Unit.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dq4.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
