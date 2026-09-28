package defpackage;

import android.content.Context;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.sportybet.android.gp.tz.R;

/* JADX INFO: loaded from: classes7.dex */
public final class ebz extends z72 {
    public final dbz a;

    /* JADX WARN: Illegal instructions before constructor call */
    public ebz(dbz dbzVar) {
        ConstraintLayout constraintLayout = dbzVar.a;
        constraintLayout.getClass();
        super(constraintLayout);
        this.a = dbzVar;
    }

    @Override // defpackage.z72
    public final void a(fbz fbzVar) {
        fbzVar.getClass();
        dbz dbzVar = this.a;
        dbzVar.b.setText(fbzVar.b.specifier);
        TextView textView = dbzVar.c;
        Context context = this.itemView.getContext();
        context.getClass();
        textView.setText(sn5.b(context, R.string.app_common__book_close, bwf0.a.d(fbzVar.a.estimateStopTime, false)));
    }
}
