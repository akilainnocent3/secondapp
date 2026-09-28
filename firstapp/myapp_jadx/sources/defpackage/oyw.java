package defpackage;

import com.sporty.android.core.model.patron.FavoriteSport;
import com.sporty.android.core.model.patron.FavoriteSummary;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class oyw implements Function1 {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        hqc hqcVar = (hqc) obj;
        ArrayList arrayList = new ArrayList();
        if (hqcVar instanceof nqc) {
            Iterator<FavoriteSport> it = ((FavoriteSummary) ((nqc) hqcVar).a).getSportRefMapping().values().iterator();
            while (it.hasNext()) {
                mfb0 mfb0VarE = lfb0.d().e(it.next().id);
                if (mfb0VarE != null) {
                    arrayList.add(mfb0VarE.c());
                }
            }
        }
        return new ssw(arrayList);
    }
}
