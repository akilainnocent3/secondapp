package defpackage;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.hardware.biometrics.BiometricPrompt;
import android.hardware.biometrics.BiometricPrompt$AuthenticationCallback;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Build;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.sportybet.android.gp.tz.R;
import java.lang.ref.WeakReference;
import java.security.Signature;
import java.util.concurrent.Executor;
import javax.crypto.Cipher;
import javax.crypto.Mac;

/* JADX INFO: loaded from: classes.dex */
public class ld4 extends Fragment {
    public vd4 a;
    public final Handler b = new Handler(Looper.getMainLooper());

    public static class a {
        public static Intent a(KeyguardManager keyguardManager, CharSequence charSequence, CharSequence charSequence2) {
            return keyguardManager.createConfirmDeviceCredentialIntent(charSequence, charSequence2);
        }
    }

    public static class b {
        public static void a(BiometricPrompt biometricPrompt, BiometricPrompt.CryptoObject cryptoObject, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cryptoObject, cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static void b(BiometricPrompt biometricPrompt, CancellationSignal cancellationSignal, Executor executor, BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallback) {
            biometricPrompt.authenticate(cancellationSignal, executor, biometricPrompt$AuthenticationCallback);
        }

        public static BiometricPrompt c(BiometricPrompt.Builder builder) {
            return builder.build();
        }

        public static BiometricPrompt.Builder d(Context context) {
            return new BiometricPrompt.Builder(context);
        }

        public static void e(BiometricPrompt.Builder builder, CharSequence charSequence, Executor executor, DialogInterface.OnClickListener onClickListener) {
            builder.setNegativeButton(charSequence, executor, onClickListener);
        }

        public static void f(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setSubtitle(charSequence);
        }

        public static void g(BiometricPrompt.Builder builder, CharSequence charSequence) {
            builder.setTitle(charSequence);
        }
    }

    public static class c {
        public static void a(BiometricPrompt.Builder builder, boolean z) {
            builder.setConfirmationRequired(z);
        }

        public static void b(BiometricPrompt.Builder builder, boolean z) {
            builder.setDeviceCredentialAllowed(z);
        }
    }

    public static class d {
        public static void a(BiometricPrompt.Builder builder, int i) {
            builder.setAllowedAuthenticators(i);
        }
    }

    public static class e implements Executor {
        public final Handler a = new Handler(Looper.getMainLooper());

        @Override // java.util.concurrent.Executor
        public final void execute(Runnable runnable) {
            this.a.post(runnable);
        }
    }

    public static class f implements Runnable {
        public final WeakReference<ld4> a;

        public f(ld4 ld4Var) {
            this.a = new WeakReference<>(ld4Var);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<ld4> weakReference = this.a;
            if (weakReference.get() != null) {
                weakReference.get().u0();
            }
        }
    }

    public static class g implements Runnable {
        public final WeakReference<vd4> a;

        public g(vd4 vd4Var) {
            this.a = new WeakReference<>(vd4Var);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<vd4> weakReference = this.a;
            if (weakReference.get() != null) {
                weakReference.get().B = false;
            }
        }
    }

    public static class h implements Runnable {
        public final WeakReference<vd4> a;

        public h(vd4 vd4Var) {
            this.a = new WeakReference<>(vd4Var);
        }

        @Override // java.lang.Runnable
        public final void run() {
            WeakReference<vd4> weakReference = this.a;
            if (weakReference.get() != null) {
                weakReference.get().C = false;
            }
        }
    }

    public final void dismiss() {
        m0();
        vd4 vd4Var = this.a;
        vd4Var.y = false;
        if (!vd4Var.A && isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.p(this);
            aVar.k(true, true);
        }
        Context context = getContext();
        if (context != null) {
            String str = Build.MODEL;
            if (Build.VERSION.SDK_INT == 29 && str != null) {
                for (String str2 : context.getResources().getStringArray(R.array.delay_showing_prompt_models)) {
                    if (str.equals(str2)) {
                        vd4 vd4Var2 = this.a;
                        vd4Var2.B = true;
                        this.b.postDelayed(new g(vd4Var2), 600L);
                        return;
                    }
                }
            }
        }
    }

