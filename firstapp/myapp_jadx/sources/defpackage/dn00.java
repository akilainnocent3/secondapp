package defpackage;

import com.sportybet.android.bookingcode.data.dto.BookingData;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.android.social.presentation.personal.PersonalSocialFragment", f = "PersonalSocialFragment.kt", l = {625}, m = "onCustomCodeShare", v = 2)
public final class dn00 extends x1b {
    public String a;
    public BookingData b;
    public String c;
    public ArrayList d;
    public List e;
    public /* synthetic */ Object f;
    public final /* synthetic */ cn00 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dn00(cn00 cn00Var, x1b x1bVar) {
        super(x1bVar);
        this.i = cn00Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.q0(null, null, null, this);
    }
}
