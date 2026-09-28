package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.e;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportygames.commons.remote.model.LoadingState;
import com.sportygames.commons.remote.model.ResultWrapper;
import com.sportygames.commons.remote.model.Status;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class g7j implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g7j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) throws Throwable {
        FragmentManager supportFragmentManager;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                u6j u6jVar = (u6j) obj2;
                LoadingState loadingState = (LoadingState) obj;
                if (loadingState == null) {
                    return Unit.a;
                }
                if (loadingState.getStatus() == Status.RUNNING) {
                    u6jVar.Y0(true);
                } else {
                    u6jVar.Y0(false);
                }
                Status status = loadingState.getStatus();
                ResultWrapper.GenericError error = loadingState.getError();
                status.getClass();
                int i2 = n2j.a.a[status.ordinal()];
                if (i2 == 1) {
                    u6jVar.n0(new z0j(u6jVar, error));
                } else if (i2 == 3) {
                    u6jVar.j0();
                    u6jVar.F0();
                    Unit unit = Unit.a;
                }
                return Unit.a;
            case 1:
                Bundle bundle = (Bundle) obj;
                bundle.getClass();
                hjx hjxVar = new hjx((Context) obj2);
                igx igxVar = hjxVar.b;
                igxVar.t.a(new sga());
                igxVar.t.a(new vle());
                hjxVar.n(bundle);
                return hjxVar;
            case 2:
                zy10 zy10Var = (zy10) obj2;
                if (((Boolean) obj).booleanValue()) {
                    zy10Var.N0();
                    e activity = zy10Var.getActivity();
                    if (activity != null && (supportFragmentManager = activity.getSupportFragmentManager()) != null) {
                        supportFragmentManager.Y();
                    }
                } else {
                    e activity2 = zy10Var.getActivity();
                    if (activity2 != null) {
                        activity2.finish();
                    }
                }
                return Unit.a;
            default:
                ((eoa0) obj2).c.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                return Unit.a;
        }
    }
}
