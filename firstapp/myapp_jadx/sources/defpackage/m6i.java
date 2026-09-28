package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.codehub.ui.FollowCodeFragment", f = "FollowCodeFragment.kt", l = {215}, m = "onCodeShare", v = 2)
public final class m6i extends x1b {
    public b6i.e a;
    public BookingData b;
    public String c;
    public ArrayList d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ n6i i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6i(n6i n6iVar, x1b x1bVar) {
        super(x1bVar);
        this.i = n6iVar;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.o0(null, null, this);
    }
}
