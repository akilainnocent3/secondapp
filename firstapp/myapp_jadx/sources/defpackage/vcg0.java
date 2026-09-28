package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.sportygames.commons.models.ComposeCashOutModel;
import com.twilio.voice.EventKeys;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes7.dex */
public final class vcg0 extends BroadcastReceiver {
    public final /* synthetic */ wcg0 a;

    public vcg0(wcg0 wcg0Var) {
        this.a = wcg0Var;
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        ytw<ComposeCashOutModel> ytwVar = this.a.D;
        intent.getClass();
        if (intent.hasExtra("cashoutErr")) {
            ((x5a0) ytwVar).setValue(new ComposeCashOutModel(null, null, false, false, 15, null));
            return;
        }
        if (intent.hasExtra("enable button")) {
            ((x5a0) ytwVar).setValue(Intrinsics.g(intent.getStringExtra("number"), "1") ? new ComposeCashOutModel(null, null, false, false, 11, null) : new ComposeCashOutModel(null, null, false, false, 7, null));
            return;
        }
        String stringExtra = intent.getStringExtra(EventKeys.ERROR_MESSAGE);
        if (intent.getIntExtra("betIndex", 0) == 1) {
            x5a0 x5a0Var = (x5a0) ytwVar;
            x5a0Var.setValue(ComposeCashOutModel.copy$default((ComposeCashOutModel) x5a0Var.getValue(), stringExtra, null, !(stringExtra == null || stringExtra.length() == 0), false, 10, null));
        } else {
            x5a0 x5a0Var2 = (x5a0) ytwVar;
            x5a0Var2.setValue(ComposeCashOutModel.copy$default((ComposeCashOutModel) x5a0Var2.getValue(), null, stringExtra, false, !(stringExtra == null || stringExtra.length() == 0), 5, null));
        }
    }
}
