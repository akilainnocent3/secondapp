package defpackage;

import android.content.Context;
import com.sportybet.android.bookingcode.data.dto.BookingData;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportybet.plugin.realsports.betslip.recentcode.RecentCodeHelper", f = "RecentCodeHelper.kt", l = {79}, m = "handleShareResult", v = 2)
public final class og40 extends x1b {
    public Context a;
    public BookingData b;
    public wae c;
    public zha0 d;
    public ArrayList e;
    public /* synthetic */ Object f;
    public final /* synthetic */ pg40 i;
    public int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og40(pg40 pg40Var, x1b x1bVar) {
        super(x1bVar);
        this.i = pg40Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        this.f = obj;
        this.v |= Integer.MIN_VALUE;
        return this.i.a(null, null, null, null, this);
    }
}
