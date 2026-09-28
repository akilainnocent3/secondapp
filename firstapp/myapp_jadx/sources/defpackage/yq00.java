package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yq00 implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ yq00(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                eo20[] eo20VarArr = eo20.a;
                uag uagVar = mr00.i;
                ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
                Iterator<T> it = uagVar.iterator();
                while (it.hasNext()) {
                    arrayList.add(((mr00) it.next()).a);
                }
                return a.c(q390.a(context, "WinningManager", CollectionsKt.E0(arrayList)));
            default:
                hq60 hq60Var = (hq60) obj;
                hq60Var.getClass();
                ph80 ph80Var = new ph80();
                while (hq60Var.D1()) {
                    ph80Var.add(Integer.valueOf((int) hq60Var.getLong(0)));
                }
                return wi80.a(ph80Var);
        }
    }
}
