package defpackage;

import kotlin.Unit;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$lotteryListState$1", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class aqq extends tje0 implements jaj<ipq, mmq, mmq, mmq, v1b<? super mmq>, Object> {
    public /* synthetic */ ipq a;
    public /* synthetic */ mmq b;
    public /* synthetic */ mmq c;
    public /* synthetic */ mmq d;

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[ipq.values().length];
            try {
                iArr[ipq.Favorites.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ipq.Countries.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ipq.NextDraw.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            a = iArr;
        }
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ipq ipqVar = this.a;
        mmq mmqVar = this.b;
        mmq mmqVar2 = this.c;
        mmq mmqVar3 = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = ipqVar == null ? -1 : a.a[ipqVar.ordinal()];
        if (i == -1) {
            return new mmq.e(n1a0.c);
        }
        if (i == 1) {
            return mmqVar3;
        }
        if (i == 2) {
            return mmqVar;
        }
        if (i == 3) {
            return mmqVar2;
        }
        uhc.a();
        return null;
    }

    @Override // defpackage.jaj
    public final Object l(ipq ipqVar, mmq mmqVar, mmq mmqVar2, mmq mmqVar3, v1b<? super mmq> v1bVar) {
        aqq aqqVar = new aqq(5, v1bVar);
        aqqVar.a = ipqVar;
        aqqVar.b = mmqVar;
        aqqVar.c = mmqVar2;
        aqqVar.d = mmqVar3;
        return aqqVar.invokeSuspend(Unit.a);
    }
}
