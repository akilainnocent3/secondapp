package defpackage;

import com.sportybet.android.multimaker.domain.model.MultiMakerItem;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class wiw implements c9l<MultiMakerItem, String> {
    public final /* synthetic */ ArrayList a;

    public wiw(ArrayList arrayList) {
        this.a = arrayList;
    }

    @Override // defpackage.c9l
    public final String a(MultiMakerItem multiMakerItem) {
        return multiMakerItem.a.v;
    }

    @Override // defpackage.c9l
    public final Iterator<MultiMakerItem> b() {
        return this.a.iterator();
    }
}
