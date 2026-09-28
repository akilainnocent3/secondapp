package defpackage;

import com.sporty.android.common_ui.uitext.ConcatUiText;
import com.sporty.android.common_ui.uitext.ResourceUiText;
import com.sporty.android.common_ui.uitext.StringUiText;
import com.sporty.android.common_ui.uitext.UiText;
import com.sportybet.android.gp.tz.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.loyalty.home.BetslipCustomizationStateHandler$section$model$1", f = "BetslipCustomizationStateHandler.kt", l = {}, m = "invokeSuspend", v = 2)
public final class mo3 extends tje0 implements jaj<do3.a, Boolean, Set<? extends String>, Long, v1b<? super oo3>, Object> {
    public /* synthetic */ do3.a a;
    public /* synthetic */ boolean b;
    public /* synthetic */ Set c;
    public /* synthetic */ Long d;
    public final /* synthetic */ do3 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mo3(do3 do3Var, v1b<? super mo3> v1bVar) {
        super(5, v1bVar);
        this.e = do3Var;
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        long j;
        Object next;
        char c;
        oo3.b bVar;
        oo3.d dVar;
        oo3 oo3Var;
        oo3.c cVar;
        do3.a aVar = this.a;
        boolean z = this.b;
        Set set = this.c;
        Long l = this.d;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        no3 no3Var = this.e.b;
        jw3 jw3Var = aVar.b;
        wy3 wy3Var = aVar.a;
        oo3.b bVar2 = (jw3Var == null || !jw3Var.c) ? (jw3Var == null || !jw3Var.b) ? oo3.b.c : oo3.b.a : oo3.b.b;
        boolean z2 = jw3Var != null ? jw3Var.a : false;
        bnh0 bnh0Var = no3Var.a;
        wy3Var.getClass();
        List<iw3> list = wy3Var.b;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                j = 0;
                next = null;
                break;
            }
            next = it.next();
            j = 0;
        } while (((iw3) next).a != 0);
        iw3 iw3Var = (iw3) next;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (((iw3) obj2).a != j) {
                arrayList.add(obj2);
            }
        }
        int i = 10;
        if (arrayList.isEmpty() && iw3Var == null) {
            bVar = bVar2;
            c = 1;
            oo3Var = null;
        } else {
            boolean z3 = wy3Var.a > 0;
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            c = 1;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj3 = arrayList.get(i2);
                i2++;
                String str = ((iw3) obj3).d;
                Object objA = linkedHashMap.get(str);
                if (objA == null) {
                    objA = r9i.a(str, linkedHashMap);
                }
                ((List) objA).add(obj3);
            }
            ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                String str2 = (String) entry.getKey();
                List<iw3> list2 = (List) entry.getValue();
                ArrayList arrayList3 = new ArrayList(l48.r(list2, i));
                for (iw3 iw3Var2 : list2) {
                    if (!z2) {
                        cVar = oo3.c.d;
                    } else if (iw3Var2.f) {
                        cVar = oo3.c.c;
                    } else {
                        cVar = iw3Var2.e ? oo3.c.b : oo3.c.a;
                    }
                    Long l2 = l;
                    boolean z4 = z3;
                    long j2 = iw3Var2.a;
                    arrayList3.add(new oo3.d(j2, iw3Var2.c, bnh0Var.e(iw3Var2.b), cVar, no3.a(cVar), l2 != null && j2 == l2.longValue(), cVar != oo3.c.a || z4, j2 == j));
                    l = l2;
                    z3 = z4;
                }
                arrayList2.add(new oo3.a(str2, false, arrayList3));
                l = l;
                z3 = z3;
                i = 10;
            }
            Long l3 = l;
            bVar = bVar2;
            int i3 = wy3Var.a;
            ConcatUiText concatUiText = new ConcatUiText(new UiText[]{vch0.d(String.valueOf(i3)), new ResourceUiText(R.string.page_loyalty__x_pick)});
            if (iw3Var != null) {
                boolean z5 = iw3Var.f;
                long j3 = iw3Var.a;
                oo3.c cVar2 = z5 ? oo3.c.c : oo3.c.b;
                dVar = new oo3.d(j3, iw3Var.c, bnh0Var.e(iw3Var.b), cVar2, no3.a(cVar2), l3 != null && j3 == l3.longValue(), !z5, j3 == j);
            } else {
                dVar = null;
            }
            oo3Var = new oo3(bVar, i3, concatUiText, z, z2, arrayList2, dVar);
        }
        if (oo3Var == null) {
            int i4 = wy3Var.a;
            StringUiText stringUiTextD = vch0.d(String.valueOf(i4));
            ResourceUiText resourceUiText = new ResourceUiText(R.string.page_loyalty__x_pick);
            UiText[] uiTextArr = new UiText[2];
            uiTextArr[0] = stringUiTextD;
            uiTextArr[c] = resourceUiText;
            oo3Var = new oo3(bVar, i4, new ConcatUiText(uiTextArr), z, z2, m2g.a, 64);
        }
        List<oo3.a> list3 = oo3Var.f;
        ArrayList arrayList4 = new ArrayList(l48.r(list3, 10));
        for (oo3.a aVar2 : list3) {
            boolean zContains = set.contains(aVar2.a);
            String str3 = aVar2.a;
            List<oo3.d> list4 = aVar2.c;
            str3.getClass();
            arrayList4.add(new oo3.a(str3, zContains, list4));
        }
        oo3.b bVar3 = oo3Var.a;
        int i5 = oo3Var.b;
        UiText uiText = oo3Var.c;
        boolean z6 = oo3Var.d;
        boolean z7 = oo3Var.e;
        oo3.d dVar2 = oo3Var.g;
        bVar3.getClass();
        uiText.getClass();
        return new oo3(bVar3, i5, uiText, z6, z7, arrayList4, dVar2);
    }

    @Override // defpackage.jaj
    public final Object l(do3.a aVar, Boolean bool, Set<? extends String> set, Long l, v1b<? super oo3> v1bVar) {
        boolean zBooleanValue = bool.booleanValue();
        mo3 mo3Var = new mo3(this.e, v1bVar);
        mo3Var.a = aVar;
        mo3Var.b = zBooleanValue;
        mo3Var.c = set;
        mo3Var.d = l;
        return mo3Var.invokeSuspend(Unit.a);
    }
}
