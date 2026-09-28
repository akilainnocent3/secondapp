package defpackage;

import android.widget.TextView;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.rush.model.response.WalletInfoResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportygames.rush.view.RushFragment$observeLiveData$4$1", f = "RushFragment.kt", l = {1830, 1858}, m = "invokeSuspend", v = 1)
public final class u560 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ l560 b;
    public final /* synthetic */ LoadingState<HTTPResponse<WalletInfoResponse>> c;

    @c0d(c = "com.sportygames.rush.view.RushFragment$observeLiveData$4$1$2", f = "RushFragment.kt", l = {1840}, m = "invokeSuspend", v = 1)
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

    @c0d(c = "com.sportygames.rush.view.RushFragment$observeLiveData$4$1$3", f = "RushFragment.kt", l = {1848}, m = "invokeSuspend", v = 1)
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
    public u560(l560 l560Var, LoadingState<HTTPResponse<WalletInfoResponse>> loadingState, v1b<? super u560> v1bVar) {
        super(2, v1bVar);
        this.b = l560Var;
        this.c = loadingState;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new u560(this.b, this.c, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((u560) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00af, code lost:
    
        if (r5.X0(r10) == r0) goto L34;
     */
    @Override // defpackage.pz1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            Method dump skipped, instruction units count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.u560.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
