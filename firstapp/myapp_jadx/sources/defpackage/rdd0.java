package defpackage;

import com.sporty.android.core.model.MyLog;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class rdd0 {
    public final jym a;
    public final y8j b;

    public rdd0(jym jymVar, y8j y8jVar) {
        this.a = jymVar;
        this.b = y8jVar;
    }

    public final void a(pdd0 pdd0Var, k00... k00VarArr) {
        pdd0Var.getClass();
        for (k00 k00Var : k00VarArr) {
            Map<String, ? extends Object> getCustomMetrics = pdd0Var.getGetCustomMetrics();
            if (getCustomMetrics == null) {
                getCustomMetrics = o2g.a;
                getCustomMetrics.getClass();
            }
            int iOrdinal = k00Var.ordinal();
            if (iOrdinal == 0) {
                uoh.a.b(pdd0Var.getName(), getCustomMetrics);
            } else if (iOrdinal == 1) {
                xv0.a.b(pdd0Var.getName(), getCustomMetrics);
            } else if (iOrdinal == 2) {
                z8j.a(this.b, pdd0Var);
            } else {
                if (iOrdinal != 3) {
                    uhc.a();
                    return;
                }
                itf0.a aVar = itf0.a;
                aVar.q("SportyTrackingLogger");
                aVar.a("event in:" + pdd0Var + ", \nproperty out:" + pdd0Var.getProperty(), new Object[0]);
                this.a.a(pdd0Var.getProperty(), pdd0Var.getPageMeta(), pdd0Var.getTrackingKind());
            }
            itf0.a aVar2 = itf0.a;
            aVar2.q(MyLog.TAG_REPORT);
            aVar2.a("platform: " + k00Var + ", send event: " + pdd0Var.getName() + ", properties: " + getCustomMetrics, new Object[0]);
        }
    }
}
