package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* JADX INFO: loaded from: classes.dex */
@c0d(c = "androidx.datastore.preferences.SharedPreferencesMigrationKt$getShouldRunMigration$1", f = "SharedPreferencesMigration.android.kt", l = {}, m = "invokeSuspend")
public final class p390 extends tje0 implements Function2<zn20, v1b<? super Boolean>, Object> {
    public /* synthetic */ Object a;
    public final /* synthetic */ Set<String> b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p390(Set<String> set, v1b<? super p390> v1bVar) {
        super(2, v1bVar);
        this.b = set;
    }

    @Override // defpackage.pz1
    public final v1b<Unit> create(Object obj, v1b<?> v1bVar) {
        p390 p390Var = new p390(this.b, v1bVar);
        p390Var.a = obj;
        return p390Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(zn20 zn20Var, v1b<? super Boolean> v1bVar) {
        return ((p390) create(zn20Var, v1bVar)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.pz1
    public final Object invokeSuspend(Object obj) {
        y5b y5bVar = y5b.a;
        uj50.b(obj);
        Set<zn20.a<?>> setKeySet = ((zn20) this.a).a().keySet();
        ArrayList arrayList = new ArrayList(l48.r(setKeySet, 10));
        Iterator<T> it = setKeySet.iterator();
        while (it.hasNext()) {
            arrayList.add(((zn20.a) it.next()).a);
        }
        LinkedHashSet linkedHashSet = q390.a;
        boolean z = true;
        Set<String> set = this.b;
        if (set != linkedHashSet) {
            Set<String> set2 = set;
            if ((set2 instanceof Collection) && set2.isEmpty()) {
                z = false;
            } else {
                Iterator<T> it2 = set2.iterator();
                while (it2.hasNext()) {
                    if (!arrayList.contains((String) it2.next())) {
                    }
                }
                z = false;
            }
        }
        return Boolean.valueOf(z);
    }
}
