package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.appsflyer.internal.u;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.country.ChangeRegionActivity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lybj;", "Lm12;", "Lk9j;", "Lj9j;", "<init>", "()V", "Ljdj;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ybj extends frl implements k9j, j9j {
    public final q8i0 B;
    public rx40 C;
    public final String D;

    public static final /* synthetic */ class a extends pf implements Function2<fdj, v1b<? super Unit>, Object> {
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(fdj fdjVar, v1b<? super Unit> v1bVar) {
            fdj fdjVar2 = fdjVar;
            ybj ybjVar = (ybj) this.a;
            if (fdjVar2 instanceof fdj.b) {
                ybjVar.requireActivity().finish();
            } else if (fdjVar2 instanceof fdj.a) {
                yrh0.s(ybjVar.requireContext(), ChangeRegionActivity.z1(ybjVar.requireActivity()), true);
            } else {
                ybjVar.getClass();
                if (fdjVar2 instanceof fdj.c) {
                    sh8.c().e(((fdj.c) fdjVar2).a);
                } else if (fdjVar2 instanceof fdj.e) {
                    mdj mdjVar = new mdj();
                    Bundle bundle = new Bundle();
                    bundle.putString("mobile", ((fdj.e) fdjVar2).a);
                    mdjVar.setArguments(bundle);
                    FragmentManager supportFragmentManager = ybjVar.requireActivity().getSupportFragmentManager();
                    supportFragmentManager.getClass();
                    androidx.fragment.app.a aVar = new androidx.fragment.app.a(supportFragmentManager);
                    aVar.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                    aVar.f(android.R.id.content, mdjVar, null);
                    aVar.c("OTPUNIFY");
                    aVar.k(true, true);
                } else {
                    if (!(fdjVar2 instanceof fdj.d)) {
                        uhc.a();
                        return null;
                    }
                    fdj.d dVar = (fdj.d) fdjVar2;
                    boolean z = dVar.b;
                    if (!z) {
                        m12.w = true;
                        ybjVar.requireActivity().getSupportFragmentManager().b0(-1, 1, null);
                        m12.w = false;
                    }
                    s9 s9Var = new s9();
                    Bundle bundle2 = new Bundle();
                    bundle2.putString("mobile", dVar.a);
                    s9Var.setArguments(bundle2);
                    FragmentManager supportFragmentManager2 = ybjVar.requireActivity().getSupportFragmentManager();
                    supportFragmentManager2.getClass();
                    androidx.fragment.app.a aVar2 = new androidx.fragment.app.a(supportFragmentManager2);
                    if (z) {
                        aVar2.h(R.anim.slide_in_right, R.anim.slide_out_left, R.anim.slide_in_left, R.anim.slide_out_right);
                        aVar2.c(null);
                    }
                    aVar2.f(android.R.id.content, s9Var, null);
                    aVar2.k(true, true);
                }
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<gdj, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(gdj gdjVar) {
            gdj gdjVar2 = gdjVar;
            gdjVar2.getClass();
            tcj tcjVar = (tcj) this.receiver;
            bnh0 bnh0Var = tcjVar.e;
            ku90<fdj> ku90Var = tcjVar.v;
            if (gdjVar2 instanceof gdj.b) {
                ku90Var.a(fdj.b.a);
            } else if (gdjVar2 instanceof gdj.c) {
                ku90Var.a(new fdj.d(tcjVar.x1().f.a.b, ((gdj.c) gdjVar2).a));
            } else if (gdjVar2 instanceof gdj.d) {
                ku90Var.a(new fdj.c(bnh0Var.c(new String[]{"help"}, u.a("source", "gp"), "/about/privacy-policy")));
            } else if (gdjVar2 instanceof gdj.e) {
                ku90Var.a(new fdj.c(bnh0Var.c(new String[]{"help"}, u.a("source", "gp"), "/about/terms-and-conditions")));
            } else if (gdjVar2 instanceof gdj.a) {
                ku90Var.a(fdj.a.a);
            } else {
                if (gdjVar2 instanceof gdj.f) {
                    tcjVar.d.a(ts40.c0.a, k00.c);
                    String str = tcjVar.x1().f.a.b;
                    if (tcjVar.b.E() && !kotlin.text.c.u(str, "0", false) && str.length() < ((gdj.f) gdjVar2).a) {
                        tcjVar.y1(jdj.a(tcjVar.x1(), ijf0.b(tcjVar.x1().f, "0".concat(str), 0L, 6), null, null, null, 479));
                    }
                    if (tcjVar.c.isConnected()) {
                        kzh.d(new g1i(new xzh(bm50.a(new qcj(tcjVar.a.a(tcjVar.x1().f.a.b))), new rcj(2, null)), new scj(tcjVar, null)), o8i0.d(tcjVar));
                    } else {
                        jdj jdjVarX1 = tcjVar.x1();
                        StringUiText stringUiText = vch0.a;
                        tcjVar.y1(jdj.a(jdjVarX1, null, null, null, new zs00.a(new ResourceUiText(R.string.common_feedback__please_check_your_internet_connection_and_try_again)), 255));
                        tcjVar.A1();
                    }
                } else if (gdjVar2 instanceof gdj.i) {
                    ijf0 ijf0Var = ((gdj.i) gdjVar2).a;
                    String str2 = ijf0Var.a.b;
                    StringBuilder sb = new StringBuilder();
                    int length = str2.length();
                    for (int i = 0; i < length; i++) {
                        char cCharAt = str2.charAt(i);
                        if (Character.isDigit(cCharAt)) {
                            sb.append(cCharAt);
                        }
                    }
                    tcjVar.y1(jdj.a(tcjVar.x1(), ijf0.b(ijf0Var, sb.toString(), 0L, 6), null, null, zs00.b.a, 223));
                    tcjVar.A1();
                } else if (gdjVar2 instanceof gdj.h) {
                    iej iejVar = tcjVar.x1().g;
                    iej.b bVar = (iej.b) (iejVar instanceof iej.b ? iejVar : null);
                    if (bVar != null) {
                        tcjVar.y1(jdj.a(tcjVar.x1(), null, new iej.b(((gdj.h) gdjVar2).a, bVar.b), null, null, 447));
                        tcjVar.A1();
                    }
                } else {
                    if (!(gdjVar2 instanceof gdj.g)) {
                        uhc.a();
                        return null;
                    }
                    iej iejVar2 = tcjVar.x1().g;
                    iej.b bVar2 = (iej.b) (iejVar2 instanceof iej.b ? iejVar2 : null);
                    if (bVar2 != null) {
                        tcjVar.y1(jdj.a(tcjVar.x1(), null, new iej.b(bVar2.a, ((gdj.g) gdjVar2).a), null, null, 447));
                        tcjVar.A1();
                    }
                }
            }
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<Fragment> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ybj.this;
        }
    }

    public static final class d extends qlr implements Function0<w8i0> {
        public final /* synthetic */ c a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.a = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class e extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class f extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
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

    public static final class g extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ybj.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ybj() {
        this.z = false;
        this.A = false;
        ttr ttrVarA = hwr.a(a1s.c, new d(new c()));
        this.B = new q8i0(jq40.a(tcj.class), new e(ttrVarA), new g(ttrVarA), new f(ttrVarA));
        this.D = "GHAccountRegisterFragment";
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getB() {
        return this.D;
    }

    @Override // defpackage.m12, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        s9s lifecycle = getLifecycle();
        rx40 rx40Var = this.C;
        if (rx40Var != null) {
            lifecycle.a(rx40Var);
        } else {
            Intrinsics.n("registrationStartedHelper");
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        g1i g1iVar = new g1i(((tcj) this.B.getValue()).w, new a(2, this, ybj.class, "consumeAction", "consumeAction(Lcom/sportybet/android/account/ghaccount/register/GHRegisterAction;)V", 4));
        s9s lifecycle = getViewLifecycleOwner().getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(1380988016, new Function2() { // from class: wbj
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final ybj ybjVar = this.a;
                    or0.a(null, false, false, null, pp8.b(1415317767, new Function2() { // from class: xbj
                        /* JADX WARN: Multi-variable type inference failed */
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            q8i0 q8i0Var = ybjVar.B;
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                jdj jdjVar = (jdj) wyh.c(((tcj) q8i0Var.getValue()).f, aVar2, 0, 7).getValue();
                                tcj tcjVar = (tcj) q8i0Var.getValue();
                                boolean zA = aVar2.A(tcjVar);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    ybj.b bVar = new ybj.b(1, tcjVar, tcj.class, "handleEvent", "handleEvent(Lcom/sportybet/android/account/ghaccount/register/GHRegisterEvent;)V", 0);
                                    aVar2.r(bVar);
                                    objY = bVar;
                                }
                                pcj.a(jdjVar, (Function1) ((chp) objY), aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        s9s lifecycle = getLifecycle();
        rx40 rx40Var = this.C;
        if (rx40Var != null) {
            lifecycle.d(rx40Var);
        } else {
            Intrinsics.n("registrationStartedHelper");
            throw null;
        }
    }
}
