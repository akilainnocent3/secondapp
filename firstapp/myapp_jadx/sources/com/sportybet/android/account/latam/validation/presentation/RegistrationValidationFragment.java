package com.sportybet.android.account.latam.validation.presentation;

import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import com.sportybet.android.account.international.INTAuthActivity;
import com.sportybet.android.auth.BaseAccountAuthenticatorActivity;
import defpackage.a1s;
import defpackage.avw;
import defpackage.cyb;
import defpackage.hwr;
import defpackage.id90;
import defpackage.iel;
import defpackage.j050;
import defpackage.jq40;
import defpackage.k050;
import defpackage.l050;
import defpackage.m1m;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.s050;
import defpackage.ttr;
import defpackage.uqm;
import defpackage.v5;
import defpackage.v8i0;
import defpackage.vqm;
import defpackage.w8i0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/account/latam/validation/presentation/RegistrationValidationFragment;", "Lzuw;", "Ll050;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class RegistrationValidationFragment extends m1m<l050> {
    public v5 B;
    public final q8i0 C;

    public static final class a extends qlr implements Function0<Fragment> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return RegistrationValidationFragment.this;
        }
    }

    public static final class b extends qlr implements Function0<w8i0> {
        public final /* synthetic */ a a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(a aVar) {
            super(0);
            this.a = aVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            w8i0 w8i0Var = (w8i0) this.a.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return ielVar != null ? ielVar.getDefaultViewModelCreationExtras() : cyb.a.b;
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? RegistrationValidationFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public RegistrationValidationFragment() {
        ttr ttrVarA = hwr.a(a1s.c, new b(new a()));
        this.C = new q8i0(jq40.a(s050.class), new c(ttrVarA), new e(ttrVarA), new d(ttrVarA));
    }

    @Override // defpackage.zuw
    public final /* bridge */ /* synthetic */ void m0(Object obj, androidx.compose.runtime.a aVar) {
        q0((l050) obj, aVar, 0);
    }

    @Override // defpackage.zuw
    public final avw n0() {
        return (s050) this.C.getValue();
    }

    @Override // defpackage.zuw
    public final void o0(id90 id90Var) {
        id90Var.getClass();
        k050 k050Var = id90Var instanceof k050 ? (k050) id90Var : null;
        if (!(k050Var instanceof k050.d)) {
            if (k050Var instanceof k050.a) {
                requireActivity().finish();
                return;
            }
            return;
        }
        vqm vqmVar = ((k050.d) k050Var).a;
        androidx.fragment.app.e eVarRequireActivity = requireActivity();
        INTAuthActivity iNTAuthActivity = eVarRequireActivity instanceof INTAuthActivity ? (INTAuthActivity) eVarRequireActivity : null;
        if (iNTAuthActivity == null) {
            return;
        }
        uqm uqmVar = this.i;
        uqmVar.setRegisterStatus(true);
        uqmVar.saveToken(iNTAuthActivity, vqmVar);
        v5 v5Var = this.B;
        if (v5Var == null) {
            Intrinsics.n("accRegistrationHelper");
            throw null;
        }
        androidx.fragment.app.e eVarRequireActivity2 = requireActivity();
        eVarRequireActivity2.getClass();
        v5Var.a((BaseAccountAuthenticatorActivity) eVarRequireActivity2, "Reg_5", Boolean.FALSE, Boolean.valueOf(vqmVar.l));
    }

    public final void q0(final l050 l050Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.b bVarI = aVar.i(1178805126);
        int i2 = i & 1;
        if (bVarI.q(i2, i2 != 0)) {
            j050.e(null, bVarI, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(l050Var, i) { // from class: ez40
                public final /* synthetic */ l050 b;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iA = qj40.a(1);
                    this.a.q0(this.b, (a) obj, iA);
                    return Unit.a;
                }
            };
        }
    }
}
