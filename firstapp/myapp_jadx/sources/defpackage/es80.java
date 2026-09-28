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

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class es80 implements Function1 {
    public final /* synthetic */ os80 a;

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List list;
        final os80 os80Var = this.a;
        ibs ibsVar = os80Var.b;
        c28 c28Var = os80Var.a;
        LoadingState loadingState = (LoadingState) obj;
        int i = os80.a.a[loadingState.getStatus().ordinal()];
        if (i == 1) {
            HTTPResponse hTTPResponse = (HTTPResponse) loadingState.getData();
            if (hTTPResponse != null && (list = (List) hTTPResponse.getData()) != null) {
                RecyclerView recyclerView = os80Var.b().z;
                os80Var.getContext();
                recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
                Context context = os80Var.getContext();
                context.getClass();
                os80Var.e = new r54(list, context, os80Var.a, os80Var.b, os80Var);
                os80Var.b().z.setAdapter(os80Var.e);
            }
            c28Var.f.l(ibsVar);
        } else if (i != 2) {
            if (i != 3) {
                uhc.a();
                return null;
            }
            c28Var.f.l(ibsVar);
            if (os80Var.getContext() != null) {
                us80 us80Var = us80.d;
                Context context2 = os80Var.getContext();
                context2.getClass();
                ResultWrapper.GenericError error = loadingState.getError();
                Function0 function0 = new Function0() { // from class: gs80
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        os80Var.dismiss();
                        return Unit.a;
                    }
                };
                is80 is80Var = new is80();
                ks80 ks80Var = new ks80();
                os80Var.getContext().getColor(R.color.try_again_color);
                us80Var.c(context2, error, function0, is80Var, ks80Var, 0, (1024 & 128) != 0 ? new ita(1) : null, (1024 & 512) != 0 ? new pm60() : null, new qm60());
                os80Var.dismiss();
            }
        }
        return Unit.a;
    }
}
