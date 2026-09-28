package defpackage;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sportybet.android.gp.tz.R;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lasx;", "Lyq0;", "<init>", "()V", "a", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class asx extends yq0 {
    public final i6i0 a;
    public static final /* synthetic */ ohp<Object>[] c = {new d630(0, asx.class, "binding", "getBinding()Lcom/sportybet/feature/payment/impl/databinding/DialogNgAlertNameBindingBinding;")};
    public static final a b = new a();

    public static final class a {
        public static final void a(g72 g72Var, FragmentManager fragmentManager, String str, Bundle bundle) {
            bundle.getClass();
            AlertDialogCallbackType alertDialogCallbackType = Build.VERSION.SDK_INT >= 33 ? (AlertDialogCallbackType) bundle.getParcelable("RESULT_KEY_SHOW_NAME_BINDING_DIALOG", AlertDialogCallbackType.class) : (AlertDialogCallbackType) bundle.getParcelable("RESULT_KEY_SHOW_NAME_BINDING_DIALOG");
            if (alertDialogCallbackType == null) {
                alertDialogCallbackType = AlertDialogCallbackType.Cancel.a;
            }
            g72Var.invoke(alertDialogCallbackType);
            fragmentManager.g("REQUEST_KEY_SHOW_NAME_BINDING_DIALOG");
            fragmentManager.f("REQUEST_KEY_SHOW_NAME_BINDING_DIALOG");
        }
    }

    public static final /* synthetic */ class b extends saj implements Function1<View, xle> {
        public static final b a = new b(1, xle.class, "bind", "bind(Landroid/view/View;)Lcom/sportybet/feature/payment/impl/databinding/DialogNgAlertNameBindingBinding;", 0);

        @Override // kotlin.jvm.functions.Function1
        public final xle invoke(View view) {
            View view2 = view;
            view2.getClass();
            ComposeView composeView = (ComposeView) h5e.a(R.id.name_binding_dialog, view2);
            if (composeView != null) {
                return new xle((ConstraintLayout) view2, composeView);
            }
            bmy.a("Missing required view with ID: ".concat(view2.getResources().getResourceName(R.id.name_binding_dialog)));
            return null;
        }
    }

    public asx() {
        super(R.layout.dialog_ng_alert_name_binding);
        this.a = g5e.a(b.a);
    }

    public final void j0(AlertDialogCallbackType alertDialogCallbackType) {
        getParentFragmentManager().m0("REQUEST_KEY_SHOW_NAME_BINDING_DIALOG", vj5.a(new Pair("RESULT_KEY_SHOW_NAME_BINDING_DIALOG", alertDialogCallbackType)));
        dismissAllowingStateLoss();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        ((xle) this.a.a(this, c[0])).b.setContent(new op8(1968079337, new sfj(this), true));
    }
}
