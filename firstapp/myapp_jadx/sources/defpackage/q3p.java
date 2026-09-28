package defpackage;

import com.sportybet.plugin.realsports.data.Outcome;
import com.sportybet.plugin.realsports.widget.OutcomeButton;

/* JADX INFO: loaded from: classes7.dex */
public final class q3p implements u8z.a {
    public final /* synthetic */ s3p a;

    public q3p(s3p s3pVar) {
        this.a = s3pVar;
    }

    @Override // u8z.a
    public final boolean a(Outcome outcome) {
        return false;
    }

    @Override // u8z.a
    public final void b(OutcomeButton outcomeButton) {
        this.a.onClick(outcomeButton);
    }
}
