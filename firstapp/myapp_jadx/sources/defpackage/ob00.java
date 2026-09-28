package defpackage;

import androidx.compose.runtime.snapshots.SnapshotStateList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ob00 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Function1 b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ob00(int i, Object obj, Function1 function1) {
        this.a = i;
        this.b = function1;
        this.c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.c;
        Function1 function1 = this.b;
        switch (i) {
            case 0:
                ((ib00) obj).getClass();
                function1.invoke(((ib00) obj2).a);
                break;
            default:
                String str = (String) obj;
                str.getClass();
                function1.invoke(str);
                ((SnapshotStateList) obj2).add(new byh(System.nanoTime(), str));
                break;
        }
        return Unit.a;
    }
}
