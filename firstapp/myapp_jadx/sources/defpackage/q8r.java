package defpackage;

import com.sportybet.android.router.Sender;
import com.sportybet.feature.dedicatedteampage.team.data.model.Vc.ACKxwYRsuWyGz;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntrance;
import com.sportybet.feature.luckynumber.placebet.presentation.LNPlaceBetEntranceFromButton;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
@ae80
public final class q8r implements w8r, pit {
    public static final b Companion = new b();
    public static final ttr<php<Object>>[] h;
    public final String a;
    public final LNPlaceBetEntrance b;
    public final Sender c;
    public final LNPlaceBetEntranceFromButton d;
    public final boolean e;
    public final String f;
    public final String g;

    /* JADX INFO: loaded from: classes6.dex */
    @fae
    public static final /* synthetic */ class a implements o1k<q8r> {
        public static final a a;
        private static final pd80 descriptor;

        static {
            a aVar = new a();
            a = aVar;
            kr10 kr10Var = new kr10("com.sportybet.feature.luckynumber.shared.presentation.state.LNScreen.PlaceBet", aVar, 7);
            kr10Var.j("lotteryId", false);
            kr10Var.j("entrance", false);
            kr10Var.j("sender", true);
            kr10Var.j("fromButton", true);
            kr10Var.j("enableAnimation", true);
            kr10Var.j("defaultSelectedMarketGroup", true);
            kr10Var.j("reBetOrderId", true);
            descriptor = kr10Var;
        }

        @Override // defpackage.o1k
        public final php<?>[] childSerializers() {
            ttr<php<Object>>[] ttrVarArr = q8r.h;
            gae0 gae0Var = gae0.a;
            return new php[]{gae0Var, hj5.a(ttrVarArr[1].getValue()), hj5.a(ttrVarArr[2].getValue()), hj5.a(ttrVarArr[3].getValue()), x15.a, hj5.a(gae0Var), hj5.a(gae0Var)};
        }

        @Override // defpackage.tae
        public final Object deserialize(b5d b5dVar) {
            pd80 pd80Var = descriptor;
            dma dmaVarC = b5dVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = q8r.h;
            Object obj = null;
            boolean z = true;
            int i = 0;
            boolean zE = false;
            String strJ = null;
            LNPlaceBetEntrance lNPlaceBetEntrance = null;
            Sender sender = null;
            LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton = null;
            String str = null;
            String str2 = null;
            while (z) {
                int iV = dmaVarC.v(pd80Var);
                switch (iV) {
                    case -1:
                        z = false;
                        continue;
                    case 0:
                        strJ = dmaVarC.j(pd80Var, 0);
                        i |= 1;
                        break;
                    case 1:
                        lNPlaceBetEntrance = (LNPlaceBetEntrance) dmaVarC.n(pd80Var, 1, ttrVarArr[1].getValue(), lNPlaceBetEntrance);
                        i |= 2;
                        break;
                    case 2:
                        sender = (Sender) dmaVarC.n(pd80Var, 2, ttrVarArr[2].getValue(), sender);
                        i |= 4;
                        break;
                    case 3:
                        lNPlaceBetEntranceFromButton = (LNPlaceBetEntranceFromButton) dmaVarC.n(pd80Var, 3, ttrVarArr[3].getValue(), lNPlaceBetEntranceFromButton);
                        i |= 8;
                        break;
                    case 4:
                        zE = dmaVarC.E(pd80Var, 4);
                        i |= 16;
                        break;
                    case 5:
                        str = (String) dmaVarC.n(pd80Var, 5, gae0.a, str);
                        i |= 32;
                        break;
                    case 6:
                        str2 = (String) dmaVarC.n(pd80Var, 6, gae0.a, str2);
                        i |= 64;
                        break;
                    default:
                        jtf0.a(iV);
                        return obj;
                }
                obj = null;
            }
            dmaVarC.b(pd80Var);
            return new q8r(i, strJ, lNPlaceBetEntrance, sender, lNPlaceBetEntranceFromButton, zE, str, str2);
        }

        @Override // defpackage.he80, defpackage.tae
        public final pd80 getDescriptor() {
            return descriptor;
        }

        @Override // defpackage.he80
        public final void serialize(f4g f4gVar, Object obj) {
            q8r q8rVar = (q8r) obj;
            q8rVar.getClass();
            pd80 pd80Var = descriptor;
            fma fmaVarC = f4gVar.c(pd80Var);
            ttr<php<Object>>[] ttrVarArr = q8r.h;
            String str = q8rVar.a;
            String str2 = q8rVar.g;
            String str3 = q8rVar.f;
            boolean z = q8rVar.e;
            LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton = q8rVar.d;
            Sender sender = q8rVar.c;
            fmaVarC.o(pd80Var, 0, str);
            fmaVarC.D(pd80Var, 1, ttrVarArr[1].getValue(), q8rVar.b);
            if (fmaVarC.a(pd80Var) || sender != null) {
                fmaVarC.D(pd80Var, 2, ttrVarArr[2].getValue(), sender);
            }
            if (fmaVarC.a(pd80Var) || lNPlaceBetEntranceFromButton != null) {
                fmaVarC.D(pd80Var, 3, ttrVarArr[3].getValue(), lNPlaceBetEntranceFromButton);
            }
            if (fmaVarC.a(pd80Var) || !z) {
                fmaVarC.i(pd80Var, 4, z);
            }
            if (fmaVarC.a(pd80Var) || str3 != null) {
                fmaVarC.D(pd80Var, 5, gae0.a, str3);
            }
            if (fmaVarC.a(pd80Var) || str2 != null) {
                fmaVarC.D(pd80Var, 6, gae0.a, str2);
            }
            fmaVarC.b(pd80Var);
        }
    }

