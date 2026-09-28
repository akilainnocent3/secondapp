package defpackage;

import com.sporty.android.core.model.realsports.EarlyPayoutConfig;
import com.sporty.android.core.model.realsports.EarlyPayoutConfigFeatures;
import com.sporty.android.core.model.realsports.EarlyPayoutConfigModel;
import com.sporty.android.core.model.realsports.EarlyPayoutMarketMapping;
import com.sporty.android.core.model.realsports.EarlyPayoutProductEnabled;
import com.sportybet.android.data.BannedItemSocket;
import com.twilio.voice.VoiceURLConnection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final class g2k {
    public static final g2k a = new g2k();

    public static final boolean b(EarlyPayoutConfig earlyPayoutConfig) {
        EarlyPayoutProductEnabled enabled;
        if (!c(earlyPayoutConfig) || earlyPayoutConfig == null || (enabled = earlyPayoutConfig.getEnabled()) == null) {
            return false;
        }
        Boolean live = enabled.getLive();
        Boolean bool = Boolean.TRUE;
        return Intrinsics.g(live, bool) || Intrinsics.g(enabled.getPreMatch(), bool);
    }

    public static final boolean c(EarlyPayoutConfig earlyPayoutConfig) {
        List<String> supportSportIds;
        List<EarlyPayoutMarketMapping> marketMapping;
        return (earlyPayoutConfig == null || (supportSportIds = earlyPayoutConfig.getSupportSportIds()) == null || supportSportIds.isEmpty() || (marketMapping = earlyPayoutConfig.getMarketMapping()) == null || marketMapping.isEmpty()) ? false : true;
    }

    public static final Map d(EarlyPayoutConfigModel earlyPayoutConfigModel) {
        EarlyPayoutConfig oneXTwoNeverDown;
        EarlyPayoutConfig doubleChanceOneUp;
        EarlyPayoutConfig overUnder;
        EarlyPayoutConfig oneXTwoTwoUp;
        EarlyPayoutConfig oneXTwoOneUp;
        if (earlyPayoutConfigModel == null) {
            o2g o2gVar = o2g.a;
            o2gVar.getClass();
            return o2gVar;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        EarlyPayoutConfigFeatures features = earlyPayoutConfigModel.getFeatures();
        if (features != null && (oneXTwoOneUp = features.getOneXTwoOneUp()) != null && c(oneXTwoOneUp)) {
            linkedHashMap.put(ckf.a, oneXTwoOneUp);
        }
        EarlyPayoutConfigFeatures features2 = earlyPayoutConfigModel.getFeatures();
        if (features2 != null && (oneXTwoTwoUp = features2.getOneXTwoTwoUp()) != null && c(oneXTwoTwoUp)) {
            linkedHashMap.put(ckf.b, oneXTwoTwoUp);
        }
        EarlyPayoutConfigFeatures features3 = earlyPayoutConfigModel.getFeatures();
        if (features3 != null && (overUnder = features3.getOverUnder()) != null && c(overUnder)) {
            linkedHashMap.put(ckf.c, overUnder);
        }
        EarlyPayoutConfigFeatures features4 = earlyPayoutConfigModel.getFeatures();
        if (features4 != null && (doubleChanceOneUp = features4.getDoubleChanceOneUp()) != null && c(doubleChanceOneUp)) {
            linkedHashMap.put(ckf.d, doubleChanceOneUp);
        }
        EarlyPayoutConfigFeatures features5 = earlyPayoutConfigModel.getFeatures();
        if (features5 != null && (oneXTwoNeverDown = features5.getOneXTwoNeverDown()) != null && c(oneXTwoNeverDown)) {
            linkedHashMap.put(ckf.e, oneXTwoNeverDown);
        }
        return linkedHashMap;
    }

    public static final ArrayList e(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList(l48.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BannedItemSocket bannedItemSocketCopy$default = (BannedItemSocket) it.next();
            String action = bannedItemSocketCopy$default.getAction();
            if (Intrinsics.g(action, "ADD")) {
                bannedItemSocketCopy$default = BannedItemSocket.copy$default(bannedItemSocketCopy$default, null, null, null, true, 7, null);
            } else if (Intrinsics.g(action, VoiceURLConnection.METHOD_TYPE_DELETE)) {
                bannedItemSocketCopy$default = BannedItemSocket.copy$default(bannedItemSocketCopy$default, null, null, null, false, 7, null);
            }
            arrayList.add(bannedItemSocketCopy$default);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r1v1, types: [T, h2k] */
    public Object a(u020 u020Var, final ung ungVar, final vng vngVar, v1b v1bVar) {
        f2k f2kVar;
        if (v1bVar instanceof f2k) {
            f2kVar = (f2k) v1bVar;
            int i = f2kVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                f2kVar.c = i - Integer.MIN_VALUE;
            } else {
                f2kVar = new f2k(this, v1bVar);
            }
        } else {
            f2kVar = new f2k(this, v1bVar);
        }
        Object obj = f2kVar.a;
        y5b y5bVar = y5b.a;
        int i2 = f2kVar.c;
        if (i2 == 0) {
            final dq40 dq40VarA = j6w.a(obj);
            dq40VarA.a = h2k.e;
            Function0 function0 = new Function0() { // from class: d2k
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    Function0 function1;
                    int iOrdinal = ((h2k) dq40VarA.a).ordinal();
                    if (iOrdinal != 0 && iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            Function0 function2 = ungVar;
                            if (function2 != null) {
                                function2.invoke();
                            }
                        } else if (iOrdinal == 3 && (function1 = vngVar) != null) {
                            function1.invoke();
                        }
                    }
                    return Unit.a;
                }
            };
            Function2 function2 = new Function2() { // from class: e2k
                /* JADX WARN: Multi-variable type inference failed */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    T t;
                    m020 m020Var = (m020) obj2;
                    gly glyVar = (gly) obj3;
                    m020Var.getClass();
                    m020Var.a();
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (glyVar.a >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (glyVar.a & 4294967295L));
                    if (StrictMath.abs(fIntBitsToFloat) <= StrictMath.abs(fIntBitsToFloat2)) {
                        t = fIntBitsToFloat2 > 0.0f ? h2k.a : h2k.b;
                    } else {
                        t = fIntBitsToFloat > 0.0f ? h2k.d : h2k.c;
                    }
                    dq40VarA.a = t;
                    return Unit.a;
                }
            };
            f2kVar.c = 1;
            if (y8f.e(u020Var, new f8f(0), function0, new g8f(0), function2, f2kVar) == y5bVar) {
                return y5bVar;
            }
        } else {
            if (i2 != 1) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            uj50.b(obj);
        }
        return Unit.a;
    }
}
