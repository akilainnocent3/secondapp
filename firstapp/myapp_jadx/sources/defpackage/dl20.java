package defpackage;

import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import java.util.LinkedHashSet;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class dl20 implements Function0 {
    public final /* synthetic */ PreMatchSportActivity a;

    public /* synthetic */ dl20(PreMatchSportActivity preMatchSportActivity) {
        this.a = preMatchSportActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        LinkedHashSet linkedHashSet = PreMatchSportActivity.c0;
        return Boolean.valueOf(((sn20) this.a.y.getValue()).a.a("dc_one_up_switch_hint_displayed"));
    }
}
