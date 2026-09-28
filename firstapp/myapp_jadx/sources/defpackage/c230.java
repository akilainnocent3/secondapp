package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sporty.android.sportytv.data.Program;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import okhttp3.internal.ws.RealWebSocket;

/* JADX INFO: loaded from: classes5.dex */
public final class c230 extends e64<teb0> {
    public final Program d;
    public final boolean e;
    public final SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);

    public c230(Program program, boolean z) {
        this.d = program;
        this.e = z;
    }

    @Override // defpackage.e64
    public final void f(g6i0 g6i0Var, int i) {
        teb0 teb0Var = (teb0) g6i0Var;
        teb0Var.getClass();
        ConstraintLayout constraintLayout = teb0Var.a;
        constraintLayout.setBackgroundColor(this.e ? constraintLayout.getContext().getColor(R.color.custom_absolute_type2_type3) : constraintLayout.getContext().getColor(R.color.background_type2_primary));
        TextView textView = teb0Var.c;
        Program program = this.d;
        textView.setText(program.getDescription());
        TextView textView2 = teb0Var.b;
        Context context = constraintLayout.getContext();
        context.getClass();
        textView2.setText(sn5.b(context, R.string.sporty_tv__genres, program.getSportsType()));
        TextView textView3 = teb0Var.d;
        Context context2 = constraintLayout.getContext();
        context2.getClass();
        textView3.setText(sn5.b(context2, R.string.sporty_tv__start_time_and_duration, this.f.format(new Date(program.getStartTime())), String.valueOf(program.getDuration() / RealWebSocket.CANCEL_AFTER_CLOSE_MILLIS)));
    }

    @Override // defpackage.e64
    public final int h() {
        return R.layout.spm_item_program_detail;
    }

    @Override // defpackage.e64
    public final g6i0 i(View view) {
        view.getClass();
        int i = R.id.category;
        TextView textView = (TextView) h5e.a(R.id.category, view);
        if (textView != null) {
            i = R.id.description;
            TextView textView2 = (TextView) h5e.a(R.id.description, view);
            if (textView2 != null) {
                i = R.id.startTime;
                TextView textView3 = (TextView) h5e.a(R.id.startTime, view);
                if (textView3 != null) {
                    return new teb0((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        bmy.a("Missing required view with ID: ".concat(view.getResources().getResourceName(i)));
        return null;
    }
}
