package defpackage;

import android.content.Context;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import java.util.LinkedHashSet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class yk20 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yk20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
                Context context = ((hjd0) obj).a.getContext();
                context.getClass();
                gby.c(context);
                break;
            default:
                ((Function1) obj).invoke(h0f0.b);
                break;
        }
        return Unit.a;
    }
}
