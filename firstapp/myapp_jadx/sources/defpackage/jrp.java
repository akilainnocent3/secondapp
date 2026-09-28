package defpackage;

import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.core.model.worldcuptournament.WorldCupTeam;
import com.sportybet.android.gp.tz.R;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import kotlin.collections.b;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes6.dex */
public final class jrp {
    public static final List<Integer> a = b.k(Integer.valueOf(R.string.world_cup_tournament__finals), Integer.valueOf(R.string.world_cup_tournament__semi), Integer.valueOf(R.string.world_cup_tournament__quarter), Integer.valueOf(R.string.world_cup_tournament__last16), Integer.valueOf(R.string.world_cup_tournament__last32));

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public static s5g0 a(wqp wqpVar, LinkedHashMap linkedHashMap, ResourceUiText resourceUiText, boolean z) {
        String str;
        String str2;
        u5g0 u5g0VarB = b(wqpVar.f, linkedHashMap);
        u5g0 u5g0VarB2 = b(wqpVar.g, linkedHashMap);
        Integer num = wqpVar.h;
        String str3 = null;
        if (num != null) {
            int iIntValue = num.intValue();
            Integer num2 = wqpVar.i;
            if (num2 == null) {
                str = null;
            } else {
                int iIntValue2 = num2.intValue();
                if (iIntValue > iIntValue2) {
                    if (u5g0VarB != null) {
                        str2 = u5g0VarB.a;
                        str = str2;
                    } else {
                        str = null;
                    }
                } else if (iIntValue2 <= iIntValue) {
                    Integer num3 = wqpVar.j;
                    if (num3 != null) {
                        int iIntValue3 = num3.intValue();
                        Integer num4 = wqpVar.k;
                        if (num4 != null) {
                            int iIntValue4 = num4.intValue();
                            if (iIntValue3 > iIntValue4) {
                                if (u5g0VarB != null) {
                                    str2 = u5g0VarB.a;
                                    str = str2;
                                }
                            } else if (iIntValue4 > iIntValue3 && u5g0VarB2 != null) {
                                str2 = u5g0VarB2.a;
                                str = str2;
                            }
                        }
                    }
                    str = null;
                } else if (u5g0VarB2 != null) {
                    str2 = u5g0VarB2.a;
                    str = str2;
                } else {
                    str = null;
                }
            }
        } else {
            str = null;
        }
        String str4 = wqpVar.a;
        String str5 = wqpVar.b;
        Integer num5 = wqpVar.h;
        Integer num6 = wqpVar.i;
        Integer num7 = wqpVar.j;
        Integer num8 = wqpVar.k;
        Long l = wqpVar.d;
        if (l != null) {
            str3 = new SimpleDateFormat("dd/MM EEEE HH:mm", Locale.getDefault()).format(new Date(l.longValue()));
            str3.getClass();
        }
        String str6 = str3;
        xqp xqpVar = wqpVar.e;
        xqp xqpVar2 = xqp.d;
        return new s5g0(str4, u5g0VarB, u5g0VarB2, num5, num6, num7, num8, str, str6, xqpVar == xqpVar2, ((xqpVar != xqp.b && xqpVar != xqp.c && xqpVar != xqpVar2) || u5g0VarB == null || u5g0VarB2 == null) ? false : true, str5, resourceUiText, z);
    }

    public static u5g0 b(n7v n7vVar, LinkedHashMap linkedHashMap) {
        String nameCmsKey;
        bgg0 bgg0Var = n7vVar.b;
        if (bgg0Var == null) {
            return null;
        }
        String str = bgg0Var.a;
        WorldCupTeam worldCupTeam = (WorldCupTeam) linkedHashMap.get(str);
        if (worldCupTeam == null || (nameCmsKey = worldCupTeam.getNameCmsKey()) == null) {
            nameCmsKey = bgg0Var.b;
        }
        return new u5g0(str, nameCmsKey, worldCupTeam != null ? worldCupTeam.getFlagUrl() : null, 8);
    }

    public static u5g0 c(u5g0 u5g0Var, String str) {
        boolean z = str != null && Intrinsics.g(u5g0Var.a, str);
        if (u5g0Var.d == z) {
            return u5g0Var;
        }
        String str2 = u5g0Var.a;
        String str3 = u5g0Var.b;
        String str4 = u5g0Var.c;
        str2.getClass();
        str3.getClass();
        return new u5g0(str2, str3, str4, z);
    }
}
