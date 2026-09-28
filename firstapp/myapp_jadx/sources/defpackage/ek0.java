package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.refscall.presentation.ui.animation.AnimationViewModel$init$2", f = "AnimationViewModel.kt", l = {52}, m = "invokeSuspend", v = 1)
public final class ek0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fk0 b;

    @c0d(c = "com.sportygames.refscall.presentation.ui.animation.AnimationViewModel$init$2$1", f = "AnimationViewModel.kt", l = {}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<rq30, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ fk0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(fk0 fk0Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = fk0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(rq30 rq30Var, v1b<? super Unit> v1bVar) {
            return ((a) create(rq30Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            rq30 rq30Var = (rq30) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = rq30Var instanceof rq30.a;
            fk0 fk0Var = this.b;
            if (z) {
                b390 b390Var = fk0Var.c;
                rq30.a aVar = (rq30.a) rq30Var;
                bp30 bp30Var = aVar.a;
                b390Var.getClass();
                StringBuilder sb = new StringBuilder(bp30Var.a);
                sb.append("2_");
                tq30 tq30Var = aVar.b;
                sb.append(tq30Var.b);
                int i = aVar.c;
                int iOrdinal = bp30Var.ordinal();
                String strA = "";
                if (iOrdinal == 0) {
                    int iOrdinal2 = tq30Var.ordinal();
                    if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                        String str = new String[]{"A", "B", "C"}[Math.abs(i) % 3];
                        strA = inm.a("_", str);
                    } else if (iOrdinal2 != 2) {
                        uhc.a();
                        return null;
                    }
                } else if (iOrdinal != 1) {
                    uhc.a();
                    return null;
                }
                sb.append(strA);
                b390Var.a(new xh0(a4h.a(new ecb0(sb.toString(), false)), null));
            } else if (rq30Var instanceof rq30.b) {
                b390 b390Var2 = fk0Var.c;
                bp30 bp30Var2 = ((rq30.b) rq30Var).a;
                b390Var2.getClass();
                bp30Var2.getClass();
                String str2 = bp30Var2.a;
                b390Var2.a(new xh0(a4h.a(new ecb0(str2.concat("1_1_start"), false), new ecb0(str2.concat("1_1_loop"), true)), null, null));
            } else {
                if (!(rq30Var instanceof rq30.c)) {
                    uhc.a();
                    return null;
                }
                b390 b390Var3 = fk0Var.c;
                bp30 bp30Var3 = ((rq30.c) rq30Var).a;
                b390Var3.getClass();
                bp30Var3.getClass();
                b390Var3.a(new xh0(a4h.a(new ecb0(bp30Var3.a.concat("1_4"), false), new ecb0("Event_process", false)), rn30.n.a));
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ek0(fk0 fk0Var, v1b<? super ek0> v1bVar) {
        super(2, v1bVar);
        this.b = fk0Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ek0(this.b, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ek0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) throws Throwable {
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i != 0) {
            if (i == 1) {
                uj50.b(obj);
                return Unit.a;
            }
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        fk0 fk0Var = this.b;
        wwd0 wwd0Var = fk0Var.b;
        a aVar = new a(fk0Var, null);
        this.a = 1;
        wwd0Var.collect(new g1i.a(gyx.a, aVar), this);
        return y5bVar;
    }
}
