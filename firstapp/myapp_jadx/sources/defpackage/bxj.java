package defpackage;

import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.Status;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class bxj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ l12 b;

    public /* synthetic */ bxj(l12 l12Var, int i) {
        this.a = i;
        this.b = l12Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        FragmentManager supportFragmentManager;
        int i = this.a;
        l12 l12Var = this.b;
        switch (i) {
            case 0:
                oxj oxjVar = (oxj) l12Var;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState.getStatus() == Status.SUCCESS) {
                    op5 op5Var = op5.a;
                    List<? extends File> list = (List) loadingState.getData();
                    op5Var.getClass();
                    op5.b = list;
                    oxjVar.A = (List) loadingState.getData();
                    oxjVar.t0();
                    q3t q3tVar = (q3t) oxjVar.b;
                    op5.r(op5Var, b.f(q3tVar != null ? q3tVar.e.i : null, q3tVar != null ? q3tVar.e.w : null), null, 6);
                } else if (loadingState.getStatus() == Status.FAILED) {
                    oxjVar.t0();
                }
                break;
            default:
                b8b0 b8b0Var = (b8b0) l12Var;
                if (((Boolean) obj).booleanValue()) {
                    b8b0Var.r0();
                    e activity = b8b0Var.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        supportFragmentManager.Y();
                    }
                } else {
                    b8b0Var.r0();
                    e activity2 = b8b0Var.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                break;
        }
        return Unit.a;
    }
}
