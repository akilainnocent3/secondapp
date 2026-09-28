package defpackage;

import android.content.Intent;
import com.sportybet.android.home.MainActivity;
import com.sportybet.android.instantwin.presentation.buildandgo.d;
import com.sportybet.feature.playTimeControlDialog.PlayTimeControlDialogActivity;
import com.sportybet.plugin.realsports.home.LivePanel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class jh5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jh5(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((Function1) obj).invoke(d.r.a);
                break;
            case 1:
                azm.c(((p5e) obj).F0(), "https://www.gtbank.com", null, null, 6);
                break;
            case 2:
                djh djhVar = ((n2j) obj).b;
                if (djhVar != null) {
                    djhVar.i.setVisibility(8);
                }
                break;
            case 3:
                int i2 = LivePanel.c0;
                gby.b(((LivePanel) obj).M.getDescriptionView().getContext());
                break;
            case 4:
                PlayTimeControlDialogActivity playTimeControlDialogActivity = (PlayTimeControlDialogActivity) obj;
                int i3 = PlayTimeControlDialogActivity.c;
                playTimeControlDialogActivity.getAccountHelper().logout();
                playTimeControlDialogActivity.finish();
                Intent intent = new Intent(playTimeControlDialogActivity.getApplicationContext(), (Class<?>) MainActivity.class);
                intent.setFlags(67108864);
                yrh0.s(playTimeControlDialogActivity.getApplicationContext(), intent, true);
                break;
            default:
                ((h0s) obj).f();
                break;
        }
        return Unit.a;
    }
}
