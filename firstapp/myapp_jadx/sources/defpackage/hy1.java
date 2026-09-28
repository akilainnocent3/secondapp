package defpackage;

import android.content.DialogInterface;
import androidx.appcompat.app.b;
import androidx.fragment.app.e;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes5.dex */
public abstract class hy1 extends m12 {
    public final void m0(int i, String str, int i2, DialogInterface.OnClickListener onClickListener) {
        e activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        b.a aVar = new b.a(activity);
        aVar.d(i);
        aVar.a.f = str;
        b bVarCreate = aVar.setPositiveButton(i2, onClickListener).setNegativeButton(R.string.common_functions__cancel, null).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void n0(String str) {
        e activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        b.a aVar = new b.a(activity);
        aVar.d(R.string.page_login__youre_temporarily_locked);
        aVar.a.f = str;
        b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, null).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void o0() {
        e activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        b.a aVar = new b.a(activity);
        aVar.a(R.string.common_feedback__something_went_wrong_please_try_again_later);
        b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, null).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }

    public final void p0() {
        e activity = getActivity();
        if (activity == null || activity.isFinishing()) {
            return;
        }
        b.a aVar = new b.a(activity);
        aVar.a(R.string.common_feedback__please_check_your_internet_connection_and_try_again);
        b bVarCreate = aVar.setPositiveButton(R.string.common_functions__ok, null).create();
        bVarCreate.setCanceledOnTouchOutside(false);
        bVarCreate.show();
    }
}
