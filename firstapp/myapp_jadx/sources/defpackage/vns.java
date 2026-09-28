package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lvns;", "Lh7v;", "<init>", "()V", "Lwkk;", "state", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class vns extends sul {
    public final q8i0 f = new q8i0(jq40.a(zns.class), new b(), new d(), new c());

    @c0d(c = "com.sportybet.plugin.lgg.LiveGiftGrabInfoDialog$onCreateView$1", f = "LiveGiftGrabInfoDialog.kt", l = {}, m = "invokeSuspend", v = 2)
    public static final class a extends tje0 implements Function2<UiText, v1b<? super Unit>, Object> {
        public /* synthetic */ Object a;

        public a(v1b<? super a> v1bVar) {
            super(2, v1bVar);
        }

        @Override // defpackage.pz1
        public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
            a aVar = vns.this.new a(v1bVar);
            aVar.a = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(UiText uiText, v1b<? super Unit> v1bVar) {
            return ((a) create(uiText, v1bVar)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.pz1
        public final Object invokeSuspend(Object obj) {
            UiText uiText = (UiText) this.a;
            y5b y5bVar = y5b.a;
            uj50.b(obj);
            vns vnsVar = vns.this;
            Context contextRequireContext = vnsVar.requireContext();
            Context contextRequireContext2 = vnsVar.requireContext();
            contextRequireContext2.getClass();
            Toast.makeText(contextRequireContext, uiText.e(contextRequireContext2), 0).show();
            vnsVar.dismissAllowingStateLoss();
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<v8i0> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return vns.this.requireActivity().getViewModelStore();
        }
    }

    public static final class c extends qlr implements Function0<cyb> {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final cyb invoke() {
            return vns.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    public static final class d extends qlr implements Function0<r8i0.c> {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            return vns.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String string;
        String string2;
        layoutInflater.getClass();
        q8i0 q8i0Var = this.f;
        g1i g1iVar = new g1i(((zns) q8i0Var.getValue()).e, new a(null));
        s9s lifecycle = getLifecycle();
        lifecycle.getClass();
        arr.a(g1iVar, lifecycle, s9s.b.d);
        Bundle arguments = getArguments();
        String str = "";
        if (arguments == null || (string = arguments.getString("key - tournament id")) == null) {
            string = "";
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null && (string2 = arguments2.getString("key - event id")) != null) {
            str = string2;
        }
        zns znsVar = (zns) q8i0Var.getValue();
        if (((wkk) znsVar.c.a(znsVar, zns.f[0])) instanceof wkk.a) {
            kzh.d(new g1i(bm50.a(new xns(znsVar.a.d(string, str))), new yns(znsVar, null)), o8i0.d(znsVar));
        }
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        composeView.setContent(new op8(-9718538, new Function2() { // from class: sns
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final vns vnsVar = this.a;
                    or0.a(null, false, false, null, pp8.b(-1078076467, new Function2() { // from class: tns
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                vns vnsVar2 = vnsVar;
                                wkk wkkVar = (wkk) wyh.c(((zns) vnsVar2.f.getValue()).b, aVar2, 0, 7).getValue();
                                boolean zA = aVar2.A(vnsVar2);
                                Object objY = aVar2.y();
                                if (zA || objY == a.C0041a.a) {
                                    objY = new uns(vnsVar2, i);
                                    aVar2.r(objY);
                                }
                                vkk.b(wkkVar, (Function0) objY, aVar2, 0);
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
}
