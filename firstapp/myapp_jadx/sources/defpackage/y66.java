package defpackage;

import android.view.View;
import com.sportygames.sportysoccer.activities.GameActivity;

/* JADX INFO: loaded from: classes8.dex */
public final /* synthetic */ class y66 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ y66(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((z66) obj).dismiss();
                break;
            default:
                GameActivity gameActivity = (GameActivity) obj;
                int i2 = GameActivity.H;
                if (!gameActivity.z.b()) {
                    gameActivity.finish();
                }
                break;
        }
    }
}
