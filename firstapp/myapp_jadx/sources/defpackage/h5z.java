package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final class h5z implements d5z {
    public final rgn a;
    public final uyh0 b;
    public final x3k c;
    public final iym d;
    public boolean e;

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.biootp.OtpBiometricPromptHandlerImpl", f = "OtpBiometricPromptHandlerImpl.kt", l = {55}, m = "handleBiometricAuthSuccess", v = 2)
    public static final class a<T> extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public a(v1b<? super a> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return h5z.this.n1(null, null, null, null, null, null, null, this);
        }
    }

    @c0d(c = "com.sporty.android.platform.features.newotp.channel.biootp.OtpBiometricPromptHandlerImpl", f = "OtpBiometricPromptHandlerImpl.kt", l = {83}, m = "handleBiometricAuthSuccessForReversedOtp", v = 2)
    public static final class b extends x1b {
        public /* synthetic */ Object a;
        public int c;

        public b(v1b<? super b> v1bVar) {
            super(v1bVar);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            this.a = obj;
            this.c |= Integer.MIN_VALUE;
            return h5z.this.t(null, null, null, null, null, null, null, this);
        }
    }

    public h5z(rgn rgnVar, uyh0 uyh0Var, x3k x3kVar, iym iymVar) {
        rgnVar.getClass();
        uyh0Var.getClass();
        x3kVar.getClass();
        iymVar.getClass();
        this.a = rgnVar;
        this.b = uyh0Var;
        this.c = x3kVar;
        this.d = iymVar;
    }

    @Override // defpackage.d5z
    public final lyh<lk50<Unit>> C() {
        return new gzh(lk50.b.a);
    }

    @Override // defpackage.d5z
    public final <T> void K0(int i, T t, Function1<? super j7z.b<? extends T>, Unit> function1) {
        function1.getClass();
        this.e = false;
        if (i == 10 || i == 13) {
            return;
        }
        StringUiText stringUiText = vch0.a;
        function1.invoke(new j7z.b(new ResourceUiText(R.string.common_otp_verify__biometrics_verification_failed_title), new ResourceUiText(R.string.common_otp_verify__biometrics_verification_failed_description), t, (String) null, 24));
    }

    @Override // defpackage.d5z
    public final Object P0(boolean z, v1b<? super nc4> v1bVar) {
        this.e = false;
        if (z) {
            gym.a(this.d, l7z.a);
        }
        return this.a.a(v1bVar);
    }

    @Override // defpackage.d5z
    public final void Y(int i, cp50 cp50Var, Function1<? super wo50.b, Unit> function1) {
        cp50Var.getClass();
        function1.getClass();
        this.e = false;
        if (i == 10 || i == 13) {
            return;
        }
        StringUiText stringUiText = vch0.a;
        function1.invoke(new wo50.b(new ResourceUiText(R.string.common_otp_verify__biometrics_verification_failed_title), new ResourceUiText(R.string.common_otp_verify__biometrics_verification_failed_description), cp50Var));
    }

    @Override // defpackage.d5z
    public final void e1() {
        if (this.e) {
            return;
        }
        gym.a(this.d, k7z.a);
        this.e = true;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.d5z
    public final <T> Object n1(qd4.c cVar, j6c j6cVar, T t, Function0<Unit> function0, Function0<Unit> function1, Function1<? super j7z.b<? extends T>, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        a aVar;
        if (v1bVar instanceof a) {
            aVar = (a) v1bVar;
            int i = aVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.c = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(v1bVar);
            }
        } else {
            aVar = new a(v1bVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = aVar2.c;
        if (i2 == 0) {
            uj50.b(obj);
            e5z e5zVar = new e5z();
            aVar2.c = 1;
            if (bm50.a(new or60(new f5z(this, cVar, j6cVar, function3, null))).collect(new g5z(this, function0, function1, function2, t, e5zVar), aVar2) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (!this.e) {
            gym.a(this.d, k7z.a);
            this.e = true;
        }
        return Unit.a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // defpackage.d5z
    public final Object t(qd4.c cVar, j6c j6cVar, cp50 cp50Var, Function0<Unit> function0, Function0<Unit> function1, Function1<? super wo50.b, Unit> function2, Function0<? extends lyh<? extends lk50<Unit>>> function3, v1b<? super Unit> v1bVar) {
        b bVar;
        if (v1bVar instanceof b) {
            bVar = (b) v1bVar;
            int i = bVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bVar.c = i - Integer.MIN_VALUE;
            } else {
                bVar = new b(v1bVar);
            }
        } else {
            bVar = new b(v1bVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.a;
        y5b y5bVar = y5b.a;
        int i2 = bVar2.c;
        if (i2 == 0) {
            uj50.b(obj);
            xdu xduVar = new xdu(1);
            bVar2.c = 1;
            if (bm50.a(new or60(new f5z(this, cVar, j6cVar, function3, null))).collect(new g5z(this, function0, function1, function2, cp50Var, xduVar), bVar2) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        if (!this.e) {
            gym.a(this.d, k7z.a);
            this.e = true;
        }
        return Unit.a;
    }
}
