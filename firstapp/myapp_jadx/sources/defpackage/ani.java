package defpackage;

import com.sporty.android.core.model.loyalty.RewardShowOffData;
import com.sporty.android.core.model.service.CountryCodeName;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.footballgame.FootballViewModel$4", f = "FootballViewModel.kt", l = {}, m = "invokeSuspend", v = 2)
public final class ani extends tje0 implements Function2<lk50<? extends Pair<? extends kp7, ? extends RewardShowOffData>>, v1b<? super Unit>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ dni b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ani(v1b v1bVar, dni dniVar) {
        super(2, v1bVar);
        this.b = dniVar;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        ani aniVar = new ani(v1bVar, this.b);
        aniVar.a = obj;
        return aniVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(lk50<? extends Pair<? extends kp7, ? extends RewardShowOffData>> lk50Var, v1b<? super Unit> v1bVar) {
        return ((ani) create(lk50Var, v1bVar)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        Object value;
        smi aVar;
        Object value2;
        Object value3;
        smi bVar;
        dni dniVar = this.b;
        wwd0 wwd0Var = dniVar.G;
        lk50 lk50Var = (lk50) this.a;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        if (lk50Var instanceof lk50.a) {
            wwd0 wwd0Var2 = dniVar.C;
            dbi.a aVar2 = new dbi.a(((lk50.a) lk50Var).b);
            wwd0Var2.getClass();
            wwd0Var2.k(null, aVar2);
        } else if (!Intrinsics.g(lk50Var, lk50.b.a)) {
            if (!(lk50Var instanceof lk50.c)) {
                uhc.a();
                return null;
            }
            Pair pair = (Pair) ((lk50.c) lk50Var).a;
            kp7 kp7Var = (kp7) pair.a;
            RewardShowOffData rewardShowOffData = (RewardShowOffData) pair.b;
            ((x5a0) dniVar.J).setValue(new es50.b(rewardShowOffData));
            boolean z = dniVar.B.d;
            wwd0 wwd0Var3 = dniVar.D;
            if (z) {
                do {
                    value3 = wwd0Var3.getValue();
                    bVar = (smi) value3;
                    smi.b bVar2 = (smi.b) (!(bVar instanceof smi.b) ? null : bVar);
                    if (bVar2 != null) {
                        CountryCodeName countryCodeName = bVar2.a;
                        boolean z2 = bVar2.b;
                        countryCodeName.getClass();
                        bVar = new smi.b(countryCodeName, z2, kp7Var, rewardShowOffData);
                    }
                } while (!wwd0Var3.g(value3, bVar));
            } else {
                do {
                    value = wwd0Var3.getValue();
                    aVar = (smi) value;
                    smi.a aVar3 = (smi.a) (!(aVar instanceof smi.a) ? null : aVar);
                    if (aVar3 != null) {
                        String str = aVar3.a;
                        String str2 = aVar3.b;
                        CountryCodeName countryCodeName2 = aVar3.d;
                        str.getClass();
                        str2.getClass();
                        countryCodeName2.getClass();
                        aVar = new smi.a(str, str2, kp7Var, countryCodeName2, rewardShowOffData);
                    }
                } while (!wwd0Var3.g(value, aVar));
            }
            if (wwd0Var.getValue() == py90.b) {
                do {
                    value2 = wwd0Var.getValue();
                } while (!wwd0Var.g(value2, py90.c));
            }
        }
        return Unit.a;
    }
}
