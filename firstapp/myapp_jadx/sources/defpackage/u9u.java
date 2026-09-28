package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lu9u;", "Lyq0;", "<init>", "()V", "sportyplatform"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class u9u extends ewl {
    public rdd0 f;
    public rym i;
    public o51 v;

    @Override // defpackage.yq0, androidx.fragment.app.d
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialogOnCreateDialog = super.onCreateDialog(bundle);
        setCancelable(false);
        dialogOnCreateDialog.getClass();
        return dialogOnCreateDialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle arguments;
        layoutInflater.getClass();
        Bundle arguments2 = getArguments();
        final Integer numValueOf = (arguments2 == null || !arguments2.containsKey("KEY_LW_TYPE") || (arguments = getArguments()) == null) ? null : Integer.valueOf(arguments.getInt("KEY_LW_TYPE"));
        rdd0 rdd0Var = this.f;
        if (rdd0Var == null) {
            Intrinsics.n("sportyTrackingUseCase");
            throw null;
        }
        rdd0Var.a(mbu.a, k00.d);
        Context contextRequireContext = requireContext();
        contextRequireContext.getClass();
        return mla.a(contextRequireContext, new op8(-380812337, new Function2() { // from class: r9u
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = 0;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    u9u u9uVar = this.a;
                    boolean zA = aVar.A(u9uVar);
                    Integer num = numValueOf;
                    boolean zM = zA | aVar.M(num);
                    Object objY = aVar.y();
                    a.C0041a.C0042a c0042a = a.C0041a.a;
                    if (zM || objY == c0042a) {
                        objY = new s9u(i, u9uVar, num);
                        aVar.r(objY);
                    }
                    Function0 function0 = (Function0) objY;
                    boolean zA2 = aVar.A(u9uVar);
                    Object objY2 = aVar.y();
                    if (zA2 || objY2 == c0042a) {
                        objY2 = new t9u(u9uVar, i);
                        aVar.r(objY2);
                    }
                    w9u.a(function0, (Function0) objY2, aVar, 0);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        String string;
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        o51 o51Var = this.v;
        if (o51Var != null) {
            o51Var.invoke();
            this.v = null;
            return;
        }
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("queue_key")) == null) {
            return;
        }
        rym rymVar = this.i;
        if (rymVar != null) {
            rymVar.c(string);
        } else {
            Intrinsics.n("popupQueueManager");
            throw null;
        }
    }
}
