package defpackage;

import androidx.recyclerview.widget.d;
import com.sporty.android.core.model.multimaker.MultiMakerConstKt;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class qkw implements Function2 {
    public final /* synthetic */ tkw a;

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Object obj3;
        String str = (String) obj;
        boolean zBooleanValue = ((Boolean) obj2).booleanValue();
        str.getClass();
        final tkw tkwVar = this.a;
        d<T> dVar = tkwVar.a;
        Collection<ehw> collection = dVar.f;
        collection.getClass();
        ArrayList arrayList = new ArrayList(l48.r(collection, 10));
        for (ehw ehwVarA : collection) {
            if (str.equals(MultiMakerConstKt.ID_SELECT_ALL)) {
                if (ehwVarA.d) {
                    ehwVarA = ehw.a(ehwVarA, zBooleanValue);
                }
            } else if (!str.equals(MultiMakerConstKt.ID_SELECT_ALL) && Intrinsics.g(ehwVarA.a, MultiMakerConstKt.ID_SELECT_ALL)) {
                boolean z = false;
                if (zBooleanValue) {
                    Collection collection2 = dVar.f;
                    collection2.getClass();
                    ArrayList arrayList2 = new ArrayList(collection2);
                    ArrayList arrayList3 = new ArrayList();
                    int size = arrayList2.size();
                    int i = 0;
                    while (i < size) {
                        Object obj4 = arrayList2.get(i);
                        i++;
                        ehw ehwVar = (ehw) obj4;
                        boolean z2 = ehwVar.d;
                        String str2 = ehwVar.a;
                        if (z2 && !Intrinsics.g(str2, str) && !Intrinsics.g(str2, MultiMakerConstKt.ID_SELECT_ALL)) {
                            arrayList3.add(obj4);
                        }
                    }
                    if (arrayList3.isEmpty()) {
                        z = true;
                        break;
                    }
                    int size2 = arrayList3.size();
                    int i2 = 0;
                    do {
                        if (i2 >= size2) {
                            z = true;
                            break;
                        }
                        obj3 = arrayList3.get(i2);
                        i2++;
                    } while (((ehw) obj3).c);
                    ehwVarA = ehw.a(ehwVarA, z);
                } else {
                    ehwVarA = ehw.a(ehwVarA, false);
                }
            } else if (str.equals(ehwVarA.a)) {
                ehwVarA = ehw.a(ehwVarA, zBooleanValue);
            }
            arrayList.add(ehwVarA);
        }
        tkwVar.j(arrayList, new Runnable() { // from class: skw
            @Override // java.lang.Runnable
            public final void run() {
                tkwVar.b.invoke();
            }
        });
        return Unit.a;
    }
}
