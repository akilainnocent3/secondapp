package defpackage;

import android.content.SharedPreferences;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nb0 implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ nb0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                Function0 function0 = (Function0) obj;
                View view = ((xb0) obj2).a;
                Handler handler = view.getHandler();
                if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                    function0.invoke();
                } else {
                    Handler handler2 = view.getHandler();
                    if (handler2 != null) {
                        handler2.post(new sb0(function0, 0));
                    }
                }
                break;
            default:
                n2j n2jVar = (n2j) obj2;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                SharedPreferences.Editor editor = n2jVar.K;
                if (editor != null) {
                    editor.putBoolean("FIXED_CO_EFF", zBooleanValue);
                }
                SharedPreferences.Editor editor2 = n2jVar.K;
                if (editor2 != null) {
                    editor2.apply();
                }
                n2jVar.I0(zBooleanValue);
                break;
        }
        return Unit.a;
    }
}
