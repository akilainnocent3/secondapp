package defpackage;

import android.view.ViewGroup;
import androidx.compose.ui.platform.ComposeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class b9r implements Function2 {
    public final /* synthetic */ ViewGroup a;
    public final /* synthetic */ ComposeView b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ b9r(ViewGroup viewGroup, ComposeView composeView, Function2 function2) {
        this.a = viewGroup;
        this.b = composeView;
        this.c = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.getClass();
        String str = (String) obj2;
        str.getClass();
        this.a.removeView(this.b);
        this.c.invoke(bool, str);
        return Unit.a;
    }
}
