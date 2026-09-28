package defpackage;

import com.sporty.android.common.network.data.BaseResponse;
import com.sporty.android.sportytv.data.Program;
import com.sporty.android.sportytv.data.TvConfig;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lg230;", "Lihb0;", "sportyMedia"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class g230 extends ihb0 {
    public final ssw A;
    public final ssw B;
    public final afd0 d;
    public final zdd0 e;
    public jvd0 f;
    public jvd0 i;
    public final ssw<lk50<TvConfig>> v;
    public final ssw w;
    public final ssw<lk50<List<Program>>> y;
    public final ssw z;

    @c0d(c = "com.sporty.android.sportytv.viewmodel.ProgramPageViewModel$getConfig$1", f = "ProgramPageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<BaseResponse<TvConfig>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = g230.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BaseResponse<TvConfig> baseResponse, v1b<? super Unit> v1bVar) {
            return ((a) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BaseResponse baseResponse = (BaseResponse) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g230.this.v.m(new lk50.c(baseResponse.data));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.sportytv.viewmodel.ProgramPageViewModel$getConfig$2", f = "ProgramPageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class b extends tje0 implements Function2<myh<? super BaseResponse<TvConfig>>, v1b<? super Unit>, Object> {
        public b(v1b<? super b> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g230.this.new b(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<TvConfig>> myhVar, v1b<? super Unit> v1bVar) {
            return ((b) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g230.this.v.m(lk50.b.a);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.sportytv.viewmodel.ProgramPageViewModel$getConfig$3", f = "ProgramPageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class c extends tje0 implements gaj<myh<? super BaseResponse<TvConfig>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public c(v1b<? super c> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super BaseResponse<TvConfig>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            c cVar = g230.this.new c(v1bVar);
            cVar.a = th;
            return cVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g230.this.v.m(new lk50.a(th));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.sportytv.viewmodel.ProgramPageViewModel$getProgramList$1", f = "ProgramPageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class d extends tje0 implements Function2<BaseResponse<List<? extends Program>>, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public d(v1b<? super d> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            d dVar = g230.this.new d(v1bVar);
            dVar.a = obj;
            return dVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BaseResponse<List<? extends Program>> baseResponse, v1b<? super Unit> v1bVar) {
            return ((d) create(baseResponse, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            BaseResponse baseResponse = (BaseResponse) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g230.this.y.m(new lk50.c(baseResponse.data));
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.sportytv.viewmodel.ProgramPageViewModel$getProgramList$2", f = "ProgramPageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class e extends tje0 implements Function2<myh<? super BaseResponse<List<? extends Program>>>, v1b<? super Unit>, Object> {
        public e(v1b<? super e> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return g230.this.new e(v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(myh<? super BaseResponse<List<? extends Program>>> myhVar, v1b<? super Unit> v1bVar) {
            return ((e) create(myhVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g230.this.y.m(lk50.b.a);
            return Unit.a;
        }
    }

    @c0d(c = "com.sporty.android.sportytv.viewmodel.ProgramPageViewModel$getProgramList$3", f = "ProgramPageViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class f extends tje0 implements gaj<myh<? super BaseResponse<List<? extends Program>>>, Throwable, v1b<? super Unit>, Object> {
        public /* synthetic */ Throwable a;

        public f(v1b<? super f> v1bVar) {
            super(3, v1bVar);
        }

        @Override // defpackage.gaj
        public final Object invoke(myh<? super BaseResponse<List<? extends Program>>> myhVar, Throwable th, v1b<? super Unit> v1bVar) {
            f fVar = g230.this.new f(v1bVar);
            fVar.a = th;
            return fVar.invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            Throwable th = this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            g230.this.y.m(new lk50.a(th));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g230(afd0 afd0Var, zdd0 zdd0Var) {
        super(0);
        afd0Var.getClass();
        zdd0Var.getClass();
        this.d = afd0Var;
        this.e = zdd0Var;
        ssw<lk50<TvConfig>> sswVar = new ssw<>();
        this.v = sswVar;
        this.w = sswVar;
        ssw<lk50<List<Program>>> sswVar2 = new ssw<>();
        this.y = sswVar2;
        this.z = sswVar2;
        this.A = new ssw();
        this.B = new ssw();
    }

    public final void A1(String str, String str2) {
        str.getClass();
        jvd0 jvd0Var = this.i;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.i = kzh.d(new yzh(new xzh(new g1i(this.d.d(str, str2), new d(null)), new e(null)), new f(null)), o8i0.d(this));
    }

    public final void z1(String str) {
        str.getClass();
        jvd0 jvd0Var = this.f;
        if (jvd0Var != null) {
            jvd0Var.cancel((CancellationException) null);
        }
        this.f = kzh.d(new yzh(new xzh(new g1i(this.d.c(str), new a(null)), new b(null)), new c(null)), o8i0.d(this));
    }
}
