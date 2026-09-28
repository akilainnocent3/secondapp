package defpackage;

import android.content.Intent;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Event;
import com.sportybet.plugin.realsports.prematch.PreMatchSportActivity;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class uaf implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uaf(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((abf) obj).a();
            default:
                final PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                int i2 = PreMatchEventActivity.a2;
                preMatchEventActivity.d2(new Function0() { // from class: wc20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        PreMatchEventActivity preMatchEventActivity2 = preMatchEventActivity;
                        Event event = preMatchEventActivity2.S;
                        if (event != null) {
                            Intent intent = new Intent(preMatchEventActivity2.getBaseContext(), (Class<?>) PreMatchSportActivity.class);
                            String str = event.sport.category.tournament.id;
                            str.getClass();
                            intent.putStringArrayListExtra("key_tournament_ids", b.f(str));
                            intent.putExtra("key_tournament_name", event.sport.category.tournament.name);
                            intent.putExtra("key_sport_id", event.sport.id);
                            intent.putExtra("key_sport_time", 0L);
                            intent.setFlags(335544320);
                            yrh0.s(preMatchEventActivity2.getBaseContext(), intent, true);
                        }
                        return Unit.a;
                    }
                });
                return Unit.a;
        }
    }
}
