package defpackage;

import android.content.Context;
import com.sporty.android.common.uievent.AlertDialogCallbackType;
import com.sportybet.android.payment.security.nameupdate.presentation.activity.NameUpdateWebViewActivity;
import kotlin.Unit;
import kotlin.collections.a;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class kex implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ kex(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                int i = NameUpdateWebViewActivity.e;
                ((AlertDialogCallbackType) obj).getClass();
                return Unit.a;
            default:
                Context context = (Context) obj;
                context.getClass();
                return a.c(new m390(context, "sportybet", wi80.b("pref_stake_config_2"), null, new h6s(new zn20.a("stake_config_json"), null), 8));
        }
    }
}
