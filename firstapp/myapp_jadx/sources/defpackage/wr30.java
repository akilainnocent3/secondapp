package defpackage;

import com.sporty.android.core.model.config.bo.BOConfigValueBundle;
import com.sportybet.plugin.realsports.data.RTicket;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.bethistory.presentation.viewmodel.RSportTicketDetailsViewModel", f = "RSportTicketDetailsViewModel.kt", l = {195}, m = "buildTicketDetailsData", v = 2)
public final class wr30 extends x1b {
    public RTicket a;
    public String b;
    public BOConfigValueBundle c;
    public ArrayList d;
    public ArrayList e;
    public boolean f;
    public int i;
    public /* synthetic */ Object v;
    public final /* synthetic */ ds30 w;
    public int y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wr30(ds30 ds30Var, x1b x1bVar) {
        super(x1bVar);
        this.w = ds30Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.v = obj;
        this.y |= Integer.MIN_VALUE;
        return this.w.x1(null, null, null, false, null, this);
    }
}