    public final void j0(int i) {
        if (i == 3 || !this.a.C) {
            if (o0()) {
                this.a.w = i;
                if (i == 1) {
                    r0(10, zcg.a(getContext(), 10));
                }
            }
            vd4 vd4Var = this.a;
            hc6 hc6Var = vd4Var.f;
            if (hc6Var == null) {
                hc6Var = new hc6();
                vd4Var.f = hc6Var;
            }
            CancellationSignal cancellationSignal = hc6Var.a;
            if (cancellationSignal != null) {
                try {
                    hc6.b.a(cancellationSignal);
                } catch (NullPointerException e2) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling biometric authentication.", e2);
                }
                hc6Var.a = null;
            }
            gc6 gc6Var = hc6Var.b;
            if (gc6Var != null) {
                try {
                    gc6Var.a();
                } catch (NullPointerException e3) {
                    Log.e("CancelSignalProvider", "Got NPE while canceling fingerprint authentication.", e3);
                }
                hc6Var.b = null;
            }
        }
    }

    public final void m0() {
        this.a.y = false;
        if (isAdded()) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            znh znhVar = (znh) parentFragmentManager.H("androidx.biometric.FingerprintDialogFragment");
            if (znhVar != null) {
                if (znhVar.isAdded()) {
                    znhVar.dismissAllowingStateLoss();
                    return;
                }
                androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
                aVar.p(znhVar);
                aVar.k(true, true);
            }
        }
    }

    public final boolean n0() {
        return Build.VERSION.SDK_INT <= 28 && w41.b(this.a.x1());
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003e  */
    /* JADX WARN: Code duplicated, block: B:24:0x004d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0056 A[LOOP:1: B:23:0x004b->B:27:0x0056, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0059 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:29:0x005b  */
    /* JADX WARN: Code duplicated, block: B:31:0x0065  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:45:0x0082 A[SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:22:0x003e, please report this as an issue */
    public final boolean o0() {
        Bundle arguments;
        Context context;
        boolean z;
        String str;
        int i;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            Context context2 = getContext();
            if (context2 == null || this.a.d == null) {
                if (i2 == 28) {
                    arguments = getArguments();
                    context = getContext();
                    if (context == null && context.getPackageManager() != null && lmz.a(context.getPackageManager())) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!arguments.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            String str2 = Build.MANUFACTURER;
            String str3 = Build.MODEL;
            if (i2 != 28) {
                if (i2 == 28) {
                    arguments = getArguments();
                    context = getContext();
                    if (context == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!arguments.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            if (str2 == null) {
                str = Build.MODEL;
                if (str == null) {
                    if (i2 == 28) {
                        arguments = getArguments();
                        context = getContext();
                        if (context == null) {
                            z = false;
                        } else {
                            z = false;
                        }
                        if (!arguments.getBoolean("has_fingerprint", z)) {
                        }
                    }
                    return false;
                }
                for (String str4 : context2.getResources().getStringArray(R.array.crypto_fingerprint_fallback_prefixes)) {
                    if (str.startsWith(str4)) {
                    }
                }
                if (i2 == 28) {
                    arguments = getArguments();
                    context = getContext();
                    if (context == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!arguments.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            for (String str5 : context2.getResources().getStringArray(R.array.crypto_fingerprint_fallback_vendors)) {
                if (!str2.equalsIgnoreCase(str5)) {
                }
            }
            str = Build.MODEL;
            if (str == null) {
                if (i2 == 28) {
                    arguments = getArguments();
                    context = getContext();
                    if (context == null) {
                        z = false;
                    } else {
                        z = false;
                    }
                    if (!arguments.getBoolean("has_fingerprint", z)) {
                    }
                }
                return false;
            }
            while (i < r6) {
                if (str.startsWith(str4)) {
                }
            }
            if (i2 == 28) {
                arguments = getArguments();
                context = getContext();
                if (context == null) {
                    z = false;
                } else {
                    z = false;
                }
                if (!arguments.getBoolean("has_fingerprint", z)) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        int i3 = 1;
        if (i == 1) {
            vd4 vd4Var = this.a;
            vd4Var.A = false;
            if (i2 != -1) {
                q0(10, getString(R.string.generic_error_user_canceled));
                return;
            }
            if (vd4Var.D) {
                vd4Var.D = false;
                i3 = -1;
            }
            s0(new qd4.b(null, i3));
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.a == null) {
            this.a = qd4.a(this, getArguments().getBoolean("host_activity", true));
        }
        new WeakReference(getActivity());
        vd4 vd4Var = this.a;
        ssw<qd4.b> sswVar = vd4Var.E;
        if (sswVar == null) {
            sswVar = new ssw<>();
            vd4Var.E = sswVar;
        }
        sswVar.f(this, new lfy() { // from class: dd4
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                qd4.b bVar = (qd4.b) obj;
                if (bVar != null) {
                    ld4 ld4Var = this.a;
                    ld4Var.s0(bVar);
                    vd4 vd4Var2 = ld4Var.a;
                    ssw<qd4.b> sswVar2 = vd4Var2.E;
                    if (sswVar2 == null) {
                        sswVar2 = new ssw<>();
                        vd4Var2.E = sswVar2;
                    }
                    vd4.A1(sswVar2, null);
                }
            }
        });
        vd4 vd4Var2 = this.a;
        ssw<zc4> sswVar2 = vd4Var2.F;
        if (sswVar2 == null) {
            sswVar2 = new ssw<>();
            vd4Var2.F = sswVar2;
        }
        sswVar2.f(this, new lfy() { // from class: ed4
            /* JADX WARN: Code duplicated, block: B:22:0x0042  */
            /* JADX WARN: Code duplicated, block: B:24:0x0048 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:26:0x004b  */
            /* JADX WARN: Code duplicated, block: B:29:0x0058  */
            /* JADX WARN: Code duplicated, block: B:33:0x005f  */
            /* JADX WARN: Code duplicated, block: B:35:0x0067  */
            /* JADX WARN: Code duplicated, block: B:37:0x006b  */
            /* JADX WARN: Code duplicated, block: B:38:0x006f  */
            /* JADX WARN: Code duplicated, block: B:40:0x007f  */
            /* JADX WARN: Code duplicated, block: B:47:0x0098  */
            /* JADX WARN: Code duplicated, block: B:50:0x00a1 A[LOOP:0: B:46:0x0096->B:50:0x00a1, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:51:0x00a4  */
            /* JADX WARN: Code duplicated, block: B:54:0x00b0 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:56:0x00b3  */
            /* JADX WARN: Code duplicated, block: B:63:0x00a6 A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:64:0x00a4 A[SYNTHETIC] */
            /* JADX WARN: Instruction removed from duplicated block: B:56:0x00b3, please report this as an issue */
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                vd4 vd4Var3;
                Context context;
                String str;
                String[] stringArray;
                int length;
                int i;
                int i2;
                zc4 zc4Var = (zc4) obj;
                if (zc4Var != null) {
                    int i3 = zc4Var.a;
                    CharSequence charSequenceA = zc4Var.b;
                    switch (i3) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                        case 5:
                        case 7:
                        case 8:
                        case 9:
                        case 10:
                        case 11:
                        case 12:
                        case 13:
                        case 14:
                        case 15:
                            break;
                        case 6:
                        default:
                            i3 = 8;
                            break;
                    }
                    ld4 ld4Var = this.a;
                    Context context2 = ld4Var.getContext();
                    int i4 = Build.VERSION.SDK_INT;
                    int i5 = 0;
                    if (i4 < 29 && ((i3 == 7 || i3 == 9) && context2 != null)) {
                        KeyguardManager keyguardManagerA = jpp.a(context2);
                        if ((keyguardManagerA == null ? false : jpp.b(keyguardManagerA)) && w41.b(ld4Var.a.x1())) {
                            ld4Var.p0();
                        } else if (ld4Var.o0()) {
                            if (charSequenceA == null) {
                                charSequenceA = zcg.a(ld4Var.getContext(), i3);
                            }
                            vd4Var3 = ld4Var.a;
                            if (i3 == 5) {
                                i2 = vd4Var3.w;
                                if (i2 != 0) {
                                    ld4Var.r0(i3, charSequenceA);
                                } else {
                                    ld4Var.r0(i3, charSequenceA);
                                }
                                ld4Var.dismiss();
                            } else {
                                if (vd4Var3.J) {
                                    ld4Var.q0(i3, charSequenceA);
                                } else {
                                    ld4Var.t0(charSequenceA);
                                    Handler handler = ld4Var.b;
                                    bd4 bd4Var = new bd4(ld4Var, i3, charSequenceA);
                                    context = ld4Var.getContext();
                                    if (context != null) {
                                        str = Build.MODEL;
                                        if (i4 == 28) {
                                            i5 = 2000;
                                        } else {
                                            stringArray = context.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                            length = stringArray.length;
                                            i = 0;
                                            while (true) {
                                                if (i < length) {
                                                    i5 = 2000;
                                                } else if (str.startsWith(stringArray[i])) {
                                                    i++;
                                                }
                                            }
                                        }
                                    } else {
                                        i5 = 2000;
                                    }
                                    handler.postDelayed(bd4Var, i5);
                                }
                                ld4Var.a.J = true;
                            }
                        } else {
                            if (charSequenceA == null) {
                                charSequenceA = ld4Var.getString(R.string.default_error_msg) + " " + i3;
                            }
                            ld4Var.q0(i3, charSequenceA);
                        }
                    } else if (ld4Var.o0()) {
                        if (charSequenceA == null) {
                            charSequenceA = zcg.a(ld4Var.getContext(), i3);
                        }
                        vd4Var3 = ld4Var.a;
                        if (i3 == 5) {
                            i2 = vd4Var3.w;
                            if (i2 != 0 || i2 == 3) {
                                ld4Var.r0(i3, charSequenceA);
                            }
                            ld4Var.dismiss();
                        } else {
                            if (vd4Var3.J) {
                                ld4Var.q0(i3, charSequenceA);
                            } else {
                                ld4Var.t0(charSequenceA);
                                Handler handler2 = ld4Var.b;
                                bd4 bd4Var2 = new bd4(ld4Var, i3, charSequenceA);
                                context = ld4Var.getContext();
                                if (context != null) {
                                    str = Build.MODEL;
                                    if (i4 == 28 || str == null) {
                                        i5 = 2000;
                                    } else {
                                        stringArray = context.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
                                        length = stringArray.length;
                                        i = 0;
                                        while (true) {
                                            if (i < length) {
                                                i5 = 2000;
                                            } else if (str.startsWith(stringArray[i])) {
                                                i++;
                                            }
                                        }
                                    }
                                } else {
                                    i5 = 2000;
                                }
                                handler2.postDelayed(bd4Var2, i5);
                            }
                            ld4Var.a.J = true;
                        }
                    } else {
                        if (charSequenceA == null) {
                            charSequenceA = ld4Var.getString(R.string.default_error_msg) + " " + i3;
                        }
                        ld4Var.q0(i3, charSequenceA);
                    }
                    vd4 vd4Var4 = ld4Var.a;
                    ssw<zc4> sswVar3 = vd4Var4.F;
                    if (sswVar3 == null) {
                        sswVar3 = new ssw<>();
                        vd4Var4.F = sswVar3;
                    }
                    vd4.A1(sswVar3, null);
                }
            }
        });
        vd4 vd4Var3 = this.a;
        ssw<CharSequence> sswVar3 = vd4Var3.G;
        if (sswVar3 == null) {
            sswVar3 = new ssw<>();
            vd4Var3.G = sswVar3;
        }
        sswVar3.f(this, new lfy() { // from class: fd4
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                CharSequence charSequence = (CharSequence) obj;
                if (charSequence != null) {
                    ld4 ld4Var = this.a;
                    if (ld4Var.o0()) {
                        ld4Var.t0(charSequence);
                    }
                    vd4 vd4Var4 = ld4Var.a;
                    ssw<zc4> sswVar4 = vd4Var4.F;
                    if (sswVar4 == null) {
                        sswVar4 = new ssw<>();
                        vd4Var4.F = sswVar4;
                    }
                    vd4.A1(sswVar4, null);
                }
            }
        });
        vd4 vd4Var4 = this.a;
        ssw<Boolean> sswVar4 = vd4Var4.H;
        if (sswVar4 == null) {
            sswVar4 = new ssw<>();
            vd4Var4.H = sswVar4;
        }
        sswVar4.f(this, new lfy() { // from class: gd4
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    final ld4 ld4Var = this.a;
                    if (ld4Var.o0()) {
                        ld4Var.t0(ld4Var.getString(R.string.fingerprint_not_recognized));
                    }
                    vd4 vd4Var5 = ld4Var.a;
                    if (vd4Var5.z) {
                        Executor bVar = vd4Var5.a;
                        if (bVar == null) {
                            bVar = new vd4.b();
                        }
                        bVar.execute(new Runnable() { // from class: kd4
                            @Override // java.lang.Runnable
                            public final void run() {
                                vd4 vd4Var6 = ld4Var.a;
                                qd4.a ud4Var = vd4Var6.b;
                                if (ud4Var == null) {
                                    ud4Var = new ud4();
                                    vd4Var6.b = ud4Var;
                                }
                                ud4Var.b();
                            }
                        });
                    } else {
                        Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
                    }
                    vd4 vd4Var6 = ld4Var.a;
                    ssw<Boolean> sswVar5 = vd4Var6.H;
                    if (sswVar5 == null) {
                        sswVar5 = new ssw<>();
                        vd4Var6.H = sswVar5;
                    }
                    vd4.A1(sswVar5, Boolean.FALSE);
                }
            }
        });
        vd4 vd4Var5 = this.a;
        ssw<Boolean> sswVar5 = vd4Var5.I;
        if (sswVar5 == null) {
            sswVar5 = new ssw<>();
            vd4Var5.I = sswVar5;
        }
        sswVar5.f(this, new lfy() { // from class: hd4
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    ld4 ld4Var = this.a;
                    if (ld4Var.n0()) {
                        ld4Var.p0();
                    } else {
                        vd4 vd4Var6 = ld4Var.a;
                        String string = vd4Var6.v;
                        if (string == null) {
                            qd4.d dVar = vd4Var6.c;
                            string = dVar != null ? dVar.c : null;
                        }
                        if (string == null) {
                            string = ld4Var.getString(R.string.default_error_msg);
                        }
                        ld4Var.q0(13, string);
                        ld4Var.j0(2);
                    }
                    ld4Var.a.z1(false);
                }
            }
        });
        vd4 vd4Var6 = this.a;
        ssw<Boolean> sswVar6 = vd4Var6.K;
        if (sswVar6 == null) {
            sswVar6 = new ssw<>();
            vd4Var6.K = sswVar6;
        }
        sswVar6.f(this, new lfy() { // from class: id4
            @Override // defpackage.lfy
            public final void u1(Object obj) {
                if (((Boolean) obj).booleanValue()) {
                    ld4 ld4Var = this.a;
                    ld4Var.j0(1);
                    ld4Var.dismiss();
                    vd4 vd4Var7 = ld4Var.a;
                    ssw<Boolean> sswVar7 = vd4Var7.K;
                    if (sswVar7 == null) {
                        sswVar7 = new ssw<>();
                        vd4Var7.K = sswVar7;
                    }
                    vd4.A1(sswVar7, Boolean.FALSE);
                }
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        if (Build.VERSION.SDK_INT == 29 && w41.b(this.a.x1())) {
            vd4 vd4Var = this.a;
            vd4Var.C = true;
            this.b.postDelayed(new h(vd4Var), 250L);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (Build.VERSION.SDK_INT >= 29 || this.a.A) {
            return;
        }
        androidx.fragment.app.e activity = getActivity();
        if (activity == null || !activity.isChangingConfigurations()) {
            j0(0);
        }
    }

    public final void p0() {
        Context context = getContext();
        KeyguardManager keyguardManagerA = context != null ? jpp.a(context) : null;
        if (keyguardManagerA == null) {
            q0(12, getString(R.string.generic_error_no_keyguard));
            return;
        }
        vd4 vd4Var = this.a;
        qd4.d dVar = vd4Var.c;
        String str = dVar != null ? dVar.a : null;
        CharSequence charSequence = dVar != null ? dVar.b : null;
        vd4Var.getClass();
        Intent intentA = a.a(keyguardManagerA, str, charSequence != null ? charSequence : null);
        if (intentA == null) {
            q0(14, getString(R.string.generic_error_no_device_credential));
            return;
        }
        this.a.A = true;
        if (o0()) {
            m0();
        }
        intentA.setFlags(134742016);
        startActivityForResult(intentA, 1);
    }

    public final void q0(int i, CharSequence charSequence) {
        r0(i, charSequence);
        dismiss();
    }

    public final void r0(final int i, final CharSequence charSequence) {
        vd4 vd4Var = this.a;
        if (vd4Var.A) {
            Log.v("BiometricFragment", "Error not sent to client. User is confirming their device credential.");
            return;
        }
        if (!vd4Var.z) {
            Log.w("BiometricFragment", "Error not sent to client. Client is not awaiting a result.");
            return;
        }
        vd4Var.z = false;
        Executor bVar = vd4Var.a;
        if (bVar == null) {
            bVar = new vd4.b();
        }
        bVar.execute(new Runnable() { // from class: jd4
            @Override // java.lang.Runnable
            public final void run() {
                vd4 vd4Var2 = this.a.a;
                qd4.a ud4Var = vd4Var2.b;
                if (ud4Var == null) {
                    ud4Var = new ud4();
                    vd4Var2.b = ud4Var;
                }
                ud4Var.a(i, charSequence);
            }
        });
    }

    public final void s0(final qd4.b bVar) {
        vd4 vd4Var = this.a;
        if (vd4Var.z) {
            vd4Var.z = false;
            Executor bVar2 = vd4Var.a;
            if (bVar2 == null) {
                bVar2 = new vd4.b();
            }
            bVar2.execute(new Runnable() { // from class: cd4
                @Override // java.lang.Runnable
                public final void run() {
                    vd4 vd4Var2 = this.a.a;
                    qd4.a ud4Var = vd4Var2.b;
                    if (ud4Var == null) {
                        ud4Var = new ud4();
                        vd4Var2.b = ud4Var;
                    }
                    ud4Var.c(bVar);
                }
            });
        } else {
            Log.w("BiometricFragment", "Success not sent to client. Client is not awaiting a result.");
        }
        dismiss();
    }

    public final void t0(CharSequence charSequence) {
        if (charSequence == null) {
            charSequence = getString(R.string.default_error_msg);
        }
        this.a.y1(2);
        vd4 vd4Var = this.a;
        ssw<CharSequence> sswVar = vd4Var.N;
        if (sswVar == null) {
            sswVar = new ssw<>();
            vd4Var.N = sswVar;
        }
        vd4.A1(sswVar, charSequence);
    }

    public final void u0() {
        int i;
        CancellationSignal cancellationSignal;
        boolean z;
        boolean z2;
        if (this.a.y) {
            return;
        }
        if (getContext() == null) {
            Log.w("BiometricFragment", "Not showing biometric prompt. Context is null.");
            return;
        }
        vd4 vd4Var = this.a;
        vd4Var.y = true;
        vd4Var.z = true;
        Context context = getContext();
        if (context != null) {
            String str = Build.MANUFACTURER;
            if (Build.VERSION.SDK_INT != 29) {
                z2 = false;
            } else {
                if (str != null) {
                    String[] stringArray = context.getResources().getStringArray(R.array.keyguard_biometric_and_credential_exclude_vendors);
                    int length = stringArray.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z = false;
                            break;
                        } else {
                            if (str.equalsIgnoreCase(stringArray[i2])) {
                                z = true;
                                break;
                            }
                            i2++;
                        }
                    }
                } else {
                    z = false;
                    break;
                }
                z2 = !z;
            }
            if (z2) {
                int iX1 = this.a.x1();
                if ((iX1 & 255) == 255 && w41.b(iX1)) {
                    this.a.D = true;
                    p0();
                    return;
                }
            }
        }
        String str2 = null;
        cVar = null;
        cVar = null;
        cVar = null;
        cVar = null;
        doh.c cVar = null;
        if (!o0()) {
            BiometricPrompt.Builder builderD = b.d(requireContext().getApplicationContext());
            vd4 vd4Var2 = this.a;
            qd4.d dVar = vd4Var2.c;
            String str3 = dVar != null ? dVar.a : null;
            CharSequence charSequence = dVar != null ? dVar.b : null;
            vd4Var2.getClass();
            if (str3 != null) {
                b.g(builderD, str3);
            }
            if (charSequence != null) {
                b.f(builderD, charSequence);
            }
            vd4 vd4Var3 = this.a;
            String str4 = vd4Var3.v;
            if (str4 != null) {
                str2 = str4;
            } else {
                qd4.d dVar2 = vd4Var3.c;
                if (dVar2 != null) {
                    str2 = dVar2.c;
                }
            }
            if (!TextUtils.isEmpty(str2)) {
                Executor bVar = this.a.a;
                if (bVar == null) {
                    bVar = new vd4.b();
                }
                vd4 vd4Var4 = this.a;
                vd4.c cVar2 = vd4Var4.i;
                if (cVar2 == null) {
                    cVar2 = new vd4.c(vd4Var4);
                    vd4Var4.i = cVar2;
                }
                b.e(builderD, str2, bVar, cVar2);
            }
            int i3 = Build.VERSION.SDK_INT;
            if (i3 >= 29) {
                qd4.d dVar3 = this.a.c;
                c.a(builderD, true);
            }
            int iX2 = this.a.x1();
            if (i3 >= 30) {
                d.a(builderD, iX2);
            } else if (i3 >= 29) {
                c.b(builderD, w41.b(iX2));
            }
            BiometricPrompt biometricPromptC = b.c(builderD);
            Context context2 = getContext();
            BiometricPrompt.CryptoObject cryptoObjectA = w3c.a(this.a.d);
            vd4 vd4Var5 = this.a;
            hc6 hc6Var = vd4Var5.f;
            if (hc6Var == null) {
                hc6Var = new hc6();
                vd4Var5.f = hc6Var;
            }
            CancellationSignal cancellationSignalB = hc6Var.a;
            if (cancellationSignalB == null) {
                cancellationSignalB = hc6.b.b();
                hc6Var.a = cancellationSignalB;
            }
            e eVar = new e();
            vd4 vd4Var6 = this.a;
            v41 v41Var = vd4Var6.e;
            if (v41Var == null) {
                v41Var = new v41(new vd4.a(vd4Var6));
                vd4Var6.e = v41Var;
            }
            BiometricPrompt$AuthenticationCallback biometricPrompt$AuthenticationCallbackA = v41Var.a;
            if (biometricPrompt$AuthenticationCallbackA == null) {
                biometricPrompt$AuthenticationCallbackA = v41.a.a(v41Var.c);
                v41Var.a = biometricPrompt$AuthenticationCallbackA;
            }
            try {
                if (cryptoObjectA == null) {
                    b.b(biometricPromptC, cancellationSignalB, eVar, biometricPrompt$AuthenticationCallbackA);
                } else {
                    b.a(biometricPromptC, cryptoObjectA, cancellationSignalB, eVar, biometricPrompt$AuthenticationCallbackA);
                }
                return;
            } catch (NullPointerException e2) {
                Log.e("BiometricFragment", "Got NPE while authenticating with biometric prompt.", e2);
                q0(1, context2 != null ? context2.getString(R.string.default_error_msg) : "");
                return;
            }
        }
        Context applicationContext = requireContext().getApplicationContext();
        FingerprintManager fingerprintManagerC = doh.a.c(applicationContext);
        if (fingerprintManagerC == null || !doh.a.e(fingerprintManagerC)) {
            i = 12;
        } else {
            FingerprintManager fingerprintManagerC2 = doh.a.c(applicationContext);
            i = (fingerprintManagerC2 == null || !doh.a.d(fingerprintManagerC2)) ? 11 : 0;
        }
        if (i != 0) {
            q0(i, zcg.a(applicationContext, i));
            return;
        }
        if (isAdded()) {
            this.a.J = true;
            String str5 = Build.MODEL;
            if (Build.VERSION.SDK_INT != 28 || str5 == null) {
                this.b.postDelayed(new Runnable() { // from class: ad4
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.a.a.J = false;
                    }
                }, 500L);
                boolean z3 = getArguments().getBoolean("host_activity", true);
                znh znhVar = new znh();
                Bundle bundle = new Bundle();
                bundle.putBoolean("host_activity", z3);
                znhVar.setArguments(bundle);
                znhVar.show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                break;
            }
            String[] stringArray2 = applicationContext.getResources().getStringArray(R.array.hide_fingerprint_instantly_prefixes);
            int length2 = stringArray2.length;
            int i4 = 0;
            while (true) {
                if (i4 >= length2) {
                    this.b.postDelayed(new Runnable() { // from class: ad4
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.a.a.J = false;
                        }
                    }, 500L);
                    boolean z4 = getArguments().getBoolean("host_activity", true);
                    znh znhVar2 = new znh();
                    Bundle bundle2 = new Bundle();
                    bundle2.putBoolean("host_activity", z4);
                    znhVar2.setArguments(bundle2);
                    znhVar2.show(getParentFragmentManager(), "androidx.biometric.FingerprintDialogFragment");
                    break;
                }
                if (str5.startsWith(stringArray2[i4])) {
                    break;
                } else {
                    i4++;
                }
            }
            vd4 vd4Var7 = this.a;
            vd4Var7.w = 0;
            qd4.c cVar3 = vd4Var7.d;
            if (cVar3 != null) {
                Cipher cipher = cVar3.b;
                if (cipher != null) {
                    cVar = new doh.c(cipher);
                } else {
                    Signature signature = cVar3.a;
                    if (signature != null) {
                        cVar = new doh.c(signature);
                    } else {
                        Mac mac = cVar3.c;
                        if (mac != null) {
                            cVar = new doh.c(mac);
                        } else {
                            int i5 = Build.VERSION.SDK_INT;
                            if (i5 >= 30 && cVar3.d != null) {
                                Log.e("CryptoObjectUtils", "Identity credential is not supported by FingerprintManager.");
                            } else if (i5 >= 33 && cVar3.e != null) {
                                Log.e("CryptoObjectUtils", "Presentation session is not supported by FingerprintManager.");
                            }
                        }
                    }
                }
            }
            vd4 vd4Var8 = this.a;
            hc6 hc6Var2 = vd4Var8.f;
            if (hc6Var2 == null) {
                hc6Var2 = new hc6();
                vd4Var8.f = hc6Var2;
            }
            gc6 gc6Var = hc6Var2.b;
            if (gc6Var == null) {
                gc6Var = new gc6();
                hc6Var2.b = gc6Var;
            }
            vd4 vd4Var9 = this.a;
            v41 v41Var2 = vd4Var9.e;
            if (v41Var2 == null) {
                v41Var2 = new v41(new vd4.a(vd4Var9));
                vd4Var9.e = v41Var2;
            }
            u41 u41Var = v41Var2.b;
            if (u41Var == null) {
                u41Var = new u41(v41Var2);
                v41Var2.b = u41Var;
            }
            try {
                synchronized (gc6Var) {
                    try {
                        if (gc6Var.c == null) {
                            CancellationSignal cancellationSignal2 = new CancellationSignal();
                            gc6Var.c = cancellationSignal2;
                            if (gc6Var.a) {
                                cancellationSignal2.cancel();
                            }
                        }
                        cancellationSignal = gc6Var.c;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                FingerprintManager fingerprintManagerC3 = doh.a.c(applicationContext);
                if (fingerprintManagerC3 != null) {
                    doh.a.a(fingerprintManagerC3, doh.a.g(cVar), cancellationSignal, new coh(u41Var));
                }
            } catch (NullPointerException e3) {
                Log.e("BiometricFragment", "Got NPE while authenticating with fingerprint.", e3);
                q0(1, zcg.a(applicationContext, 1));
            }
        }
    }
}
