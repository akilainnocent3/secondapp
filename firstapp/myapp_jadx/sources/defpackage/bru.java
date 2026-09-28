package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.data.SwipeBetOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class bru implements View.OnClickListener {
    public final /* synthetic */ SwipeBetOptions a;
    public final /* synthetic */ cru.a b;
    public final /* synthetic */ cru c;

    public bru(cru cruVar, SwipeBetOptions swipeBetOptions, cru.a aVar) {
        this.c = cruVar;
        this.a = swipeBetOptions;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SwipeBetOptions swipeBetOptions = this.a;
        swipeBetOptions.isPreferred = !swipeBetOptions.isPreferred;
        cru cruVar = this.c;
        ble0 ble0Var = cruVar.a;
        ble0Var.getClass();
        boolean z = swipeBetOptions.isPreferred;
        ArrayList arrayList = ble0Var.e;
        if (z) {
            arrayList.add(swipeBetOptions);
        } else {
            arrayList.remove(swipeBetOptions);
        }
        cruVar.notifyItemChanged(this.b.getBindingAdapterPosition());
    }
}
