package defpackage;

import com.sportygames.fruithunt.network.models.FruitItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class z5j implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ z5j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                pfd pfdVar = fse.a;
                ej5.c(w5b.a(gku.a), null, null, new x6j((u6j) obj2, (FruitItem.FruitRecord) obj, null), 3);
                break;
            default:
                ((Function1) obj2).invoke(new ot70.a(((fu70) obj).a, ny70.PLAYER));
                break;
        }
        return Unit.a;
    }
}
