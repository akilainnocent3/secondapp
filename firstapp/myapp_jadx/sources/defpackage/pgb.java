package defpackage;

import com.sportygames.crash.utils.HeaderPayload;
import com.sportygames.lobby.remote.models.GameDetails;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes7.dex */
@c0d(c = "com.sportygames.crash.CrashFragment$observeGamesSocketResponseHeader$1", f = "CrashFragment.kt", l = {}, m = "invokeSuspend", v = 1)
public final class pgb extends tje0 implements Function2<v5b, v1b<? super Unit>, Object> {
    public final /* synthetic */ fgb a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgb(fgb fgbVar, v1b<? super pgb> v1bVar) {
        super(2, v1bVar);
        this.a = fgbVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        return new pgb(this.a, v1bVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(v5b v5bVar, v1b<? super Unit> v1bVar) {
        return ((pgb) create(v5bVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        final fgb fgbVar = this.a;
        fgbVar.d1().D.f(fgbVar.getViewLifecycleOwner(), new fgb.v(new Function1() { // from class: ogb
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                fgb fgbVar2 = fgbVar;
                String str = (String) obj2;
                if (str != null) {
                    try {
                        if (str.length() != 0) {
                            boolean z = false;
                            if (!StringsKt.M(str, "user-name:", false) && !StringsKt.M(str, "\nuser-name:", false)) {
                                z = true;
                            }
                            if (!z) {
                                fgbVar2.k2 = (HeaderPayload) new eal().e(StringsKt.a0(str, "\nuser-name:"), HeaderPayload.class);
                                GameDetails gameDetails = fgbVar2.i;
                                String name = gameDetails != null ? gameDetails.getName() : null;
                                if (name == null) {
                                    name = "";
                                }
                                String strF = krh0.f(name);
                                HeaderPayload headerPayload = fgbVar2.k2;
                                if (headerPayload != null && fgbVar2.k2()) {
                                    fgbVar2.d1().D1(strF, String.valueOf(headerPayload.getId()));
                                }
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
                return Unit.a;
            }
        }));
        return Unit.a;
    }
}
