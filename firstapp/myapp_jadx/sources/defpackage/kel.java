package defpackage;

import com.sporty.android.core.model.notification.NotificationSetting;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Unit;

/* JADX INFO: loaded from: classes5.dex */
@c0d(c = "com.sporty.android.platform.features.settings.notification.domain.usecase.HasUnseenNotificationSettingsUseCase$invoke$1", f = "HasUnseenNotificationSettingsUseCase.kt", l = {}, m = "invokeSuspend", v = 2)
public final class kel extends tje0 implements gaj<lk50<? extends List<? extends NotificationSetting>>, Set<? extends String>, v1b<? super Boolean>, Object> {
    public /* synthetic */ lk50 a;
    public /* synthetic */ Set b;

    @Override // defpackage.gaj
    public final Object invoke(lk50<? extends List<? extends NotificationSetting>> lk50Var, Set<? extends String> set, v1b<? super Boolean> v1bVar) {
        kel kelVar = new kel(3, v1bVar);
        kelVar.a = lk50Var;
        kelVar.b = set;
        return kelVar.invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        List list;
        lk50 lk50Var = this.a;
        Set set = this.b;
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        lk50.c cVar = lk50Var instanceof lk50.c ? (lk50.c) lk50Var : null;
        boolean z = false;
        if (cVar != null && (list = (List) cVar.a) != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((NotificationSetting) obj2).isNew()) {
                    arrayList.add(obj2);
                }
            }
            ArrayList arrayList2 = new ArrayList(l48.r(arrayList, 10));
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj3 = arrayList.get(i);
                i++;
                arrayList2.add(String.valueOf(((NotificationSetting) obj3).getNotificationType()));
            }
            if (!arrayList2.isEmpty()) {
                int size2 = arrayList2.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj4 = arrayList2.get(i2);
                    i2++;
                    if (!set.contains((String) obj4)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
