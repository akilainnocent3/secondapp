package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sportybet.plugin.realsports.data.GiftGrabGiftValue;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lckk;", "Lh7v;", "<init>", "()V", "Lcmk;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class ckk extends krl {
    public fbh0 f;
    public final q8i0 i;
    public final q8i0 v;

    @c0d(c = "com.sportybet.plugin.lgg.confirm.GiftGrabConfirmDialog$onCreateView$1", f = "GiftGrabConfirmDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<zjk, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = ckk.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(zjk zjkVar, v1b<? super Unit> v1bVar) {
            return ((a) create(zjkVar, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            zjk zjkVar = (zjk) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            boolean z = zjkVar instanceof zjk.b;
            ckk ckkVar = ckk.this;
            if (z) {
                ckkVar.dismissAllowingStateLoss();
            } else {
                if (!(zjkVar instanceof zjk.a)) {
                    uhc.a();
                    return null;
                }
                fbh0 fbh0Var = ckkVar.f;
                if (fbh0Var == null) {
                    Intrinsics.n("uiRouterManager");
                    throw null;
                }
                fbh0Var.e(o7d.a(wae.ME_GIFTS));
                ckkVar.dismissAllowingStateLoss();
            }
            return Unit.a;
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<jkk, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(jkk jkkVar) {
            jkk jkkVar2 = jkkVar;
            jkkVar2.getClass();
            gkk gkkVar = (gkk) this.receiver;
            ku90<zjk> ku90Var = gkkVar.i;
            if (jkkVar2 instanceof jkk.c) {
                kzh.d(new g1i(bm50.a(new ekk(gkkVar.a.b(gkkVar.b, gkkVar.c))), new fkk(gkkVar, null)), o8i0.d(gkkVar));
            } else if (jkkVar2 instanceof jkk.a) {
                ku90Var.a(zjk.b.a);
            } else {
                if (!(jkkVar2 instanceof jkk.b)) {
                    uhc.a();
                    return null;
                }
                ku90Var.a(zjk.a.a);
            }
            return Unit.a;
        }
    }

    public static final class c extends qlr implements Function0<v8i0> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ckk.this.requireActivity().getViewModelStore();
        }
    }

    public static final class d extends qlr implements Function0<cyb> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return ckk.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class e extends qlr implements Function0<r8i0.c> {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return ckk.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    public static final class f extends qlr implements Function0<Fragment> {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return ckk.this;
        }
    }

    public static final class g extends qlr implements Function0<w8i0> {
        public final /* synthetic */ f a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.a = fVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class h extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class i extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(ttr ttrVar) {
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

    public static final class j extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? ckk.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public ckk() {
        ttr ttrVarA = hwr.a(a1s.c, new g(new f()));
        this.i = new q8i0(jq40.a(gkk.class), new h(ttrVarA), new j(ttrVarA), new i(ttrVarA));
        this.v = new q8i0(jq40.a(hmk.class), new c(), new e(), new d());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        GiftGrabGiftValue giftGrabGiftValue;
        String string;
        String string2;
        layoutInflater.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                giftGrabGiftValue = (GiftGrabGiftValue) arguments.getParcelable("key gift value", GiftGrabGiftValue.class);
            } else {
                giftGrabGiftValue = null;
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                giftGrabGiftValue = (GiftGrabGiftValue) arguments2.getParcelable("key gift value");
            } else {
                giftGrabGiftValue = null;
            }
        }
        String str = "";
        if (giftGrabGiftValue == null) {
            giftGrabGiftValue = new GiftGrabGiftValue(0L, "", false);
        }
        q8i0 q8i0Var = this.i;
        gkk gkkVar = (gkk) q8i0Var.getValue();
        Bundle arguments3 = getArguments();
        if (arguments3 == null || (string = arguments3.getString("key tournament id", "")) == null) {
            string = "";
        }
        Bundle arguments4 = getArguments();
        if (arguments4 != null && (string2 = arguments4.getString("key event id", "")) != null) {
            str = string2;
        }
        hmk hmkVar = (hmk) this.v.getValue();
        gkkVar.b = string;
        gkkVar.c = str;
        gkkVar.d = hmkVar;
        gkkVar.f.b(gkkVar, gkk.w[0], new cmk.b(4, bjb0.U(giftGrabGiftValue.getAmount(), Locale.US), giftGrabGiftValue.getCurrency(), giftGrabGiftValue.getBlockedCashOut()));
        g1i g1iVar = new g1i(((gkk) q8i0Var.getValue()).v, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-203581548, new Function2() { // from class: akk
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    or0.a(null, false, false, null, pp8.b(1222050091, new bkk(this.a, i2), aVar), aVar, 24576);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
