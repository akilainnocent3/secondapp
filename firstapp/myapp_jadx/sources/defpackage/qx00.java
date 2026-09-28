package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes7.dex */
public final class qx00 implements oym {
    public final zrm a;
    public nx00 b;

    public qx00(zrm zrmVar) {
        zrmVar.getClass();
        this.a = zrmVar;
    }

    /* JADX WARN: Code duplicated, block: B:46:0x0103  */
    /* JADX WARN: Code duplicated, block: B:49:0x0114  */
    /* JADX WARN: Code duplicated, block: B:51:0x0120  */
    /* JADX WARN: Code duplicated, block: B:53:0x0132  */
    /* JADX WARN: Code duplicated, block: B:54:0x0137  */
    /* JADX WARN: Code duplicated, block: B:56:0x013b  */
    /* JADX WARN: Code duplicated, block: B:59:0x0148  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oym
    public final Object a(hu00 hu00Var, Function1 function1, x1b x1bVar) {
        ox00 ox00Var;
        List listK;
        List list;
        hu00 hu00Var2;
        Function1 function2;
        Map map;
        int i;
        List list2;
        hu00 hu00Var3;
        Map map2;
        icb0 icb0Var;
        icb0 icb0Var2;
        icb0 icb0Var3;
        String str;
        if (x1bVar instanceof ox00) {
            ox00Var = (ox00) x1bVar;
            int i2 = ox00Var.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ox00Var.v = i2 - Integer.MIN_VALUE;
            } else {
                ox00Var = new ox00(this, x1bVar);
            }
        } else {
            ox00Var = new ox00(this, x1bVar);
        }
        Object objA = ox00Var.f;
        y5b y5bVar = y5b.a;
        int i3 = ox00Var.v;
        boolean zBooleanValue = false;
        Boolean bool = null;
        if (i3 == 0) {
            uj50.b(objA);
            this.b = null;
            int iOrdinal = hu00Var.ordinal();
            if (iOrdinal == 0) {
                listK = b.k("piggy_red_spine", "piggy_red_background_spine");
            } else if (iOrdinal == 1) {
                listK = b.k("piggy_green_spine", "piggy_green_background_spine");
            } else if (iOrdinal == 2) {
                listK = b.k("piggy_blue_spine", "piggy_blue_background_spine");
            } else {
                if (iOrdinal != 3) {
                    uhc.a();
                    return null;
                }
                listK = b.k("piggy_robotic_spine", "piggy_robotic_background_spine");
            }
            list = listK;
            ArrayList arrayListJ0 = CollectionsKt.j0(list, "hammer_spawn_smoke_spine");
            ox00Var.a = hu00Var;
            ox00Var.b = (tje0) function1;
            ox00Var.c = list;
            ox00Var.v = 1;
            objA = this.a.a(arrayListJ0, ox00Var);
            if (objA != y5bVar) {
                hu00Var2 = hu00Var;
                function2 = function1;
            }
            return y5bVar;
        }
        if (i3 == 1) {
            list = ox00Var.c;
            Function1 function3 = (Function1) ox00Var.b;
            hu00Var2 = ox00Var.a;
            uj50.b(objA);
            function2 = function3;
        } else {
            if (i3 == 2) {
                int i4 = ox00Var.e;
                map = ox00Var.d;
                List list3 = ox00Var.c;
                hu00Var2 = ox00Var.a;
                uj50.b(objA);
                i = i4;
                list = list3;
                px00 px00Var = new px00(map, this, null);
                ox00Var.a = hu00Var2;
                ox00Var.b = null;
                ox00Var.c = list;
                ox00Var.d = null;
                ox00Var.e = i;
                ox00Var.v = 3;
                objA = w5b.d(px00Var, ox00Var);
                if (objA != y5bVar) {
                    list2 = list;
                    hu00Var3 = hu00Var2;
                }
                return y5bVar;
            }
            if (i3 != 3) {
                ib5.a("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list2 = ox00Var.c;
            hu00 hu00Var4 = ox00Var.a;
            uj50.b(objA);
            hu00Var3 = hu00Var4;
        }
        map2 = (Map) objA;
        icb0Var = (icb0) map2.get(list2.get(0));
        if (icb0Var != null) {
            icb0Var2 = (icb0) map2.get(list2.get(1));
            if (icb0Var2 != null) {
                icb0Var3 = (icb0) map2.get("hammer_spawn_smoke_spine");
                String str2 = icb0Var.a;
                String str3 = icb0Var.b;
                String str4 = icb0Var2.a;
                String str5 = icb0Var2.b;
                if (icb0Var3 != null) {
                    str = icb0Var3.a;
                } else {
                    str = null;
                }
                this.b = new nx00(str2, str3, str4, str5, str, icb0Var3 != null ? icb0Var3.b : null, hu00Var3);
                bool = Boolean.TRUE;
            }
            if (bool != null) {
                zBooleanValue = bool.booleanValue();
            }
        }
        return Boolean.valueOf(zBooleanValue);
        Map map3 = (Map) objA;
        if (!map3.keySet().containsAll(list)) {
            map3 = null;
        }
        if (map3 != null) {
            ox00Var.a = hu00Var2;
            ox00Var.b = null;
            ox00Var.c = list;
            ox00Var.d = map3;
            ox00Var.e = 0;
            ox00Var.v = 2;
            if (function2.invoke(ox00Var) != y5bVar) {
                map = map3;
                i = 0;
                px00 px00Var2 = new px00(map, this, null);
                ox00Var.a = hu00Var2;
                ox00Var.b = null;
                ox00Var.c = list;
                ox00Var.d = null;
                ox00Var.e = i;
                ox00Var.v = 3;
                objA = w5b.d(px00Var2, ox00Var);
                if (objA != y5bVar) {
                    list2 = list;
                    hu00Var3 = hu00Var2;
                    map2 = (Map) objA;
                    icb0Var = (icb0) map2.get(list2.get(0));
                    if (icb0Var != null) {
                        icb0Var2 = (icb0) map2.get(list2.get(1));
                        if (icb0Var2 != null) {
                            icb0Var3 = (icb0) map2.get("hammer_spawn_smoke_spine");
                            String str6 = icb0Var.a;
                            String str7 = icb0Var.b;
                            String str8 = icb0Var2.a;
                            String str9 = icb0Var2.b;
                            if (icb0Var3 != null) {
                                str = icb0Var3.a;
                            } else {
                                str = null;
                            }
                            this.b = new nx00(str6, str7, str8, str9, str, icb0Var3 != null ? icb0Var3.b : null, hu00Var3);
                            bool = Boolean.TRUE;
                        }
                        if (bool != null) {
                            zBooleanValue = bool.booleanValue();
                        }
                    }
                }
            }
            return y5bVar;
        }
        return Boolean.valueOf(zBooleanValue);
    }

    @Override // defpackage.oym
    public final nx00 b() {
        return this.b;
    }
}
