package defpackage;

import android.view.View;
import java.util.Collection;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
public final class pgd extends qlr implements Function1<Map.Entry<String, View>, Boolean> {
    public final /* synthetic */ Collection<String> a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pgd(Collection<String> collection) {
        super(1);
        this.a = collection;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(Map.Entry<String, View> entry) {
        Map.Entry<String, View> entry2 = entry;
        entry2.getClass();
        Collection<String> collection = this.a;
        View value = entry2.getValue();
        WeakHashMap<View, g9i0> weakHashMap = r6i0.a;
        return Boolean.valueOf(CollectionsKt.M(collection, r6i0.d.f(value)));
    }
}
