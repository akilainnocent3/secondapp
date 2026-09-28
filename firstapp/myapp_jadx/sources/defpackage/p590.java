package defpackage;

import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import java.util.Arrays;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class p590 {
    public static final hfs a(List list, List list2, int i, long j, Function1 function1, a aVar, int i2, int i3) {
        Function1 function2;
        hfs hfsVar;
        float f = (i3 & 2) != 0 ? 1000.0f : 40.0f;
        List listK = (i3 & 4) != 0 ? null : list;
        List list3 = (i3 & 8) != 0 ? null : list2;
        int i4 = (i3 & 16) != 0 ? 800 : i;
        long j2 = (i3 & 32) != 0 ? 0L : j;
        if ((i3 & 64) != 0) {
            Object objY = aVar.y();
            if (objY == a.C0041a.a) {
                objY = new o590();
                aVar.r(objY);
            }
            function2 = (Function1) objY;
        } else {
            function2 = function1;
        }
        aVar.N(-528983397);
        if (listK == null) {
            aVar.N(-432705602);
            listK = b.k(new j58(c68.a(R.color.skeleton_load_start, aVar)), new j58(c68.a(R.color.skeleton_load_end, aVar)), new j58(c68.a(R.color.skeleton_load_start, aVar)));
            aVar.H();
        } else {
            aVar.N(-432706129);
            aVar.H();
        }
        List list4 = listK;
        egn.a aVarA = kgn.a(kgn.b("", aVar, 0), 0.0f, f, yi0.a(yi0.e(i4, 0, null, 6), l850.a, 0L, 4), "", aVar, ((i2 << 3) & 896) | 28728, 0);
        if (list3 == null || list3.size() != list4.size()) {
            hfsVar = new hfs(list4, null, j2, ((gly) function2.invoke(((x5a0) aVarA.c).getValue())).a, 0);
        } else {
            Pair[] pairArr = (Pair[]) CollectionsKt.H0(list3, list4).toArray(new Pair[0]);
            hfsVar = ya5.a.e((Pair[]) Arrays.copyOf(pairArr, pairArr.length), j2, ((gly) function2.invoke(((x5a0) aVarA.c).getValue())).a, 8);
        }
        aVar.H();
        return hfsVar;
    }
}
