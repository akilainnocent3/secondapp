package defpackage;

import com.sportybet.ntespm.socket.TopicInfo;
import com.sportybet.plugin.myfavorite.widget.MyFavoriteLivePanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class ty4 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ty4(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        fz4 fz4Var;
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                yy4 yy4Var = (yy4) obj2;
                gz4 gz4VarK = yy4.k(yy4Var, ((Integer) obj).intValue());
                if (gz4VarK != null && (fz4Var = yy4Var.b) != null) {
                    fz4Var.a(new ez4.c(gz4VarK.a));
                }
                return Unit.a;
            default:
                int i2 = MyFavoriteLivePanel.p0;
                ((TopicInfo) obj).setSportId((String) obj2);
                return null;
        }
    }
}
