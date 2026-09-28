package defpackage;

import android.text.style.ClickableSpan;
import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public final class h7g extends ClickableSpan {
    public final /* synthetic */ j7g.a a;

    public h7g(j7g.a aVar) {
        this.a = aVar;
    }

    @Override // android.text.style.ClickableSpan
    public final void onClick(View view) {
        this.a.a();
    }
}
