package com.sportybet.feature.loyalty.impl.bettingstreak;

import android.os.Bundle;
import androidx.compose.runtime.a;
import com.sportybet.android.gp.tz.R;
import com.sportybet.feature.loyalty.impl.bettingstreak.BettingStreakActivity;
import defpackage.azm;
import defpackage.bb40;
import defpackage.elf;
import defpackage.k9j;
import defpackage.l48;
import defpackage.op8;
import defpackage.rlf;
import defpackage.xml;
import defpackage.zn8;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/sportybet/feature/loyalty/impl/bettingstreak/BettingStreakActivity;", "Lpy1;", "Lrlf;", "Lbb40;", "Lk9j;", "<init>", "()V", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
public final class BettingStreakActivity extends xml implements rlf, bb40, k9j {
    public static final /* synthetic */ int c = 0;
    public azm b;

    @Override // defpackage.py1, defpackage.r1k, defpackage.hrl, androidx.fragment.app.e, defpackage.rn8, defpackage.yn8, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        elf.b(this, null, 3);
        final Boolean boolValueOf = getIntent().hasExtra("showNewBadgeOnAlert") ? Boolean.valueOf(getIntent().getBooleanExtra("showNewBadgeOnAlert", false)) : null;
        List listK = b.k(Integer.valueOf(R.string.page_loyalty__loyalty_daily_streak_banner), Integer.valueOf(R.string.page_loyalty__repair_success_banner_level_1), Integer.valueOf(R.string.page_loyalty__repair_success_banner_level_2), Integer.valueOf(R.string.page_loyalty__repair_success_banner_level_3), Integer.valueOf(R.string.page_loyalty__repair_success_banner_level_4), Integer.valueOf(R.string.page_loyalty__repair_success_banner_level_5));
        final ArrayList arrayList = new ArrayList(l48.r(listK, 10));
        Iterator it = listK.iterator();
        while (it.hasNext()) {
            arrayList.add(getCMSString(((Number) it.next()).intValue(), new Object[0]));
        }
        zn8.a(this, new op8(161030284, new Function2() { // from class: j04
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                a aVar = (a) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i = BettingStreakActivity.c;
                if (aVar.q(iIntValue & 1, (iIntValue & 3) != 2)) {
                    final Boolean bool = boolValueOf;
                    final BettingStreakActivity bettingStreakActivity = this;
                    final ArrayList arrayList2 = arrayList;
                    j44.a(6, pp8.b(1222022917, new Function2() { // from class: k04
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj3, Object obj4) {
                            a aVar2 = (a) obj3;
                            int iIntValue2 = ((Integer) obj4).intValue();
                            int i2 = BettingStreakActivity.c;
                            int i3 = 0;
                            if (aVar2.q(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                Object objY = aVar2.y();
                                a.C0041a.C0042a c0042a = a.C0041a.a;
                                if (objY == c0042a) {
                                    uag uagVar = q04.c;
                                    ArrayList arrayList3 = new ArrayList(l48.r(uagVar, 10));
                                    Iterator<T> it2 = uagVar.iterator();
                                    while (it2.hasNext()) {
                                        arrayList3.add(((q04) it2.next()).a);
                                    }
                                    objY = CollectionsKt.i0(arrayList2, CollectionsKt.j0(arrayList3, "https://s.sporty.net/cms/me_page_banner_entrance_d5775859e3.png"));
                                    aVar2.r(objY);
                                }
                                gan.a((List) objY, true, 0.0f, 0, aVar2, 48);
                                BettingStreakActivity bettingStreakActivity2 = bettingStreakActivity;
                                boolean zA = aVar2.A(bettingStreakActivity2);
                                Object objY2 = aVar2.y();
                                if (zA || objY2 == c0042a) {
                                    objY2 = new l04(bettingStreakActivity2, i3);
                                    aVar2.r(objY2);
                                }
                                Function0 function0 = (Function0) objY2;
                                boolean zA2 = aVar2.A(bettingStreakActivity2);
                                Object objY3 = aVar2.y();
                                if (zA2 || objY3 == c0042a) {
                                    objY3 = new m04(bettingStreakActivity2, i3);
                                    aVar2.r(objY3);
                                }
                                b34.a(bool, function0, (Function1) objY3, aVar2, 0);
                            } else {
                                aVar2.G();
                            }
                            return Unit.a;
                        }
                    }, aVar), aVar);
                } else {
                    aVar.G();
                }
                return Unit.a;
            }
        }, true));
    }
}
