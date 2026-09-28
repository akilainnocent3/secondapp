package defpackage;

import com.sporty.android.core.model.account.AccountInfo;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lmxf;", "Lj8i0;", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class mxf extends j8i0 {
    public final oyf a;
    public final rdd0 b;
    public final String c;
    public final wwd0 d;
    public final v340 e;
    public final ku90<axf> f;
    public final t340 i;

    @c0d(c = "com.sporty.android.platform.features.account.verifiedemailchange.newemail.EmailChangeNewEmailViewModel$1", f = "EmailChangeNewEmailViewModel.kt", l = {54}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ lyz b;
        public final /* synthetic */ mxf c;

        /* JADX INFO: renamed from: mxf$a$a, reason: collision with other inner class name */
        public static final class C0882a<T> implements myh {
            public final /* synthetic */ mxf a;

            public C0882a(mxf mxfVar) {
                this.a = mxfVar;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.myh
            public final Object emit(Object obj, v1b v1bVar) {
                Object value;
                AccountInfo accountInfo = (AccountInfo) obj;
                wwd0 wwd0Var = this.a.d;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, lxf.a((lxf) value, new ijf0(accountInfo.getEmail(), 0L, 6), null, null, null, null, null, 62)));
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lyz lyzVar, mxf mxfVar, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = lyzVar;
            this.c = mxfVar;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.b, this.c, v1bVar);
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
                vl50 vl50VarF = bm50.f(this.b.a(new pu0.a(0)));
                C0882a c0882a = new C0882a(this.c);
                this.a = 1;
                if (vl50VarF.collect(c0882a, this) == y5bVar) {
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

    public mxf(oyf oyfVar, lyz lyzVar, vu60 vu60Var, rdd0 rdd0Var) {
        oyfVar.getClass();
        lyzVar.getClass();
        vu60Var.getClass();
        rdd0Var.getClass();
        this.a = oyfVar;
        this.b = rdd0Var;
        o2g o2gVar = o2g.a;
        o2gVar.getClass();
        this.c = ((y47) fnf.a(vu60Var, jq40.a(y47.class), o2gVar)).a;
        wwd0 wwd0VarA = xwd0.a(new lxf(0));
        this.d = wwd0VarA;
        this.e = e1i.b(wwd0VarA);
        ku90<axf> ku90Var = new ku90<>();
        this.f = ku90Var;
        this.i = e1i.a(ku90Var);
        ej5.c(o8i0.d(this), null, null, new a(lyzVar, this, null), 3);
    }
}
