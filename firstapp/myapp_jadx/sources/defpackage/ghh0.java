package defpackage;

import com.sportybet.android.instantwin.router.openbet.OpenBetInput;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lghh0;", "Lj8i0;", "Ljh2;", "instantWin"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ghh0 extends j8i0 implements jh2 {
    public final g4p a;
    public final jh2 b;
    public final wwd0 c;
    public final v340 d;

    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.UnsettleRoundViewModel$special$$inlined$flatMapLatest$1", f = "UnsettleRoundViewModel.kt", l = {189}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements gaj<myh<? super hqc>, OpenBetInput, v1b<? super Unit>, Object> {
        public int a;
        public /* synthetic */ myh b;
        public /* synthetic */ Object c;
        public final /* synthetic */ ghh0 d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(v1b v1bVar, ghh0 ghh0Var) {
            super(3, v1bVar);
            this.d = ghh0Var;
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super hqc> myhVar, OpenBetInput openBetInput, v1b<? super Unit> v1bVar) {
            a aVar = new a(v1bVar, this.d);
            aVar.b = myhVar;
            aVar.c = openBetInput;
            return aVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            int i = this.a;
            if (i == 0) {
                uj50.b(obj);
                myh myhVar = this.b;
                wwd0 wwd0Var = this.d.c;
                this.b = null;
                this.c = null;
                this.a = 1;
                if (kzh.c(myhVar, wwd0Var, this) == y5bVar) {
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

    @c0d(c = "com.sportybet.android.instantwin.presentation.viewmodel.UnsettleRoundViewModel$unsettleRound$1", f = "UnsettleRoundViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<OpenBetInput, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;
        public final /* synthetic */ ghh0 b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(v1b v1bVar, ghh0 ghh0Var) {
            super(2, v1bVar);
            this.b = ghh0Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            b bVar = new b(v1bVar, this.b);
            bVar.a = obj;
            return bVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(OpenBetInput openBetInput, v1b<? super Unit> v1bVar) {
            return ((b) create(openBetInput, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            OpenBetInput openBetInput = (OpenBetInput) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            String str = openBetInput != null ? openBetInput.a : null;
            if (str != null && str.length() != 0) {
                String str2 = openBetInput.a;
                ghh0 ghh0Var = this.b;
                g4p g4pVar = ghh0Var.a;
                g4pVar.getClass();
                str2.getClass();
                kzh.d(new yzh(new g1i(new dhh0(bm50.a(g4pVar.a.t(g4pVar.b.c(), str2))), new ehh0(null, ghh0Var)), new fhh0(null, ghh0Var)), o8i0.d(ghh0Var));
            }
            return Unit.a;
        }
    }

    public ghh0(vu60 vu60Var, g4p g4pVar, jh2 jh2Var) {
        vu60Var.getClass();
        jh2Var.getClass();
        this.a = g4pVar;
        this.b = jh2Var;
        v340 v340VarD = vu60Var.d(null, "ARG_INPUT");
        this.c = xwd0.a(new lqc());
        this.d = e1i.e(r0i.f(new g1i(v340VarD, new b(null, this)), new a(null, this)), o8i0.d(this), new mwd0(5000L, Long.MAX_VALUE), new lqc());
    }

    @Override // defpackage.jh2
    public final boolean B(String str) {
        str.getClass();
        return this.b.B(str);
    }

    @Override // defpackage.jh2
    public final void W0(String str, boolean z) {
        str.getClass();
        this.b.W0(str, z);
    }
}
