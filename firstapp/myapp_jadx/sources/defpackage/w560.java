package defpackage;

import android.widget.TextView;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.rush.model.response.WalletInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment$observeLiveData$6$1", f = "RushFragment.kt", l = {2187}, m = "invokeSuspend", v = 1)
public final class w560 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l560 b;
    public final /* synthetic */ LoadingState<HTTPResponse<WalletInfoResponse>> c;

    @c0d(c = "com.sportygames.rush.view.RushFragment$observeLiveData$6$1$2", f = "RushFragment.kt", l = {2197}, m = "invokeSuspend", v = 1)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ l560 b;
        public final /* synthetic */ zp40 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(l560 l560Var, zp40 zp40Var, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.b = l560Var;
            this.c = zp40Var;
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
            ro80 binding;
            y5b y5bVar = y5b.a;
            int i = this.a;
            TextView textView = null;
            if (i == 0) {
                uj50.b(obj);
                l560 l560Var = this.b;
                eo80 eo80Var = l560Var.l0;
                if (eo80Var != null && (binding = eo80Var.W.getBinding()) != null) {
                    textView = binding.d;
                }
                double dAbs = Math.abs(this.c.a);
                this.a = 1;
                if (l560Var.n0(textView, dAbs, "up", this) == y5bVar) {
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

    @c0d(c = "com.sportygames.rush.view.RushFragment$observeLiveData$6$1$3", f = "RushFragment.kt", l = {2205}, m = "invokeSuspend", v = 1)
    public static final class b extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ l560 b;
        public final /* synthetic */ zp40 c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l560 l560Var, zp40 zp40Var, v1b<? super b> v1bVar) {
            super(2, v1bVar);
            this.b = l560Var;
            this.c = zp40Var;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new b(this.b, this.c, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((b) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            ro80 binding;
            y5b y5bVar = y5b.a;
            int i = this.a;
            TextView textView = null;
            if (i == 0) {
                uj50.b(obj);
                l560 l560Var = this.b;
                eo80 eo80Var = l560Var.l0;
                if (eo80Var != null && (binding = eo80Var.W.getBinding()) != null) {
                    textView = binding.e;
                }
                double dAbs = Math.abs(this.c.a);
                this.a = 1;
                if (l560Var.n0(textView, dAbs, "down", this) == y5bVar) {
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
    public w560(l560 l560Var, LoadingState<HTTPResponse<WalletInfoResponse>> loadingState, v1b<? super w560> v1bVar) {
        super(2, v1bVar);
        this.b = l560Var;
        this.c = loadingState;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new w560(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((w560) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        WalletInfoResponse data;
        Double balance;
        y5b y5bVar = y5b.a;
        int i = this.a;
        if (i == 0) {
            uj50.b(obj);
            this.a = 1;
            if (hkd.b(1200L, this) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        zp40 zp40Var = new zp40();
        l560 l560Var = this.b;
        Double d = l560Var.c;
        LoadingState<HTTPResponse<WalletInfoResponse>> loadingState = this.c;
        if (d != null) {
            double dDoubleValue = d.doubleValue();
            HTTPResponse<WalletInfoResponse> data2 = loadingState.getData();
            if (data2 != null && (data = data2.getData()) != null && (balance = data.getBalance()) != null) {
                zp40Var.a = dDoubleValue - balance.doubleValue();
            }
        }
        double d2 = zp40Var.a;
        if (d2 < 0.0d) {
            nas nasVarA = ebs.a(l560Var.getLifecycle());
            pfd pfdVar = fse.a;
            ej5.c(nasVarA, gku.a, null, new a(l560Var, zp40Var, null), 2);
        } else if (d2 > 0.0d) {
            nas nasVarA2 = ebs.a(l560Var.getLifecycle());
            pfd pfdVar2 = fse.a;
            ej5.c(nasVarA2, gku.a, null, new b(l560Var, zp40Var, null), 2);
        }
        HTTPResponse<WalletInfoResponse> data3 = loadingState.getData();
        l560Var.m0(data3 != null ? data3.getData() : null);
        l560Var.e1(l560Var.T);
        l560Var.m1();
        return Unit.a;
    }
}
