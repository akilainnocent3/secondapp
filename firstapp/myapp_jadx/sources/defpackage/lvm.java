package defpackage;

import android.view.View;
import com.sportybet.android.account.international.login.INTLoginFragment;
import com.sportybet.android.share.presentation.activity.ShareCodeActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lvm implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lvm(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                INTLoginFragment iNTLoginFragment = (INTLoginFragment) obj;
                num numVar = iNTLoginFragment.z;
                if (numVar == null) {
                    Intrinsics.n("localEvents");
                    throw null;
                }
                numVar.a(new jdt(jdt.a.b));
                iNTLoginFragment.requireActivity().finish();
                return;
            default:
                yrh0.e(((ShareCodeActivity) obj).K);
                return;
        }
    }
}
