package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class no8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ no8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ap8 ap8Var = (ap8) obj;
                List<? extends Function0<? extends List<? extends Pair<? extends uih.a<? extends Object>, ? extends ygp<? extends Object>>>>> list = ap8Var.d;
                ArrayList arrayList = new ArrayList();
                int size = list.size();
                for (int i2 = 0; i2 < size; i2++) {
                    p48.w(list.get(i2).invoke(), arrayList);
                }
                ap8Var.d = m2g.a;
                return arrayList;
            case 1:
                ((Function1) obj).invoke(zxq.d.a);
                return Unit.a;
            default:
                x7c0 x7c0Var = (x7c0) obj;
                x7c0Var.p1 = 1;
                ul2 ul2VarR0 = x7c0Var.R0();
                boolean zBooleanValue = ((Boolean) ((x5a0) x7c0Var.y2).getValue()).booleanValue();
                Integer num = (Integer) ((x5a0) x7c0Var.z2).getValue();
                x7c0Var.Y2(ul2VarR0, zBooleanValue, num != null ? num.intValue() : 0);
                return Unit.a;
        }
    }
}
