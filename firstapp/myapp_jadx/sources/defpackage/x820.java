package defpackage;

import android.view.View;
import com.sportygames.commons.models.enums.GiftUseType;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x820 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x820(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((a920) obj).dismiss();
                return;
            default:
                ij60 ij60Var = (ij60) obj;
                xi60.a aVar = ij60Var.d;
                if (aVar == null) {
                    Intrinsics.n("dataItem");
                    throw null;
                }
                aVar.o = 1;
                ij60Var.i(GiftUseType.PARTIAL);
                if (ij60Var.b.w.isEnabled()) {
                    ij60Var.a();
                    ij60Var.h();
                    return;
                }
                return;
        }
    }
}
