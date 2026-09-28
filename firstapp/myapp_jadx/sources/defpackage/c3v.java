package defpackage;

import com.sportybet.android.instantwin.newtork.model.tracking.InstantWinBizTypeTag;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sportybet.android.instantwin.presentation.eventdetails.MatchEventDetailViewModel$5", f = "MatchEventDetailViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class c3v extends tje0 implements Function2<String, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ m3v b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3v(v1b v1bVar, m3v m3vVar) {
        super(2, v1bVar);
        this.b = m3vVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        c3v c3vVar = new c3v(v1bVar, this.b);
        c3vVar.a = obj;
        return c3vVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(String str, v1b<? super Unit> v1bVar) {
        return ((c3v) create(str, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        m3v m3vVar = this.b;
        u0v u0vVar = m3vVar.A;
        x1v x1vVar = m3vVar.M;
        if (x1vVar != null) {
            u0vVar.f.remove(x1vVar);
            m3vVar.M = null;
        }
        if (str != null && str.length() != 0) {
            m3vVar.b.U0(str);
        }
        x1v x1vVar2 = new x1v(str == null ? "" : str, m3vVar.K);
        m3vVar.M = x1vVar2;
        u0vVar.f.add(x1vVar2);
        s8o s8oVar = m3vVar.e;
        n4p n4pVar = u0vVar.b;
        str.getClass();
        s8oVar.getClass();
        nqc nqcVar = u0vVar.k.get(str) != null ? new nqc(u0vVar.d(str)) : null;
        if (nqcVar != null) {
            u0vVar.h(str, nqcVar);
        } else {
            u0vVar.h(str, new lqc());
            InstantWinBizTypeTag instantWinBizTypeTag = new InstantWinBizTypeTag(vcj.a(n4pVar.c()));
            (u0vVar.a.isLogin() ? s8oVar.s(n4pVar.c(), str, 16, instantWinBizTypeTag) : s8oVar.f(n4pVar.c(), str, 16, instantWinBizTypeTag)).G(new t0v(u0vVar, str));
        }
        return Unit.a;
    }
}
