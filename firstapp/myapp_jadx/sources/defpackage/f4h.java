package defpackage;

import java.util.List;
import kotlin.collections.CollectionsKt;

/* JADX INFO: loaded from: classes4.dex */
public final class f4h implements otk0 {
    public static final /* synthetic */ f4h a = new f4h();

    public static final String a(List list) {
        if (list != null) {
            List list2 = !list.isEmpty() ? list : null;
            if (list2 != null) {
                return CollectionsKt.a0(list2, ",", null, null, null, 62);
            }
        }
        return null;
    }

    @Override // defpackage.otk0
    public Object zza() {
        return new Boolean(((ool0) mol0.b.a.a).zzb());
    }
}
