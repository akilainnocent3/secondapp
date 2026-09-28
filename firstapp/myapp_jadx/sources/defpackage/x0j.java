package defpackage;

import android.view.Window;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class x0j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ x0j(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((n2j) obj).F0();
                return Unit.a;
            case 1:
                final LivePageActivity livePageActivity = (LivePageActivity) obj;
                jty jtyVar = livePageActivity.C;
                if (jtyVar != null) {
                    return jtyVar.a(gty.b, new ety() { // from class: kps
                        @Override // defpackage.ety
                        public final void a() {
                            gqs gqsVar;
                            avy avyVar = avy.a;
                            int i2 = LivePageActivity.b0;
                            djh0 djh0Var = livePageActivity.R;
                            if (djh0Var == null || (gqsVar = djh0Var.q) == null) {
                                return;
                            }
                            gqsVar.c(avyVar);
                        }
                    }, new rty() { // from class: lps
                        @Override // defpackage.rty
                        public final void a() {
                            int i2 = LivePageActivity.b0;
                            fty.a(livePageActivity.z1().e);
                        }
                    });
                }
                Intrinsics.n("oneUpPromoSurfacePresenterFactory");
                throw null;
            default:
                Window window = (Window) obj;
                if (window != null) {
                    window.setGravity(80);
                }
                return Unit.a;
        }
    }
}
