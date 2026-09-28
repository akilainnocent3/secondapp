package defpackage;

import com.sportybet.plugin.realsports.betslip.Selection;
import java.util.Set;
import kotlin.collections.a;

/* JADX INFO: loaded from: classes7.dex */
public final class bkf {
    public volatile Set<? extends xjf> a = t3g.a;

    public static ngs a(Selection selection) {
        ngs ngsVarB = a.b();
        if (u7u.g(selection) || u7u.j(selection)) {
            ngsVarB.add(xjf.a);
        }
        if (rlc.d(selection)) {
            ngsVarB.add(xjf.b);
        }
        if (qvy.d(selection)) {
            ngsVarB.add(xjf.c);
        }
        if (yay.i(selection)) {
            ngsVarB.add(xjf.d);
        }
        return a.a(ngsVarB);
    }

    public final synchronized boolean b(xjf xjfVar) {
        return this.a.contains(xjfVar);
    }
}
