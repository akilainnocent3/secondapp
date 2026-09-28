package defpackage;

import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.live.livepage.LivePageActivity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ta0 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ta0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                rcf.a((ua0) obj);
                return Unit.a;
            default:
                int i2 = LivePageActivity.b0;
                return Integer.valueOf(((LivePageActivity) obj).getResources().getDimensionPixelSize(R.dimen.live_sport_tabs_height));
        }
    }
}
