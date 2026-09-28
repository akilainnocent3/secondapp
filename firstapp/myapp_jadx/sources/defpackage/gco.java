package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.android.instantwin.presentation.bethistory2.a;
import com.sportybet.plugin.realsports.prematch.widget.LiveTogglesContainer;
import com.sportygames.roulette.activities.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class gco implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gco(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.j.a);
                return Unit.a;
            case 1:
                int i2 = LiveTogglesContainer.v;
                return Integer.valueOf(((Context) obj).getColor(R.color.text_type2_primary));
            default:
                ((b) obj).a.finish();
                return null;
        }
    }
}
