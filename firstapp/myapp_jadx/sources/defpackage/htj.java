package defpackage;

import android.accounts.Account;
import android.content.Intent;
import com.esotericsoftware.spine.android.b;
import com.sportybet.android.choosebet.presentation.ChooseBetActivity;
import com.sportybet.plugin.event.e;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportybet.plugin.realsports.data.Event;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class htj implements pya, hcb0, tit {
    public final /* synthetic */ Object a;

    public /* synthetic */ htj(Object obj) {
        this.a = obj;
    }

    @Override // defpackage.pya
    public void accept(Object obj) {
        ((lqa) this.a).invoke(obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.hcb0
    public void b(b bVar) {
        ytw ytwVar = (ytw) this.a;
        ytwVar.setValue(bVar);
        b bVar2 = (b) ytwVar.getValue();
        if (bVar2 != null) {
            bVar2.b().k(mx90.a.b);
        }
    }

    @Override // defpackage.tit
    public void w(Account account, boolean z) {
        PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) this.a;
        int i = PreMatchEventActivity.a2;
        if (account != null) {
            preMatchEventActivity.saveDataBeforeRecreate();
            Event event = preMatchEventActivity.S;
            if (event == null) {
                return;
            }
            Intent intent = new Intent(preMatchEventActivity, (Class<?>) ChooseBetActivity.class);
            e eVar = preMatchEventActivity.L1;
            intent.putExtra("key_event_id", eVar != null ? eVar.Q : null);
            intent.putExtra("key_post_id", String.valueOf(event.topicId));
            intent.putExtra("key_team_name", event.homeTeamName + " v " + event.awayTeamName);
            intent.putExtra("key_come_from", 1);
            preMatchEventActivity.startActivityForResult(intent, 1);
        }
    }
}
