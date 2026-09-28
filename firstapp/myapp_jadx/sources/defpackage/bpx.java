package defpackage;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbpx;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class bpx extends j8i0 {
    public final rdd0 a;
    public final b390 b;

    @c0d(c = "com.sportybet.plugin.realsports.viewmodel.NeverDownTrackingViewModel$1", f = "NeverDownTrackingViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<xjg0<Object>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = bpx.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(xjg0<Object> xjg0Var, v1b<? super Unit> v1bVar) {
            return ((a) create(xjg0Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object bVar;
            xjg0 xjg0Var = (xjg0) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            bpx bpxVar = bpx.this;
            try {
                zi50.a aVar = zi50.b;
                rdd0 rdd0Var = bpxVar.a;
                pdd0 pdd0Var = xjg0Var.a;
                k00[] k00VarArr = (k00[]) xjg0Var.b.toArray(new k00[0]);
                rdd0Var.a(pdd0Var, (k00[]) Arrays.copyOf(k00VarArr, k00VarArr.length));
                bVar = Unit.a;
            } catch (Throwable th) {
                zi50.a aVar2 = zi50.b;
                bVar = new zi50.b(th);
            }
            Throwable thA = zi50.a(bVar);
            if (thA != null) {
                thA.printStackTrace();
            }
            return Unit.a;
        }
    }

    public bpx(rdd0 rdd0Var) {
        rdd0Var.getClass();
        this.a = rdd0Var;
        b390 b390VarB = d390.b(0, 100, pb5.b, 1);
        this.b = b390VarB;
        kzh.d(new g1i(b390VarB, new a(null)), o8i0.d(this));
    }
}
