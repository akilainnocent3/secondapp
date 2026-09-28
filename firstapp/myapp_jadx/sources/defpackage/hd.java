package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import androidx.compose.animation.d;
import androidx.compose.animation.f;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class hd implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ hd(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                Context context = (Context) obj;
                context.getClass();
                if (context instanceof ContextWrapper) {
                    return ((ContextWrapper) context).getBaseContext();
                }
                return null;
            default:
                ((d) obj).getClass();
                return f.o(null, new l6d(), 1);
        }
    }
}
