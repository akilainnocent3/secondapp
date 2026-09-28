package defpackage;

import com.sportybet.plugin.realsports.data.Event;
import java.util.ArrayList;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lqbz;", "Lj8i0;", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class qbz extends j8i0 {
    public final kbz a;
    public final cbz b;
    public final wwd0 c;
    public final v340 d;
    public final wwd0 e;
    public final v340 f;
    public final ArrayList i;
    public jvd0 v;
    public jvd0 w;

    @c0d(c = "com.sportybet.plugin.realsports.outrights.detail.OutrightViewModel$fetchOutrightDetailFlow$1", f = "OutrightViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends Event>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = qbz.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends Event> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Object value;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            wwd0 wwd0Var = qbz.this.e;
            do {
                value = wwd0Var.getValue();
            } while (!wwd0Var.g(value, lk50Var));
            return Unit.a;
        }
    }

    public qbz(kbz kbzVar, cbz cbzVar) {
        this.a = kbzVar;
        this.b = cbzVar;
        lk50.b bVar = lk50.b.a;
        wwd0 wwd0VarA = xwd0.a(bVar);
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
        wwd0 wwd0VarA2 = xwd0.a(bVar);
        this.e = wwd0VarA2;
        this.f = e1i.b(wwd0VarA2);
        this.i = new ArrayList();
    }

    public final void x1(String str) {
        str.getClass();
        jvd0 jvd0Var = this.v;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        cbz cbzVar = this.b;
        cbzVar.getClass();
        this.v = kzh.d(new g1i(bm50.a(new bbz(cbzVar.a.p(str))), new a(null)), o8i0.d(this));
    }
}
