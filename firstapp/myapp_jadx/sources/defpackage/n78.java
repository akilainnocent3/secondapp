package defpackage;

import android.util.SparseArray;
import com.sportybet.android.instantwin.presentation.model.BetSlipData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import p78.a;

/* JADX INFO: loaded from: classes.dex */
public final class n78<T> {

    public interface a<T> {
        boolean a(ArrayList arrayList, int i, ArrayList arrayList2);
    }

    public static class b<T> implements a<T> {
        @Override // n78.a
        public boolean a(ArrayList arrayList, int i, ArrayList arrayList2) {
            return i == arrayList2.size();
        }
    }

    public static class c extends b<BetSlipData> {
        @Override // n78.b, n78.a
        public final boolean a(ArrayList arrayList, int i, ArrayList arrayList2) {
            if (super.a(arrayList, i, arrayList2)) {
                HashSet hashSet = new HashSet();
                int size = arrayList2.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList2.get(i2);
                    i2++;
                    BetSlipData betSlipData = (BetSlipData) obj;
                    if (!hashSet.contains(betSlipData.eventId)) {
                        hashSet.add(betSlipData.eventId);
                    }
                }
                return true;
            }
            return false;
        }
    }

    public static ArrayList a(ArrayList arrayList, int i, b bVar) {
        ArrayList arrayList2 = new ArrayList();
        if (i > arrayList.size()) {
            hb5.a("can't generate combination");
            return null;
        }
        if (arrayList.size() == i) {
            arrayList2.add(new ArrayList(arrayList));
            return arrayList2;
        }
        int i2 = 0;
        if (i == 1) {
            int size = arrayList.size();
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                arrayList2.add(Collections.singletonList(obj));
            }
        } else {
            int size2 = arrayList.size();
            int i3 = (size2 * 100) + i;
            SparseArray<ArrayList<int[]>> sparseArray = m78.a;
            ArrayList<int[]> arrayList3 = sparseArray.get(i3);
            if (arrayList3 == null) {
                synchronized (sparseArray) {
                    try {
                        arrayList3 = new ArrayList<>();
                        p78.a aVar = new p78(size2, i).new a();
                        while (aVar.a) {
                            arrayList3.add((int[]) ((int[]) aVar.next()).clone());
                        }
                        m78.a.put(i3, arrayList3);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            int size3 = arrayList3.size();
            int i4 = 0;
            while (i4 < size3) {
                int[] iArr = arrayList3.get(i4);
                i4++;
                ArrayList arrayList4 = new ArrayList();
                for (int i5 : iArr) {
                    arrayList4.add(arrayList.get(i5));
                }
                if (bVar.a(arrayList, i, arrayList4)) {
                    arrayList2.add(arrayList4);
                }
            }
        }
        return arrayList2;
    }
}