    /* JADX INFO: loaded from: classes6.dex */
    public static final class b {
        public final php<q8r> serializer() {
            return a.a;
        }
    }

    static {
        a1s a1sVar = a1s.b;
        h = new ttr[]{null, hwr.a(a1sVar, new n8r()), hwr.a(a1sVar, new o8r()), hwr.a(a1sVar, new p8r()), null, null, null};
    }

    public /* synthetic */ q8r(int i, String str, LNPlaceBetEntrance lNPlaceBetEntrance, Sender sender, LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton, boolean z, String str2, String str3) {
        if (3 != (i & 3)) {
            cgo.a(i, 3, a.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = lNPlaceBetEntrance;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = sender;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = lNPlaceBetEntranceFromButton;
        }
        if ((i & 16) == 0) {
            this.e = true;
        } else {
            this.e = z;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str2;
        }
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str3;
        }
    }

    @Override // defpackage.w8r
    public final boolean a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8r)) {
            return false;
        }
        q8r q8rVar = (q8r) obj;
        return Intrinsics.g(this.a, q8rVar.a) && this.b == q8rVar.b && this.c == q8rVar.c && this.d == q8rVar.d && this.e == q8rVar.e && Intrinsics.g(this.f, q8rVar.f) && Intrinsics.g(this.g, q8rVar.g);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        LNPlaceBetEntrance lNPlaceBetEntrance = this.b;
        int iHashCode2 = (iHashCode + (lNPlaceBetEntrance == null ? 0 : lNPlaceBetEntrance.hashCode())) * 31;
        Sender sender = this.c;
        int iHashCode3 = (iHashCode2 + (sender == null ? 0 : sender.hashCode())) * 31;
        LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton = this.d;
        int iA = mtg0.a((iHashCode3 + (lNPlaceBetEntranceFromButton == null ? 0 : lNPlaceBetEntranceFromButton.hashCode())) * 31, 31, this.e);
        String str = this.f;
        int iHashCode4 = (iA + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.g;
        return iHashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaceBet(lotteryId=");
        sb.append(this.a);
        sb.append(", entrance=");
        sb.append(this.b);
        sb.append(ACKxwYRsuWyGz.rmzaNQz);
        sb.append(this.c);
        sb.append(", fromButton=");
        sb.append(this.d);
        sb.append(", enableAnimation=");
        mng.a(", defaultSelectedMarketGroup=", this.f, ", reBetOrderId=", sb, this.e);
        return uf80.a(sb, this.g, ")");
    }

    public q8r(String str, LNPlaceBetEntrance lNPlaceBetEntrance, Sender sender, LNPlaceBetEntranceFromButton lNPlaceBetEntranceFromButton, String str2, String str3, int i) {
        sender = (i & 4) != 0 ? null : sender;
        lNPlaceBetEntranceFromButton = (i & 8) != 0 ? null : lNPlaceBetEntranceFromButton;
        boolean z = (i & 16) != 0;
        str2 = (i & 32) != 0 ? null : str2;
        str3 = (i & 64) != 0 ? null : str3;
        str.getClass();
        this.a = str;
        this.b = lNPlaceBetEntrance;
        this.c = sender;
        this.d = lNPlaceBetEntranceFromButton;
        this.e = z;
        this.f = str2;
        this.g = str3;
    }
}
