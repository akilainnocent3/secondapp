package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$tabState$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class xqq extends tje0 implements iaj<fpq, gsq, b7r, v1b<? super hpq>, Object> {
    public /* synthetic */ fpq a;
    public /* synthetic */ gsq b;
    public /* synthetic */ b7r c;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[fpq.values().length];
            try {
                iArr[fpq.b.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[fpq.c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.iaj
    public final Object d(fpq fpqVar, gsq gsqVar, b7r b7rVar, v1b<? super hpq> v1bVar) {
        xqq xqqVar = new xqq(4, v1bVar);
        xqqVar.a = fpqVar;
        xqqVar.b = gsqVar;
        xqqVar.c = b7rVar;
        return xqqVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        fpq fpqVar = this.a;
        gsq gsqVar = this.b;
        b7r b7rVar = this.c;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = fpqVar == null ? -1 : a.a[fpqVar.ordinal()];
        if (i == -1) {
            return new gsq.c(jxp.a.a, n1a0.c, vch0.a, new mmq.a(n1a0.c));
        }
        if (i == 1) {
            return gsqVar;
        }
        if (i == 2) {
            return b7rVar;
        }
        uhc.a();
        return null;
    }
}
