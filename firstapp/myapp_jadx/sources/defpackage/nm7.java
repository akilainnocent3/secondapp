package defpackage;

import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.google.android.material.snackbar.Snackbar;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.luBk.Chyeyik;

/* JADX INFO: loaded from: classes2.dex */
@c0d(c = "com.sportybet.android.choosebet.presentation.ChooseBetActivity$initViewModel$5", f = "ChooseBetActivity.kt", l = {}, m = "invokeSuspend", v = 2)
public final class nm7 extends tje0 implements Function2<Unit, v1b<? super Unit>, Object> {
    public final /* synthetic */ ChooseBetActivity a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm7(ChooseBetActivity chooseBetActivity, v1b<? super nm7> v1bVar) {
        super(2, v1bVar);
        this.a = chooseBetActivity;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new nm7(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Unit unit, v1b<? super Unit> v1bVar) {
        return ((nm7) create(unit, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        BaseTransientBottomBar.SnackbarBaseLayout snackbarBaseLayout;
        TextView textView;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = ChooseBetActivity.y;
        ChooseBetActivity chooseBetActivity = this.a;
        zfd0 zfd0Var = chooseBetActivity.b;
        if (zfd0Var == null) {
            Intrinsics.n(Chyeyik.BHZ);
            throw null;
        }
        ConstraintLayout constraintLayout = zfd0Var.a;
        constraintLayout.getClass();
        h3a0 h3a0Var = new h3a0(constraintLayout);
        String cMSString = chooseBetActivity.getCMSString(R.string.personal_page__published_on_sportysocial, new Object[0]);
        cMSString.getClass();
        h3a0Var.b = cMSString;
        h3a0Var.c = chooseBetActivity.getCMSString(R.string.common_functions__view, new Object[0]);
        h3a0Var.d = new fm7(chooseBetActivity, 0);
        Snackbar snackbarB = h3a0Var.b(chooseBetActivity, 12.0f, 17.0f);
        if (snackbarB != null && (snackbarBaseLayout = snackbarB.i) != null && (textView = (TextView) snackbarBaseLayout.findViewById(R.id.snackbar_action)) != null) {
            textView.setAllCaps(false);
        }
        if (snackbarB != null) {
            snackbarB.k = 0;
        }
        if (snackbarB != null) {
            snackbarB.j();
        }
        return Unit.a;
    }
}
