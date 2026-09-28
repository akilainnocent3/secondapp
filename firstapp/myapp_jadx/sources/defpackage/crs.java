package defpackage;

import com.sportybet.android.account.confirm.activity.NameBvnActivity;
import com.sportybet.android.widget.OUEarlyGoalsSwitch;
import com.sportybet.plugin.realsports.home.LivePanel;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class crs implements OUEarlyGoalsSwitch.b, wie.b {
    public final /* synthetic */ Object a;

    public /* synthetic */ crs(Object obj) {
        this.a = obj;
    }

    @Override // wie.b
    public void b() {
        NameBvnActivity nameBvnActivity = (NameBvnActivity) this.a;
        NameBvnActivity.a aVar = NameBvnActivity.D;
        nameBvnActivity.M1();
    }

    @Override // com.sportybet.android.widget.OUEarlyGoalsSwitch.b
    public void onStateChanged(boolean z) {
        LivePanel livePanel = (LivePanel) this.a;
        int i = LivePanel.c0;
        livePanel.l(z);
    }
}
