package defpackage;

import android.os.Looper;
import android.view.View;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.coroutines.e;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class e9j0 implements f9j0 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v5, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v7, types: [kotlin.coroutines.CoroutineContext] */
    /* JADX WARN: Type inference failed for: r1v9, types: [T, p5w] */
    @Override // defpackage.f9j0
    public final wj40 a(View view) {
        CoroutineContext coroutineContext;
        lzz lzzVar;
        ?? p5wVar;
        LinkedHashMap linkedHashMap = l9j0.a;
        CoroutineContext coroutineContext2 = e.a;
        d.a aVar = d.n;
        coroutineContext2.getClass();
        aVar.getClass();
        mpe0 mpe0Var = uc0.A;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            coroutineContext = (CoroutineContext) uc0.A.getValue();
        } else {
            coroutineContext = uc0.B.get();
            if (coroutineContext == null) {
                ib5.a("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        CoroutineContext coroutineContextPlus = coroutineContext.plus(coroutineContext2);
        r4w r4wVar = (r4w) coroutineContextPlus.get(r4w.a.a);
        if (r4wVar != null) {
            lzz lzzVar2 = new lzz(r4wVar);
            xqr xqrVar = lzzVar2.b;
            synchronized (xqrVar.a) {
                xqrVar.d = false;
                Unit unit = Unit.a;
            }
            lzzVar = lzzVar2;
        } else {
            lzzVar = null;
        }
        dq40 dq40Var = new dq40();
        o5w o5wVar = (o5w) coroutineContextPlus.get(o5w.a.a);
        ?? r1 = o5wVar;
        if (o5wVar == null) {
            p5wVar = new p5w();
            dq40Var.a = p5wVar;
        }
        if (lzzVar != null) {
            r1 = p5wVar;
            coroutineContext2 = lzzVar;
        }
        r1 = p5wVar;
        CoroutineContext coroutineContextPlus2 = coroutineContextPlus.plus(coroutineContext2).plus(r1);
        wj40 wj40Var = new wj40(coroutineContextPlus2);
        synchronized (wj40Var.b) {
            wj40Var.s = true;
            Unit unit2 = Unit.a;
        }
        j1b j1bVarA = w5b.a(coroutineContextPlus2);
        ibs ibsVarB = ll5.b(view);
        s9s lifecycle = ibsVarB != null ? ibsVarB.getLifecycle() : null;
        if (lifecycle != null) {
            view.addOnAttachStateChangeListener(new j9j0(view, wj40Var));
            lifecycle.a(new k9j0(j1bVarA, lzzVar, wj40Var, dq40Var, view));
            return wj40Var;
        }
        wkn.d("ViewTreeLifecycleOwner not found from " + view);
        fkd.a();
        return null;
    }
}
