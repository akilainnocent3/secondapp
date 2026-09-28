package defpackage;

import androidx.compose.ui.d;
import androidx.compose.ui.platform.AndroidComposeView;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class k3w {
    public final AndroidComposeView a;
    public final duw<tt1> b = new duw<>(new tt1[16]);
    public final duw<i3w<?>> c = new duw<>(new i3w[16]);
    public final duw<tsr> d = new duw<>(new tsr[16]);
    public final duw<i3w<?>> e = new duw<>(new i3w[16]);
    public boolean f;

    public static final class a extends qlr implements Function0<Unit> {
        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            k3w k3wVar = k3w.this;
            duw<i3w<?>> duwVar = k3wVar.c;
            duw<tt1> duwVar2 = k3wVar.b;
            duw<i3w<?>> duwVar3 = k3wVar.e;
            k3wVar.f = false;
            HashSet hashSet = new HashSet();
            duw<tsr> duwVar4 = k3wVar.d;
            tsr[] tsrVarArr = duwVar4.a;
            int i = duwVar4.c;
            for (int i2 = 0; i2 < i; i2++) {
                tsr tsrVar = tsrVarArr[i2];
                i3w<?> i3wVar = duwVar3.a[i2];
                d.c cVar = tsrVar.U.f;
                if (cVar.C) {
                    k3w.b(cVar, i3wVar, hashSet);
                }
            }
            duwVar4.g();
            duwVar3.g();
            tt1[] tt1VarArr = duwVar2.a;
            int i3 = duwVar2.c;
            for (int i4 = 0; i4 < i3; i4++) {
                tt1 tt1Var = tt1VarArr[i4];
                i3w<?> i3wVar2 = duwVar.a[i4];
                if (tt1Var.C) {
                    k3w.b(tt1Var, i3wVar2, hashSet);
                }
            }
            duwVar2.g();
            duwVar.g();
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                ((tt1) it.next()).r2();
            }
            return Unit.a;
        }
    }

    public k3w(AndroidComposeView androidComposeView) {
        this.a = androidComposeView;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [androidx.compose.ui.d$c] */
    /* JADX WARN: Type inference failed for: r4v7, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [duw] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    /* JADX WARN: Type inference failed for: r6v9 */
    public static void b(d.c cVar, i3w i3wVar, HashSet hashSet) {
        if (!cVar.a.C) {
            wkn.c("visitSubtreeIf called on an unattached node");
        }
        duw duwVar = new duw(new d.c[16]);
        d.c cVar2 = cVar.a;
        d.c cVar3 = cVar2.f;
        if (cVar3 == null) {
            pkd.a(duwVar, cVar2);
        } else {
            duwVar.b(cVar3);
        }
        while (true) {
            int i = duwVar.c;
            if (i == 0) {
                return;
            }
            d.c cVar4 = (d.c) duwVar.k(i - 1);
            if ((cVar4.d & 32) != 0) {
                d.c cVar5 = cVar4;
                while (true) {
                    if (cVar5 != null) {
                        if ((cVar5.c & 32) != 0) {
                            ?? C = cVar5;
                            ?? duwVar2 = 0;
                            while (C != 0) {
                                if (C instanceof l3w) {
                                    l3w l3wVar = (l3w) C;
                                    if (l3wVar instanceof tt1) {
                                        tt1 tt1Var = (tt1) l3wVar;
                                        if ((tt1Var.D instanceof j3w) && tt1Var.G.contains(i3wVar)) {
                                            hashSet.add(l3wVar);
                                        }
                                    }
                                    if (l3wVar.o0().g(i3wVar)) {
                                        break;
                                    }
                                } else if ((C.c & 32) != 0 && (C instanceof tkd)) {
                                    d.c cVar6 = ((tkd) C).E;
                                    int i2 = 0;
                                    C = C;
                                    duwVar2 = duwVar2;
                                    while (cVar6 != null) {
                                        if ((cVar6.c & 32) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                duwVar2 = duwVar2;
                                                C = cVar6;
                                            } else {
                                                if (duwVar2 == 0) {
                                                    duwVar2 = new duw(new d.c[16]);
                                                }
                                                if (C != 0) {
                                                    duwVar2.b(C);
                                                    C = 0;
                                                }
                                                duwVar2.b(cVar6);
                                            }
                                        }
                                        cVar6 = cVar6.f;
                                        C = C;
                                        duwVar2 = duwVar2;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                C = pkd.c(duwVar2);
                            }
                        }
                        cVar5 = cVar5.f;
                    }
                }
            }
            pkd.a(duwVar, cVar4);
        }
    }

    public final void a() {
        if (this.f) {
            return;
        }
        this.f = true;
        this.a.x(new a());
    }
}
