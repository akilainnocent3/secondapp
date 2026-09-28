package defpackage;

import android.view.View;
import com.sportybet.plugin.realsports.data.SwipeBetOptions;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
public final class r2s implements View.OnClickListener {
    public final /* synthetic */ SwipeBetOptions a;
    public final /* synthetic */ s2s.a b;
    public final /* synthetic */ s2s c;

    public r2s(s2s s2sVar, SwipeBetOptions swipeBetOptions, s2s.a aVar) {
        this.c = s2sVar;
        this.a = swipeBetOptions;
        this.b = aVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        SwipeBetOptions swipeBetOptions = this.a;
        swipeBetOptions.isPreferred = !swipeBetOptions.isPreferred;
        s2s s2sVar = this.c;
        ble0 ble0Var = s2sVar.a;
        ble0Var.getClass();
        boolean z = swipeBetOptions.isPreferred;
        ArrayList arrayList = ble0Var.d;
        if (z) {
            arrayList.add(swipeBetOptions);
        } else {
            arrayList.remove(swipeBetOptions);
        }
        s2sVar.notifyItemChanged(this.b.getBindingAdapterPosition());
    }
}
