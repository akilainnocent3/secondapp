package defpackage;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hid implements Comparator {
    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        return Integer.compare(((pid.b) ((List) obj).get(0)).f, ((pid.b) ((List) obj2).get(0)).f);
    }
}
