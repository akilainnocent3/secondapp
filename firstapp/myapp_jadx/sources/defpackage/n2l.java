package defpackage;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.zip.CRC32;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class n2l implements Function1 {
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = (Context) obj;
        context.getClass();
        eo20[] eo20VarArr = eo20.a;
        LinkedHashSet linkedHashSet = q390.a;
        m390<zn20> m390VarA = q390.a(context, "instantWinStorage", linkedHashSet);
        m390<zn20> m390VarA2 = q390.a(context, "sporty_sim_notify_badge", linkedHashSet);
        uag uagVar = cfd.c;
        ArrayList arrayList = new ArrayList(l48.r(uagVar, 10));
        Iterator<T> it = uagVar.iterator();
        while (it.hasNext()) {
            arrayList.add(((cfd) it.next()).a);
        }
        m390<zn20> m390VarA3 = q390.a(context, "sportybet", CollectionsKt.E0(arrayList));
        eo20[] eo20VarArr2 = eo20.a;
        String packageName = context.getPackageName();
        packageName.getClass();
        CRC32 crc32 = new CRC32();
        byte[] bytes = packageName.getBytes(Charsets.UTF_8);
        bytes.getClass();
        crc32.update(bytes);
        m390<zn20> m390VarA4 = sex.a(context, "sportybet", jpu.b(new Pair(avg.a(crc32.getValue(), "sportbet_token"), "push_token")));
        m390<zn20> m390VarA5 = q390.a(context, "com.sportybet.prefs", q390.a);
        uag uagVar2 = mr00.i;
        ArrayList arrayList2 = new ArrayList(l48.r(uagVar2, 10));
        Iterator<T> it2 = uagVar2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((mr00) it2.next()).a);
        }
        m390<zn20> m390VarA6 = q390.a(context, "WinningManager", CollectionsKt.E0(arrayList2));
        eo20[] eo20VarArr3 = eo20.a;
        return b.k(m390VarA, m390VarA2, m390VarA3, m390VarA4, m390VarA5, m390VarA6, q390.a(context, "ODDS_FORMAT_PREF_NAME", q390.a));
    }
}
