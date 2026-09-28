package defpackage;

import com.sporty.android.core.model.config.firebase.RemoteEnabledConfig;
import com.sporty.android.core.model.json.JsonSerializeService;
import com.sporty.android.core.model.realsports.EarlyPayoutConfig;
import com.sporty.android.core.model.realsports.EarlyPayoutConfigModel;
import com.sporty.android.core.model.realsports.EarlyPayoutMarketMapping;
import com.sporty.android.core.model.realsports.EarlyPayoutProductEnabled;
import com.sportybet.plugin.realsports.onetwoup.domain.model.OneTwoUpDisplayConfig;
import com.sportybet.plugin.realsports.onetwoup.domain.model.OneTwoUpDisplayConfigSet;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class ojf implements mjf {
    public final k650 a;
    public final JsonSerializeService b;
    public final psm c;
    public final LinkedHashMap d = new LinkedHashMap();
    public final LinkedHashMap e = new LinkedHashMap();

    public ojf(k650 k650Var, JsonSerializeService jsonSerializeService, psm psmVar) {
        this.a = k650Var;
        this.b = jsonSerializeService;
        this.c = psmVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v15, types: [zi50$b] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v19, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r3v24 */
    /* JADX WARN: Type inference failed for: r9v13 */
    @Override // defpackage.mjf
    public final boolean a(ckf ckfVar) {
        String str;
        Map linkedHashMap;
        List<OneTwoUpDisplayConfig> countries;
        ?? bVar;
        Iterable iterable;
        Object bVar2;
        LinkedHashMap linkedHashMap2 = this.e;
        Object objValueOf = linkedHashMap2.get(ckfVar);
        if (objValueOf == null) {
            int iOrdinal = ckfVar.ordinal();
            boolean zBooleanValue = false;
            if (iOrdinal == 0) {
                str = "one_up_display_enabled";
            } else if (iOrdinal == 1) {
                str = "two_up_display_enabled";
            } else if (iOrdinal == 2) {
                str = "early_goal_enabled";
            } else if (iOrdinal == 3) {
                str = "double_chance_one_up_enabled";
            } else {
                if (iOrdinal != 4) {
                    uhc.a();
                    return false;
                }
                str = "never_down_display_enabled";
            }
            int iOrdinal2 = ckfVar.ordinal();
            k650 k650Var = this.a;
            if (iOrdinal2 == 0 || iOrdinal2 == 1) {
                String upperCase = StringsKt.t0(this.c.getCountryCode().getCode()).toString().toUpperCase(Locale.ROOT);
                upperCase.getClass();
                Type type = new njf().getType();
                type.getClass();
                OneTwoUpDisplayConfigSet oneTwoUpDisplayConfigSet = (OneTwoUpDisplayConfigSet) k650Var.f(str, type);
                if (oneTwoUpDisplayConfigSet == null || (countries = oneTwoUpDisplayConfigSet.getCountries()) == null) {
                    linkedHashMap = o2g.a;
                    linkedHashMap.getClass();
                } else {
                    int iA = jpu.a(l48.r(countries, 10));
                    if (iA < 16) {
                        iA = 16;
                    }
                    linkedHashMap = new LinkedHashMap(iA);
                    for (OneTwoUpDisplayConfig oneTwoUpDisplayConfig : countries) {
                        String upperCase2 = StringsKt.t0(oneTwoUpDisplayConfig.getCountry()).toString().toUpperCase(Locale.ROOT);
                        upperCase2.getClass();
                        linkedHashMap.put(upperCase2, Boolean.valueOf(oneTwoUpDisplayConfig.getValue()));
                    }
                }
                Boolean bool = (Boolean) linkedHashMap.get(upperCase);
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                }
            } else {
                if (iOrdinal2 != 2 && iOrdinal2 != 3 && iOrdinal2 != 4) {
                    uhc.a();
                    return false;
                }
                String strG = k650Var.g(str);
                JsonSerializeService jsonSerializeService = this.b;
                Object obj = null;
                if (strG.length() == 0) {
                    iterable = m2g.a;
                } else {
                    try {
                        zi50.a aVar = zi50.b;
                        bcp bcpVar = (bcp) qva.c(strG).d().a.get("versionControl");
                        bcpVar.getClass();
                        bVar = new ArrayList();
                        ArrayList<tcp> arrayList = bcpVar.a;
                        int size = arrayList.size();
                        int i = 0;
                        while (i < size) {
                            tcp tcpVar = arrayList.get(i);
                            i++;
                            tcp tcpVar2 = tcpVar;
                            try {
                                zi50.a aVar2 = zi50.b;
                                bVar2 = jsonSerializeService.fromJson(tcpVar2.toString(), (Class<Object>) RemoteEnabledConfig.class);
                            } catch (Throwable th) {
                                zi50.a aVar3 = zi50.b;
                                bVar2 = new zi50.b(th);
                            }
                            if (bVar2 instanceof zi50.b) {
                                bVar2 = null;
                            }
                            if (bVar2 != null) {
                                bVar.add(bVar2);
                            }
                        }
                    } catch (Throwable th2) {
                        zi50.a aVar4 = zi50.b;
                        bVar = new zi50.b(th2);
                    }
                    m2g m2gVar = m2g.a;
                    zi50.a aVar5 = zi50.b;
                    boolean z = bVar instanceof zi50.b;
                    ?? r3 = bVar;
                    if (z) {
                        r3 = m2gVar;
                    }
                    iterable = (List) r3;
                }
                for (Object obj2 : iterable) {
                    if (Intrinsics.g(((RemoteEnabledConfig) obj2).getVersion(), "v1")) {
                        obj = obj2;
                        break;
                    }
                }
                RemoteEnabledConfig remoteEnabledConfig = (RemoteEnabledConfig) obj;
                if (remoteEnabledConfig != null) {
                    zBooleanValue = remoteEnabledConfig.getEnabled();
                }
            }
            objValueOf = Boolean.valueOf(zBooleanValue);
            linkedHashMap2.put(ckfVar, objValueOf);
        }
        return ((Boolean) objValueOf).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    @Override // defpackage.mjf
    public final boolean b(ckf ckfVar, String str, String str2, boolean z) {
        String str3;
        boolean zG;
        Object next;
        if (e(ckfVar, z)) {
            EarlyPayoutConfig earlyPayoutConfig = (EarlyPayoutConfig) this.d.get(ckfVar);
            if (str != null && str2 != null && earlyPayoutConfig != null) {
                List<String> supportSportIds = earlyPayoutConfig.getSupportSportIds();
                Object obj = null;
                if (supportSportIds != null) {
                    Iterator<T> it = supportSportIds.iterator();
                    do {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                    } while (!Intrinsics.g((String) next, str));
                    str3 = (String) next;
                } else {
                    str3 = null;
                }
                boolean z2 = str3 != null;
                if (z) {
                    EarlyPayoutProductEnabled enabled = earlyPayoutConfig.getEnabled();
                    if (enabled != null) {
                        zG = Intrinsics.g(enabled.getLive(), Boolean.TRUE);
                    } else {
                        zG = false;
                    }
                } else {
                    EarlyPayoutProductEnabled enabled2 = earlyPayoutConfig.getEnabled();
                    if (enabled2 != null) {
                        zG = Intrinsics.g(enabled2.getPreMatch(), Boolean.TRUE);
                    } else {
                        zG = false;
                    }
                }
                List<EarlyPayoutMarketMapping> marketMapping = earlyPayoutConfig.getMarketMapping();
                if (marketMapping != null) {
                    for (Object obj2 : marketMapping) {
                        EarlyPayoutMarketMapping earlyPayoutMarketMapping = (EarlyPayoutMarketMapping) obj2;
                        if (Intrinsics.g(earlyPayoutMarketMapping.getSourceMarketId(), str2) || Intrinsics.g(earlyPayoutMarketMapping.getMappedMarketId(), str2)) {
                            obj = obj2;
                            break;
                        }
                    }
                    obj = (EarlyPayoutMarketMapping) obj;
                }
                boolean z3 = obj != null;
                if (z2 && zG && z3) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.mjf
    public final EarlyPayoutConfig c() {
        return (EarlyPayoutConfig) this.d.get(ckf.c);
    }

    @Override // defpackage.mjf
    public final boolean d(ckf ckfVar) {
        return e(ckfVar, true) || e(ckfVar, false);
    }

    @Override // defpackage.mjf
    public final boolean e(ckf ckfVar, boolean z) {
        EarlyPayoutProductEnabled enabled;
        boolean zG;
        EarlyPayoutConfig earlyPayoutConfig = (EarlyPayoutConfig) this.d.get(ckfVar);
        if (!g2k.c(earlyPayoutConfig) || earlyPayoutConfig == null || (enabled = earlyPayoutConfig.getEnabled()) == null) {
            zG = false;
        } else {
            zG = z ? Intrinsics.g(enabled.getLive(), Boolean.TRUE) : Intrinsics.g(enabled.getPreMatch(), Boolean.TRUE);
        }
        return zG && a(ckfVar);
    }

    @Override // defpackage.mjf
    public final void f(EarlyPayoutConfigModel earlyPayoutConfigModel) {
        if (earlyPayoutConfigModel == null) {
            return;
        }
        Map mapD = g2k.d(earlyPayoutConfigModel);
        LinkedHashMap linkedHashMap = this.d;
        linkedHashMap.clear();
        linkedHashMap.putAll(mapD);
        this.e.clear();
    }
}
