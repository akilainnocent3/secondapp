package defpackage;

import com.sporty.android.common_ui.uitext.UiText;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.placebet.presentation.stream.LNStreamPlayerViewModel$uiState$1", f = "LNStreamPlayerViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class egr extends tje0 implements kaj<mfr.e, ier, mfr.d, mfr.b, Pair<? extends mfr.a, ? extends Boolean>, v1b<? super mhr>, Object> {
    public /* synthetic */ mfr.e a;
    public /* synthetic */ ier b;
    public /* synthetic */ mfr.d c;
    public /* synthetic */ mfr.b d;
    public /* synthetic */ Pair e;
    public final /* synthetic */ mfr f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public egr(v1b v1bVar, mfr mfrVar) {
        super(6, v1bVar);
        this.f = mfrVar;
    }

    @Override // defpackage.kaj
    public final Object f(mfr.e eVar, ier ierVar, mfr.d dVar, mfr.b bVar, Pair<? extends mfr.a, ? extends Boolean> pair, v1b<? super mhr> v1bVar) {
        egr egrVar = new egr(v1bVar, this.f);
        egrVar.a = eVar;
        egrVar.b = ierVar;
        egrVar.c = dVar;
        egrVar.d = bVar;
        egrVar.e = pair;
        return egrVar.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x0096  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        lk50 lk50Var;
        int i;
        a4r a4rVar;
        y3r bVar;
        z3r bVar2;
        z3r bVar3;
        mfr.e eVar = this.a;
        ier ierVar = this.b;
        mfr.d dVar = this.c;
        mfr.b bVar4 = this.d;
        Pair pair = this.e;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        mfr.a aVar = (mfr.a) pair.a;
        boolean zBooleanValue = ((Boolean) pair.b).booleanValue();
        fgr fgrVar = eVar.a;
        if (fgrVar != null && !fgrVar.equals(fgr.a.a)) {
            if (fgrVar instanceof fgr.b) {
                if (Intrinsics.g(eVar.b, Boolean.TRUE)) {
                    bVar3 = ((aVar.c || aVar.a) && ierVar != null) ? new z3r.b(ierVar, new y3r.b(x3r.a.a), a4r.c.a, aVar.a, aVar.b, null, aVar.e) : z3r.c.a;
                } else {
                    bVar3 = z3r.a.a;
                }
                return new mhr(aVar.d, false, false, bVar3);
            }
            if (fgrVar instanceof fgr.c) {
                String str = ((fgr.c) fgrVar).a;
                if (StringsKt.U(str)) {
                    str = null;
                }
                if (str != null && ierVar != null) {
                    if (dVar == null) {
                        lk50Var = lk50.b.a;
                    } else {
                        if (!Intrinsics.g(dVar.a, str)) {
                            dVar = null;
                        }
                        if (dVar == null || (lk50Var = dVar.b) == null) {
                            lk50Var = lk50.b.a;
                        }
                    }
                    if (zBooleanValue) {
                        a4rVar = a4r.b.a;
                    } else if ((lk50Var instanceof lk50.a) || bVar4.c) {
                        a4rVar = a4r.a.a;
                    } else if ((lk50Var instanceof lk50.b) || (i = bVar4.a) == 2 || i == 1) {
                        a4rVar = a4r.b.a;
                    } else {
                        a4rVar = i == 4 ? a4r.a.a : a4r.c.a;
                    }
                    a4r a4rVar2 = a4rVar;
                    UiText uiText = aVar.d;
                    if (aVar.c || aVar.a) {
                        if (Intrinsics.g(a4rVar2, a4r.b.a)) {
                            bVar = y3r.a.a;
                        } else if (Intrinsics.g(a4rVar2, a4r.a.a)) {
                            bVar = new y3r.b(x3r.d.a);
                        } else {
                            if (!Intrinsics.g(a4rVar2, a4r.c.a)) {
                                uhc.a();
                                return null;
                            }
                            bVar = new y3r.b(bVar4.b ? x3r.b.a : x3r.c.a);
                        }
                        bVar2 = new z3r.b(ierVar, bVar, a4rVar2, aVar.a, aVar.b, bVar4.d, aVar.e);
                    } else {
                        bVar2 = z3r.c.a;
                    }
                    return new mhr(uiText, true, true, bVar2);
                }
            } else {
                uhc.a();
            }
        }
        return null;
    }
}
