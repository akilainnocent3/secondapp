package defpackage;

import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class xps implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xps(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                LivePageActivity livePageActivity = (LivePageActivity) obj2;
                if (((uvy) obj) != null) {
                    xss xssVar = livePageActivity.Q;
                    if (xssVar != null) {
                        xssVar.h();
                    }
                    djh0 djh0Var = livePageActivity.R;
                    if (djh0Var != null) {
                        djh0Var.h();
                    }
                } else {
                    int i2 = LivePageActivity.b0;
                }
                break;
            default:
                a7l a7lVar = (a7l) obj;
                a7lVar.getClass();
                a7lVar.f(((Number) ((wd0) obj2).d()).floatValue());
                break;
        }
        return Unit.a;
    }
}
