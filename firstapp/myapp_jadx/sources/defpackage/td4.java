package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.compose.runtime.a;
import androidx.compose.runtime.b;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import androidx.recyclerview.widget.IUw.QWvyvNzGsBpRT;
import androidx.transition.nfj.CaBJCMnsV;
import com.sportybet.android.gp.tz.R;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import okhttp3.internal.http2.Http2;

/* JADX INFO: loaded from: classes5.dex */
public final class td4 {

    /* JADX INFO: loaded from: classes.dex */
    @c0d(c = "com.sporty.android.platform.features.security.biometric.presentation.BiometricPromptContainerKt$BiometricPromptContainer$5$1", f = "BiometricPromptContainer.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
        public final /* synthetic */ Context a;
        public final /* synthetic */ e b;
        public final /* synthetic */ qd4.c c;
        public final /* synthetic */ Function0<Unit> d;
        public final /* synthetic */ Function1<qd4.c, Unit> e;
        public final /* synthetic */ Function1<g74, Unit> f;
        public final /* synthetic */ Function0<Unit> i;

        /* JADX INFO: renamed from: td4$a$a, reason: collision with other inner class name */
        public static final class C1125a extends qd4.a {
            public final /* synthetic */ Function1<qd4.c, Unit> a;
            public final /* synthetic */ Function1<g74, Unit> b;
            public final /* synthetic */ Function0<Unit> c;

            /* JADX WARN: Multi-variable type inference failed */
            public C1125a(Function1<? super qd4.c, Unit> function1, Function1<? super g74, Unit> function2, Function0<Unit> function0) {
                this.a = function1;
                this.b = function2;
                this.c = function0;
            }

            @Override // qd4.a
            public final void a(int i, CharSequence charSequence) {
                charSequence.getClass();
                this.b.invoke(new g74(i, charSequence.toString()));
            }

            @Override // qd4.a
            public final void b() {
                this.c.invoke();
            }

            @Override // qd4.a
            public final void c(qd4.b bVar) {
                this.a.invoke(bVar.a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, e eVar, qd4.c cVar, Function0<Unit> function0, Function1<? super qd4.c, Unit> function1, Function1<? super g74, Unit> function2, Function0<Unit> function3, v1b<? super a> v1bVar) {
            super(2, v1bVar);
            this.a = context;
            this.b = eVar;
            this.c = cVar;
            this.d = function0;
            this.e = function1;
            this.f = function2;
            this.i = function3;
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            return new a(this.a, this.b, this.c, this.d, this.e, this.f, this.i, v1bVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
            return ((a) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
        }

        /* JADX WARN: Code duplicated, block: B:70:0x0179  */
        /* JADX WARN: Code duplicated, block: B:72:0x017f  */
        /* JADX WARN: Code duplicated, block: B:74:0x018f  */
        /* JADX WARN: Code duplicated, block: B:77:0x019d  */
        /* JADX WARN: Code duplicated, block: B:78:0x01aa  */
        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = false;
            Context context = this.a;
            String strB = sn5.b(context, R.string.identity_verification__verify_it_is_you, new Object[0]);
            String strB2 = sn5.b(context, R.string.common_functions__cancel, new Object[0]);
            if (TextUtils.isEmpty(strB)) {
                hb5.a("Title must be set and non-empty.");
                return null;
            }
            if (!w41.c(0)) {
                throw new IllegalArgumentException("Authenticator combination is unsupported on API " + Build.VERSION.SDK_INT + ": " + String.valueOf(0));
            }
            if (TextUtils.isEmpty(strB2)) {
                hb5.a("Negative text must be set and non-empty.");
                return null;
            }
            TextUtils.isEmpty(strB2);
            qd4.d dVar = new qd4.d(strB, null, strB2);
            C1125a c1125a = new C1125a(this.e, this.f, this.i);
            Executor executorC = o0b.c(context);
            if (executorC == null) {
                hb5.a(QWvyvNzGsBpRT.gYPylXUAkLG);
                return null;
            }
            e eVar = this.b;
            FragmentManager supportFragmentManager = eVar.getSupportFragmentManager();
            v8i0 viewModelStore = eVar.getViewModelStore();
            r8i0.c defaultViewModelProviderFactory = eVar.getDefaultViewModelProviderFactory();
            s8i0 s8i0Var = new s8i0(viewModelStore, defaultViewModelProviderFactory, sd7.a(eVar, viewModelStore, defaultViewModelProviderFactory));
            dq7 dq7VarA = jq40.a(vd4.class);
            String strI = dq7VarA.i();
            if (strI == null) {
                hb5.a(CaBJCMnsV.mNvZeVW);
                return null;
            }
            vd4 vd4Var = (vd4) s8i0Var.a(dq7VarA, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strI));
            vd4Var.a = executorC;
            vd4Var.b = c1125a;
            qd4.c cVar = this.c;
            if (cVar == null) {
                hb5.a("CryptoObject cannot be null.");
                return null;
            }
            int iA = w41.a(dVar, cVar);
            if ((iA & 255) == 255) {
                hb5.a("Crypto-based authentication is not supported for Class 2 (Weak) biometrics.");
                return null;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 30 && w41.b(iA)) {
                hb5.a("Crypto-based authentication is not supported for device credential prior to API 30.");
                return null;
            }
            if (supportFragmentManager == null) {
                Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
            } else if (supportFragmentManager.V()) {
                Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
            } else {
                ld4 ld4Var = (ld4) supportFragmentManager.H("androidx.biometric.BiometricFragment");
                if (ld4Var == null) {
                    ld4Var = new ld4();
                    Bundle bundle = new Bundle();
                    bundle.putBoolean("host_activity", true);
                    ld4Var.setArguments(bundle);
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.e(0, ld4Var, "androidx.biometric.BiometricFragment", 1);
                    aVar.k(true, true);
                    supportFragmentManager.C(true);
                    supportFragmentManager.J();
                }
                ld4Var.a.c = dVar;
                w41.a(dVar, cVar);
                ld4Var.a.d = cVar;
                boolean zN0 = ld4Var.n0();
                vd4 vd4Var2 = ld4Var.a;
                if (zN0) {
                    vd4Var2.v = ld4Var.getString(R.string.confirm_device_credential_password);
                } else {
                    vd4Var2.v = null;
                }
                Context context2 = ld4Var.getContext();
                if (i == 29) {
                    Bundle arguments = ld4Var.getArguments();
                    Context context3 = ld4Var.getContext();
                    if (arguments.getBoolean("has_fingerprint", (context3 == null || context3.getPackageManager() == null || !lmz.a(context3.getPackageManager())) ? false : true)) {
                        if (!ld4Var.n0()) {
                        }
                        if (ld4Var.a.B) {
                            ld4Var.b.postDelayed(new ld4.f(ld4Var), 600L);
                        } else {
                            ld4Var.u0();
                        }
                    } else {
                        Bundle arguments2 = ld4Var.getArguments();
                        Context context4 = ld4Var.getContext();
                        if (arguments2.getBoolean("has_face", i >= 29 && context4 != null && context4.getPackageManager() != null && mmz.a(context4.getPackageManager()))) {
                            if (!ld4Var.n0()) {
                            }
                            if (ld4Var.a.B) {
                                ld4Var.b.postDelayed(new ld4.f(ld4Var), 600L);
                            } else {
                                ld4Var.u0();
                            }
                        } else {
                            Bundle arguments3 = ld4Var.getArguments();
                            Context context5 = ld4Var.getContext();
                            if (i >= 29 && context5 != null && context5.getPackageManager() != null && mmz.b(context5.getPackageManager())) {
                                z = true;
                            }
                            if (!arguments3.getBoolean("has_iris", z)) {
                                ld4Var.a.z = true;
                                ld4Var.p0();
                            } else if (!ld4Var.n0() && new md4(new md4.c(context2)).a(255) != 0) {
                                ld4Var.a.z = true;
                                ld4Var.p0();
                            } else if (ld4Var.a.B) {
                                ld4Var.b.postDelayed(new ld4.f(ld4Var), 600L);
                            } else {
                                ld4Var.u0();
                            }
                        }
                    }
                } else {
                    if (!ld4Var.n0()) {
                    }
                    if (ld4Var.a.B) {
                        ld4Var.b.postDelayed(new ld4.f(ld4Var), 600L);
                    } else {
                        ld4Var.u0();
                    }
                }
            }
            this.d.invoke();
            return Unit.a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:46:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x008c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:85:0x011d  */
    /* JADX WARN: Code duplicated, block: B:87:0x012a  */
    /* JADX WARN: Code duplicated, block: B:90:0x0134  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    public static final void a(final qd4.c cVar, final Function1<? super qd4.c, Unit> function1, final Function1<? super g74, Unit> function2, Function0<Unit> function0, final Function0<Unit> function3, androidx.compose.runtime.a aVar, final int i, final int i2) {
        int i3;
        Function1<? super qd4.c, Unit> function4;
        Function0<Unit> function5;
        Function0<Unit> function6;
        boolean z;
        final Function0<Unit> function7;
        androidx.compose.runtime.e eVarZ;
        androidx.compose.runtime.a.C0041a.C0042a c0042a;
        Activity activityB;
        Function0<Unit> function8;
        e eVar;
        Object objY;
        int i4;
        b bVarI = aVar.i(2041652569);
        if ((i & 6) == 0) {
            i3 = (bVarI.A(cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            function4 = function1;
            i3 |= bVarI.A(function4) ? 32 : 16;
        } else {
            function4 = function1;
        }
        if ((i & 384) == 0) {
            i3 |= bVarI.A(function2) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                function5 = function0;
                i3 |= bVarI.A(function5) ? 2048 : 1024;
            }
            if ((i & 24576) == 0) {
                function6 = function3;
                if (bVarI.A(function6)) {
                    i4 = Http2.INITIAL_MAX_FRAME_SIZE;
                } else {
                    i4 = 8192;
                }
                i3 |= i4;
            } else {
                function6 = function3;
            }
            if ((i3 & 9363) != 9362) {
                z = true;
            } else {
                z = false;
            }
            if (bVarI.q(i3 & 1, z)) {
                c0042a = androidx.compose.runtime.a.C0041a.a;
                if (i5 != 0) {
                    objY = bVarI.y();
                    if (objY == c0042a) {
                        objY = new rd4(0);
                        bVarI.r(objY);
                    }
                    function5 = (Function0) objY;
                }
                Context context = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
                activityB = wc.b(context);
                if (!(activityB instanceof e)) {
                    activityB = null;
                }
                e eVar2 = (e) activityB;
                if (cVar != null || eVar2 == null) {
                    function8 = function5;
                    bVarI.N(1841320201);
                    bVarI.X(false);
                } else {
                    bVarI.N(1840226583);
                    Unit unit = Unit.a;
                    boolean zA = bVarI.A(context) | ((i3 & 112) == 32) | ((i3 & 896) == 256) | ((i3 & 7168) == 2048) | bVarI.A(eVar2) | bVarI.A(cVar) | ((i3 & 57344) == 16384);
                    Object objY2 = bVarI.y();
                    if (zA || objY2 == c0042a) {
                        function8 = function5;
                        Function1<? super qd4.c, Unit> function9 = function4;
                        eVar = eVar2;
                        a aVar2 = new a(context, eVar, cVar, function6, function9, function2, function8, null);
                        bVarI.r(aVar2);
                        objY2 = aVar2;
                    } else {
                        function8 = function5;
                        eVar = eVar2;
                    }
                    xvf.g(eVar, unit, (Function2) objY2, bVarI);
                    bVarI.X(false);
                }
                function7 = function8;
            } else {
                bVarI.G();
                function7 = function5;
            }
            eVarZ = bVarI.Z();
            if (eVarZ != null) {
                eVarZ.d = new Function2() { // from class: sd4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        td4.a(cVar, function1, function2, function7, function3, (a) obj, qj40.a(i | 1), i2);
                        return Unit.a;
                    }
                };
            }
        }
        i3 |= 3072;
        function5 = function0;
        if ((i & 24576) == 0) {
            function6 = function3;
            if (bVarI.A(function6)) {
                i4 = Http2.INITIAL_MAX_FRAME_SIZE;
            } else {
                i4 = 8192;
            }
            i3 |= i4;
        } else {
            function6 = function3;
        }
        if ((i3 & 9363) != 9362) {
            z = true;
        } else {
            z = false;
        }
        if (bVarI.q(i3 & 1, z)) {
            c0042a = androidx.compose.runtime.a.C0041a.a;
            if (i5 != 0) {
                objY = bVarI.y();
                if (objY == c0042a) {
                    objY = new rd4(0);
                    bVarI.r(objY);
                }
                function5 = (Function0) objY;
            }
            Context context2 = (Context) bVarI.O(AndroidCompositionLocals_androidKt.b);
            activityB = wc.b(context2);
            if (!(activityB instanceof e)) {
                activityB = null;
            }
            e eVar3 = (e) activityB;
            if (cVar != null) {
                function8 = function5;
                bVarI.N(1841320201);
                bVarI.X(false);
            } else {
                function8 = function5;
                bVarI.N(1841320201);
                bVarI.X(false);
            }
            function7 = function8;
        } else {
            bVarI.G();
            function7 = function5;
        }
        eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2() { // from class: sd4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    td4.a(cVar, function1, function2, function7, function3, (a) obj, qj40.a(i | 1), i2);
                    return Unit.a;
                }
            };
        }
    }
}
