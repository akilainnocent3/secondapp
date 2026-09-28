package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@c0d(c = "com.sportybet.feature.luckynumber.lobby.presentation.LNLobbyViewModel$8", f = "LNLobbyViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class rpq extends tje0 implements Function2<ipq, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ spq b;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rpq(v1b v1bVar, spq spqVar) {
        super(2, v1bVar);
        this.b = spqVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        rpq rpqVar = new rpq(v1bVar, this.b);
        rpqVar.a = obj;
        return rpqVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(ipq ipqVar, v1b<? super Unit> v1bVar) {
        return ((rpq) create(ipqVar, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        ipq ipqVar = (ipq) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        int i = ipqVar == null ? -1 : a.a[ipqVar.ordinal()];
        cjr cjrVar = null;
        if (i != -1) {
            if (i == 1) {
                cjrVar = cjr.r.a;
            } else if (i == 2) {
                cjrVar = cjr.q.a;
            } else {
                if (i != 3) {
                    uhc.a();
                    return null;
                }
                cjrVar = cjr.s.a;
            }
        }
        if (cjrVar != null) {
            djr.a(this.b.i, cjrVar);
        }
        return Unit.a;
    }
}
