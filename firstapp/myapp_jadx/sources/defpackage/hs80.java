package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.commons.remote.model.HTTPResponse;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class hs80 implements Function1 {
    public final /* synthetic */ ns80 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        final ns80 ns80Var = this.a;
        ibs ibsVar = ns80Var.b;
        y720 y720Var = ns80Var.a;
        LoadingState loadingState = (LoadingState) obj;
        int i = ns80.a.a[loadingState.getStatus().ordinal()];
        if (i == 1) {
            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
            if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                RecyclerView recyclerView = ns80Var.b().z;
                ns80Var.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                Context context = ns80Var.getContext();
                context.getClass();
                ns80Var.e = new q54(list, context, ns80Var.a, ns80Var.b, ns80Var);
                ns80Var.b().z.setAdapter(ns80Var.e);
            }
            y720Var.e.l(ibsVar);
        } else if (i != 2) {
            if (i != 3) {
                uhc.a();
                return null;
            }
            y720Var.e.l(ibsVar);
            if (ns80Var.getContext() != null) {
                vs80 vs80Var = vs80.b;
                Context context2 = ns80Var.getContext();
                context2.getClass();
                ResultWrapper.GenericError error = loadingState.getError();
                Function0 function0 = new Function0() { // from class: js80
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        ns80Var.dismiss();
                        return Unit.a;
                    }
                };
                ls80 ls80Var = new ls80();
                ms80 ms80Var = new ms80();
                ns80Var.getContext().getColor(R.color.try_again_color);
                vs80Var.c(context2, error, function0, ls80Var, ms80Var, 0, (640 & 128) != 0 ? new mm60() : null, (640 & 512) != 0 ? new xvj(2) : null);
                ns80Var.dismiss();
            }
        }
        return Unit.a;
    }
}
