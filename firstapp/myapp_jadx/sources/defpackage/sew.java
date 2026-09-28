package defpackage;

import android.widget.PopupWindow;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.multimaker.presentation.activity.MultiMakerActivity;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class sew implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ sew(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [axf0] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                final MultiMakerActivity multiMakerActivity = (MultiMakerActivity) obj;
                kid0 kid0Var = multiMakerActivity.f;
                if (kid0Var == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                int iC = wc.c(multiMakerActivity) - kid0Var.y.a.getHeight();
                kid0 kid0Var2 = multiMakerActivity.f;
                if (kid0Var2 == null) {
                    Intrinsics.n("binding");
                    throw null;
                }
                final dxf0 dxf0Var = new dxf0(multiMakerActivity, (iC - kid0Var2.w.getHeight()) - kid0Var.e.getHeight());
                dxf0Var.d = new lew(multiMakerActivity);
                dxf0Var.e = new Function0() { // from class: mew
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i2 = MultiMakerActivity.E;
                        Object value = multiMakerActivity.z1().Z.getValue();
                        value.getClass();
                        return (xvf0) value;
                    }
                };
                final oew oewVar = new oew(multiMakerActivity);
                qjd0 qjd0Var = dxf0Var.b;
                RecyclerView recyclerView = qjd0Var.a;
                final ywf0 ywf0Var = new ywf0(new ywf0.a());
                ywf0Var.b = new Function1() { // from class: axf0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        xvf0 xvf0Var = (xvf0) obj2;
                        xvf0Var.getClass();
                        dxf0 dxf0Var2 = dxf0Var;
                        ArrayList arrayListA = dxf0Var2.a();
                        ArrayList arrayList = new ArrayList(l48.r(arrayListA, 10));
                        int size = arrayListA.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj3 = arrayListA.get(i2);
                            i2++;
                            xvf0 xvf0Var2 = new xvf0((xvf0) obj3);
                            xvf0Var2.c = zc9.a(xvf0Var2, xvf0Var);
                            arrayList.add(xvf0Var2);
                        }
                        ywf0Var.i(arrayList);
                        ((PopupWindow) dxf0Var2.c.getValue()).dismiss();
                        oewVar.invoke(xvf0Var);
                        return Unit.a;
                    }
                };
                xvf0 xvf0VarInvoke = dxf0Var.e.invoke();
                ArrayList arrayListA = dxf0Var.a();
                ArrayList arrayList = new ArrayList(l48.r(arrayListA, 10));
                int size = arrayListA.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj2 = arrayListA.get(i2);
                    i2++;
                    xvf0 xvf0Var = new xvf0((xvf0) obj2);
                    xvf0Var.c = zc9.a(xvf0Var, xvf0VarInvoke);
                    arrayList.add(xvf0Var);
                }
                ywf0Var.i(arrayList);
                recyclerView.setAdapter(ywf0Var);
                multiMakerActivity.getFullStoryCommonManager().d(qjd0Var.a, "fs-unmask");
                return dxf0Var;
            case 1:
                ((Function1) obj).invoke(q5z.g.a);
                return Unit.a;
            default:
                ((fd90) obj).a.V1();
                return Unit.a;
        }
    }
}
