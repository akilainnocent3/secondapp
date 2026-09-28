package defpackage;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.fragment.a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class ywi implements FragmentManager.n {
    public final /* synthetic */ yfx.a a;
    public final /* synthetic */ a b;

    public ywi(yfx.a aVar, a aVar2) {
        this.a = aVar;
        this.b = aVar2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.n
    public final void a(Fragment fragment, boolean z) {
        Object obj;
        Object objPrevious;
        a aVar = this.b;
        ArrayList arrayList = aVar.g;
        fragment.getClass();
        yfx.a aVar2 = this.a;
        ArrayList arrayListI0 = CollectionsKt.i0((Iterable) aVar2.f.a.getValue(), (Collection) aVar2.e.a.getValue());
        ListIterator listIterator = arrayListI0.listIterator(arrayListI0.size());
        do {
            obj = null;
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            }
            objPrevious = listIterator.previous();
        } while (!((ifx) objPrevious).f.equals(fragment.getTag()));
        ifx ifxVar = (ifx) objPrevious;
        boolean z2 = z && arrayList.isEmpty() && fragment.isRemoving();
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj2 = arrayList.get(i);
            i++;
            if (Intrinsics.g(((Pair) obj2).a, fragment.getTag())) {
                obj = obj2;
                break;
            }
        }
        Pair pair = (Pair) obj;
        if (pair != null) {
            arrayList.remove(pair);
        }
        if (!z2 && a.n()) {
            Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " associated with entry " + ifxVar);
        }
        boolean z3 = pair != null && ((Boolean) pair.b).booleanValue();
        if (!z && !z3 && ifxVar == null) {
            kb5.a(rui.a("The fragment ", fragment, " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."));
            return;
        }
        if (ifxVar != null) {
            aVar.l(fragment, ifxVar, aVar2);
            if (z2) {
                if (a.n()) {
                    Log.v("FragmentNavigator", "OnBackStackChangedCommitted for fragment " + fragment + " popping associated entry " + ifxVar + " via system back");
                }
                aVar2.e(ifxVar, false);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void b(Fragment fragment, boolean z) {
        Object objPrevious;
        fragment.getClass();
        if (z) {
            yfx.a aVar = this.a;
            List list = (List) aVar.e.a.getValue();
            ListIterator listIterator = list.listIterator(list.size());
            do {
                if (!listIterator.hasPrevious()) {
                    objPrevious = null;
                    break;
                }
                objPrevious = listIterator.previous();
            } while (!((ifx) objPrevious).f.equals(fragment.getTag()));
            ifx ifxVar = (ifx) objPrevious;
            if (a.n()) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + ifxVar);
            }
            if (ifxVar != null) {
                aVar.f(ifxVar);
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.n
    public final void onBackStackChanged() {
    }
}
