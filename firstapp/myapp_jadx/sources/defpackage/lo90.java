package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;

/* JADX INFO: loaded from: classes5.dex */
public final class lo90 {

    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cd3.values().length];
            try {
                cd3.a aVar = cd3.b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                cd3.a aVar2 = cd3.b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                cd3.a aVar3 = cd3.b;
                iArr[3] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                cd3.a aVar4 = cd3.b;
                iArr[4] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                cd3.a aVar5 = cd3.b;
                iArr[2] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            a = iArr;
        }
    }

    public static List a(String str, zji.b bVar) {
        String str2;
        String strA = fu5.a("[^AB]", str, "");
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < strA.length(); i++) {
            char cCharAt = strA.charAt(i);
            zji zjiVar = null;
            Boolean bool = cCharAt != 'A' ? cCharAt != 'B' ? null : Boolean.FALSE : Boolean.TRUE;
            if (bool != null) {
                boolean zBooleanValue = bool.booleanValue();
                zji.a aVar = zBooleanValue ? zji.a.a : zji.a.b;
                if (zBooleanValue) {
                    sji sjiVar = sji.KICK_OFF_LOGO;
                    str2 = "lottie/football_home_goal.lottie";
                } else {
                    sji sjiVar2 = sji.KICK_OFF_LOGO;
                    str2 = "lottie/football_away_goal.lottie";
                }
                zjiVar = new zji(str2, bVar, aVar, zji.c.a);
            }
            if (zjiVar != null) {
                arrayList.add(zjiVar);
            }
        }
        if (arrayList.size() >= 2) {
            return arrayList;
        }
        if (arrayList.isEmpty()) {
            sji sjiVar3 = sji.KICK_OFF_LOGO;
            zji.a aVar2 = zji.a.a;
            zji.c cVar = zji.c.b;
            return b.k(new zji("lottie/football_home_no_goal.lottie", bVar, aVar2, cVar), new zji("lottie/football_away_no_goal.lottie", bVar, zji.a.b, cVar));
        }
        zji.a aVar3 = ((zji) CollectionsKt.T(arrayList)).c;
        zji.a aVar4 = zji.a.a;
        if (aVar3 == aVar4) {
            sji sjiVar4 = sji.KICK_OFF_LOGO;
            return CollectionsKt.j0(arrayList, new zji("lottie/football_away_no_goal.lottie", bVar, zji.a.b, zji.c.b));
        }
        sji sjiVar5 = sji.KICK_OFF_LOGO;
        return CollectionsKt.i0(arrayList, kotlin.collections.a.c(new zji("lottie/football_home_no_goal.lottie", bVar, aVar4, zji.c.b)));
    }
}
