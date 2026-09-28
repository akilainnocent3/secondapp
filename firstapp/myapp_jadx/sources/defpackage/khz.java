package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.result.ActivityResult;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.tracking.AnalyticsParam;
import com.sportybet.android.globalpay.jumpbank.JumpBankActivity;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkhz;", "Luzz;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class khz extends xyl {
    public final q8i0 G;
    public final ee<Intent> H;

    public static final /* synthetic */ class a extends saj implements Function1<h000, Unit> {
        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(h000 h000Var) {
            h000 h000Var2 = h000Var;
            h000Var2.getClass();
            ((khz) this.receiver).n0(h000Var2);
            return Unit.a;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return khz.this;
        }
    }

    public static final class c extends qlr implements Function0<w8i0> {
        public final /* synthetic */ b a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar) {
            super(0);
            this.a = bVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final w8i0 invoke() {
            return (w8i0) this.a.invoke();
        }
    }

    public static final class d extends qlr implements Function0<v8i0> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(ttr ttrVar) {
            super(0);
            this.a = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final v8i0 invoke() {
            return ((w8i0) this.a.getValue()).getViewModelStore();
        }
    }

    public static final class e extends qlr implements Function0<cyb> {
        public final /* synthetic */ ttr a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(ttr ttrVar) {
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

    public static final class f extends qlr implements Function0<r8i0.c> {
        public final /* synthetic */ ttr b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(ttr ttrVar) {
            super(0);
            this.b = ttrVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final r8i0.c invoke() {
            r8i0.c defaultViewModelProviderFactory;
            w8i0 w8i0Var = (w8i0) this.b.getValue();
            iel ielVar = w8i0Var instanceof iel ? (iel) w8i0Var : null;
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? khz.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public khz() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.G = new q8i0(jq40.a(hjz.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        ee<Intent> eeVarRegisterForActivityResult = registerForActivityResult(new ce(), new ud() { // from class: hhz
            @Override // defpackage.ud
            public final void a(Object obj) {
                String stringExtra;
                Object next;
                Object value;
                Object value2;
                ActivityResult activityResult = (ActivityResult) obj;
                activityResult.getClass();
                Intent intent = activityResult.b;
                if (intent == null || (stringExtra = intent.getStringExtra(AnalyticsParam.EVENT_STATUS)) == null) {
                    return;
                }
                kjz.b.getClass();
                Iterator<T> it = kjz.e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    int i = ((kjz) next).a;
                    Integer intOrNull = StringsKt.toIntOrNull(stringExtra);
                    if (intOrNull != null && i == intOrNull.intValue()) {
                        break;
                    }
                }
                kjz kjzVar = (kjz) next;
                if (kjzVar == null) {
                    kjzVar = kjz.FAIL;
                }
                hjz hjzVar = (hjz) this.a.G.getValue();
                String stringExtra2 = intent.getStringExtra("amount");
                String stringExtra3 = intent.getStringExtra("feeAmount");
                wwd0 wwd0Var = hjzVar.b0;
                int iOrdinal = kjzVar.ordinal();
                if (iOrdinal == 0) {
                    hjzVar.J.d.a(new snd(0), k00.c, k00.d);
                    do {
                        value = wwd0Var.getValue();
                    } while (!wwd0Var.g(value, eiz.a((eiz) value, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, true, false, 196607)));
                } else if (iOrdinal == 1) {
                    hjzVar.z2();
                    wrd.B2(hjzVar, stringExtra2, null, null, hjzVar.Z.getPhoneNumber(), stringExtra3 != null ? hjzVar.a0.b(stringExtra3, false) : null, 14);
                } else if (iOrdinal != 2) {
                    uhc.a();
                } else {
                    do {
                        value2 = wwd0Var.getValue();
                    } while (!wwd0Var.g(value2, eiz.a((eiz) value2, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, false, true, 131071)));
                }
            }
        });
        eeVarRegisterForActivityResult.getClass();
        this.H = eeVarRegisterForActivityResult;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        final ComposeView composeView = new ComposeView(contextRequireContext, null, 6, 0);
        mla.i(composeView, new op8(1500443657, new Function2() { // from class: ihz
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final khz khzVar = this.a;
                    hjz hjzVar = (hjz) khzVar.G.getValue();
                    boolean zA = aVar.A(khzVar);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zA || objY == c0042a) {
                        khz.a aVar2 = new khz.a(1, khzVar, khz.class, "processSideEffect", "processSideEffect(Lcom/sportybet/android/globalpay/base/PayBaseSideEffect;)V", 0);
                        aVar.r(aVar2);
                        objY = aVar2;
                    }
                    Function1 function1 = (Function1) ((chp) objY);
                    final ComposeView composeView2 = composeView;
                    boolean zA2 = aVar.A(composeView2) | aVar.A(khzVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new Function1() { // from class: jhz
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj3) {
                                String str = (String) obj3;
                                str.getClass();
                                Intent intent = new Intent(composeView2.getContext(), (Class<?>) JumpBankActivity.class);
                                intent.putExtra("JUMP_URL", str);
                                khzVar.H.b(intent);
                                return Unit.a;
                            }
                        };
                        aVar.r(objY2);
                    }
                    ciz.b(hjzVar, function1, (Function1) objY2, aVar, 8);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
        return composeView;
    }
}
