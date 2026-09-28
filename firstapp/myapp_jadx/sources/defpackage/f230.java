package defpackage;

import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import com.sporty.android.sportytv.data.Program;

/* JADX INFO: loaded from: classes5.dex */
public final class f230 implements View.OnClickListener {
    public final /* synthetic */ cq40 a;
    public final /* synthetic */ e230 b;
    public final /* synthetic */ AppCompatImageView c;

    public f230(cq40 cq40Var, e230 e230Var, int i, AppCompatImageView appCompatImageView) {
        this.a = cq40Var;
        this.b = e230Var;
        this.c = appCompatImageView;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        e230 e230Var = this.b;
        Program program = e230Var.d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        cq40 cq40Var = this.a;
        if (jCurrentTimeMillis - cq40Var.a < 350) {
            return;
        }
        cq40Var.a = jCurrentTimeMillis;
        view.getClass();
        boolean z = e230Var.v;
        e230.a aVar = e230Var.f;
        if (z) {
            aVar.b(program.getId());
        } else {
            aVar.a(program.getId());
        }
        boolean z2 = !e230Var.v;
        e230Var.v = z2;
        e230.l(this.c, z2);
    }
}
