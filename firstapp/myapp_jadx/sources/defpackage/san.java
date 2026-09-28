package defpackage;

import com.sportygames.commons.models.GiftItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class san implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ san(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                bq40 bq40Var = (bq40) obj2;
                StringBuilder sb = new StringBuilder();
                int i2 = bq40Var.a;
                bq40Var.a = i2 + 1;
                sb.append(i2);
                sb.append(':');
                sb.append(((osg0) obj).a());
                return sb.toString();
            default:
                fd90 fd90Var = (fd90) obj2;
                List<GiftItem> list = (List) obj;
                if (list == null || list.isEmpty()) {
                    list = null;
                }
                fd90Var.k = list;
                boolean z = !(list == null || list.isEmpty());
                if (!Intrinsics.g(fd90Var.j, Boolean.valueOf(z))) {
                    fd90Var.j = Boolean.valueOf(z);
                    fd90Var.e();
                }
                return Unit.a;
        }
    }
}
