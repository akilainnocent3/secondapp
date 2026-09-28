package defpackage;

import com.sporty.android.sportytv.data.SportyTvDataStoreData;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lc0x;", "Lihb0;", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class c0x extends ihb0 {
    public final vu90 A;
    public final vu90<wyf0> B;
    public final vu90 C;
    public final ssw<lk50<SportyTvDataStoreData<Boolean>>> D;
    public final ssw E;
    public final pfd0 d;
    public final zdd0 e;
    public jvd0 f;
    public final ssw<Boolean> i;
    public final ssw v;
    public final ssw<vzw> w;
    public final ssw y;
    public final vu90<wyf0> z;

    @c0d(c = "com.sporty.android.sportytv.viewmodel.MyProgramListViewModel$updateNotificationEnable$1", f = "MyProgramListViewModel.kt", l = {121}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ boolean c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(boolean z, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.c = z;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return c0x.this.new a(this.c, v1bVar);
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
                zdd0 zdd0Var = c0x.this.e;
                this.a = 1;
                if (zdd0Var.a(this.c, this) == y5bVar) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0x(pfd0 pfd0Var, zdd0 zdd0Var) {
        super(0);
        zdd0Var.getClass();
        this.d = pfd0Var;
        this.e = zdd0Var;
        ssw<Boolean> sswVar = new ssw<>();
        this.i = sswVar;
        this.v = sswVar;
        ssw<vzw> sswVar2 = new ssw<>();
        this.w = sswVar2;
        this.y = sswVar2;
        vu90<wyf0> vu90Var = new vu90<>();
        this.z = vu90Var;
        this.A = vu90Var;
        vu90<wyf0> vu90Var2 = new vu90<>();
        this.B = vu90Var2;
        this.C = vu90Var2;
        ssw<lk50<SportyTvDataStoreData<Boolean>>> sswVar3 = new ssw<>();
        this.D = sswVar3;
        this.E = sswVar3;
    }

    public final void A1(String str) {
        str.getClass();
        et7 et7VarD = o8i0.d(this);
        xzw xzwVar = new xzw(0, this, str);
        pfd0 pfd0Var = this.d;
        pfd0Var.getClass();
        jvd0 jvd0Var = pfd0Var.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        pfd0Var.c = kzh.d(new g1i(new yzh(new xzh(new hfd0(pfd0Var.a.b(str)), new ifd0(2, null)), new jfd0(3, null)), new kfd0(xzwVar, null)), et7VarD);
    }

    public final void B1(String str, String str2) {
        str.getClass();
        str2.getClass();
        et7 et7VarD = o8i0.d(this);
        wzw wzwVar = new wzw(this, str2);
        pfd0 pfd0Var = this.d;
        pfd0Var.getClass();
        jvd0 jvd0Var = pfd0Var.b;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        pfd0Var.b = kzh.d(new g1i(new yzh(new xzh(new lfd0(pfd0Var.a.e(str, str2)), new mfd0(2, null)), new nfd0(3, null)), new ofd0(wzwVar, null)), et7VarD);
    }

    public final void C1(boolean z) {
        ej5.c(o8i0.d(this), null, null, new a(z, null), 3);
    }

    public final void z1(String str) {
        str.getClass();
        et7 et7VarD = o8i0.d(this);
        yzw yzwVar = new yzw(0, this, str);
        pfd0 pfd0Var = this.d;
        pfd0Var.getClass();
        jvd0 jvd0Var = pfd0Var.c;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        pfd0Var.c = kzh.d(new g1i(new yzh(new xzh(new dfd0(pfd0Var.a.a(str)), new efd0(2, null)), new ffd0(3, null)), new gfd0(yzwVar, null)), et7VarD);
    }
}
