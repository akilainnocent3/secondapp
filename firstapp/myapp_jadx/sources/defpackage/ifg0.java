package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlin.text.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.campaign.presentation.TournamentStatsUiKt$ScoreText$1$1", f = "TournamentStatsUi.kt", l = {}, m = "invokeSuspend", v = 1)
public final class ifg0 extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ String a;
    public final /* synthetic */ ytw<Double> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ifg0(v1b v1bVar, ytw ytwVar, String str) {
        super(2, v1bVar);
        this.a = str;
        this.b = ytwVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new ifg0(v1bVar, this.b, this.a);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((ifg0) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ytw<Double> ytwVar;
        Double value;
        String string;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Double dH = null;
        String str = this.a;
        if (str != null && (string = StringsKt.t0(str).toString()) != null) {
            if (string.length() <= 0 || string.equals("null") || string.equals("--")) {
                string = null;
            }
            if (string != null) {
                dH = b.h(c.p(string, ",", "", false));
            }
        }
        if (dH != null && ((value = (ytwVar = this.b).getValue()) == null || dH.doubleValue() >= value.doubleValue())) {
            ytwVar.setValue(dH);
        }
        return Unit.a;
    }
}
