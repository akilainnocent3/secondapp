package defpackage;

import android.content.Context;
import com.sportygames.sportyherov2.components.SHKeypadContainer;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class m5c0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m5c0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                a6c0 a6c0Var = (a6c0) obj2;
                Context context = (Context) obj;
                context.getClass();
                SHKeypadContainer sHKeypadContainer = new SHKeypadContainer(context, null);
                sHKeypadContainer.setVisibility(8);
                a6c0Var.n = sHKeypadContainer;
                a6c0Var.d();
                return sHKeypadContainer;
            default:
                String str = (String) obj;
                str.getClass();
                return Boolean.valueOf(((Set) ((twd0) obj2).getValue()).contains(str));
        }
    }
}
