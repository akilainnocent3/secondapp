package defpackage;

import android.content.Context;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import com.sportybet.android.gp.tz.R;
import com.sportygames.sportyherov2.remote.models.FairnessResponse;
import java.util.HashMap;
import kotlin.collections.b;
import kotlin.text.c;

/* JADX INFO: loaded from: classes8.dex */
public final class is7 extends RecyclerView.d0 {
    public static final /* synthetic */ int c = 0;
    public final Context a;
    public final gs7 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public is7(Context context, gs7 gs7Var) {
        super(gs7Var.a);
        context.getClass();
        this.a = context;
        this.b = gs7Var;
    }

    public final void a(int i, FairnessResponse.ClientSeed clientSeed) {
        op5 op5Var;
        String string;
        String string2;
        gs7 gs7Var = this.b;
        Context context = this.a;
        if (i > 0) {
            HashMap map = new HashMap();
            map.put(context.getString(R.string.index_cms), String.valueOf(i));
            AppCompatTextView appCompatTextView = gs7Var.b;
            op5Var = op5.a;
            String str = appCompatTextView.getTag() + ":" + context.getString(R.string.sg_game_name_cms);
            String string3 = context.getString(R.string.player_count, String.valueOf(i));
            string3.getClass();
            op5Var.getClass();
            appCompatTextView.setText(op5.b(str, string3, map));
            AppCompatTextView appCompatTextView2 = gs7Var.c;
            if (clientSeed == null || (string = clientSeed.getName()) == null) {
                string = context.getString(R.string.na);
                string.getClass();
            }
            appCompatTextView2.setText(string);
            AppCompatTextView appCompatTextView3 = gs7Var.e;
            if (clientSeed == null || (string2 = clientSeed.getClientSeed()) == null) {
                string2 = context.getString(R.string.na);
                string2.getClass();
            }
            appCompatTextView3.setText(string2);
        } else {
            HashMap map2 = new HashMap();
            map2.put(context.getString(R.string.index_cms), "");
            AppCompatTextView appCompatTextView4 = gs7Var.b;
            op5Var = op5.a;
            String str2 = appCompatTextView4.getTag() + ":" + context.getString(R.string.sg_game_name_cms);
            String string4 = context.getString(R.string.player_count, "");
            string4.getClass();
            op5Var.getClass();
            appCompatTextView4.setText(op5.b(str2, string4, map2));
            gs7Var.c.setText(context.getString(R.string.na));
            gs7Var.e.setText(context.getString(R.string.na));
        }
        AppCompatTextView appCompatTextView5 = gs7Var.d;
        AppCompatTextView appCompatTextView6 = gs7Var.c;
        op5.r(op5Var, b.f(appCompatTextView5), null, 4);
        if (c.l(appCompatTextView6.getText().toString(), "server generated", true)) {
            op5.r(op5Var, b.f(appCompatTextView6), null, 4);
        }
    }
}
