package defpackage;

import android.content.Context;
import androidx.compose.runtime.a;

/* JADX INFO: loaded from: classes6.dex */
public final class bst implements gaj<Integer, a, Integer, j58> {
    public final /* synthetic */ Context a;

    public bst(Context context) {
        this.a = context;
    }

    @Override // defpackage.gaj
    public final j58 invoke(Integer num, a aVar, Integer num2) {
        int iIntValue = num.intValue();
        a aVar2 = aVar;
        num2.intValue();
        aVar2.N(1755978136);
        long jB = r58.b(this.a.getColor(iIntValue));
        aVar2.H();
        return new j58(jB);
    }
}
