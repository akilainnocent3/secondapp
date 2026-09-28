package defpackage;

import com.google.android.gms.location.ActivityTransition;
import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public final class i3l0 implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        ActivityTransition activityTransition = (ActivityTransition) obj;
        ActivityTransition activityTransition2 = (ActivityTransition) obj2;
        hm20.h(activityTransition);
        hm20.h(activityTransition2);
        int i = activityTransition.a;
        int i2 = activityTransition2.a;
        if (i != i2) {
            return i >= i2 ? 1 : -1;
        }
        int i3 = activityTransition.b;
        int i4 = activityTransition2.b;
        if (i3 == i4) {
            return 0;
        }
        return i3 >= i4 ? 1 : -1;
    }
}
