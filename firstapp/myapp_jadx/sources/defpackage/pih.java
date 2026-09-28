package defpackage;

import com.sporty.android.core.model.cms.CMSResponse;
import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
public final class pih<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t, T t2) {
        String key = ((CMSResponse) t).getKey();
        if (key == null) {
            key = "";
        }
        String strA = rih.a(key);
        String key2 = ((CMSResponse) t2).getKey();
        return strA.compareTo(rih.a(key2 != null ? key2 : ""));
    }
}
