package defpackage;

import android.widget.TextView;
import com.sportybet.android.gp.tz.R;
import com.sportybet.plugin.realsports.widget.FlashBoostBadgeView;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class s84 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s84(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((ytw) obj).setValue(Boolean.FALSE);
                return Unit.a;
            default:
                int i2 = FlashBoostBadgeView.b;
                return (TextView) ((FlashBoostBadgeView) obj).findViewById(R.id.flash_boost_badge_text);
        }
    }
}
