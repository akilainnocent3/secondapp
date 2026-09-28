package defpackage;

import java.util.HashMap;

/* JADX INFO: loaded from: classes4.dex */
public final class z8j {
    public static final void a(y8j y8jVar, pdd0 pdd0Var) {
        y8jVar.getClass();
        pdd0Var.getClass();
        HashMap<String, Object> getCustomMetrics = pdd0Var.getGetCustomMetrics();
        if (getCustomMetrics == null) {
            itf0.a aVar = itf0.a;
            aVar.q("FullStoryManager");
            aVar.a(inm.a("send event: ", pdd0Var.getName()), new Object[0]);
            y8j.a(y8jVar, pdd0Var.getName());
            return;
        }
        itf0.a aVar2 = itf0.a;
        aVar2.q("FullStoryManager");
        aVar2.a("send event: " + pdd0Var.getName() + ", properties: " + getCustomMetrics, new Object[0]);
        y8jVar.f(pdd0Var.getName(), getCustomMetrics);
    }
}
