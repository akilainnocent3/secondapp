package defpackage;

import com.sportybet.plugin.realsports.event.widget.LiveEventHeaderView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class bvd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ j1k b;

    public /* synthetic */ bvd(j1k j1kVar, int i) {
        this.a = i;
        this.b = j1kVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        j1k j1kVar = this.b;
        switch (i) {
            case 0:
                jvd jvdVarM0 = ((gvd) j1kVar).m0();
                ivd.a aVar = ivd.a.a;
                aVar.getClass();
                jvdVarM0.c.a(aVar);
                ej5.c(o8i0.d(jvdVarM0), null, null, new lvd(jvdVarM0, null), 3);
                break;
            default:
                LiveEventHeaderView liveEventHeaderView = (LiveEventHeaderView) j1kVar;
                int i2 = LiveEventHeaderView.L;
                if (liveEventHeaderView.B.getVisibility() == 0 && !liveEventHeaderView.D) {
                    liveEventHeaderView.d.a(s2k0.j.a, k00.d);
                    liveEventHeaderView.D = true;
                }
                break;
        }
        return Unit.a;
    }
}
