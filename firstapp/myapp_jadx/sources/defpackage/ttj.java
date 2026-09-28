package defpackage;

import androidx.compose.ui.platform.ComposeView;
import com.sporty.android.core.model.tracking.AnalyticsEvent;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class ttj implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ttj(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Object value;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((fuj) obj2).f.j(AnalyticsEvent.BI_TRACKING_KIND_ERROR);
                return Unit.a;
            case 1:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj2;
                Boolean bool = (Boolean) obj;
                ComposeView composeView = preMatchEventActivity.o0;
                if (composeView == null) {
                    return Unit.a;
                }
                boolean z = composeView.getVisibility() == 0;
                boolean zG = Intrinsics.g(bool, Boolean.TRUE);
                composeView.setVisibility(zG ? 0 : 8);
                if (!zG) {
                    preMatchEventActivity.p0 = false;
                    return Unit.a;
                }
                if (!z) {
                    y1k0 y1k0Var = preMatchEventActivity.e;
                    if (y1k0Var == null) {
                        Intrinsics.n("worldCupPassBannerStateProvider");
                        throw null;
                    }
                    if (!Intrinsics.g(((v340) y1k0Var.getState()).a.getValue(), x1k0.a.a) && !preMatchEventActivity.p0) {
                        rdd0 rdd0Var = preMatchEventActivity.c;
                        if (rdd0Var == null) {
                            Intrinsics.n("sportyTrackingUseCase");
                            throw null;
                        }
                        rdd0Var.a(s2k0.z.a, k00.d);
                        preMatchEventActivity.p0 = true;
                    }
                }
                return Unit.a;
            default:
                ijf0 ijf0Var = (ijf0) obj;
                ijf0Var.getClass();
                wwd0 wwd0Var = ((gme0) obj2).b;
                do {
                    value = wwd0Var.getValue();
                } while (!wwd0Var.g(value, fme0.a((fme0) value, null, 0, ijf0Var, false, 23)));
                return Unit.a;
        }
    }
}
