package defpackage;

import com.sportybet.plugin.realsports.data.OutrightDisplayData;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lobz;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class obz extends j8i0 {
    public final kbz a;
    public final wwd0 b;
    public final v340 c;
    public jvd0 d;

    @c0d(c = "com.sportybet.plugin.realsports.prematch.stateholder.OutrightViewModel$fetchOutright$1", f = "OutrightViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends List<? extends OutrightDisplayData>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = obz.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends OutrightDisplayData>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = obz.this.b;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, lk50Var));
            return Unit.a;
        }
    }

    public obz(kbz kbzVar) {
        this.a = kbzVar;
        wwd0 wwd0VarA = xwd0.a(lk50.b.a);
        this.b = wwd0VarA;
        this.c = e1i.b(wwd0VarA);
    }

    public final void x1(String str) {
        String strConcat;
        str.getClass();
        jvd0 jvd0Var = this.d;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        List listC = kotlin.collections.a.c(rs40.b().c());
        List list = (List) CollectionsKt.firstOrNull(listC);
        if (list == null || !(!list.isEmpty())) {
            strConcat = "";
        } else {
            Object objT = CollectionsKt.T(listC);
            objT.getClass();
            strConcat = "tournaments/".concat(CollectionsKt.a0((Iterable) objT, ",", null, null, null, 62));
        }
        kbz kbzVar = this.a;
        kbzVar.getClass();
        this.d = kzh.d(new g1i(bm50.a(new jbz(kbzVar.a.t(str, strConcat), false, kbzVar)), new a(null)), o8i0.d(this));
    }
}
