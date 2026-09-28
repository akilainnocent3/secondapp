package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.plugin.realsports.activities.PreMatchEventActivity;
import com.sportygames.pingpong.components.SHKeypadContainer;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class tc20 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tc20(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                PreMatchEventActivity preMatchEventActivity = (PreMatchEventActivity) obj;
                ConstraintLayout constraintLayout = preMatchEventActivity.l1;
                if (constraintLayout != null) {
                    constraintLayout.setVisibility(8);
                }
                TextView textView = preMatchEventActivity.m1;
                if (textView != null) {
                    textView.setText("");
                }
                preMatchEventActivity.o1 = -1;
                break;
            default:
                int i2 = SHKeypadContainer.F;
                ((Function1) obj).invoke(2);
                break;
        }
    }
}
