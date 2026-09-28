package com.sportybet.android.account.international.resetpwd.ui;

import android.os.Bundle;
import androidx.compose.runtime.a;
import androidx.fragment.app.Fragment;
import com.sportybet.android.account.international.resetpwd.ui.ResetPwdFragment;
import com.sportybet.android.home.MainActivity;
import defpackage.a1s;
import defpackage.avw;
import defpackage.cfx;
import defpackage.cyb;
import defpackage.exo;
import defpackage.gxo;
import defpackage.hwr;
import defpackage.i7n;
import defpackage.iel;
import defpackage.if50;
import defpackage.jq40;
import defpackage.lx5;
import defpackage.nf50;
import defpackage.q8i0;
import defpackage.qlr;
import defpackage.r8i0;
import defpackage.ttr;
import defpackage.u1m;
import defpackage.v8i0;
import defpackage.w8i0;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sportybet/android/account/international/resetpwd/ui/ResetPwdFragment;", "Lzuw;", "Lgxo;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ResetPwdFragment extends u1m<gxo> {
    public final cfx B = new cfx(jq40.a(if50.class), new d());
    public final q8i0 C;
    public final q8i0 D;

    public static final class a extends qlr implements Function0<v8i0> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ResetPwdFragment.this.requireActivity().getViewModelStore();
        }
    }

    public static final class b extends qlr implements Function0<cyb> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ResetPwdFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class c extends qlr implements Function0<r8i0.c> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ResetPwdFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class d implements Function0<Bundle> {
        public d() {
        }

        @Override // kotlin.jvm.functions.Function0
        public final Bundle invoke() {
            ResetPwdFragment resetPwdFragment = ResetPwdFragment.this;
            Bundle arguments = resetPwdFragment.getArguments();
            if (arguments != null) {
                return arguments;
            }
            lx5.b(resetPwdFragment, "Fragment ", " has null arguments");
            return null;
        }
    }

    public static final class e extends qlr implements Function0<Fragment> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ResetPwdFragment.this;
        }
    }

    public static final class f extends qlr implements Function0<w8i0> {
        public final /* synthetic */ e a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.a = eVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class g extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class h extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
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

    public static final class i extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ResetPwdFragment.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ResetPwdFragment() {
        ttr ttrVarA = hwr.a(a1s.c, new f(new e()));
        this.C = new q8i0(jq40.a(nf50.class), new g(ttrVarA), new i(ttrVarA), new h(ttrVarA));
        this.D = new q8i0(jq40.a(i7n.class), new a(), new c(), new b());
    }

    @Override // defpackage.zuw
    public final /* bridge */ /* synthetic */ void m0(Object obj, androidx.compose.runtime.a aVar) {
        q0((gxo) obj, aVar, 0);
    }

    @Override // defpackage.zuw
    public final avw n0() {
        return (nf50) this.C.getValue();
    }

    public final void q0(final gxo gxoVar, androidx.compose.runtime.a aVar, final int i2) {
        androidx.compose.runtime.b bVarI = aVar.i(1822089993);
        int i3 = (bVarI.A(this) ? 32 : 16) | i2;
        if (bVarI.q(i3 & 1, (i3 & 17) != 16)) {
            boolean zA = bVarI.A(this);
            Object objY = bVarI.y();
            androidx.compose.runtime.a.C0041a.C0042a c0042a = androidx.compose.runtime.a.C0041a.a;
            if (zA || objY == c0042a) {
                objY = new Function0() { // from class: ff50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        this.a.requireActivity().finish();
                        return Unit.a;
                    }
                };
                bVarI.r(objY);
            }
            Function0 function0 = (Function0) objY;
            boolean zA2 = bVarI.A(this);
            Object objY2 = bVarI.y();
            if (zA2 || objY2 == c0042a) {
                objY2 = new Function0() { // from class: gf50
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ResetPwdFragment resetPwdFragment = this.a;
                        ((i7n) resetPwdFragment.D.getValue()).b = true;
                        cfx cfxVar = resetPwdFragment.B;
                        if (((if50) cfxVar.getValue()).c || ((if50) cfxVar.getValue()).d) {
                            yrh0.t(resetPwdFragment.getContext(), MainActivity.class, true);
                        } else {
                            resetPwdFragment.requireActivity().finish();
                        }
                        return Unit.a;
                    }
                };
                bVarI.r(objY2);
            }
            exo.b(null, function0, (Function0) objY2, bVarI, 0);
        } else {
            bVarI.G();
        }
        androidx.compose.runtime.e eVarZ = bVarI.Z();
        if (eVarZ != null) {
            eVarZ.d = new Function2(gxoVar, i2) { // from class: hf50
                public final /* synthetic */ gxo b;

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
