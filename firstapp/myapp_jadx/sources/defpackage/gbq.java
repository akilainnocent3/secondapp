package defpackage;

import android.content.Context;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.luckynumber.featurematch.presentation.a;
import com.sportybet.plugin.myfavorite.widget.item.QuickAddStakeItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class gbq implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ gbq(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(a.e.a);
                return Unit.a;
            default:
                int i2 = QuickAddStakeItem.M;
                return ((Context) obj).getDrawable(R.drawable.my_stake_bg);
        }
    }
}
