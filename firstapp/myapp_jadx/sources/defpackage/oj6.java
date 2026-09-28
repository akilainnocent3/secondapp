package defpackage;

import android.view.View;
import com.sportybet.android.cashoutphase3.b;

/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class oj6 implements View.OnClickListener {
    public final /* synthetic */ b a;
    public final /* synthetic */ pl6 b;
    public final /* synthetic */ boolean c;

    public /* synthetic */ oj6(b bVar, pl6 pl6Var, boolean z) {
        this.a = bVar;
        this.b = pl6Var;
        this.c = z;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.a.p0(this.b, this.c);
    }
}
