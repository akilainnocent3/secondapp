package defpackage;

import android.view.View;
import com.sportybet.android.home.RestrictionActivity;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class lsd implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ lsd(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((usd) obj).P0().U1();
                return;
            default:
                RestrictionActivity restrictionActivity = (RestrictionActivity) obj;
                td tdVar = restrictionActivity.b;
                if (tdVar == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                tdVar.b.K();
                restrictionActivity.z1().y1();
                return;
        }
    }
}
