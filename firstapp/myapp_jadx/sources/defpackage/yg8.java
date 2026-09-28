package defpackage;

import android.os.Bundle;
import com.sporty.android.core.model.pocket.common.PayHintData;
import com.sportybet.plugin.webcontainer.caipiao.jsplugin.JsPluginCommon;
import com.sportygames.commons.utils.CasinoLogger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class yg8 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ yg8(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                dh8.a aVar = dh8.y;
                Bundle arguments = ((dh8) obj).getArguments();
                if (arguments != null) {
                    return (PayHintData) arguments.getParcelable("notifyContent");
                }
                return null;
            default:
                Function0 function0 = (Function0) obj;
                op5.a.getClass();
                String str = op5.c;
                if (str == null) {
                    str = "";
                }
                wz.a("tournament_snooze_clicked", krh0.e(str), new String[0]);
                CasinoLogger casinoLogger = CasinoLogger.INSTANCE;
                String str2 = op5.c;
                casinoLogger.logEventToCasino("tournament_snooze_clicked", vj5.a(new Pair(JsPluginCommon.GAMES_BET_PLACED_GAME_NAME_ARGUMENT, krh0.e(str2 != null ? str2 : "")), new Pair("Platform", "ANDROID")));
                function0.invoke();
                return Unit.a;
        }
    }
}
