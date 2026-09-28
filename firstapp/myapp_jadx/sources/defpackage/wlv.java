package defpackage;

import android.graphics.Bitmap;
import com.google.protobuf.Reader;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class wlv {
    public final a840 a;
    public final kgt b;

    public wlv(a840 a840Var, pa0 pa0Var, kgt kgtVar) {
        this.a = a840Var;
        this.b = kgtVar;
    }

    public final vlv.c a(nan nanVar, vlv.b bVar, ww90 ww90Var, vy60 vy60Var) {
        boolean zB;
        int iAbs;
        wr5 wr5Var = nanVar.k;
        dm20 dm20Var = nanVar.s;
        Object obj = nanVar.b;
        if (wr5Var.a) {
            vlv vlvVarD = this.a.d();
            vlv.c cVarB = vlvVarD != null ? vlvVarD.b(bVar) : null;
            if (cVarB != null) {
                u7n u7nVar = cVarB.a;
                oe4 oe4Var = u7nVar instanceof oe4 ? (oe4) u7nVar : null;
                if (oe4Var == null) {
                    zB = true;
                } else {
                    Bitmap.Config config = oe4Var.a.getConfig();
                    if (config == null) {
                        config = Bitmap.Config.ARGB_8888;
                    }
                    zB = pa0.b(nanVar, config);
                }
                kgt kgtVar = this.b;
                if (zB) {
                    String str = bVar.b.get("coil#size");
                    if (str == null) {
                        Object obj2 = cVarB.b.get("coil#is_sampled");
                        Boolean bool = obj2 instanceof Boolean ? (Boolean) obj2 : null;
                        if ((bool != null ? bool.booleanValue() : false) || (!Intrinsics.g(ww90Var, ww90.c) && dm20Var != dm20.b)) {
                            int iC = u7nVar.c();
                            int iB = u7nVar.b();
                            ww90 ww90Var2 = u7nVar instanceof oe4 ? (ww90) q4h.a(nanVar, uan.b) : ww90.c;
                            dqe dqeVar = ww90Var.a;
                            int i = dqeVar instanceof dqe.a ? ((dqe.a) dqeVar).a : Reader.READ_DONE;
                            dqe dqeVar2 = ww90Var2.a;
                            int iMin = Math.min(i, dqeVar2 instanceof dqe.a ? ((dqe.a) dqeVar2).a : Reader.READ_DONE);
                            dqe dqeVar3 = ww90Var.b;
                            int i2 = dqeVar3 instanceof dqe.a ? ((dqe.a) dqeVar3).a : Reader.READ_DONE;
                            dqe dqeVar4 = ww90Var2.b;
                            int iMin2 = Math.min(i2, dqeVar4 instanceof dqe.a ? ((dqe.a) dqeVar4).a : Reader.READ_DONE);
                            vlv.c cVar = cVarB;
                            double d = ((double) iMin) / ((double) iC);
                            double d2 = ((double) iMin2) / ((double) iB);
                            int iOrdinal = ((iMin == Integer.MAX_VALUE || iMin2 == Integer.MAX_VALUE) ? vy60.b : vy60Var).ordinal();
                            if (iOrdinal != 0) {
                                if (iOrdinal != 1) {
                                    uhc.a();
                                    return null;
                                }
                                if (d < d2) {
                                    iAbs = Math.abs(iMin - iC);
                                    d2 = d;
                                } else {
                                    iAbs = Math.abs(iMin2 - iB);
                                }
                            } else if (d > d2) {
                                iAbs = Math.abs(iMin - iC);
                                d2 = d;
                            } else {
                                iAbs = Math.abs(iMin2 - iB);
                            }
                            if (iAbs <= 1) {
                                return cVar;
                            }
                            int iOrdinal2 = dm20Var.ordinal();
                            if (iOrdinal2 == 0) {
                                if (d2 == 1.0d) {
                                    return cVar;
                                }
                                if (kgtVar != null) {
                                    kgt.a aVar = kgt.a.b;
                                    if (kgtVar.a().compareTo(aVar) <= 0) {
                                        kgtVar.b("MemoryCacheService", aVar, obj + ": Memory cached image's size (" + iC + ", " + iB + ") does not exactly match the target size (" + iMin + ", " + iMin2 + ").", null);
                                        return null;
                                    }
                                }
                                return null;
                            }
                            if (iOrdinal2 != 1) {
                                uhc.a();
                                return null;
                            }
                            if (d2 <= 1.0d) {
                                return cVar;
                            }
                            if (kgtVar != null) {
                                kgt.a aVar2 = kgt.a.b;
                                if (kgtVar.a().compareTo(aVar2) <= 0) {
                                    kgtVar.b("MemoryCacheService", aVar2, obj + ": Memory cached image's size (" + iC + ", " + iB + ") is smaller than the target size (" + iMin + ", " + iMin2 + ").", null);
                                    return null;
                                }
                            }
                            return null;
                        }
                    } else if (!str.equals(ww90Var.toString())) {
                        if (kgtVar != null) {
                            kgt.a aVar3 = kgt.a.b;
                            if (kgtVar.a().compareTo(aVar3) <= 0) {
                                kgtVar.b("MemoryCacheService", aVar3, obj + ": Memory cached image's size (" + str + ") does not exactly match the target size (" + ww90Var + ").", null);
                                return null;
                            }
                        }
                    }
                    return cVarB;
                }
                if (kgtVar != null) {
                    kgt.a aVar4 = kgt.a.b;
                    if (kgtVar.a().compareTo(aVar4) <= 0) {
                        kgtVar.b("MemoryCacheService", aVar4, obj + ": Cached bitmap is hardware-backed, which is incompatible with the request.", null);
                        return null;
                    }
                }
            }
        }
        return null;
    }

    public final vlv.b b(nan nanVar, Object obj, u2z u2zVar, rpg rpgVar) {
        String strA;
        kgt kgtVar;
        wr5 wr5Var = nanVar.k;
        Map<String, String> map = nanVar.e;
        if (wr5Var != wr5.d) {
            List<Pair<bpp<? extends Object>, ygp<? extends Object>>> list = this.a.d.c;
            int size = list.size();
            int i = 0;
            boolean z = false;
            while (true) {
                if (i >= size) {
                    if (!z && (kgtVar = this.b) != null) {
                        kgt.a aVar = kgt.a.d;
                        if (kgtVar.a().compareTo(aVar) <= 0) {
                            kgtVar.b("MemoryCacheService", aVar, "No keyer is registered for data with type '" + jq40.a(obj.getClass()).k() + "'. Register Keyer<" + jq40.a(obj.getClass()).k() + "> in the component registry to cache the output image in the memory cache.", null);
                        }
                    }
                    strA = null;
                    break;
                }
                Pair<bpp<? extends Object>, ygp<? extends Object>> pair = list.get(i);
                bpp<? extends Object> bppVar = pair.a;
                if (pair.b.h(obj)) {
                    bppVar.getClass();
                    strA = bppVar.a(obj, u2zVar);
                    if (strA != null) {
                        break;
                    }
                    z = true;
                }
                i++;
            }
            if (strA != null) {
                if (((List) q4h.a(nanVar, uan.a)).isEmpty()) {
                    return new vlv.b(strA, map);
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(map);
                linkedHashMap.put("coil#size", u2zVar.b.toString());
                return new vlv.b(strA, linkedHashMap);
            }
        }
        return null;
    }
}
