package defpackage;

import androidx.compose.runtime.m;
import com.sporty.android.book.domain.entity.UIState;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Li250;", "Lj8i0;", "sportybook"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class i250 extends j8i0 {
    public final adk a;
    public final ytw b = m.b(Boolean.FALSE);
    public final wwd0 c;
    public final v340 d;

    public i250(adk adkVar) {
        this.a = adkVar;
        wwd0 wwd0VarA = xwd0.a(UIState.Idle.INSTANCE);
        this.c = wwd0VarA;
        this.d = e1i.b(wwd0VarA);
    }
}
