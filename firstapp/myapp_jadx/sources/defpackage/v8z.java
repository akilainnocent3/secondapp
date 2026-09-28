package defpackage;

import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class v8z implements Runnable {
    public final /* synthetic */ u8z a;
    public final /* synthetic */ OutcomeButton b;
    public final /* synthetic */ boolean c;

    public v8z(u8z u8zVar, OutcomeButton outcomeButton, boolean z) {
        this.a = u8zVar;
        this.b = outcomeButton;
        this.c = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        u8z.a aVar = this.a.f;
        if (aVar != null) {
            boolean z = this.c;
            OutcomeButton outcomeButton = this.b;
            outcomeButton.setChecked(z);
            aVar.b(outcomeButton);
        }
    }
}
