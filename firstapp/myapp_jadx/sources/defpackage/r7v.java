package defpackage;

import android.app.Activity;
import androidx.fragment.app.e;
import androidx.media3.exoplayer.ExoPlayer;
import com.sporty.android.core.model.MyLog;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class r7v implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r7v(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((use) obj).getClass();
                return new v7v((ExoPlayer) obj2);
            default:
                final eu30.h hVar = (eu30.h) obj2;
                eu30 eu30Var = eu30.this;
                final String str = (String) hVar.W.getTag();
                if (iu2.a.j().o0() && iu2.m()) {
                    eu30Var.C.b(str);
                    itf0.a aVar = itf0.a;
                    aVar.q(MyLog.TAG_EDIT_BET);
                    aVar.a(" RT navigate to Home and open BetSlip", new Object[0]);
                    return null;
                }
                Activity activity = eu30Var.a;
                if (!(activity instanceof e)) {
                    return null;
                }
                uq7.a(activity, new uq7.b() { // from class: mu30
                    @Override // uq7.b
                    public final void a() {
                        eu30.this.C.b(str);
                    }
                });
                return null;
        }
    }
}
