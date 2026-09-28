package com.sportybet.android.account.latam.personalinfo.presentation;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;
import com.sportybet.android.gp.tz.R;
import defpackage.a1s;
import defpackage.avw;
import defpackage.cyb;
import defpackage.fm00;
import defpackage.fw3;
import defpackage.gm00;
import defpackage.hm00;
import defpackage.hwr;
import defpackage.id90;
import defpackage.iel;
import defpackage.ifx;
import defpackage.izl;
import defpackage.jq40;
import defpackage.pm00;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.ttr;
import defpackage.uhc;
import defpackage.v8i0;
import defpackage.vu60;
import defpackage.w8i0;
import defpackage.yfx;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/account/latam/personalinfo/presentation/PersonalInfoFragment;", "Lzuw;", "Lhm00;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class PersonalInfoFragment extends izl<hm00> {
    public final q8i0 B;

    public static final class a extends qlr implements Function0<Fragment> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return PersonalInfoFragment.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? PersonalInfoFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public PersonalInfoFragment() {
        ttr ttrVarA = hwr.a(a1s.c, new b(new a()));
        this.B = new q8i0(jq40.a(pm00.class), new c(ttrVarA), new e(ttrVarA), new d(ttrVarA));
    }

    @Override // defpackage.zuw
    public final /* bridge */ /* synthetic */ void m0(Object obj, androidx.compose.runtime.a aVar) {
        q0((hm00) obj, aVar, 0);
    }

    @Override // defpackage.zuw
    public final avw n0() {
        return (pm00) this.B.getValue();
    }

    @Override // defpackage.zuw
    public final void o0(id90 id90Var) {
        vu60 vu60VarA;
        id90Var.getClass();
        gm00 gm00Var = id90Var instanceof gm00 ? (gm00) id90Var : null;
        if (!(gm00Var instanceof gm00.b)) {
            if (gm00Var instanceof gm00.a) {
                requireActivity().finish();
                return;
            }
            if (!(gm00Var instanceof gm00.c)) {
                if (gm00Var == null) {
                    return;
                }
                uhc.a();
                return;
            } else {
                ifx ifxVarE = NavHostFragment.a.a(this).e();
                if (ifxVarE != null && (vu60VarA = ifxVarE.a()) != null) {
                    vu60VarA.e(Integer.valueOf(((gm00.c) gm00Var).a), "registration_error");
                }
                NavHostFragment.a.a(this).k();
                return;
            }
        }
        yfx yfxVarA = NavHostFragment.a.a(this);
        gm00.b bVar = (gm00.b) gm00Var;
        String str = bVar.a;
        String str2 = bVar.b;
        String str3 = bVar.c;
        str2.getClass();
        str3.getClass();
        str.getClass();
        yfxVarA.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("email", str2);
        bundle.putString("verify_token", str3);
        bundle.putString("type", "register");
        bundle.putString("token", "");
        bundle.putString("cpf", str);
        yfxVarA.f(R.id.to_int_verify_fragment, bundle);
    }

    public final void q0(hm00 hm00Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.b bVarI = aVar.i(-795121409);
        int i2 = i & 1;
        int i3 = 1;
        if (bVarI.q(i2, i2 != 0)) {
            fm00.g(null, bVarI, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new fw3(this, i, i3, hm00Var);
        }
    }
}
