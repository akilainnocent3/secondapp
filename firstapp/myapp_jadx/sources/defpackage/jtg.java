package defpackage;

import com.sportybet.android.instantwin.newtork.model.response.EventInRound;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.EventsResultByLeagueViewModel$fetch$2", f = "EventsResultByLeagueViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class jtg extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ ktg b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.EventsResultByLeagueViewModel$fetch$2$1", f = "EventsResultByLeagueViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<lk50<? extends List<? extends EventInRound>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ ktg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ktg ktgVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = ktgVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = new a(this.b, v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(lk50<? extends List<? extends EventInRound>> lk50Var, v1b<? super Unit> v1bVar) {
            return ((a) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            hqc lqcVar;
            lk50 lk50Var = (lk50) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ktg ktgVar = this.b;
            ssw<hqc> sswVar = ktgVar.d;
            if (lk50Var instanceof lk50.c) {
                lqcVar = new nqc(((lk50.c) lk50Var).a);
            } else if (lk50Var instanceof lk50.a) {
                lqcVar = ktgVar.x1(((lk50.a) lk50Var).a);
            } else {
                if (!(lk50Var instanceof lk50.b)) {
                    uhc.a();
                    return null;
                }
                lqcVar = new lqc();
            }
            sswVar.m(lqcVar);
            return Unit.a;
        }
    }

    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.EventsResultByLeagueViewModel$fetch$2$2", f = "EventsResultByLeagueViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements gaj<myh<? super lk50<? extends List<? extends EventInRound>>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;
        public final /* synthetic */ ktg b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(ktg ktgVar, v1b<? super b> v1bVar) {
            super(3, v1bVar);
            this.b = ktgVar;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super lk50<? extends List<? extends EventInRound>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            b bVar = new b(this.b, v1bVar);
            bVar.a = th;
            return bVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            ktg ktgVar = this.b;
            ktgVar.d.m(ktgVar.x1(th));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jtg(ktg ktgVar, String str, String str2, String str3, v1b<? super jtg> v1bVar) {
        super(2, v1bVar);
        this.b = ktgVar;
        this.c = str;
        this.d = str2;
        this.e = str3;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        jtg jtgVar = new jtg(this.b, this.c, this.d, this.e, v1bVar);
        jtgVar.a = obj;
        return jtgVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((jtg) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        v5b v5bVar = (v5b) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        ktg ktgVar = this.b;
        f4p f4pVar = ktgVar.a;
        f4pVar.getClass();
        kzh.d(new yzh(new g1i(bm50.a(((eko) f4pVar.a).m(this.c, this.d, this.e)), new a(ktgVar, null)), new b(ktgVar, null)), v5bVar);
        return Unit.a;
    }
}
