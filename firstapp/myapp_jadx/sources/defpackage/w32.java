package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.fragment.app.e;
import com.sporty.android.common_ui.uitext.UiText;
import com.sporty.android.platform.features.newotp.otpselector.OtpSelection;
import com.sporty.android.platform.features.newotp.util.OTPInternalData;
import com.sporty.android.platform.features.newotp.util.OtpData;
import com.sporty.android.platform.features.newotp.util.OtpModule;
import com.sportybet.android.gp.tz.R;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u000b²\u0006\u001c\u0010\b\u001a\u00028\u0000\"\u000e\b\u0000\u0010\u0007*\b\u0012\u0004\u0012\u00028\u00010\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"}, d2 = {"Lw32;", "Landroidx/fragment/app/Fragment;", "Lk9j;", "Lj9j;", "<init>", "()V", "Lb42;", "VM", "viewModel", "Lw8i0;", "owner", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public abstract class w32 extends gml implements k9j, j9j {
    public d0n f;
    public Function0<? extends OtpData> i;
    public Function0<OTPInternalData> v;

    public static w32 o0(OtpSelection otpSelection, OtpModule otpModule, OTPInternalData oTPInternalData, UiText uiText) {
        int iOrdinal = otpSelection.ordinal();
        if (iOrdinal == 0) {
            i0g i0gVar = new i0g();
            Bundle bundle = new Bundle();
            bundle.putParcelable("key - module", otpModule);
            bundle.putParcelable("key - otp internal data", oTPInternalData);
            i0gVar.setArguments(bundle);
            return i0gVar;
        }
        if (iOrdinal == 1) {
            s2a0 s2a0Var = new s2a0();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("key - module", otpModule);
            bundle2.putParcelable("key - otp internal data", oTPInternalData);
            if (uiText != null) {
                bundle2.putParcelable("pending_snackbar", uiText);
            }
            s2a0Var.setArguments(bundle2);
            return s2a0Var;
        }
        if (iOrdinal == 2) {
            zni0 zni0Var = new zni0();
            Bundle bundle3 = new Bundle();
            bundle3.putParcelable("key - module", otpModule);
            bundle3.putParcelable("key - otp internal data", oTPInternalData);
            zni0Var.setArguments(bundle3);
            return zni0Var;
        }
        if (iOrdinal == 3) {
            qo50 qo50Var = new qo50();
            Bundle bundle4 = new Bundle();
            bundle4.putParcelable("key - module", otpModule);
            bundle4.putParcelable("key - otp internal data", oTPInternalData);
            qo50Var.setArguments(bundle4);
            return qo50Var;
        }
        if (iOrdinal != 4) {
            z9l.a(otpSelection, "Unsupported OTP selection: ");
            return null;
        }
        zaf0 zaf0Var = new zaf0();
        Bundle bundle5 = new Bundle();
        bundle5.putParcelable("key - module", otpModule);
        bundle5.putParcelable("key - otp internal data", oTPInternalData);
        zaf0Var.setArguments(bundle5);
        return zaf0Var;
    }

    public static q8i0 s0(w32 w32Var, Fragment fragment, dq7 dq7Var) {
        int i = 0;
        r32 r32Var = new r32(fragment, i);
        w32Var.getClass();
        fragment.getClass();
        final ttr ttrVarA = hwr.a(a1s.c, new s32(r32Var, 0));
        return new q8i0(dq7Var, new Function0() { // from class: t32
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ((w8i0) ttrVarA.getValue()).getViewModelStore();
            }
        }, new v32(fragment, ttrVarA, i), new u32(ttrVarA, i));
    }

    public final void m0() {
        if (this instanceof vqx) {
            requireActivity().getOnBackPressedDispatcher().d();
        } else {
            n0(false);
        }
    }

    public final void n0(boolean z) {
        OtpData otpDataInvoke;
        OTPInternalData oTPInternalDataInvoke;
        Function0<OTPInternalData> function0 = this.v;
        List<OtpSelection> list = (function0 == null || (oTPInternalDataInvoke = function0.invoke()) == null) ? null : oTPInternalDataInvoke.a;
        if (list == null) {
            return;
        }
        if (list.size() != 1 && !z) {
            e eVarRequireActivity = requireActivity();
            eVarRequireActivity.getClass();
            eVarRequireActivity.getSupportFragmentManager().Z(0, "NewOtpSelectorFragment");
            return;
        }
        Function0<? extends OtpData> function1 = this.i;
        if (function1 == null || (otpDataInvoke = function1.invoke()) == null) {
            return;
        }
        t0(otpDataInvoke);
        e eVarRequireActivity2 = requireActivity();
        eVarRequireActivity2.getClass();
        eVarRequireActivity2.getSupportFragmentManager().Z(1, "NewOtpSelectorFragment");
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this instanceof vqx) {
            return;
        }
        e eVarRequireActivity = requireActivity();
        eVarRequireActivity.getClass();
        eVarRequireActivity.getOnBackPressedDispatcher().a(this, new vc(new q32(this, 0)));
    }

    public final OtpData p0() {
        Parcelable parcelable;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("key - module", OtpModule.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("key - module");
                if (!(parcelable2 instanceof OtpModule)) {
                    parcelable2 = null;
                }
                parcelable = (OtpModule) parcelable2;
            }
            OtpModule otpModule = (OtpModule) parcelable;
            if (otpModule != null) {
                return otpModule.a;
            }
        }
        return null;
    }

    public final d0n q0() {
        d0n d0nVar = this.f;
        if (d0nVar != null) {
            return d0nVar;
        }
        Intrinsics.n("utils");
        throw null;
    }

    public final void r0(OtpSelection otpSelection, OTPInternalData oTPInternalData, boolean z, UiText uiText) {
        Parcelable parcelable;
        otpSelection.getClass();
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = (Parcelable) arguments.getParcelable("key - module", OtpModule.class);
            } else {
                Parcelable parcelable2 = arguments.getParcelable("key - module");
                if (!(parcelable2 instanceof OtpModule)) {
                    parcelable2 = null;
                }
                parcelable = (OtpModule) parcelable2;
            }
            OtpModule otpModule = (OtpModule) parcelable;
            if (otpModule == null || otpSelection == OtpSelection.Bio) {
                return;
            }
            try {
                zi50.a aVar = zi50.b;
                w32 w32VarO0 = o0(otpSelection, otpModule, oTPInternalData, uiText);
                FragmentManager supportFragmentManager = requireActivity().getSupportFragmentManager();
                supportFragmentManager.getClass();
                a aVar2 = new a(supportFragmentManager);
                if (!z) {
                    aVar2.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                }
                aVar2.f(android.R.id.content, w32VarO0, w32VarO0.getA());
                aVar2.c(w32VarO0.getA());
                aVar2.k(true, true);
            } catch (Throwable unused) {
                zi50.a aVar3 = zi50.b;
            }
        }
    }

    public final void t0(OtpData otpData) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("key - otp data", otpData);
        Unit unit = Unit.a;
        getParentFragmentManager().m0("key - otp result", bundle);
    }
}
