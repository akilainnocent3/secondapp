package defpackage;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.a;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import com.sporty.android.core.model.patron.UserCertConstants;
import com.sportybet.android.gp.tz.R;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lrqa;", "Lyq0;", "Lk9j;", "Lj9j;", "<init>", "()V", "africa-bet-android"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class rqa extends gpl implements k9j, j9j {
    public static final /* synthetic */ ohp<Object>[] z = {new d630(0, rqa.class, "binding", "getBinding()Lcom/sportybet/android/databinding/DialogConfirmAccountInfoBinding;")};
    public final i6i0 f = g5e.a(a.a);
    public Function0<Unit> i;
    public Function0<Unit> v;
    public final q8i0 w;
    public final String y;

    public static final /* synthetic */ class a extends saj implements Function1<View, dje> {
        public static final a a = new a(1, dje.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/android/databinding/DialogConfirmAccountInfoBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final dje invoke(View view) {
            View view2 = view;
            view2.getClass();
            ComposeView composeView = (ComposeView) h5e.a(R.id.confirm_account_info_dialog, view2);
            if (composeView != null) {
                return new dje((ConstraintLayout) view2, composeView);
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(R.id.confirm_account_info_dialog)));
            return null;
        }
    }

    public static final class b extends qlr implements Function0<Fragment> {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Fragment invoke() {
            return rqa.this;
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
            return (ielVar == null || (defaultViewModelProviderFactory = ielVar.getDefaultViewModelProviderFactory()) == null) ? rqa.this.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }
    }

    public rqa() {
        ttr ttrVarA = hwr.a(a1s.c, new c(new b()));
        this.w = new q8i0(jq40.a(ara.class), new d(ttrVarA), new f(ttrVarA), new e(ttrVarA));
        this.y = "ConfirmNameDialog";
    }

    @Override // defpackage.j9j
    /* JADX INFO: renamed from: getName, reason: from getter */
    public final String getY() {
        return this.y;
    }

    public final void m0() {
        androidx.fragment.app.e activity;
        androidx.fragment.app.e activity2;
        if (!isAdded() || (activity = getActivity()) == null || activity.isFinishing() || (activity2 = getActivity()) == null || activity2.isDestroyed()) {
            return;
        }
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        rqa rqaVar;
        super.onDestroyView();
        WeakReference<rqa> weakReference = sta.b;
        if (weakReference != null && (rqaVar = weakReference.get()) != null && rqaVar.isAdded() && !rqaVar.requireActivity().isFinishing()) {
            rqaVar.dismissAllowingStateLoss();
        }
        sta.c = false;
        sta.b = null;
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        rqa rqaVar;
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        WeakReference<rqa> weakReference = sta.b;
        if (weakReference != null && (rqaVar = weakReference.get()) != null && rqaVar.isAdded() && !rqaVar.requireActivity().isFinishing()) {
            rqaVar.dismissAllowingStateLoss();
        }
        sta.c = false;
        sta.b = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        Bundle arguments = getArguments();
        Integer numValueOf = arguments != null ? Integer.valueOf(arguments.getInt(UserCertConstants.CONFIRM_NAME_USAGE, 10)) : null;
        if (numValueOf != null && numValueOf.intValue() == 10) {
            g6i0 g6i0VarA = this.f.a(this, z[0]);
            g6i0VarA.getClass();
            mla.i(((dje) g6i0VarA).b, new op8(30322032, new Function2() { // from class: pqa
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String string;
                    a aVar = (a) obj;
                    int iIntValue = ((Integer) obj2).intValue();
                    ohp<Object>[] ohpVarArr = rqa.z;
                    int i = 0;
                    int i2 = 1;
                    if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                        rqa rqaVar = this.a;
                        Bundle arguments2 = rqaVar.getArguments();
                        Object obj3 = null;
                        if (arguments2 != null && (string = arguments2.getString("extra_dialog_variant")) != null) {
                            for (Object obj4 : xcj.d) {
                                if (((xcj) obj4).a.equals(string)) {
                                    obj3 = obj4;
                                    break;
                                }
                            }
                            obj3 = (xcj) obj3;
                        }
                        Bundle arguments3 = rqaVar.getArguments();
                        boolean z2 = arguments3 != null ? arguments3.getBoolean("extra_dialog_cancelable", true) : true;
                        ara araVar = (ara) rqaVar.w.getValue();
                        boolean zA = aVar.A(araVar);
                        Object objY = aVar.y();
                        a.C0041a.C0042a c0042a = a.C0041a.a;
                        if (zA || objY == c0042a) {
                            sqa sqaVar = new sqa(2, araVar, ara.class, "sendGHEvent", "sendGHEvent(Lcom/sporty/android/common_analytics/sportytracking/model/event/SportyTrackingEvent;[Lcom/sporty/android/common_analytics/model/AnalyticsPlatform;)V", 2);
                            aVar.r(sqaVar);
                            objY = sqaVar;
                        }
                        Function2 function2 = (Function2) objY;
                        boolean zA2 = aVar.A(rqaVar);
                        Object objY2 = aVar.y();
                        if (zA2 || objY2 == c0042a) {
                            objY2 = new qqa(rqaVar, i);
                            aVar.r(objY2);
                        }
                        Function0 function0 = (Function0) objY2;
                        boolean zA3 = aVar.A(rqaVar);
                        Object objY3 = aVar.y();
                        if (zA3 || objY3 == c0042a) {
                            objY3 = new tl6(rqaVar, i2);
                            aVar.r(objY3);
                        }
                        zqa.a(function2, obj3, z2, function0, (Function0) objY3, aVar, 0);
                    } else {
                        aVar.G();
                    }
                    return Unit.a;
                }
            }, true));
        }
    }
}
