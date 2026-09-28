package defpackage;

import com.sportybet.plugin.realsports.search.widget.searchprematchpanel.SEfl.gvQvkPPtA;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.HammerBoxKt$HammerBox$1$1", f = "HammerBox.kt", l = {132}, m = "invokeSuspend", v = 1)
public final class qbl extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Long c;
    public final /* synthetic */ pr50 d;
    public final /* synthetic */ ibl e;
    public final /* synthetic */ long f;
    public final /* synthetic */ tp10 i;

    @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.HammerBoxKt$HammerBox$1$1$1", f = "HammerBox.kt", l = {141}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ibl iblVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = iblVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wd0<Float, ij0> wd0Var = this.b.c;
                Float f = new Float(wd0Var.d().floatValue() * 1.5f);
                gzg0 gzg0VarE = yi0.e(500, 0, xkf.a, 2);
                this.a = 1;
                if (wd0.a(wd0Var, f, gzg0VarE, null, null, this, 12) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @c0d(c = "com.sportygames.piggybash.presentation.component.gameplay.hammer.HammerBoxKt$HammerBox$1$1$2", f = "HammerBox.kt", l = {147}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ ibl b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ibl iblVar, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = iblVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                wd0<Float, ij0> wd0Var = this.b.b;
                Float f = new Float(wd0Var.d().floatValue() * 1.3f);
                gzg0 gzg0VarE = yi0.e(500, 0, xkf.a, 2);
                this.a = 1;
                if (wd0.a(wd0Var, f, gzg0VarE, null, null, this, 12) == y5bVar) {
                    return y5bVar;
                }
            } else {
                if (i != 1) {
                    ib5.a(gvQvkPPtA.IiImNtaYfxeW);
                    return null;
                }
                uj50.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qbl(Long l, pr50 pr50Var, ibl iblVar, long j, tp10 tp10Var, v1b<? super qbl> v1bVar) {
        super(2, v1bVar);
        this.c = l;
        this.d = pr50Var;
        this.e = iblVar;
        this.f = j;
        this.i = tp10Var;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        qbl qblVar = new qbl(this.c, this.d, this.e, this.f, this.i, v1bVar);
        qblVar.b = obj;
        return qblVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((qbl) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        qbl qblVar;
        v5b v5bVar = (v5b) this.b;
        y5b y5bVar = y5b.a;
        int i = this.a;
        ibl iblVar = this.e;
        if (i == 0) {
            uj50.b(obj);
            if (this.c != null) {
                pr50 pr50Var = this.d;
                if ((pr50Var != null ? pr50Var.e : null) == qr50.b) {
                    wd0<gly, jj0> wd0Var = iblVar.a;
                    long j = this.f;
                    gly glyVar = new gly((((long) Float.floatToRawIntBits((int) (j & 4294967295L))) & 4294967295L) | (((long) Float.floatToRawIntBits((int) (j >> 32))) << 32));
                    gzg0 gzg0VarE = yi0.e(400, 0, null, 6);
                    this.b = v5bVar;
                    this.a = 1;
                    qblVar = this;
                    if (wd0.a(wd0Var, glyVar, gzg0VarE, null, null, qblVar, 12) == y5bVar) {
                        return y5bVar;
                    }
                }
            }
            return Unit.a;
        }
        if (i != 1) {
            ib5.a("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        uj50.b(obj);
        qblVar = this;
        if (!qblVar.i.b) {
            ej5.c(v5bVar, null, null, new a(iblVar, null), 3);
            ej5.c(v5bVar, null, null, new b(iblVar, null), 3);
        }
        ((x5a0) iblVar.d).setValue(Boolean.TRUE);
        return Unit.a;
    }
}
