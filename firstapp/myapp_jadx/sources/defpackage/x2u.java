package defpackage;

import com.sportybet.android.gp.tz.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.LoyaltyViewModel$4", f = "LoyaltyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class x2u extends tje0 implements Function2<m0u, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ b3u b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x2u(v1b v1bVar, b3u b3uVar) {
        super(2, v1bVar);
        this.b = b3uVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        x2u x2uVar = new x2u(v1bVar, this.b);
        x2uVar.a = obj;
        return x2uVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(m0u m0uVar, v1b<? super Unit> v1bVar) {
        return ((x2u) create(m0uVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        m0u m0uVar = (m0u) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        this.b.E.a(new jgm.c(R.string.page_loyalty__mission_tier_mismatch_toast, new Integer(d720.a(m0uVar)), 4));
        return Unit.a;
    }
}
