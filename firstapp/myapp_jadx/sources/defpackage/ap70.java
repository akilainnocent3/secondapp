package defpackage;

import android.graphics.Point;
import android.view.ScrollCaptureTarget;
import androidx.compose.runtime.m;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.Arrays;
import java.util.function.Consumer;
import kotlin.coroutines.CoroutineContext;

/* JADX INFO: loaded from: classes.dex */
public final class ap70 {
    public final ytw a = m.b(Boolean.FALSE);

    public final void a(AndroidComposeView androidComposeView, fb80 fb80Var, CoroutineContext coroutineContext, Consumer consumer) {
        duw duwVar = new duw(new bp70[16]);
        cp70.a(fb80Var.a(), 0, new xo70(1, duwVar, duw.class, "add", "add(Ljava/lang/Object;)Z", 8));
        Arrays.sort(duwVar.a, 0, duwVar.c, vl8.a(yo70.a, zo70.a));
        int i = duwVar.c;
        bp70 bp70Var = (bp70) (i == 0 ? null : duwVar.a[i - 1]);
        if (bp70Var == null) {
            return;
        }
        owo owoVar = bp70Var.c;
        vja vjaVar = new vja(bp70Var.a, owoVar, w5b.a(coroutineContext), this, androidComposeView);
        ywx ywxVar = bp70Var.d;
        lk40 lk40VarP = eb9.c(ywxVar).P(ywxVar, true);
        long jC = owoVar.c();
        ScrollCaptureTarget scrollCaptureTarget = new ScrollCaptureTarget(androidComposeView, ok40.a(pwo.d(lk40VarP)), new Point((int) (jC >> 32), (int) (jC & 4294967295L)), vjaVar);
        scrollCaptureTarget.setScrollBounds(ok40.a(owoVar));
        consumer.accept(scrollCaptureTarget);
    }
}
